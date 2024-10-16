package assetmaker;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ReadMaterials {


    static String currentfolder = "";
    static String filepath = System.getProperty("user.home") + "\\Documents\\samuelus\\wellpappe\\";


    static Material[] materials;

    public static Material[] getMaterials() {
        return materials;
    }
    
    public static ArrayList<Material> getMaterialsAL() {
        ArrayList<Material> al = new ArrayList<>();
        al.addAll(Arrays.asList(materials));
        return al;
    }

    public static void start(String folder) {
        if(folder == null) {
            currentfolder = getCurrentFolder();
        } else {
            currentfolder = folder;
        }

        readMaterials();
        System.out.println("successfully read materials");
    }

    public static void readMaterials() {

        String materialInput = readIn("map\\" + currentfolder + "\\material.map");
        if(materialInput == null) {
            //todo error in issuelog
            materialInput = "";
        }

        String[] materialString = materialInput.split("\n");
        //todo add loading screen text
        //count materials and exclude blank rows or comments
        int mc = 0; //materialcount
        for (int i = 0; i < materialString.length; i++) {
            if(materialString[i].isBlank() || materialString[i].startsWith("//")) continue;
            mc++;
        }

        System.out.println("materials length: " + mc);

        ArrayList<Material> materialsL = new ArrayList<>();
        materialsL.add(new Material("default"));

        boolean de = false;

        for (int i = 0; i < materialString.length; i++) {
            System.out.println(materialString[i]);
            if(materialString[i].isBlank() || materialString[i].startsWith("//")) continue;
            String[] materialProperties = materialString[i].strip().split(" ");
            int ex = -1; //exists
            for(int j = 0; j < materialsL.size(); j++) {
                if(materialsL.get(j).getName().equals(materialProperties[0])) { //index gettery
                    ex = j;
                }
            }
            if(ex != -1) { //material existiert bereits und wird überschrieben
                if(materialProperties[0].equals("default")) de = true; //für die schlaue warnung
                assignProperties(materialsL.get(ex), materialProperties);
            } else { //material existiert nicht und es wird ein neues erstellt
                materialsL.add(new Material(materialProperties[0]));
                assignProperties(materialsL.getLast(), materialProperties);
            }

        }

        if(!de) System.out.println("no default material defined");

        materials = materialsL.toArray(new Material[materialsL.size()]);

        //TextureAssigner.start(materials); //todo important?
    }

    public static void assignProperties(Material material, String[] propertyString) {
        System.out.println(Arrays.toString(propertyString));
        for (int i = 1; i < propertyString.length; i++) {
            String[] propertySplit = propertyString[i].split(":");
            try {
                switch (propertySplit[0]) {
                    case "color" -> {
                        String[] rgb = propertySplit[1].split("\\|");
                        material.setColor(new float[]{
                            Float.parseFloat(rgb[0]),
                            Float.parseFloat(rgb[1]),
                            Float.parseFloat(rgb[2]),
                        });
                    }
                    case "tint" -> {
                        String[] lum = propertySplit[1].split("\\|");
                        material.setTint(new float[]{
                                Float.parseFloat(lum[0]),
                                Float.parseFloat(lum[1]),
                                Float.parseFloat(lum[2])
                        });
                    }
                    case "luminosity" -> {
                        material.setLuminance(Float.parseFloat(propertySplit[1]));
                    }
                    case "reflectivity" -> {
                        material.setReflectivity(Float.parseFloat(propertySplit[1]));
                    }
                    case "roughness" -> {
                        material.setRoughness(Float.parseFloat(propertySplit[1]));
                    }
                    case "transparency" -> {
                        material.setTransparency(Float.parseFloat(propertySplit[1]));
                    }
                    case "refractionindex" -> {
                        if(propertySplit[1].equals("air")) material.setRefractionindex(Material.air);
                        else material.setRefractionindex(Float.parseFloat(propertySplit[1]));
                    }
                    case "image" -> {
                        material.setImage(propertySplit[1]);
                    }
                    case "reflectionmap" -> {
                        material.setReflectionmap(propertySplit[1]);
                    }
                }
            } catch(Exception e) {
                System.out.println("faulty material property in '" + propertyString[0] + "': " + propertyString[i]);
            }
        }
    }















    public static String readIn(String file) { //todo permanentes zuhause suchen
        InputStream is = null;
        StringBuilder sb = new StringBuilder();

        File file2 = new File(filepath + file);

        System.out.println("file " + file2);

        try {
            is = new FileInputStream(file2);
            //addLoadingScreenString(file + " loaded", false);
        } catch (FileNotFoundException ex) {
            System.out.println(file + " not found");
            //addLoadingScreenString(file + " not found", false);
            return null;
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        String line;

        try {
            while ((line = br.readLine()) != null) {
                sb.append(line + System.lineSeparator());
            }
        } catch (IOException ex) {
            Logger.getLogger(ReadMaterials.class.getName()).log(Level.SEVERE, null, ex);
        }

        return sb.toString().strip();
    }

    public static String getCurrentFolder() { //todo zuhause
        return readIn("map\\currentfolder.map").toString().strip();
    }

    public static BufferedImage readImage(String filename) { //todo zuhause
        File file = new File(filepath + "resource\\" + filename);

        BufferedImage fileData = null;
        try {
            InputStream in = new FileInputStream(file);
            System.out.println(file + " loaded");
            fileData = ImageIO.read(in);
            //addLoadingScreenString(file + " loaded", false);
        } catch (IOException e) {
            System.out.println(file + " not found, trying to resolve issue");
            //addLoadingScreenString(file + " not found, trying to resolve issue", false);
//            try {
//                fileData = ImageIO.read(Engine.class.getResource("testa.png"));
//            } catch (IOException ex) {
//                //addLoadingScreenString("image not found: " + file, true);
//            }
        }

        return fileData;
    }

}

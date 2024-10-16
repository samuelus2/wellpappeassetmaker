package assetmaker;

import java.util.Arrays;//für soutStats

public class Material {

    public static float air = 1.000293f;
    static float DEFAULT_ROUGHNESS = 0.8f;//0.8f
    static float DEFAULT_REFLECTIVENESS = 0.2f; //0.2f
    static float DEFAULT_TRANSPARENCY = 0;
    static float DEFAULT_REFRACTIVENESS = air;
    static float[] DEFAULT_LUMINANCE = new float[]{1,1,1,1};
    static int DEFAULT_COLOR = 0xffffff;
    static String DEFAULT_IMAGE = null;
    static String DEFAULT_REFLECTIONMAP = null;

    public static String DEFAULT_MATERIAL_KEYWORD = "default";

    private String name;
    private float reflectivity = DEFAULT_REFLECTIVENESS;
    private float roughness = DEFAULT_ROUGHNESS;
    private float transparency = DEFAULT_TRANSPARENCY;
    private float refractionindex = DEFAULT_REFRACTIVENESS;
    private float[] luminance = DEFAULT_LUMINANCE.clone(); //kerfuffle wenn kein .clone()
    private int color = DEFAULT_COLOR;
    private String image = DEFAULT_IMAGE;
    private String reflectionmap = DEFAULT_REFLECTIONMAP;
    private int imageIndex = -1;
    private int reflectionmapIndex = -1;


    public Material(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public float getReflectivity() {
        return reflectivity;
    }

    public void setReflectivity(float reflectivity) {
        this.reflectivity = reflectivity;
        if(name.equals(DEFAULT_MATERIAL_KEYWORD)) DEFAULT_REFLECTIVENESS = reflectivity;
    }

    public float getRoughness() {
        return roughness;
    }

    public void setRoughness(float roughness) {
        this.roughness = roughness;
        if(name.equals(DEFAULT_MATERIAL_KEYWORD)) DEFAULT_ROUGHNESS = roughness;
    }

    public float getTransparency() {
        return transparency;
    }

    public void setTransparency(float transparency) {
        this.transparency = transparency;
        if(name.equals(DEFAULT_MATERIAL_KEYWORD)) DEFAULT_TRANSPARENCY = transparency;
    }

    public float getRefractionindex() {
        return refractionindex;
    }

    public void setRefractionindex(float refractionindex) {
        this.refractionindex = refractionindex;
        if(name.equals(DEFAULT_MATERIAL_KEYWORD)) DEFAULT_REFRACTIVENESS = refractionindex;
    }

    public float[] getLuminance() {
        return luminance;
    }

    public void setLuminance(float luminance) {
        this.luminance[3] = luminance;
        if(name.equals(DEFAULT_MATERIAL_KEYWORD)) DEFAULT_LUMINANCE[3] = luminance;
    }

    public void setTint(float[] tint) {
        luminance[0] = tint[0];
        luminance[1] = tint[1];
        luminance[2] = tint[2];
        if(name.equals(DEFAULT_MATERIAL_KEYWORD)) {
            DEFAULT_LUMINANCE[0] = tint[0];
            DEFAULT_LUMINANCE[1] = tint[1];
            DEFAULT_LUMINANCE[2] = tint[2];
        }
    }

    public int getColor() {
        return color;
    }

    public void setColor(float[] color) {
        int rgb = ((((short)(color[0]*255f)) << 16) | (((short)(color[1]*255f)) << 8) | ((short)(color[2]*255f)));
        this.color = rgb;
        if(name.equals(DEFAULT_MATERIAL_KEYWORD)) DEFAULT_COLOR = rgb;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image.equals("null")?null:image;
        if(name.equals(DEFAULT_MATERIAL_KEYWORD)) DEFAULT_IMAGE = image.equals("null")?null:image;
    }

    public String getReflectionmap() {
        return reflectionmap;
    }

    public void setReflectionmap(String reflectionmap) {
        this.reflectionmap = reflectionmap.equals("null")?null:reflectionmap;
        if(name.equals(DEFAULT_MATERIAL_KEYWORD)) DEFAULT_REFLECTIONMAP = reflectionmap.equals("null")?null:reflectionmap;
    }

    public int getImageIndex() {
        return imageIndex;
    }

    public void setImageIndex(int imageIndex) {
        this.imageIndex = imageIndex;
    }

    public int getReflectionmapIndex() {
        return reflectionmapIndex;
    }

    public void setReflectionmapIndex(int reflectionmapIndex) {
        this.reflectionmapIndex = reflectionmapIndex;
    }

    public void soutStats() {
        System.out.println("soutStats : " + name + " +" + image + " +" + reflectionmap + " +" + color + " +" + Arrays.toString(luminance) + " +" + roughness + " +" + transparency + " +" + reflectivity + " +" + refractionindex);
    }
}

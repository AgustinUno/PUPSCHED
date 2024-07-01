package desktop_app;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class Custom_font {

    private static final String[] FONT_FILES = {
        "BoldItalic.ttf",
        "Bold.ttf",
        "Italic.ttf",
        "Regular.ttf"
    };
    
    private static Map<String, Font> fonts = new HashMap<>();

    static {
        for (String fontFile : FONT_FILES) {
            try (InputStream is = Custom_font.class.getResourceAsStream("/desktop_app/fonts/" + fontFile)) {
                if (is != null) {
                    Font font = Font.createFont(Font.TRUETYPE_FONT, is);
                    fonts.put(fontFile, font);
                } else {
                    System.err.println("Font file not found: " + fontFile);
                }
            } catch (FontFormatException | IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static Font getFont(String fontName, float size) {
        Font font = fonts.get(fontName);
        if (font != null) {
            return font.deriveFont(size);
        } else {
            System.err.println("Font not loaded: " + fontName);
            return new Font("Serif", Font.PLAIN, (int) size); // Fallback font
        }
    }
}

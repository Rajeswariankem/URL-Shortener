/**
 * URL Shortener implementation
 * Converts long URLs into short URLs and retrieves original URLs.
 * Uses HashMap for O(1) average time complexity.
 */

import java.util.HashMap;
import java.util.Random;
import java.net.MalformedURLException;
import java.net.URL;

public class URLShortener {

    // Stores mapping from short code to original long URL
    private HashMap<String,String> shorttolong;

    // Stores mapping from long URL to short code (to handle duplicates)
    private HashMap<String,String> longtoshort;

    // Base URL used for generating short URLs
    private final String base="http://short.ly/";

    public URLShortener(){
        shorttolong=new HashMap<>();
        longtoshort=new HashMap<>();
    }

    /**
     * Shortens a given long URL.
     * @param longurl the original URL
     * @return shortened URL or error message if invalid
     */

    public String shorttolong(String longurl)
    {
        // Check for null or empty input
        longurl=longurl.trim();
        if(longurl==null || longurl.isEmpty())
            return "Invalid URL";

        // Validate URL format
        if(!isValidUrl(longurl))
            return "Invalid URL";

        // Return existing short URL if already shortened
        if(longtoshort.containsKey(longurl))
        {
            return base+longtoshort.get(longurl);
        }

         // Generate unique short code
        String code=generatecode();
        if(shorttolong.containsKey(code))
        {
            code=generatecode();
        }

        // Store mappings
        shorttolong.put(code,longurl);
        longtoshort.put(longurl, code);
        return code;
    }

    /**
     * Generates a random 6-character alphanumeric code.
     * @return short code
     */

    public String generatecode()
    {
        String s="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqurstuvwxyz0123456789";
        StringBuilder code=new StringBuilder();
        Random random=new Random();

        // Generate random 6-character string
        for(int i=0;i<6;i++)
        {
            int index=random.nextInt(s.length());
            code.append(s.charAt(index));
        }
        return code.toString();
    }


    /**
     * Retrieves the original URL from a short URL.
     * @param shorturl the shortened URL
     * @return original URL or error message
     */
    public String getOriginal(String shorturl)
    {
        shorturl=shorturl.trim();
        // Validate short URL format
         if(shorturl==null || shorturl.trim().isEmpty() || !shorturl.startsWith(base))
            return "Invalid URL";

        // Extract short code
        String code = shorturl.replace(base, "");
        // Fetch original URL
        return shorttolong.getOrDefault(code, "URL not found");
    }

    /**
     * Checks whether a given string is a valid URL.
     * @param url input URL string
     * @return true if valid, false otherwise
     */
    private boolean isValidUrl(String url) {
    try {
        new URL(url);
        return true;
    } catch (MalformedURLException e) {
        return false;
    }
}
}

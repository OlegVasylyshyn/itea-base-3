package week6.day1.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

    public static void main(String[] args) {


        Pattern pattern = Pattern.compile("(http|https|ftp)://\\\\S*?\\\\.(png|jpg)");
        Matcher matcher = pattern.matcher("  <meta charset=\"utf-8\">\n" +
                "  <link rel=\"dns-prefetch\" href=\"https://assets-cdn.github.com\">\n" +
                "  <link rel=\"dns-prefetch\" href=\"https://avatars0.githubusercontent.com\">\n" +
                "  <link rel=\"dns-prefetch\" href=\"https://avatars1.githubusercontent.com\">\n" +
                "  <link rel=\"dns-prefetch\" href=\"https://avatars2.githubusercontent.com\">\n" +
                "  <link rel=\"dns-prefetch\" href=\"https://avatars3.githubusercontent.com\">\n" +
                "  <link rel=\"dns-prefetch\" href=\"https://github-cloud.s3.amazonaws.com\">\n" +
                "  <link rel=\"dns-prefetch\" href=\"https://user-images.githubusercontent.com/\">\n" +
                "\n" +
                "\n" +
                "\n" +
                "  <link crossorigin=\"anonymous\" media=\"all\" integrity=\"sha512-pCRDtdb3GlUU48h+oRJVA8f0GddrLnU97wB7mHQ7q6c40vMbMMZsFdk0IMhkUFRqw1M/y4EkWxtaKwfeFezOkQ==\" rel=\"stylesheet\" href=\"https://assets-cdn.github.com/assets/frameworks-73f533b7cc08a9d040e601cfd38fa585.css\" />\n" +
                "  <link crossorigin=\"anonymous\" media=\"all\" integrity=\"sha512-NrkIfJZIwYlZm0Vsj5Qfwy42Y6FfSOIcMgENLO2qoIX6de5GlYgkEeiXZ4NuXPOeXAU9eBEQB/G4MuQgSkfvmw==\" rel=\"stylesheet\" href=\"https://assets-cdn.github.com/assets/github-92a506d34c7c4f30e5df49880bb08c60.css\" />\n" +
                "  \n" +
                "  \n" +
                "  \n" +
                "  \n" +
                "\n" +
                "  <meta name=\"viewport\" content=\"width=device-width\">\n" +
                "  \n" +
                "  <title>GitHub</title>\n" +
                "    <meta name=\"description\" content=\"GitHub is where people build software. More than 28 million people use GitHub to discover, fork, and contribute to over 85 million projects.\">\n" +
                "    <link rel=\"search\" type=\"application/opensearchdescription+xml\" href=\"/opensearch.xml\" title=\"GitHub\">\n" +
                "  <link rel=\"fluid-icon\" href=\"https://github.com/fluidicon.png\" title=\"GitHub\">\n" +
                "  <meta property=\"fb:app_id\" content=\"1401488693436528\">\n");

        while (matcher.find()) {
            System.out.print("Start index: " + matcher.start());
            System.out.print("End index: " + matcher.end() + " ");
            System.out.println(matcher.group());
        }

    }

}

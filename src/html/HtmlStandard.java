package html;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import esecuzione.Html;
import head.HeadStandard;


public class HtmlStandard extends Html{
	
	public static void paginaStandard(String titolo) {
		String html = ""
				+"<!DOCTYPE html>\n"
				+"<html lang=\"it\">\n"
				+ "   " + HeadStandard.headHtml()
					+ "  <body>\n"
						+ "    <div>\n"
						+ "    <h1>"+ titolo +"</h1>\n"
							+     "<p>Questo &egrave; un\n"
							+     "paragrafo di una pagina html</p>\n"
						+ "    </div>\n"
					+ "  </body>\n"
				+ "</html>";
			File f = new File("/Users/zingaroweb/Sites/ScrivoHtmlInJava/index2.html");
			
			try {
				BufferedWriter bw = new BufferedWriter(new FileWriter(f));
				bw.write(html);
				bw.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	} 

}

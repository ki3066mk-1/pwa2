import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PwaServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		System.out.println("doGet");
	}
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("doPost");
		res.setContentType("application/json");
	    res.setCharacterEncoding("utf-8");


	    StringBuffer p_buff = new StringBuffer();
//	    p_buff.append("{\r\n");
//	    p_buff.append("\"conversationToken\": \"[]\",\r\n");
//	    p_buff.append("\"expectUserResponse\": true,\r\n");
//	    p_buff.append("\"expectedInputs\": [\r\n");
//	    p_buff.append("{\r\n");
//	    p_buff.append("\"inputPrompt\": {\r\n");
//	    p_buff.append("\"richInitialPrompt\": {\r\n");
//	    p_buff.append("\"items\": [\r\n");
//	    p_buff.append("{\r\n");
//	    p_buff.append("\"simpleResponse\": {\r\n");
//	    p_buff.append("\"textToSpeech\": \"電話番号が知りたい場合は、「電話番号を教えて」と言ってください。\"\r\n");
//	    p_buff.append("}\r\n");
//	    p_buff.append("}\r\n");
//	    p_buff.append("]\r\n");
//	    p_buff.append("}\r\n");
//	    p_buff.append("},\r\n");
//	    p_buff.append("\"possibleIntents\": [\r\n");
//	    p_buff.append("{\r\n");
//	    p_buff.append("\"intent\": \"assistant.intent.action.TEXT\"\r\n");
//	    p_buff.append("}\r\n");
//	    p_buff.append("],\r\n");
//	    p_buff.append("\"speechBiasingHints\": [\r\n");
//	    p_buff.append("\"$TelList\"\r\n");
//	    p_buff.append("]\r\n");
//	    p_buff.append("}\r\n");
//	    p_buff.append("],\r\n");
//	    p_buff.append("\"responseMetadata\": {\r\n");
//	    p_buff.append("\"status\": {\r\n");
//	    p_buff.append("\"message\": \"Success (200)\"\r\n");
//	    p_buff.append("},\r\n");
//	    p_buff.append("\"queryMatchInfo\": {\r\n");
//	    p_buff.append("\"queryMatched\": true,\r\n");
//	    p_buff.append("\"intent\": \"ab3f7595-ad71-49e4-a87b-96835237af2a\"\r\n");
//	    p_buff.append("}\r\n");
//	    p_buff.append("}\r\n");
//	    p_buff.append("}\r\n");
	    p_buff.append("{\"fulfillmentText\": \"string\"}");
	    res.getWriter().println(p_buff.toString());
	}
}

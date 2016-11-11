package app;

import server.Handler;
import server.HtmlUtils;
import server.HttpRequest;

/**
 * Created by employee on 11/11/16.
 */
public class PageError extends HtmlUtils implements Handler {

    private final int codeError;
    private final String path;

    public PageError(int codeError, String path) {
        this.codeError = codeError;
        this.path = path;
    }

    @Override
    public String print(HttpRequest request) {
        return htmlHeader +
                "<H1>This site can’t be reached" + codeError + "</H1><br>"  +
                "http://greater.local:8080" + request.getPath() + " server DNS address could not be found." +
                htmlFooter;
    }
}

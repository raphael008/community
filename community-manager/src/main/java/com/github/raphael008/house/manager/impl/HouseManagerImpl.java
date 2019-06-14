package com.github.raphael008.house.manager.impl;

import com.github.raphael008.house.manager.HouseManager;
import com.github.raphael008.house.vo.Post;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.client.fluent.Request;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.beans.factory.annotation.Value;

import java.net.URI;
import java.nio.charset.Charset;

@Slf4j
public class HouseManagerImpl implements HouseManager {
    @Value("${crawler.target.scheme}")
    private String scheme;

    @Value("${crawler.target.host}")
    private String host;

    @Value("${crawler.target.path}")
    private String path;

    private void test() throws Exception {
        URI uri = new URIBuilder()
                .setScheme(scheme)
                .setHost(host)
                .setPath(path)
                .setParameter("start", "0")
                .build();
        log.info("Start requesting uri: {}", uri);

        HttpGet request = new HttpGet(uri);
        log.info("Requested uri: {}", request.getURI());
    }

    private String requestHtmlByPageNumber(int pageNumber) throws Exception {
        String uri = String.format("https://www.douban.com/group/shanghaizufang/discussion?start=%d", pageNumber);
        String html = Request
                .Get(uri)
                .execute()
                .returnContent()
                .asString(Charset.forName("UTF-8"));
        return html;
    }

    private Post extractPostFromHtml(String html) {
        Document document = Jsoup.parse(html);
        return null;
    }

    public static void main(String[] args) throws Exception {
        String url = "https://www.douban.com/group/shanghaizufang/discussion?start=0";

        String response = Request
                .Get(url)
                .execute()
                .returnContent()
                .asString(Charset.forName("UTF-8"));

        System.out.println(response);
    }
}

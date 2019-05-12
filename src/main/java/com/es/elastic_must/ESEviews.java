package com.es.elastic_must;

import org.elasticsearch.client.ClusterAdminClient;
import org.elasticsearch.client.ElasticsearchClient;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.TermQueryBuilder;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SearchQuery;

import static org.elasticsearch.index.query.QueryBuilders.matchAllQuery;

public class ESEviews {

    private ElasticsearchTemplate elasticsearchTemplate;


    public ESEviews(){


    }

    public void  query_muller(){
//        SearchQuery searchQuery = new NativeSearchQueryBuilder()
//                .withQuery(matchAllQuery())
//                .withFilter(boolFilter().must(termFilter("id", documentId)))
//                .build();

//        BoolQueryBuilder builder = null;
//        TermQueryBuilder tbuidl =Null;
//        builder.mustNot( builder.must(builder.))
//        FilterBuilders filter = boolFilter()
//                .must(termFilter("tag", "wow"))
//                .mustNot(rangeFilter("age").from("10").to("20"))
//                .should(termFilter("tag", "sometag"))
//                .should(termFilter("tag", "sometagtag"));
    }
}

package com.mansoul.hot.module.news.view;

import com.mansoul.hot.base.BaseIView;
import com.mansoul.hot.module.news.model.bean.NewsListBean;

import java.util.List;

/**
 * Created by Mansoul on 16/8/19.
 */
public interface INewsView extends BaseIView<NewsListBean> {
    void loadSuccess(List<NewsListBean.bean> result);
}

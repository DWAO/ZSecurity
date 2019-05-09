package com.zorpz.securiy.service;

import com.zorpz.securiy.entity.Blog;

import java.util.List;

public interface IBlogService {
    List<Blog> getBlogs();
    void deleteBlog(Long id);
}

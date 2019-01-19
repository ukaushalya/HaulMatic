/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 *
 * @author Kaushi
 */
public class ApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

    @Override
    protected Class<?>[] getRootConfigClasses() {
         return new Class[]{
            ApplicationConfiguration.class
        };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
         return null;
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{
            "/rest/*"
        };
    }
    
}

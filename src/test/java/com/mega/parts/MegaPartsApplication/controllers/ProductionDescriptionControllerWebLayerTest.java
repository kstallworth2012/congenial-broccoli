package com.mega.parts.MegaPartsApplication.controllers;

import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

@WebMvcTest(controllers = ProductionDescriptionController.class)
@AutoConfigureMockMvc(addFilters = false)
public class ProductionDescriptionControllerWebLayerTest {

}

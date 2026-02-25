package com.mega.parts.MegaPartsApplication.controllers;

import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

@WebMvcTest(controllers = RegionController.class)
@AutoConfigureMockMvc(addFilters = false)
public class RegionsControllerWebLayerTest {

}

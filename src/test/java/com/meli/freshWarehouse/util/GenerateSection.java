package com.meli.freshWarehouse.util;

import com.meli.freshWarehouse.dto.SectionDto;
import com.meli.freshWarehouse.model.Section;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GenerateSection {
    public static final SectionDto newSection1() {

        return SectionDto.builder()
                .name("Section test 1")
                .availableSpace(23)
                .idWarehouse(1L)
                .build();

    }

    public static final SectionDto newSection2() {

        return SectionDto.builder()
                .name("Section test 2")
                .availableSpace(25)
                .idWarehouse(2L)
                .build();

    }

    public static final Section validSection1() {
        return Section.builder()
                .id(1L)
                .name("Section test 1")
                .availableSpace(23)
                .warehouse(GenerateWarehouse.validWarehouse1())
                .build();
    }

    public static final Section validSectionToExpection1() {
        return Section.builder()
                .id(3L)
                .name("Section test 1")
                .availableSpace(23)
                .warehouse(GenerateWarehouse.validWarehouse1())
                .build();
    }

    public static final Section validSection2() {
        return Section.builder()
                .id(2L)
                .name("Section test 2")
                .availableSpace(25)
                .warehouse(GenerateWarehouse.validWarehouse2())
                .build();
    }

    public static final Section updatedSection() {
        return Section.builder()
                .id(1L)
                .name("New section")
                .availableSpace(33)
                .warehouse(GenerateWarehouse.validWarehouse2())
                .build();
    }

    public static final SectionDto validSectionDto1(){
        return SectionDto.builder()
                .idWarehouse(GenerateWarehouse.validWarehouse1().getId())
                .name("Section test 2")
                .availableSpace(30)
                .build();
    }

    public static final Set<Section> validSectionList() {
        Set<Section> sectionSet = new HashSet<>();
        sectionSet.add(GenerateSection.validSection1());
        sectionSet.add(GenerateSection.validSection2());

        return sectionSet;
    }

    public static final Section validFreshSection() {
        return Section.builder()
                .id(3L)
                .name("Fresh")
                .availableSpace(25)
                .warehouse(GenerateWarehouse.validWarehouse2())
                .build();
    }

    public static final Set<Section> validFreshSectionList() {
        Set<Section> sectionSet = new HashSet<>();
        sectionSet.add(GenerateSection.validFreshSection());

        return sectionSet;
    }

    public static final Set<Section> validSectionListToException() {
        Set<Section> sectionSet = new HashSet<>();
        sectionSet.add(Section.builder()
                .id(3L)
                .name("Section test 1")
                .availableSpace(23)
                .warehouse(GenerateWarehouse.validWarehouse1())
                .build());

        return sectionSet;
    }

}

package com.commitfarm.farm.dto.project;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class AllProjectRes {

    @Schema(description = "메인 화면에서 PL or Dev or Tester 클릭 -> 해당 유저의 모든 프로젝트를 보여줌(진행된 플젝, 완료된 플젝)")
    private List<ProjectRes> projectList;

}

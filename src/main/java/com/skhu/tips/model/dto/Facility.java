package com.skhu.tips.model.dto;

/*
 * ***************************
 *  파일명: PanelController
 *  작성자: 김주환
 *  작성일:
 *  내용:
 * ***************************
 */
import java.util.ArrayList;
import java.util.List;

public class Facility {
    private String name; //시설명
    private String floor; //층수
    private String description; //간단 설명
    private List<String> tips; // 팁 여러개 저장용 리스트

    public Facility(String name, String floor, String description) {
        this.name = name;
        this.floor = floor;
        this.description = description;
        this.tips = new ArrayList<>();
    }

    // --- 팁 관련 메서드 ---
    public void addTip(String tip) {
        tips.add(tip);
    }

    public String getTip(int index) {
        if (index < 0 || index >= tips.size()) {
            return "해당 번호의 팁이 없습니다.";
        }
        return tips.get(index);
    }

    public List<String> getAllTips() {
        return tips;
    }

    public int getTipCount() {
        return tips.size();
    }

    // --- 일반 Getter ---
    public String getName() {
        return name;
    }

    public String getFloor() {
        return floor;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return floor + " - " + name;
    }
}

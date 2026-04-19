package com.socops.data;

import java.util.List;

/**
 * Central catalogue of every icebreaker prompt that can appear on a board.
 * Exactly 24 entries — one fewer than the 25-cell grid, because the
 * centre cell is always the free space.
 */
public final class IcebreakerPrompts {

    public static final String FREE_CELL_LABEL = "FREE SPACE";

    public static final List<String> ALL_PROMPTS = List.of(
            "이번 달에 애니를 본 적이 있다",
            "좋아하는 스튜디오 지브리 작품이 있다",
            "애니 오프닝 한 소절을 흥얼거릴 수 있다",
            "더빙보다 자막 감상을 선호한다",
            "애니 행사나 코믹콘에 가본 적이 있다",
            "애니 굿즈를 가지고 있다",
            "친구에게 애니를 추천해 본 적이 있다",
            "애니를 보다가 울어본 적이 있다",
            "스포츠 장르 애니를 본 적이 있다",
            "메카 장르 애니를 본 적이 있다",
            "10초 안에 애니 주인공 3명을 말할 수 있다",
            "만화를 1권 이상 읽어본 적이 있다",
            "좋아하는 애니를 정주행한 적이 있다",
            "일본어 음성으로 애니를 본 적이 있다",
            "좋아하는 애니 악역 캐릭터가 있다",
            "드라마틱한 애니 포즈를 할 수 있다",
            "마음 편해지는 최애 애니가 있다",
            "좋아하는 애니 명대사가 있다",
            "20초 안에 애니 줄거리를 설명할 수 있다",
            "친구 추천으로 애니를 보기 시작한 적이 있다",
            "극장에서 애니메이션 영화를 본 적이 있다",
            "배경화면을 애니 캐릭터로 바꾼 적이 있다",
            "학교가 배경인 애니를 하나 말할 수 있다",
            "지금 보고 싶은 애니가 찜 목록에 있다"
    );

    private IcebreakerPrompts() {
        /* catalogue only — no instances */
    }
}

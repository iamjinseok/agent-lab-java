# 필수 개발 체크리스트

- Lint: 이 저장소에는 전용 lint 명령이 아직 없습니다. 실제 lint 단계가 추가되기 전에는 lint가 통과했다고 말하지 않습니다.
- Build: 코드 변경 후 `cd socops && ./mvnw clean package`를 실행합니다.
- Test: 동작 변경 후 `cd socops && ./mvnw test`를 실행합니다.

# 워크스페이스 지침

- 스택: Java 21, Spring Boot 3.4, Thymeleaf, 커스텀 CSS 유틸리티, 바닐라 브라우저 JavaScript.
- 앱 루트: `socops/`가 실행 가능한 프로젝트입니다. 로컬 실행은 `cd socops && ./mvnw spring-boot:run`을 사용합니다.
- 주요 흐름: `GET /`는 게임 페이지를 렌더링하고, `GET /api/bingo/fresh-board`는 새 보드를 반환합니다.
- 백엔드 구조:
  - `src/main/java/com/socops/web/`는 HTTP 라우트를 처리합니다.
  - `src/main/java/com/socops/service/BoardAssembler.java`는 순수 보드 로직을 담고 있습니다.
  - `src/main/java/com/socops/model/`은 빙고 레코드와 상태 모델을 보관합니다.
  - `src/main/java/com/socops/data/IcebreakerPrompts.java`는 프롬프트 데이터를 제공합니다.
- 프런트엔드 구조:
  - `src/main/resources/templates/game.html`은 메인 UI이며 브라우저 측 게임 로직을 포함합니다.
  - `src/main/resources/static/css/app.css`는 페이지 전반에서 쓰는 커스텀 유틸리티 클래스를 정의합니다.
- 스타일 규칙:
  - 새 스타일을 추가하기 전에 `app.css`의 기존 유틸리티 클래스를 우선 사용합니다.
  - 현재의 유틸리티 기반 접근과 일관되게, 단순하고 조합 가능한 스타일을 유지합니다.
- 코딩 규칙:
  - 증상만 덮지 말고 근본 원인을 해결합니다.
  - 변경은 작고 집중되게 유지합니다.
  - 작업에서 명시적으로 요구하지 않는 한 현재 Spring Boot + Thymeleaf + vanilla JS 구조를 유지합니다.
- 테스트:
  - 보드 생성이나 승리 줄 판정 동작을 바꾸는 경우 `src/test/java/com/socops/service/BoardAssemblerTests.java`에 테스트를 추가하거나 갱신합니다.
  - 보드 로직과 승리 판정 테스트는 결정적이고 재현 가능하게 작성합니다.
- 응답 원칙:
  - 실행하지 못한 명령이 있으면 명시합니다.
  - lint 도구가 없으면 lint 성공이라고 말하지 않습니다.

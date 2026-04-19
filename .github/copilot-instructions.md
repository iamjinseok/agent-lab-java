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

# 디자인 가이드

UI와 웹 컴포넌트를 설계할 때 다음 원칙을 따릅니다.

## 미학적 가치

- **타이포그래피**: 보편적인 폰트(Arial, Inter, 시스템 폰트)를 피하고, 프로젝트의 성격에 맞는 독특하고 아름다운 폰트를 선택합니다.
- **색상 및 테마**: 통합된 미학을 유지합니다. CSS 변수로 일관성을 보장하고, 주요 색상과 강렬한 악센트 색상을 함께 사용합니다.
- **배경**: 단색보다는 CSS 그래디언트, 기하학적 패턴, 문맥에 맞는 효과로 분위기와 깊이를 만듭니다.
- **모션**: CSS 애니메이션을 사용한 미세한 상호작용보다는, 페이지 로드 시 전체적으로 조율된 단일 효과(staggered reveals)를 우선합니다.

## 피해야 할 것

- 제네릭한 AI 생성 미학 회피: 과용된 폰트, 뻔한 색감, 예측 가능한 레이아웃
- 문맥 없이 반복되는 설계 패턴
- 프로젝트에 특화되지 않은 제네릭 디자인

## 실행

- 미학적 비전과 구현 복잡도의 균형을 맞춥니다.
- 매니멀리스트 설계는 정밀한 공간 배치, 타이포그래피, 미묘한 디테일에 집중합니다.
- 우아함은 명확한 비전을 잘 실행하는 데서 나옵니다.

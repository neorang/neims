# neims

## ⚙️ 기능
### User
**사용자 정보 및 로그인 기능**

<details>
<summary>사용자 정보</summary>
<div markdown="1">

#### 등록
- `id, email, name, password` 정보가 없으면 등록 불가
- 가입 시 `manager`로 기본 등록
#### 조회
- `manager`는 본인의 정보만 조회 가능
- `admin`은 모든 사용자의 정보 조회 가능
#### 수정
- `Manager`
    - `name, password` 수정 가능
    - `email` 변경 시 재인증 필요
- `Admin`
    - `Manager` 수정 범위 포함
    - `email` 수정 시 재인증 불필요
    - Role 변경 가능

</div>
</details>

<details>
<summary>로그인</summary>
<div markdown="1">

#### JWT Token 검증
- `Access Token` 유효시간: 1시간
- `Refresh Token` 유효시간: 일주일

</div>
</details>

## 참가자
- @Song-H-H
- @jiyeonghwang
- @clemado1
- @cje614
- @kimsy513

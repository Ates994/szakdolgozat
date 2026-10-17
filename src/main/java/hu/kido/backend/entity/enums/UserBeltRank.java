package hu.kido.backend.entity.enums;

import lombok.Getter;

@Getter
public enum UserBeltRank {
    NO_KYU("No kyu"),
    KYU_10("10. kyu"),
    KYU_9("9. kyu"),
    KYU_8("8. kyu"),
    KYU_7("7. kyu"),
    KYU_6("6. kyu"),
    KYU_5("5. kyu"),
    KYU_4("4. kyu"),
    KYU_3("3. kyu"),
    KYU_2("2. kyu"),
    KYU_1("1. kyu"),
    DAN_1("1. dan"),
    DAN_2("2. dan"),
    DAN_3("3. dan"),
    DAN_4("4. dan"),
    DAN_5("5. dan"),
    DAN_6("6. dan");
    //7 dan, 8 dan, színt rendelni
    //felhasználó oldalán, vagy a profilklpen

    private final String displayName;

    UserBeltRank(String displayName) {
        this.displayName = displayName;
    }
}

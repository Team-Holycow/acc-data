package de.teamholycow.acc.data;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.Instant;

@RequiredArgsConstructor
@Getter
public enum Dlc {
    BASE_GAME("Base Game", Instant.parse("2018-09-12")),
    FREE_CONTENT_UPDATE_2019("Free Content Update 2019", Instant.parse("2019-10-23")),
    MCLAREN_SHADOW_EVENT("McLaren Shadow Event / Free", Instant.parse("2019-10-23")),
    FREE_CONTENT_UPDATE_2021("Free Content Update 2021", Instant.parse("2021-11-24")),
    INTERNATIONAL_GT_PACK("Intercontinental GT Pack", Instant.parse("2020-02-04")),
    GT4_PACK("GT4 Pack", Instant.parse("2020-07-15")),
    GT_WORLD_CHALLENGE_PACK_2020("2020 GT World Challenge Pack", Instant.parse("2020-11-18")),
    BRITISH_PACK("British Pack", Instant.parse("2021-02-10")),
    CHALLENGERS_PACK("Challengers Pack", Instant.parse("2022-03-23")),
    AMERICAN_TRACK_PACK("American Track Pack", Instant.parse("2022-06-30"));

    private final String displayName;
    private final Instant releaseDate;
}

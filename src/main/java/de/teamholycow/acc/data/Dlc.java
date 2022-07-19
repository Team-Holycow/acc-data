package de.teamholycow.acc.data;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.Instant;

@RequiredArgsConstructor
@Getter
public enum Dlc {
    BASE_GAME("Base Game", Instant.parse("2018-09-12T00:00:00.00Z")),
    FREE_CONTENT_UPDATE_2019("Free Content Update 2019", Instant.parse("2019-10-23T00:00:00.00Z")),
    MCLAREN_SHADOW_EVENT("McLaren Shadow Event / Free", Instant.parse("2019-10-23T00:00:00.00Z")),
    FREE_CONTENT_UPDATE_2021("Free Content Update 2021", Instant.parse("2021-11-24T00:00:00.00Z")),
    INTERNATIONAL_GT_PACK("Intercontinental GT Pack", Instant.parse("2020-02-04T00:00:00.00Z")),
    GT4_PACK("GT4 Pack", Instant.parse("2020-07-15T00:00:00.00Z")),
    GT_WORLD_CHALLENGE_PACK_2020("2020 GT World Challenge Pack", Instant.parse("2020-11-18T00:00:00.00Z")),
    BRITISH_PACK("British Pack", Instant.parse("2021-02-10T00:00:00.00Z")),
    CHALLENGERS_PACK("Challengers Pack", Instant.parse("2022-03-23T00:00:00.00Z")),
    AMERICAN_TRACK_PACK("American Track Pack", Instant.parse("2022-06-30T00:00:00.00Z"));

    private final String displayName;
    private final Instant releaseDate;
}

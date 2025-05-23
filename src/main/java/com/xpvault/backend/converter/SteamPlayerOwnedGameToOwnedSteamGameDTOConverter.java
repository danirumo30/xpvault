package com.xpvault.backend.converter;

import com.ibasco.agql.protocols.valve.steam.webapi.pojos.SteamPlayerOwnedGame;
import com.xpvault.backend.dto.GameSteamDTO;
import com.xpvault.backend.dto.OwnedSteamGameDTO;
import com.xpvault.backend.facade.GameFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SteamPlayerOwnedGameToOwnedSteamGameDTOConverter implements Converter<SteamPlayerOwnedGame, OwnedSteamGameDTO> {

    private final GameFacade gameFacade;

    @Override
    public OwnedSteamGameDTO convert(SteamPlayerOwnedGame source) {

        GameSteamDTO gameSteamDTO = gameFacade.getSteamDetailsBySteamId(source.getAppId(), "en");

        return new OwnedSteamGameDTO(
                source.getTotalPlaytime(),
                gameSteamDTO
        );
    }
}

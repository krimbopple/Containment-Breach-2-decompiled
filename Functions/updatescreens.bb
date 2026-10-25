Function updatescreens%()
    Local local0.screens
    Local local1.events
    Local local3%
    BXZDBZ0BB\Field2 = (BXZDBZ0BB\Field2 - fps\Field3[$00])
    If (0.0 >= BXZDBZ0BB\Field2) Then
        For local0 = Each screens
            local0\Field4 = (((fog\Field13 * lightvolume) * (fog\Field13 * lightvolume)) >= entitydistancesquared(local0\Field10, XZ0260X8X2\Field74))
        Next
        BXZDBZ0BB\Field2 = 70.0
    EndIf
    For local0 = Each screens
        If (((local0\Field12 = playerroom) Lor (6.0 > local0\Field12\Field39)) <> 0) Then
            If (0.1 < secondarylighton) Then
                If (local0\Field4 <> 0) Then
                    Select local0\Field7
                        Case $00
                            If (0.0 < local0\Field1) Then
                                local0\Field1 = (local0\Field1 - fps\Field3[$00])
                                If (420.0 > local0\Field1) Then
                                    If (local0\Field5 <> $03) Then
                                        entitytexture(local0\Field10, mon_i\Field2[$11], $00, $00)
                                        GUESSEDfreeentity_7(local0\Field10, $FFFFFFFF, $00)
                                        local0\Field5 = $03
                                    EndIf
                                    If ((entityinview(local0\Field10, camera) And entityvisible(local0\Field10, camera, 0.0)) <> 0) Then
                                        If (T8660BZ460\Field11 = $00) Then
                                            If (entityhidden(T8660BZ460\Field9) = $00) Then
                                                hideentity(T8660BZ460\Field9)
                                            EndIf
                                            If ((((((-16.0 > XZ0260X8X2\Field53) Lor (-6.0 < XZ0260X8X2\Field53)) And (0.0 = i_1025\Field1[$05])) And (T8660BZ460\Field5 = $00)) And (chs\Field8 = $00)) <> 0) Then
                                                If ((((GUESSEDupdatexdb() = $00) And (n_i\Field10 <> Null)) And (2.0 > n_i\Field10\Field66)) <> 0) Then
                                                    playsound_strict(loadtempsound("SFX\SCP\096\Triggered.ogg"), $01, $00)
                                                    _S2IMapErase(unlockedachievements, "096")
                                                    XZ0260X8X2\Field51 = 10.0
                                                    If (422.0 <= n_i\Field10\Field103) Then
                                                        setnpcframe(n_i\Field10, 677.0, $01)
                                                    EndIf
                                                    stopstream_strict(n_i\Field10\Field63)
                                                    n_i\Field10\Field63 = $00
                                                    n_i\Field10\Field94 = $00
                                                    n_i\Field10\Field55 = $00
                                                    n_i\Field10\Field66 = 2.0
                                                EndIf
                                            EndIf
                                        ElseIf (T8660BZ460\Field2 > $00) Then
                                            scramblechn = loopsoundlocal(snd_i\Field16, scramblechn, 1.0, $00)
                                            If (entityhidden(T8660BZ460\Field9) <> 0) Then
                                                showentity(T8660BZ460\Field9)
                                            EndIf
                                            scalesprite(T8660BZ460\Field9, rnd(0.04, 0.05), rnd(0.05, 0.06))
                                            positionentity(T8660BZ460\Field9, (entityx(local0\Field10, $01, 1.0) + rnd(-0.025, 0.025)), ((entityy(local0\Field10, $01, 1.0) + rnd(-0.025, 0.025)) + 0.05), (entityz(local0\Field10, $01, 1.0) + rnd(-0.025, 0.025)), $01)
                                        Else
                                            If (entityhidden(T8660BZ460\Field9) = $00) Then
                                                hideentity(T8660BZ460\Field9)
                                            EndIf
                                            If (ChannelPlaying(scramblechn) <> 0) Then
                                                StopChannel(scramblechn)
                                                scramblechn = $00
                                            EndIf
                                        EndIf
                                    Else
                                        If (entityhidden(T8660BZ460\Field9) = $00) Then
                                            hideentity(T8660BZ460\Field9)
                                        EndIf
                                        If (ChannelPlaying(scramblechn) <> 0) Then
                                            StopChannel(scramblechn)
                                            scramblechn = $00
                                        EndIf
                                    EndIf
                                ElseIf (rand($14, $01) < $03) Then
                                    If (local0\Field5 <> $01) Then
                                        entitytexture(local0\Field10, local0\Field8, $00, $00)
                                        GUESSEDfreeentity_7(local0\Field10, $FFFFFFFF, $00)
                                        local0\Field5 = $01
                                    EndIf
                                ElseIf (local0\Field5 <> $02) Then
                                    local0\Field2 = ((local0\Field2 + $01) Mod $06)
                                    entitytexture(local0\Field10, mon_i\Field2[$05], local0\Field2, $00)
                                    GUESSEDfreeentity_7(local0\Field10, $FFFFFFFF, $00)
                                    local0\Field5 = $02
                                EndIf
                                Goto section__1907
                            Else
                                If (entityhidden(T8660BZ460\Field9) = $00) Then
                                    hideentity(T8660BZ460\Field9)
                                EndIf
                                If (ChannelPlaying(scramblechn) <> 0) Then
                                    StopChannel(scramblechn)
                                    scramblechn = $00
                                EndIf
                                If (local0\Field5 <> $01) Then
                                    entitytexture(local0\Field10, local0\Field8, $00, $00)
                                    GUESSEDfreeentity_7(local0\Field10, $FFFFFFFF, $00)
                                    local0\Field5 = $01
                                EndIf
                                local0\Field0 = max((local0\Field0 - fps\Field3[$00]), 0.0)
                                If (0.0 = local0\Field0) Then
                                    If (rand((($BB8 - ((remotedooron = $00) * $4B0)) - (selecteddifficulty\Field2 * $4B0)), $01) = $01) Then
                                        If (local0\Field9 <> 0) Then
                                            If ((entityinview(local0\Field10, camera) And entityvisible(local0\Field10, camera, 0.0)) <> 0) Then
                                                playsound_strict(loadtempsound((("SFX\SCP\079\Broadcast" + (Str rand($00, $02))) + ".ogg")), $00, $00)
                                                local0\Field1 = (rnd(7.0, 7.8) * 70.0)
                                                local0\Field0 = 420.0
                                            EndIf
                                        EndIf
                                    EndIf
                                EndIf
                                If (interactobject(local0\Field10, 1.0, $02) <> 0) Then
                                    selectedscreen = local0
                                    local0\Field3 = resizeimageex(loadimage_strict(local0\Field6), menuscale, menuscale, $01)
                                    playsound_strict(buttonsfx[$00], $00, $00)
                                    TDD0Z6BXB6\Field3 = $00
                                    Exit
                                EndIf
                            EndIf
                        Case $01,$03
                            If ((millisec Mod $5DC) < $320) Then
                                If (local0\Field5 <> $01) Then
                                    entitytexture(local0\Field10, local0\Field8, $00, $00)
                                    GUESSEDfreeentity_7(local0\Field10, $FFFFFFFF, $00)
                                    local0\Field5 = $01
                                EndIf
                            ElseIf (local0\Field5 <> $02) Then
                                entitytexture(local0\Field10, local0\Field8, $01, $00)
                                GUESSEDfreeentity_7(local0\Field10, $FFFFFFFF, $01)
                                playsoundex(loadtempsound("SFX\Alarm\AlarmShort.ogg"), camera, local0\Field10, 1.5, 0.1, $00, $00)
                                local0\Field5 = $02
                            EndIf
                        Case $02
                            For local1 = Each events
                                If (local1\Field19 = local0\Field12) Then
                                    If (0.0 = local1\Field4) Then
                                        If (local0\Field5 <> $01) Then
                                            entitytexture(local0\Field10, local0\Field8, $00, $00)
                                            GUESSEDfreeentity_7(local0\Field10, $FFFFFFFF, $00)
                                            local0\Field5 = $01
                                        EndIf
                                    ElseIf (4200.0 < local1\Field4) Then
                                        If (local0\Field5 <> $02) Then
                                            entitytexture(local0\Field10, local0\Field8, $01, $00)
                                            GUESSEDfreeentity_7(local0\Field10, $FFFFFFFF, $01)
                                            local0\Field5 = $02
                                        EndIf
                                    ElseIf (2100.0 < local1\Field4) Then
                                        If (local0\Field5 <> $03) Then
                                            entitytexture(local0\Field10, local0\Field8, $02, $00)
                                            GUESSEDfreeentity_7(local0\Field10, $FFFFFFFF, $02)
                                            local0\Field5 = $03
                                        EndIf
                                    ElseIf (700.0 < local1\Field4) Then
                                        If (local0\Field5 <> $04) Then
                                            entitytexture(local0\Field10, local0\Field8, $03, $00)
                                            GUESSEDfreeentity_7(local0\Field10, $FFFFFFFF, $03)
                                            local0\Field5 = $04
                                        EndIf
                                    ElseIf (70.0 < local1\Field4) Then
                                        If (local0\Field5 <> $05) Then
                                            entitytexture(local0\Field10, local0\Field8, $04, $00)
                                            GUESSEDfreeentity_7(local0\Field10, $FFFFFFFF, $04)
                                            local0\Field5 = $05
                                        EndIf
                                    ElseIf (66.0 = local1\Field4) Then
                                        If (local0\Field5 <> $06) Then
                                            entitytexture(local0\Field10, local0\Field8, $05, $00)
                                            GUESSEDfreeentity_7(local0\Field10, $FFFFFFFF, $05)
                                            local0\Field5 = $06
                                        EndIf
                                    EndIf
                                    Exit
                                EndIf
                            Next
                        Case $04
                            local0\Field5 = $01
                            local0\Field1 = (local0\Field1 + fps\Field3[$00])
                            If (140.0 < local0\Field1) Then
                                local0\Field2 = ((local0\Field2 + $01) Mod $08)
                                If ((local0\Field2 Mod $02) = $00) Then
                                    local3 = $00
                                Else
                                    local3 = ((local0\Field2 + $01) Sar $01)
                                EndIf
                                entitytexture(local0\Field10, local0\Field8, local3, $00)
                                GUESSEDfreeentity_7(local0\Field10, $FFFFFFFF, local3)
                                local0\Field1 = 0.0
                            EndIf
                        Case $05
                            If (local0\Field5 <> $01) Then
                                entitytexture(local0\Field10, local0\Field8, $00, $00)
                                GUESSEDfreeentity_7(local0\Field10, $FFFFFFFF, $00)
                                local0\Field5 = $01
                            EndIf
                    End Select
                EndIf
            ElseIf (local0\Field5 <> $00) Then
                GUESSEDfreeupdatescreens()
                entitytexture(local0\Field10, mon_i\Field2[$02], $00, $00)
                GUESSEDfreeentity_7(local0\Field10, $FFFFFFFF, $00)
                local0\Field5 = $00
.section__1907
            EndIf
        EndIf
    Next
    Return $00
End Function

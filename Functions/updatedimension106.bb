Function updatedimension106%()
    Local local0.events
    Local local1.events
    Local local2.rooms
    Local local3.doors
    Local local4%
    Local local5.particles
    Local local6.decals
    Local local7%
    Local local8#
    Local local9#
    Local local10%
    Local local11%
    Local local12#
    Local local13#
    Local local14#
    Local local15#
    Local local16#
    Local local17#
    Local local19%
    Local local20%
    Local local21%
    Local local23%
    Local local26%
    Local local27%
    For local0 = Each events
        If (local0\Field32 = $4B) Then
            If (GUESSEDupdatexdb() = $00) Then
                local12 = (sin((local0\Field4 * 1.6)) * 4.0)
                local13 = (cos((local0\Field4 * 0.8)) * 5.0)
                positionentity(local0\Field19\Field27[$09], (entityx(local0\Field19\Field27[$08], $01, 1.0) + 13.21875), local0\Field19\Field3, entityz(local0\Field19\Field27[$08], $01, 1.0), $00)
                translateentity(local0\Field19\Field27[$09], local13, 0.0, local12, $01)
                rotateentity(local0\Field19\Field27[$09], 0.0, (local0\Field4 * 2.0), 0.0, $00)
                positionentity(local0\Field19\Field27[$0A], entityx(local0\Field19\Field27[$08], $01, 1.0), local0\Field19\Field3, (entityz(local0\Field19\Field27[$08], $01, 1.0) + 13.21875), $00)
                translateentity(local0\Field19\Field27[$0A], local12, 0.0, local13, $01)
                rotateentity(local0\Field19\Field27[$0A], 0.0, (local0\Field4 * 2.0), 0.0, $00)
            Else
                For local7 = $00 To $1D Step $01
                    If (((local7 <> $09) And (local7 <> $0A)) <> 0) Then
                        GUESSEDupdatedimension(local0\Field19, local7)
                    EndIf
                Next
                GUESSEDupdatedimension(local0\Field19, $13)
            EndIf
            If (playerroom = local0\Field19) Then
                showroomsnocoll(local0\Field19)
                showroomscoll(local0\Field19)
                playerfallingpickdistance = 0.0
                previsblackout = isblackout
                isblackout = $00
                If ((((n_i\Field2 <> Null) And (0.09 > entitydistancesquared(XZ0260X8X2\Field74, n_i\Field2\Field82))) And (3.0 > n_i\Field2\Field66)) <> 0) Then
                    n_i\Field2\Field31 = 0.0
                    n_i\Field2\Field66 = 3.0
                    n_i\Field2\Field65 = 100000.0
                EndIf
                cansave = $01
                If (5.0 <> local0\Field7) Then
                    shouldplay = $03
                    If (T8660BZ460\Field10 = $00) Then
                        XZ0260X8X2\Field11 = ((((Float ((T8660BZ460\Field8 > $00) Lor (T8660BZ460\Field11 > $00))) + 1.0) * (fps\Field3[$00] * 0.0001)) + XZ0260X8X2\Field11)
                    Else
                        XZ0260X8X2\Field11 = (XZ0260X8X2\Field11 + (fps\Field3[$00] * 0.00005))
                    EndIf
                    fog\Field13 = 6.0
                    local0\Field4 = (local0\Field4 + fps\Field3[$00])
                    local12 = (local0\Field4 / 14.0)
                    scaleentity(local0\Field19\Field15, (1.0 / 256.0), (((sin(local12) * 0.2) + 1.0) * (1.0 / 256.0)), (1.0 / 256.0), $00)
                    For local7 = $09 To $0A Step $01
                        scaleentity(local0\Field19\Field27[local7], (((Abs (sin(((local0\Field4 / 21.0) + ((Float local7) * 45.0))) * 0.1)) + 1.5) * (1.0 / 256.0)), (((sin((((Float local7) * 20.0) + local12)) * 0.1) + 1.0) * (1.0 / 256.0)), (1.0 / 256.0), $01)
                    Next
                ElseIf (selecteddifficulty\Field1 < $02) Then
                    If (keyhit(key\Field15) <> 0) Then
                        Select selecteddifficulty\Field1
                            Case $00
                                playsound_strict(loadtempsound("SFX\General\Save0.ogg"), $00, $00)
                                createhintmsg(getlocalstring("save", "saved"), 6.0, $00)
                            Case $01
                                createhintmsg(getlocalstring("save", "failed.screen"), 6.0, $00)
                        End Select
                    EndIf
                EndIf
                local20 = $00
                local21 = rand($27, $01)
                If (((3.0 <> local0\Field7) And (sky106 <> $00)) <> 0) Then
                    freeentity(sky106)
                    sky106 = $00
                EndIf
                Select local0\Field7
                    Case 0.0
                        For local7 = $00 To $07 Step $01
                            scaleentity(local0\Field19\Field27[local7], (((Abs (sin(((local0\Field4 / 21.0) + ((Float local7) * 45.0))) * 0.1)) + 1.0) * (1.0 / 256.0)), (((sin((((Float local7) * 20.0) + local12)) * 0.1) + 1.0) * (1.0 / 256.0)), (1.0 / 256.0), $01)
                        Next
                        If (n_i\Field2 <> Null) Then
                            If (3.0 > n_i\Field2\Field66) Then
                                local8 = ((local0\Field4 / 10.0) Mod 360.0)
                                positionentity(n_i\Field2\Field82, local0\Field19\Field40, ((local0\Field19\Field3 + 0.55) + (sin((local12 * 20.0)) * 0.4)), local0\Field19\Field37, $00)
                                rotateentity(n_i\Field2\Field82, 0.0, local8, 0.0, $00)
                                moveentity(n_i\Field2\Field82, 0.0, 0.0, (6.0 - sin((local0\Field4 / 10.0))), $00)
                                animatenpc(n_i\Field2, 55.0, 104.0, 0.5, $01)
                                rotateentity(n_i\Field2\Field82, 0.0, (local8 + 90.0), 0.0, $00)
                                If ((entityhidden(n_i\Field2\Field98) Lor entityhidden(n_i\Field2\Field82)) <> 0) Then
                                    showentity(n_i\Field2\Field98)
                                    showentity(n_i\Field2\Field82)
                                EndIf
                                resetentity(n_i\Field2\Field82)
                                n_i\Field2\Field31 = 1.0
                                n_i\Field2\Field42 = 0.0
                                n_i\Field2\Field70 = 0.0
                                positionentity(n_i\Field2\Field98, entityx(n_i\Field2\Field82, $00, 1.0), entityy(n_i\Field2\Field82, $00, 1.0), entityz(n_i\Field2\Field82, $00, 1.0), $00)
                                rotateentity(n_i\Field2\Field98, 0.0, entityyaw(n_i\Field2\Field82, $00, 1.0), 0.0, $00)
                            EndIf
                            If (4550.0 < local0\Field4) Then
                                If (rand($320, $01) = $01) Then
                                    playsound_strict(snd_i\Field40[$08], $00, $00)
                                    n_i\Field2\Field31 = 0.0
                                    n_i\Field2\Field66 = 3.0
                                    n_i\Field2\Field65 = 100000.0
                                    local0\Field4 = 601.0
                                EndIf
                            EndIf
                        EndIf
                        If (21.97266 < entitydistancesquared(XZ0260X8X2\Field74, local0\Field19\Field15)) Then
                            For local1 = Each events
                                If (local1\Field32 = $02) Then
                                    If (1.0 = local1\Field4) Then
                                        local21 = $28
                                    EndIf
                                    Exit
                                EndIf
                            Next
                            local20 = $01
                        EndIf
                    Case 1.0
                        If (chs\Field0 = $00) Then
                            For local7 = $09 To $0A Step $01
                                local9 = distancesquared(entityx(XZ0260X8X2\Field74, $00, 1.0), entityx(local0\Field19\Field27[local7], $01, 1.0), entityz(XZ0260X8X2\Field74, $00, 1.0), entityz(local0\Field19\Field27[local7], $01, 1.0), 0.0, 0.0)
                                If (36.0 > local9) Then
                                    If ((1.0 / 6.5536) > local9) Then
                                        local10 = createpivot($00)
                                        positionentity(local10, entityx(local0\Field19\Field27[local7], $01, 1.0), entityy(XZ0260X8X2\Field74, $00, 1.0), entityz(local0\Field19\Field27[local7], $01, 1.0), $00)
                                        pointentity(local10, XZ0260X8X2\Field74, 0.0)
                                        rotateentity(local10, 0.0, ((Float (Int (entityyaw(local10, $00, 1.0) / 90.0))) * 90.0), 0.0, $01)
                                        moveentity(local10, 0.0, 0.0, (1.0 / 2.56), $00)
                                        positionentity(XZ0260X8X2\Field74, entityx(local10, $00, 1.0), entityy(XZ0260X8X2\Field74, $00, 1.0), entityz(local10, $00, 1.0), $00)
                                        freeentity(local10)
                                        local10 = $00
                                        If (((chs\Field0 = $00) And (0.0 = XZ0260X8X2\Field48)) <> 0) Then
                                            msg\Field8 = getlocalstring("death", "106_1")
                                            playsound_strict(loadtempsound("SFX\Room\PocketDimension\Impact.ogg"), $00, $00)
                                            XZ0260X8X2\Field64 = 3000.0
                                            kill($00, $01, $00, $00)
                                        EndIf
                                    EndIf
                                    local0\Field2 = loopsoundex(local0\Field0, local0\Field2, camera, local0\Field19\Field27[local7], 6.0, 1.0, $00)
                                EndIf
                            Next
                        EndIf
                        local10 = createpivot($00)
                        positionentity(local10, (entityx(local0\Field19\Field27[$08], $01, 1.0) - 6.0), (local0\Field19\Field3 + (1.0 / 0.512)), (entityz(local0\Field19\Field27[$08], $01, 1.0) + 2.375), $00)
                        If (25.0 > entitydistancesquared(local10, XZ0260X8X2\Field74)) Then
                            local0\Field8 = loopsoundex(local0\Field30, local0\Field8, camera, local10, 3.0, 1.0, $00)
                        EndIf
                        freeentity(local10)
                        local10 = $00
                        If (-6.25 > entityy(XZ0260X8X2\Field74, $00, 1.0)) Then
                            If (((344.2764 < entitydistancesquared(XZ0260X8X2\Field74, local0\Field19\Field27[$08])) And (0.0 = XZ0260X8X2\Field48)) <> 0) Then
                                local21 = rand($0E, $1E)
                                local20 = $01
                            ElseIf (((chs\Field0 = $00) And (0.0 = XZ0260X8X2\Field48)) <> 0) Then
                                playsound_strict(snd_i\Field40[$08], $00, $00)
                                msg\Field8 = getlocalstring("death", "106_2")
                                XZ0260X8X2\Field64 = 3000.0
                                kill($00, $01, $00, $00)
                            EndIf
                        EndIf
                        If (61.03516 > entitydistancesquared(XZ0260X8X2\Field74, local0\Field19\Field27[$11])) Then
                            loadeventsound(local0, "SFX\Room\PocketDimension\Screech.ogg", $00)
                            loadeventsound(local0, "SFX\Room\PocketDimension\Kneel.ogg", $01)
                            If (n_i\Field2 <> Null) Then
                                setnpcframe(n_i\Field2, 605.0, $01)
                                n_i\Field2\Field83 = 0.2136
                                scaleentity(n_i\Field2\Field98, n_i\Field2\Field83, n_i\Field2\Field83, n_i\Field2\Field83, $00)
                                n_i\Field2\Field66 = 5.0
                            EndIf
                            local0\Field7 = 2.0
                        EndIf
                    Case 2.0
                        local9 = entitydistancesquared(XZ0260X8X2\Field74, local0\Field19\Field27[$11])
                        local14 = sqr(local9)
                        If (61.03516 <= local9) Then
                            loadeventsound(local0, "SFX\Room\PocketDimension\Rumble.ogg", $00)
                            loadeventsound(local0, "SFX\Room\PocketDimension\PrisonVoices.ogg", $01)
                            local0\Field7 = 1.0
                        EndIf
                        If (entityhidden(local0\Field19\Field27[$12]) <> 0) Then
                            showentity(local0\Field19\Field27[$12])
                        EndIf
                        XZ0260X8X2\Field11 = (((fps\Field3[$00] * 0.0004) - ((Float (T8660BZ460\Field10 > $00)) * 0.0002)) + XZ0260X8X2\Field11)
                        XZ0260X8X2\Field42 = max((XZ0260X8X2\Field42 - ((fps\Field3[$00] / local14) / 8.0)), -1000.0)
                        XZ0260X8X2\Field51 = max(XZ0260X8X2\Field51, (((sin(((Float millisec) / 20.0)) + 1.0) * 15.0) * max(((6.0 - local14) / 6.0), 0.0)))
                        local10 = createpivot($00)
                        positionentity(local10, entityx(camera, $00, 1.0), entityy(camera, $00, 1.0), entityz(camera, $00, 1.0), $00)
                        pointentity(local10, local0\Field19\Field27[$11], 0.0)
                        turnentity(local10, 90.0, 0.0, 0.0, $00)
                        local9 = clamp((15000.0 / (- XZ0260X8X2\Field42)), 15.0, 500.0)
                        camerapitch = curveangle(entitypitch(local10, $00, 1.0), (camerapitch + 90.0), local9)
                        camerapitch = (camerapitch - 90.0)
                        rotateentity(XZ0260X8X2\Field74, entitypitch(XZ0260X8X2\Field74, $00, 1.0), curveangle(entityyaw(local10, $00, 1.0), entityyaw(XZ0260X8X2\Field74, $00, 1.0), local9), 0.0, $00)
                        freeentity(local10)
                        local10 = $00
                        If (n_i\Field2 <> Null) Then
                            n_i\Field2\Field31 = 0.0
                            n_i\Field2\Field42 = 0.0
                            n_i\Field2\Field70 = 0.0
                            positionentity(n_i\Field2\Field82, entityx(local0\Field19\Field27[$11], $01, 1.0), (entityy(local0\Field19\Field27[$11], $01, 1.0) / ((sin(local12) * 0.2) + 1.0)), entityz(local0\Field19\Field27[$11], $01, 1.0), $01)
                            rotateentity(n_i\Field2\Field82, 0.0, (Float local0\Field19\Field21), 0.0, $00)
                        EndIf
                        If (XZ0260X8X2\Field25 <> 0) Then
                            XZ0260X8X2\Field53 = -10.0
                            XZ0260X8X2\Field25 = $00
                            positionentity(XZ0260X8X2\Field74, (entityx(local0\Field19\Field27[$08], $01, 1.0) - 5.25), ((local0\Field19\Field3 + 16.0) + 11.5), (entityz(local0\Field19\Field27[$08], $01, 1.0) - 4.625), $00)
                            resetentity(XZ0260X8X2\Field74)
                            If (n_i\Field2 <> Null) Then
                                n_i\Field2\Field83 = 0.1136
                                scaleentity(n_i\Field2\Field98, n_i\Field2\Field83, n_i\Field2\Field83, n_i\Field2\Field83, $00)
                            EndIf
                            loadeventsound(local0, "SFX\Room\PocketDimension\Explosion.ogg", $00)
                            loadeventsound(local0, "SFX\Room\PocketDimension\TrenchPlane.ogg", $01)
                            local0\Field7 = 3.0
                        EndIf
                    Case 3.0
                        shouldplay = $0E
                        decalstep = $01
                        If (sky106 = $00) Then
                            sky106 = createsky("GFX\Map\Textures\106sky", $00)
                        EndIf
                        updatesky(sky106, $01)
                        For local7 = $11 To $14 Step $01
                            If (local7 > $12) Then
                                If (entityhidden(local0\Field19\Field27[local7]) <> 0) Then
                                    showentity(local0\Field19\Field27[local7])
                                EndIf
                            ElseIf (entityhidden(local0\Field19\Field27[local7]) = $00) Then
                                hideentity(local0\Field19\Field27[local7])
                            EndIf
                        Next
                        If ((entityx(local0\Field19\Field27[$08], $01, 1.0) - 15.625) > entityx(local0\Field19\Field27[$13], $01, 1.0)) Then
                            local0\Field8 = playsound_strict(local0\Field30, $00, $00)
                            positionentity(local0\Field19\Field27[$13], (entityx(XZ0260X8X2\Field74, $01, 1.0) + 15.625), (local0\Field19\Field3 + 28.0), entityz(XZ0260X8X2\Field74, $01, 1.0), $00)
                        EndIf
                        moveentity(XZ0260X8X2\Field74, 0.0, (min((28.0 - entityy(XZ0260X8X2\Field74, $00, 1.0)), 0.0) * fps\Field3[$00]), 0.0, $00)
                        local15 = (((- fps\Field3[$00]) * (1.0 / 256.0)) * 4.0)
                        local16 = ((33.0 - ((Abs (entityx(XZ0260X8X2\Field74, $00, 1.0) - entityx(local0\Field19\Field27[$13], $00, 1.0))) * 0.5)) - entityy(local0\Field19\Field27[$13], $00, 1.0))
                        local17 = (entityz(XZ0260X8X2\Field74, $01, 1.0) - entityz(local0\Field19\Field27[$13], $00, 1.0))
                        translateentity(local0\Field19\Field27[$13], local15, local16, local17, $01)
                        rotateentity(local0\Field19\Field27[$13], (-90.0 - ((entityx(XZ0260X8X2\Field74, $00, 1.0) - entityx(local0\Field19\Field27[$13], $00, 1.0)) * 1.5)), -90.0, 0.0, $01)
                        local23 = $00
                        For local7 = $00 To $02 Step $01
                            Select local7
                                Case $00
                                    local15 = -5.671875
                                    local17 = (1.0 / -6.918919)
                                Case $01
                                    local15 = (1.0 / -2.115702)
                                    local17 = 0.734375
                                Case $02
                                    local15 = 4.777344
                                    local17 = -0.765625
                            End Select
                            local15 = (entityx(local0\Field19\Field27[$08], $01, 1.0) + local15)
                            local17 = (entityz(local0\Field19\Field27[$08], $01, 1.0) + local17)
                            If ((1.0 / 1.6384) > distancesquared(entityx(XZ0260X8X2\Field74, $00, 1.0), local15, entityz(XZ0260X8X2\Field74, $00, 1.0), local17, 0.0, 0.0)) Then
                                local23 = $01
                                Exit
                            EndIf
                        Next
                        local9 = entitydistancesquared(XZ0260X8X2\Field74, local0\Field19\Field27[$13])
                        local14 = sqr(local9)
                        local0\Field8 = loopsoundex(local0\Field30, local0\Field8, camera, camera, 10.0, (((Float (local23 = $00)) * 0.7) + 0.3), $00)
                        If (((local23 Lor chs\Field8) Lor i_268\Field3) <> 0) Then
                            entitytexture(local0\Field19\Field27[$13], local0\Field19\Field26[$00], $00, $00)
                        ElseIf (((((64.0 > local9) And (i_714\Field0 <> $02)) And (T8660BZ460\Field3 <> $04)) And (T8660BZ460\Field10 <> $04)) <> 0) Then
                            local0\Field2 = loopsoundex(local0\Field0, local0\Field2, camera, local0\Field19\Field27[$13], 8.0, 1.0, $00)
                            entitytexture(local0\Field19\Field27[$13], local0\Field19\Field26[$01], $00, $00)
                            XZ0260X8X2\Field11 = (((fps\Field3[$00] * (0.0006 / ((Float (i_714\Field0 = $01)) + 1.0))) * (8.0 - local14)) + XZ0260X8X2\Field11)
                            If (49.0 > local9) Then
                                local10 = createpivot($00)
                                positionentity(local10, entityx(camera, $00, 1.0), entityy(camera, $00, 1.0), entityz(camera, $00, 1.0), $00)
                                pointentity(local10, local0\Field19\Field27[$13], 0.0)
                                turnentity(local10, 90.0, 0.0, 0.0, $00)
                                camerapitch = curveangle(entitypitch(local10, $00, 1.0), (camerapitch + 90.0), 10.0)
                                camerapitch = (camerapitch - 90.0)
                                rotateentity(XZ0260X8X2\Field74, entitypitch(XZ0260X8X2\Field74, $00, 1.0), curveangle(entityyaw(local10, $00, 1.0), entityyaw(XZ0260X8X2\Field74, $00, 1.0), 10.0), 0.0, $00)
                                freeentity(local10)
                                local10 = $00
                            EndIf
                        ElseIf (64.0 > local9) Then
                            entitytexture(local0\Field19\Field27[$13], local0\Field19\Field26[$00], $00, $00)
                            XZ0260X8X2\Field11 = (((8.0 - local14) * (fps\Field3[$00] * 0.0002)) + XZ0260X8X2\Field11)
                        EndIf
                        If ((((i_714\Field0 = $02) Lor chs\Field8) Lor i_268\Field3) <> 0) Then
                            XZ0260X8X2\Field1 = max(((((Float (local23 = $00)) * 3.0) + 3.0) - local14), 0.0)
                        Else
                            XZ0260X8X2\Field14 = max(((((Float (local23 = $00)) * 4.0) + 4.0) - local14), 0.0)
                        EndIf
                        If (24.5 > entityy(XZ0260X8X2\Field74, $00, 1.0)) Then
                            StopChannel(local0\Field2)
                            local0\Field2 = $00
                            StopChannel(local0\Field8)
                            local0\Field8 = $00
                            local21 = $12
                            local20 = $01
                        EndIf
                    Case 4.0
                        local9 = distancesquared(entityx(XZ0260X8X2\Field74, $00, 1.0), (entityx(local0\Field19\Field27[$08], $01, 1.0) + 4.0), entityz(XZ0260X8X2\Field74, $00, 1.0), entityz(local0\Field19\Field27[$08], $01, 1.0), 0.0, 0.0)
                        If (6.25 > local9) Then
                            local14 = sqr(local9)
                            XZ0260X8X2\Field64 = ((2.5 - local14) * 3000.0)
                            local0\Field8 = loopsoundex(snd_i\Field1[rand($03, $01)], local0\Field8, camera, XZ0260X8X2\Field74, 2.0, (((2.5 - local14) * (Abs XZ0260X8X2\Field76)) * 100.0), $00)
                            XZ0260X8X2\Field76 = curvevalue(0.0, XZ0260X8X2\Field76, (local14 * 10.0))
                            If ((1.0 / 3.87787) > local9) Then
                                local19 = $00
                                For local2 = Each rooms
                                    If (local2\Field22\Field21 = $38) Then
                                        local19 = $01
                                        giveachievement("pocketdimension", $01)
                                        isblackout = previsblackout
                                        previsblackout = $01
                                        XZ0260X8X2\Field53 = -10.0
                                        XZ0260X8X2\Field64 = 1500.0
                                        If (XZ0260X8X2\Field38 = $02) Then
                                            local0\Field2 = playsound_strict(loadtempsound("SFX\Room\PocketDimension\Exit.ogg"), $00, $00)
                                            makemeunplayable($01)
                                        EndIf
                                        If (ChannelPlaying(local0\Field2) = $00) Then
                                            teleportentity(XZ0260X8X2\Field74, entityx(local2\Field27[$00], $01, 1.0), 0.6, entityz(local2\Field27[$00], $01, 1.0), 0.3, $01, 2.0, $00)
                                            teleporttoroom(local2)
                                            If (n_i\Field2 <> Null) Then
                                                n_i\Field2\Field31 = 0.0
                                                n_i\Field2\Field66 = 0.0
                                                n_i\Field2\Field65 = rnd(10000.0, 12000.0)
                                            EndIf
                                            local6 = createdecal($00, entityx(local2\Field27[$00], $01, 1.0), entityy(local2\Field27[$00], $01, 1.0), entityz(local2\Field27[$00], $01, 1.0), 270.0, rnd(360.0, 0.0), 0.0, 1.0, 1.0, $00, $01, $00, $00, $00)
                                            entityparent(local6\Field0, local0\Field19\Field15, $01)
                                            teleportentity(local6\Field0, entityx(local2\Field27[$00], $01, 1.0), (entityy(local2\Field27[$00], $01, 1.0) + 0.6), entityz(local2\Field27[$00], $01, 1.0), 0.0, $01, 4.0, $01)
                                            For local1 = Each events
                                                If (local1\Field32 = $0C) Then
                                                    local1\Field7 = 7.0
                                                    local1\Field1 = 0.0
                                                    updatelever(local1\Field19\Field9[$00]\Field1, $00, $50, -80.0)
                                                    rotateentity(local1\Field19\Field9[$00]\Field1, 80.0, entityyaw(local1\Field19\Field9[$00]\Field1, $00, 1.0), 0.0, $00)
                                                    Exit
                                                EndIf
                                            Next
                                            fog\Field13 = 8.0
                                            XZ0260X8X2\Field38 = $02
                                            If (local0\Field0 <> $00) Then
                                                freesound_strict(local0\Field0)
                                                local0\Field0 = $00
                                            EndIf
                                            If (local0\Field30 <> $00) Then
                                                freesound_strict(local0\Field30)
                                                local0\Field30 = $00
                                            EndIf
                                            local0\Field4 = 0.0
                                            local0\Field1 = 0.0
                                            If (sky106 <> $00) Then
                                                freeentity(sky106)
                                                sky106 = $00
                                            EndIf
                                            local0\Field7 = 0.0
                                        EndIf
                                        Exit
                                    EndIf
                                Next
                                If (local19 = $00) Then
                                    local21 = $13
                                    local20 = $01
                                EndIf
                            EndIf
                        EndIf
                    Case 5.0
                        shouldplay = $01
                        giveachievement("pocketdimension", $01)
                        lightrenderdistance = 64.0
                        updatelightvolume()
                        updatelights()
                        updatedoors()
                        scaleentity(local0\Field19\Field15, (1.0 / 256.0), (1.0 / 256.0), (1.0 / 256.0), $00)
                        If (((0.0 = local0\Field1) And ((150.0 < local0\Field19\Field25[$00]\Field13) Lor (150.0 < local0\Field19\Field25[$01]\Field13))) <> 0) Then
                            playsound_strict(snd_i\Field40[$0D], $00, $00)
                            XZ0260X8X2\Field64 = 800.0
                            local0\Field1 = 1.0
                        EndIf
                        If (5.0 > entityy(XZ0260X8X2\Field74, $00, 1.0)) Then
                            positionentity(XZ0260X8X2\Field74, entityx(XZ0260X8X2\Field74, $01, 1.0), (entityy(XZ0260X8X2\Field74, $01, 1.0) - (1.0 / 0.512)), entityz(XZ0260X8X2\Field74, $01, 1.0), $00)
                            resetentity(XZ0260X8X2\Field74)
                            For local7 = $00 To $01 Step $01
                                local0\Field19\Field25[local7]\Field39 = $00
                                local0\Field19\Field25[local7]\Field13 = 0.0
                            Next
                            _S2IMapErase(unlockedachievements, "pocketdimension")
                            loadeventsound(local0, "SFX\Room\PocketDimension\Rumble.ogg", $00)
                            loadeventsound(local0, "SFX\Room\PocketDimension\PrisonVoices.ogg", $01)
                            local0\Field4 = 0.0
                            local0\Field1 = 0.0
                            local0\Field7 = 1.0
                        EndIf
                    Case 6.0
                        If (opt\Field69 > $00) Then
                            If (rand($320, $01) = $01) Then
                                local8 = (entityyaw(camera, $01, 1.0) + rnd(150.0, 210.0))
                                local5 = createparticle($04, (entityx(XZ0260X8X2\Field74, $00, 1.0) + (cos(local8) * 7.5)), 0.0, (entityz(XZ0260X8X2\Field74, $00, 1.0) + (sin(local8) * 7.5)), 4.0, 0.0, 2500.0)
                                local5\Field11 = 0.01
                                local5\Field7 = 0.0
                                entityblend(local5\Field4, $02)
                                pointentity(local5\Field10, camera, 0.0)
                                turnentity(local5\Field10, 0.0, 145.0, 0.0, $01)
                                turnentity(local5\Field10, rnd(10.0, 20.0), 0.0, 0.0, $01)
                            EndIf
                        EndIf
                        If (12.0 < local0\Field1) Then
                            If (n_i\Field2 <> Null) Then
                                n_i\Field2\Field31 = 1.0
                                positionentity(n_i\Field2\Field82, entityx(local0\Field19\Field27[(Int local0\Field1)], $01, 1.0), (local0\Field19\Field3 + 0.27), entityz(local0\Field19\Field27[(Int local0\Field1)], $01, 1.0), $00)
                                pointentity(n_i\Field2\Field82, camera, 0.0)
                                turnentity(n_i\Field2\Field82, 0.0, (sin(((Float millisec) / 20.0)) * 6.0), 0.0, $01)
                                moveentity(n_i\Field2\Field82, 0.0, 0.0, (sin(((Float millisec) / 15.0)) * 0.06), $00)
                                n_i\Field2\Field42 = 0.0
                                n_i\Field2\Field70 = 0.0
                                positionentity(n_i\Field2\Field98, entityx(n_i\Field2\Field82, $00, 1.0), entityy(n_i\Field2\Field82, $00, 1.0), entityz(n_i\Field2\Field82, $00, 1.0), $00)
                                resetentity(n_i\Field2\Field82)
                                rotateentity(n_i\Field2\Field98, 0.0, entityyaw(n_i\Field2\Field82, $00, 1.0), 0.0, $00)
                            EndIf
                            If (((rand($2EE, $01) = $01) And (12.0 < local0\Field1)) <> 0) Then
                                XZ0260X8X2\Field53 = -10.0
                                playsound_strict(snd_i\Field40[$08], $00, $00)
                                local0\Field1 = (local0\Field1 - 1.0)
                            EndIf
                            If (12.0 = local0\Field1) Then
                                XZ0260X8X2\Field1 = 1.0
                                If (n_i\Field2 <> Null) Then
                                    n_i\Field2\Field31 = 0.0
                                    n_i\Field2\Field66 = 3.0
                                    n_i\Field2\Field65 = 100000.0
                                    positionentity(n_i\Field2\Field82, entityx(local0\Field19\Field27[(Int local0\Field1)], $01, 1.0), (local0\Field19\Field3 - 1.0), entityz(local0\Field19\Field27[(Int local0\Field1)], $01, 1.0), $00)
                                    resetentity(n_i\Field2\Field82)
                                EndIf
                            EndIf
                        ElseIf (n_i\Field2 <> Null) Then
                            n_i\Field2\Field31 = 0.0
                            n_i\Field2\Field66 = 3.0
                            n_i\Field2\Field65 = 100000.0
                        EndIf
                        If (-6.25 > entityy(XZ0260X8X2\Field74, $00, 1.0)) Then
                            If ((1.0 / 3.160494) > distancesquared(entityx(local0\Field19\Field27[$10], $01, 1.0), entityx(XZ0260X8X2\Field74, $00, 1.0), entityz(local0\Field19\Field27[$10], $01, 1.0), entityz(XZ0260X8X2\Field74, $00, 1.0), 0.0, 0.0)) Then
                                If (n_i\Field2 <> Null) Then
                                    n_i\Field2\Field66 = 0.0
                                    n_i\Field2\Field65 = rnd(22000.0, 27000.0)
                                EndIf
                                local21 = rand($0E, $1E)
                                local20 = $01
                            ElseIf (((chs\Field0 = $00) And (0.0 = XZ0260X8X2\Field48)) <> 0) Then
                                playsound_strict(snd_i\Field40[$08], $00, $00)
                                msg\Field8 = getlocalstring("death", "106_2")
                                XZ0260X8X2\Field64 = 3000.0
                                kill($00, $01, $00, $00)
                            EndIf
                        EndIf
                    Case 7.0
                        fog\Field13 = 3.5
                        updatedoors()
                        XZ0260X8X2\Field11 = (((fps\Field3[$00] * 0.0002) - ((Float (T8660BZ460\Field10 > $00)) * 0.0001)) + XZ0260X8X2\Field11)
                        If (206.4161 < distancesquared(entityx(XZ0260X8X2\Field74, $00, 1.0), (entityx(local0\Field19\Field27[$08], $01, 1.0) + 28.13281), entityz(XZ0260X8X2\Field74, $00, 1.0), (entityz(local0\Field19\Field27[$08], $01, 1.0) + 5.867188), 0.0, 0.0)) Then
                            If (n_i\Field2 <> Null) Then
                                n_i\Field2\Field32 = (n_i\Field2\Field32 * 2.8)
                            EndIf
                            For local3 = Each doors
                                If (local3\Field32 = local0\Field19) Then
                                    local3\Field39 = $00
                                    local3\Field13 = 0.0
                                EndIf
                            Next
                            local21 = $29
                            local20 = $01
                        EndIf
                End Select
                If (local20 <> 0) Then
                    XZ0260X8X2\Field53 = -10.0
                    XZ0260X8X2\Field64 = 1150.0
                    If (n_i\Field2 <> Null) Then
                        n_i\Field2\Field31 = 1.0
                    EndIf
                    Select local21
                        Case $01,$02,$03,$04,$05,$1F,$20
                            playsound_strict(snd_i\Field58[$03], $01, $00)
                            local10 = createpivot($00)
                            positionentity(local10, entityx(XZ0260X8X2\Field74, $00, 1.0), entityy(XZ0260X8X2\Field74, $00, 1.0), entityz(XZ0260X8X2\Field74, $00, 1.0), $00)
                            pointentity(local10, local0\Field19\Field15, 0.0)
                            moveentity(local10, 0.0, 0.0, (entitydistance(XZ0260X8X2\Field74, local0\Field19\Field15) * 1.9), $00)
                            positionentity(XZ0260X8X2\Field74, entityx(local10, $00, 1.0), (entityy(XZ0260X8X2\Field74, $00, 1.0) + 0.1), entityz(local10, $00, 1.0), $00)
                            resetentity(XZ0260X8X2\Field74)
                            moveentity(local10, 0.0, 0.0, 0.8, $00)
                            positionentity(local0\Field19\Field27[$0A], entityx(local10, $00, 1.0), 0.1, entityz(local10, $00, 1.0), $00)
                            rotateentity(local0\Field19\Field27[$0A], 0.0, entityyaw(local10, $00, 1.0), 0.0, $01)
                            freeentity(local10)
                            local10 = $00
                            local0\Field7 = 0.0
                        Case $06,$07,$08,$09,$0A,$0B,$0C,$0D,$21,$22,$23,$24
                            playsound_strict(snd_i\Field58[$03], $01, $00)
                            positionentity(XZ0260X8X2\Field74, entityx(local0\Field19\Field27[$08], $01, 1.0), 0.6, entityz(local0\Field19\Field27[$08], $01, 1.0), $00)
                            resetentity(XZ0260X8X2\Field74)
                            loadeventsound(local0, "SFX\Room\PocketDimension\Rumble.ogg", $00)
                            loadeventsound(local0, "SFX\Room\PocketDimension\PrisonVoices.ogg", $01)
                            local0\Field1 = 0.0
                            local0\Field7 = 1.0
                        Case $0E,$0F,$10,$11,$25,$26
                            positionentity(XZ0260X8X2\Field74, entityx(local0\Field19\Field15, $00, 1.0), 0.6, entityz(local0\Field19\Field15, $00, 1.0), $00)
                            resetentity(XZ0260X8X2\Field74)
                            local0\Field1 = 0.0
                            local0\Field7 = 0.0
                        Case $12
                            positionentity(XZ0260X8X2\Field74, (entityx(local0\Field19\Field27[$08], $01, 1.0) - (1.0 / 0.64)), ((local0\Field19\Field3 + 16.0) - 1.1875), entityz(local0\Field19\Field27[$08], $01, 1.0), $00)
                            resetentity(XZ0260X8X2\Field74)
                            XZ0260X8X2\Field8 = 5.0
                            StopChannel(local0\Field2)
                            local0\Field2 = $00
                            StopChannel(local0\Field8)
                            local0\Field8 = $00
                            local0\Field1 = 0.0
                            local0\Field7 = 4.0
                        Case $13,$14,$15,$16,$17
                            local26 = $FFFFFFFF
                            local27 = $00
                            Select rand($07, $01)
                                Case $01
                                    local26 = $27
                                    local27 = $01
                                Case $02
                                    local26 = $08
                                    local27 = $01
                                Case $03
                                    local26 = $0B
                                    local27 = $01
                                Case $04
                                    local26 = $30
                                Case $05
                                    local26 = $32
                                Case $06
                                    local26 = $43
                                Case $07
                                    local26 = $47
                            End Select
                            local19 = $00
                            For local2 = Each rooms
                                If (local2\Field22\Field21 = local26) Then
                                    local19 = $01
                                    giveachievement("pocketdimension", $01)
                                    isblackout = previsblackout
                                    previsblackout = $01
                                    XZ0260X8X2\Field53 = -10.0
                                    If (local2\Field35 <> $00) Then
                                        teleportentity(XZ0260X8X2\Field74, entityx(local2\Field35, $01, 1.0), (entityy(local2\Field15, $00, 1.0) + 0.4), entityz(local2\Field35, $01, 1.0), 0.3, $01, 2.0, $00)
                                    Else
                                        teleportentity(XZ0260X8X2\Field74, entityx(local2\Field15, $00, 1.0), (entityy(local2\Field15, $00, 1.0) + 0.4), entityz(local2\Field15, $00, 1.0), 0.3, $01, 2.0, $00)
                                    EndIf
                                    teleporttoroom(local2)
                                    If (n_i\Field2 <> Null) Then
                                        n_i\Field2\Field31 = 0.0
                                        n_i\Field2\Field66 = 0.0
                                        n_i\Field2\Field65 = rnd(10000.0, 12000.0)
                                    EndIf
                                    If (local27 = $00) Then
                                        For local1 = Each events
                                            If (local1\Field32 = $0C) Then
                                                local1\Field7 = 7.0
                                                local1\Field1 = 0.0
                                                updatelever(local1\Field19\Field9[$00]\Field1, $00, $50, -80.0)
                                                rotateentity(local1\Field19\Field9[$00]\Field1, 80.0, entityyaw(local1\Field19\Field9[$00]\Field1, $00, 1.0), 0.0, $00)
                                                Exit
                                            EndIf
                                        Next
                                    EndIf
                                    fog\Field13 = 8.0
                                    If (local0\Field0 <> $00) Then
                                        freesound_strict(local0\Field0)
                                        local0\Field0 = $00
                                    EndIf
                                    If (local0\Field30 <> $00) Then
                                        freesound_strict(local0\Field30)
                                        local0\Field30 = $00
                                    EndIf
                                    local0\Field4 = 0.0
                                    local0\Field1 = 0.0
                                    Exit
                                EndIf
                            Next
                            If (local19 = $00) Then
                                positionentity(XZ0260X8X2\Field74, entityx(local0\Field19\Field15, $00, 1.0), 0.6, entityz(local0\Field19\Field15, $00, 1.0), $00)
                                resetentity(XZ0260X8X2\Field74)
                            EndIf
                            local0\Field7 = 0.0
                        Case $18,$19,$1A,$1B,$27
                            positionentity(XZ0260X8X2\Field74, entityx(local0\Field19\Field27[$0C], $01, 1.0), 0.6, entityz(local0\Field19\Field27[$0C], $01, 1.0), $00)
                            resetentity(XZ0260X8X2\Field74)
                            local0\Field1 = 15.0
                            local0\Field7 = 6.0
                        Case $1C,$1D,$1E
                            playsound_strict(snd_i\Field58[$03], $01, $00)
                            positionentity(XZ0260X8X2\Field74, entityx(local0\Field19\Field27[$08], $01, 1.0), (local0\Field19\Field3 + 8.9375), entityz(local0\Field19\Field27[$08], $01, 1.0), $00)
                            resetentity(XZ0260X8X2\Field74)
                            local0\Field1 = 0.0
                            local0\Field7 = 5.0
                        Case $28
                            playsound_strict(snd_i\Field58[$03], $01, $00)
                            local11 = rand($15, $18)
                            positionentity(XZ0260X8X2\Field74, entityx(local0\Field19\Field27[local11], $01, 1.0), entityy(local0\Field19\Field27[local11], $01, 1.0), entityz(local0\Field19\Field27[local11], $01, 1.0), $00)
                            resetentity(XZ0260X8X2\Field74)
                            If (n_i\Field2 <> Null) Then
                                n_i\Field2\Field32 = (n_i\Field2\Field32 / 2.8)
                                n_i\Field2\Field31 = 0.0
                                n_i\Field2\Field66 = 3.0
                                n_i\Field2\Field65 = 100000.0
                                positionentity(n_i\Field2\Field82, entityx(local0\Field19\Field27[$19], $01, 1.0), entityy(local0\Field19\Field27[$19], $01, 1.0), entityz(local0\Field19\Field27[$19], $01, 1.0), $00)
                                resetentity(n_i\Field2\Field82)
                            EndIf
                            local0\Field1 = 0.0
                            local0\Field7 = 7.0
                        Case $29
                            local19 = $00
                            For local2 = Each rooms
                                If (local2\Field22\Field21 = $02) Then
                                    local19 = $01
                                    giveachievement("pocketdimension", $01)
                                    isblackout = previsblackout
                                    previsblackout = $01
                                    XZ0260X8X2\Field53 = -10.0
                                    XZ0260X8X2\Field64 = 1500.0
                                    If (XZ0260X8X2\Field38 = $02) Then
                                        local0\Field2 = playsound_strict(loadtempsound("SFX\Room\PocketDimension\Exit.ogg"), $00, $00)
                                        makemeunplayable($01)
                                    EndIf
                                    If (ChannelPlaying(local0\Field2) = $00) Then
                                        teleportentity(XZ0260X8X2\Field74, entityx(local2\Field35, $01, 1.0), 0.5, entityz(local2\Field35, $01, 1.0), 0.3, $01, 2.0, $00)
                                        teleporttoroom(local2)
                                        If (n_i\Field2 <> Null) Then
                                            n_i\Field2\Field31 = 0.0
                                            n_i\Field2\Field66 = 0.0
                                            n_i\Field2\Field65 = 15000.0
                                        EndIf
                                        For local1 = Each events
                                            If (local1\Field32 = $02) Then
                                                removeevent(local1)
                                                Exit
                                            EndIf
                                        Next
                                        fog\Field13 = 8.0
                                        XZ0260X8X2\Field38 = $02
                                        If (local0\Field0 <> $00) Then
                                            freesound_strict(local0\Field0)
                                            local0\Field0 = $00
                                        EndIf
                                        If (local0\Field30 <> $00) Then
                                            freesound_strict(local0\Field30)
                                            local0\Field30 = $00
                                        EndIf
                                        local0\Field4 = 0.0
                                        local0\Field1 = 0.0
                                        local0\Field7 = 0.0
                                    EndIf
                                    Exit
                                EndIf
                            Next
                    End Select
                    resetrender()
                EndIf
            Else
                hideroomsnocoll(local0\Field19)
                local0\Field4 = 0.0
                local0\Field1 = 0.0
                local0\Field7 = 0.0
            EndIf
            Exit
        EndIf
    Next
    Return $00
End Function

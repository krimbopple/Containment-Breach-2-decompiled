Function updategame%()
    Local local0.events
    Local local1.events
    Local local2%
    Local local3%
    Local local4$
    Local local5%
    Local local7#
    Local local9%
    seterrormsg($09, ("Room ID: " + (Str playerroom\Field22\Field21)))
    For local1 = Each events
        If (local1\Field19 = playerroom) Then
            seterrormsg($0B, ((((((((("Event ID: " + (Str local1\Field32)) + "; State: ") + (Str local1\Field4)) + ", ") + (Str local1\Field7)) + ", ") + (Str local1\Field1)) + ", ") + (Str local1\Field23)))
            Exit
        EndIf
    Next
    catcherrors("UpdateGame()")
    While (0.0 < fps\Field7)
        fps\Field7 = (fps\Field7 - 1.147541)
        If (0.0 >= fps\Field7) Then
            captureworld()
        EndIf
        If (((menuopen Lor consoleopen) And (X4BX024DX0() = $00)) <> 0) Then
            fps\Field3[$00] = 0.0
        EndIf
        updatemouseinput()
        TXD6FFF8D()
        C04ZB8XD()
        handentity = $00
        If (((XZ0260X8X2\Field29 = $00) And (XZ0260X8X2\Field3 = $00)) <> 0) Then
            grabbedentity = $00
        EndIf
        If (shoulddeletegadgets <> 0) Then
            deletemenugadgets()
        EndIf
        shoulddeletegadgets = $00
        ZFF8X2F22 = $00
        If (((((menuopen Lor consoleopen) Lor (0.0 > XZ0260X8X2\Field2)) = $00) Lor ((X4BX024DX0() <> $00) And (0.0 <= XZ0260X8X2\Field2))) <> 0) Then
            updatemusic()
            If (opt\Field73 <> 0) Then
                autoreleasesounds()
            EndIf
            updatestreamsounds()
            T208Z6XX884 = ((selecteddifficulty\Field7 = difficulties[$03]\Field7) Lor (opt\Field68 = $00))
            For local3 = $00 To $03 Step $01
                drawarrowicon[local3] = $00
            Next
            XZ0260X8X2\Field69 = $01
            shouldentitiesfall = $01
            If ((((playerroom\Field22\Field21 <> $6F) And (playerroom\Field22\Field21 <> $70)) And (isplayeroutsidefacility() = $00)) <> 0) Then
                If (rand($5DC, $01) = $01) Then
                    local5 = ChannelPlaying(ambientsfxchn)
                    For local3 = $00 To $05 Step $01
                        If (XB4XFDZ8DD(local3, currambientsfx) <> $00) Then
                            If (local5 = $00) Then
                                freesound_strict(XB4XFDZ8DD(local3, currambientsfx))
                                XB4XFDZ8DD(local3, currambientsfx) = $00
                            EndIf
                        EndIf
                    Next
                    positionentity(soundemitter, (entityx(camera, $00, 1.0) + rnd(-1.0, 1.0)), 0.0, (entityz(camera, $00, 1.0) + rnd(-1.0, 1.0)), $00)
                    If (rand($03, $01) = $01) Then
                        XZ0260X8X2\Field10 = $03
                    EndIf
                    If (playerroom\Field22\Field21 = $04) Then
                        XZ0260X8X2\Field10 = $04
                    ElseIf (((forest_event <> Null) And (forest_event\Field19 = playerroom)) <> 0) Then
                        If (20.0 < entityy(XZ0260X8X2\Field74, $00, 1.0)) Then
                            XZ0260X8X2\Field10 = $05
                            positionentity(soundemitter, entityx(soundemitter, $00, 1.0), 30.0, entityz(soundemitter, $00, 1.0), $00)
                        EndIf
                    EndIf
                    currambientsfx = rand($00, (ambientsfxamount[XZ0260X8X2\Field10] - $01))
                    Select XZ0260X8X2\Field10
                        Case $00,$01,$02
                            If (XB4XFDZ8DD(XZ0260X8X2\Field10, currambientsfx) = $00) Then
                                XB4XFDZ8DD(XZ0260X8X2\Field10, currambientsfx) = loadsound_strict((((("SFX\Ambient\Zone" + (Str (XZ0260X8X2\Field10 + $01))) + "\Ambient") + (Str currambientsfx)) + ".ogg"))
                            EndIf
                        Case $03
                            If (XB4XFDZ8DD(XZ0260X8X2\Field10, currambientsfx) = $00) Then
                                XB4XFDZ8DD(XZ0260X8X2\Field10, currambientsfx) = loadsound_strict((("SFX\Ambient\General\Ambient" + (Str currambientsfx)) + ".ogg"))
                            EndIf
                        Case $04
                            If (XB4XFDZ8DD(XZ0260X8X2\Field10, currambientsfx) = $00) Then
                                XB4XFDZ8DD(XZ0260X8X2\Field10, currambientsfx) = loadsound_strict((("SFX\Ambient\Pre-breach\Ambient" + (Str currambientsfx)) + ".ogg"))
                            EndIf
                        Case $05
                            If (XB4XFDZ8DD(XZ0260X8X2\Field10, currambientsfx) = $00) Then
                                XB4XFDZ8DD(XZ0260X8X2\Field10, currambientsfx) = loadsound_strict((("SFX\Ambient\Forest\Ambient" + (Str currambientsfx)) + ".ogg"))
                            EndIf
                    End Select
                    ambientsfxchn = playsoundex(XB4XFDZ8DD(XZ0260X8X2\Field10, currambientsfx), camera, soundemitter, 10.0, 1.0, $00, $00)
                EndIf
                updatesoundorigin(ambientsfxchn, camera, soundemitter, 10.0, 1.0, $00, $01, $00)
                If (playerinreachableroom($01, $00, $01) <> 0) Then
                    shouldplay = (Int min((Float XZ0260X8X2\Field10), 2.0))
                    If (rand($C350, $01) = $03) Then
                        For local0 = Each events
                            If (local0\Field32 = $16) Then
                                XZ0260X8X2\Field8 = max(rnd(1.0, 2.0), XZ0260X8X2\Field8)
                                local3 = rand($03, $07)
                                playsound_strict(loadtempsound((("SFX\SCP\079\Broadcast" + (Str local3)) + ".ogg")), (local3 > $02), $00)
                                Exit
                            EndIf
                        Next
                    EndIf
                EndIf
            EndIf
            XZ0260X8X2\Field68 = curvevalue(0.0, XZ0260X8X2\Field68, 50.0)
            infacility = isinfacility(entityy(XZ0260X8X2\Field74, $00, 1.0))
            If (isplayeroutsidefacility() = $00) Then
                hidedistance = 17.0
            EndIf
            If (X4BX024DX0() <> $00) Then
                AZX8Z8FF()
                TFDZ0Z0X68()
                TX404FXZ82($00)
            EndIf
            updatedeaf()
            updatedecals()
            updatesavestate()
            updatemouselook()
            updatemoving()
            If (X4BX024DX0() <> $00) Then
                TD2XZB8488()
            EndIf
            TX2XZFZ2XDD(1.0)
            updatevomit()
            updateescapetimer()
            T2X8DBD046()
            T808422X82()
            decalstep = $00
            updatedevilparticlestimer = min(1.0, (fps\Field3[$00] + updatedevilparticlestimer))
            If (1.0 = updatedevilparticlestimer) Then
                updateparticles_devil()
                updatedevilparticlestimer = 0.0
            EndIf
            If (playerroom\Field22\Field21 = $70) Then
                If (((quickloadpercent > $00) And (quickloadpercent < $64)) <> 0) Then
                    shouldentitiesfall = $00
                EndIf
                If (((quickloadpercent = $FFFFFFFF) Lor (quickloadpercent = $64)) <> 0) Then
                    updatedimension1499()
                EndIf
                updateleave1499()
            ElseIf (playerroom\Field22\Field21 = $6F) Then
                updatesoundemitters()
                updatelightvolume()
                updatelights()
                If (((quickloadpercent = $FFFFFFFF) Lor (quickloadpercent = $64)) <> 0) Then
                    updatedimension106()
                EndIf
            Else
                updatelightvolume()
                updatelights()
                D2F82FZF6()
                updatesecuritycams()
                updatescreens()
                updatesoundemitters()
            EndIf
            updatedoors()
            If (X4BX024DX0() = $00) Then
                If (playerroom\Field22\Field21 = $04) Then
                    updateintro()
                ElseIf (isplayeroutsidefacility() <> 0) Then
                    If (((quickloadpercent = $FFFFFFFF) Lor (quickloadpercent = $64)) <> 0) Then
                        updateendings()
                    EndIf
                Else
                    If (((playerroom\Field22\Field21 <> $70) And (playerroom\Field22\Field21 <> $6F)) <> 0) Then
                        updaterooms()
                    EndIf
                    If (((playerroom\Field22\Field21 <> $70) And ((quickloadpercent = $FFFFFFFF) Lor (quickloadpercent = $64))) <> 0) Then
                        updateevents()
                    EndIf
                EndIf
            Else
                If (((playerroom\Field22\Field21 <> $70) And (playerroom\Field22\Field21 <> $6F)) <> 0) Then
                    updaterooms()
                Else
                    T2026X80F28()
                EndIf
                T20ZDZX8BZB()
            EndIf
            timecheckpointmonitors()
            updatemonitorsaving()
            updatezonecolor()
            updatemtf()
            updatenpcs()
            updateitems()
            updateparticles()
            update268()
            update427()
            update1025()
            refillcup()
            XZ0260X8X2\Field55 = min(curvevalue(0.0, XZ0260X8X2\Field55, 20.0), 0.95)
            If (0.0 < XZ0260X8X2\Field64) Then
                XZ0260X8X2\Field55 = clamp((XZ0260X8X2\Field64 / 1000.0), XZ0260X8X2\Field55, 0.95)
                XZ0260X8X2\Field64 = max((XZ0260X8X2\Field64 - fps\Field3[$00]), 0.0)
            EndIf
            local7 = 0.0
            If (0.0 > XZ0260X8X2\Field42) Then
                If (XZ0260X8X2\Field69 <> 0) Then
                    XZ0260X8X2\Field42 = min((XZ0260X8X2\Field42 + fps\Field3[$00]), 0.0)
                EndIf
                If (-200.0 > XZ0260X8X2\Field42) Then
                    local7 = clamp((((- XZ0260X8X2\Field42) - 200.0) / 700.0), local7, 0.6)
                    If (0.0 = XZ0260X8X2\Field48) Then
                        XZ0260X8X2\Field87 = min(((Abs (XZ0260X8X2\Field42 + 20.0)) / 500.0), 1.0)
                        XZ0260X8X2\Field62 = max((((Abs (XZ0260X8X2\Field42 + 200.0)) / 6.0) + 70.0), XZ0260X8X2\Field62)
                    EndIf
                EndIf
            EndIf
            If (0.0 > XZ0260X8X2\Field53) Then
                If (100.0 < XZ0260X8X2\Field7) Then
                    XZ0260X8X2\Field53 = -10.0
                EndIf
                If (-5.0 < XZ0260X8X2\Field53) Then
                    local7 = max(local7, sin((Abs (XZ0260X8X2\Field53 * 18.0))))
                ElseIf (-15.0 < XZ0260X8X2\Field53) Then
                    local7 = 1.0
                Else
                    local7 = max(local7, (Abs sin((XZ0260X8X2\Field53 * 18.0))))
                EndIf
                If (-20.0 >= XZ0260X8X2\Field53) Then
                    XZ0260X8X2\Field71 = 35.0
                    Select selecteddifficulty\Field8
                        Case $00
                            XZ0260X8X2\Field12 = rnd(770.0, 910.0)
                        Case $01
                            XZ0260X8X2\Field12 = rnd(630.0, 770.0)
                        Case $02
                            XZ0260X8X2\Field12 = rnd(490.0, 630.0)
                        Case $03
                            XZ0260X8X2\Field12 = rnd(350.0, 490.0)
                    End Select
                    XZ0260X8X2\Field53 = XZ0260X8X2\Field12
                    If (((playerroom\Field22\Field21 = $20) And (infacility = $FFFFFFFF)) = $00) Then
                        XZ0260X8X2\Field64 = max((XZ0260X8X2\Field64 - rnd(50.0, 150.0)), 0.0)
                    EndIf
                EndIf
                XZ0260X8X2\Field53 = (XZ0260X8X2\Field53 - fps\Field3[$00])
            Else
                XZ0260X8X2\Field53 = (XZ0260X8X2\Field53 - ((fps\Field3[$00] * ((i_966\Field1 * 0.5) + 1.0)) * XZ0260X8X2\Field7))
                If (0.0 < XZ0260X8X2\Field70) Then
                    If (((T8660BZ460\Field8 = $00) And (T8660BZ460\Field11 = $00)) <> 0) Then
                        XZ0260X8X2\Field53 = (XZ0260X8X2\Field53 - (min(((XZ0260X8X2\Field70 / 70.0) + 1.0), 5.0) * fps\Field3[$00]))
                    EndIf
                EndIf
            EndIf
            XZ0260X8X2\Field71 = max((XZ0260X8X2\Field71 - fps\Field3[$00]), 0.0)
            XZ0260X8X2\Field70 = max(0.0, (XZ0260X8X2\Field70 - fps\Field3[$00]))
            If (0.0 < XZ0260X8X2\Field30) Then
                XZ0260X8X2\Field30 = max(0.0, (XZ0260X8X2\Field30 - (fps\Field3[$00] / 70.0)))
            Else
                XZ0260X8X2\Field7 = 1.0
            EndIf
            XZ0260X8X2\Field8 = max((XZ0260X8X2\Field8 - (fps\Field3[$00] / 35.0)), 0.0)
            If ((isblackout Lor (0.0 < XZ0260X8X2\Field8)) <> 0) Then
                secondarylighton = curvevalue(0.0, (secondarylighton * lightvolume), 4.0)
            Else
                secondarylighton = curvevalue((fog\Field1 * 1.0), (secondarylighton * lightvolume), 4.0)
            EndIf
            If (i_294\Field4 <> 0) Then
                local7 = 1.0
            EndIf
            If ((Int XZ0260X8X2\Field48) <> 0) Then
                XZ0260X8X2\Field58 = curvevalue(0.0, XZ0260X8X2\Field58, 6.0)
                resetselectedstuff()
                XZ0260X8X2\Field64 = (XZ0260X8X2\Field86 * 5.0)
                If (XZ0260X8X2\Field40 <> $FFFFFFFF) Then
                    menuopen = $01
                    XZ0260X8X2\Field2 = ((- XZ0260X8X2\Field48) * 0.1)
                Else
                    XZ0260X8X2\Field86 = (XZ0260X8X2\Field86 + fps\Field3[$00])
                    If (((400.0 <= XZ0260X8X2\Field86) And ((FD020X0BZ\Field5 = $00) Lor (X4BX024DX0() = $00))) <> 0) Then
                        menuopen = $01
                    EndIf
                EndIf
                local7 = min((XZ0260X8X2\Field86 / 300.0), 1.0)
            Else
                XZ0260X8X2\Field77 = $00
                If (((((XZ0260X8X2\Field38 = $02) And (TX6X48DXXDX = $00)) And (menuopen = $00)) And (consoleopen = $00)) <> 0) Then
                    If ((keyhit(key\Field8) And (-10.0 <= XZ0260X8X2\Field53)) <> 0) Then
                        XZ0260X8X2\Field53 = 0.0
                        XZ0260X8X2\Field71 = 35.0
                        XZ0260X8X2\Field77 = $01
                    EndIf
                    If ((keydown(key\Field8) And (-10.0 > XZ0260X8X2\Field53)) <> 0) Then
                        XZ0260X8X2\Field53 = -10.0
                        XZ0260X8X2\Field71 = 35.0
                        XZ0260X8X2\Field77 = $01
                    EndIf
                EndIf
                XZ0260X8X2\Field86 = 0.0
            EndIf
            If (0.0 < XZ0260X8X2\Field43) Then
                XZ0260X8X2\Field53 = XZ0260X8X2\Field12
                XZ0260X8X2\Field43 = max((XZ0260X8X2\Field43 - fps\Field3[$00]), 0.0)
                If (3000.0 > XZ0260X8X2\Field43) Then
                    local7 = clamp(local7, ((3000.0 - XZ0260X8X2\Field43) / 2500.0), 1.0)
                EndIf
                If (4200.0 > XZ0260X8X2\Field43) Then
                    XZ0260X8X2\Field64 = max(XZ0260X8X2\Field64, ((4200.0 - XZ0260X8X2\Field43) / 2.0))
                    If (4200.0 <= (XZ0260X8X2\Field43 + fps\Field3[$00])) Then
                        createmsg(getlocalstring("msg", "eyedrop.tear"), 6.0)
                    EndIf
                EndIf
            EndIf
            If (chs\Field6 <> 0) Then
                XZ0260X8X2\Field56 = 100.0
            EndIf
            If (chs\Field2 <> 0) Then
                XZ0260X8X2\Field53 = XZ0260X8X2\Field12
            EndIf
            If (0.0 > XZ0260X8X2\Field52) Then
                resetselectedstuff()
                XZ0260X8X2\Field64 = (Abs (XZ0260X8X2\Field52 * 10.0))
                XZ0260X8X2\Field52 = (XZ0260X8X2\Field52 - fps\Field3[$00])
                local7 = max(local7, min((Abs (XZ0260X8X2\Field52 / 400.0)), 1.0))
            EndIf
            If (0.0 < XZ0260X8X2\Field78) Then
                If (entityhidden(X2Z260BF0Z\Field1[$06]) <> 0) Then
                    showentity(X2Z260BF0Z\Field1[$06])
                EndIf
                entityalpha(X2Z260BF0Z\Field1[$06], clamp((XZ0260X8X2\Field78 + rnd(-0.2, 0.2)), 0.0, 1.0))
                XZ0260X8X2\Field78 = max((XZ0260X8X2\Field78 - (fps\Field3[$00] / 70.0)), 0.0)
            ElseIf (entityhidden(X2Z260BF0Z\Field1[$06]) = $00) Then
                hideentity(X2Z260BF0Z\Field1[$06])
            EndIf
            If ((((selecteditem = Null) Lor invopen) Lor (otheropen <> Null)) = $00) Then
                If (isiteminfocus() <> 0) Then
                    local7 = max(local7, 0.5)
                EndIf
            EndIf
            If (((selectedscreen <> Null) Lor (d_i\Field3 <> Null)) <> 0) Then
                local7 = max(local7, 0.5)
            EndIf
            If (0.0 <> local7) Then
                If (entityhidden(X2Z260BF0Z\Field1[$05]) <> 0) Then
                    showentity(X2Z260BF0Z\Field1[$05])
                EndIf
                entityalpha(X2Z260BF0Z\Field1[$05], local7)
            ElseIf (entityhidden(X2Z260BF0Z\Field1[$05]) = $00) Then
                hideentity(X2Z260BF0Z\Field1[$05])
            EndIf
            updatenvg()
            updategui()
        EndIf
        If (0.0 = fps\Field3[$00]) Then
            updateworld(0.0, 0.0)
        Else
            updateworld(1.0, (1.0 / 105.0))
            manipulatenpcbones()
        EndIf
        If ((((((0.0 <= XZ0260X8X2\Field2) And (XZ0260X8X2\Field40 = $FFFFFFFF)) And ((400.0 >= XZ0260X8X2\Field86) Lor ((FD020X0BZ\Field5 Lor (X4BX024DX0() = $00)) And (0.0 >= FD020X0BZ\Field2)))) And (TX6X48DXXDX = $00)) And keyhit($01)) <> 0) Then
            If (menuopen <> 0) Then
                If (X4BX024DX0() = $00) Then
                    resumesounds()
                EndIf
                If (igm\Field0 <> $00) Then
                    saveoptionsini($00)
                EndIf
                stopmousemovement()
                shoulddeletegadgets = $01
                flushkeys()
            ElseIf (X4BX024DX0() = $00) Then
                pausesounds()
            EndIf
            menuopen = (menuopen = $00)
            igm\Field2 = $00
            igm\Field0 = $00
            igm\Field1 = $00
        EndIf
        If (((menuopen = $00) And (TX6X48DXXDX = $00)) <> 0) Then
            If (keyhit(key\Field13) <> 0) Then
                local9 = $01
                If (skull_event <> Null) Then
                    Select skull_event\Field4
                        Case 2.0,4.0,5.0,6.0
                            local9 = $00
                    End Select
                EndIf
                If (((((((((((d_i\Field3 = Null) And (selectedscreen = Null)) And (i_294\Field4 = $00)) And (XZ0260X8X2\Field38 = $02)) And (XZ0260X8X2\Field23 = $00)) And (0.0 <= XZ0260X8X2\Field82)) And (0.0 <= XZ0260X8X2\Field52)) And (0.0 = XZ0260X8X2\Field48)) And (XZ0260X8X2\Field40 = $FFFFFFFF)) And local9) <> 0) Then
                    If (invopen <> 0) Then
                        shoulddeletegadgets = $01
                        stopmousemovement()
                    Else
                        TDD0Z6BXB6\Field15 = $FFFFFFFF
                    EndIf
                    invopen = (invopen = $00)
                    If (otheropen = Null) Then
                        selecteditem = Null
                    ElseIf (selecteditem <> Null) Then
                        playsound_strict(snd_i\Field46[selecteditem\Field6\Field5], $00, $00)
                    EndIf
                    otheropen = Null
                EndIf
            EndIf
            If (keyhit(key\Field15) <> 0) Then
                If (selecteddifficulty\Field1 < $02) Then
                    Select cansave
                        Case $00
                            If (X4BX024DX0() <> $00) Then
                                createhintmsg(getlocalstring("save", "failed.now.mp"), 6.0, $00)
                            Else
                                createhintmsg(getlocalstring("save", "failed.now"), 6.0, $00)
                            EndIf
                        Case $01
                            If (X4BX024DX0() <> $00) Then
                                createhintmsg(getlocalstring("save", "failed.location.mp"), 6.0, $00)
                            Else
                                createhintmsg(getlocalstring("save", "failed.location"), 6.0, $00)
                                If (quickloadpercent > $FFFFFFFF) Then
                                    createhintmsg((msg\Field1 + getlocalstring("save", "failed.loading")), 6.0, $00)
                                EndIf
                            EndIf
                        Case $02
                            createhintmsg(getlocalstring("save", "failed.096"), 6.0, $00)
                        Case $03
                            If (selecteddifficulty\Field1 = $01) Then
                                If (((selectedscreen = Null) And (sc_i\Field1 = Null)) <> 0) Then
                                    If (X4BX024DX0() <> $00) Then
                                        createhintmsg(getlocalstring("save", "failed.screen.mp"), 6.0, $00)
                                    Else
                                        createhintmsg(getlocalstring("save", "failed.screen"), 6.0, $00)
                                    EndIf
                                ElseIf (X4BX024DX0() <> $00) Then
                                    If (0.0 = XZ0260X8X2\Field48) Then
                                        playsound_strict(loadtempsound("SFX\General\Save1.ogg"), $00, $00)
                                        createhintmsg(getlocalstring("save", "saved.mp"), 6.0, $00)
                                        FD020X0BZ\Field6 = entityx(XZ0260X8X2\Field74, $00, 1.0)
                                        FD020X0BZ\Field7 = entityy(XZ0260X8X2\Field74, $00, 1.0)
                                        FD020X0BZ\Field0 = entityz(XZ0260X8X2\Field74, $00, 1.0)
                                        FD020X0BZ\Field10 = playerroom
                                    EndIf
                                Else
                                    savegame(currsave\Field2)
                                EndIf
                            ElseIf (((350.0 >= autosave\Field0) And (X4BX024DX0() = $00)) <> 0) Then
                                cancelautosave()
                            ElseIf (X4BX024DX0() <> $00) Then
                                If (0.0 = XZ0260X8X2\Field48) Then
                                    playsound_strict(loadtempsound("SFX\General\Save0.ogg"), $00, $00)
                                    createhintmsg(getlocalstring("save", "saved.mp"), 6.0, $00)
                                    FD020X0BZ\Field6 = entityx(XZ0260X8X2\Field74, $00, 1.0)
                                    FD020X0BZ\Field7 = entityy(XZ0260X8X2\Field74, $00, 1.0)
                                    FD020X0BZ\Field0 = entityz(XZ0260X8X2\Field74, $00, 1.0)
                                    FD020X0BZ\Field10 = playerroom
                                EndIf
                            Else
                                savegame(currsave\Field2)
                            EndIf
                    End Select
                ElseIf (X4BX024DX0() <> $00) Then
                    createhintmsg(getlocalstring("save", "disable.mp"), 6.0, $00)
                Else
                    createhintmsg(getlocalstring("save", "disable"), 6.0, $00)
                EndIf
            ElseIf (((selecteddifficulty\Field1 = $01) And ((selectedscreen <> Null) Lor (sc_i\Field1 <> Null))) <> 0) Then
                If (((msg\Field1 = "") Lor (0.0 >= msg\Field3)) <> 0) Then
                    createhintmsg(format(getlocalstring("save", "save"), key\Field0[key\Field15], "%s"), 6.0, $01)
                EndIf
                If (TDD0Z6BXB6\Field12 <> 0) Then
                    sc_i\Field1 = Null
                EndIf
            EndIf
        EndIf
        updateautosave()
        If ((((keyhit(key\Field11) And opt\Field28) And ((T8X2046020\Field4 Lor TXB2BFFFFFX()) Lor $00)) And (TX6X48DXXDX = $00)) <> 0) Then
            If (consoleopen <> 0) Then
                resumesounds()
                stopmousemovement()
                shoulddeletegadgets = $01
            ElseIf (X4BX024DX0() = $00) Then
                pausesounds()
            EndIf
            consoleopen = (consoleopen = $00)
            flushkeys()
        EndIf
        updatemessages()
        updatehintmessages()
        updateconsole()
        updatequickloading()
        updateachievementmsg()
        X0B08FD2BX()
        If (X4BX024DX0() <> $00) Then
            Y086DZB0X0()
            TXZ24F2ZFZ6()
            X060Z64X28()
            TXB6DB0X2F0()
            X0200DFZ4($0A)
            TXFDB00F6Z()
            TXX66DXBZ64()
            T446DBF2FZ()
        EndIf
        If (0.0 > XZ0260X8X2\Field2) Then
            updatesubtitles()
            If (XZ0260X8X2\Field40 <> $FFFFFFFF) Then
                updateending()
            EndIf
        ElseIf (XZ0260X8X2\Field40 = $FFFFFFFF) Then
            updatemenu()
            If (mainmenuopen = $00) Then
                updatesubtitles()
            EndIf
        Else
            updatesubtitles()
        EndIf
    Wend
    If (mainmenuopen <> 0) Then
        Return $00
    EndIf
    rendergame()
    catcherrors("Uncaught: UpdateGame()")
    Return $00
End Function

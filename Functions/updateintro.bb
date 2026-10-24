Function updateintro%()
    Local local0.events
    Local local1.rooms
    Local local2.doors
    Local local3.props
    Local local4.securitycams
    Local local5.lights
    Local local6.soundemitters
    Local local7.waypoints
    Local local8%
    Local local9%
    Local local10#
    Local local11#
    Local local12#
    Local local13#
    Local local14#
    Local local15#
    Local local16%
    Local local17%
    Local local18$
    Local local22.npcs
    Local local23.screens
    local18 = ""
    For local0 = Each events
        If (local0\Field32 = $04) Then
            If (playerroom = local0\Field19) Then
                lightrenderdistance = 64.0
                If (0.0 = local0\Field4) Then
                    For local8 = $00 To $01 Step $01
                        snd_i\Field2[local8] = loadsound_strict((("SFX\Room\Intro\Ew" + (Str local8)) + ".ogg"))
                    Next
                    snd_i\Field2[$02] = loadsound_strict("SFX\Room\Intro\Horror.ogg")
                    snd_i\Field2[$03] = loadsound_strict("SFX\Room\Intro\See173.ogg")
                    For local8 = $00 To $02 Step $01
                        snd_i\Field2[(local8 + $04)] = loadsound_strict((("SFX\Room\Intro\Bang" + (Str local8)) + ".ogg"))
                    Next
                    hidedistance = 60.0
                    n_i\Field3\Field84 = 90.0
                    n_i\Field3\Field31 = 1.0
                    positionentity(n_i\Field3\Field82, entityx(local0\Field19\Field27[$02], $01, 1.0), entityy(local0\Field19\Field27[$02], $01, 1.0), entityz(local0\Field19\Field27[$02], $01, 1.0), $00)
                    rotateentity(n_i\Field3\Field82, 0.0, 0.0, 0.0, $01)
                    resetentity(n_i\Field3\Field82)
                    hideentity(n_i\Field3\Field98)
                    hideentity(n_i\Field3\Field101)
                    tformpoint(328.0, 480.0, 1072.0, local0\Field19\Field15, $00)
                    local0\Field19\Field32[$00] = createnpc($17, tformedx(), tformedy(), tformedz())
                    local0\Field19\Field32[$00]\Field84 = 180.0
                    hideentity(local0\Field19\Field32[$00]\Field98)
                    tformpoint(208.0, 200.0, 480.0, local0\Field19\Field15, $00)
                    local12 = tformedy()
                    local0\Field19\Field32[$01] = createnpc($16, tformedx(), local12, tformedz())
                    local0\Field19\Field32[$01]\Field57 = 3.0
                    pointentity(local0\Field19\Field32[$01]\Field82, local0\Field19\Field27[$02], 0.0)
                    hideentity(local0\Field19\Field32[$01]\Field98)
                    tformpoint(160.0, 0.0, 320.0, local0\Field19\Field15, $00)
                    local0\Field19\Field32[$02] = createnpc($16, tformedx(), local12, tformedz())
                    local0\Field19\Field32[$02]\Field57 = 5.0
                    pointentity(local0\Field19\Field32[$02]\Field82, local0\Field19\Field27[$02], 0.0)
                    changenpctextureid(local0\Field19\Field32[$02], $07)
                    hideentity(local0\Field19\Field32[$02]\Field98)
                    tformpoint(-4205.0, 0.0, 870.0, local0\Field19\Field15, $00)
                    local0\Field19\Field32[$03] = createnpc($17, tformedx(), local12, tformedz())
                    local0\Field19\Field32[$03]\Field66 = 7.0
                    local9 = rand($00, $04)
                    local0\Field19\Field32[$03]\Field67 = loadsound_strict((("SFX\Room\Intro\Guard\Conversation" + (Str local9)) + "a.ogg"))
                    rotateentity(local0\Field19\Field32[$03]\Field82, 0.0, ((Float local0\Field19\Field21) + 180.0), 0.0, $00)
                    hideentity(local0\Field19\Field32[$03]\Field98)
                    tformpoint(-3985.0, 0.0, 786.0, local0\Field19\Field15, $00)
                    local0\Field19\Field32[$04] = createnpc($17, tformedx(), local12, tformedz())
                    local0\Field19\Field32[$04]\Field66 = 7.0
                    local0\Field19\Field32[$04]\Field67 = loadsound_strict((("SFX\Room\Intro\Guard\Conversation" + (Str local9)) + "b.ogg"))
                    rotateentity(local0\Field19\Field32[$04]\Field82, 0.0, ((Float local0\Field19\Field21) + 135.0), 0.0, $00)
                    hideentity(local0\Field19\Field32[$04]\Field98)
                    tformpoint(-8064.0, 0.0, 1096.0, local0\Field19\Field15, $00)
                    local0\Field19\Field32[$05] = createnpc($17, tformedx(), local12, tformedz())
                    local0\Field19\Field32[$05]\Field66 = 7.0
                    local0\Field19\Field32[$05]\Field67 = loadsound_strict((("SFX\Room\Intro\Guard\Music" + (Str rand($00, $04))) + ".ogg"))
                    rotateentity(local0\Field19\Field32[$05]\Field82, 0.0, ((Float local0\Field19\Field21) + 180.0), 0.0, $01)
                    hideentity(local0\Field19\Field32[$05]\Field98)
                    tformpoint(-3424.0, -100.0, -2208.0, local0\Field19\Field15, $00)
                    local0\Field19\Field32[$06] = createnpc($16, tformedx(), tformedy(), tformedz())
                    changenpctextureid(local0\Field19\Field32[$06], $05)
                    hideentity(local0\Field19\Field32[$06]\Field98)
                    tformpoint(-3073.0, -315.0, -2165.0, local0\Field19\Field15, $00)
                    local0\Field19\Field32[$07] = createnpc($16, tformedx(), tformedy(), tformedz())
                    local0\Field19\Field32[$07]\Field66 = -1.0
                    local0\Field19\Field32[$07]\Field55 = loadsound_strict("SFX\Room\Intro\Scientist\Conversation.ogg")
                    setnpcframe(local0\Field19\Field32[$07], 182.0, $01)
                    changenpctextureid(local0\Field19\Field32[$07], $02)
                    hideentity(local0\Field19\Field32[$07]\Field98)
                    tformpoint(-3800.0, 250.0, -4088.0, local0\Field19\Field15, $00)
                    local12 = tformedy()
                    local13 = tformedz()
                    local0\Field19\Field32[$08] = createnpc($17, tformedx(), local12, local13)
                    local0\Field19\Field32[$08]\Field66 = 7.0
                    hideentity(local0\Field19\Field32[$08]\Field98)
                    tformpoint(-4200.0, 0.0, 0.0, local0\Field19\Field15, $00)
                    local0\Field19\Field32[$09] = createnpc($17, tformedx(), local12, local13)
                    local0\Field19\Field32[$09]\Field66 = 7.0
                    hideentity(local0\Field19\Field32[$09]\Field98)
                    tformpoint(-4000.0, 0.0, 0.0, local0\Field19\Field15, $00)
                    local0\Field19\Field32[$0A] = createnpc($16, tformedx(), local12, local13)
                    local0\Field19\Field32[$0A]\Field65 = 1.0
                    changenpctextureid(local0\Field19\Field32[$0A], $08)
                    hideentity(local0\Field19\Field32[$0A]\Field98)
                    tformpoint(-7208.0, -600.0, -3104.0, local0\Field19\Field15, $00)
                    local0\Field19\Field32[$0B] = createnpc($17, tformedx(), tformedy(), tformedz())
                    local0\Field19\Field32[$0B]\Field66 = 15.0
                    createnpcasset(local0\Field19\Field32[$0B])
                    hideentity(local0\Field19\Field32[$0B]\Field98)
                    hideentity(local0\Field19\Field32[$0B]\Field101)
                    tformpoint(-5675.0, -1020.0, -3717.0, local0\Field19\Field15, $00)
                    local0\Field19\Field32[$0C] = createnpc($16, tformedx(), tformedy(), tformedz())
                    local0\Field19\Field32[$0C]\Field66 = -1.0
                    rotateentity(local0\Field19\Field32[$0C]\Field82, 0.0, 154.0, 0.0, $00)
                    setnpcframe(local0\Field19\Field32[$0C], 357.0, $01)
                    changenpctextureid(local0\Field19\Field32[$0C], $09)
                    hideentity(local0\Field19\Field32[$0C]\Field98)
                    For local8 = $08 To $0B Step $01
                        If (local8 < $0B) Then
                            rotateentity(local0\Field19\Field32[local8]\Field82, 0.0, 90.0, 0.0, $00)
                        Else
                            rotateentity(local0\Field19\Field32[local8]\Field82, 0.0, -90.0, 0.0, $00)
                        EndIf
                    Next
                    tformpoint(-894.0, 500.0, 130.0, local0\Field19\Field15, $00)
                    local0\Field19\Field32[$0D] = createnpc($16, tformedx(), tformedy(), tformedz())
                    rotateentity(local0\Field19\Field32[$0D]\Field82, 0.0, ((Float local0\Field19\Field21) + 290.0), 0.0, $00)
                    changenpctextureid(local0\Field19\Field32[$0D], $04)
                    hideentity(local0\Field19\Field32[$0D]\Field98)
                    tformpoint(-3180.0, -315.0, -687.0, local0\Field19\Field15, $00)
                    local0\Field19\Field32[$0E] = createnpc($16, tformedx(), tformedy(), tformedz())
                    local0\Field19\Field32[$0E]\Field66 = -1.0
                    rotateentity(local0\Field19\Field32[$0E]\Field82, 0.0, ((Float local0\Field19\Field21) + 270.0), 0.0, $00)
                    setnpcframe(local0\Field19\Field32[$0E], 182.0, $01)
                    local17 = loadtexture_strict("GFX\NPCs\scientist(2).png", $01, $00, 1.0)
                    entitytexture(local0\Field19\Field32[$0E]\Field98, local17, $00, $00)
                    deletesingletextureentryfromcache(local17, $00)
                    hideentity(local0\Field19\Field32[$0E]\Field98)
                    tformpoint(-7875.0, 56.0, -1775.0, local0\Field19\Field15, $00)
                    local0\Field19\Field32[$0F] = createnpc($16, tformedx(), (tformedy() - 10.0), tformedz())
                    rotateentity(local0\Field19\Field32[$0F]\Field82, 0.0, (Float local0\Field19\Field21), 0.0, $00)
                    local0\Field19\Field32[$0F]\Field66 = 3.0
                    local17 = loadtexture_strict("GFX\NPCs\security(3).png", $01, $00, 1.0)
                    entitytexture(local0\Field19\Field32[$0F]\Field98, local17, $00, $00)
                    deletesingletextureentryfromcache(local17, $00)
                    hideentity(local0\Field19\Field32[$0F]\Field98)
                    hideentity(local0\Field19\Field25[$06]\Field0)
                    hideentity(local0\Field19\Field25[$06]\Field7)
                    hideentity(local0\Field19\Field25[$06]\Field51)
                    local11 = (local0\Field19\Field40 - 16.59375)
                    local12 = (local0\Field19\Field3 + 0.53125)
                    local13 = (local0\Field19\Field37 + (1.0 / 32.0))
                    positionentity(camera, local11, local12, local13, $00)
                    hideentity(XZ0260X8X2\Field74)
                    positionentity(XZ0260X8X2\Field74, local11, (local0\Field19\Field3 + 0.302), local13, $00)
                    rotateentity(camera, -70.0, 0.0, 0.0, $00)
                    playsound_strict(snd_i\Field5[rand($00, $02)], $00, $00)
                    XZ0260X8X2\Field64 = 1600.0
                    XZ0260X8X2\Field78 = 1.0
                    makemeunplayable($00)
                    createconsolemsg("", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    createconsolemsg(getlocalstring("misc", "warning2"), $FF, $00, $00, $00)
                    createconsolemsg("", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    local0\Field4 = 1.0
                Else
                    For local1 = Each rooms
                        hideroomsnocoll(local1)
                    Next
                    showroomsnocoll(local0\Field19)
                    showroomscoll(local0\Field19)
                    cansave = $01
                    If (7.0 > local0\Field4) Then
                        shouldplay = $0D
                    Else
                        shouldplay = $00
                    EndIf
                    Select local0\Field4
                        Case 1.0
                            lightrenderdistance = 25.0
                            local10 = (fps\Field3[$00] / 30.0)
                            If (3.0 > local0\Field7) Then
                                local10 = (local10 / 1.8)
                                local0\Field7 = (local0\Field7 + local10)
                            ElseIf (((9.0 < local0\Field7) And (11.0 > local0\Field7)) <> 0) Then
                                local10 = (local10 / 1.8)
                                local0\Field7 = (local0\Field7 + local10)
                            ElseIf (((15.0 > local0\Field7) Lor (50.0 <= local0\Field7)) <> 0) Then
                                local0\Field7 = min((local0\Field7 + local10), 150.0)
                            EndIf
                            If (15.0 > local0\Field7) Then
                                local11 = (local0\Field19\Field40 - 16.59375)
                                local12 = (local0\Field19\Field3 + 0.53125)
                                local13 = (local0\Field19\Field37 - 0.234375)
                                If (14.0 > local0\Field7) Then
                                    stopmousemovement()
                                    If (((1.0 > (local0\Field7 - local10)) And (1.0 <= local0\Field7)) <> 0) Then
                                        XZ0260X8X2\Field53 = -10.0
                                    ElseIf (((1.3 > (local0\Field7 - local10)) And (1.3 <= local0\Field7)) <> 0) Then
                                        XZ0260X8X2\Field53 = -10.0
                                    ElseIf (((2.8 > (local0\Field7 - local10)) And (2.8 <= local0\Field7)) <> 0) Then
                                        playsound_strict(snd_i\Field2[$00], $01, $00)
                                    ElseIf (((10.8 > (local0\Field7 - local10)) And (10.8 <= local0\Field7)) <> 0) Then
                                        playsound_strict(snd_i\Field2[$01], $01, $00)
                                    ElseIf (((13.0 > (local0\Field7 - local10)) And (13.0 <= local0\Field7)) <> 0) Then
                                        playsoundex(TXDBZF46ZXF($00, $00, $00), camera, XZ0260X8X2\Field74, 8.0, 0.5, $00, $00)
                                    EndIf
                                    local14 = clamp((local0\Field7 / 5.0), 0.0, 1.0)
                                    local14 = ((3.0 - (2.0 * local14)) * (local14 * local14))
                                    local15 = max(((local0\Field7 - 10.0) / 4.0), 0.0)
                                    local15 = ((3.0 - (2.0 * local15)) * (local15 * local15))
                                    local11 = ((((local0\Field19\Field40 - 16.13281) - local11) * local15) + local11)
                                    If (10.0 > local0\Field7) Then
                                        local12 = ((0.2 * local14) + local12)
                                    Else
                                        local12 = (((((local0\Field19\Field3 + 0.302) + 0.6) - (local12 + 0.2)) * local15) + (local12 + 0.2))
                                    EndIf
                                    local13 = ((((local0\Field19\Field37 + 0.28125) - local13) * local14) + local13)
                                    rotateentity(camera, (((70.0 * local14) + -70.0) + (sin((local0\Field7 * 12.857)) * 5.0)), (-90.0 * local15), (sin((local0\Field7 * 25.7)) * 8.0), $00)
                                    positionentity(camera, local11, local12, local13, $00)
                                    If (entityhidden(XZ0260X8X2\Field74) = $00) Then
                                        hideentity(XZ0260X8X2\Field74)
                                    EndIf
                                    positionentity(XZ0260X8X2\Field74, local11, (local0\Field19\Field3 + 0.302), local13, $00)
                                    XZ0260X8X2\Field16 = 0.0
                                Else
                                    positionentity(XZ0260X8X2\Field74, entityx(XZ0260X8X2\Field74, $00, 1.0), (local0\Field19\Field3 + 0.302), entityz(XZ0260X8X2\Field74, $00, 1.0), $00)
                                    resetentity(XZ0260X8X2\Field74)
                                    showentity(XZ0260X8X2\Field74)
                                    XZ0260X8X2\Field16 = 0.0
                                    XZ0260X8X2\Field38 = $02
                                    For local8 = $00 To $01 Step $01
                                        freesound_strict(snd_i\Field2[local8])
                                        snd_i\Field2[local8] = $00
                                    Next
                                    local0\Field7 = 15.0
                                EndIf
                                camerapitch = 0.0
                                rotateentity(XZ0260X8X2\Field74, 0.0, entityyaw(camera, $00, 1.0), 0.0, $00)
                            ElseIf (40.0 > local0\Field7) Then
                                If (TX60DB8XBBZ($00) <> Null) Then
                                    createhintmsg(format(getlocalstring("msg", "openinv"), key\Field0[key\Field13], "%s"), 6.0, $00)
                                    local0\Field7 = 40.0
                                Else
                                    createhintmsg(getlocalstring("msg", "paper"), 6.0, $00)
                                EndIf
                            ElseIf (50.0 > local0\Field7) Then
                                If (invopen <> 0) Then
                                    createhintmsg(getlocalstring("msg", "doc.click"), 6.0, $00)
                                Else
                                    createhintmsg(format(getlocalstring("msg", "openinv"), key\Field0[key\Field13], "%s"), 6.0, $00)
                                EndIf
                                If (((selecteditem <> Null) And (selecteditem\Field6\Field25 <> $00)) <> 0) Then
                                    createhintmsg(getlocalstring("msg", "doc.read"), 8.0, $00)
                                    local0\Field7 = 50.0
                                EndIf
                            Else
                                If (selecteditem <> Null) Then
                                    local0\Field7 = (local0\Field7 + (fps\Field3[$00] / 6.0))
                                EndIf
                                If (150.0 <= local0\Field7) Then
                                    local0\Field19\Field32[$03]\Field55 = loadsound_strict("SFX\Room\Intro\Guard\Ulgrin\BeforeDoorOpen.ogg")
                                    local0\Field19\Field32[$03]\Field63 = playsoundex(local0\Field19\Field32[$03]\Field55, camera, local0\Field19\Field32[$03]\Field82, 10.0, 1.0, $01, $00)
                                    createhintmsg(getlocalstring("msg", "doc.drop"), 5.0, $00)
                                    local0\Field4 = 2.0
                                EndIf
                            EndIf
                        Case 2.0
                            lightrenderdistance = 25.0
                            If (ChannelPlaying(local0\Field19\Field32[$03]\Field63) = $00) Then
                                loadnpcsound(local0\Field19\Field32[$03], "SFX\Room\Intro\Guard\Ulgrin\ExitCell.ogg", $00)
                                local0\Field19\Field32[$03]\Field63 = playsoundex(local0\Field19\Field32[$03]\Field55, camera, local0\Field19\Field32[$03]\Field82, 10.0, 1.0, $01, $00)
                                For local8 = $03 To $05 Step $01
                                    local0\Field19\Field32[local8]\Field66 = 9.0
                                    showentity(local0\Field19\Field32[local8]\Field98)
                                Next
                                openclosedoor(local0\Field19\Field25[$04], $01, $00)
                                local0\Field4 = 3.0
                            EndIf
                        Case 3.0
                            If (2.4025 < distancesquared(entityx(XZ0260X8X2\Field74, $00, 1.0), (local0\Field19\Field40 - 16.0), entityz(XZ0260X8X2\Field74, $00, 1.0), (local0\Field19\Field37 + 0.75), 0.0, 0.0)) Then
                                If (local0\Field19\Field25[$04]\Field39 <> 0) Then
                                    StopChannel(local0\Field19\Field32[$03]\Field63)
                                    local0\Field19\Field32[$03]\Field63 = $00
                                    loadnpcsound(local0\Field19\Field32[$03], (("SFX\Room\Intro\Guard\Ulgrin\Escort" + (Str rand($00, $01))) + ".ogg"), $00)
                                    local0\Field19\Field32[$03]\Field63 = playsoundex(local0\Field19\Field32[$03]\Field55, camera, local0\Field19\Field32[$03]\Field82, 10.0, 1.0, $01, $00)
                                    openclosedoor(local0\Field19\Field25[$04], $01, $00)
                                EndIf
                                If (ChannelPlaying(local0\Field19\Field32[$03]\Field63) = $00) Then
                                    freeentity(local0\Field19\Field27[$03])
                                    local0\Field19\Field27[$03] = $00
                                    For local8 = $06 To $0C Step $01
                                        showentity(local0\Field19\Field32[local8]\Field98)
                                    Next
                                    showentity(local0\Field19\Field32[$0E]\Field98)
                                    showentity(local0\Field19\Field32[$0F]\Field98)
                                    showentity(local0\Field19\Field32[$0B]\Field101)
                                    showentity(local0\Field19\Field27[$04])
                                    local0\Field4 = 4.0
                                EndIf
                            Else
                                lightrenderdistance = 25.0
                                local10 = (fps\Field3[$00] / 4.0)
                                local0\Field7 = min((local0\Field7 + local10), 630.0)
                                If (((300.0 > (local0\Field7 - local10)) And (300.0 <= local0\Field7)) <> 0) Then
                                    loadnpcsound(local0\Field19\Field32[$03], (("SFX\Room\Intro\Guard\Ulgrin\ExitCellRefuse" + (Str rand($00, $01))) + ".ogg"), $00)
                                    local0\Field19\Field32[$03]\Field63 = playsoundex(local0\Field19\Field32[$03]\Field55, camera, local0\Field19\Field32[$03]\Field82, 10.0, 1.0, $01, $00)
                                ElseIf (((500.0 > (local0\Field7 - local10)) And (500.0 <= local0\Field7)) <> 0) Then
                                    loadnpcsound(local0\Field19\Field32[$03], (("SFX\Room\Intro\Guard\Ulgrin\CellGas" + (Str rand($00, $01))) + ".ogg"), $00)
                                    local0\Field19\Field32[$03]\Field63 = playsoundex(local0\Field19\Field32[$03]\Field55, camera, local0\Field19\Field32[$03]\Field82, 10.0, 1.0, $01, $00)
                                ElseIf (630.0 <= local0\Field7) Then
                                    positionentity(XZ0260X8X2\Field74, entityx(XZ0260X8X2\Field74, $00, 1.0), entityy(XZ0260X8X2\Field74, $00, 1.0), min(entityz(XZ0260X8X2\Field74, $00, 1.0), (local0\Field19\Field37 + 1.914062)), $00)
                                    If (local0\Field19\Field25[$04]\Field39 <> 0) Then
                                        openclosedoor(local0\Field19\Field25[$04], $01, $00)
                                    EndIf
                                    If (local0\Field19\Field17[$00] = Null) Then
                                        local0\Field19\Field17[$00] = setemitter(local0\Field19, (local0\Field19\Field40 - 16.37109), (local0\Field19\Field3 + 1.457031), (local0\Field19\Field37 + (1.0 / 1.610063)), $05)
                                        local0\Field19\Field17[$00]\Field7 = $01
                                    EndIf
                                    If (local0\Field19\Field17[$01] = Null) Then
                                        local0\Field19\Field17[$01] = setemitter(local0\Field19, (local0\Field19\Field40 - 15.625), (local0\Field19\Field3 + 1.457031), (local0\Field19\Field37 + (1.0 / 1.610063)), $05)
                                        local0\Field19\Field17[$01]\Field7 = $01
                                    EndIf
                                    XZ0260X8X2\Field70 = max((XZ0260X8X2\Field70 + (fps\Field3[$00] * 4.0)), 1.0)
                                    If (rand($3E8, $01) = $01) Then
                                        kill($00, $01, $00, $01)
                                    EndIf
                                EndIf
                            EndIf
                        Case 4.0
                            XZ0260X8X2\Field76 = min((XZ0260X8X2\Field76 - (((0.008 / entitydistance(local0\Field19\Field32[$03]\Field82, XZ0260X8X2\Field74)) * XZ0260X8X2\Field76) * fps\Field3[$00])), XZ0260X8X2\Field76)
                            If (3.0 = local0\Field19\Field32[$04]\Field66) Then
                                local0\Field19\Field32[$04]\Field64 = min(((((entitydistance(local0\Field19\Field32[$04]\Field82, XZ0260X8X2\Field74) * 0.006) * local0\Field19\Field32[$04]\Field64) * fps\Field3[$00]) + local0\Field19\Field32[$04]\Field64), local0\Field19\Field32[$04]\Field32)
                            EndIf
                            local14 = distancesquared(entityx(XZ0260X8X2\Field74, $00, 1.0), entityx(local0\Field19\Field32[$03]\Field82, $00, 1.0), entityz(XZ0260X8X2\Field74, $00, 1.0), entityz(local0\Field19\Field32[$03]\Field82, $00, 1.0), 0.0, 0.0)
                            If (11.0 <> local0\Field19\Field32[$03]\Field66) Then
                                If (9.0 > local14) Then
                                    local0\Field19\Field32[$03]\Field60 = (local0\Field19\Field40 - 6.539062)
                                    local0\Field19\Field32[$03]\Field61 = (local0\Field19\Field3 + 0.3)
                                    local0\Field19\Field32[$03]\Field74 = (local0\Field19\Field37 - 3.824219)
                                    local0\Field19\Field32[$03]\Field66 = 3.0
                                ElseIf (30.25 < local14) Then
                                    If (0.0 = local0\Field19\Field32[$03]\Field65) Then
                                        For local8 = $03 To $04 Step $01
                                            StopChannel(local0\Field19\Field32[local8]\Field63)
                                            local0\Field19\Field32[local8]\Field63 = $00
                                        Next
                                        loadnpcsound(local0\Field19\Field32[$03], "SFX\Room\Intro\Guard\Ulgrin\EscortRun.ogg", $00)
                                        local0\Field19\Field32[$03]\Field63 = playsoundex(local0\Field19\Field32[$03]\Field55, camera, local0\Field19\Field32[$03]\Field82, 10.0, 1.0, $01, $00)
                                        local0\Field19\Field32[$03]\Field65 = 1.0
                                    EndIf
                                    local0\Field19\Field32[$03]\Field60 = entityx(XZ0260X8X2\Field74, $00, 1.0)
                                    local0\Field19\Field32[$03]\Field61 = entityy(XZ0260X8X2\Field74, $00, 1.0)
                                    local0\Field19\Field32[$03]\Field74 = entityz(XZ0260X8X2\Field74, $00, 1.0)
                                    local0\Field19\Field32[$03]\Field84 = 0.0
                                    local0\Field19\Field32[$03]\Field66 = 5.0
                                Else
                                    local0\Field19\Field32[$03]\Field64 = 0.0
                                    local0\Field19\Field32[$03]\Field66 = 9.0
                                EndIf
                                If (((2.25 < distancesquared(entityx(XZ0260X8X2\Field74, $00, 1.0), entityx(local0\Field19\Field32[$04]\Field82, $00, 1.0), entityz(XZ0260X8X2\Field74, $00, 1.0), entityz(local0\Field19\Field32[$04]\Field82, $00, 1.0), 0.0, 0.0)) And (local14 < distancesquared(entityx(local0\Field19\Field32[$03]\Field82, $00, 1.0), entityx(local0\Field19\Field32[$04]\Field82, $00, 1.0), entityz(local0\Field19\Field32[$03]\Field82, $00, 1.0), entityz(local0\Field19\Field32[$04]\Field82, $00, 1.0), 0.0, 0.0))) <> 0) Then
                                    local0\Field19\Field32[$04]\Field60 = (local0\Field19\Field40 + 1.09375)
                                    local0\Field19\Field32[$04]\Field61 = (local0\Field19\Field3 + 0.3)
                                    local0\Field19\Field32[$04]\Field74 = (local0\Field19\Field37 - 2.785156)
                                    local0\Field19\Field32[$04]\Field66 = 3.0
                                Else
                                    local0\Field19\Field32[$04]\Field60 = entityx(XZ0260X8X2\Field74, $00, 1.0)
                                    local0\Field19\Field32[$04]\Field61 = entityy(XZ0260X8X2\Field74, $00, 1.0)
                                    local0\Field19\Field32[$04]\Field74 = entityz(XZ0260X8X2\Field74, $00, 1.0)
                                    local0\Field19\Field32[$04]\Field84 = 0.0
                                    local0\Field19\Field32[$04]\Field66 = 5.0
                                EndIf
                            EndIf
                            local0\Field19\Field32[$05]\Field6 = loopsoundex(local0\Field19\Field32[$05]\Field67, local0\Field19\Field32[$05]\Field6, camera, local0\Field19\Field32[$05]\Field98, 2.0, 0.5, $00)
                            If ((((local0\Field19\Field40 - 21.0) > entityx(XZ0260X8X2\Field74, $00, 1.0)) And (local0\Field9 = "")) <> 0) Then
                                If (rand($03, $01) = $01) Then
                                    local0\Field9 = (("Scripted\Scripted" + (Str rand($00, $04))) + ".ogg|Off.ogg|")
                                Else
                                    local0\Field9 = (("1\Attention" + (Str rand($00, $01))) + ".ogg")
                                    Select rand($03, $01)
                                        Case $01
                                            local18 = "Crew"
                                            local0\Field9 = (((local0\Field9 + "|2\Crew") + (Str rand($00, $05))) + ".ogg")
                                        Case $02
                                            local18 = "Scientist"
                                            local0\Field9 = (((local0\Field9 + "|2\Scientist") + (Str rand($00, $11))) + ".ogg")
                                        Case $03
                                            local18 = "Security"
                                            local0\Field9 = (((local0\Field9 + "|2\Security") + (Str rand($00, $05))) + ".ogg")
                                    End Select
                                    If (((rand($02, $01) = $01) And (local18 = "Scientist")) <> 0) Then
                                        local0\Field9 = (local0\Field9 + "|3\CallOnLine.ogg")
                                        local0\Field9 = (((local0\Field9 + "|Numbers\") + (Str rand($09, $01))) + ".ogg")
                                        If (rand($02, $01) = $01) Then
                                            local0\Field9 = (((local0\Field9 + "|Numbers\") + (Str rand($09, $01))) + ".ogg")
                                        EndIf
                                    Else
                                        local0\Field9 = (((local0\Field9 + "|3\Report") + (Str rand($00, $01))) + ".ogg")
                                        Select local18
                                            Case "Crew"
                                                local0\Field9 = (((local0\Field9 + "|4\Crew") + (Str rand($00, $06))) + ".ogg")
                                                If (rand($02, $01) = $01) Then
                                                    local0\Field9 = (((local0\Field9 + "|5\Crew") + (Str rand($00, $06))) + ".ogg")
                                                EndIf
                                            Case "Scientist"
                                                local0\Field9 = (((local0\Field9 + "|4\Scientist") + (Str rand($00, $07))) + ".ogg")
                                                If (rand($02, $01) = $01) Then
                                                    local0\Field9 = (local0\Field9 + "|5\Scientist0.ogg")
                                                EndIf
                                            Case "Security"
                                                local0\Field9 = (((local0\Field9 + "|4\Security") + (Str rand($00, $05))) + ".ogg")
                                                If (rand($02, $01) = $01) Then
                                                    local0\Field9 = (((local0\Field9 + "|5\Security") + (Str rand($00, $02))) + ".ogg")
                                                EndIf
                                        End Select
                                    EndIf
                                    local0\Field9 = (local0\Field9 + "|Off.ogg|")
                                EndIf
                            EndIf
                            If (((local0\Field9 <> "") And (local0\Field9 <> "Done")) <> 0) Then
                                If (local0\Field2 = $00) Then
                                    local0\Field2 = playsound_strict(loadtempsound("SFX\Room\Intro\IA\On.ogg"), $01, $00)
                                EndIf
                                If (ChannelPlaying(local0\Field2) = $00) Then
                                    local18 = left(local0\Field9, (instr(local0\Field9, "|", $01) - $01))
                                    loadeventsound(local0, ("SFX\Room\Intro\IA\" + local18), $00)
                                    local0\Field2 = playsound_strict(local0\Field0, $01, $00)
                                    local0\Field9 = right(local0\Field9, ((len(local0\Field9) - len(local18)) - $01))
                                    If (local0\Field9 = "") Then
                                        If (ChannelPlaying(local0\Field19\Field32[$03]\Field63) = $00) Then
                                            For local8 = $03 To $04 Step $01
                                                local0\Field19\Field32[local8]\Field63 = playsoundex(local0\Field19\Field32[local8]\Field67, camera, local0\Field19\Field32[$03]\Field82, 10.0, 1.0, $01, $00)
                                            Next
                                        Else
                                            For local8 = $03 To $04 Step $01
                                                freesound_strict(local0\Field19\Field32[local8]\Field67)
                                                local0\Field19\Field32[local8]\Field67 = $00
                                            Next
                                        EndIf
                                        local0\Field9 = "Done"
                                    EndIf
                                EndIf
                            EndIf
                            If (0.0 = local0\Field19\Field32[$06]\Field66) Then
                                If (local0\Field19\Field25[$05]\Field39 <> 0) Then
                                    If (25.0 > distancesquared(entityx(XZ0260X8X2\Field74, $00, 1.0), (local0\Field19\Field40 - 13.0), entityz(XZ0260X8X2\Field74, $00, 1.0), (local0\Field19\Field37 - 4.8125), 0.0, 0.0)) Then
                                        If (local0\Field9 = "Done") Then
                                            loadeventsound(local0, (("SFX\Room\Intro\IA\Scripted\Announcement" + (Str rand($00, $06))) + ".ogg"), $00)
                                            local0\Field2 = playsound_strict(local0\Field0, $00, $00)
                                        EndIf
                                        local0\Field19\Field32[$06]\Field66 = 1.0
                                    EndIf
                                EndIf
                            Else
                                If (ChannelPlaying(local0\Field19\Field32[$07]\Field63) = $00) Then
                                    local0\Field19\Field32[$07]\Field63 = playsoundex(local0\Field19\Field32[$07]\Field55, camera, local0\Field19\Field32[$07]\Field82, 7.0, 1.0, $01, $00)
                                EndIf
                                If ((local0\Field19\Field37 - 0.25) < entityz(local0\Field19\Field32[$06]\Field82, $00, 1.0)) Then
                                    rotateentity(local0\Field19\Field32[$06]\Field82, 0.0, curveangle(-90.0, entityyaw(local0\Field19\Field32[$06]\Field82, $00, 1.0), 15.0), 0.0, $00)
                                    If (local0\Field19\Field25[$05]\Field39 <> 0) Then
                                        openclosedoor(local0\Field19\Field25[$05], $01, $00)
                                    EndIf
                                    If (1.0 > local0\Field19\Field25[$05]\Field13) Then
                                        local0\Field19\Field32[$06]\Field66 = -1.0
                                        local0\Field19\Field32[$06]\Field64 = 0.0
                                        hideentity(local0\Field19\Field32[$06]\Field98)
                                    EndIf
                                EndIf
                            EndIf
                            rotateentity(local0\Field19\Field32[$07]\Field82, 0.0, ((sin(((Float millisec) / 20.0)) * 3.0) + 180.0), 0.0, $01)
                            updatesoundorigin(local0\Field19\Field32[$07]\Field63, camera, local0\Field19\Field32[$07]\Field82, 7.0, 1.0, $01, $01, $00)
                            If (local0\Field19\Field32[$08] <> Null) Then
                                If (7.0 = local0\Field19\Field32[$08]\Field66) Then
                                    If (6.25 > distancesquared(entityx(XZ0260X8X2\Field74, $00, 1.0), (local0\Field19\Field40 - 26.125), entityz(XZ0260X8X2\Field74, $00, 1.0), (local0\Field19\Field37 - 4.890625), 0.0, 0.0)) Then
                                        local0\Field19\Field32[$08]\Field66 = 10.0
                                        local0\Field19\Field32[$09]\Field66 = 10.0
                                        local0\Field19\Field32[$0A]\Field66 = 1.0
                                    EndIf
                                ElseIf ((local0\Field19\Field40 - 27.73438) > entityx(local0\Field19\Field32[$08]\Field82, $00, 1.0)) Then
                                    For local8 = $08 To $0A Step $01
                                        removenpc(local0\Field19\Field32[local8])
                                    Next
                                EndIf
                            EndIf
                            If (local0\Field19\Field32[$0B] <> Null) Then
                                If (15.0 = local0\Field19\Field32[$0B]\Field66) Then
                                    If (6.25 > distancesquared(entityx(XZ0260X8X2\Field74, $00, 1.0), (local0\Field19\Field40 - 26.125), entityz(XZ0260X8X2\Field74, $00, 1.0), (local0\Field19\Field37 - 4.890625), 0.0, 0.0)) Then
                                        local0\Field19\Field32[$0B]\Field66 = 16.0
                                    EndIf
                                ElseIf ((local0\Field19\Field40 - (1.0 / 0.128)) < entityx(local0\Field19\Field32[$0B]\Field82, $00, 1.0)) Then
                                    removenpc(local0\Field19\Field32[$0B])
                                EndIf
                            EndIf
                            animatenpc(local0\Field19\Field32[$0C], 357.0, 381.0, 0.05, $01)
                            If (11.0 <> local0\Field19\Field32[$03]\Field66) Then
                                If (20.25 > distancesquared(entityx(local0\Field19\Field32[$03]\Field82, $00, 1.0), entityx(local0\Field19\Field25[$02]\Field51, $01, 1.0), entityz(local0\Field19\Field32[$03]\Field82, $00, 1.0), entityz(local0\Field19\Field25[$02]\Field51, $01, 1.0), 0.0, 0.0)) Then
                                    local0\Field19\Field32[$03]\Field66 = 9.0
                                    If (20.25 > distancesquared(entityx(XZ0260X8X2\Field74, $00, 1.0), entityx(local0\Field19\Field25[$02]\Field51, $01, 1.0), entityz(XZ0260X8X2\Field74, $00, 1.0), entityz(local0\Field19\Field25[$02]\Field51, $01, 1.0), 0.0, 0.0)) Then
                                        removenpc(local0\Field19\Field32[$05])
                                        removenpc(local0\Field19\Field32[$07])
                                        removenpc(local0\Field19\Field32[$0C])
                                        For local8 = $08 To $09 Step $01
                                            If (npcsound[local8] <> $00) Then
                                                freesound_strict(npcsound[local8])
                                                npcsound[local8] = $00
                                            EndIf
                                        Next
                                        For local8 = $03 To $04 Step $01
                                            If (local0\Field19\Field32[local8]\Field55 <> $00) Then
                                                freesound_strict(local0\Field19\Field32[local8]\Field55)
                                                local0\Field19\Field32[local8]\Field55 = $00
                                            EndIf
                                            If (local0\Field19\Field32[local8]\Field67 <> $00) Then
                                                freesound_strict(local0\Field19\Field32[local8]\Field67)
                                                local0\Field19\Field32[local8]\Field67 = $00
                                            EndIf
                                            StopChannel(local0\Field19\Field32[local8]\Field63)
                                            local0\Field19\Field32[local8]\Field63 = $00
                                            StopChannel(local0\Field19\Field32[local8]\Field6)
                                            local0\Field19\Field32[local8]\Field6 = $00
                                        Next
                                        local0\Field19\Field32[$03]\Field57 = 0.0
                                        loadnpcsound(local0\Field19\Field32[$03], (("SFX\Room\Intro\Guard\Ulgrin\EscortDone" + (Str rand($00, $04))) + ".ogg"), $00)
                                        local0\Field19\Field32[$03]\Field63 = playsoundex(local0\Field19\Field32[$03]\Field55, camera, local0\Field19\Field32[$03]\Field82, 10.0, 1.0, $01, $00)
                                        local0\Field19\Field32[$04]\Field66 = 9.0
                                        openclosedoor(local0\Field19\Field25[$03], $01, $00)
                                        freeentity(local0\Field19\Field27[$04])
                                        local0\Field19\Field27[$04] = $00
                                        For local8 = $00 To $02 Step $01
                                            showentity(local0\Field19\Field32[local8]\Field98)
                                        Next
                                        pointentity(local0\Field19\Field32[$06]\Field82, local0\Field19\Field15, 0.0)
                                        rotateentity(local0\Field19\Field32[$06]\Field82, 0.0, entityyaw(local0\Field19\Field32[$06]\Field82, $00, 1.0), 0.0, $00)
                                        tformpoint(-877.0, 500.0, 465.0, local0\Field19\Field15, $00)
                                        positionentity(local0\Field19\Field32[$06]\Field82, tformedx(), tformedy(), tformedz(), $00)
                                        resetentity(local0\Field19\Field32[$06]\Field82)
                                        local0\Field4 = 5.0
                                    EndIf
                                EndIf
                            EndIf
                        Case 5.0
                            If (((ChannelPlaying(local0\Field19\Field32[$03]\Field63) = $00) And (358.0 > local0\Field19\Field32[$03]\Field103)) <> 0) Then
                                local0\Field19\Field32[$03]\Field66 = 8.0
                                loadnpcsound(local0\Field19\Field32[$03], "SFX\Room\Intro\Guard\Ulgrin\OhAndByTheWay.ogg", $00)
                                local0\Field19\Field32[$03]\Field63 = playsoundex(local0\Field19\Field32[$03]\Field55, camera, local0\Field19\Field32[$03]\Field82, 10.0, 1.0, $00, $00)
                                setnpcframe(local0\Field19\Field32[$03], 358.0, $01)
                            ElseIf (((358.0 <= local0\Field19\Field32[$03]\Field103) And (608.0 > local0\Field19\Field32[$03]\Field103)) <> 0) Then
                                pointentity(local0\Field19\Field32[$03]\Field82, XZ0260X8X2\Field74, 0.0)
                                rotateentity(local0\Field19\Field32[$03]\Field82, 0.0, entityyaw(local0\Field19\Field32[$03]\Field82, $00, 1.0), 0.0, $00)
                                If (482.0 > local0\Field19\Field32[$03]\Field103) Then
                                    animatenpc(local0\Field19\Field32[$03], 358.0, 482.0, 0.4, $00)
                                Else
                                    animatenpc(local0\Field19\Field32[$03], 483.0, 607.0, 0.2, $01)
                                    If (2.25 > entitydistancesquared(XZ0260X8X2\Field74, local0\Field19\Field32[$03]\Field82)) Then
                                        If (entityinview(local0\Field19\Field32[$03]\Field98, camera) <> 0) Then
                                            handentity = local0\Field19\Field32[$03]\Field98
                                            If (TDD0Z6BXB6\Field7 <> 0) Then
                                                selecteditem = createitem("Testing Brief", $00, 0.0, 0.0, 0.0, $00, $00, $00, 1.0, $00)
                                                pickitem(selecteditem, $01)
                                                freesound_strict(local0\Field19\Field32[$03]\Field55)
                                                local0\Field19\Field32[$03]\Field55 = $00
                                                setnpcframe(local0\Field19\Field32[$03], 608.0, $01)
                                            EndIf
                                        EndIf
                                    EndIf
                                EndIf
                            ElseIf (local0\Field19\Field32[$03]\Field55 = $00) Then
                                If (((621.0 > local0\Field19\Field32[$03]\Field103) And (8.0 = local0\Field19\Field32[$03]\Field66)) <> 0) Then
                                    animatenpc(local0\Field19\Field32[$03], 608.0, 621.0, 0.4, $00)
                                Else
                                    local0\Field19\Field32[$03]\Field84 = entityyaw(local0\Field19\Field32[$03]\Field82, $00, 1.0)
                                    local0\Field19\Field32[$03]\Field66 = 9.0
                                    openclosedoor(local0\Field19\Field25[$02], $01, $00)
                                    createhintmsg(getlocalstring("msg", "enterchmbr"), 6.0, $00)
                                    local0\Field4 = 6.0
                                EndIf
                            EndIf
                        Case 6.0
                            If ((local0\Field19\Field25[$02]\Field39 And (11.0 <> local0\Field19\Field32[$03]\Field66)) <> 0) Then
                                If (2.0 > (Abs (entityx(XZ0260X8X2\Field74, $00, 1.0) - entityx(local0\Field19\Field15, $01, 1.0)))) Then
                                    For local8 = $01 To $02 Step $01
                                        openclosedoor(local0\Field19\Field25[local8], $01, $00)
                                    Next
                                    n_i\Field3\Field84 = 90.0
                                    n_i\Field3\Field31 = 1.0
                                    positionentity(n_i\Field3\Field82, entityx(local0\Field19\Field27[$02], $01, 1.0), entityy(local0\Field19\Field27[$02], $01, 1.0), entityz(local0\Field19\Field27[$02], $01, 1.0), $00)
                                    rotateentity(n_i\Field3\Field82, 0.0, 0.0, 0.0, $01)
                                    resetentity(n_i\Field3\Field82)
                                    showentity(n_i\Field3\Field98)
                                    showentity(n_i\Field3\Field101)
                                    showentity(local0\Field19\Field32[$06]\Field98)
                                    showentity(local0\Field19\Field32[$0D]\Field98)
                                    showentity(local0\Field19\Field25[$06]\Field0)
                                    showentity(local0\Field19\Field25[$06]\Field7)
                                    showentity(local0\Field19\Field25[$06]\Field51)
                                    local0\Field7 = 0.0
                                    local0\Field1 = 0.0
                                    local0\Field4 = 7.0
                                EndIf
                            EndIf
                        Case 7.0
                            If (((snd_i\Field2[$03] <> $00) And (1.0 <> local0\Field7)) <> 0) Then
                                If ((entityvisible(camera, n_i\Field3\Field98, 0.0) And entityinview(n_i\Field3\Field98, camera)) <> 0) Then
                                    createhintmsg(format(getlocalstring("msg", "blink"), key\Field0[key\Field8], "%s"), 6.0, $00)
                                    playsound_strict(snd_i\Field2[$03], $00, $00)
                                    local0\Field7 = 1.0
                                EndIf
                            EndIf
                            local0\Field19\Field32[$06]\Field42 = 0.0
                            If (14000.0 > local0\Field1) Then
                                If (ChannelPlaying(local0\Field2) <> 0) Then
                                    If (325.0 <= animtime(local0\Field19\Field32[$06]\Field98)) Then
                                        animatenpc(local0\Field19\Field32[$06], 326.0, 328.0, 0.02, $00)
                                    Else
                                        animatenpc(local0\Field19\Field32[$06], 320.0, 328.0, 0.05, $00)
                                    EndIf
                                Else
                                    animatenpc(local0\Field19\Field32[$06], 328.0, 320.0, -0.02, $00)
                                EndIf
                            EndIf
                            For local8 = $00 To $02 Step $01
                                updatesoundorigin(local0\Field19\Field32[local8]\Field63, camera, local0\Field19\Field32[local8]\Field82, (((Float (local8 = $00)) * 5.0) + 10.0), 1.0, $01, $01, $00)
                            Next
                            If (10000.0 > local0\Field1) Then
                                If (local0\Field19\Field32[$03] <> Null) Then
                                    If (1.0 > local0\Field19\Field25[$02]\Field13) Then
                                        For local2 = Each doors
                                            If (local2\Field32 = local0\Field19) Then
                                                If (81.0 < entitydistancesquared(local2\Field51, local0\Field19\Field15)) Then
                                                    removedoor(local2)
                                                EndIf
                                            EndIf
                                        Next
                                        For local3 = Each props
                                            If (local3\Field5 = local0\Field19) Then
                                                If (81.0 < entitydistancesquared(local3\Field0, local0\Field19\Field15)) Then
                                                    removeprop(local3)
                                                EndIf
                                            EndIf
                                        Next
                                        For local4 = Each securitycams
                                            If (local4\Field6 = local0\Field19) Then
                                                removesecuritycam(local4)
                                            EndIf
                                        Next
                                        For local5 = Each lights
                                            If (local5\Field16 = local0\Field19) Then
                                                If (81.0 < entitydistancesquared(local5\Field7, local0\Field19\Field15)) Then
                                                    removelight(local5)
                                                EndIf
                                            EndIf
                                        Next
                                        For local7 = Each waypoints
                                            If (local7\Field9 = local0\Field19) Then
                                                removewaypoint(local7)
                                            EndIf
                                        Next
                                        tformpoint(1571.0, 0.0, 846.0, local0\Field19\Field15, $00)
                                        local22 = createnpc($15, tformedx(), (local0\Field19\Field3 + 0.05), tformedz())
                                        rotateentity(local22\Field82, entitypitch(local22\Field82, $00, 1.0), rnd(360.0, 0.0), entityroll(local22\Field82, $00, 1.0), $00)
                                        tformpoint(1850.0, 0.0, 715.0, local0\Field19\Field15, $00)
                                        local22 = createnpc($15, tformedx(), (local0\Field19\Field3 + 0.05), tformedz())
                                        rotateentity(local22\Field82, entitypitch(local22\Field82, $00, 1.0), rnd(360.0, 0.0), entityroll(local22\Field82, $00, 1.0), $00)
                                        tformpoint(958.0, 0.0, -33.0, local0\Field19\Field15, $00)
                                        local22 = createnpc($15, tformedx(), (local0\Field19\Field3 + 0.05), tformedz())
                                        rotateentity(local22\Field82, entitypitch(local22\Field82, $00, 1.0), rnd(360.0, 0.0), entityroll(local22\Field82, $00, 1.0), $00)
                                        removenpc(local0\Field19\Field32[$04])
                                        removenpc(local0\Field19\Field32[$03])
                                        removenpc(local0\Field19\Field32[$0E])
                                        removenpc(local0\Field19\Field32[$0F])
                                    EndIf
                                EndIf
                                local10 = (fps\Field3[$00] / 3.0)
                                local0\Field1 = min((local0\Field1 + local10), 5000.0)
                                If (((130.0 <= local0\Field1) And (130.0 > (local0\Field1 - local10))) <> 0) Then
                                    loadeventsound(local0, "SFX\Room\Intro\Scientist\Franklin\EnterChamber.ogg", $00)
                                    local0\Field2 = playsound_strict(local0\Field0, $01, $00)
                                ElseIf (230.0 < local0\Field1) Then
                                    local9 = $01
                                    For local8 = $01 To $02 Step $01
                                        If (0.09 < distancesquared(entityx(local0\Field19\Field32[local8]\Field82, $00, 1.0), entityx(local0\Field19\Field27[(local8 - $01)], $01, 1.0), entityz(local0\Field19\Field32[local8]\Field82, $00, 1.0), entityz(local0\Field19\Field27[(local8 - $01)], $01, 1.0), 0.0, 0.0)) Then
                                            pointentity(local0\Field19\Field32[local8]\Field98, local0\Field19\Field27[(local8 - $01)], 0.0)
                                            rotateentity(local0\Field19\Field32[local8]\Field82, 0.0, curvevalue(entityyaw(local0\Field19\Field32[local8]\Field98, $00, 1.0), entityyaw(local0\Field19\Field32[local8]\Field82, $00, 1.0), 15.0), 0.0, $00)
                                            If ((((Float local8) * 30.0) + 200.0) < local0\Field1) Then
                                                local0\Field19\Field32[local8]\Field66 = 1.0
                                            EndIf
                                            local9 = $00
                                        Else
                                            local0\Field19\Field32[local8]\Field66 = 0.0
                                            pointentity(local0\Field19\Field32[local8]\Field98, local0\Field19\Field27[$02], 0.0)
                                            rotateentity(local0\Field19\Field32[local8]\Field82, 0.0, curvevalue(entityyaw(local0\Field19\Field32[local8]\Field98, $00, 1.0), entityyaw(local0\Field19\Field32[local8]\Field82, $00, 1.0), 15.0), 0.0, $00)
                                        EndIf
                                    Next
                                    If ((local0\Field19\Field40 + 2.71875) > entityx(XZ0260X8X2\Field74, $00, 1.0)) Then
                                        If (((450.0 <= local0\Field1) And (450.0 > (local0\Field1 - local10))) <> 0) Then
                                            loadeventsound(local0, "SFX\Room\Intro\Scientist\Franklin\Refuse0.ogg", $00)
                                            local0\Field2 = playsound_strict(local0\Field0, $01, $00)
                                        ElseIf (((650.0 <= local0\Field1) And (650.0 > (local0\Field1 - local10))) <> 0) Then
                                            loadeventsound(local0, "SFX\Room\Intro\Scientist\Franklin\Refuse1.ogg", $00)
                                            local0\Field2 = playsound_strict(local0\Field0, $01, $00)
                                        ElseIf (((850.0 <= local0\Field1) And (850.0 > (local0\Field1 - local10))) <> 0) Then
                                            loadeventsound(local0, "SFX\Room\Intro\Scientist\Franklin\Refuse2.ogg", $00)
                                            local0\Field2 = playsound_strict(local0\Field0, $01, $00)
                                            openclosedoor(local0\Field19\Field25[$01], $01, $00)
                                        ElseIf (1000.0 < local0\Field1) Then
                                            local0\Field19\Field32[$00]\Field66 = 1.0
                                            local0\Field19\Field32[$00]\Field65 = 10.0
                                            local0\Field19\Field32[$00]\Field57 = 1.0
                                        EndIf
                                        If (850.0 < local0\Field1) Then
                                            positionentity(XZ0260X8X2\Field74, min(entityx(XZ0260X8X2\Field74, $00, 1.0), (local0\Field19\Field40 + 2.5)), entityy(XZ0260X8X2\Field74, $00, 1.0), entityz(XZ0260X8X2\Field74, $00, 1.0), $00)
                                        EndIf
                                    ElseIf (local9 = $01) Then
                                        openclosedoor(local0\Field19\Field25[$01], $01, $00)
                                        local0\Field1 = 10000.0
                                    EndIf
                                EndIf
                            ElseIf (14000.0 > local0\Field1) Then
                                local0\Field1 = min((local0\Field1 + fps\Field3[$00]), 13000.0)
                                For local8 = $01 To $02 Step $01
                                    pointentity(local0\Field19\Field32[local8]\Field98, local0\Field19\Field27[$02], 0.0)
                                    rotateentity(local0\Field19\Field32[local8]\Field82, 0.0, curvevalue(entityyaw(local0\Field19\Field32[local8]\Field98, $00, 1.0), entityyaw(local0\Field19\Field32[local8]\Field82, $00, 1.0), 15.0), 0.0, $00)
                                Next
                                If (10300.0 > local0\Field1) Then
                                    positionentity(XZ0260X8X2\Field74, max(entityx(XZ0260X8X2\Field74, $00, 1.0), (local0\Field19\Field40 + 2.5)), entityy(XZ0260X8X2\Field74, $00, 1.0), entityz(XZ0260X8X2\Field74, $00, 1.0), $00)
                                EndIf
                                If (((10300.0 <= local0\Field1) And (10300.0 > (local0\Field1 - fps\Field3[$00]))) <> 0) Then
                                    loadeventsound(local0, "SFX\Room\Intro\Scientist\Franklin\Approach173.ogg", $00)
                                    local0\Field2 = playsound_strict(local0\Field0, $01, $00)
                                ElseIf (((10440.0 <= local0\Field1) And (10440.0 > (local0\Field1 - fps\Field3[$00]))) <> 0) Then
                                    openclosedoor(local0\Field19\Field25[$01], $01, $00)
                                    playsoundex(snd_i\Field26, camera, local0\Field19\Field25[$01]\Field51, 7.0, 1.0, $00, $00)
                                ElseIf (((10740.0 <= local0\Field1) And (10740.0 > (local0\Field1 - fps\Field3[$00]))) <> 0) Then
                                    loadeventsound(local0, "SFX\Room\Intro\Scientist\Franklin\Problem.ogg", $00)
                                    local0\Field2 = playsound_strict(local0\Field0, $01, $00)
                                ElseIf (((11145.0 <= local0\Field1) And (11145.0 > (local0\Field1 - fps\Field3[$00]))) <> 0) Then
                                    playsound_strict(snd_i\Field5[rand($00, $02)], $00, $00)
                                    local0\Field19\Field32[$01]\Field55 = loadsound_strict("SFX\Room\Intro\ClassD\DontLikeThis.ogg")
                                    local0\Field19\Field32[$01]\Field63 = playsoundex(local0\Field19\Field32[$01]\Field55, camera, local0\Field19\Field32[$01]\Field82, 10.0, 1.0, $01, $00)
                                ElseIf (((11561.0 <= local0\Field1) And (11561.0 > (local0\Field1 - fps\Field3[$00]))) <> 0) Then
                                    playsound_strict(snd_i\Field2[$02], $00, $00)
                                    local0\Field19\Field32[$02]\Field55 = loadsound_strict("SFX\Room\Intro\ClassD\Breen.ogg")
                                    local0\Field19\Field32[$02]\Field63 = playsoundex(local0\Field19\Field32[$02]\Field55, camera, local0\Field19\Field32[$02]\Field82, 10.0, 1.0, $01, $00)
                                    setnpcframe(local0\Field19\Field32[$06], 357.0, $01)
                                    local0\Field1 = 14000.0
                                EndIf
                                If (((10440.0 <= local0\Field1) And (11561.0 > (local0\Field1 - fps\Field3[$00]))) <> 0) Then
                                    If (entityx(local0\Field19\Field25[$01]\Field51, $01, 1.0) > entityx(XZ0260X8X2\Field74, $00, 1.0)) Then
                                        If (12.0 <> local0\Field19\Field32[$00]\Field66) Then
                                            local0\Field19\Field32[$00]\Field55 = loadsound_strict((("SFX\Room\Intro\Guard\Balcony\Alert" + (Str rand($00, $01))) + ".ogg"))
                                            local0\Field19\Field32[$00]\Field63 = playsoundex(local0\Field19\Field32[$00]\Field55, camera, local0\Field19\Field32[$00]\Field82, 15.0, 1.0, $01, $00)
                                            local0\Field19\Field32[$00]\Field65 = 1.0
                                            local0\Field19\Field32[$00]\Field66 = 12.0
                                        EndIf
                                    EndIf
                                EndIf
                                If (10300.0 < local0\Field1) Then
                                    If (10560.0 < local0\Field1) Then
                                        If (10750.0 > local0\Field1) Then
                                            local0\Field19\Field32[$01]\Field66 = 1.0
                                            local0\Field19\Field32[$01]\Field64 = 0.005
                                        Else
                                            local0\Field19\Field32[$01]\Field66 = 0.0
                                            local0\Field19\Field32[$01]\Field64 = curvevalue(0.0, local0\Field19\Field32[$01]\Field64, 10.0)
                                        EndIf
                                    EndIf
                                EndIf
                            ElseIf (20000.0 > local0\Field1) Then
                                local16 = createpivot($00)
                                positionentity(local16, entityx(camera, $00, 1.0), (entityy(n_i\Field3\Field82, $01, 1.0) - 0.05), entityz(camera, $00, 1.0), $00)
                                pointentity(local16, n_i\Field3\Field82, 0.0)
                                rotateentity(XZ0260X8X2\Field74, entitypitch(XZ0260X8X2\Field74, $00, 1.0), curveangle(entityyaw(local16, $00, 1.0), entityyaw(XZ0260X8X2\Field74, $00, 1.0), 40.0), 0.0, $00)
                                turnentity(local16, 90.0, 0.0, 0.0, $00)
                                camerapitch = curveangle(entitypitch(local16, $00, 1.0), (camerapitch + 90.0), 40.0)
                                camerapitch = (camerapitch - 90.0)
                                freeentity(local16)
                                local16 = $00
                                animatenpc(local0\Field19\Field32[$06], 357.0, 381.0, 0.05, $01)
                                For local8 = $0D To $0E Step $01
                                    If (local0\Field19\Field32[local8] <> Null) Then
                                        pointentity(local0\Field19\Field32[local8]\Field82, n_i\Field3\Field82, 0.0)
                                        rotateentity(local0\Field19\Field32[local8]\Field82, 0.0, curvevalue(entityyaw(local0\Field19\Field32[local8]\Field98, $00, 1.0), entityyaw(local0\Field19\Field32[local8]\Field82, $00, 1.0), 15.0), 0.0, $00)
                                    EndIf
                                Next
                                local0\Field1 = min((local0\Field1 + fps\Field3[$00]), 19000.0)
                                If (14100.0 > local0\Field1) Then
                                    If (14060.0 > local0\Field1) Then
                                        XZ0260X8X2\Field53 = max((((14000.0 - local0\Field1) / 2.0) - rnd(0.0, 1.0)), -10.0)
                                        If (-10.0 = XZ0260X8X2\Field53) Then
                                            pointentity(n_i\Field3\Field82, local0\Field19\Field32[$01]\Field98, 0.0)
                                            rotateentity(n_i\Field3\Field82, 0.0, entityyaw(n_i\Field3\Field82, $00, 1.0), 0.0, $00)
                                            moveentity(n_i\Field3\Field82, 0.0, 0.0, ((n_i\Field3\Field32 * 0.6) * fps\Field3[$00]), $00)
                                            n_i\Field3\Field63 = loopsoundex(snd_i\Field30, n_i\Field3\Field63, camera, n_i\Field3\Field82, 10.0, n_i\Field3\Field66, $00)
                                            n_i\Field3\Field66 = curvevalue(1.0, n_i\Field3\Field66, 3.0)
                                        Else
                                            n_i\Field3\Field66 = max(0.0, (n_i\Field3\Field66 - (fps\Field3[$00] / 20.0)))
                                        EndIf
                                    ElseIf (14065.0 > local0\Field1) Then
                                        XZ0260X8X2\Field53 = -10.0
                                        openclosedoor(local0\Field19\Field25[$06], $01, $00)
                                        playsoundex(snd_i\Field35[rand($00, $02)], camera, n_i\Field3\Field82, 10.0, 1.0, $00, $00)
                                        playsound_strict(snd_i\Field2[$04], $00, $00)
                                        XZ0260X8X2\Field14 = 3.0
                                        local0\Field19\Field32[$01]\Field1 = $01
                                        positionentity(n_i\Field3\Field82, entityx(local0\Field19\Field32[$01]\Field98, $00, 1.0), entityy(n_i\Field3\Field82, $00, 1.0), entityz(local0\Field19\Field32[$01]\Field98, $00, 1.0), $00)
                                        resetentity(n_i\Field3\Field82)
                                        pointentity(n_i\Field3\Field82, local0\Field19\Field32[$02]\Field82, 0.0)
                                        local0\Field19\Field32[$02]\Field66 = -1.0
                                        animatenpc(local0\Field19\Field32[$02], 406.0, 382.0, -0.015, $01)
                                        moveentity(local0\Field19\Field32[$02]\Field82, 0.0, 0.0, (fps\Field3[$00] * -0.01), $00)
                                        StopChannel(local0\Field19\Field32[$00]\Field63)
                                        local0\Field19\Field32[$00]\Field63 = $00
                                        loadnpcsound(local0\Field19\Field32[$00], (("SFX\Room\Intro\Guard\Balcony\WTF" + (Str rand($00, $01))) + ".ogg"), $00)
                                        local0\Field19\Field32[$00]\Field63 = playsoundex(local0\Field19\Field32[$00]\Field55, camera, local0\Field19\Field32[$00]\Field82, 20.0, 1.0, $01, $00)
                                        local0\Field19\Field32[$00]\Field66 = 12.0
                                        local0\Field19\Field32[$00]\Field65 = 0.0
                                        local0\Field19\Field32[$00]\Field84 = 180.0
                                        local0\Field1 = 14065.0
                                    ElseIf (local0\Field19\Field32[$02]\Field55 = $00) Then
                                        loadnpcsound(local0\Field19\Field32[$02], "SFX\Room\Intro\ClassD\Gasp.ogg", $00)
                                        playsoundex(local0\Field19\Field32[$02]\Field55, camera, local0\Field19\Field32[$02]\Field82, 8.0, 1.0, $01, $00)
                                    EndIf
                                    If (((14080.0 < local0\Field1) And (14080.0 > (local0\Field1 - fps\Field3[$00]))) <> 0) Then
                                        playsound_strict(snd_i\Field5[rand($00, $02)], $00, $00)
                                    EndIf
                                    XZ0260X8X2\Field14 = 3.0
                                ElseIf (14200.0 > local0\Field1) Then
                                    local0\Field19\Field32[$00]\Field66 = 8.0
                                    If (14115.0 < local0\Field1) Then
                                        If (local0\Field19\Field32[$02]\Field1 = $00) Then
                                            freesound_strict(local0\Field19\Field32[$02]\Field55)
                                            local0\Field19\Field32[$02]\Field55 = $00
                                            playsoundex(snd_i\Field35[$01], camera, local0\Field19\Field32[$02]\Field82, 8.0, 1.0, $00, $00)
                                            local0\Field19\Field32[$02]\Field1 = $01
                                        EndIf
                                        positionentity(n_i\Field3\Field82, entityx(local0\Field19\Field32[$02]\Field98, $00, 1.0), entityy(n_i\Field3\Field82, $00, 1.0), entityz(local0\Field19\Field32[$02]\Field98, $00, 1.0), $00)
                                        resetentity(n_i\Field3\Field82)
                                        pointentity(n_i\Field3\Field82, XZ0260X8X2\Field74, 0.0)
                                    EndIf
                                    If (14130.0 > local0\Field1) Then
                                        setnpcframe(local0\Field19\Field32[$02], 50.0, $01)
                                        XZ0260X8X2\Field53 = -10.0
                                        XZ0260X8X2\Field8 = 1.0
                                    Else
                                        n_i\Field3\Field31 = 0.0
                                    EndIf
                                    If (((14100.0 <= local0\Field1) And (14100.0 > (local0\Field1 - fps\Field3[$00]))) <> 0) Then
                                        playsound_strict(snd_i\Field2[$05], $00, $00)
                                    EndIf
                                    If (14150.0 > local0\Field1) Then
                                        XZ0260X8X2\Field14 = 5.0
                                        If ((local0\Field19\Field40 + 2.71875) <= entityx(XZ0260X8X2\Field74, $00, 1.0)) Then
                                            createhintmsg(getlocalstring("msg", "leavechmbr"), 1.0, $00)
                                        EndIf
                                    EndIf
                                ElseIf (14300.0 < local0\Field1) Then
                                    If (((14600.0 < local0\Field1) And (14700.0 > local0\Field1)) <> 0) Then
                                        XZ0260X8X2\Field53 = -10.0
                                        XZ0260X8X2\Field8 = 1.0
                                    EndIf
                                    If ((local0\Field19\Field40 + 2.71875) <= entityx(XZ0260X8X2\Field74, $00, 1.0)) Then
                                        createhintmsg(getlocalstring("msg", "leavechmbr"), 1.0, $00)
                                    Else
                                        local0\Field1 = 20000.0
                                    EndIf
                                EndIf
                            ElseIf (30000.0 > local0\Field1) Then
                                local0\Field1 = min((local0\Field1 + fps\Field3[$00]), 30000.0)
                                If (20100.0 > local0\Field1) Then
                                    XZ0260X8X2\Field14 = 2.0
                                ElseIf (20200.0 > local0\Field1) Then
                                    If (((20105.0 < local0\Field1) And (20105.0 > (local0\Field1 - fps\Field3[$00]))) <> 0) Then
                                        playsound_strict(snd_i\Field2[$06], $00, $00)
                                        tformpoint(128.0, 480.0, 1280.0, local0\Field19\Field15, $00)
                                        positionentity(local0\Field19\Field32[$00]\Field82, tformedx(), tformedy(), tformedz(), $00)
                                        resetentity(local0\Field19\Field32[$00]\Field82)
                                        StopChannel(local0\Field19\Field32[$00]\Field63)
                                        local0\Field19\Field32[$00]\Field63 = $00
                                        loadnpcsound(local0\Field19\Field32[$00], "SFX\Room\Intro\Guard\Balcony\OhShit.ogg", $00)
                                        local0\Field19\Field32[$00]\Field63 = playsoundex(local0\Field19\Field32[$00]\Field55, camera, local0\Field19\Field32[$00]\Field82, 20.0, 1.0, $01, $00)
                                        n_i\Field3\Field84 = 0.0
                                        n_i\Field3\Field31 = 1.0
                                        pointentity(local0\Field19\Field32[$00]\Field82, n_i\Field3\Field98, 0.0)
                                        tformpoint(-320.0, 480.0, 1312.0, local0\Field19\Field15, $00)
                                        positionentity(n_i\Field3\Field82, tformedx(), tformedy(), tformedz(), $00)
                                        resetentity(n_i\Field3\Field82)
                                        pointentity(n_i\Field3\Field82, local0\Field19\Field32[$00]\Field82, 0.0)
                                    EndIf
                                    XZ0260X8X2\Field53 = -10.0
                                    XZ0260X8X2\Field8 = 1.0
                                    XZ0260X8X2\Field14 = 3.0
                                ElseIf (20300.0 > local0\Field1) Then
                                    pointentity(local0\Field19\Field32[$00]\Field82, n_i\Field3\Field82, 0.0)
                                    local0\Field19\Field32[$00]\Field66 = 2.0
                                    If (((20260.0 < local0\Field1) And (20260.0 > (local0\Field1 - fps\Field3[$00]))) <> 0) Then
                                        playsound_strict(snd_i\Field5[rand($00, $02)], $00, $00)
                                    EndIf
                                ElseIf (20300.0 > (local0\Field1 - fps\Field3[$00])) Then
                                    XZ0260X8X2\Field53 = -10.0
                                    XZ0260X8X2\Field8 = 1.0
                                    XZ0260X8X2\Field14 = 3.0
                                    XZ0260X8X2\Field76 = 0.0
                                    XZ0260X8X2\Field38 = $00
                                    playsound_strict(snd_i\Field5[rand($00, $02)], $00, $00)
                                    If (local0\Field19\Field32[$00]\Field55 <> $00) Then
                                        freesound_strict(local0\Field19\Field32[$00]\Field55)
                                        local0\Field19\Field32[$00]\Field55 = $00
                                    EndIf
                                    local0\Field19\Field32[$00]\Field63 = playsoundex(snd_i\Field35[$01], camera, local0\Field19\Field32[$00]\Field82, 8.0, 1.0, $00, $00)
                                    n_i\Field3\Field31 = 0.0
                                    playsound_strict(loadsound_strict("SFX\Room\Intro\173Vent.ogg"), $00, $00)
                                    positionentity(n_i\Field3\Field82, 0.0, -500.0, 0.0, $00)
                                    resetentity(n_i\Field3\Field82)
                                    For local1 = Each rooms
                                        If (local1\Field22\Field21 = $03) Then
                                            local11 = (local1\Field40 + 14.5)
                                            local12 = (local1\Field3 + 1.5)
                                            local13 = (local1\Field37 + 13.125)
                                            teleportentity(XZ0260X8X2\Field74, (((entityx(XZ0260X8X2\Field74, $00, 1.0) - local0\Field19\Field40) - 1.125) + local11), (((entityy(XZ0260X8X2\Field74, $00, 1.0) - local0\Field19\Field3) + 0.4) + local12), (((entityz(XZ0260X8X2\Field74, $00, 1.0) - local0\Field19\Field37) + 0.125) + local13), 0.3, $00, 2.0, $00)
                                            teleporttoroom(local1)
                                            fog\Field13 = 8.0
                                            For local8 = $00 To $02 Step $01
                                                positionentity(local0\Field19\Field32[local8]\Field82, (((entityx(local0\Field19\Field32[local8]\Field82, $00, 1.0) - local0\Field19\Field40) - 1.125) + local11), ((entityy(local0\Field19\Field32[local8]\Field82, $00, 1.0) + local12) - local0\Field19\Field3), (((entityz(local0\Field19\Field32[local8]\Field82, $00, 1.0) - local0\Field19\Field37) + 0.125) + local13), $00)
                                                resetentity(local0\Field19\Field32[local8]\Field82)
                                            Next
                                            freesound_strict(snd_i\Field2[$02])
                                            snd_i\Field2[$02] = $00
                                            For local8 = $04 To $06 Step $01
                                                freesound_strict(snd_i\Field2[local8])
                                                snd_i\Field2[local8] = $00
                                            Next
                                            local1\Field32[$00] = local0\Field19\Field32[$00]
                                            local1\Field32[$00]\Field66 = 8.0
                                            local0\Field19\Field32[$06]\Field42 = 1.0
                                            local1\Field32[$01] = local0\Field19\Field32[$06]
                                            local1\Field32[$07] = local0\Field19\Field32[$0D]
                                            For local2 = Each doors
                                                If (local2\Field32 = local0\Field19) Then
                                                    removedoor(local2)
                                                EndIf
                                            Next
                                            For local5 = Each lights
                                                If (local5\Field16 = local0\Field19) Then
                                                    removelight(local5)
                                                EndIf
                                            Next
                                            For local3 = Each props
                                                If (local3\Field5 = local0\Field19) Then
                                                    removeprop(local3)
                                                EndIf
                                            Next
                                            For local6 = Each soundemitters
                                                If (local6\Field4 = local0\Field19) Then
                                                    removesoundemitter(local6)
                                                EndIf
                                            Next
                                            For local4 = Each securitycams
                                                If (local4\Field6 = local0\Field19) Then
                                                    removesecuritycam(local4)
                                                EndIf
                                            Next
                                            For local7 = Each waypoints
                                                If (local7\Field9 = local0\Field19) Then
                                                    removewaypoint(local7)
                                                EndIf
                                            Next
                                            For local23 = Each screens
                                                If (local23\Field12 = local0\Field19) Then
                                                    removescreen(local23)
                                                EndIf
                                            Next
                                            removeroom(local0\Field19)
                                            clearconsole()
                                            clearfogcolor()
                                            initializeintromovie = $00
                                            removeevent(local0)
                                            Return $00
                                            Exit
                                        EndIf
                                    Next
                                EndIf
                            EndIf
                    End Select
                    If (7.0 > local0\Field4) Then
                        If (0.0 = XZ0260X8X2\Field48) Then
                            local14 = distancesquared(entityx(XZ0260X8X2\Field74, $00, 1.0), entityx(local0\Field19\Field32[$03]\Field82, $00, 1.0), entityz(XZ0260X8X2\Field74, $00, 1.0), entityz(local0\Field19\Field32[$03]\Field82, $00, 1.0), 0.0, 0.0)
                            If (local0\Field19\Field32[$05] <> Null) Then
                                If (11.0 <> local0\Field19\Field32[$05]\Field66) Then
                                    If ((((25.0 > distancesquared(entityx(XZ0260X8X2\Field74, $00, 1.0), entityx(local0\Field19\Field32[$05]\Field82, $00, 1.0), entityz(XZ0260X8X2\Field74, $00, 1.0), entityz(local0\Field19\Field32[$05]\Field82, $00, 1.0), 0.0, 0.0)) And (25.0 < local14)) And (25.0 < distancesquared(entityx(XZ0260X8X2\Field74, $00, 1.0), entityx(local0\Field19\Field32[$04]\Field82, $00, 1.0), entityz(XZ0260X8X2\Field74, $00, 1.0), entityz(local0\Field19\Field32[$04]\Field82, $00, 1.0), 0.0, 0.0))) <> 0) Then
                                        If (entityvisible(XZ0260X8X2\Field74, local0\Field19\Field32[$05]\Field82, 0.0) <> 0) Then
                                            For local8 = $03 To $05 Step $01
                                                If (local8 < $05) Then
                                                    StopChannel(local0\Field19\Field32[local8]\Field63)
                                                    local0\Field19\Field32[local8]\Field63 = $00
                                                    If (local0\Field19\Field32[local8]\Field55 <> $00) Then
                                                        freesound_strict(local0\Field19\Field32[local8]\Field55)
                                                        local0\Field19\Field32[local8]\Field55 = $00
                                                    EndIf
                                                EndIf
                                                local0\Field19\Field32[local8]\Field66 = 11.0
                                                local0\Field19\Field32[local8]\Field57 = 1.0
                                                local0\Field19\Field32[local8]\Field62 = 210.0
                                            Next
                                            local0\Field19\Field32[$05]\Field63 = playsoundex(loadtempsound("SFX\Room\Intro\Guard\PlayerEscape.ogg"), camera, local0\Field19\Field32[$05]\Field82, 10.0, 1.0, $01, $00)
                                        EndIf
                                    EndIf
                                EndIf
                            EndIf
                            If (11.0 <> local0\Field19\Field32[$03]\Field66) Then
                                If (((9.0 = local0\Field19\Field32[$03]\Field66) Lor (5.0 = local0\Field19\Field32[$03]\Field66)) <> 0) Then
                                    If (4.0 = local0\Field4) Then
                                        local10 = fps\Field3[$00]
                                    ElseIf (6.0 = local0\Field4) Then
                                        local9 = $02
                                        If (((selecteditem <> Null) And (selecteditem\Field6\Field25 <> $00)) <> 0) Then
                                            local9 = $03
                                        EndIf
                                        local10 = (fps\Field3[$00] / (Float local9))
                                    Else
                                        local10 = 0.0
                                    EndIf
                                    local0\Field19\Field32[$03]\Field57 = max((local0\Field19\Field32[$03]\Field57 + local10), 50.0)
                                    If (((560.0 <= local0\Field19\Field32[$03]\Field57) And (560.0 > (local0\Field19\Field32[$03]\Field57 - local10))) <> 0) Then
                                        If (2.0 > local0\Field19\Field32[$03]\Field65) Then
                                            For local8 = $03 To $04 Step $01
                                                StopChannel(local0\Field19\Field32[local8]\Field63)
                                                local0\Field19\Field32[local8]\Field63 = $00
                                            Next
                                            loadnpcsound(local0\Field19\Field32[$03], (("SFX\Room\Intro\Guard\Ulgrin\EscortRefuse" + (Str rand($00, $01))) + ".ogg"), $00)
                                            local0\Field19\Field32[$03]\Field63 = playsoundex(local0\Field19\Field32[$03]\Field55, camera, local0\Field19\Field32[$03]\Field82, 10.0, 1.0, $01, $00)
                                            local0\Field19\Field32[$03]\Field65 = 3.0
                                            local0\Field19\Field32[$03]\Field57 = 50.0
                                        ElseIf (3.0 = local0\Field19\Field32[$03]\Field65) Then
                                            For local8 = $03 To $04 Step $01
                                                StopChannel(local0\Field19\Field32[local8]\Field63)
                                                local0\Field19\Field32[local8]\Field63 = $00
                                            Next
                                            loadnpcsound(local0\Field19\Field32[$03], (("SFX\Room\Intro\Guard\Ulgrin\EscortPissedOff" + (Str rand($00, $01))) + ".ogg"), $00)
                                            local0\Field19\Field32[$03]\Field63 = playsoundex(local0\Field19\Field32[$03]\Field55, camera, local0\Field19\Field32[$03]\Field82, 10.0, 1.0, $01, $00)
                                            local0\Field19\Field32[$03]\Field65 = 4.0
                                            local0\Field19\Field32[$03]\Field57 = 50.0
                                        ElseIf (4.0 = local0\Field19\Field32[$03]\Field65) Then
                                            For local8 = $03 To $04 Step $01
                                                StopChannel(local0\Field19\Field32[local8]\Field63)
                                                local0\Field19\Field32[local8]\Field63 = $00
                                            Next
                                            loadnpcsound(local0\Field19\Field32[$03], (("SFX\Room\Intro\Guard\Ulgrin\EscortKill" + (Str rand($00, $01))) + ".ogg"), $00)
                                            local0\Field19\Field32[$03]\Field63 = playsoundex(local0\Field19\Field32[$03]\Field55, camera, local0\Field19\Field32[$03]\Field82, 10.0, 1.0, $01, $00)
                                            local0\Field19\Field32[$03]\Field65 = 5.0
                                            local0\Field19\Field32[$03]\Field57 = 225.0
                                        ElseIf (5.0 = local0\Field19\Field32[$03]\Field65) Then
                                            For local8 = $03 To ((local0\Field19\Field32[$05] <> Null) + $04) Step $01
                                                local0\Field19\Field32[local8]\Field66 = 11.0
                                                local0\Field19\Field32[local8]\Field57 = 1.0
                                            Next
                                        EndIf
                                    EndIf
                                Else
                                    local0\Field19\Field32[$03]\Field57 = clamp((local0\Field19\Field32[$03]\Field57 - local10), 0.0, 50.0)
                                EndIf
                            ElseIf (6.0 = local0\Field4) Then
                                If (1.0 <> local0\Field19\Field32[$00]\Field66) Then
                                    loadnpcsound(local0\Field19\Field32[$00], (("SFX\Room\Intro\Guard\Balcony\WTF" + (Str rand($00, $01))) + ".ogg"), $00)
                                    local0\Field19\Field32[$00]\Field63 = playsoundex(local0\Field19\Field32[$00]\Field55, camera, local0\Field19\Field32[$00]\Field82, 20.0, 1.0, $01, $00)
                                    local0\Field19\Field32[$00]\Field66 = 1.0
                                    local0\Field19\Field32[$00]\Field65 = 10.0
                                    local0\Field19\Field32[$00]\Field57 = 1.0
                                    local0\Field19\Field32[$00]\Field62 = 210.0
                                EndIf
                                For local8 = $01 To $02 Step $01
                                    pointentity(local0\Field19\Field32[local8]\Field98, XZ0260X8X2\Field74, 0.0)
                                    rotateentity(local0\Field19\Field32[local8]\Field82, 0.0, entityyaw(local0\Field19\Field32[local8]\Field98, $00, 1.0), 0.0, $00)
                                Next
                            EndIf
                            For local8 = $03 To ((local0\Field19\Field32[$05] <> Null) + $04) Step $01
                                updatesoundorigin(local0\Field19\Field32[local8]\Field63, camera, local0\Field19\Field32[local8]\Field82, 10.0, 1.0, $01, $01, $00)
                            Next
                        Else
                            shouldplay = $42
                            playsound_strict(loadtempsound("SFX\Room\Intro\Guard\Ulgrin\EscortTerminated.ogg"), $00, $00)
                            removeevent(local0)
                            Return $00
                        EndIf
                    EndIf
                EndIf
            EndIf
        EndIf
    Next
    Return $00
End Function

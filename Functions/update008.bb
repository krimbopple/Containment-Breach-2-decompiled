Function update008%()
    Local local0.rooms
    Local local1%
    Local local2.decals
    Local local3#
    Local local4%
    Local local5%
    Local local6#
    Local local7%
    local5 = (playerinreachableroom($00, $00, $01) * (GUESSEDupdatexdb() = $00))
    If (0.0 < i_008\Field0) Then
        If (entityhidden(X2Z260BF0Z\Field1[$03]) <> 0) Then
            showentity(X2Z260BF0Z\Field1[$03])
        EndIf
        local6 = (sin(((Float millisec) / 8.0)) + 2.0)
        If (93.0 > i_008\Field0) Then
            local3 = i_008\Field0
            If (25200.0 > i_427\Field1) Then
                If (i_008\Field1 <> 0) Then
                    i_008\Field0 = max((i_008\Field0 - (fps\Field3[$00] * 0.03)), 0.0)
                ElseIf (i_427\Field2 = $00) Then
                    i_008\Field0 = min((i_008\Field0 + (fps\Field3[$00] * 0.002)), 100.0)
                    XZ0260X8X2\Field64 = max(((i_008\Field0 * 3.0) * (2.0 - XZ0260X8X2\Field46)), XZ0260X8X2\Field64)
                    XZ0260X8X2\Field62 = max(XZ0260X8X2\Field62, 100.0)
                    XZ0260X8X2\Field87 = max(XZ0260X8X2\Field87, (i_008\Field0 / 120.0))
                EndIf
            EndIf
            entityalpha(X2Z260BF0Z\Field1[$03], (min((((i_008\Field0 * 0.2) * (i_008\Field0 * 0.2)) / 1000.0), 0.5) * local6))
            For local4 = $00 To $06 Step $01
                If ((((((Float local4) * 15.0) + 10.0) < i_008\Field0) And (local3 <= (((Float local4) * 15.0) + 10.0))) <> 0) Then
                    If (i_008\Field1 = $00) Then
                        playsound_strict(loadtempsound((("SFX\SCP\008\Voices" + (Str local4)) + ".ogg")), $01, $00)
                    EndIf
                EndIf
            Next
            If (i_008\Field1 <> 0) Then
                If (((20.0 >= i_008\Field0) And (20.0 < local3)) <> 0) Then
                    createmsg(getlocalstring("msg", "better_2"), 6.0)
                ElseIf (((40.0 >= i_008\Field0) And (40.0 < local3)) <> 0) Then
                    createmsg(getlocalstring("msg", "nauseafading"), 6.0)
                ElseIf (((60.0 >= i_008\Field0) And (60.0 < local3)) <> 0) Then
                    createmsg(getlocalstring("msg", "headachefading"), 6.0)
                ElseIf (((80.0 >= i_008\Field0) And (80.0 < local3)) <> 0) Then
                    createmsg(getlocalstring("msg", "moreener"), 6.0)
                EndIf
            ElseIf (((20.0 < i_008\Field0) And (20.0 >= local3)) <> 0) Then
                createmsg(getlocalstring("msg", "feverish"), 6.0)
            ElseIf (((40.0 < i_008\Field0) And (40.0 >= local3)) <> 0) Then
                createmsg(getlocalstring("msg", "nausea"), 6.0)
            ElseIf (((60.0 < i_008\Field0) And (60.0 >= local3)) <> 0) Then
                createmsg(getlocalstring("msg", "nauseaworse"), 6.0)
            ElseIf (((80.0 < i_008\Field0) And (80.0 >= local3)) <> 0) Then
                createmsg(getlocalstring("msg", "faint"), 6.0)
            ElseIf (91.5 <= i_008\Field0) Then
                If (91.5 > local3) Then
                    playsound_strict(loadtempsound("SFX\Character\D9341\Infected.ogg"), $01, $00)
                EndIf
                XZ0260X8X2\Field53 = clamp(((i_008\Field0 - 91.5) * -10.0), XZ0260X8X2\Field53, -10.0)
                makemeunplayable($01)
                If (((92.7 <= i_008\Field0) And (92.7 > local3)) <> 0) Then
                    If (local5 <> 0) Then
                        If (GUESSEDupdatexdb() <> $00) Then
                            XZ0260X8X2\Field38 = $02
                            kill($00, $01, $00, $01)
                            i_008\Field0 = 0.0
                        Else
                            XZ0260X8X2\Field23 = $01
                            msg\Field8 = format(getlocalstring("death", "0081"), subjectname, "%s")
                            If (selecteddifficulty\Field1 >= $02) Then
                                deletegame(currsave)
                                gamesaved = $00
                                loadsavedgames()
                            EndIf
                            For local0 = Each rooms
                                If (local0\Field22\Field21 = $3B) Then
                                    local0\Field27[$07] = copyentity(misc_i\Field6[$06], $00)
                                    scaleentity(local0\Field27[$07], (1.0 / 256.0), (1.0 / 256.0), (1.0 / 256.0), $00)
                                    rotateentity(local0\Field27[$07], 0.0, (Float local0\Field21), 0.0, $00)
                                    tformpoint(0.0, 2048.0, -512.0, local0\Field15, $00)
                                    positionentity(local0\Field27[$07], tformedx(), tformedy(), tformedz(), $01)
                                    entityparent(local0\Field27[$07], local0\Field15, $01)
                                    tformpoint(0.0, 1974.0, -281.0, local0\Field15, $00)
                                    positionentity(XZ0260X8X2\Field74, tformedx(), tformedy(), tformedz(), $01)
                                    resetentity(XZ0260X8X2\Field74)
                                    tformpoint(-160.0, 1974.0, 384.0, local0\Field15, $00)
                                    local0\Field32[$00] = createnpc($16, tformedx(), tformedy(), tformedz())
                                    local0\Field32[$00]\Field66 = -1.0
                                    setnpcframe(local0\Field32[$00], 357.0, $01)
                                    local7 = loadtexture_strict("GFX\NPCs\maintenance(2).png", $01, $00, 1.0)
                                    entitytexture(local0\Field32[$00]\Field98, local7, $00, $00)
                                    deletesingletextureentryfromcache(local7, $00)
                                    playsound_strict(loadtempsound("SFX\SCP\008\KillScientist0.ogg"), $01, $00)
                                    teleporttoroom(local0)
                                    resetinput(10.0)
                                    resetselectedstuff()
                                    Exit
                                EndIf
                            Next
                        EndIf
                    EndIf
                EndIf
            EndIf
        Else
            shouldplay = $1F
            local3 = i_008\Field0
            i_008\Field0 = min((i_008\Field0 + (fps\Field3[$00] * 0.004)), 100.0)
            If ((local5 And (playerroom\Field32[$00] <> Null)) <> 0) Then
                If (94.7 > i_008\Field0) Then
                    entityalpha(X2Z260BF0Z\Field1[$03], (0.5 * local6))
                    XZ0260X8X2\Field64 = 900.0
                    If (94.5 < i_008\Field0) Then
                        XZ0260X8X2\Field53 = clamp(((i_008\Field0 - 94.5) * -50.0), XZ0260X8X2\Field53, -10.0)
                    EndIf
                    pointentity(XZ0260X8X2\Field74, playerroom\Field32[$00]\Field82, 0.0)
                    pointentity(playerroom\Field32[$00]\Field82, XZ0260X8X2\Field74, 0.0)
                    pointentity(camera, playerroom\Field32[$00]\Field82, entityroll(camera, $00, 1.0))
                    XZ0260X8X2\Field21 = 0.75
                    XZ0260X8X2\Field11 = 2.5
                    XZ0260X8X2\Field39 = 0.0
                    XZ0260X8X2\Field38 = $02
                    animatenpc(playerroom\Field32[$00], 357.0, 381.0, 0.3, $01)
                ElseIf (98.5 > i_008\Field0) Then
                    entityalpha(X2Z260BF0Z\Field1[$03], (0.5 * local6))
                    XZ0260X8X2\Field64 = 950.0
                    XZ0260X8X2\Field21 = 0.0
                    pointentity(camera, playerroom\Field32[$00]\Field82, 0.0)
                    If (94.7 > local3) Then
                        setnpcframe(playerroom\Field32[$00], 1.0, $01)
                        playerroom\Field32[$00]\Field1 = $01
                        playsound_strict(loadtempsound("SFX\SCP\008\KillScientist1.ogg"), $01, $00)
                        msg\Field8 = format(getlocalstring("death", "0081"), subjectname, "%s")
                        local2 = createdecal($03, entityx(playerroom\Field32[$00]\Field82, $00, 1.0), ((playerroom\Field3 + 7.375) + 0.005), entityz(playerroom\Field32[$00]\Field82, $00, 1.0), 90.0, rnd(360.0, 0.0), 0.0, 0.8, 1.0, $00, $01, $00, $00, $00)
                        entityparent(local2\Field0, playerroom\Field15, $01)
                        kill($00, $01, $00, $01)
                    ElseIf (96.0 < i_008\Field0) Then
                        XZ0260X8X2\Field53 = clamp(((i_008\Field0 - 96.0) * -10.0), XZ0260X8X2\Field53, -10.0)
                    Else
                        XZ0260X8X2\Field48 = 1.0
                    EndIf
                    If (opt\Field69 > $00) Then
                        If (rand($19, $01) = $01) Then
                            setemitter(Null, entityx(playerroom\Field32[$00]\Field82, $00, 1.0), entityy(playerroom\Field32[$00]\Field82, $00, 1.0), entityz(playerroom\Field32[$00]\Field82, $00, 1.0), $0F)
                        EndIf
                    EndIf
                    positionentity(XZ0260X8X2\Field28, entityx(playerroom\Field32[$00]\Field82, $01, 1.0), (entityy(playerroom\Field32[$00]\Field82, $01, 1.0) + 0.65), entityz(playerroom\Field32[$00]\Field82, $01, 1.0), $01)
                    local6 = sin(((Float millisec) / 5.0))
                    rotateentity(XZ0260X8X2\Field28, ((1.0 + local6) * 15.0), (Float playerroom\Field21), 0.0, $01)
                    moveentity(XZ0260X8X2\Field28, 0.0, 0.0, -0.4, $00)
                    turnentity(XZ0260X8X2\Field28, ((local6 * 30.0) + 80.0), (local6 * 40.0), 0.0, $00)
                EndIf
            Else
                XZ0260X8X2\Field53 = clamp(((i_008\Field0 - 96.0) * -10.0), XZ0260X8X2\Field53, -10.0)
                If (playerroom\Field22\Field21 = $70) Then
                    msg\Field8 = getlocalstring("death", "14991")
                ElseIf (isplayeroutsidefacility() <> 0) Then
                    msg\Field8 = format(getlocalstring("death", "008gate"), subjectname, "{0}")
                    If (playerroom\Field22\Field21 = $4C) Then
                        msg\Field8 = format(msg\Field8, "A", "{1}")
                    Else
                        msg\Field8 = format(msg\Field8, "B", "{1}")
                    EndIf
                Else
                    msg\Field8 = ""
                EndIf
                kill($00, $01, $00, $01)
            EndIf
        EndIf
    Else
        i_008\Field1 = $00
        If (entityhidden(X2Z260BF0Z\Field1[$03]) = $00) Then
            hideentity(X2Z260BF0Z\Field1[$03])
        EndIf
    EndIf
    Return $00
End Function

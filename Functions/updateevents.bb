Function updateevents%()
    Local local0%
    Local local1.npcs
    Local local2.rooms
    Local local3.events
    Local local4.events
    Local local5.decals
    Local local6.dummy1499_1
    Local local7%
    Local local8%
    Local local9%
    Local local10%
    Local local11.items
    Local local12.items
    Local local13.securitycams
    Local local14%
    Local local15%
    Local local16.doors
    Local local17.screens
    Local local18.emitter
    Local local19.itemtemplates
    Local local20%
    Local local21%
    Local local22%
    Local local23%
    Local local24$
    Local local25%
    Local local26#
    Local local27#
    Local local28%
    Local local29%
    Local local30$
    Local local31#
    Local local32#
    Local local33#
    Local local34#
    Local local35#
    Local local36#
    Local local37#
    Local local38#
    Local local39#
    Local local40#
    Local local41#
    Local local42%
    Local local43%
    Local local44%
    Local local45$
    Local local46%
    Local local47%
    Local local48#
    Local local49#
    Local local50#
    Local local51#
    Local local53%
    Local local55#
    Local local57#
    Local local58%
    Local local61%
    Local local62%
    Local local63%
    Local local64.forest
    Local local66%
    Local local67%
    Local local68%
    Local local69$
    Local local71%
    Local local77%
    Local local78%
    Local local79%
    Local local80.rooms
    Local local81.rooms
    Local local82#
    Local local87#
    Local local88#
    Local local90%
    Local local91%
    Local local95#
    Local local99#
    Local local100#
    Local local101$
    Local local102.doors
    Local local103.doors
    Local local105%
    Local local106%
    Local local107%
    Local local108#
    Local local109%
    Local local110#
    Local local112%
    Local local113#
    Local local114#
    Local local115%
    Local local116%
    Local local118%
    Local local119%
    Local local120%
    Local local123#
    Local local124#
    Local local128%
    Local local129%
    If (GUESSEDupdatexdb() <> $00) Then
        Return MP_UpdateEvents()
    EndIf
    catcherrors("UpdateEvents()")
    For local3 = Each events
        Select local3\Field32
            Case $03
                If (0.0 = local3\Field4) Then
                    If (playerroom = local3\Field19) Then
                        local3\Field19\Field25[$01]\Field39 = $01
                        If (selecteddifficulty\Field1 = $00) Then
                            createhintmsg(format(getlocalstring("save", "save"), key\Field0[key\Field15], "%s"), 6.0, $01)
                        ElseIf (selecteddifficulty\Field1 = $01) Then
                            createhintmsg(getlocalstring("save", "failed.screen"), 6.0, $01)
                        EndIf
                        n_i\Field3\Field31 = 1.0
                        local3\Field19\Field25[$00]\Field39 = $01
                        If (local3\Field19\Field32[$00] <> Null) Then
                            local3\Field19\Field32[$00]\Field66 = 8.0
                            setnpcframe(local3\Field19\Field32[$00], 74.0, $01)
                        EndIf
                        If (local3\Field19\Field32[$01] <> Null) Then
                            positionentity(local3\Field19\Field32[$01]\Field82, local3\Field19\Field40, (local3\Field19\Field3 + 0.3), ((local3\Field19\Field37 - 1.0) + 8.0), $01)
                            resetentity(local3\Field19\Field32[$01]\Field82)
                        Else
                            local3\Field19\Field32[$01] = createnpc($16, local3\Field19\Field40, (local3\Field19\Field3 + 0.3), ((local3\Field19\Field37 - 1.0) + 8.0))
                            changenpctextureid(local3\Field19\Field32[$01], $05)
                        EndIf
                        setnpcframe(local3\Field19\Field32[$01], 210.0, $01)
                        local3\Field19\Field32[$01]\Field55 = loadsound_strict("SFX\Room\Intro\WhatThe0a.ogg")
                        If (local3\Field19\Field32[$02] <> Null) Then
                            positionentity(local3\Field19\Field32[$02]\Field82, local3\Field19\Field40, (local3\Field19\Field3 + 0.3), (local3\Field19\Field37 + 10.0625), $01)
                            resetentity(local3\Field19\Field32[$02]\Field82)
                        Else
                            local3\Field19\Field32[$02] = createnpc($17, local3\Field19\Field40, (local3\Field19\Field3 + 0.3), (local3\Field19\Field37 + 10.0625))
                        EndIf
                        local3\Field19\Field32[$02]\Field66 = 7.0
                        local3\Field19\Field32[$02]\Field55 = loadsound_strict("SFX\Room\Intro\WhatThe0b.ogg")
                        pointentity(local3\Field19\Field32[$02]\Field82, local3\Field19\Field32[$01]\Field82, 0.0)
                        pointentity(local3\Field19\Field32[$01]\Field82, local3\Field19\Field32[$02]\Field82, 0.0)
                        If (local3\Field19\Field32[$00] = Null) Then
                            tformpoint(3512.0, 842.0, 4682.0, local3\Field19\Field15, $00)
                            local3\Field19\Field32[$03] = createnpc($17, tformedx(), tformedy(), tformedz())
                            local3\Field19\Field32[$03]\Field66 = 8.0
                            local3\Field19\Field32[$03]\Field1 = $01
                            setnpcframe(local3\Field19\Field32[$03], 286.0, $01)
                            rotateentity(local3\Field19\Field32[$03]\Field82, 0.0, ((Float local3\Field19\Field21) + 90.0), 0.0, $01)
                            tformpoint(4712.0, 435.8, 4026.0, local3\Field19\Field15, $00)
                            local3\Field19\Field32[$04] = createnpc($16, tformedx(), tformedy(), tformedz())
                            local3\Field19\Field32[$04]\Field57 = -1.0
                            local3\Field19\Field32[$04]\Field1 = $01
                            setnpcframe(local3\Field19\Field32[$04], 677.0, $01)
                            rotateentity(local3\Field19\Field32[$04]\Field82, 0.0, ((Float local3\Field19\Field21) + 270.0), 0.0, $01)
                            tformpoint(4340.0, 435.8, 3680.0, local3\Field19\Field15, $00)
                            local3\Field19\Field32[$05] = createnpc($16, tformedx(), tformedy(), tformedz())
                            local3\Field19\Field32[$05]\Field57 = -1.0
                            local3\Field19\Field32[$05]\Field1 = $01
                            changenpctextureid(local3\Field19\Field32[$05], $07)
                            setnpcframe(local3\Field19\Field32[$05], 779.0, $01)
                            rotateentity(local3\Field19\Field32[$05]\Field82, 0.0, ((Float local3\Field19\Field21) + 270.0), 0.0, $01)
                            If (local3\Field19\Field32[$07] <> Null) Then
                                positionentity(local3\Field19\Field32[$07]\Field82, (local3\Field19\Field40 + 0.125), (local3\Field19\Field3 + 0.2), (local3\Field19\Field37 + 12.17188), $00)
                                resetentity(local3\Field19\Field32[$07]\Field82)
                            Else
                                local3\Field19\Field32[$07] = createnpc($16, (local3\Field19\Field40 + 0.125), (local3\Field19\Field3 + 0.2), (local3\Field19\Field37 + 12.17188))
                                changenpctextureid(local3\Field19\Field32[$07], $04)
                            EndIf
                            rotateentity(local3\Field19\Field32[$07]\Field82, 0.0, ((Float local3\Field19\Field21) + 180.0), 0.0, $00)
                            playsound_strict(loadtempsound("SFX\Room\Intro\173Vent.ogg"), $00, $00)
                            XZ0260X8X2\Field71 = 35.0
                            XZ0260X8X2\Field53 = -10.0
                            XZ0260X8X2\Field8 = 1.0
                            XZ0260X8X2\Field14 = 3.0
                            playsound_strict(snd_i\Field5[rand($00, $02)], $00, $00)
                        EndIf
                    EndIf
                    XZ0260X8X2\Field76 = 0.0
                    XZ0260X8X2\Field38 = $02
                    local3\Field4 = 1.0
                Else
                    If ((local3\Field19\Field3 + 1.5) < entityy(local3\Field19\Field27[$02], $01, 1.0)) Then
                        local3\Field23 = curvevalue((local3\Field23 + (fps\Field3[$00] * 2.0)), local3\Field23, 40.0)
                        positionentity(local3\Field19\Field27[$02], entityx(local3\Field19\Field27[$02], $01, 1.0), max((local3\Field19\Field3 + 1.5), ((local3\Field19\Field3 + 4.5) - local3\Field23)), entityz(local3\Field19\Field27[$02], $01, 1.0), $01)
                        rotateentity(local3\Field19\Field27[$02], entitypitch(local3\Field19\Field27[$02], $01, 1.0), curvevalue(30.0, entityyaw(local3\Field19\Field27[$02], $01, 1.0), 200.0), entityroll(local3\Field19\Field27[$02], $01, 1.0), $01)
                        If (0.36 > entitydistancesquared(local3\Field19\Field27[$02], XZ0260X8X2\Field74)) Then
                            If ((local3\Field19\Field3 + 2.5) > entityy(local3\Field19\Field27[$02], $01, 1.0)) Then
                                If (((chs\Field0 = $00) And (0.0 = XZ0260X8X2\Field48)) <> 0) Then
                                    playsound_strict(loadtempsound("SFX\Character\BodyFall.ogg"), $00, $00)
                                    msg\Field8 = format(getlocalstring("death", "vent"), subjectname, "%s")
                                    kill($01, $01, $00, $01)
                                EndIf
                            EndIf
                        EndIf
                    EndIf
                    If (local3\Field19\Field32[$00] <> Null) Then
                        animatenpc(local3\Field19\Field32[$00], 249.0, 286.0, 0.4, $00)
                    EndIf
                    If ((local3\Field19\Field40 + 5.40625) > entityx(XZ0260X8X2\Field74, $00, 1.0)) Then
                        local3\Field4 = max(local3\Field4, 900.0)
                    EndIf
                    If (500.0 <= local3\Field4) Then
                        local3\Field4 = (local3\Field4 + fps\Field3[$00])
                    ElseIf (5.0 > entitydistancesquared(XZ0260X8X2\Field74, local3\Field19\Field25[$02]\Field51)) Then
                        local3\Field4 = 500.0
                    EndIf
                    If (500.0 <= local3\Field4) Then
                        If (0.0 = local3\Field7) Then
                            If (((900.0 < local3\Field4) And local3\Field19\Field25[$03]\Field39) <> 0) Then
                                If (900.0 >= (local3\Field4 - fps\Field3[$00])) Then
                                    positionentity(n_i\Field3\Field82, (local3\Field19\Field40 + 0.125), (local3\Field19\Field3 + 0.32), (local3\Field19\Field37 + 12.4375), $01)
                                    resetentity(n_i\Field3\Field82)
                                    rotateentity(n_i\Field3\Field82, 0.0, 190.0, 0.0, $00)
                                    local3\Field19\Field32[$07]\Field57 = 2.0
                                    local3\Field19\Field32[$07]\Field1 = $01
                                    playsoundex(snd_i\Field35[$00], camera, local3\Field19\Field32[$07]\Field82, 8.0, 1.0, $00, $00)
                                    playsound_strict(snd_i\Field5[rand($00, $02)], $00, $00)
                                    XZ0260X8X2\Field8 = 3.0
                                    XZ0260X8X2\Field53 = -10.0
                                    playsoundex(snd_i\Field30, camera, n_i\Field3\Field82, 10.0, 1.0, $00, $00)
                                    local3\Field19\Field32[$01]\Field63 = playsoundex(local3\Field19\Field32[$01]\Field55, camera, local3\Field19\Field32[$01]\Field82, 10.0, 1.0, $01, $00)
                                    local3\Field19\Field32[$01]\Field66 = 1.0
                                    local3\Field19\Field32[$02]\Field63 = playsoundex(local3\Field19\Field32[$02]\Field55, camera, local3\Field19\Field32[$02]\Field82, 10.0, 1.0, $01, $00)
                                EndIf
                                local3\Field19\Field32[$01]\Field32 = -0.008
                                local3\Field19\Field32[$01]\Field64 = curvevalue(local3\Field19\Field32[$01]\Field32, local3\Field19\Field32[$01]\Field64, 5.0)
                                rotateentity(local3\Field19\Field32[$01]\Field82, 0.0, 0.0, 0.0, $00)
                                If (1075.0 < local3\Field4) Then
                                    If (1.0 <> local3\Field19\Field32[$02]\Field66) Then
                                        local3\Field19\Field32[$02]\Field64 = curvevalue(-0.012, local3\Field19\Field32[$02]\Field64, 5.0)
                                        animatenpc(local3\Field19\Field32[$02], 39.0, 76.0, (local3\Field19\Field32[$02]\Field64 * 40.0), $01)
                                        moveentity(local3\Field19\Field32[$02]\Field82, 0.0, 0.0, (local3\Field19\Field32[$02]\Field64 * fps\Field3[$00]), $00)
                                        local3\Field19\Field32[$02]\Field66 = 8.0
                                        If ((local3\Field19\Field37 + 8.0) > entityz(local3\Field19\Field32[$02]\Field82, $00, 1.0)) Then
                                            pointentity(local3\Field19\Field32[$02]\Field98, local3\Field19\Field32[$01]\Field82, 0.0)
                                            rotateentity(local3\Field19\Field32[$02]\Field82, 0.0, curveangle((entityyaw(local3\Field19\Field32[$02]\Field98, $00, 1.0) - 180.0), entityyaw(local3\Field19\Field32[$02]\Field82, $00, 1.0), 15.0), 0.0, $00)
                                        Else
                                            rotateentity(local3\Field19\Field32[$02]\Field82, 0.0, 0.0, 0.0, $00)
                                        EndIf
                                    EndIf
                                EndIf
                                If (1180.0 > local3\Field4) Then
                                    If (((970.0 < local3\Field4) And (1075.0 > local3\Field4)) <> 0) Then
                                        animatenpc(local3\Field19\Field32[$02], 1539.0, 1553.0, 0.2, $00)
                                        pointentity(local3\Field19\Field32[$02]\Field98, n_i\Field3\Field82, 0.0)
                                        rotateentity(local3\Field19\Field32[$02]\Field82, 0.0, curveangle(entityyaw(local3\Field19\Field32[$02]\Field98, $00, 1.0), entityyaw(local3\Field19\Field32[$02]\Field82, $00, 1.0), 15.0), 0.0, $00)
                                    EndIf
                                Else
                                    If (1180.0 > (local3\Field4 - fps\Field3[$00])) Then
                                        playsound_strict(snd_i\Field5[rand($00, $02)], $00, $00)
                                        XZ0260X8X2\Field8 = 3.0
                                        XZ0260X8X2\Field53 = -10.0
                                        playsoundex(snd_i\Field30, camera, n_i\Field3\Field82, 10.0, 1.0, $00, $00)
                                        pointentity(n_i\Field3\Field82, local3\Field19\Field32[$02]\Field82, 0.0)
                                    EndIf
                                    positionentity(n_i\Field3\Field82, (local3\Field19\Field40 - 0.375), (local3\Field19\Field3 + 0.32), (local3\Field19\Field37 + 10.3125), $01)
                                    resetentity(n_i\Field3\Field82)
                                    rotateentity(n_i\Field3\Field82, 0.0, 190.0, 0.0, $00)
                                    n_i\Field3\Field31 = (Float ($01 - (0.25 <= XZ0260X8X2\Field8)))
                                    If (((1.0 <> local3\Field19\Field32[$02]\Field66) And (0.0 = XZ0260X8X2\Field48)) <> 0) Then
                                        If ((local3\Field19\Field37 + 3.507812) > entityz(local3\Field19\Field32[$02]\Field82, $00, 1.0)) Then
                                            local3\Field19\Field25[$03]\Field39 = $00
                                            XZ0260X8X2\Field8 = 3.0
                                            XZ0260X8X2\Field53 = -10.0
                                            playsound_strict(snd_i\Field5[rand($00, $02)], $00, $00)
                                            n_i\Field3\Field31 = 0.0
                                            If (((6.25 > entitydistancesquared(n_i\Field3\Field82, XZ0260X8X2\Field74)) And isequal(entityy(XZ0260X8X2\Field74, $00, 1.0), entityy(n_i\Field3\Field82, $00, 1.0), 1.0)) <> 0) Then
                                                positionentity(n_i\Field3\Field82, entityx(XZ0260X8X2\Field74, $00, 1.0), entityy(XZ0260X8X2\Field74, $00, 1.0), entityz(XZ0260X8X2\Field74, $00, 1.0), $00)
                                            Else
                                                playsoundex(snd_i\Field30, camera, n_i\Field3\Field82, 10.0, 1.0, $00, $00)
                                                createhintmsg(format(getlocalstring("msg", "run"), key\Field0[key\Field12], "%s"), 6.0, $01)
                                                positionentity(n_i\Field3\Field82, 0.0, -500.0, 0.0, $00)
                                            EndIf
                                            resetentity(n_i\Field3\Field82)
                                        EndIf
                                    EndIf
                                EndIf
                                If (((((chs\Field8 Lor i_268\Field3) = $00) And (9.0 > entitydistancesquared(XZ0260X8X2\Field74, local3\Field19\Field32[$02]\Field82))) And entityvisible(local3\Field19\Field32[$02]\Field82, XZ0260X8X2\Field74, 0.0)) <> 0) Then
                                    local3\Field19\Field32[$02]\Field66 = 1.0
                                    local3\Field19\Field32[$02]\Field57 = 1.0
                                ElseIf (((1.0 = local3\Field19\Field32[$02]\Field66) And (entityvisible(local3\Field19\Field32[$02]\Field82, XZ0260X8X2\Field74, 0.0) = $00)) <> 0) Then
                                    local3\Field19\Field32[$02]\Field66 = 0.0
                                    local3\Field19\Field32[$02]\Field57 = 0.0
                                EndIf
                                If (1.0 = local3\Field19\Field32[$02]\Field66) Then
                                    local3\Field19\Field25[$03]\Field39 = $01
                                EndIf
                            ElseIf (1.0 <> local3\Field19\Field32[$02]\Field66) Then
                                If (0.0 = local3\Field19\Field25[$03]\Field13) Then
                                    For local20 = $01 To $02 Step $01
                                        removenpc(local3\Field19\Field32[local20])
                                    Next
                                    local3\Field7 = 1.0
                                EndIf
                            EndIf
                        EndIf
                        If (local3\Field19\Field27[$01] <> $00) Then
                            If (rand($12C, $01) = $02) Then
                                If (6.25 > entitydistancesquared(local3\Field19\Field27[$00], XZ0260X8X2\Field74)) Then
                                    playsoundex(snd_i\Field1[rand($03, $01)], camera, local3\Field19\Field27[$00], 3.0, 1.0, $00, $00)
                                EndIf
                            EndIf
                            If ((local3\Field19\Field3 - (1.0 / 2.56)) < entityy(local3\Field19\Field27[$01], $01, 1.0)) Then
                                positionentity(local3\Field19\Field27[$00], entityx(local3\Field19\Field27[$00], $01, 1.0), ((- max((local3\Field4 - 1300.0), 0.0)) / 4500.0), entityz(local3\Field19\Field27[$00], $01, 1.0), $01)
                                rotateentity(local3\Field19\Field27[$00], (90.0 - (max((local3\Field4 - 1320.0), 0.0) / 130.0)), 45.0, ((- max((local3\Field4 - 1300.0), 0.0)) / 40.0), $01)
                                positionentity(local3\Field19\Field27[$01], entityx(local3\Field19\Field27[$01], $01, 1.0), ((- max((local3\Field4 - 1800.0), 0.0)) / 5000.0), entityz(local3\Field19\Field27[$01], $01, 1.0), $01)
                                rotateentity(local3\Field19\Field27[$01], ((- max((local3\Field4 - 2040.0), 0.0)) / 135.0), 225.0, (90.0 - (max((local3\Field4 - 2040.0), 0.0) / 43.0)), $01)
                            Else
                                For local20 = $00 To $01 Step $01
                                    freeentity(local3\Field19\Field27[local20])
                                    local3\Field19\Field27[local20] = $00
                                Next
                            EndIf
                        EndIf
                    EndIf
                    local53 = playerinreachableroom($01, $00, $01)
                    If (((2000.0 > local3\Field4) And local53) <> 0) Then
                        local3\Field2 = loopsoundex(roomambience[$05], local3\Field2, camera, local3\Field19\Field15, 100.0, 1.0, $00)
                    EndIf
                    If (11.0 > local3\Field1) Then
                        If (ChannelPlaying(local3\Field8) = $00) Then
                            local3\Field1 = (local3\Field1 + 1.0)
                            If (local53 <> 0) Then
                                loadeventsound(local3, (("SFX\Alarm\Alarm1_" + (Str (Int local3\Field1))) + ".ogg"), $01)
                                local3\Field8 = playsound_strict(local3\Field30, (1.0 = local3\Field1), $00)
                            EndIf
                        ElseIf (((8.0 = (Float (Int local3\Field1))) And local53) <> 0) Then
                            XZ0260X8X2\Field14 = 1.0
                        EndIf
                    EndIf
                    If (((300.0 < (local3\Field4 Mod 600.0)) And (300.0 > ((local3\Field4 + fps\Field3[$00]) Mod 600.0))) <> 0) Then
                        local20 = (Int (floor(((local3\Field4 - 5000.0) / 600.0)) + 1.0))
                        Select local20
                            Case $00
                                If (local53 <> 0) Then
                                    playsound_strict(loadtempsound("SFX\Room\Intro\IA\Scripted\Scripted5.ogg"), $00, $00)
                                EndIf
                                createhintmsg(format(getlocalstring("msg", "crouch"), key\Field0[key\Field4], "%s"), 6.0, $01)
                            Case $01
                                createhintmsg(format(getlocalstring("msg", "lean.left"), key\Field0[key\Field19], "%s"), 6.0, $01)
                            Case $02
                                createhintmsg(format(getlocalstring("msg", "lean.right"), key\Field0[key\Field18], "%s"), 6.0, $01)
                            Case $04
                                createhintmsg(getlocalstring("msg", "item.combine.swap"), 6.0, $01)
                            Case $05
                                createhintmsg(getlocalstring("msg", "right.click"), 6.0, $01)
                        End Select
                        If (((local20 > $00) And (local20 < $1A)) <> 0) Then
                            If (commotionstate[local20] = $00) Then
                                If (local53 <> 0) Then
                                    playsound_strict(loadtempsound((("SFX\Room\Intro\Commotion\Commotion" + (Str (local20 - $01))) + ".ogg")), $00, $00)
                                    commotionstate[local20] = $01
                                EndIf
                            EndIf
                        EndIf
                        If (local20 > $1A) Then
                            removeevent(local3)
                        EndIf
                    EndIf
                EndIf
            Case $02
                If (i_005\Field0 = $01) Then
                    If (playerroom = local3\Field19) Then
                        If (n_i\Field2\Field93 = $00) Then
                            If (0.0 = local3\Field4) Then
                                If (local3\Field19\Field27[$00] = $00) Then
                                    tformpoint(0.0, 0.0, 238.0, local3\Field19\Field15, $00)
                                    local3\Field19\Field27[$00] = createpivot($00)
                                    positionentity(local3\Field19\Field27[$00], tformedx(), tformedy(), tformedz(), $00)
                                    entityparent(local3\Field19\Field27[$00], local3\Field19\Field15, $01)
                                ElseIf ((chs\Field8 Lor i_268\Field3) = $00) Then
                                    If (1.69 > distancesquared(entityx(XZ0260X8X2\Field74, $01, 1.0), entityx(local3\Field19\Field27[$00], $01, 1.0), entityz(XZ0260X8X2\Field74, $01, 1.0), entityz(local3\Field19\Field27[$00], $01, 1.0), 0.0, 0.0)) Then
                                        playsound_strict(snd_i\Field40[$0A], $00, $00)
                                        tformpoint(0.0, 188.0, 459.0, local3\Field19\Field15, $00)
                                        local5 = createdecal($00, tformedx(), tformedy(), tformedz(), 0.0, (Float local3\Field19\Field21), rnd(360.0, 0.0), 0.1, 0.01, $00, $01, $00, $00, $00)
                                        local5\Field14 = 0.003
                                        local5\Field5 = 0.005
                                        local5\Field1 = 90000.0
                                        entityparent(local5\Field0, local3\Field19\Field15, $01)
                                        local5 = createdecal($00, entityx(local3\Field19\Field25[$00]\Field51, $01, 1.0), (entityy(local3\Field19\Field25[$00]\Field51, $01, 1.0) + 0.005), entityz(local3\Field19\Field25[$00]\Field51, $01, 1.0), 90.0, ((Float local3\Field19\Field21) + 360.0), rnd(360.0, 0.0), 0.1, 0.01, $00, $01, $00, $00, $00)
                                        local5\Field14 = 0.003
                                        local5\Field5 = 0.005
                                        local5\Field1 = 90000.0
                                        entityparent(local5\Field0, local3\Field19\Field15, $01)
                                        tformpoint(0.0, 0.0, 585.0, local3\Field19\Field15, $00)
                                        positionentity(n_i\Field2\Field82, tformedx(), 0.0, tformedz(), $01)
                                        resetentity(n_i\Field2\Field82)
                                        n_i\Field2\Field66 = 3.0
                                        n_i\Field2\Field65 = rnd(3000.0, 3500.0)
                                        freeentity(local3\Field19\Field27[$00])
                                        local3\Field19\Field27[$00] = $00
                                        local3\Field4 = 1.0
                                    EndIf
                                EndIf
                            Else
                                local41 = distancesquared(entityx(XZ0260X8X2\Field74, $00, 1.0), entityx(local3\Field19\Field25[$00]\Field51, $00, 1.0), entityz(XZ0260X8X2\Field74, $00, 1.0), entityz(local3\Field19\Field25[$00]\Field51, $00, 1.0), 0.0, 0.0)
                                If ((((0.16 > local41) And (0.0 < local3\Field19\Field25[$00]\Field13)) And (chs\Field8 = $00)) <> 0) Then
                                    If (0.0 = local3\Field7) Then
                                        playsound_strict(loadtempsound("SFX\Room\SinkholeFall.ogg"), $00, $00)
                                    EndIf
                                    makemeunplayable($01)
                                    local34 = curvevalue(entityx(local3\Field19\Field25[$00]\Field51, $00, 1.0), entityx(XZ0260X8X2\Field74, $00, 1.0), 10.0)
                                    local35 = curvevalue((entityy(local3\Field19\Field25[$00]\Field51, $00, 1.0) - local3\Field7), entityy(XZ0260X8X2\Field74, $00, 1.0), 25.0)
                                    local36 = curvevalue(entityz(local3\Field19\Field25[$00]\Field51, $00, 1.0), entityz(XZ0260X8X2\Field74, $00, 1.0), 10.0)
                                    positionentity(XZ0260X8X2\Field74, local34, local35, local36, $01)
                                    XZ0260X8X2\Field16 = 0.0
                                    resetentity(XZ0260X8X2\Field74)
                                    local3\Field7 = min((local3\Field7 + (fps\Field3[$00] / 200.0)), 2.0)
                                    XZ0260X8X2\Field8 = min((local3\Field7 * 5.0), 10.0)
                                    If (0.2 <= local3\Field7) Then
                                        XZ0260X8X2\Field53 = -10.0
                                        If (3.0 = n_i\Field2\Field66) Then
                                            n_i\Field2\Field64 = 0.0
                                        EndIf
                                    EndIf
                                    XZ0260X8X2\Field64 = (local3\Field7 * 500.0)
                                    If (2.0 = local3\Field7) Then
                                        movetopocketdimension()
                                    EndIf
                                ElseIf (chs\Field7 <> 0) Then
                                    XZ0260X8X2\Field38 = $02
                                EndIf
                            EndIf
                        Else
                            removeevent(local3)
                        EndIf
                    Else
                        local3\Field7 = 0.0
                    EndIf
                ElseIf (7.0 > local3\Field19\Field39) Then
                    local3\Field19\Field22\Field20 = $01
                    If (i_005\Field0 = $03) Then
                        tformpoint(375.0, 71.0, -875.0, local3\Field19\Field15, $00)
                        local1 = createnpc($17, tformedx(), tformedy(), tformedz())
                        local1\Field66 = 8.0
                        local1\Field1 = $01
                        setnpcframe(local1, 287.0, $01)
                        rotateentity(local1\Field82, 0.0, ((Float local3\Field19\Field21) + 90.0), 0.0, $01)
                        tformpoint(382.0, 150.0, -875.0, local3\Field19\Field15, $00)
                        local5 = createdecal($03, tformedx(), tformedy(), tformedz(), 0.0, ((Float local3\Field19\Field21) + 270.0), 0.0, 0.3, 1.0, $00, $01, $00, $00, $00)
                        entityparent(local5\Field0, local3\Field19\Field15, $01)
                    Else
                        tformpoint(-296.0, 71.0, -240.0, local3\Field19\Field15, $00)
                        local1 = createnpc($17, tformedx(), tformedy(), tformedz())
                        local1\Field66 = 8.0
                        local1\Field1 = $01
                        setnpcframe(local1, 288.0, $01)
                        rotateentity(local1\Field82, 0.0, ((Float local3\Field19\Field21) + 125.0), 0.0, $01)
                    EndIf
                    removeevent(local3)
                EndIf
            Case $16
                If (playerroom = local3\Field19) Then
                    If (-15.10938 > entityy(XZ0260X8X2\Field74, $00, 1.0)) Then
                        If (0.0 = local3\Field4) Then
                            tformpoint(-2260.0, -4985.0, 1000.0, local3\Field19\Field15, $00)
                            local1 = createnpc($17, tformedx(), tformedy(), tformedz())
                            local1\Field66 = 8.0
                            local1\Field1 = $01
                            setnpcframe(local1, 288.0, $01)
                            rotateentity(local1\Field82, 0.0, ((Float local3\Field19\Field21) + 180.0), 0.0, $01)
                            tformpoint(-2220.0, -5056.0, 1000.0, local3\Field19\Field15, $00)
                            local5 = createdecal($03, tformedx(), (tformedy() + 0.005), tformedz(), 90.0, rnd(360.0, 0.0), 0.0, 0.5, 1.0, $00, $01, $00, $00, $00)
                            entityparent(local5\Field0, local3\Field19\Field15, $01)
                            tformpoint(-897.0, -4902.0, 783.0, local3\Field19\Field15, $00)
                            local11 = createitem("Document SCP-079", $00, tformedx(), tformedy(), tformedz(), $00, $00, $00, 1.0, $00)
                            rotateentity(local11\Field9, 0.0, (Float local3\Field19\Field21), 0.0, $00)
                            entitytype(local11\Field9, $03, $00)
                            local3\Field4 = 1.0
                        EndIf
                        If (entityhidden(local3\Field19\Field27[$00]) <> 0) Then
                            showentity(local3\Field19\Field27[$00])
                        EndIf
                        shouldplay = $04
                        If (remotedooron <> 0) Then
                            local3\Field19\Field25[$00]\Field21 = $02
                        Else
                            local3\Field19\Field25[$00]\Field21 = $00
                            If (1.0 = local3\Field4) Then
                                If (9.0 > entitydistancesquared(local3\Field19\Field27[$00], XZ0260X8X2\Field74)) Then
                                    giveachievement("079", $01)
                                    If (local3\Field2 <> $00) Then
                                        stopstream_strict(local3\Field2)
                                        local3\Field2 = $00
                                        local3\Field20 = $00
                                    EndIf
                                    local3\Field2 = streamsound_strict("SFX\SCP\079\Speech.ogg", (opt\Field59 * opt\Field2), $00)
                                    local3\Field20 = $01
                                    local3\Field4 = 2.0
                                    local3\Field7 = 1.0
                                EndIf
                            ElseIf (2.0 <= local3\Field4) Then
                                local3\Field4 = (local3\Field4 + fps\Field3[$00])
                                If (5000.0 < local3\Field4) Then
                                    If (6.25 > entitydistancesquared(local3\Field19\Field27[$00], XZ0260X8X2\Field74)) Then
                                        If (local3\Field2 <> $00) Then
                                            stopstream_strict(local3\Field2)
                                            local3\Field2 = $00
                                            local3\Field20 = $00
                                        EndIf
                                        local3\Field2 = streamsound_strict("SFX\SCP\079\Refuse.ogg", (opt\Field59 * opt\Field2), $00)
                                        local3\Field20 = $01
                                        local3\Field4 = 1.5
                                    EndIf
                                EndIf
                            EndIf
                            If (local3\Field2 <> $00) Then
                                If (isstreamplaying_strict(local3\Field2) <> 0) Then
                                    If (rand($04, $01) = $01) Then
                                        local3\Field1 = (Float (Int ((local3\Field1 + 1.0) Mod 6.0)))
                                        entitytexture(local3\Field19\Field27[$01], mon_i\Field2[$04], (Int local3\Field1), $00)
                                        If (entityhidden(local3\Field19\Field27[$01]) <> 0) Then
                                            showentity(local3\Field19\Field27[$01])
                                        EndIf
                                    ElseIf (rand($0A, $01) = $01) Then
                                        If (entityhidden(local3\Field19\Field27[$01]) = $00) Then
                                            hideentity(local3\Field19\Field27[$01])
                                        EndIf
                                    EndIf
                                Else
                                    stopstream_strict(local3\Field2)
                                    local3\Field2 = $00
                                    local3\Field20 = $00
                                EndIf
                            ElseIf (1.0 < local3\Field4) Then
                                If (entityhidden(local3\Field19\Field27[$01]) <> 0) Then
                                    showentity(local3\Field19\Field27[$01])
                                EndIf
                                If (rand($04, $01) = $01) Then
                                    local3\Field1 = (Float (Int ((local3\Field1 + 1.0) Mod 12.0)))
                                EndIf
                                entitytexture(local3\Field19\Field27[$01], mon_i\Field2[$03], (Int local3\Field1), $00)
                            EndIf
                        EndIf
                    ElseIf (entityhidden(local3\Field19\Field27[$00]) = $00) Then
                        hideentity(local3\Field19\Field27[$00])
                    EndIf
                    local34 = entityx(XZ0260X8X2\Field74, $01, 1.0)
                    local35 = entityy(XZ0260X8X2\Field74, $01, 1.0)
                    local36 = entityz(XZ0260X8X2\Field74, $01, 1.0)
                    XZ0260X8X2\Field27 = (isinsideelevator(local34, local35, local36, local3\Field19\Field27[$02]) Lor isinsideelevator(local34, local35, local36, local3\Field19\Field27[$03]))
                    toelevatorfloor = $FFFFFFFF
                    local3\Field23 = updateelevators(local3\Field23, local3\Field19\Field25[$01], local3\Field19\Field25[$02], local3\Field19\Field27[$02], local3\Field19\Field27[$03], local3, $01, $00)
                EndIf
                If (1.0 = local3\Field7) Then
                    If (remotedooron <> 0) Then
                        If (local3\Field2 <> $00) Then
                            stopstream_strict(local3\Field2)
                            local3\Field2 = $00
                            local3\Field20 = $00
                        EndIf
                        local3\Field2 = streamsound_strict("SFX\SCP\079\GateB.ogg", (opt\Field59 * opt\Field2), $00)
                        local3\Field20 = $01
                        For local4 = Each events
                            If (((local4\Field32 = $2C) Lor (local4\Field32 = $2E)) <> 0) Then
                                local4\Field1 = 1.0
                            EndIf
                            If (local4\Field32 = $29) Then
                                local4\Field4 = 1.0
                            EndIf
                        Next
                        local3\Field7 = 2.0
                    EndIf
                EndIf
            Case $17
                If (soundtransmission <> 0) Then
                    If (ChannelPlaying(local3\Field8) = $00) Then
                        local3\Field8 = playsound_strict(snd_i\Field20, $00, $00)
                    EndIf
                EndIf
                If (((soundtransmission Lor (2500.0 <= (local3\Field1 + fps\Field3[$00]))) And (1.0 = local3\Field4)) <> 0) Then
                    local3\Field1 = min((local3\Field1 + fps\Field3[$00]), 4000.0)
                EndIf
                If (playerroom = local3\Field19) Then
                    If (local3\Field19\Field32[$00] <> Null) Then
                        If (-25.0 > entityy(XZ0260X8X2\Field74, $00, 1.0)) Then
                            shouldplay = $19
                            XZ0260X8X2\Field10 = $01
                            local23 = (Int local3\Field7)
                            local55 = (Float updatelever(local3\Field19\Field9[$00]\Field1, ((-32.49219 > entityy(local3\Field19\Field27[$01], $01, 1.0)) And (-33.60547 < entityy(local3\Field19\Field27[$01], $01, 1.0))), $50, -80.0))
                            If (((grabbedentity = local3\Field19\Field9[$00]\Field1) And (handentity <> $00)) <> 0) Then
                                local3\Field7 = local55
                            EndIf
                            If ((Float local23) <> local3\Field7) Then
                                If (0.0 = local3\Field7) Then
                                    playsound_strict(loadtempsound("SFX\Room\106Chamber\MagnetDown.ogg"), $00, $00)
                                Else
                                    playsound_strict(loadtempsound("SFX\Room\106Chamber\MagnetUp.ogg"), $00, $00)
                                EndIf
                            EndIf
                            local23 = updatelever(local3\Field19\Field9[$01]\Field1, $00, $50, -80.0)
                            If (soundtransmission <> local23) Then
                                If (soundtransmission <> 0) Then
                                    If (ChannelPlaying(local3\Field2) <> 0) Then
                                        ChannelVolume(local3\Field2, 0.0)
                                    Else
                                        local3\Field2 = $00
                                    EndIf
                                    If (ChannelPlaying(local3\Field8) <> 0) Then
                                        ChannelVolume(local3\Field8, 0.0)
                                    Else
                                        local3\Field8 = $00
                                    EndIf
                                Else
                                    ChannelVolume(local3\Field2, (opt\Field59 * opt\Field2))
                                    ChannelVolume(local3\Field8, (opt\Field59 * opt\Field2))
                                EndIf
                                soundtransmission = local23
                            EndIf
                            local37 = entityx(local3\Field19\Field27[$01], $01, 1.0)
                            local38 = entityy(local3\Field19\Field27[$01], $01, 1.0)
                            local39 = entityz(local3\Field19\Field27[$01], $01, 1.0)
                            If (local3\Field19\Field32[$01] <> Null) Then
                                positionentity(local3\Field19\Field32[$01]\Field82, local37, local38, local39, $01)
                                resetentity(local3\Field19\Field32[$01]\Field82)
                            EndIf
                            If (0.0 = local3\Field4) Then
                                If ((soundtransmission And (rand($64, $01) = $01)) <> 0) Then
                                    If (ChannelPlaying(local3\Field2) = $00) Then
                                        loadeventsound(local3, (("SFX\Character\LureSubject\Idle" + (Str rand($00, $05))) + ".ogg"), $01)
                                        local3\Field2 = playsound_strict(local3\Field30, $01, $00)
                                    EndIf
                                EndIf
                                If (soundtransmission <> 0) Then
                                    updatebutton(local3\Field19\Field27[$00])
                                    If (((d_i\Field15 = local3\Field19\Field27[$00]) And XZ0260X8X2\Field3) <> 0) Then
                                        If (ChannelPlaying(local3\Field2) <> 0) Then
                                            StopChannel(local3\Field2)
                                            local3\Field2 = $00
                                        EndIf
                                        snd_i\Field60 = loadsound_strict("SFX\Room\106Chamber\FemurBreaker.ogg")
                                        local3\Field2 = playsound_strict(snd_i\Field60, $01, $00)
                                        local3\Field4 = 1.0
                                    EndIf
                                EndIf
                            ElseIf (1.0 = local3\Field4) Then
                                If ((soundtransmission And (2000.0 > local3\Field1)) <> 0) Then
                                    If (ChannelPlaying(local3\Field2) = $00) Then
                                        loadeventsound(local3, "SFX\Character\LureSubject\Sniffling.ogg", $01)
                                        local3\Field2 = playsound_strict(local3\Field30, $01, $00)
                                    EndIf
                                EndIf
                                If (((0.0 < local3\Field1) And (400.0 > local3\Field1)) <> 0) Then
                                    animateex(local3\Field19\Field27[$05], animtime(local3\Field19\Field27[$05]), $01, $78, 0.35, $00)
                                ElseIf (2500.0 <= local3\Field1) Then
                                    If (((1.0 = local3\Field7) And (2500.0 > (local3\Field1 - fps\Field3[$00]))) <> 0) Then
                                        positionentity(n_i\Field2\Field82, local37, local38, local39, $00)
                                        resetentity(n_i\Field2\Field82)
                                        showentity(n_i\Field2\Field98)
                                        n_i\Field2\Field93 = $00
                                        n_i\Field2\Field31 = 0.0
                                        n_i\Field2\Field66 = 3.0
                                        n_i\Field2\Field65 = rnd(3000.0, 3500.0)
                                        local3\Field4 = 2.0
                                        Exit
                                    EndIf
                                    shouldplay = $0A
                                    positionentity(n_i\Field2\Field82, local37, curvevalue(((sin(((Float millisec) * 0.04)) * 0.07) + -32.45312), local38, 200.0), local39, $01)
                                    resetentity(n_i\Field2\Field82)
                                    n_i\Field2\Field31 = 1.0
                                    If (2500.0 > (local3\Field1 - fps\Field3[$00])) Then
                                        local5 = createdecal($00, entityx(local3\Field19\Field32[$00]\Field98, $01, 1.0), (local3\Field19\Field3 - 24.96875), entityz(local3\Field19\Field32[$00]\Field98, $01, 1.0), 90.0, 0.0, rnd(360.0, 0.0), 0.1, 0.01, $00, $01, $00, $00, $00)
                                        local5\Field1 = 90000.0
                                        local5\Field5 = 0.005
                                        local5\Field14 = 0.003
                                        entityparent(local5\Field0, local3\Field19\Field15, $01)
                                        If (ChannelPlaying(local3\Field2) <> 0) Then
                                            StopChannel(local3\Field2)
                                            local3\Field2 = $00
                                        EndIf
                                        loadeventsound(local3, "SFX\Character\LureSubject\106Bait.ogg", $01)
                                        local3\Field2 = playsound_strict(local3\Field30, $01, $00)
                                    ElseIf (((2900.0 > (local3\Field1 - fps\Field3[$00])) And (2900.0 <= local3\Field1)) <> 0) Then
                                        If (snd_i\Field60 <> $00) Then
                                            freesound_strict(snd_i\Field60)
                                            snd_i\Field60 = $00
                                        EndIf
                                        local3\Field19\Field2[$00]\Field1 = (Int min((Float local3\Field19\Field2[$00]\Field1), 700.0))
                                        local5 = createdecal($00, entityx(local3\Field19\Field2[$00]\Field7, $01, 1.0), entityy(local3\Field19\Field2[$00]\Field7, $01, 1.0), entityz(local3\Field19\Field2[$00]\Field7, $01, 1.0), 0.0, 0.0, 0.0, 0.05, 0.01, $00, $01, $00, $00, $00)
                                        local5\Field1 = 90000.0
                                        local5\Field5 = 0.005
                                        local5\Field14 = 0.002
                                        rotateentity(local5\Field0, entitypitch(local3\Field19\Field2[$00]\Field7, $01, 1.0), (entityyaw(local3\Field19\Field2[$00]\Field7, $01, 1.0) + 30.0), entityroll(local5\Field0, $00, 1.0), $00)
                                        moveentity(local5\Field0, 0.0, 0.05, 0.2, $00)
                                        entityparent(local5\Field0, local3\Field19\Field15, $01)
                                    ElseIf (3200.0 < local3\Field1) Then
                                        removenpc(local3\Field19\Field32[$01])
                                        If (1.0 = local3\Field7) Then
                                            n_i\Field2\Field66 = 1.0
                                            n_i\Field2\Field65 = rnd(22000.0, 27000.0)
                                            n_i\Field2\Field93 = $01
                                        Else
                                            positionentity(n_i\Field2\Field82, entityx(local3\Field19\Field27[$01], $01, 1.0), entityy(local3\Field19\Field27[$01], $01, 1.0), entityz(local3\Field19\Field27[$01], $01, 1.0), $00)
                                            resetentity(n_i\Field2\Field82)
                                            showentity(n_i\Field2\Field98)
                                            n_i\Field2\Field93 = $00
                                            n_i\Field2\Field31 = 0.0
                                            n_i\Field2\Field66 = 3.0
                                            n_i\Field2\Field65 = rnd(3000.0, 3500.0)
                                            local3\Field4 = 2.0
                                            Exit
                                        EndIf
                                    EndIf
                                EndIf
                            EndIf
                            If ((Int local3\Field7) <> 0) Then
                                positionentity(local3\Field19\Field27[$01], entityx(local3\Field19\Field27[$01], $01, 1.0), curvevalue(((sin(((Float millisec) * 0.04)) * 0.07) + -32.45312), entityy(local3\Field19\Field27[$01], $01, 1.0), 200.0), entityz(local3\Field19\Field27[$01], $01, 1.0), $01)
                                rotateentity(local3\Field19\Field27[$01], sin(((Float millisec) * 0.03)), entityyaw(local3\Field19\Field27[$01], $01, 1.0), (- sin(((Float millisec) * 0.025))), $01)
                            Else
                                positionentity(local3\Field19\Field27[$01], entityx(local3\Field19\Field27[$01], $01, 1.0), curvevalue(-33.625, entityy(local3\Field19\Field27[$01], $01, 1.0), 200.0), entityz(local3\Field19\Field27[$01], $01, 1.0), $01)
                                rotateentity(local3\Field19\Field27[$01], 0.0, entityyaw(local3\Field19\Field27[$01], $01, 1.0), 0.0, $01)
                            EndIf
                        EndIf
                    Else
                        tformpoint(1088.0, -6222.0, 1824.0, local3\Field19\Field15, $00)
                        local3\Field19\Field32[$00] = createnpc($16, tformedx(), tformedy(), tformedz())
                        local3\Field19\Field32[$00]\Field57 = -1.0
                        local3\Field19\Field32[$00]\Field1 = $01
                        local3\Field19\Field32[$00]\Field22 = $01
                        rotateentity(local3\Field19\Field32[$00]\Field82, 0.0, ((Float local3\Field19\Field21) + 180.0), 0.0, $01)
                        setnpcframe(local3\Field19\Field32[$00], 17.0, $01)
                        local3\Field19\Field32[$01] = createnpc($16, 0.0, 0.0, 0.0)
                        local3\Field19\Field32[$01]\Field57 = -1.0
                        local3\Field19\Field32[$01]\Field1 = $01
                        hideentity(local3\Field19\Field32[$01]\Field82)
                        hideentity(local3\Field19\Field32[$01]\Field98)
                    EndIf
                    local34 = entityx(XZ0260X8X2\Field74, $01, 1.0)
                    local35 = entityy(XZ0260X8X2\Field74, $01, 1.0)
                    local36 = entityz(XZ0260X8X2\Field74, $01, 1.0)
                    XZ0260X8X2\Field27 = (isinsideelevator(local34, local35, local36, local3\Field19\Field27[$02]) Lor isinsideelevator(local34, local35, local36, local3\Field19\Field27[$03]))
                    toelevatorfloor = $FFFFFFFF
                    local3\Field23 = updateelevators(local3\Field23, local3\Field19\Field25[$00], local3\Field19\Field25[$01], local3\Field19\Field27[$02], local3\Field19\Field27[$03], local3, $01, $00)
                ElseIf (playerinreachableroom($01, $00, $01) = $00) Then
                    If (ChannelPlaying(local3\Field2) <> 0) Then
                        StopChannel(local3\Field2)
                        local3\Field2 = $00
                    EndIf
                    If (ChannelPlaying(local3\Field8) <> 0) Then
                        StopChannel(local3\Field8)
                        local3\Field8 = $00
                    EndIf
                EndIf
            Case $05
                If (playerroom = local3\Field19) Then
                    If (((0.0 = local3\Field4) Lor (local3\Field9 <> "LoadDone")) <> 0) Then
                        If (((local3\Field9 = "") And (quickloadpercent = $FFFFFFFF)) <> 0) Then
                            quickloadpercent = $00
                            quickload_currevent = local3
                            local3\Field9 = "Load0"
                        EndIf
                        If ((local3\Field19\Field25[$01]\Field39 Lor local3\Field19\Field25[$02]\Field39) <> 0) Then
                            giveachievement("205", $01)
                            tformpoint(-1055.0, -74.8, 650.0, local3\Field19\Field15, $00)
                            local1 = createnpc($14, tformedx(), tformedy(), tformedz())
                            local1\Field57 = -1.0
                            local1\Field1 = $01
                            changenpctextureid(local1, $1F)
                            setnpcframe(local1, 40.0, $01)
                            rotateentity(local1\Field82, 0.0, ((Float local3\Field19\Field21) - 180.0), 0.0, $01)
                            local3\Field4 = 1.0
                        EndIf
                    Else
                        shouldplay = $0F
                        local23 = updatelever(local3\Field19\Field9[$00]\Field1, ((7.0 < local3\Field4) Lor ((0.0 < local3\Field19\Field25[$00]\Field13) And (180.0 > local3\Field19\Field25[$00]\Field13))), $50, -80.0)
                        If (((7.0 < local3\Field4) And remotedooron) <> 0) Then
                            rotateentity(local3\Field19\Field9[$00]\Field1, curveangle((80.0 - ((Float local3\Field19\Field25[$00]\Field39) * 160.0)), entitypitch(local3\Field19\Field9[$00]\Field1, $00, 1.0), 10.0), entityyaw(local3\Field19\Field9[$00]\Field1, $00, 1.0), 0.0, $00)
                            If (rand(((local3\Field19\Field25[$00]\Field39 * $FA) + $96), $01) = $01) Then
                                If (local3\Field19\Field25[$00]\Field39 <> 0) Then
                                    playsoundex(snd_i\Field52, camera, local3\Field19\Field25[$00]\Field51, 7.0, 1.0, $00, $00)
                                Else
                                    playsoundex(snd_i\Field26, camera, local3\Field19\Field25[$00]\Field51, 7.0, 1.0, $00, $00)
                                EndIf
                                openclosedoor(local3\Field19\Field25[$00], $01, $00)
                            EndIf
                        ElseIf (local23 <> 0) Then
                            If (local3\Field19\Field25[$00]\Field39 = $00) Then
                                openclosedoor(local3\Field19\Field25[$00], $01, $00)
                            EndIf
                        ElseIf (local3\Field19\Field25[$00]\Field39 <> 0) Then
                            openclosedoor(local3\Field19\Field25[$00], $01, $00)
                        EndIf
                        If (65.0 > local3\Field4) Then
                            If (((4.0 > distancesquared(entityx(XZ0260X8X2\Field74, $00, 1.0), entityx(local3\Field19\Field27[$01], $01, 1.0), entityz(XZ0260X8X2\Field74, $00, 1.0), entityz(local3\Field19\Field27[$01], $01, 1.0), 0.0, 0.0)) And ((chs\Field8 Lor i_268\Field3) = $00)) <> 0) Then
                                playsound_strict(loadtempsound("SFX\SCP\205\Enter.ogg"), $00, $00)
                                local3\Field4 = max(local3\Field4, 65.0)
                                For local20 = $02 To $04 Step $01
                                    If (entityhidden(local3\Field19\Field27[local20]) <> 0) Then
                                        showentity(local3\Field19\Field27[local20])
                                    EndIf
                                Next
                                If (entityhidden(local3\Field19\Field27[$05]) = $00) Then
                                    hideentity(local3\Field19\Field27[$05])
                                EndIf
                                setanimtime(local3\Field19\Field27[$02], 492.0, $00)
                                setanimtime(local3\Field19\Field27[$03], 434.0, $00)
                                setanimtime(local3\Field19\Field27[$04], 434.0, $00)
                                If (remotedooron <> 0) Then
                                    If (local3\Field19\Field25[$00]\Field39 = $00) Then
                                        openclosedoor(local3\Field19\Field25[$00], $01, $00)
                                    EndIf
                                EndIf
                            EndIf
                            local3\Field7 = (local3\Field7 + fps\Field3[$00])
                        EndIf
                        Select local3\Field4
                            Case 1.0
                                If (entityhidden(local3\Field19\Field2[$00]\Field3) <> 0) Then
                                    showentity(local3\Field19\Field2[$00]\Field3)
                                EndIf
                                For local20 = $02 To $04 Step $01
                                    If (entityhidden(local3\Field19\Field27[local20]) = $00) Then
                                        hideentity(local3\Field19\Field27[local20])
                                    EndIf
                                Next
                                If (entityhidden(local3\Field19\Field27[$05]) <> 0) Then
                                    showentity(local3\Field19\Field27[$05])
                                EndIf
                                animateex(local3\Field19\Field27[$05], animtime(local3\Field19\Field27[$05]), $20E, $212, 0.2, $01)
                                If (1400.0 < local3\Field7) Then
                                    local3\Field4 = (local3\Field4 + 1.0)
                                EndIf
                            Case 3.0
                                If (entityhidden(local3\Field19\Field2[$00]\Field3) <> 0) Then
                                    showentity(local3\Field19\Field2[$00]\Field3)
                                EndIf
                                For local20 = $02 To $04 Step $01
                                    If (entityhidden(local3\Field19\Field27[local20]) = $00) Then
                                        hideentity(local3\Field19\Field27[local20])
                                    EndIf
                                Next
                                If (entityhidden(local3\Field19\Field27[$05]) <> 0) Then
                                    showentity(local3\Field19\Field27[$05])
                                EndIf
                                animateex(local3\Field19\Field27[$05], animtime(local3\Field19\Field27[$05]), $179, $20D, 0.2, $01)
                                If (2100.0 < local3\Field7) Then
                                    local3\Field4 = (local3\Field4 + 1.0)
                                EndIf
                            Case 5.0
                                If (entityhidden(local3\Field19\Field2[$00]\Field3) <> 0) Then
                                    showentity(local3\Field19\Field2[$00]\Field3)
                                EndIf
                                For local20 = $02 To $04 Step $01
                                    If (entityhidden(local3\Field19\Field27[local20]) = $00) Then
                                        hideentity(local3\Field19\Field27[local20])
                                    EndIf
                                Next
                                If (entityhidden(local3\Field19\Field27[$05]) <> 0) Then
                                    showentity(local3\Field19\Field27[$05])
                                EndIf
                                animateex(local3\Field19\Field27[$05], animtime(local3\Field19\Field27[$05]), $E4, $178, 0.2, $01)
                                If (2800.0 < local3\Field7) Then
                                    playsoundex(loadtempsound("SFX\SCP\205\Horror.ogg"), camera, local3\Field19\Field27[$05], 10.0, 0.3, $00, $00)
                                    local3\Field4 = (local3\Field4 + 1.0)
                                EndIf
                            Case 7.0
                                If (entityhidden(local3\Field19\Field2[$00]\Field3) <> 0) Then
                                    showentity(local3\Field19\Field2[$00]\Field3)
                                EndIf
                                For local20 = $02 To $05 Step $01
                                    If (local20 < $04) Then
                                        If (entityhidden(local3\Field19\Field27[local20]) = $00) Then
                                            hideentity(local3\Field19\Field27[local20])
                                        EndIf
                                    ElseIf (entityhidden(local3\Field19\Field27[local20]) <> 0) Then
                                        showentity(local3\Field19\Field27[local20])
                                    EndIf
                                Next
                                animateex(local3\Field19\Field27[$04], animtime(local3\Field19\Field27[$04]), $1F4, $288, 0.2, $01)
                                If (4200.0 < local3\Field7) Then
                                    playsoundex(loadtempsound("SFX\SCP\205\Horror.ogg"), camera, local3\Field19\Field27[$05], 10.0, 0.5, $00, $00)
                                    local3\Field4 = (local3\Field4 + 1.0)
                                EndIf
                            Case 9.0
                                If (entityhidden(local3\Field19\Field2[$00]\Field3) <> 0) Then
                                    showentity(local3\Field19\Field2[$00]\Field3)
                                EndIf
                                If (entityhidden(local3\Field19\Field27[$02]) = $00) Then
                                    hideentity(local3\Field19\Field27[$02])
                                EndIf
                                For local20 = $03 To $05 Step $01
                                    If (entityhidden(local3\Field19\Field27[local20]) <> 0) Then
                                        showentity(local3\Field19\Field27[local20])
                                    EndIf
                                Next
                                animateex(local3\Field19\Field27[$03], animtime(local3\Field19\Field27[$03]), $02, $C8, 0.2, $01)
                                animateex(local3\Field19\Field27[$04], animtime(local3\Field19\Field27[$04]), $02, $7A, 0.2, $01)
                                If (5600.0 < local3\Field7) Then
                                    playsound_strict(loadtempsound("SFX\SCP\205\Horror.ogg"), $00, $00)
                                    local3\Field4 = (local3\Field4 + 1.0)
                                EndIf
                            Case 11.0
                                If (entityhidden(local3\Field19\Field2[$00]\Field3) <> 0) Then
                                    showentity(local3\Field19\Field2[$00]\Field3)
                                EndIf
                                For local20 = $02 To $04 Step $01
                                    If (entityhidden(local3\Field19\Field27[local20]) <> 0) Then
                                        showentity(local3\Field19\Field27[local20])
                                    EndIf
                                Next
                                If (entityhidden(local3\Field19\Field27[$05]) <> 0) Then
                                    showentity(local3\Field19\Field27[$05])
                                EndIf
                                animateex(local3\Field19\Field27[$02], animtime(local3\Field19\Field27[$02]), $02, $E2, 0.2, $01)
                                animateex(local3\Field19\Field27[$03], animtime(local3\Field19\Field27[$03]), $02, $C8, 0.2, $01)
                                animateex(local3\Field19\Field27[$04], animtime(local3\Field19\Field27[$04]), $02, $7A, 0.2, $01)
                                If (5950.0 < local3\Field7) Then
                                    local3\Field4 = (local3\Field4 + 1.0)
                                EndIf
                            Case 13.0
                                If (entityhidden(local3\Field19\Field2[$00]\Field3) <> 0) Then
                                    showentity(local3\Field19\Field2[$00]\Field3)
                                EndIf
                                For local20 = $02 To $04 Step $01
                                    If (entityhidden(local3\Field19\Field27[local20]) <> 0) Then
                                        showentity(local3\Field19\Field27[local20])
                                    EndIf
                                Next
                                If (entityhidden(local3\Field19\Field27[$05]) <> 0) Then
                                    showentity(local3\Field19\Field27[$05])
                                EndIf
                                If (227.0 <> animtime(local3\Field19\Field27[$05])) Then
                                    setanimtime(local3\Field19\Field27[$05], 227.0, $00)
                                EndIf
                                animateex(local3\Field19\Field27[$02], animtime(local3\Field19\Field27[$02]), $02, $1EB, 0.05, $01)
                                animateex(local3\Field19\Field27[$03], animtime(local3\Field19\Field27[$03]), $C5, $1B1, 0.05, $01)
                                animateex(local3\Field19\Field27[$04], animtime(local3\Field19\Field27[$04]), $02, $1B1, 0.05, $01)
                            Case 66.0
                                If (entityhidden(local3\Field19\Field2[$00]\Field3) <> 0) Then
                                    showentity(local3\Field19\Field2[$00]\Field3)
                                EndIf
                                animateex(local3\Field19\Field27[$02], animtime(local3\Field19\Field27[$02]), $1EC, $216, 0.1, $00)
                                animateex(local3\Field19\Field27[$03], animtime(local3\Field19\Field27[$03]), $1B2, $1D2, 0.1, $00)
                                animateex(local3\Field19\Field27[$04], animtime(local3\Field19\Field27[$04]), $1B2, $1EE, 0.1, $00)
                                If (533.0 < animtime(local3\Field19\Field27[$02])) Then
                                    If (entityhidden(local3\Field19\Field2[$00]\Field3) = $00) Then
                                        hideentity(local3\Field19\Field2[$00]\Field3)
                                    EndIf
                                    local3\Field4 = 67.0
                                    local3\Field7 = 0.0
                                    local3\Field1 = 0.0
                                EndIf
                            Case 67.0
                                If (((7.0 > distancesquared(entityx(XZ0260X8X2\Field74, $00, 1.0), entityx(local3\Field19\Field27[$01], $01, 1.0), entityz(XZ0260X8X2\Field74, $00, 1.0), entityz(local3\Field19\Field27[$01], $01, 1.0), 0.0, 0.0)) And ((chs\Field8 Lor i_268\Field3) = $00)) <> 0) Then
                                    If (rand($64, $01) = $01) Then
                                        injureplayer(rnd(0.3, 0.6), 0.0, 300.0, 0.12, 0.06)
                                        playsound_strict(snd_i\Field50[rand($02, $03)], $00, $00)
                                        XZ0260X8X2\Field1 = ((Float (0.0 = i_1025\Field1[$03])) * 0.5)
                                        local3\Field7 = rnd(-0.1, 0.1)
                                        local3\Field1 = rnd(-0.1, 0.1)
                                        If (5.0 < XZ0260X8X2\Field11) Then
                                            msg\Field8 = format(getlocalstring("death", "205"), subjectname, "%s")
                                            kill($01, $01, $00, $01)
                                        EndIf
                                    EndIf
                                EndIf
                                translateentity(XZ0260X8X2\Field74, local3\Field7, 0.0, local3\Field1, $00)
                                local3\Field7 = curvevalue(local3\Field7, 0.0, 10.0)
                                local3\Field1 = curvevalue(local3\Field1, 0.0, 10.0)
                            Default
                                If (rand($03, $01) = $01) Then
                                    If (entityhidden(local3\Field19\Field2[$00]\Field3) = $00) Then
                                        hideentity(local3\Field19\Field2[$00]\Field3)
                                    EndIf
                                ElseIf (entityhidden(local3\Field19\Field2[$00]\Field3) <> 0) Then
                                    showentity(local3\Field19\Field2[$00]\Field3)
                                EndIf
                                local3\Field1 = (local3\Field1 + fps\Field3[$00])
                                If (50.0 < local3\Field1) Then
                                    If (entityhidden(local3\Field19\Field2[$00]\Field3) <> 0) Then
                                        showentity(local3\Field19\Field2[$00]\Field3)
                                    EndIf
                                    local3\Field4 = (local3\Field4 + 1.0)
                                    local3\Field1 = 0.0
                                EndIf
                        End Select
                    EndIf
                ElseIf (local3\Field19\Field27[$02] = $00) Then
                    local3\Field4 = 0.0
                    local3\Field9 = ""
                EndIf
            Case $13
                If (playerroom = local3\Field19) Then
                    If (local3\Field19\Field25[$00]\Field39 <> 0) Then
                        playsound_strict(snd_i\Field24[rand($00, $05)], $00, $00)
                        createnpc($09, 0.0, 0.0, 0.0)
                        removeevent(local3)
                    EndIf
                EndIf
            Case $18
                If ((Float millisecs()) > local3\Field4) Then
                    If (((playerroom\Field22\Field21 <> $04) And (playerroom\Field22\Field21 <> $03)) <> 0) Then
                        If (0.0 > entitypitch(local3\Field19\Field9[$00]\Field1, $01, 1.0)) Then
                            For local13 = Each securitycams
                                If (local13\Field2 = $00) Then
                                    local13\Field2 = $02
                                EndIf
                            Next
                        Else
                            For local13 = Each securitycams
                                If (local13\Field2 <> $01) Then
                                    local13\Field2 = $00
                                EndIf
                            Next
                        EndIf
                    EndIf
                    local3\Field4 = (Float (millisecs() + $BB8))
                EndIf
                If (playerroom = local3\Field19) Then
                    If (local3\Field19\Field32[$01] = Null) Then
                        tformpoint(321.0, -1482.8, 2416.0, local3\Field19\Field15, $00)
                        local3\Field19\Field32[$01] = createnpc($16, tformedx(), tformedy(), tformedz())
                        local3\Field19\Field32[$01]\Field1 = $01
                        local3\Field19\Field32[$01]\Field57 = -1.0
                        changenpctextureid(local3\Field19\Field32[$01], $1B)
                        setnpcframe(local3\Field19\Field32[$01], 40.0, $01)
                        rotateentity(local3\Field19\Field32[$01]\Field82, 0.0, ((Float local3\Field19\Field21) + 90.0), 0.0, $01)
                    EndIf
                    XZ0260X8X2\Field10 = $01
                    coffindistance = entitydistance(XZ0260X8X2\Field74, local3\Field19\Field27[$00])
                    If (2.0 > coffindistance) Then
                        If (0.0 = local3\Field7) Then
                            giveachievement("895", $01)
                            If (local3\Field0 = $00) Then
                                local3\Field0 = loadsound_strict((("SFX\Room\895Chamber\GuardIdle" + (Str rand($00, $02))) + ".ogg"))
                                local3\Field2 = playsoundex(local3\Field0, camera, local3\Field19\Field15, 10.0, 1.0, $00, $00)
                            EndIf
                            If ((((n_i\Field2\Field93 = $00) And (2.0 > n_i\Field2\Field66)) And ((chs\Field8 Lor i_268\Field3) = $00)) <> 0) Then
                                If (0.0 = local3\Field7) Then
                                    tformpoint(0.0, -1531.0, 2356.0, local3\Field19\Field15, $00)
                                    n_i\Field2\Field60 = tformedx()
                                    n_i\Field2\Field61 = tformedy()
                                    n_i\Field2\Field74 = tformedz()
                                    n_i\Field2\Field66 = 2.0
                                EndIf
                            EndIf
                            local3\Field7 = 1.0
                        EndIf
                    ElseIf (((6.0 < coffindistance) And (1.0 = local3\Field7)) <> 0) Then
                        If (local3\Field19\Field32[$00] = Null) Then
                            freesound_strict(local3\Field0)
                            local3\Field0 = $00
                            StopChannel(local3\Field2)
                            local3\Field2 = $00
                            local3\Field19\Field32[$00] = createnpc($17, local3\Field19\Field40, local3\Field19\Field3, local3\Field19\Field37)
                            local3\Field19\Field32[$00]\Field66 = 8.0
                            local3\Field19\Field32[$00]\Field13 = $01
                            local3\Field19\Field32[$00]\Field42 = 0.25
                            loadnpcsound(local3\Field19\Field32[$00], (("SFX\Room\895Chamber\GuardScream" + (Str rand($00, $02))) + ".ogg"), $00)
                            local3\Field19\Field32[$00]\Field63 = playsoundex(local3\Field19\Field32[$00]\Field55, camera, local3\Field19\Field32[$00]\Field82, 100.0, 1.0, $01, $00)
                            rotateentity(local3\Field19\Field32[$00]\Field82, 0.0, ((Float local3\Field19\Field21) + 90.0), 0.0, $00)
                            setnpcframe(local3\Field19\Field32[$00], 270.0, $01)
                            local3\Field19\Field25[$00]\Field39 = $01
                            local3\Field19\Field25[$01]\Field39 = $01
                        EndIf
                    EndIf
                    If (local3\Field19\Field32[$00] <> Null) Then
                        If (local3\Field19\Field32[$00]\Field1 = $00) Then
                            updatesoundorigin(local3\Field19\Field32[$00]\Field63, camera, local3\Field19\Field32[$00]\Field82, 100.0, 1.0, $01, $01, $00)
                        EndIf
                        If (local3\Field19\Field32[$00]\Field13 = $01) Then
                            If (-5.630469 < entityy(local3\Field19\Field32[$00]\Field82, $00, 1.0)) Then
                                entitytype(local3\Field19\Field32[$00]\Field82, $02, $00)
                                local41 = entitydistancesquared(XZ0260X8X2\Field74, local3\Field19\Field32[$00]\Field82)
                                If (0.64 > local41) Then
                                    local50 = ((sqr(local41) - 0.8) * (sqr(local41) - 0.8))
                                    local26 = pointdirection(entityx(XZ0260X8X2\Field74, $01, 1.0), entityz(XZ0260X8X2\Field74, $01, 1.0), entityx(local3\Field19\Field32[$00]\Field82, $01, 1.0), entityz(local3\Field19\Field32[$00]\Field82, $01, 1.0))
                                    translateentity(XZ0260X8X2\Field74, (cos(((- local26) + 90.0)) * local50), 0.0, (sin(((- local26) + 90.0)) * local50), $00)
                                EndIf
                                If (0.6 < entityy(local3\Field19\Field32[$00]\Field82, $00, 1.0)) Then
                                    entitytype(local3\Field19\Field32[$00]\Field82, $00, $00)
                                EndIf
                            Else
                                local26 = local3\Field19\Field32[$00]\Field103
                                animatenpc(local3\Field19\Field32[$00], 270.0, 286.0, 0.4, $00)
                                If (((275.0 > local26) And (275.0 <= local3\Field19\Field32[$00]\Field103)) <> 0) Then
                                    playsoundex(loadtempsound("SFX\Character\BodyFall.ogg"), camera, local3\Field19\Field32[$00]\Field82, 10.0, 1.0, $00, $00)
                                    local5 = createdecal($03, local3\Field19\Field40, (local3\Field19\Field3 - 5.980469), local3\Field19\Field37, 90.0, rnd(360.0, 0.0), 0.0, 0.4, 1.0, $00, $01, $00, $00, $00)
                                    entityparent(local5\Field0, local3\Field19\Field15, $01)
                                    local11 = createitem("Unknown Note", $00, local3\Field19\Field40, (local3\Field19\Field3 - 5.921875), local3\Field19\Field37, $00, $00, $00, 1.0, $00)
                                    entitytype(local11\Field9, $03, $00)
                                    local11 = createitem("Bloody Level 3 Key Card", $5C, local3\Field19\Field40, (local3\Field19\Field3 - 5.875), local3\Field19\Field37, $00, $00, $00, 1.0, $00)
                                    entitytype(local11\Field9, $03, $00)
                                    loadnpcsound(local3\Field19\Field32[$00], "SFX\Room\895Chamber\GuardRadio.ogg", $00)
                                ElseIf (285.9 < local3\Field19\Field32[$00]\Field103) Then
                                    local3\Field19\Field32[$00]\Field42 = 1.0
                                    local3\Field19\Field32[$00]\Field1 = $01
                                    local3\Field19\Field32[$00]\Field13 = $02
                                EndIf
                            EndIf
                        ElseIf (local3\Field19\Field32[$00]\Field13 = $02) Then
                            If (local3\Field19\Field32[$00]\Field55 = $00) Then
                                local3\Field19\Field32[$00]\Field55 = loadsound_strict("SFX\Room\895Chamber\GuardRadio.ogg")
                            EndIf
                            local3\Field19\Field32[$00]\Field63 = loopsoundex(local3\Field19\Field32[$00]\Field55, local3\Field19\Field32[$00]\Field63, camera, local3\Field19\Field32[$00]\Field82, 5.0, 1.0, $00)
                        EndIf
                    EndIf
                    If (((T8660BZ460\Field8 > $00) Lor (T8660BZ460\Field11 > $00)) <> 0) Then
                        If (((T8660BZ460\Field2 > $00) And (i_714\Field0 <> $02)) <> 0) Then
                            If (6.0 > coffindistance) Then
                                turnentity(XZ0260X8X2\Field74, 0.0, (angledist(((pointdirection(entityx(XZ0260X8X2\Field74, $01, 1.0), entityz(XZ0260X8X2\Field74, $01, 1.0), entityx(local3\Field19\Field27[$00], $01, 1.0), entityz(local3\Field19\Field27[$00], $01, 1.0)) + 90.0) + sin(wrapangle((local3\Field1 / 10.0), 360.0))), entityyaw(XZ0260X8X2\Field74, $00, 1.0)) / 4.0), 0.0, $01)
                                camerapitch = (((clamp(((2.0 - distance(entityx(XZ0260X8X2\Field74, $01, 1.0), entityx(local3\Field19\Field27[$00], $01, 1.0), entityz(XZ0260X8X2\Field74, $01, 1.0), entityz(local3\Field19\Field27[$00], $01, 1.0), 0.0, 0.0)) / 2.0), 0.0, 1.0) * -60.0) * 0.2) + (camerapitch * 0.8))
                                XZ0260X8X2\Field42 = (XZ0260X8X2\Field42 - (((fps\Field3[$00] * (((Float selecteddifficulty\Field8) * 0.24) + 1.2)) / (Float (T8660BZ460\Field8 + T8660BZ460\Field11))) / ((Float i_714\Field0) + 1.0)))
                            Else
                                XZ0260X8X2\Field42 = (XZ0260X8X2\Field42 - (((fps\Field3[$00] * (((Float selecteddifficulty\Field8) * 0.08) + 0.4)) / (Float (T8660BZ460\Field8 + T8660BZ460\Field11))) / ((Float i_714\Field0) + 1.0)))
                            EndIf
                            XZ0260X8X2\Field69 = $00
                            XZ0260X8X2\Field64 = (sin((Float (millisec / $0A))) * (Abs XZ0260X8X2\Field42))
                            If (-1000.0 > XZ0260X8X2\Field42) Then
                                If (T8660BZ460\Field8 > $01) Then
                                    local24 = "895.nvg.914"
                                ElseIf (T8660BZ460\Field11 > $00) Then
                                    local24 = "895.nvg.096"
                                Else
                                    local24 = "895.nvg"
                                EndIf
                                msg\Field8 = getlocalstring("death", local24)
                                entitytexture(X2Z260BF0Z\Field1[$04], X2Z260BF0Z\Field0[$01], $00, $00)
                                If (-10.0 > XZ0260X8X2\Field82) Then
                                    kill($00, $01, $00, $01)
                                EndIf
                            ElseIf (-800.0 > XZ0260X8X2\Field42) Then
                                If (rand($03, $01) = $01) Then
                                    entitytexture(X2Z260BF0Z\Field1[$04], X2Z260BF0Z\Field0[$01], $00, $00)
                                EndIf
                                If (rand($06, $01) < $05) Then
                                    entitytexture(X2Z260BF0Z\Field1[$04], mon_i\Field2[rand($06, $10)], $00, $00)
                                    For local20 = $00 To (maxitemamount - $01) Step $01
                                        If (TX60DB8XBBZ(local20) <> Null) Then
                                            If ((((T8660BZ460\Field8 > $00) And (((TX60DB8XBBZ(local20)\Field6\Field9 = $40) Lor (TX60DB8XBBZ(local20)\Field6\Field9 = $41)) Lor (TX60DB8XBBZ(local20)\Field6\Field9 = $42))) Lor (((T8660BZ460\Field11 = $01) And (TX60DB8XBBZ(local20)\Field6\Field9 = $43)) Lor ((T8660BZ460\Field11 = $02) And (TX60DB8XBBZ(local20)\Field6\Field9 = $44)))) <> 0) Then
                                                If (1.0 = TX60DB8XBBZ(local20)\Field3) Then
                                                    playsound_strict(snd_i\Field40[$01], $00, $00)
                                                EndIf
                                                TX60DB8XBBZ(local20)\Field3 = 2.0
                                                Exit
                                            EndIf
                                        EndIf
                                    Next
                                EndIf
                                XZ0260X8X2\Field64 = 1000.0
                                If (0.0 = XZ0260X8X2\Field82) Then
                                    XZ0260X8X2\Field82 = 1.0
                                EndIf
                            ElseIf (-500.0 > XZ0260X8X2\Field42) Then
                                If (rand($07, $01) = $01) Then
                                    entitytexture(X2Z260BF0Z\Field1[$04], X2Z260BF0Z\Field0[$01], $00, $00)
                                EndIf
                                If (rand($32, $01) = $01) Then
                                    entitytexture(X2Z260BF0Z\Field1[$04], mon_i\Field2[rand($06, $10)], $00, $00)
                                    For local20 = $00 To (maxitemamount - $01) Step $01
                                        If (TX60DB8XBBZ(local20) <> Null) Then
                                            If ((((T8660BZ460\Field8 > $00) And (((TX60DB8XBBZ(local20)\Field6\Field9 = $40) Lor (TX60DB8XBBZ(local20)\Field6\Field9 = $41)) Lor (TX60DB8XBBZ(local20)\Field6\Field9 = $42))) Lor (((T8660BZ460\Field11 = $01) And (TX60DB8XBBZ(local20)\Field6\Field9 = $43)) Lor ((T8660BZ460\Field11 = $02) And (TX60DB8XBBZ(local20)\Field6\Field9 = $44)))) <> 0) Then
                                                If (0.0 = TX60DB8XBBZ(local20)\Field3) Then
                                                    playsound_strict(snd_i\Field40[$00], $00, $00)
                                                EndIf
                                                TX60DB8XBBZ(local20)\Field3 = 1.0
                                                Exit
                                            EndIf
                                        EndIf
                                    Next
                                EndIf
                            Else
                                entitytexture(X2Z260BF0Z\Field1[$04], X2Z260BF0Z\Field0[$01], $00, $00)
                                For local20 = $00 To (maxitemamount - $01) Step $01
                                    If (TX60DB8XBBZ(local20) <> Null) Then
                                        If ((((T8660BZ460\Field8 > $00) And (((TX60DB8XBBZ(local20)\Field6\Field9 = $40) Lor (TX60DB8XBBZ(local20)\Field6\Field9 = $41)) Lor (TX60DB8XBBZ(local20)\Field6\Field9 = $42))) Lor (((T8660BZ460\Field11 = $01) And (TX60DB8XBBZ(local20)\Field6\Field9 = $43)) Lor ((T8660BZ460\Field11 = $02) And (TX60DB8XBBZ(local20)\Field6\Field9 = $44)))) <> 0) Then
                                            TX60DB8XBBZ(local20)\Field3 = 0.0
                                            Exit
                                        EndIf
                                    EndIf
                                Next
                            EndIf
                            If (-800.0 > XZ0260X8X2\Field42) Then
                                XZ0260X8X2\Field42 = -1010.0
                            EndIf
                        EndIf
                    EndIf
                    If (0.0 < local3\Field1) Then
                        local3\Field1 = max((local3\Field1 - fps\Field3[$00]), 0.0)
                    EndIf
                    If (0.0 = local3\Field1) Then
                        entitytexture(X2Z260BF0Z\Field1[$04], X2Z260BF0Z\Field0[$01], $00, $00)
                        local3\Field1 = -1.0
                    EndIf
                    shouldplay = $42
                    turnoffsecuritycam(local3\Field19, (updatelever(local3\Field19\Field9[$00]\Field1, $00, $50, -80.0) = $00))
                Else
                    coffindistance = local3\Field19\Field39
                    If (((T8660BZ460\Field8 > $00) Lor (T8660BZ460\Field11 > $00)) <> 0) Then
                        If ((((20.0 > coffindistance) And (T8660BZ460\Field2 > $00)) And (i_714\Field0 <> $02)) <> 0) Then
                            If (-600.0 < XZ0260X8X2\Field42) Then
                                XZ0260X8X2\Field42 = (XZ0260X8X2\Field42 - (((fps\Field3[$00] * (((Float selecteddifficulty\Field8) * 0.06) + 0.3)) / (Float (T8660BZ460\Field8 + T8660BZ460\Field11))) / ((Float i_714\Field0) + 1.0)))
                            EndIf
                            XZ0260X8X2\Field69 = $00
                        EndIf
                    EndIf
                EndIf
            Case $06
                If (playerroom = local3\Field19) Then
                    updatelever(local3\Field19\Field9[$00]\Field1, $00, $50, -80.0)
                    updatelever(local3\Field19\Field9[$01]\Field1, $01, $50, -80.0)
                    If ((local3\Field19\Field25[$02]\Field39 Lor (0.0 > entitypitch(local3\Field19\Field9[$00]\Field1, $00, 1.0))) <> 0) Then
                        giveachievement("914", $01)
                        local3\Field7 = 1.0
                    EndIf
                    If (local3\Field19\Field25[$02]\Field21 = $01) Then
                        local3\Field19\Field25[$02]\Field21 = (updatelever(local3\Field19\Field9[$01]\Field1, $00, $50, -80.0) = $00)
                    EndIf
                    If (1.0 = local3\Field7) Then
                        shouldplay = $15
                    EndIf
                    If (0.64 > entitydistancesquared(XZ0260X8X2\Field74, local3\Field19\Field27[$00])) Then
                        entitypick(camera, 0.8)
                        For local20 = $00 To $01 Step $01
                            If (pickedentity() = local3\Field19\Field27[local20]) Then
                                handentity = local3\Field19\Field27[local20]
                                If ((XZ0260X8X2\Field3 Lor XZ0260X8X2\Field29) <> 0) Then
                                    grabbedentity = local3\Field19\Field27[local20]
                                EndIf
                                Exit
                            EndIf
                        Next
                        If (grabbedentity = local3\Field19\Field27[$00]) Then
                            If (0.0 = local3\Field4) Then
                                handentity = local3\Field19\Field27[$00]
                                turnentity(grabbedentity, 0.0, 0.0, ((- TDD0Z6BXB6\Field13) * 2.5), $00)
                                local40 = wrapangle(entityroll(local3\Field19\Field27[$00], $00, 1.0), 360.0)
                                drawarrowicon[$03] = (181.0 < local40)
                                drawarrowicon[$01] = $01
                                If (90.0 > local40) Then
                                    rotateentity(grabbedentity, 0.0, 0.0, 361.0, $00)
                                ElseIf (180.0 > local40) Then
                                    rotateentity(grabbedentity, 0.0, 0.0, 180.0, $00)
                                EndIf
                                If (((181.0 > local40) And (90.0 < local40)) <> 0) Then
                                    For local11 = Each items
                                        If (((local11\Field9 <> $00) And (local11\Field17 = $00)) <> 0) Then
                                            If (200.0 > (Abs (entityx(local11\Field9, $00, 1.0) - (local3\Field19\Field40 - 2.78125)))) Then
                                                If (104.0 > (Abs (entityy(local11\Field9, $00, 1.0) - (local3\Field19\Field3 + 2.53125)))) Then
                                                    local3\Field2 = playsoundex(snd_i\Field18, camera, local3\Field19\Field27[$01], 10.0, 1.0, $00, $00)
                                                    local3\Field19\Field25[$01]\Field45 = playsoundex(loadtempsound("SFX\SCP\914\DoorClose.ogg"), camera, local3\Field19\Field25[$01]\Field0, 10.0, 1.0, $00, $00)
                                                    setanimtime(local3\Field19\Field27[$07], 1.0, $00)
                                                    local3\Field4 = 1.0
                                                    Exit
                                                EndIf
                                            EndIf
                                        EndIf
                                    Next
                                EndIf
                            EndIf
                        ElseIf (grabbedentity = local3\Field19\Field27[$01]) Then
                            If (0.0 = local3\Field4) Then
                                handentity = local3\Field19\Field27[$01]
                                turnentity(grabbedentity, 0.0, 0.0, ((- TDD0Z6BXB6\Field13) * 2.5), $00)
                                local40 = wrapangle(entityroll(local3\Field19\Field27[$01], $00, 1.0), 360.0)
                                drawarrowicon[$03] = $01
                                drawarrowicon[$01] = $01
                                If (90.0 < local40) Then
                                    If (180.0 > local40) Then
                                        rotateentity(grabbedentity, 0.0, 0.0, 90.0, $00)
                                    ElseIf (270.0 > local40) Then
                                        rotateentity(grabbedentity, 0.0, 0.0, 270.0, $00)
                                    EndIf
                                EndIf
                                local57 = floor(entityroll(local3\Field19\Field27[$01], $00, 1.0))
                                local3\Field8 = $00
                                If (((((((-94.0 < local57) And (-86.0 > local57)) Lor ((-44.0 < local57) And (-36.0 > local57))) Lor ((-4.0 < local57) And (4.0 > local57))) Lor ((36.0 < local57) And (44.0 > local57))) Lor ((86.0 < local57) And (94.0 > local57))) <> 0) Then
                                    If (local3\Field2 = $00) Then
                                        local3\Field2 = playsoundex(snd_i\Field31[rand($00, $01)], camera, local3\Field19\Field27[$01], 2.0, 0.5, $00, $00)
                                    EndIf
                                Else
                                    local3\Field2 = $00
                                EndIf
                            EndIf
                        EndIf
                        For local20 = $00 To $01 Step $01
                            If (grabbedentity = local3\Field19\Field27[local20]) Then
                                If (entityinview(local3\Field19\Field27[local20], camera) = $00) Then
                                    grabbedentity = $00
                                EndIf
                                Exit
                            EndIf
                        Next
                    Else
                        For local20 = $00 To $01 Step $01
                            If (grabbedentity = local3\Field19\Field27[local20]) Then
                                grabbedentity = $00
                                Exit
                            EndIf
                        Next
                    EndIf
                    If (grabbedentity <> local3\Field19\Field27[$01]) Then
                        local40 = wrapangle(entityroll(local3\Field19\Field27[$01], $00, 1.0), 360.0)
                        If (22.5 > local40) Then
                            local40 = 0.0
                            local58 = $00
                        ElseIf (67.5 > local40) Then
                            local40 = 40.0
                            local58 = $FFFFFFFF
                        ElseIf (180.0 > local40) Then
                            local40 = 90.0
                            local58 = $FFFFFFFE
                        ElseIf (337.5 < local40) Then
                            local40 = -1.0
                            local58 = $00
                        ElseIf (292.5 < local40) Then
                            local40 = -40.0
                            local58 = $01
                        Else
                            local40 = -90.0
                            local58 = $02
                        EndIf
                        rotateentity(local3\Field19\Field27[$01], 0.0, 0.0, curvevalue(local40, entityroll(local3\Field19\Field27[$01], $00, 1.0), 20.0), $00)
                        If (((((((-90.0 = local40) Lor (-40.0 = local40)) Lor (-1.0 = local40)) Lor (0.0 = local40)) Lor (40.0 = local40)) Lor (90.0 = local40)) <> 0) Then
                            If (local3\Field8 = $00) Then
                                local3\Field8 = playsoundex(snd_i\Field31[rand($00, $01)], camera, local3\Field19\Field27[$01], 2.0, 0.5, $00, $00)
                            EndIf
                        EndIf
                    EndIf
                    If (0.0 < local3\Field4) Then
                        local3\Field4 = (local3\Field4 + fps\Field3[$00])
                        cansave = $00
                        If (n_i\Field2\Field93 = $00) Then
                            If (1.0 = n_i\Field2\Field66) Then
                                n_i\Field2\Field65 = (n_i\Field2\Field65 - (fps\Field3[$00] * ((Float selecteddifficulty\Field2) + 1.0)))
                            EndIf
                        EndIf
                        local3\Field19\Field25[$01]\Field39 = $00
                        If (140.0 < local3\Field4) Then
                            If (local3\Field19\Field25[$00]\Field39 <> 0) Then
                                local3\Field19\Field25[$00]\Field45 = playsoundex(loadtempsound("SFX\SCP\914\DoorClose.ogg"), camera, local3\Field19\Field25[$00]\Field0, 10.0, 1.0, $00, $00)
                            EndIf
                            local3\Field19\Field25[$00]\Field39 = $00
                        EndIf
                        local41 = distancesquared(entityx(XZ0260X8X2\Field74, $01, 1.0), entityx(local3\Field19\Field27[$02], $01, 1.0), entityz(XZ0260X8X2\Field74, $01, 1.0), entityz(local3\Field19\Field27[$02], $01, 1.0), 0.0, 0.0)
                        If ((1.0 / 2.56) > local41) Then
                            makemeunplayable($01)
                            If (((local58 = $FFFFFFFE) Lor (local58 = $FFFFFFFF)) <> 0) Then
                                If (((182.0 < local3\Field4) And (182.0 > (local3\Field4 - fps\Field3[$01]))) <> 0) Then
                                    playsound_strict(loadtempsound("SFX\SCP\914\PlayerDeath.ogg"), $00, $00)
                                EndIf
                            EndIf
                            If (210.0 < local3\Field4) Then
                                Select local58
                                    Case $FFFFFFFE
                                        XZ0260X8X2\Field48 = 1.0
                                        If (ChannelPlaying(local3\Field2) <> 0) Then
                                            StopChannel(local3\Field2)
                                            local3\Field2 = $00
                                        EndIf
                                        msg\Field8 = format(getlocalstring("death", "914"), subjectname, "%s")
                                    Case $FFFFFFFF,$00,$01,$02
                                        If (210.0 > (local3\Field4 - fps\Field3[$01])) Then
                                            playsound_strict(loadtempsound("SFX\SCP\914\PlayerUse.ogg"), $00, $00)
                                        EndIf
                                End Select
                                XZ0260X8X2\Field53 = -10.0
                            EndIf
                        EndIf
                        If (420.0 < local3\Field4) Then
                            rotateentity(local3\Field19\Field27[$00], entitypitch(local3\Field19\Field27[$00], $00, 1.0), entityyaw(local3\Field19\Field27[$00], $00, 1.0), curveangle(0.0, entityroll(local3\Field19\Field27[$00], $00, 1.0), 10.0), $00)
                        Else
                            rotateentity(local3\Field19\Field27[$00], entitypitch(local3\Field19\Field27[$00], $00, 1.0), entityyaw(local3\Field19\Field27[$00], $00, 1.0), 180.0, $00)
                        EndIf
                        If (840.0 < local3\Field4) Then
                            For local11 = Each items
                                If (((local11\Field9 <> $00) And (local11\Field17 = $00)) <> 0) Then
                                    If ((1.0 / 2.022716) > distancesquared(entityx(local11\Field9, $00, 1.0), entityx(local3\Field19\Field27[$02], $01, 1.0), entityz(local11\Field9, $00, 1.0), entityz(local3\Field19\Field27[$02], $01, 1.0), 0.0, 0.0)) Then
                                        use914(local11, local58, entityx(local3\Field19\Field27[$03], $01, 1.0), entityy(local3\Field19\Field27[$03], $01, 1.0), entityz(local3\Field19\Field27[$03], $01, 1.0))
                                    EndIf
                                EndIf
                            Next
                            If ((1.0 / 2.56) > local41) Then
                                Select local58
                                    Case $FFFFFFFF
                                        XZ0260X8X2\Field11 = 4.0
                                        createmsg(getlocalstring("msg", "914"), 6.0)
                                    Case $00
                                        opt\Field0 = (opt\Field0 = $00)
                                        opt\Field18 = (opt\Field18 = $00)
                                    Case $01
                                        chs\Field1 = $01
                                    Case $02
                                        If (25200.0 > i_427\Field1) Then
                                            i_427\Field1 = 25200.0
                                        EndIf
                                End Select
                                XZ0260X8X2\Field64 = 1000.0
                                positionentity(XZ0260X8X2\Field74, entityx(local3\Field19\Field27[$03], $01, 1.0), (entityy(local3\Field19\Field27[$03], $01, 1.0) + 1.0), entityz(local3\Field19\Field27[$03], $01, 1.0), $00)
                                resetentity(XZ0260X8X2\Field74)
                                XZ0260X8X2\Field16 = 0.0
                            EndIf
                            local3\Field19\Field25[$00]\Field39 = $01
                            local3\Field19\Field25[$01]\Field39 = $01
                            rotateentity(local3\Field19\Field27[$00], 0.0, 0.0, 0.0, $00)
                            local61 = loadtempsound("SFX\SCP\914\DoorOpen.ogg")
                            local3\Field19\Field25[$00]\Field45 = playsoundex(local61, camera, local3\Field19\Field25[$00]\Field0, 10.0, 1.0, $00, $00)
                            local3\Field19\Field25[$01]\Field45 = playsoundex(local61, camera, local3\Field19\Field25[$01]\Field0, 10.0, 1.0, $00, $00)
                            XZ0260X8X2\Field38 = $02
                            local3\Field4 = 0.0
                        EndIf
                    EndIf
                    updatesoundorigin(local3\Field2, camera, local3\Field19\Field27[$01], 10.0, 1.0, $00, $01, $00)
                    If (ChannelPlaying(local3\Field2) <> 0) Then
                        animateex(local3\Field19\Field27[$07], animtime(local3\Field19\Field27[$07]), $01, $4A, 0.3, (0.0 <> local3\Field4))
                    EndIf
                EndIf
                If (12.0 > local3\Field19\Field39) Then
                    If (0.0 > entitypitch(local3\Field19\Field9[$00]\Field1, $00, 1.0)) Then
                        local3\Field1 = min((local3\Field1 + fps\Field3[$00]), 212.0)
                    Else
                        local3\Field1 = max((local3\Field1 - fps\Field3[$00]), 0.0)
                    EndIf
                    If (((0.0 < local3\Field1) And (212.0 > local3\Field1)) <> 0) Then
                        If (ChannelPlaying(local3\Field11) = $00) Then
                            local3\Field11 = loopsoundex(snd_i\Field19, local3\Field11, camera, local3\Field19\Field27[$06], 10.0, 1.0, $00)
                        EndIf
                    Else
                        StopChannel(local3\Field11)
                        local3\Field11 = $00
                    EndIf
                    positionentity(local3\Field19\Field27[$05], 0.0, local3\Field1, 0.0, $00)
                    updatesoundorigin(local3\Field2, camera, local3\Field19\Field27[$06], 10.0, 1.0, $00, $01, $00)
                EndIf
            Case $23
                If (playerroom = local3\Field19) Then
                    If (-34.76562 > entityy(XZ0260X8X2\Field74, $00, 1.0)) Then
                        shouldplay = $1E
                        XZ0260X8X2\Field10 = $01
                        giveachievement("008", $01)
                        If (0.0 = local3\Field4) Then
                            If (((0.0 = n_i\Field3\Field31) And (36.0 < entitydistancesquared(n_i\Field3\Field82, XZ0260X8X2\Field74))) <> 0) Then
                                positionentity(n_i\Field3\Field82, entityx(local3\Field19\Field27[$04], $01, 1.0), entityy(local3\Field19\Field27[$04], $01, 1.0), entityz(local3\Field19\Field27[$04], $01, 1.0), $01)
                                resetentity(n_i\Field3\Field82)
                            EndIf
                            local3\Field4 = 1.0
                        ElseIf (1.0 = local3\Field4) Then
                            If (0.0 = local3\Field7) Then
                                For local20 = $02 To $03 Step $01
                                    If (entityhidden(local3\Field19\Field27[local20]) <> 0) Then
                                        showentity(local3\Field19\Field27[local20])
                                    EndIf
                                Next
                            EndIf
                            local3\Field2 = loopsoundex(roomambience[$05], local3\Field2, camera, local3\Field19\Field27[$00], 5.0, 1.0, $00)
                            updateredlight(local3\Field19\Field16[$00], 1500.0, 800.0)
                            If (5.0 > entitydistancesquared(XZ0260X8X2\Field74, local3\Field19\Field27[$00])) Then
                                For local20 = $00 To $01 Step $01
                                    local3\Field19\Field25[local20]\Field21 = $01
                                Next
                                If (0.0 = local3\Field7) Then
                                    If (9.0 > entitydistancesquared(n_i\Field3\Field82, local3\Field19\Field27[$04])) Then
                                        If (playersees173(n_i\Field3) = $00) Then
                                            tformpoint(-448.0, -9337.0, 752.0, local3\Field19\Field15, $00)
                                            positionentity(n_i\Field3\Field82, tformedx(), tformedy(), tformedz(), $01)
                                            resetentity(n_i\Field3\Field82)
                                            For local20 = $02 To $03 Step $01
                                                hideentity(local3\Field19\Field27[local20])
                                            Next
                                            If (T8660BZ460\Field10 = $00) Then
                                                playsound_strict(loadtempsound("SFX\SCP\008\IamInfected.ogg"), $00, $00)
                                                injureplayer(0.3, 0.001, 500.0, 0.0, 0.0)
                                                createmsg(getlocalstring("msg", "008.173"), 6.0)
                                            EndIf
                                            local3\Field8 = playsoundex(loadtempsound("SFX\Room\GlassBreak.ogg"), camera, local3\Field19\Field27[$00], 10.0, 1.0, $00, $00)
                                            local3\Field7 = 1.0
                                        EndIf
                                    EndIf
                                EndIf
                                If (interactobject(local3\Field19\Field27[$01], 0.8, $01) <> 0) Then
                                    drawarrowicon[$02] = $01
                                    rotateentity(local3\Field19\Field27[$01], clamp((entitypitch(local3\Field19\Field27[$01], $01, 1.0) + clamp((- TDD0Z6BXB6\Field14), -10.0, 10.0)), 35.0, 89.0), entityyaw(local3\Field19\Field27[$01], $01, 1.0), 0.0, $01)
                                Else
                                    rotateentity(local3\Field19\Field27[$01], (entitypitch(local3\Field19\Field27[$01], $01, 1.0) + min((cos((Float millisec)) * 0.1), 89.0)), entityyaw(local3\Field19\Field27[$01], $01, 1.0), 0.0, $01)
                                EndIf
                                If (0.0 = i_008\Field0) Then
                                    If (0.0 < XZ0260X8X2\Field39) Then
                                        injureplayer(0.0, 0.001, 0.0, 0.0, 0.0)
                                    EndIf
                                EndIf
                                If (((T8660BZ460\Field3 = $00) And (T8660BZ460\Field10 = $00)) <> 0) Then
                                    XZ0260X8X2\Field70 = max(70.0, XZ0260X8X2\Field70)
                                EndIf
                            EndIf
                            If (40.0 > entitypitch(local3\Field19\Field27[$01], $01, 1.0)) Then
                                playsoundex(snd_i\Field59, camera, local3\Field19\Field27[$01], 2.0, 1.0, $00, $00)
                                freeemitter(local3\Field19\Field17[$00], $00)
                                local3\Field4 = 2.0
                            ElseIf (local3\Field19\Field17[$00] = Null) Then
                                local3\Field19\Field17[$00] = setemitter(local3\Field19, entityx(local3\Field19\Field27[$00], $01, 1.0), entityy(local3\Field19\Field27[$00], $01, 1.0), entityz(local3\Field19\Field27[$00], $01, 1.0), $09)
                                local3\Field19\Field17[$00]\Field7 = $02
                            EndIf
                        Else
                            If (entityhidden(local3\Field19\Field16[$00]\Field7) = $00) Then
                                hideentity(local3\Field19\Field16[$00]\Field7)
                            EndIf
                            If (2.0 > local3\Field7) Then
                                For local20 = $00 To $03 Step $01
                                    local3\Field19\Field25[local20]\Field21 = $00
                                Next
                                openclosedoor(local3\Field19\Field25[$02], $01, $00)
                                tformpoint(-240.0, -9405.0, -635.0, local3\Field19\Field15, $00)
                                local1 = createnpc($01, tformedx(), tformedy(), tformedz())
                                local1\Field66 = 3.0
                                local1 = createnpc($00, local3\Field19\Field40, -250.0, local3\Field19\Field37)
                                local1\Field66 = 3.0
                                local1\Field43 = -4200.0
                                local1 = createnpc($00, local3\Field19\Field40, -250.0, local3\Field19\Field37)
                                changenpctextureid(local1, $10)
                                local1\Field66 = 3.0
                                local1\Field43 = -2100.0
                                local3\Field7 = 2.0
                            EndIf
                            rotateentity(local3\Field19\Field27[$01], curveangle(0.0, entitypitch(local3\Field19\Field27[$01], $01, 1.0), 15.0), entityyaw(local3\Field19\Field27[$01], $01, 1.0), 0.0, $01)
                        EndIf
                    ElseIf (1.0 = local3\Field4) Then
                        local3\Field4 = 0.0
                    EndIf
                    local34 = entityx(XZ0260X8X2\Field74, $01, 1.0)
                    local35 = entityy(XZ0260X8X2\Field74, $01, 1.0)
                    local36 = entityz(XZ0260X8X2\Field74, $01, 1.0)
                    XZ0260X8X2\Field27 = (isinsideelevator(local34, local35, local36, local3\Field19\Field27[$05]) Lor isinsideelevator(local34, local35, local36, local3\Field19\Field27[$06]))
                    toelevatorfloor = $FFFFFFFF
                    local3\Field1 = updateelevators(local3\Field1, local3\Field19\Field25[$04], local3\Field19\Field25[$05], local3\Field19\Field27[$05], local3\Field19\Field27[$06], local3, $01, $00)
                EndIf
            Case $0E
                If (playerroom = local3\Field19) Then
                    local3\Field19\Field25[$00]\Field21 = remotedooron
                    If (0.0 > entityy(XZ0260X8X2\Field74, $00, 1.0)) Then
                        If (0.0 = XZ0260X8X2\Field48) Then
                            If (0.0 = local3\Field4) Then
                                If (6.25 > entitydistancesquared(XZ0260X8X2\Field74, local3\Field19\Field25[$00]\Field0)) Then
                                    If (((0.0 <= XZ0260X8X2\Field52) And remotedooron) <> 0) Then
                                        giveachievement("012", $01)
                                        playsound_strict(snd_i\Field40[$07], $00, $00)
                                        If (local3\Field19\Field25[$00]\Field39 = $00) Then
                                            openclosedoor(local3\Field19\Field25[$00], $01, $00)
                                        EndIf
                                        tformpoint(-784.0, -768.0, 640.0, local3\Field19\Field15, $00)
                                        local31 = tformedx()
                                        local32 = tformedy()
                                        local33 = tformedz()
                                        For local20 = $00 To $01 Step $01
                                            local1 = createnpc($15, local31, (local32 + 0.05), local33)
                                            rotateentity(local1\Field82, entitypitch(local1\Field82, $00, 1.0), rnd(360.0, 0.0), entityroll(local1\Field82, $00, 1.0), $00)
                                        Next
                                        local3\Field4 = 1.0
                                    EndIf
                                EndIf
                            ElseIf (1.0 = local3\Field4) Then
                                rotateentity(local3\Field19\Field9[$00]\Field1, curveangle(-80.0, entitypitch(local3\Field19\Field9[$00]\Field1, $00, 1.0), 10.0), entityyaw(local3\Field19\Field9[$00]\Field1, $00, 1.0), 0.0, $00)
                                If (-79.0 > entitypitch(local3\Field19\Field9[$00]\Field1, $00, 1.0)) Then
                                    playsoundex(snd_i\Field59, camera, local3\Field19\Field9[$00]\Field1, 2.0, 1.0, $00, $00)
                                    local3\Field23 = 1.0
                                    local3\Field4 = 1.01
                                EndIf
                            Else
                                local62 = (((i_714\Field0 <> $02) And (T8660BZ460\Field3 <> $04)) And (T8660BZ460\Field10 <> $04))
                                If (1.0 = local3\Field23) Then
                                    If (local62 = $00) Then
                                        local3\Field23 = (Float updatelever(local3\Field19\Field9[$00]\Field1, $00, $50, -80.0))
                                    Else
                                        updatelever(local3\Field19\Field9[$00]\Field1, $01, $50, -80.0)
                                    EndIf
                                    local3\Field4 = curvevalue(90.0, local3\Field4, 500.0)
                                    updateredlight(local3\Field19\Field16[$00], 1500.0, 800.0)
                                    If (local3\Field0 = $00) Then
                                        local3\Field0 = loadsound_strict("SFX\Music\012Golgotha.ogg")
                                    EndIf
                                    local3\Field2 = loopsoundex(local3\Field0, local3\Field2, camera, local3\Field19\Field27[$00], 10.0, 1.0, $00)
                                    If (local62 <> 0) Then
                                        If (((-800.0 > XZ0260X8X2\Field42) And (0.0 = local3\Field1)) <> 0) Then
                                            tformpoint(-360.0, -700.0, 330.0, local3\Field19\Field15, $00)
                                            positionentity(XZ0260X8X2\Field74, tformedx(), tformedy(), tformedz(), $01)
                                            rotateentity(XZ0260X8X2\Field74, 0.0, (Float local3\Field19\Field21), 0.0, $01)
                                            resetentity(XZ0260X8X2\Field74)
                                            XZ0260X8X2\Field8 = 5.0
                                            XZ0260X8X2\Field53 = -10.0
                                            local3\Field1 = 1.0
                                        EndIf
                                        If (entityvisible(local3\Field19\Field27[$00], camera, 0.0) <> 0) Then
                                            cansave = $00
                                            XZ0260X8X2\Field69 = $00
                                            shouldplay = $20
                                            local25 = createpivot($00)
                                            positionentity(local25, entityx(camera, $00, 1.0), (entityy(local3\Field19\Field27[$00], $01, 1.0) - 0.05), entityz(camera, $00, 1.0), $00)
                                            pointentity(local25, local3\Field19\Field27[$00], 0.0)
                                            rotateentity(XZ0260X8X2\Field74, entitypitch(XZ0260X8X2\Field74, $00, 1.0), curveangle(entityyaw(local25, $00, 1.0), entityyaw(XZ0260X8X2\Field74, $00, 1.0), (80.0 - (local3\Field7 / 200.0))), 0.0, $00)
                                            turnentity(local25, 90.0, 0.0, 0.0, $00)
                                            camerapitch = curveangle((entitypitch(local25, $00, 1.0) + 25.0), (camerapitch + 90.0), (80.0 - (local3\Field7 / 200.0)))
                                            camerapitch = (camerapitch - 90.0)
                                            local41 = distancesquared(entityx(XZ0260X8X2\Field74, $00, 1.0), entityx(local3\Field19\Field27[$00], $01, 1.0), entityz(XZ0260X8X2\Field74, $00, 1.0), entityz(local3\Field19\Field27[$00], $01, 1.0), 0.0, 0.0)
                                            local50 = sqr(local41)
                                            XZ0260X8X2\Field62 = 150.0
                                            XZ0260X8X2\Field87 = (max((3.0 - local50), 0.0) / 3.0)
                                            local48 = (sin(((Float millisec) / 20.0)) + 1.0)
                                            XZ0260X8X2\Field55 = max((((2.0 - local50) * (local3\Field7 / 800.0)) * local48), XZ0260X8X2\Field55)
                                            XZ0260X8X2\Field51 = max(XZ0260X8X2\Field51, ((local48 * 8.0) * max((3.0 - local50), 0.0)))
                                            stopbreathsound()
                                            If (0.36 > local41) Then
                                                If (-800.0 > XZ0260X8X2\Field42) Then
                                                    makemeunplayable($00)
                                                EndIf
                                                XZ0260X8X2\Field42 = max((XZ0260X8X2\Field42 - ((fps\Field3[$00] * (((Float selecteddifficulty\Field8) * 0.2) + 1.0)) / ((Float i_714\Field0) + 1.0))), -1000.0)
                                                If (1.0 = local3\Field1) Then
                                                    local3\Field7 = min((local3\Field7 + fps\Field3[$00]), 6020.0)
                                                EndIf
                                                If (((70.0 < local3\Field7) And (70.0 >= (local3\Field7 - fps\Field3[$00]))) <> 0) Then
                                                    local3\Field8 = playsound_strict(loadtempsound("SFX\SCP\012\Speech0.ogg"), $01, $00)
                                                ElseIf (((910.0 < local3\Field7) And (910.0 >= (local3\Field7 - fps\Field3[$00]))) <> 0) Then
                                                    createmsg(getlocalstring("msg", "012_1"), 8.0)
                                                    XZ0260X8X2\Field11 = (XZ0260X8X2\Field11 + 0.5)
                                                    local3\Field8 = playsound_strict(loadtempsound("SFX\SCP\012\Speech1.ogg"), $01, $00)
                                                ElseIf (((2170.0 < local3\Field7) And (2170.0 >= (local3\Field7 - fps\Field3[$00]))) <> 0) Then
                                                    local28 = loadtexture_strict("GFX\Map\Textures\scp_012(2).png", $01, $00, 1.0)
                                                    entitytexture(local3\Field19\Field27[$02], local28, $00, $00)
                                                    deletesingletextureentryfromcache(local28, $00)
                                                    local28 = $00
                                                    createmsg(getlocalstring("msg", "012_2"), 8.0)
                                                    XZ0260X8X2\Field11 = max(XZ0260X8X2\Field11, 1.5)
                                                    local3\Field8 = playsound_strict(loadtempsound((("SFX\SCP\012\Speech" + (Str rand($02, $03))) + ".ogg")), $01, $00)
                                                ElseIf (((3430.0 < local3\Field7) And (3430.0 >= (local3\Field7 - fps\Field3[$00]))) <> 0) Then
                                                    createmsg(getlocalstring("msg", "012_3"), 8.0)
                                                    XZ0260X8X2\Field11 = (XZ0260X8X2\Field11 + 0.3)
                                                    local3\Field8 = playsound_strict(loadtempsound("SFX\SCP\012\Speech4.ogg"), $01, $00)
                                                ElseIf (((4410.0 < local3\Field7) And (4410.0 >= (local3\Field7 - fps\Field3[$00]))) <> 0) Then
                                                    local28 = loadtexture_strict("GFX\Map\Textures\scp_012(3).png", $01, $00, 1.0)
                                                    entitytexture(local3\Field19\Field27[$02], local28, $00, $00)
                                                    deletesingletextureentryfromcache(local28, $00)
                                                    local28 = $00
                                                    XZ0260X8X2\Field11 = (XZ0260X8X2\Field11 + 0.5)
                                                    local3\Field8 = playsound_strict(loadtempsound("SFX\SCP\012\Speech5.ogg"), $01, $00)
                                                ElseIf (((5180.0 < local3\Field7) And (5180.0 >= (local3\Field7 - fps\Field3[$00]))) <> 0) Then
                                                    local28 = loadtexture_strict("GFX\Map\Textures\scp_012(4).png", $01, $00, 1.0)
                                                    entitytexture(local3\Field19\Field27[$02], local28, $00, $00)
                                                    deletesingletextureentryfromcache(local28, $00)
                                                    local28 = $00
                                                    createmsg(getlocalstring("msg", "012_4"), 8.0)
                                                    XZ0260X8X2\Field1 = ((Float (0.0 = i_1025\Field1[$03])) * 2.0)
                                                    XZ0260X8X2\Field11 = (XZ0260X8X2\Field11 + 0.8)
                                                    local3\Field8 = playsound_strict(loadtempsound("SFX\SCP\012\Speech6.ogg"), $01, $00)
                                                    playsound_strict(loadtempsound((("SFX\SCP\1162_ARC\BodyHorrorExchange" + (Str rand($00, $03))) + ".ogg")), $00, $00)
                                                    If (XZ0260X8X2\Field25 = $00) Then
                                                        setcrouch($01)
                                                    EndIf
                                                    local5 = createdecal($07, pickedx(), (pickedy() + 0.005), pickedz(), 90.0, rnd(360.0, 0.0), 0.0, 0.1, 1.0, $00, $01, $00, $00, $00)
                                                    local5\Field3 = 0.45
                                                    local5\Field14 = 0.0002
                                                    entityparent(local5\Field0, local3\Field19\Field15, $01)
                                                ElseIf (((5950.0 < local3\Field7) And (5950.0 >= (local3\Field7 - fps\Field3[$00]))) <> 0) Then
                                                    msg\Field8 = format(getlocalstring("death", "012"), subjectname, "%s")
                                                    kill($01, $01, $00, $01)
                                                EndIf
                                                rotateentity(XZ0260X8X2\Field74, entitypitch(XZ0260X8X2\Field74, $00, 1.0), curveangle((entityyaw(XZ0260X8X2\Field74, $00, 1.0) + (sin((local3\Field7 * (local3\Field7 / 2000.0))) * (local3\Field7 / 300.0))), entityyaw(XZ0260X8X2\Field74, $00, 1.0), 80.0), 0.0, $00)
                                            Else
                                                XZ0260X8X2\Field42 = max((XZ0260X8X2\Field42 - ((fps\Field3[$00] * (((Float selecteddifficulty\Field8) * 0.12) + 0.6)) / ((Float i_714\Field0) + 1.0))), -1000.0)
                                                local40 = wrapangle((entityyaw(local25, $00, 1.0) - entityyaw(XZ0260X8X2\Field74, $00, 1.0)), 360.0)
                                                If (40.0 > local40) Then
                                                    XZ0260X8X2\Field21 = ((40.0 - local40) * 0.02)
                                                ElseIf (310.0 < local40) Then
                                                    XZ0260X8X2\Field21 = ((40.0 - (Abs (360.0 - local40))) * 0.02)
                                                EndIf
                                            EndIf
                                            freeentity(local25)
                                            local25 = $00
                                        ElseIf (((25.0 > distancesquared(entityx(XZ0260X8X2\Field74, $00, 1.0), entityx(local3\Field19\Field25[$00]\Field51, $00, 1.0), entityz(XZ0260X8X2\Field74, $00, 1.0), entityz(local3\Field19\Field25[$00]\Field51, $00, 1.0), 0.0, 0.0)) And (-2.5 > entityy(XZ0260X8X2\Field74, $00, 1.0))) <> 0) Then
                                            cansave = $00
                                            XZ0260X8X2\Field42 = max((XZ0260X8X2\Field42 - ((fps\Field3[$00] * (((Float selecteddifficulty\Field8) * 0.08) + 0.4)) / ((Float i_714\Field0) + 1.0))), -1000.0)
                                            XZ0260X8X2\Field69 = $00
                                            local25 = createpivot($00)
                                            positionentity(local25, entityx(camera, $00, 1.0), entityy(XZ0260X8X2\Field74, $00, 1.0), entityz(camera, $00, 1.0), $00)
                                            pointentity(local25, local3\Field19\Field25[$00]\Field51, 0.0)
                                            camerapitch = curveangle(90.0, (camerapitch + 90.0), 100.0)
                                            camerapitch = (camerapitch - 90.0)
                                            rotateentity(XZ0260X8X2\Field74, entitypitch(XZ0260X8X2\Field74, $00, 1.0), curveangle(entityyaw(local25, $00, 1.0), entityyaw(XZ0260X8X2\Field74, $00, 1.0), 150.0), 0.0, $00)
                                            local40 = wrapangle((entityyaw(local25, $00, 1.0) - entityyaw(XZ0260X8X2\Field74, $00, 1.0)), 360.0)
                                            If (40.0 > local40) Then
                                                XZ0260X8X2\Field21 = ((40.0 - local40) * 0.008)
                                            ElseIf (310.0 < local40) Then
                                                XZ0260X8X2\Field21 = ((40.0 - (Abs (360.0 - local40))) * 0.008)
                                            EndIf
                                            freeentity(local25)
                                            local25 = $00
                                        EndIf
                                    EndIf
                                Else
                                    local3\Field23 = (Float updatelever(local3\Field19\Field9[$00]\Field1, $00, $50, -80.0))
                                    If (entityhidden(local3\Field19\Field16[$00]\Field7) = $00) Then
                                        hideentity(local3\Field19\Field16[$00]\Field7)
                                    EndIf
                                    local3\Field4 = curvevalue(-90.0, local3\Field4, 500.0)
                                EndIf
                                positionentity(local3\Field19\Field27[$00], entityx(local3\Field19\Field27[$00], $01, 1.0), (local3\Field19\Field3 + min(((sin(local3\Field4) * -570.0) * (1.0 / 256.0)), -0.703125)), entityz(local3\Field19\Field27[$00], $01, 1.0), $01)
                            EndIf
                        EndIf
                    Else
                        If (ChannelPlaying(local3\Field2) <> 0) Then
                            StopChannel(local3\Field2)
                            local3\Field2 = $00
                        EndIf
                        If (local3\Field0 <> $00) Then
                            freesound_strict(local3\Field0)
                            local3\Field0 = $00
                        EndIf
                        If (ChannelPlaying(local3\Field8) <> 0) Then
                            StopChannel(local3\Field8)
                            local3\Field8 = $00
                        EndIf
                    EndIf
                EndIf
            Case $24
                If (playerroom = local3\Field19) Then
                    If (-11.125 < entityy(XZ0260X8X2\Field74, $00, 1.0)) Then
                        local34 = entityx(XZ0260X8X2\Field74, $01, 1.0)
                        local35 = entityy(XZ0260X8X2\Field74, $01, 1.0)
                        local36 = entityz(XZ0260X8X2\Field74, $01, 1.0)
                        XZ0260X8X2\Field27 = (((isinsideelevator(local34, local35, local36, local3\Field19\Field27[$00]) Lor isinsideelevator(local34, local35, local36, local3\Field19\Field27[$01])) Lor isinsideelevator(local34, local35, local36, local3\Field19\Field27[$02])) Lor isinsideelevator(local34, local35, local36, local3\Field19\Field27[$03]))
                        toelevatorfloor = $FFFFFFFF
                        local3\Field7 = updateelevators(local3\Field7, local3\Field19\Field25[$00], local3\Field19\Field25[$01], local3\Field19\Field27[$00], local3\Field19\Field27[$01], local3, $01, $00)
                        local3\Field1 = updateelevators(local3\Field1, local3\Field19\Field25[$02], local3\Field19\Field25[$03], local3\Field19\Field27[$02], local3\Field19\Field27[$03], local3, $01, $00)
                    Else
                        shouldplay = $18
                        XZ0260X8X2\Field10 = $01
                        If (0.0 = local3\Field4) Then
                            tformpoint(528.0, -3440.0, 96.0, local3\Field19\Field15, $00)
                            local1 = createnpc($04, tformedx(), tformedy(), tformedz())
                            pointentity(local1\Field82, local3\Field19\Field15, 0.0)
                            turnentity(local1\Field82, 0.0, (Float local3\Field19\Field21), 0.0, $00)
                            tformpoint(64.0, -3440.0, -1000.0, local3\Field19\Field15, $00)
                            local1 = createnpc($04, tformedx(), tformedy(), tformedz())
                            pointentity(local1\Field82, local3\Field19\Field15, 0.0)
                            turnentity(local1\Field82, 0.0, ((Float local3\Field19\Field21) + 60.0), 0.0, $00)
                            tformpoint(528.0, -2672.0, 96.0, local3\Field19\Field15, $00)
                            If (n_i\Field8 <> Null) Then
                                If (66.0 <> n_i\Field8\Field66) Then
                                    local3\Field19\Field32[$00] = n_i\Field8
                                    local3\Field19\Field32[$00]\Field66 = 2.0
                                    local3\Field19\Field32[$00]\Field31 = 1.0
                                    local3\Field19\Field32[$00]\Field22 = $01
                                    positionentity(local3\Field19\Field32[$00]\Field82, tformedx(), tformedy(), tformedz(), $00)
                                    resetentity(local3\Field19\Field32[$00]\Field82)
                                    pointentity(local3\Field19\Field32[$00]\Field82, local3\Field19\Field15, 0.0)
                                EndIf
                            Else
                                n_i\Field8 = createnpc($03, tformedx(), tformedy(), tformedz())
                                n_i\Field8\Field66 = 2.0
                                n_i\Field8\Field31 = 1.0
                                n_i\Field8\Field22 = $01
                                pointentity(n_i\Field8\Field82, local3\Field19\Field15, 0.0)
                                local3\Field19\Field32[$00] = n_i\Field8
                            EndIf
                            local3\Field2 = playsound_strict(loadtempsound("SFX\Room\Blackout.ogg"), $00, $00)
                            If (entitydistancesquared(local3\Field19\Field27[$03], XZ0260X8X2\Field74) > entitydistancesquared(local3\Field19\Field27[$01], XZ0260X8X2\Field74)) Then
                                tformpoint(2720.0, -3516.0, 1824.0, local3\Field19\Field15, $00)
                                local11 = createitem("Research Sector-02 Scheme", $00, tformedx(), tformedy(), tformedz(), $00, $00, $00, 1.0, $00)
                            Else
                                tformpoint(-2720.0, -3516.0, -1824.0, local3\Field19\Field15, $00)
                                local11 = createitem("Research Sector-02 Scheme", $00, tformedx(), tformedy(), tformedz(), $00, $00, $00, 1.0, $00)
                            EndIf
                            entitytype(local11\Field9, $03, $00)
                            local3\Field4 = 1.0
                        ElseIf (0.0 < local3\Field4) Then
                            local63 = (0.0 > entitypitch(local3\Field19\Field9[$01]\Field1, $01, 1.0))
                            local23 = updatelever(local3\Field19\Field9[$00]\Field1, $00, $50, -80.0)
                            local37 = (Float updatelever(local3\Field19\Field9[$01]\Field1, $00, $50, -80.0))
                            local3\Field19\Field25[$01]\Field21 = $01
                            local3\Field19\Field25[$03]\Field21 = $01
                            local3\Field19\Field25[$01]\Field19 = $00
                            local3\Field19\Field25[$03]\Field19 = $00
                            If (local37 <> (Float local63)) Then
                                If ((Int local37) <> 0) Then
                                    playsound_strict(snd_i\Field34, $00, $00)
                                Else
                                    playsound_strict(snd_i\Field11, $00, $00)
                                EndIf
                            EndIf
                            updatebutton(local3\Field19\Field27[$05])
                            If (0.0 < local3\Field23) Then
                                local3\Field23 = (local3\Field23 + fps\Field3[$00])
                                entitytexture(local3\Field19\Field27[$05], d_i\Field1[$01], $00, $00)
                                If (350.0 < local3\Field23) Then
                                    If (local3\Field19\Field17[$00] <> Null) Then
                                        freeemitter(local3\Field19\Field17[$00], $00)
                                    EndIf
                                    entitytexture(local3\Field19\Field27[$05], d_i\Field1[$00], $00, $00)
                                    local3\Field23 = 0.0
                                EndIf
                                GUESSEDfreeentity_7(local3\Field19\Field27[$05], $FFFFFFFF, $00)
                            ElseIf ((((d_i\Field15 = local3\Field19\Field27[$05]) And XZ0260X8X2\Field3) And (Int local37)) <> 0) Then
                                playsoundex(buttonsfx[$00], camera, local3\Field19\Field27[$05], 10.0, 1.0, $00, $00)
                                XZ0260X8X2\Field3 = $00
                                If (0.0 = local3\Field23) Then
                                    If (opt\Field69 > $00) Then
                                        local3\Field19\Field17[$00] = setemitter(local3\Field19, entityx(local3\Field19\Field27[$06], $01, 1.0), entityy(local3\Field19\Field27[$06], $01, 1.0), entityz(local3\Field19\Field27[$06], $01, 1.0), $12)
                                        local3\Field19\Field17[$00]\Field7 = $03
                                    EndIf
                                    local3\Field23 = 0.01
                                EndIf
                            EndIf
                            If (70.0 <= local3\Field4) Then
                                fog\Field13 = 8.0
                                If ((Int local37) <> 0) Then
                                    shouldplay = $08
                                    isblackout = $00
                                    local3\Field8 = loopsoundex(roomambience[$07], local3\Field8, camera, local3\Field19\Field27[$04], 6.0, 1.0, $00)
                                    For local20 = $04 To $07 Step $01
                                        local3\Field19\Field25[local20]\Field21 = $00
                                    Next
                                    local3\Field4 = max(local3\Field4, 12600.0)
                                Else
                                    isblackout = $01
                                    If (ChannelPlaying(local3\Field8) <> 0) Then
                                        StopChannel(local3\Field8)
                                        local3\Field8 = $00
                                    EndIf
                                    For local20 = $04 To $07 Step $01
                                        local3\Field19\Field25[local20]\Field21 = $01
                                    Next
                                EndIf
                            Else
                                local3\Field4 = min((local3\Field4 + fps\Field3[$00]), 70.0)
                            EndIf
                            If ((local23 And (Int local37)) <> 0) Then
                                local3\Field19\Field25[$01]\Field21 = $00
                                local3\Field19\Field25[$03]\Field21 = $00
                                local34 = entityx(XZ0260X8X2\Field74, $01, 1.0)
                                local35 = entityy(XZ0260X8X2\Field74, $01, 1.0)
                                local36 = entityz(XZ0260X8X2\Field74, $01, 1.0)
                                XZ0260X8X2\Field27 = (((isinsideelevator(local34, local35, local36, local3\Field19\Field27[$00]) Lor isinsideelevator(local34, local35, local36, local3\Field19\Field27[$01])) Lor isinsideelevator(local34, local35, local36, local3\Field19\Field27[$02])) Lor isinsideelevator(local34, local35, local36, local3\Field19\Field27[$03]))
                                toelevatorfloor = $FFFFFFFF
                                local3\Field7 = updateelevators(local3\Field7, local3\Field19\Field25[$00], local3\Field19\Field25[$01], local3\Field19\Field27[$00], local3\Field19\Field27[$01], local3, $01, $00)
                                local3\Field1 = updateelevators(local3\Field1, local3\Field19\Field25[$02], local3\Field19\Field25[$03], local3\Field19\Field27[$02], local3\Field19\Field27[$03], local3, $01, $00)
                                If (local3\Field19\Field32[$00] <> Null) Then
                                    If (local3\Field19\Field32[$00]\Field22 <> 0) Then
                                        local20 = $00
                                        If (9.0 > entitydistancesquared(XZ0260X8X2\Field74, local3\Field19\Field25[$01]\Field51)) Then
                                            local20 = $01
                                        ElseIf (9.0 > entitydistancesquared(XZ0260X8X2\Field74, local3\Field19\Field25[$03]\Field51)) Then
                                            local20 = $03
                                        EndIf
                                        If (local20 > $00) Then
                                            positionentity(local3\Field19\Field32[$00]\Field82, entityx(local3\Field19\Field27[local20], $01, 1.0), entityy(local3\Field19\Field27[local20], $01, 1.0), entityz(local3\Field19\Field27[local20], $01, 1.0), $00)
                                            resetentity(local3\Field19\Field32[$00]\Field82)
                                            giveachievement("049", $01)
                                            playsoundex(snd_i\Field22, camera, local3\Field19\Field27[local20], 4.0, 1.0, $00, $00)
                                            local3\Field19\Field25[local20]\Field21 = $00
                                            openclosedoor(local3\Field19\Field25[local20], $01, $00)
                                            local3\Field19\Field25[(local20 - $01)]\Field39 = $00
                                            local3\Field19\Field25[local20]\Field39 = $01
                                            local3\Field19\Field32[$00]\Field30 = findpath(local3\Field19\Field32[$00], entityx(XZ0260X8X2\Field74, $00, 1.0), entityy(XZ0260X8X2\Field74, $00, 1.0), entityz(XZ0260X8X2\Field74, $00, 1.0))
                                            loadnpcsound(local3\Field19\Field32[$00], "SFX\SCP\049\DetectedInChamber.ogg", $01)
                                            local3\Field19\Field32[$00]\Field6 = loopsoundex(local3\Field19\Field32[$00]\Field67, local3\Field19\Field32[$00]\Field6, camera, local3\Field19\Field32[$00]\Field98, 10.0, 1.0, $01)
                                            local3\Field19\Field32[$00]\Field31 = 0.0
                                            local3\Field19\Field32[$00]\Field22 = $00
                                            local3\Field19\Field32[$00]\Field13 = $02
                                            local3\Field19\Field32[$00]\Field66 = 2.0
                                        EndIf
                                    EndIf
                                EndIf
                            EndIf
                            If (13300.0 > local3\Field4) Then
                                If (12600.0 <= local3\Field4) Then
                                    For local20 = $00 To $02 Step $02
                                        local3\Field19\Field25[local20]\Field39 = $01
                                        local3\Field19\Field25[(local20 + $01)]\Field39 = $00
                                    Next
                                    local3\Field4 = 13300.0
                                EndIf
                            ElseIf (16800.0 > local3\Field4) Then
                                For local1 = Each npcs
                                    If (((local1\Field77 = $04) And (0.0 = local1\Field66)) <> 0) Then
                                        setnpcframe(local1, 155.0, $01)
                                        local1\Field66 = 1.0
                                    EndIf
                                Next
                                local3\Field4 = 16870.0
                            EndIf
                        ElseIf (local3\Field19\Field32[$00] <> Null) Then
                            If (-280.0 < local3\Field4) Then
                                If (-230.0 > XZ0260X8X2\Field52) Then
                                    XZ0260X8X2\Field53 = -10.0
                                    XZ0260X8X2\Field52 = -231.0
                                    local3\Field4 = (local3\Field4 - fps\Field3[$00])
                                    If (-280.0 >= local3\Field4) Then
                                        hideentity(XZ0260X8X2\Field28)
                                        showentity(XZ0260X8X2\Field74)
                                        i_268\Field2 = $00
                                        T8660BZ460\Field3 = $00
                                        T8660BZ460\Field7 = $00
                                        T8660BZ460\Field8 = $00
                                        T8660BZ460\Field11 = $00
                                        XZ0260X8X2\Field23 = $01
                                        If (selecteddifficulty\Field1 >= $02) Then
                                            deletegame(currsave)
                                            gamesaved = $00
                                            loadsavedgames()
                                        EndIf
                                        msg\Field8 = getlocalstring("death", "0492")
                                        XZ0260X8X2\Field16 = 0.0
                                        XZ0260X8X2\Field53 = -10.0
                                        i_008\Field0 = 0.0
                                        i_409\Field0 = 0.0
                                        XZ0260X8X2\Field52 = 0.0
                                        If (local3\Field19\Field32[$00] <> Null) Then
                                            positionentity(local3\Field19\Field32[$00]\Field82, entityx(local3\Field19\Field27[$00], $01, 1.0), entityy(local3\Field19\Field27[$00], $01, 1.0), entityz(local3\Field19\Field27[$00], $01, 1.0), $01)
                                            resetentity(local3\Field19\Field32[$00]\Field82)
                                        EndIf
                                        For local1 = Each npcs
                                            If (local1\Field77 = $04) Then
                                                local1\Field4 = $00
                                            EndIf
                                        Next
                                        tformpoint(64.0, -3388.8, 1000.0, local3\Field19\Field15, $00)
                                        local1 = createnpc($18, tformedx(), tformedy(), tformedz())
                                        local1\Field66 = 6.0
                                        local1\Field62 = 420.0
                                        local3\Field19\Field32[$01] = local1
                                        positionentity(XZ0260X8X2\Field74, entityx(local3\Field19\Field15, $01, 1.0), (local3\Field19\Field3 - 13.2375), entityz(local3\Field19\Field15, $01, 1.0), $00)
                                        resetentity(XZ0260X8X2\Field74)
                                        pointentity(XZ0260X8X2\Field74, local3\Field19\Field32[$01]\Field82, 0.0)
                                        playsound_strict(loadtempsound("SFX\Character\MTF\049_2\Spotted.ogg"), $01, $00)
                                        loadeventsound(local3, "SFX\SCP\049_2\Breath.ogg", $00)
                                    EndIf
                                EndIf
                            Else
                                XZ0260X8X2\Field64 = 800.0
                                XZ0260X8X2\Field21 = 0.5
                                XZ0260X8X2\Field11 = max(2.0, XZ0260X8X2\Field11)
                                XZ0260X8X2\Field39 = 0.0
                                local25 = createpivot($00)
                                positionentity(local25, entityx(local3\Field19\Field32[$01]\Field82, $00, 1.0), (entityy(local3\Field19\Field32[$01]\Field82, $00, 1.0) + 0.2), entityz(local3\Field19\Field32[$01]\Field82, $00, 1.0), $00)
                                pointentity(XZ0260X8X2\Field74, local25, 0.0)
                                pointentity(camera, local25, entityroll(camera, $00, 1.0))
                                freeentity(local25)
                                local25 = $00
                            EndIf
                        EndIf
                    EndIf
                EndIf
            Case $25
                If (playerroom = local3\Field19) Then
                    If (-6.929688 > entityy(XZ0260X8X2\Field74, $00, 1.0)) Then
                        shouldplay = $1B
                        XZ0260X8X2\Field10 = $01
                        If (0.0 = local3\Field4) Then
                            tformpoint(-2251.8, -2455.8, 3033.0, local3\Field19\Field15, $00)
                            local37 = tformedx()
                            local38 = tformedy()
                            local39 = tformedz()
                            local3\Field19\Field32[$00] = createnpc($16, local37, local38, local39)
                            local3\Field19\Field32[$00]\Field57 = -1.0
                            local3\Field19\Field32[$00]\Field1 = $01
                            changenpctextureid(local3\Field19\Field32[$00], $19)
                            setnpcframe(local3\Field19\Field32[$00], 19.0, $01)
                            rotateentity(local3\Field19\Field32[$00]\Field82, 0.0, (Float local3\Field19\Field21), 0.0, $01)
                            local5 = createdecal($14, local37, ((local38 - (1.0 / 4.55516)) + 0.005), local39, 90.0, rnd(360.0, 0.0), 0.0, 0.85, 0.8, $00, $01, $00, $00, $00)
                            entityparent(local5\Field0, local3\Field19\Field15, $01)
                            If (i_005\Field0 = $02) Then
                                tformpoint(-2408.0, -2351.0, 2824.0, local3\Field19\Field15, $00)
                                local11 = createitem("Crystallized SCP-005", $08, tformedx(), tformedy(), tformedz(), $00, $00, $00, 1.0, $00)
                                entitytype(local11\Field9, $03, $00)
                            EndIf
                            tformpoint(-1483.0, -2351.0, 3504.0, local3\Field19\Field15, $00)
                            local11 = createitem("Document SCP-409", $00, tformedx(), tformedy(), tformedz(), $00, $00, $00, 1.0, $00)
                            rotateentity(local11\Field9, 0.0, 0.0, 0.0, $00)
                            entitytype(local11\Field9, $03, $00)
                            local3\Field4 = 1.0
                        ElseIf (0.0 = i_409\Field0) Then
                            If (0.81 > entitydistancesquared(XZ0260X8X2\Field74, local3\Field19\Field32[$00]\Field82)) Then
                                giveachievement("409", $01)
                                If (((i_427\Field2 = $00) And (25200.0 > i_427\Field1)) <> 0) Then
                                    XZ0260X8X2\Field64 = 1000.0
                                    i_409\Field0 = 0.001
                                EndIf
                            EndIf
                            If (interactobject(local3\Field19\Field27[$02], 0.8, $00) <> 0) Then
                                giveachievement("409", $01)
                                If (((i_427\Field2 = $00) And (25200.0 > i_427\Field1)) <> 0) Then
                                    createmsg(getlocalstring("msg", "409"), 6.0)
                                    XZ0260X8X2\Field64 = 1000.0
                                    i_409\Field0 = 0.001
                                Else
                                    createmsg(getlocalstring("msg", "409.nothappened"), 6.0)
                                EndIf
                            EndIf
                        EndIf
                        If (25.0 > entitydistancesquared(XZ0260X8X2\Field74, local3\Field19\Field27[$03])) Then
                            If (rand($32, $01) = $01) Then
                                settemplatevelocity(particleeffect[$13], -0.007, 0.008, -0.001, 0.0012, -0.007, -0.008)
                                setemitter(local3\Field19, entityx(local3\Field19\Field27[$03], $01, 1.0), entityy(local3\Field19\Field27[$03], $01, 1.0), entityz(local3\Field19\Field27[$03], $01, 1.0), $13)
                                playsoundex(snd_i\Field10, camera, local3\Field19\Field27[$03], 3.0, 0.4, $00, $00)
                            EndIf
                        EndIf
                    EndIf
                    local34 = entityx(XZ0260X8X2\Field74, $01, 1.0)
                    local35 = entityy(XZ0260X8X2\Field74, $01, 1.0)
                    local36 = entityz(XZ0260X8X2\Field74, $01, 1.0)
                    XZ0260X8X2\Field27 = (isinsideelevator(local34, local35, local36, local3\Field19\Field27[$00]) Lor isinsideelevator(local34, local35, local36, local3\Field19\Field27[$01]))
                    toelevatorfloor = $FFFFFFFF
                    local3\Field7 = updateelevators(local3\Field7, local3\Field19\Field25[$00], local3\Field19\Field25[$01], local3\Field19\Field27[$00], local3\Field19\Field27[$01], local3, $01, $00)
                EndIf
            Case $0F
                If (0.0 = local3\Field4) Then
                    If (isroomadjacent(playerroom, local3\Field19) <> 0) Then
                        If (n_i\Field2\Field93 = $00) Then
                            If (2.0 > n_i\Field2\Field66) Then
                                local3\Field2 = playsound_strict(loadtempsound("SFX\Character\Scientist\EmilyScream.ogg"), $01, $00)
                                local5 = createdecal($00, entityx(local3\Field19\Field27[$00], $01, 1.0), (local3\Field19\Field3 + 0.005), entityz(local3\Field19\Field27[$00], $01, 1.0), 90.0, rnd(360.0, 0.0), 0.0, 0.8, 0.8, $00, $01, $00, $00, $00)
                                entityparent(local5\Field0, local3\Field19\Field15, $01)
                                affectdecaydoor(local3\Field19\Field25[$00])
                                local3\Field4 = 1.0
                            EndIf
                        Else
                            local3\Field19\Field25[$00]\Field21 = $00
                            removeevent(local3)
                            Return $00
                        EndIf
                    EndIf
                ElseIf (1.0 = local3\Field4) Then
                    If (ChannelPlaying(local3\Field2) = $00) Then
                        local3\Field19\Field25[$00]\Field21 = $00
                        removeevent(local3)
                    Else
                        updatesoundorigin(local3\Field2, camera, local3\Field19\Field27[$00], 30.0, 1.0, $01, $01, $00)
                    EndIf
                EndIf
            Case $3A
                local64 = local3\Field19\Field13
                If (((playerroom = local3\Field19) And (local64 <> Null)) <> 0) Then
                    If (20.0 < entityy(XZ0260X8X2\Field74, $00, 1.0)) Then
                        For local2 = Each rooms
                            hideroomsnocoll(local2)
                        Next
                        showroomsnocoll(local3\Field19)
                        showroomscoll(local3\Field19)
                        updateforest(local64)
                        local3\Field28 = (local3\Field28 - (fps\Field3[$00] * max((Float ((0.0 < XZ0260X8X2\Field14) * $06)), 1.0)))
                        If (0.0 >= local3\Field28) Then
                            setemitter(Null, entityx(XZ0260X8X2\Field74, $00, 1.0), entityy(XZ0260X8X2\Field74, $00, 1.0), entityz(XZ0260X8X2\Field74, $00, 1.0), $18)
                            local3\Field28 = 25.0
                        EndIf
                        XZ0260X8X2\Field51 = max(XZ0260X8X2\Field51, ((sin(((Float millisec) / 20.0)) + 1.0) * 5.0))
                        shouldplay = $09
                        If (local3\Field19\Field32[$00] = Null) Then
                            shouldplay = $21
                            If (rand($64, $01) = $01) Then
                                XZ0260X8X2\Field1 = 0.7
                                XZ0260X8X2\Field87 = 0.7
                                XZ0260X8X2\Field62 = rnd(60.0, 70.0)
                            EndIf
                        EndIf
                        If (local3\Field19\Field32[$00] <> Null) Then
                            If ((((1.0 = local3\Field19\Field32[$00]\Field65) And (1.0 < local3\Field19\Field32[$00]\Field66)) Lor (2.0 < local3\Field19\Field32[$00]\Field66)) <> 0) Then
                                shouldplay = $0C
                            EndIf
                        EndIf
                        If (chs\Field7 = $00) Then
                            If (28.5 >= entityy(XZ0260X8X2\Field74, $00, 1.0)) Then
                                XZ0260X8X2\Field53 = -10.0
                                kill($00, $01, $00, $01)
                            ElseIf ((entityy(local64\Field4, $01, 1.0) + 0.5) < entityy(XZ0260X8X2\Field74, $00, 1.0)) Then
                                moveentity(XZ0260X8X2\Field74, 0.0, (((entityy(local64\Field4, $01, 1.0) + 0.5) - entityy(XZ0260X8X2\Field74, $00, 1.0)) * fps\Field3[$00]), 0.0, $00)
                            EndIf
                        EndIf
                        If (local3\Field19\Field32[$00] <> Null) Then
                            If (((0.0 = local3\Field19\Field32[$00]\Field66) Lor (400.0 < entitydistancesquared(XZ0260X8X2\Field74, local3\Field19\Field32[$00]\Field82))) <> 0) Then
                                local3\Field1 = (((XZ0260X8X2\Field76 + 1.0) * fps\Field3[$00]) + local3\Field1)
                                If (((10.0 > (local3\Field1 Mod 500.0)) And (490.0 < ((local3\Field1 - ((XZ0260X8X2\Field76 + 1.0) * fps\Field3[$00])) Mod 500.0))) <> 0) Then
                                    If ((((3000.0 - ((Float selecteddifficulty\Field2) * 500.0)) < local3\Field1) And (local3\Field1 > rnd((((Float selecteddifficulty\Field2) * 500.0) + 10000.0), 0.0))) <> 0) Then
                                        local3\Field19\Field32[$00]\Field66 = 2.0
                                        positionentity(local3\Field19\Field32[$00]\Field82, 0.0, -110.0, 0.0, $00)
                                        local3\Field1 = (local3\Field1 - rnd(1000.0, (2000.0 - ((Float selecteddifficulty\Field2) * 500.0))))
                                    Else
                                        local3\Field19\Field32[$00]\Field66 = 1.0
                                        positionentity(local3\Field19\Field32[$00]\Field82, 0.0, -110.0, 0.0, $00)
                                    EndIf
                                EndIf
                            EndIf
                        EndIf
                        If ((local64\Field1[$00]\Field39 Lor local64\Field1[$01]\Field39) <> 0) Then
                            XZ0260X8X2\Field53 = -10.0
                            positionentity(XZ0260X8X2\Field74, entityx(local3\Field19\Field25[$00]\Field51, $01, 1.0), 0.5, entityz(local3\Field19\Field25[$00]\Field51, $01, 1.0), $00)
                            rotateentity(XZ0260X8X2\Field74, 0.0, (entityyaw(local3\Field19\Field15, $01, 1.0) + (local3\Field7 * 180.0)), 0.0, $00)
                            moveentity(XZ0260X8X2\Field74, 0.0, 0.0, 1.5, $00)
                            resetentity(XZ0260X8X2\Field74)
                            resetrender()
                            isblackout = previsblackout
                            fog\Field13 = 8.0
                            clearfogcolor()
                            local3\Field4 = 0.0
                            local3\Field1 = 0.0
                        EndIf
                    Else
                        If (entityhidden(local64\Field4) = $00) Then
                            hideentity(local64\Field4)
                        EndIf
                        For local20 = $00 To $01 Step $01
                            local64\Field1[local20]\Field39 = $00
                            local64\Field1[local20]\Field21 = $02
                        Next
                        If (local3\Field19\Field25[$00]\Field39 <> 0) Then
                            If (entityhidden(local64\Field4) <> 0) Then
                                showentity(local64\Field4)
                            EndIf
                            XZ0260X8X2\Field53 = -10.0
                            If (local3\Field19\Field32[$00] <> Null) Then
                                local3\Field19\Field32[$00]\Field66 = 0.0
                            EndIf
                            local3\Field19\Field25[$00]\Field39 = $00
                            local3\Field19\Field25[$00]\Field21 = $01
                            previsblackout = isblackout
                            isblackout = $00
                            local25 = createpivot($00)
                            positionentity(local25, entityx(camera, $00, 1.0), entityy(camera, $00, 1.0), entityz(camera, $00, 1.0), $00)
                            pointentity(local25, local3\Field19\Field15, 0.0)
                            local40 = wrapangle((entityyaw(local25, $00, 1.0) - entityyaw(local3\Field19\Field15, $01, 1.0)), 360.0)
                            local20 = ((90.0 >= local40) Lor (270.0 <= local40))
                            positionentity(XZ0260X8X2\Field74, entityx(local64\Field1[local20]\Field51, $01, 1.0), ((entityy(local64\Field1[local20]\Field51, $01, 1.0) + entityy(XZ0260X8X2\Field74, $01, 1.0)) + 0.5), entityz(local64\Field1[local20]\Field51, $01, 1.0), $01)
                            rotateentity(XZ0260X8X2\Field74, 0.0, (entityyaw(local64\Field1[local20]\Field51, $01, 1.0) - 180.0), 0.0, $01)
                            moveentity(XZ0260X8X2\Field74, -0.5, 0.0, 0.5, $00)
                            local64\Field1[$00]\Field21 = ($02 - local20)
                            local64\Field1[$01]\Field21 = ($01 + local20)
                            local3\Field7 = (1.0 - (Float local20))
                            freeentity(local25)
                            local25 = $00
                            resetentity(XZ0260X8X2\Field74)
                            local3\Field1 = 0.0
                            local3\Field4 = 1.0
                        EndIf
                    EndIf
                ElseIf (local64 <> Null) Then
                    If (entityhidden(local64\Field4) = $00) Then
                        hideentity(local64\Field4)
                    EndIf
                Else
                    removeevent(local3)
                EndIf
            Case $10
                If (playerroom = local3\Field19) Then
                    If (0.0 < local3\Field4) Then
                        cansave = $00
                        If ((((i_714\Field0 <> $02) And (T8660BZ460\Field10 <> $04)) And (T8660BZ460\Field3 <> $04)) <> 0) Then
                            XZ0260X8X2\Field64 = (800.0 - ((Float ((i_714\Field0 = $01) Lor (T8660BZ460\Field10 <> $00))) * 200.0))
                            XZ0260X8X2\Field1 = (1.0 - ((Float ((i_714\Field0 = $01) Lor (T8660BZ460\Field10 <> $00))) * 0.5))
                            i_1123\Field1 = loopsoundlocal(i_1123\Field0, i_1123\Field1, 1.0, $00)
                        EndIf
                    EndIf
                    Select local3\Field4
                        Case 1.0
                            XZ0260X8X2\Field20 = XZ0260X8X2\Field11
                            XZ0260X8X2\Field73 = XZ0260X8X2\Field39
                            previsblackout = isblackout
                            isblackout = $00
                            local3\Field19\Field25[$00]\Field39 = $00
                            local3\Field19\Field25[$03]\Field39 = $00
                            local3\Field19\Field25[$04]\Field39 = $00
                            local3\Field19\Field25[$04]\Field21 = $00
                            local3\Field19\Field25[$05]\Field39 = $00
                            local3\Field19\Field25[$05]\Field21 = $00
                            local3\Field19\Field25[$06]\Field39 = $00
                            local3\Field19\Field25[$07]\Field39 = $00
                            local3\Field19\Field27[$07] = loadrmesh("GFX\Map\cont2_1123_cell.rmesh", Null, $01)
                            scaleentity(local3\Field19\Field27[$07], (1.0 / 256.0), (1.0 / 256.0), (1.0 / 256.0), $00)
                            positionentity(local3\Field19\Field27[$07], local3\Field19\Field40, local3\Field19\Field3, local3\Field19\Field37, $00)
                            rotateentity(local3\Field19\Field27[$07], 0.0, (Float local3\Field19\Field21), 0.0, $00)
                            entityparent(local3\Field19\Field27[$07], local3\Field19\Field15, $01)
                            tformpoint(-139.0, 5006.0, 655.0, local3\Field19\Field15, $00)
                            local3\Field19\Field32[$00] = createnpc($16, tformedx(), tformedy(), tformedz())
                            local3\Field19\Field32[$00]\Field66 = -1.0
                            freeentity(local3\Field19\Field32[$00]\Field98)
                            local3\Field19\Field32[$00]\Field98 = $00
                            local3\Field19\Field32[$00]\Field98 = loadanimmesh_strict("GFX\NPCs\nazi_officer.b3d", $00, $01)
                            local27 = (0.51 / meshwidth(local3\Field19\Field32[$00]\Field98))
                            scaleentity(local3\Field19\Field32[$00]\Field98, local27, local27, local27, $00)
                            positionentity(XZ0260X8X2\Field74, entityx(local3\Field19\Field27[$00], $01, 1.0), entityy(local3\Field19\Field27[$00], $01, 1.0), entityz(local3\Field19\Field27[$00], $01, 1.0), $01)
                            resetentity(XZ0260X8X2\Field74)
                            For local20 = $00 To (maxitemamount - $01) Step $01
                                If (TX60DB8XBBZ(local20) <> Null) Then
                                    removewearableitems(TX60DB8XBBZ(local20))
                                EndIf
                            Next
                            tformpoint(-756.0, 5016.0, 521.0, local3\Field19\Field15, $00)
                            FX06206F0 = createitem("Leaflet", $00, tformedx(), tformedy(), tformedz(), $00, $00, $00, 1.0, $00)
                            XZ0260X8X2\Field1 = 1.0
                            XZ0260X8X2\Field64 = 1200.0
                            XZ0260X8X2\Field11 = 1.0
                            local3\Field4 = 2.0
                        Case 2.0
                            local3\Field7 = (local3\Field7 + fps\Field3[$00])
                            If (((closestitem = FX06206F0) And TDD0Z6BXB6\Field7) <> 0) Then
                                pickitem(FX06206F0, $01)
                                selecteditem = FX06206F0
                            EndIf
                            pointentity(local3\Field19\Field32[$00]\Field82, XZ0260X8X2\Field74, 0.0)
                            XZ0260X8X2\Field64 = max(XZ0260X8X2\Field64, 100.0)
                            shouldplay = $1D
                            If (1000.0 < local3\Field7) Then
                                If (local3\Field19\Field25[$03]\Field39 = $00) Then
                                    openclosedoor(local3\Field19\Field25[$03], $01, $00)
                                EndIf
                                If (((1040.0 <= local3\Field7) And (1040.0 > (local3\Field7 - fps\Field3[$00]))) <> 0) Then
                                    local3\Field19\Field32[$00]\Field63 = playsoundex(loadtempsound("SFX\SCP\1123\Officer0.ogg"), camera, local3\Field19\Field32[$00]\Field98, 10.0, 1.0, $01, $00)
                                ElseIf (((1400.0 <= local3\Field7) And (1400.0 > (local3\Field7 - fps\Field3[$00]))) <> 0) Then
                                    local3\Field19\Field32[$00]\Field63 = playsoundex(loadtempsound("SFX\SCP\1123\Officer1.ogg"), camera, local3\Field19\Field32[$00]\Field98, 10.0, 1.0, $01, $00)
                                EndIf
                                animatenpc(local3\Field19\Field32[$00], 3.0, 26.0, 0.2, $01)
                                If (2.344727 < entitydistancesquared(XZ0260X8X2\Field74, local3\Field19\Field27[$00])) Then
                                    XZ0260X8X2\Field53 = -10.0
                                    XZ0260X8X2\Field8 = 2.0
                                    XZ0260X8X2\Field64 = 500.0
                                    tformpoint(828.0, 4946.0, 592.0, local3\Field19\Field15, $00)
                                    positionentity(XZ0260X8X2\Field74, tformedx(), tformedy(), tformedz(), $01)
                                    rotateentity(XZ0260X8X2\Field74, 0.0, entityyaw(local3\Field19\Field15, $01, 1.0), 0.0, $00)
                                    resetentity(XZ0260X8X2\Field74)
                                    removeitem(FX06206F0, $01)
                                    FX06206F0 = Null
                                    local3\Field4 = 3.0
                                EndIf
                            EndIf
                        Case 3.0
                            If (rand($96, $01) = $01) Then
                                openclosedoor(local3\Field19\Field25[$01], $01, $00)
                            EndIf
                            If (local3\Field19\Field25[$00]\Field39 <> 0) Then
                                tformpoint(-706.0, 5006.0, -845.0, local3\Field19\Field15, $00)
                                positionentity(local3\Field19\Field32[$00]\Field82, tformedx(), tformedy(), tformedz(), $00)
                                resetentity(local3\Field19\Field32[$00]\Field82)
                                XZ0260X8X2\Field53 = -10.0
                                XZ0260X8X2\Field8 = 2.0
                                playsound_strict(snd_i\Field40[$0B], $00, $00)
                                For local20 = $00 To (maxitemamount - $01) Step $01
                                    If (TX60DB8XBBZ(local20) <> Null) Then
                                        removewearableitems(TX60DB8XBBZ(local20))
                                    EndIf
                                Next
                                tformpoint(268.0, 0.0, -640.0, local3\Field19\Field15, $00)
                                positionentity(XZ0260X8X2\Field74, tformedx(), (entityy(XZ0260X8X2\Field74, $00, 1.0) + 0.1), tformedz(), $01)
                                resetentity(XZ0260X8X2\Field74)
                                resetinput(10.0)
                                tformpoint(337.0, 0.0, -640.0, local3\Field19\Field15, $00)
                                local16 = createdoor(Null, tformedx(), (local3\Field19\Field3 + 19.00391), tformedz(), ((Float local3\Field19\Field21) + 90.0), $00, $05, $00, $00, $00)
                                local16\Field21 = $02
                                local16\Field47 = $00
                                local3\Field19\Field25[$08] = local16
                                local3\Field19\Field27[$08] = loadrmesh("GFX\Map\cont2_1123_door_frame.rmesh", Null, $01)
                                positionentity(local3\Field19\Field27[$08], local3\Field19\Field40, local3\Field19\Field3, local3\Field19\Field37, $00)
                                rotateentity(local3\Field19\Field27[$08], 0.0, (Float local3\Field19\Field21), 0.0, $00)
                                scaleentity(local3\Field19\Field27[$08], (1.0 / 256.0), (1.0 / 256.0), (1.0 / 256.0), $00)
                                local3\Field4 = 4.0
                            EndIf
                        Case 4.0
                            If (local3\Field19\Field25[$05]\Field39 <> 0) Then
                                pointentity(local3\Field19\Field32[$00]\Field82, XZ0260X8X2\Field74, 0.0)
                                animatenpc(local3\Field19\Field32[$00], 27.0, 54.0, 0.5, $00)
                                If (53.9 <= local3\Field19\Field32[$00]\Field103) Then
                                    local3\Field2 = playsound_strict(loadtempsound("SFX\SCP\1123\Horror.ogg"), $00, $00)
                                    XZ0260X8X2\Field64 = 500.0
                                    XZ0260X8X2\Field11 = 1.5
                                    XZ0260X8X2\Field39 = 70.0
                                    XZ0260X8X2\Field53 = -10.0
                                    XZ0260X8X2\Field8 = 2.0
                                    positionentity(XZ0260X8X2\Field74, entityx(local3\Field19\Field15, $01, 1.0), 0.3, entityz(local3\Field19\Field15, $01, 1.0), $01)
                                    resetentity(XZ0260X8X2\Field74)
                                    local3\Field7 = 0.0
                                    local3\Field4 = 5.0
                                EndIf
                            EndIf
                        Case 5.0
                            local3\Field7 = (local3\Field7 + fps\Field3[$00])
                            If (500.0 < local3\Field7) Then
                                For local20 = $04 To $05 Step $01
                                    local3\Field19\Field25[local20]\Field39 = $00
                                    local3\Field19\Field25[local20]\Field21 = $02
                                Next
                                tformpoint(-575.0, 5006.0, -402.0, local3\Field19\Field15, $00)
                                positionentity(local3\Field19\Field32[$00]\Field82, tformedx(), tformedy(), tformedz(), $00)
                                resetentity(local3\Field19\Field32[$00]\Field82)
                                XZ0260X8X2\Field11 = 1.5
                                XZ0260X8X2\Field39 = 70.0
                                XZ0260X8X2\Field53 = -10.0
                                XZ0260X8X2\Field64 = 500.0
                                XZ0260X8X2\Field53 = -10.0
                                XZ0260X8X2\Field8 = 2.0
                                tformpoint(-468.0, 4946.0, -273.0, local3\Field19\Field15, $00)
                                positionentity(XZ0260X8X2\Field74, tformedx(), tformedy(), tformedz(), $00)
                                resetentity(XZ0260X8X2\Field74)
                                For local20 = $00 To (maxitemamount - $01) Step $01
                                    If (TX60DB8XBBZ(local20) <> Null) Then
                                        removewearableitems(TX60DB8XBBZ(local20))
                                    EndIf
                                Next
                                local5 = createdecal($03, entityx(XZ0260X8X2\Field74, $01, 1.0), ((local3\Field19\Field3 + 19.00391) + 0.005), entityz(XZ0260X8X2\Field74, $01, 1.0), 90.0, rnd(360.0, 0.0), 0.0, 0.5, 1.0, $00, $01, $00, $00, $00)
                                entityparent(local5\Field0, local3\Field19\Field15, $01)
                                playsound_strict(loadtempsound("SFX\SCP\1123\Officer2.ogg"), $01, $00)
                                local3\Field4 = 6.0
                            EndIf
                        Case 6.0
                            pointentity(local3\Field19\Field32[$00]\Field82, XZ0260X8X2\Field74, 0.0)
                            animatenpc(local3\Field19\Field32[$00], 75.0, 128.0, 0.04, $01)
                            If (127.9 <= local3\Field19\Field32[$00]\Field103) Then
                                playsound_strict(loadtempsound("SFX\SCP\1123\Gunshot.ogg"), $00, $00)
                                local3\Field4 = 7.0
                            EndIf
                        Case 7.0
                            positionentity(XZ0260X8X2\Field74, entityx(local3\Field19\Field15, $01, 1.0), 0.3, entityz(local3\Field19\Field15, $01, 1.0), $01)
                            resetentity(XZ0260X8X2\Field74)
                            XZ0260X8X2\Field78 = 6.0
                            XZ0260X8X2\Field64 = 500.0
                            XZ0260X8X2\Field11 = XZ0260X8X2\Field20
                            XZ0260X8X2\Field20 = 0.0
                            XZ0260X8X2\Field39 = XZ0260X8X2\Field73
                            XZ0260X8X2\Field73 = 0.0
                            isblackout = previsblackout
                            previsblackout = $01
                            If (XZ0260X8X2\Field25 = $00) Then
                                setcrouch($01)
                            EndIf
                            For local20 = $00 To (maxitemamount - $01) Step $01
                                If (TX60DB8XBBZ(local20) <> Null) Then
                                    If (TX60DB8XBBZ(local20)\Field6\Field19 = "Leaflet") Then
                                        removeitem(TX60DB8XBBZ(local20), $01)
                                        Exit
                                    EndIf
                                    If (TX60DB8XBBZ(local20)\Field6\Field9 = $2D) Then
                                        local23 = $00
                                        For local21 = $00 To (TX60DB8XBBZ(local20)\Field36 - $01) Step $01
                                            If (TX60DB8XBBZ(local20)\Field8[local21] <> Null) Then
                                                If (TX60DB8XBBZ(local20)\Field8[local21]\Field6\Field19 = "Leaflet") Then
                                                    removeitem(TX60DB8XBBZ(local20)\Field8[local21], $01)
                                                    local23 = $01
                                                    Exit
                                                EndIf
                                            EndIf
                                        Next
                                        If (local23 <> 0) Then
                                            Exit
                                        EndIf
                                    EndIf
                                EndIf
                            Next
                            giveachievement("1123", $01)
                            removenpc(local3\Field19\Field32[$00])
                            For local20 = $07 To $08 Step $01
                                freeentity(local3\Field19\Field27[local20])
                                local3\Field19\Field27[local20] = $00
                            Next
                            removedoor(local3\Field19\Field25[$08])
                            removeevent(local3)
                            skull_event = Null
                    End Select
                EndIf
            Case $11
                If (0.0 = local3\Field23) Then
                    If (8.0 > local3\Field19\Field39) Then
                        If (n_i\Field1 = Null) Then
                            n_i\Field1 = createnpc($05, entityx(local3\Field19\Field15, $00, 1.0), (local3\Field19\Field3 + 0.3), entityz(local3\Field19\Field15, $00, 1.0))
                        ElseIf (66.0 <> n_i\Field1\Field66) Then
                            positionentity(n_i\Field1\Field82, entityx(local3\Field19\Field15, $00, 1.0), (local3\Field19\Field3 + 0.3), entityz(local3\Field19\Field15, $00, 1.0), $00)
                            resetentity(n_i\Field1\Field82)
                        EndIf
                        local3\Field23 = 1.0
                    EndIf
                EndIf
                If (playerroom = local3\Field19) Then
                    local3\Field4 = 0.0
                    local66 = $01
                    local67 = createpivot(local3\Field19\Field15)
                    positionentity(local67, 976.0, 128.0, -640.0, $00)
                    For local11 = Each items
                        If (local11\Field17 = $00) Then
                            If (0.5625 > entitydistancesquared(local11\Field9, local3\Field19\Field27[$00])) Then
                                local66 = $00
                            EndIf
                        EndIf
                    Next
                    If ((local66 And interactobject(local3\Field19\Field27[$00], 0.75, $00)) <> 0) Then
                        local3\Field7 = (Float rand($00, (maxitemamount - $01)))
                        If (TX60DB8XBBZ((Int local3\Field7)) <> Null) Then
                            local3\Field1 = 1.0
                        Else
                            For local20 = $00 To (maxitemamount - $01) Step $01
                                local68 = (TX60DB8XBBZ((Int ((local3\Field7 + (Float local20)) Mod (Float maxitemamount)))) = Null)
                                If (local68 = $00) Then
                                    local3\Field7 = ((local3\Field7 + (Float local20)) Mod (Float maxitemamount))
                                EndIf
                                If (rand($08, $01) = $01) Then
                                    local3\Field1 = ((0.1 * (Float local68)) + 3.0)
                                    local3\Field4 = (Float rand($05, $01))
                                    local69 = ""
                                    Select local3\Field4
                                        Case 1.0
                                            local69 = "Lost Key"
                                        Case 2.0
                                            local69 = "Disciplinary Hearing DH-S-4137-17092"
                                        Case 3.0
                                            local69 = "Coin"
                                        Case 4.0
                                            local69 = "Movie Ticket"
                                        Case 5.0
                                            local69 = "Old Badge"
                                    End Select
                                    For local11 = Each items
                                        If (local11\Field19 = local69) Then
                                            local3\Field1 = 1.0
                                            local3\Field4 = 0.0
                                            Exit
                                        EndIf
                                    Next
                                    If (local68 = $00) Then
                                        Exit
                                    EndIf
                                ElseIf (local68 <> 0) Then
                                    local3\Field1 = 2.0
                                Else
                                    local3\Field1 = 1.0
                                    Exit
                                EndIf
                            Next
                        EndIf
                    EndIf
                    If (1.0 = local3\Field1) Then
                        local71 = $00
                        For local19 = Each itemtemplates
                            If (isitemgoodfor1162arc(local19) <> 0) Then
                                Select TX60DB8XBBZ((Int local3\Field7))\Field6\Field9
                                    Case $69
                                        If ((((local19\Field9 = $59) Lor (local19\Field9 = $5A)) And (rand($02, $01) = $01)) <> 0) Then
                                            local71 = $01
                                        EndIf
                                    Case $00,$01
                                        If (((local19\Field9 = $00) And (rand($0C, $01) = $01)) <> 0) Then
                                            local71 = $01
                                        EndIf
                                    Case $38,$39,$3A,$3B,$3C,$3D,$3E,$3F
                                        If ((((((((((local19\Field9 = $38) Lor (local19\Field9 = $39)) Lor (local19\Field9 = $3A)) Lor (local19\Field9 = $3B)) Lor (local19\Field9 = $3C)) Lor (local19\Field9 = $3D)) Lor (local19\Field9 = $3E)) Lor (local19\Field9 = $3F)) And (rand($02, $01) = $01)) <> 0) Then
                                            local71 = $01
                                        EndIf
                                    Case $59,$5A,$5B,$5C
                                        If ((((((local19\Field9 = $59) Lor (local19\Field9 = $5A)) Lor (local19\Field9 = $5B)) Lor (local19\Field9 = $5C)) And (rand($0C, $01) = $01)) <> 0) Then
                                            local71 = $01
                                        EndIf
                                    Case $61,$63,$02,$2F
                                        If ((((((local19\Field9 = $61) Lor (local19\Field9 = $63)) Lor (local19\Field9 = $02)) Lor (local19\Field9 = $2F)) And (rand($05, $01) = $01)) <> 0) Then
                                            local71 = $01
                                        EndIf
                                    Case $27,$28
                                        If ((((local19\Field9 = $27) Lor (local19\Field9 = $28)) And (rand($02, $01) = $01)) <> 0) Then
                                            local71 = $01
                                        EndIf
                                    Case $30,$32,$33,$55,$56,$57,$0E,$10,$0F
                                        If (((((((((((local19\Field9 = $30) Lor (local19\Field9 = $32)) Lor (local19\Field9 = $33)) Lor (local19\Field9 = $55)) Lor (local19\Field9 = $56)) Lor (local19\Field9 = $57)) Lor (local19\Field9 = $0F)) Lor (local19\Field9 = $10)) Lor (local19\Field9 = $0E)) And (rand($04, $01) = $01)) <> 0) Then
                                            local71 = $01
                                        EndIf
                                    Default
                                        If ((((local19\Field9 = $61) Lor (local19\Field9 = $63)) And (rand($06, $01) = $01)) <> 0) Then
                                            local71 = $01
                                        EndIf
                                End Select
                            EndIf
                            If (local71 <> 0) Then
                                removewearableitems(TX60DB8XBBZ((Int local3\Field7)))
                                removeitem(TX60DB8XBBZ((Int local3\Field7)), $01)
                                local11 = createitem(local19\Field19, local19\Field9, entityx(local67, $01, 1.0), entityy(local67, $01, 1.0), entityz(local67, $01, 1.0), $00, $00, $00, 1.0, $00)
                                entitytype(local11\Field9, $03, $00)
                                playsound_strict(loadtempsound((("SFX\SCP\1162_ARC\Exchange" + (Str rand($00, $04))) + ".ogg")), $00, $00)
                                local3\Field1 = 0.0
                                giveachievement("1162arc", $01)
                                XZ0260X8X2\Field3 = $00
                                Exit
                            EndIf
                        Next
                    ElseIf (2.0 = local3\Field1) Then
                        XZ0260X8X2\Field11 = (XZ0260X8X2\Field11 + 5.0)
                        local25 = createpivot($00)
                        positionentity(local25, entityx(XZ0260X8X2\Field74, $00, 1.0), (entityy(XZ0260X8X2\Field74, $00, 1.0) - 0.05), entityz(XZ0260X8X2\Field74, $00, 1.0), $00)
                        turnentity(local25, 90.0, 0.0, 0.0, $00)
                        entitypick(local25, 0.3)
                        local5 = createdecal($03, pickedx(), (pickedy() + 0.005), pickedz(), 90.0, rnd(360.0, 0.0), 0.0, 0.75, 1.0, $00, $01, $00, $00, $00)
                        entityparent(local5\Field0, local3\Field19\Field15, $01)
                        freeentity(local25)
                        local25 = $00
                        For local19 = Each itemtemplates
                            If ((isitemgoodfor1162arc(local19) And (rand($06, $01) = $01)) <> 0) Then
                                local11 = createitem(local19\Field19, local19\Field9, entityx(local67, $01, 1.0), entityy(local67, $01, 1.0), entityz(local67, $01, 1.0), $00, $00, $00, 1.0, $00)
                                entitytype(local11\Field9, $03, $00)
                                giveachievement("1162arc", $01)
                                XZ0260X8X2\Field3 = $00
                                playsound_strict(loadtempsound((("SFX\SCP\1162_ARC\BodyHorrorExchange" + (Str rand($00, $03))) + ".ogg")), $00, $00)
                                XZ0260X8X2\Field78 = 5.0
                                If (7.0 < XZ0260X8X2\Field11) Then
                                    msg\Field8 = getlocalstring("death", "1162")
                                    kill($01, $01, $00, $01)
                                Else
                                    createmsg(getlocalstring("msg", "1162_1"), 6.0)
                                EndIf
                                local3\Field1 = 0.0
                                Exit
                            EndIf
                        Next
                    ElseIf (3.0 <= local3\Field1) Then
                        If (3.1 > local3\Field1) Then
                            playsound_strict(loadtempsound((("SFX\SCP\1162_ARC\Exchange" + (Str rand($00, $04))) + ".ogg")), $00, $00)
                            removewearableitems(TX60DB8XBBZ((Int local3\Field7)))
                            removeitem(TX60DB8XBBZ((Int local3\Field7)), $01)
                        Else
                            XZ0260X8X2\Field11 = (XZ0260X8X2\Field11 + 5.0)
                            local25 = createpivot($00)
                            positionentity(local25, entityx(XZ0260X8X2\Field74, $00, 1.0), (entityy(XZ0260X8X2\Field74, $00, 1.0) - 0.05), entityz(XZ0260X8X2\Field74, $00, 1.0), $00)
                            turnentity(local25, 90.0, 0.0, 0.0, $00)
                            entitypick(local25, 0.3)
                            local5 = createdecal($03, pickedx(), (pickedy() + 0.005), pickedz(), 90.0, rnd(360.0, 0.0), 0.0, 0.75, 1.0, $00, $01, $00, $00, $00)
                            entityparent(local5\Field0, local3\Field19\Field15, $01)
                            freeentity(local25)
                            local25 = $00
                            playsound_strict(loadtempsound((("SFX\SCP\1162_ARC\BodyHorrorExchange" + (Str rand($00, $03))) + ".ogg")), $00, $00)
                            XZ0260X8X2\Field78 = 5.0
                            If (7.0 < XZ0260X8X2\Field11) Then
                                msg\Field8 = getlocalstring("death", "1162")
                                kill($01, $01, $00, $01)
                            Else
                                createmsg(getlocalstring("msg", "1162_2"), 6.0)
                            EndIf
                            local3\Field7 = 0.0
                        EndIf
                        Select local3\Field4
                            Case 1.0
                                local11 = createitem("Lost Key", $69, entityx(local67, $01, 1.0), entityy(local67, $01, 1.0), entityz(local67, $01, 1.0), $00, $00, $00, 1.0, $00)
                            Case 2.0
                                local11 = createitem("Disciplinary Hearing DH-S-4137-17092", $01, entityx(local67, $01, 1.0), entityy(local67, $01, 1.0), entityz(local67, $01, 1.0), $00, $00, $00, 1.0, $00)
                            Case 3.0
                                local11 = createitem("Coin", $6B, entityx(local67, $01, 1.0), entityy(local67, $01, 1.0), entityz(local67, $01, 1.0), $00, $00, $00, 1.0, $00)
                            Case 4.0
                                local11 = createitem("Movie Ticket", $05, entityx(local67, $01, 1.0), entityy(local67, $01, 1.0), entityz(local67, $01, 1.0), $00, $00, $00, 1.0, $00)
                            Case 5.0
                                local11 = createitem("Old Badge", $04, entityx(local67, $01, 1.0), entityy(local67, $01, 1.0), entityz(local67, $01, 1.0), $00, $00, $00, 1.0, $00)
                        End Select
                        entitytype(local11\Field9, $03, $00)
                        giveachievement("1162arc", $01)
                        XZ0260X8X2\Field3 = $00
                        local3\Field1 = 0.0
                    EndIf
                    freeentity(local67)
                    local67 = $00
                EndIf
            Case $2A
                If (playerroom = local3\Field19) Then
                    Select local3\Field4
                        Case 0.0
                            If ((local3\Field19\Field25[$00]\Field39 Lor local3\Field19\Field25[$01]\Field39) <> 0) Then
                                For local20 = $00 To $01 Step $01
                                    createnpc($0E, entityx(local3\Field19\Field27[local20], $01, 1.0), entityy(local3\Field19\Field27[local20], $01, 1.0), entityz(local3\Field19\Field27[local20], $01, 1.0))
                                Next
                                tformpoint(0.0, 50.0, -297.0, local3\Field19\Field15, $00)
                                local3\Field19\Field32[$00] = createnpc($16, tformedx(), tformedy(), tformedz())
                                local3\Field19\Field32[$00]\Field57 = -1.0
                                local3\Field19\Field32[$00]\Field1 = $01
                                setnpcframe(local3\Field19\Field32[$00], 502.0, $01)
                                changenpctextureid(local3\Field19\Field32[$00], $0C)
                                rotateentity(local3\Field19\Field32[$00]\Field82, 0.0, (Float local3\Field19\Field21), 0.0, $00)
                                tformpoint(0.0, 50.0, -337.0, local3\Field19\Field15, $00)
                                local18 = setemitter(local3\Field19, tformedx(), tformedy(), tformedz(), $1E)
                                local18\Field7 = $05
                                tformpoint(0.0, 0.0, -418.0, local3\Field19\Field15, $00)
                                local5 = createdecal($03, tformedx(), (local3\Field19\Field3 + 0.005), tformedz(), 90.0, ((Float local3\Field19\Field21) + 90.0), 0.0, 0.4, 1.0, $00, $01, $00, $00, $00)
                                entityparent(local5\Field0, local3\Field19\Field15, $01)
                                tformpoint(-68.0, 40.0, -396.0, local3\Field19\Field15, $00)
                                createitem("Asav Harn's Badge", $03, tformedx(), tformedy(), tformedz(), $00, $00, $00, 1.0, $00)
                                local3\Field4 = 1.0
                            EndIf
                        Case 1.0
                            If (local3\Field19\Field25[$01]\Field39 <> 0) Then
                                local31 = entityx(local3\Field19\Field25[$01]\Field51, $00, 1.0)
                                local32 = (local3\Field19\Field3 + 0.05)
                                local33 = entityz(local3\Field19\Field25[$01]\Field51, $00, 1.0)
                                For local20 = $00 To $04 Step $01
                                    local1 = createnpc($15, local31, local32, local33)
                                    local1\Field65 = (Float rand($00, $01))
                                    local1\Field66 = 1.0
                                    rotateentity(local1\Field82, entitypitch(local1\Field82, $00, 1.0), rnd(360.0, 0.0), entityroll(local1\Field82, $00, 1.0), $00)
                                Next
                                local3\Field19\Field25[$01]\Field21 = $01
                                local3\Field4 = 2.0
                            EndIf
                        Case 2.0
                            animatenpc(local3\Field19\Field32[$00], 502.0, 494.0, (-0.03 - ((Float (100.0 < local3\Field19\Field25[$01]\Field13)) * 0.1)), $00)
                            If (494.1 > local3\Field19\Field32[$00]\Field103) Then
                                removeevent(local3)
                            EndIf
                    End Select
                EndIf
            Case $33
                Select local3\Field4
                    Case 0.0
                        If (local3\Field19\Field22\Field21 = $57) Then
                            tformpoint(502.0, 128.0, 83.0, local3\Field19\Field15, $00)
                            local11 = createitem("Document SCP-789-J", $00, tformedx(), tformedy(), tformedz(), $00, $00, $00, 1.0, $00)
                            entitytype(local11\Field9, $03, $00)
                        EndIf
                        local3\Field4 = 1.0
                    Case 1.0
                        If (playerroom = local3\Field19) Then
                            If (0.36 > entitydistancesquared(XZ0260X8X2\Field74, local3\Field19\Field27[$00])) Then
                                giveachievement("789j", $01)
                                local3\Field2 = playsoundex(loadtempsound("SFX\SCP\Joke\789J.ogg"), camera, local3\Field19\Field27[$00], 10.0, 1.0, $01, $00)
                                local3\Field4 = 2.0
                            EndIf
                        EndIf
                    Case 2.0
                        If (30.0 > animtime(local3\Field19\Field27[$00])) Then
                            animateex(local3\Field19\Field27[$00], animtime(local3\Field19\Field27[$00]), $01, $1E, 1.0, $00)
                        Else
                            animateex(local3\Field19\Field27[$00], animtime(local3\Field19\Field27[$00]), $1F, $F0, 0.52, $00)
                        EndIf
                        updatesoundorigin(local3\Field2, camera, local3\Field19\Field27[$00], 10.0, 1.5, $00, $01, $00)
                        If (((ChannelPlaying(local3\Field2) = $00) And (entityinview(local3\Field19\Field27[$00], camera) = $00)) <> 0) Then
                            setanimtime(local3\Field19\Field27[$00], 1.0, $00)
                            removeevent(local3)
                        EndIf
                End Select
            Case $34
                Select local3\Field4
                    Case 0.0
                        If (((6.0 > local3\Field19\Field39) And (0.0 < local3\Field19\Field39)) <> 0) Then
                            tformpoint(1322.0, 71.0, 491.0, local3\Field19\Field15, $00)
                            local3\Field19\Field32[$00] = createnpc($17, tformedx(), tformedy(), tformedz())
                            local3\Field19\Field32[$00]\Field66 = 8.0
                            local3\Field19\Field32[$00]\Field1 = $01
                            setnpcframe(local3\Field19\Field32[$00], 287.0, $01)
                            rotateentity(local3\Field19\Field32[$00]\Field82, 0.0, ((Float local3\Field19\Field21) + 90.0), 0.0, $01)
                            tformpoint(1328.0, 150.0, 491.0, local3\Field19\Field15, $00)
                            local5 = createdecal($03, tformedx(), tformedy(), tformedz(), 0.0, ((Float local3\Field19\Field21) + 270.0), 0.0, 0.3, 1.0, $00, $01, $00, $00, $00)
                            entityparent(local5\Field0, local3\Field19\Field15, $01)
                            local3\Field4 = 1.0
                        EndIf
                    Case 1.0
                        If (local3\Field19\Field32[$00]\Field55 = $00) Then
                            local3\Field19\Field32[$00]\Field55 = loadsound_strict("SFX\Character\Guard\SuicideGuard0.ogg")
                        EndIf
                        If (6.5 > local3\Field19\Field39) Then
                            local3\Field19\Field32[$00]\Field63 = loopsoundex(local3\Field19\Field32[$00]\Field55, local3\Field19\Field32[$00]\Field63, camera, local3\Field19\Field32[$00]\Field82, 12.0, 1.0, $01)
                            If (((5.7 > local3\Field19\Field39) And (1.0 < XZ0260X8X2\Field68)) <> 0) Then
                                local3\Field4 = 2.0
                            EndIf
                        EndIf
                    Case 2.0
                        StopChannel(local3\Field19\Field32[$00]\Field63)
                        local3\Field19\Field32[$00]\Field63 = $00
                        freesound_strict(local3\Field19\Field32[$00]\Field55)
                        local3\Field19\Field32[$00]\Field55 = $00
                        local3\Field19\Field32[$00]\Field63 = playsoundex(loadtempsound("SFX\Character\Guard\SuicideGuard1.ogg"), camera, local3\Field19\Field32[$00]\Field82, 12.0, 1.0, $01, $00)
                        local3\Field4 = 3.0
                    Case 3.0
                        updatesoundorigin(local3\Field19\Field32[$00]\Field63, camera, local3\Field19\Field32[$00]\Field82, 15.0, 1.0, $00, $01, $00)
                        If (ChannelPlaying(local3\Field19\Field32[$00]\Field63) = $00) Then
                            removeevent(local3)
                        EndIf
                End Select
            Case $45
                If (playerroom = local3\Field19) Then
                    If (0.0 = local3\Field7) Then
                        If (local3\Field19\Field37 > entityz(XZ0260X8X2\Field74, $00, 1.0)) Then
                            playsound_strict(loadtempsound((("SFX\Ambient\ToZone" + (Str ($03 - (XZ0260X8X2\Field10 = $01)))) + ".ogg")), $00, $00)
                            local3\Field7 = 1.0
                        EndIf
                    EndIf
                    If (0.0 = local3\Field1) Then
                        If (rand($02, $01) = $01) Then
                            tformpoint(877.0, 146.6, 333.0, local3\Field19\Field15, $00)
                            local3\Field19\Field32[$00] = createnpc($10, tformedx(), tformedy(), tformedz())
                            local3\Field19\Field32[$00]\Field66 = 2.0
                        EndIf
                        local3\Field1 = 1.0
                    EndIf
                EndIf
                If (12.0 > local3\Field19\Field39) Then
                    If (local3\Field19\Field32[$00] <> Null) Then
                        If (3.0 = local3\Field19\Field32[$00]\Field65) Then
                            removenpc(local3\Field19\Field32[$00])
                        EndIf
                    EndIf
                    For local4 = Each events
                        If (local3\Field19\Field22\Field21 = $4A) Then
                            If (local4\Field32 = $23) Then
                                If (2.0 = local4\Field4) Then
                                    turncheckpointmonitorsoff($00)
                                    For local20 = $00 To $01 Step $01
                                        local3\Field19\Field25[local20]\Field21 = $00
                                    Next
                                Else
                                    updatecheckpointmonitors($00)
                                    For local20 = $00 To $01 Step $01
                                        local3\Field19\Field25[local20]\Field21 = $01
                                    Next
                                EndIf
                                Exit
                            EndIf
                        ElseIf (local4\Field32 = $0C) Then
                            If (0.0 = local4\Field1) Then
                                turncheckpointmonitorsoff($01)
                                For local20 = $00 To $01 Step $01
                                    local3\Field19\Field25[local20]\Field21 = $00
                                Next
                            Else
                                updatecheckpointmonitors($01)
                                For local20 = $00 To $01 Step $01
                                    local3\Field19\Field25[local20]\Field21 = $01
                                Next
                            EndIf
                            Exit
                        EndIf
                    Next
                EndIf
                If (local3\Field4 <> (Float local3\Field19\Field25[$00]\Field39)) Then
                    local77 = loadtempsound("SFX\Door\DoorCheckpoint.ogg")
                    local3\Field2 = playsoundex(local77, camera, local3\Field19\Field25[$00]\Field0, 10.0, 1.0, $00, $00)
                    local3\Field8 = playsoundex(local77, camera, local3\Field19\Field25[$01]\Field0, 10.0, 1.0, $00, $00)
                EndIf
                local3\Field4 = (Float local3\Field19\Field25[$00]\Field39)
                updatesoundorigin(local3\Field2, camera, local3\Field19\Field25[$00]\Field0, 10.0, 1.0, $00, $01, $00)
                updatesoundorigin(local3\Field8, camera, local3\Field19\Field25[$01]\Field0, 10.0, 1.0, $00, $01, $00)
            Case $00
                If (n_i\Field2\Field93 = $00) Then
                    If (0.0 = local3\Field4) Then
                        If (((0.0 < local3\Field19\Field39) And (8.0 > local3\Field19\Field39)) <> 0) Then
                            If (1.0 < n_i\Field2\Field66) Then
                                removeevent(local3)
                            Else
                                local3\Field19\Field32[$00] = createnpc($16, entityx(local3\Field19\Field25[$00]\Field51, $01, 1.0), 0.5, entityz(local3\Field19\Field25[$00]\Field51, $01, 1.0))
                                changenpctextureid(local3\Field19\Field32[$00], $09)
                                pointentity(local3\Field19\Field32[$00]\Field82, local3\Field19\Field15, 0.0)
                                rotateentity(local3\Field19\Field32[$00]\Field82, 0.0, entityyaw(local3\Field19\Field32[$00]\Field82, $00, 1.0), 0.0, $01)
                                moveentity(local3\Field19\Field32[$00]\Field82, 0.0, 0.0, 0.5, $00)
                                playsoundex(loadtempsound("SFX\Door\EndroomDoor.ogg"), camera, local3\Field19\Field15, 15.0, 1.0, $00, $00)
                                local3\Field4 = 1.0
                            EndIf
                        EndIf
                    ElseIf (1.0 = local3\Field4) Then
                        If (((playerroom = local3\Field19) And ((chs\Field8 Lor i_268\Field3) = $00)) <> 0) Then
                            StopChannel(local3\Field2)
                            local3\Field2 = $00
                            local3\Field2 = playsound_strict(loadtempsound("SFX\Character\Janitor\106Abduct.ogg"), $01, $00)
                            local3\Field4 = 2.0
                        ElseIf (8.0 > local3\Field19\Field39) Then
                            If (local3\Field0 = $00) Then
                                local3\Field0 = loadsound_strict("SFX\Character\Janitor\Idle.ogg")
                            EndIf
                            local3\Field2 = loopsoundex(local3\Field0, local3\Field2, camera, local3\Field19\Field32[$00]\Field98, 15.0, 1.0, $01)
                        EndIf
                    ElseIf (2.0 = local3\Field4) Then
                        local3\Field7 = (local3\Field7 + fps\Field3[$00])
                        If (85.0 < local3\Field7) Then
                            local3\Field19\Field32[$00]\Field66 = 1.0
                        EndIf
                        If (3.49 < entitydistancesquared(local3\Field19\Field32[$00]\Field82, local3\Field19\Field25[$00]\Field51)) Then
                            local5 = createdecal($00, local3\Field19\Field40, (local3\Field19\Field3 + 0.005), local3\Field19\Field37, 90.0, rnd(360.0, 0.0), 0.0, 0.05, 1.0, $00, $01, $00, $00, $00)
                            local5\Field14 = 0.008
                            local5\Field1 = 10000.0
                            entityparent(local5\Field0, local3\Field19\Field15, $01)
                            local3\Field4 = 3.0
                        EndIf
                    Else
                        positionentity(n_i\Field2\Field98, entityx(local3\Field19\Field15, $01, 1.0), 0.0, entityz(local3\Field19\Field15, $01, 1.0), $00)
                        pointentity(n_i\Field2\Field98, local3\Field19\Field32[$00]\Field82, 0.0)
                        rotateentity(n_i\Field2\Field98, 0.0, entityyaw(n_i\Field2\Field98, $00, 1.0), 0.0, $01)
                        n_i\Field2\Field31 = 1.0
                        If (7.74 < entitydistancesquared(local3\Field19\Field32[$00]\Field82, local3\Field19\Field25[$00]\Field51)) Then
                            If (1.0 = local3\Field19\Field32[$00]\Field66) Then
                                local3\Field19\Field32[$00]\Field66 = -1.0
                                setnpcframe(local3\Field19\Field32[$00], 41.0, $01)
                            EndIf
                            local3\Field19\Field32[$00]\Field64 = curvevalue(0.0, local3\Field19\Field32[$00]\Field64, 25.0)
                            positionentity(local3\Field19\Field32[$00]\Field82, curvevalue(entityx(local3\Field19\Field15, $01, 1.0), entityx(local3\Field19\Field32[$00]\Field82, $00, 1.0), 25.0), (0.3 - (local3\Field4 / 70.0)), curvevalue(entityz(local3\Field19\Field15, $01, 1.0), entityz(local3\Field19\Field32[$00]\Field82, $00, 1.0), 25.0), $00)
                            resetentity(local3\Field19\Field32[$00]\Field82)
                            animatenpc(local3\Field19\Field32[$00], 41.0, 58.0, 0.1, $00)
                            local3\Field4 = (local3\Field4 + (fps\Field3[$00] / 2.0))
                        EndIf
                        animatenpc(n_i\Field2, 495.0, 604.0, 0.7, $00)
                        XZ0260X8X2\Field76 = min((XZ0260X8X2\Field76 - (((0.15 / entitydistance(local3\Field19\Field32[$00]\Field82, XZ0260X8X2\Field74)) * XZ0260X8X2\Field76) * fps\Field3[$00])), XZ0260X8X2\Field76)
                        If (100.0 < local3\Field4) Then
                            n_i\Field2\Field66 = 0.0
                            n_i\Field2\Field65 = rnd(22000.0, 27000.0)
                            n_i\Field2\Field31 = 0.0
                            If (((6.25 > entitydistancesquared(XZ0260X8X2\Field74, local3\Field19\Field15)) And ((chs\Field8 Lor i_268\Field3) = $00)) <> 0) Then
                                n_i\Field2\Field60 = entityx(XZ0260X8X2\Field74, $00, 1.0)
                                n_i\Field2\Field61 = entityy(XZ0260X8X2\Field74, $00, 1.0)
                                n_i\Field2\Field74 = entityz(XZ0260X8X2\Field74, $00, 1.0)
                                n_i\Field2\Field66 = 2.0
                            EndIf
                            removenpc(local3\Field19\Field32[$00])
                            removeevent(local3)
                        EndIf
                    EndIf
                Else
                    removenpc(local3\Field19\Field32[$00])
                    removeevent(local3)
                EndIf
            Case $30
                If (0.0 = local3\Field4) Then
                    If (playerroom = local3\Field19) Then
                        tformpoint(-944.0, 448.0, 20.0, local3\Field19\Field15, $00)
                        local3\Field19\Field32[$00] = createnpc($17, tformedx(), tformedy(), tformedz())
                        rotateentity(local3\Field19\Field32[$00]\Field82, 0.0, (Float local3\Field19\Field21), 0.0, $01)
                        local3\Field19\Field25[$00]\Field39 = $01
                        local3\Field4 = 1.0
                    EndIf
                ElseIf (1.0 = local3\Field4) Then
                    If (2.5 > local3\Field19\Field39) Then
                        local25 = createpivot($00)
                        tformpoint(-944.0, 320.0, 1460.0, local3\Field19\Field15, $00)
                        positionentity(local25, tformedx(), tformedy(), tformedz(), $00)
                        local3\Field19\Field32[$00]\Field66 = 5.0
                        local3\Field19\Field32[$00]\Field57 = 0.0
                        local3\Field19\Field32[$00]\Field60 = entityx(local25, $01, 1.0)
                        local3\Field19\Field32[$00]\Field61 = entityy(local25, $01, 1.0)
                        local3\Field19\Field32[$00]\Field74 = entityz(local25, $01, 1.0)
                        freeentity(local25)
                        local25 = $00
                        local3\Field4 = 2.0
                    EndIf
                Else
                    local3\Field4 = (local3\Field4 + fps\Field3[$00])
                    If (((252.0 < local3\Field4) And local3\Field19\Field25[$00]\Field39) <> 0) Then
                        openclosedoor(local3\Field19\Field25[$00], $01, $00)
                    EndIf
                    If (0.0 = local3\Field19\Field25[$00]\Field13) Then
                        freeentity(local3\Field19\Field25[$00]\Field7)
                        local3\Field19\Field25[$00]\Field7 = $00
                        removenpc(local3\Field19\Field32[$00])
                        local3\Field19\Field32[$00] = Null
                        removeevent(local3)
                    EndIf
                EndIf
            Case $08
                If (0.0 = local3\Field4) Then
                    If (((playerroom = local3\Field19) And (2.0 > n_i\Field3\Field31)) <> 0) Then
                        tformpoint(-1180.0, -256.0, 896.0, local3\Field19\Field15, $00)
                        local3\Field19\Field32[$00] = createnpc($16, tformedx(), tformedy(), tformedz())
                        local3\Field19\Field32[$00]\Field57 = 2.0
                        changenpctextureid(local3\Field19\Field32[$00], $0B)
                        local3\Field19\Field32[$00]\Field63 = playsoundex(loadtempsound("SFX\Character\Maintenance\EscapeFromClosets.ogg"), camera, local3\Field19\Field32[$00]\Field82, 10.0, 1.0, $01, $00)
                        tformpoint(-1292.0, -256.0, -160.0, local3\Field19\Field15, $00)
                        local3\Field19\Field32[$01] = createnpc($16, tformedx(), tformedy(), tformedz())
                        local3\Field19\Field32[$01]\Field57 = 3.0
                        changenpctextureid(local3\Field19\Field32[$01], $02)
                        pointentity(local3\Field19\Field32[$00]\Field82, local3\Field19\Field32[$01]\Field82, 0.0)
                        pointentity(local3\Field19\Field32[$01]\Field82, local3\Field19\Field32[$00]\Field82, 0.0)
                        local3\Field4 = 1.0
                    EndIf
                Else
                    updatesoundorigin(local3\Field19\Field32[$00]\Field63, camera, local3\Field19\Field32[$00]\Field82, 10.0, 1.0, $01, $01, $00)
                    updatesoundorigin(local3\Field19\Field32[$01]\Field63, camera, local3\Field19\Field32[$01]\Field82, 10.0, 1.0, $01, $01, $00)
                    local3\Field4 = (local3\Field4 + fps\Field3[$00])
                    If (210.0 > local3\Field4) Then
                        rotateentity(local3\Field19\Field32[$01]\Field82, 0.0, curveangle(((Float local3\Field19\Field21) + 90.0), entityyaw(local3\Field19\Field32[$01]\Field82, $00, 1.0), 100.0), 0.0, $01)
                        local3\Field19\Field32[$00]\Field66 = 1.0
                        If (((203.0 < local3\Field4) And (203.0 >= (local3\Field4 - fps\Field3[$00]))) <> 0) Then
                            playsoundex(loadtempsound("SFX\Room\Intro\173Vent.ogg"), camera, local3\Field19\Field15, 15.0, 1.0, $00, $00)
                        EndIf
                    ElseIf (455.0 > local3\Field4) Then
                        If (210.0 > (local3\Field4 - fps\Field3[$00])) Then
                            local3\Field19\Field32[$00]\Field66 = 0.0
                            local3\Field19\Field32[$01]\Field63 = playsoundex(loadtempsound("SFX\Character\Scientist\EscapeFromClosets.ogg"), camera, local3\Field19\Field32[$01]\Field82, 10.0, 1.0, $01, $00)
                        EndIf
                        If (315.0 < local3\Field4) Then
                            pointentity(local3\Field19\Field32[$00]\Field98, local3\Field19\Field15, 0.0)
                            rotateentity(local3\Field19\Field32[$00]\Field82, 0.0, curveangle(entityyaw(local3\Field19\Field32[$00]\Field98, $00, 1.0), entityyaw(local3\Field19\Field32[$00]\Field82, $00, 1.0), 30.0), 0.0, $01)
                        EndIf
                        pointentity(local3\Field19\Field32[$01]\Field98, local3\Field19\Field15, 0.0)
                        turnentity(local3\Field19\Field32[$01]\Field98, 0.0, (sin(local3\Field4) * 25.0), 0.0, $00)
                        rotateentity(local3\Field19\Field32[$01]\Field82, 0.0, curveangle(entityyaw(local3\Field19\Field32[$01]\Field98, $00, 1.0), entityyaw(local3\Field19\Field32[$01]\Field82, $00, 1.0), 30.0), 0.0, $01)
                    Else
                        If (455.0 > (local3\Field4 - fps\Field3[$00])) Then
                            playsound_strict(snd_i\Field40[$00], $00, $00)
                            playsound_strict(snd_i\Field11, $00, $00)
                            XZ0260X8X2\Field8 = 9.0
                        EndIf
                        If (((525.0 < local3\Field4) And (525.0 >= (local3\Field4 - fps\Field3[$00]))) <> 0) Then
                            local3\Field19\Field32[$00]\Field1 = $01
                            If (((T8660BZ460\Field8 > $00) Lor (T8660BZ460\Field11 > $00)) <> 0) Then
                                XZ0260X8X2\Field53 = -10.0
                            EndIf
                            playsoundex(snd_i\Field35[$00], camera, local3\Field19\Field32[$00]\Field82, 8.0, 1.0, $00, $00)
                            positionentity(n_i\Field3\Field82, (entityx(local3\Field19\Field32[$00]\Field82, $01, 1.0) + 0.35), (entityy(local3\Field19\Field32[$00]\Field82, $01, 1.0) + 0.15), entityz(local3\Field19\Field32[$00]\Field82, $01, 1.0), $00)
                            pointentity(n_i\Field3\Field82, local3\Field19\Field32[$00]\Field82, 0.0)
                            resetentity(n_i\Field3\Field82)
                            n_i\Field3\Field31 = 1.0
                        ElseIf (((560.0 < local3\Field4) And (560.0 >= (local3\Field4 - fps\Field3[$00]))) <> 0) Then
                            local3\Field19\Field32[$01]\Field1 = $01
                            If (((T8660BZ460\Field8 > $00) Lor (T8660BZ460\Field11 > $00)) <> 0) Then
                                XZ0260X8X2\Field53 = -10.0
                            EndIf
                            playsoundex(snd_i\Field35[$01], camera, local3\Field19\Field32[$01]\Field82, 8.0, 1.0, $00, $00)
                            positionentity(n_i\Field3\Field82, (entityx(local3\Field19\Field32[$01]\Field82, $01, 1.0) + 0.35), (entityy(local3\Field19\Field32[$01]\Field82, $01, 1.0) + 0.15), entityz(local3\Field19\Field32[$01]\Field82, $01, 1.0), $00)
                            pointentity(n_i\Field3\Field82, local3\Field19\Field32[$01]\Field82, 0.0)
                            resetentity(n_i\Field3\Field82)
                            n_i\Field3\Field31 = 0.0
                        ElseIf (((630.0 < local3\Field4) And (630.0 >= (local3\Field4 - fps\Field3[$00]))) <> 0) Then
                            tformpoint(-1065.0, -380.0, 50.0, local3\Field19\Field15, $00)
                            local11 = createitem("Wallet", $2E, tformedx(), tformedy(), tformedz(), $00, $00, $00, 1.0, $00)
                            entitytype(local11\Field9, $03, $00)
                            For local20 = $00 To $01 Step $01
                                local12 = createitem("Quarter", $6A, 0.0, 0.0, 0.0, $00, $00, $00, 1.0, $00)
                                local12\Field17 = $01
                                local12\Field30 = $FFFFFFFF
                                local11\Field8[local20] = local12
                                hideentity(local12\Field9)
                                entitytype(local12\Field9, $03, $00)
                            Next
                            removeevent(local3)
                        EndIf
                    EndIf
                EndIf
            Case $36
                If (playerroom = local3\Field19) Then
                    If (interactobject(local3\Field19\Field27[$00], 1.0, $00) <> 0) Then
                        local23 = $01
                        For local11 = Each items
                            If (local11\Field17 = $00) Then
                                If (0.0 = distancesquared(entityx(local11\Field9, $00, 1.0), entityx(local3\Field19\Field27[$02], $01, 1.0), entityz(local11\Field9, $00, 1.0), entityz(local3\Field19\Field27[$02], $01, 1.0), 0.0, 0.0)) Then
                                    local23 = $00
                                    Exit
                                EndIf
                            EndIf
                        Next
                        local78 = $00
                        If (2.0 > local3\Field7) Then
                            local79 = GUESSEDupdateevents_2()
                            If (selecteditem <> Null) Then
                                If (((selecteditem\Field6\Field9 = $6A) Lor (selecteditem\Field6\Field9 = $6B)) <> 0) Then
                                    removeitem(selecteditem, $01)
                                    playsound_strict(loadtempsound("SFX\SCP\294\CoinDrop.ogg"), $00, $00)
                                    local78 = $01
                                    local3\Field7 = (local3\Field7 + 1.0)
                                ElseIf (((selecteditem\Field6\Field9 = $61) Lor (selecteditem\Field6\Field9 = $62)) <> 0) Then
                                    XZ0260X8X2\Field63 = ((selecteditem\Field6\Field9 = $62) + $01)
                                    If (0.0 < selecteditem\Field15) Then
                                        selecteditem\Field15 = (selecteditem\Field15 - 1.0)
                                        XZ0260X8X2\Field44 = (Int selecteditem\Field15)
                                        playsound_strict(loadtempsound("SFX\SCP\294\InsertMasterCard.ogg"), $00, $00)
                                        local78 = $01
                                        If (0.0 = selecteditem\Field15) Then
                                            removeitem(selecteditem, $01)
                                        EndIf
                                        local3\Field7 = 2.0
                                    Else
                                        selecteditem = Null
                                    EndIf
                                EndIf
                            EndIf
                            GUESSEDupdateevents(local79)
                        EndIf
                        If (2.0 = local3\Field7) Then
                            giveachievement("294", $01)
                            i_294\Field4 = (local23 And (0.1 < secondarylighton))
                            If (i_294\Field4 <> 0) Then
                                selecteditem = Null
                                XZ0260X8X2\Field3 = $00
                            EndIf
                        ElseIf ((((1.0 = local3\Field7) And (local78 = $00)) And (XZ0260X8X2\Field63 = $00)) <> 0) Then
                            i_294\Field4 = $00
                            createmsg(getlocalstring("msg", "294.another"), 6.0)
                        ElseIf (((local78 = $00) And (XZ0260X8X2\Field63 = $00)) <> 0) Then
                            i_294\Field4 = $00
                            createmsg(getlocalstring("msg", "294.two"), 6.0)
                        ElseIf (XZ0260X8X2\Field63 > $00) Then
                            createmsg(getlocalstring("msg", "294.funds"), 6.0)
                            XZ0260X8X2\Field63 = $00
                        EndIf
                    EndIf
                    If (interactobject(local3\Field19\Field27[$01], 0.8, $00) <> 0) Then
                        If (GUESSEDrenderrenderdebughud_3() < maxitemamount) Then
                            giveachievement("458", $01)
                            createmsg(getlocalstring("msg", "458"), 6.0)
                            local11 = createitem("Pizza Slice", $6C, 0.0, 0.0, 0.0, $00, $00, $00, 1.0, $00)
                            entitytype(local11\Field9, $03, $00)
                            pickitem(local11, $01)
                        Else
                            createmsg(getlocalstring("msg", "cantcarry"), 6.0)
                        EndIf
                    EndIf
                EndIf
                If (8.0 > local3\Field19\Field39) Then
                    If (0.0 = local3\Field4) Then
                        If (n_i\Field1 = Null) Then
                            n_i\Field1 = createnpc($05, entityx(local3\Field19\Field15, $00, 1.0), -0.1, entityz(local3\Field19\Field15, $00, 1.0))
                        ElseIf (66.0 <> n_i\Field1\Field66) Then
                            positionentity(n_i\Field1\Field82, entityx(local3\Field19\Field15, $00, 1.0), -0.1, entityz(local3\Field19\Field15, $00, 1.0), $00)
                            resetentity(n_i\Field1\Field82)
                        EndIf
                        tformpoint(-437.0, -384.0, 36.0, local3\Field19\Field15, $00)
                        local1 = createnpc($15, tformedx(), (tformedy() + 0.05), tformedz())
                        rotateentity(local1\Field82, entitypitch(local1\Field82, $00, 1.0), rnd(360.0, 0.0), entityroll(local1\Field82, $00, 1.0), $00)
                        tformpoint(-1118.0, -384.0, -606.0, local3\Field19\Field15, $00)
                        For local20 = $00 To $01 Step $01
                            local1 = createnpc($15, (rnd(-0.8, 0.8) + tformedx()), (tformedy() + 0.05), (rnd(-0.8, 0.8) + tformedz()))
                            rotateentity(local1\Field82, entitypitch(local1\Field82, $00, 1.0), rnd(360.0, 0.0), entityroll(local1\Field82, $00, 1.0), $00)
                        Next
                        tformpoint(1330.0, -384.0, 432.0, local3\Field19\Field15, $00)
                        local1 = createnpc($15, tformedx(), (tformedy() + 0.05), tformedz())
                        rotateentity(local1\Field82, entitypitch(local1\Field82, $00, 1.0), rnd(360.0, 0.0), entityroll(local1\Field82, $00, 1.0), $00)
                        local3\Field4 = 1.0
                    EndIf
                EndIf
            Case $2C
                If (playerroom = local3\Field19) Then
                    local47 = $00
                    For local2 = Each rooms
                        If (local2\Field22\Field21 = $66) Then
                            local47 = $01
                            Exit
                        EndIf
                    Next
                    If (local47 = $00) Then
                        local3\Field1 = 1.0
                    EndIf
                    If (((remotedooron = $00) Lor (remotedooron And (0.0 = local3\Field1))) <> 0) Then
                        local3\Field19\Field25[$01]\Field21 = $01
                    Else
                        local3\Field19\Field25[$01]\Field21 = $00
                        local80 = Null
                        For local2 = Each rooms
                            If (local2\Field22\Field21 = $4E) Then
                                local80 = local2
                                Exit
                            EndIf
                        Next
                        local34 = entityx(XZ0260X8X2\Field74, $01, 1.0)
                        local35 = entityy(XZ0260X8X2\Field74, $01, 1.0)
                        local36 = entityz(XZ0260X8X2\Field74, $01, 1.0)
                        XZ0260X8X2\Field27 = (isinsideelevator(local34, local35, local36, local3\Field19\Field27[$00]) Lor isinsideelevator(local34, local35, local36, local3\Field19\Field27[$01]))
                        toelevatorfloor = $01
                        local3\Field4 = updateelevators(local3\Field4, local3\Field19\Field25[$00], local80\Field25[$01], local3\Field19\Field27[$00], local3\Field19\Field27[$01], local3, $00, $01)
                        If (16.0 > entitydistancesquared(XZ0260X8X2\Field74, local3\Field19\Field27[$01])) Then
                            local80\Field25[$01]\Field21 = $01
                            playerroom = local80
                            removeevent(local3)
                        EndIf
                    EndIf
                EndIf
            Case $2E
                If (playerroom = local3\Field19) Then
                    local47 = $00
                    For local2 = Each rooms
                        If (local2\Field22\Field21 = $66) Then
                            local47 = $01
                            Exit
                        EndIf
                    Next
                    If (local47 = $00) Then
                        local3\Field1 = 1.0
                    EndIf
                    If ((remotedooron And (0.0 = local3\Field1)) <> 0) Then
                        local3\Field19\Field25[$01]\Field21 = $02
                    Else
                        local3\Field19\Field25[$01]\Field21 = $00
                        local81 = Null
                        For local2 = Each rooms
                            If (local2\Field22\Field21 = $4C) Then
                                local81 = local2
                                Exit
                            EndIf
                        Next
                        local34 = entityx(XZ0260X8X2\Field74, $01, 1.0)
                        local35 = entityy(XZ0260X8X2\Field74, $01, 1.0)
                        local36 = entityz(XZ0260X8X2\Field74, $01, 1.0)
                        XZ0260X8X2\Field27 = (isinsideelevator(local34, local35, local36, local3\Field19\Field27[$00]) Lor isinsideelevator(local34, local35, local36, local3\Field19\Field27[$01]))
                        toelevatorfloor = $01
                        local3\Field4 = updateelevators(local3\Field4, local3\Field19\Field25[$00], local81\Field25[$01], local3\Field19\Field27[$00], local3\Field19\Field27[$01], local3, $01, $00)
                        If (n_i\Field2\Field93 = $00) Then
                            If (((-1.5 > local3\Field4) And (-1.5 <= (local3\Field4 + fps\Field3[$00]))) <> 0) Then
                                playsound_strict(snd_i\Field58[$03], $01, $00)
                            EndIf
                        EndIf
                        If (16.0 > entitydistancesquared(XZ0260X8X2\Field74, local3\Field19\Field27[$01])) Then
                            local81\Field25[$01]\Field21 = $01
                            playerroom = local81
                            removeevent(local3)
                        EndIf
                    EndIf
                EndIf
            Case $3B
                If (playerroom = local3\Field19) Then
                    updatelever(local3\Field19\Field9[$00]\Field1, $00, $50, -80.0)
                    local82 = local3\Field7
                    local3\Field7 = (Float updatelever(local3\Field19\Field9[$01]\Field1, $00, $50, -80.0))
                    If (((local82 <> local3\Field7) And (0.0 < local3\Field4)) <> 0) Then
                        playsoundex(snd_i\Field11, camera, local3\Field19\Field9[$01]\Field1, 10.0, 1.0, $00, $00)
                    EndIf
                    isblackout = (0.0 = local3\Field7)
                    fog\Field13 = 8.0
                    If (0.0 = local3\Field4) Then
                        If (((rand($C8, $01) = $01) Lor (2.0 < entityy(XZ0260X8X2\Field74, $01, 1.0))) <> 0) Then
                            playsound_strict(snd_i\Field40[$07], $00, $00)
                            local3\Field4 = 1.0
                        EndIf
                    EndIf
                    If (1.0 = local3\Field4) Then
                        rotateentity(local3\Field19\Field9[$01]\Field1, curvevalue(80.0, entitypitch(local3\Field19\Field9[$01]\Field1, $00, 1.0), 10.0), entityyaw(local3\Field19\Field9[$01]\Field1, $00, 1.0), 0.0, $00)
                        If (79.0 < entitypitch(local3\Field19\Field9[$01]\Field1, $00, 1.0)) Then
                            local3\Field4 = 2.0
                        EndIf
                    EndIf
                    remotedooron = updatelever(local3\Field19\Field9[$02]\Field1, $00, $50, -80.0)
                    If (((remotedooron = $00) And (0.0 = local3\Field1)) <> 0) Then
                        If (local3\Field2 <> $00) Then
                            stopstream_strict(local3\Field2)
                            local3\Field2 = $00
                            local3\Field20 = $00
                        EndIf
                        local3\Field2 = streamsound_strict("SFX\SCP\079\Angry.ogg", (opt\Field59 * opt\Field2), $00)
                        local3\Field20 = $01
                        local3\Field1 = 1.0
                    EndIf
                EndIf
            Case $41
                If (6.0 > local3\Field19\Field39) Then
                    If (((1.0 < n_i\Field3\Field31) Lor (playerroom = local3\Field19)) <> 0) Then
                        removeevent(local3)
                    ElseIf (0.0 = n_i\Field3\Field31) Then
                        If (((16.0 < entitydistancesquared(XZ0260X8X2\Field74, n_i\Field3\Field82)) And (playersees173(n_i\Field3) = $00)) <> 0) Then
                            Select local3\Field19\Field22\Field21
                                Case $0A,$31
                                    tformpoint(640.0, 100.0, -896.0, local3\Field19\Field15, $00)
                                Case $0C
                                    tformpoint(-832.0, 100.0, 0.0, local3\Field19\Field15, $00)
                                Case $6A,$6B
                                    Select rand($03, $01)
                                        Case $01
                                            tformpoint(576.0, -512.0, 256.0, local3\Field19\Field15, $00)
                                        Case $02
                                            tformpoint(-512.0, -512.0, 256.0, local3\Field19\Field15, $00)
                                        Case $03
                                            tformpoint(-920.0, -512.0, 480.0, local3\Field19\Field15, $00)
                                    End Select
                                Case $58
                                    Select rand($03, $01)
                                        Case $01
                                            tformpoint(905.0, -512.0, 507.0, local3\Field19\Field15, $00)
                                        Case $02
                                            tformpoint(-34.0, -512.0, 594.0, local3\Field19\Field15, $00)
                                        Case $03
                                            tformpoint(256.0, -512.0, -911.0, local3\Field19\Field15, $00)
                                    End Select
                            End Select
                            teleportentity(n_i\Field3\Field82, tformedx(), tformedy(), tformedz(), (n_i\Field3\Field23 + 0.12), $01, 2.0, $00)
                            n_i\Field3\Field90 = local3\Field19
                            removeevent(local3)
                        EndIf
                    EndIf
                EndIf
            Case $09
                If (0.0 = local3\Field4) Then
                    If (((0.0 < local3\Field19\Field39) And (8.0 > local3\Field19\Field39)) <> 0) Then
                        local3\Field19\Field32[$00] = createnpc($17, local3\Field19\Field40, 0.5, local3\Field19\Field37)
                        pointentity(local3\Field19\Field32[$00]\Field82, XZ0260X8X2\Field74, 0.0)
                        rotateentity(local3\Field19\Field32[$00]\Field82, 0.0, ((Float local3\Field19\Field21) + 270.0), 0.0, $01)
                        local3\Field19\Field25[$00]\Field19 = $02
                        local3\Field4 = 1.0
                    EndIf
                ElseIf (local3\Field19\Field27[$00] = $00) Then
                    tformpoint(1024.0, 0.0, 0.0, local3\Field19\Field15, $00)
                    local3\Field19\Field27[$00] = createpivot($00)
                    positionentity(local3\Field19\Field27[$00], tformedx(), tformedy(), tformedz(), $00)
                    entityparent(local3\Field19\Field27[$00], local3\Field19\Field15, $01)
                ElseIf (1.0 = local3\Field4) Then
                    If (5.0 > local3\Field19\Field39) Then
                        local3\Field19\Field32[$00]\Field60 = entityx(local3\Field19\Field27[$00], $01, 1.0)
                        local3\Field19\Field32[$00]\Field61 = entityy(local3\Field19\Field27[$00], $01, 1.0)
                        local3\Field19\Field32[$00]\Field74 = entityz(local3\Field19\Field27[$00], $01, 1.0)
                        local3\Field4 = 2.0
                    EndIf
                ElseIf (2.0 = local3\Field4) Then
                    If (((6.0 > entitydistancesquared(local3\Field19\Field32[$00]\Field82, XZ0260X8X2\Field74)) And ((chs\Field8 Lor i_268\Field3) = $00)) <> 0) Then
                        local3\Field19\Field32[$00]\Field66 = 1.0
                        local3\Field19\Field32[$00]\Field57 = 1.0
                    Else
                        local3\Field19\Field32[$00]\Field66 = 5.0
                        local3\Field19\Field32[$00]\Field57 = 0.0
                    EndIf
                    If (4.0 > entitydistancesquared(local3\Field19\Field32[$00]\Field82, local3\Field19\Field27[$00])) Then
                        openclosedoor(local3\Field19\Field25[$00], $01, $00)
                        local3\Field19\Field25[$00]\Field19 = $00
                        entitytexture(local3\Field19\Field25[$00]\Field24[$01], d_i\Field2[$01], $00, $00)
                        GUESSEDfreeentity_7(local3\Field19\Field25[$00]\Field24[$01], $FFFFFFFF, $00)
                        GUESSEDcountentity(local3\Field19\Field25[$00], $01)
                        local3\Field2 = playsound_strict(loadtempsound("SFX\Room\ElevatorDeath.ogg"), $00, $00)
                        local3\Field4 = 3.0
                    EndIf
                Else
                    local3\Field4 = (local3\Field4 + fps\Field3[$00])
                    If (playerinreachableroom($01, $00, $01) <> 0) Then
                        If (((469.0 < local3\Field4) And (518.0 > local3\Field4)) <> 0) Then
                            XZ0260X8X2\Field14 = (7.4 - (local3\Field4 / 70.0))
                            If (rand($02, $01) = $01) Then
                                setemitter(Null, entityx(XZ0260X8X2\Field74, $00, 1.0), (local3\Field19\Field3 + 3.003906), entityz(XZ0260X8X2\Field74, $00, 1.0), $1A)
                            EndIf
                            templightvolume = 0.6
                            removenpc(local3\Field19\Field32[$00])
                        ElseIf (((602.0 < local3\Field4) And (742.0 > local3\Field4)) <> 0) Then
                            XZ0260X8X2\Field14 = (10.6 - (local3\Field4 / 70.0))
                            If (rand($02, $01) = $01) Then
                                setemitter(Null, entityx(XZ0260X8X2\Field74, $00, 1.0), (local3\Field19\Field3 + 3.003906), entityz(XZ0260X8X2\Field74, $00, 1.0), $1A)
                            EndIf
                            templightvolume = 0.6
                        EndIf
                    EndIf
                    If (((910.0 <= local3\Field4) And (ChannelPlaying(local3\Field2) = $00)) <> 0) Then
                        entitytexture(local3\Field19\Field25[$00]\Field24[$01], d_i\Field2[$02], $00, $00)
                        GUESSEDfreeentity_7(local3\Field19\Field25[$00]\Field24[$01], $FFFFFFFF, $00)
                        freeentity(local3\Field19\Field25[$00]\Field40[$01])
                        local3\Field19\Field25[$00]\Field40[$01] = $00
                        freeentity(local3\Field19\Field25[$00]\Field24[$00])
                        local3\Field19\Field25[$00]\Field24[$00] = $00
                        freeentity(local3\Field19\Field27[$00])
                        local3\Field19\Field27[$00] = $00
                        removeevent(local3)
                    EndIf
                EndIf
            Case $37
                If (playerroom = local3\Field19) Then
                    tformpoint(-1200.0, 51.2, 0.0, local3\Field19\Field15, $00)
                    local34 = tformedx()
                    local35 = tformedy()
                    local36 = tformedz()
                    local5 = createdecal($03, local34, ((local35 - 0.2) + 0.005), local36, 90.0, rnd(360.0, 0.0), 0.0, 1.0, 1.0, $00, $01, $00, $00, $00)
                    entityparent(local5\Field0, local3\Field19\Field15, $01)
                    local1 = createnpc($16, local34, local35, local36)
                    local1\Field57 = -1.0
                    local1\Field1 = $01
                    changenpctextureid(local1, $00)
                    setnpcframe(local1, 19.0, $01)
                    rotateentity(local1\Field82, 0.0, (entityyaw(local3\Field19\Field15, $00, 1.0) - 80.0), 0.0, $01)
                    removeevent(local3)
                EndIf
            Case $07
                If (playerroom = local3\Field19) Then
                    turnentity(local3\Field19\Field27[$00], (local3\Field1 * fps\Field3[$00]), 0.0, 0.0, $00)
                    If (0.01 < local3\Field1) Then
                        local3\Field2 = loopsoundex(roomambience[$08], local3\Field2, camera, local3\Field19\Field27[$00], 5.0, (local3\Field1 / 4.0), $00)
                    EndIf
                    local3\Field1 = curvevalue((local3\Field7 * 5.0), local3\Field1, 150.0)
                EndIf
                If (16.0 > local3\Field19\Field39) Then
                    If (0.0 > local3\Field4) Then
                        local23 = (Int local3\Field7)
                        local3\Field7 = (Float rand($00, $01))
                        If (playerroom <> local3\Field19) Then
                            local3\Field1 = (local3\Field7 * 5.0)
                        ElseIf (((0.0 = (Float local23)) And (1.0 = local3\Field7)) <> 0) Then
                            local3\Field8 = playsoundex(loadtempsound("SFX\Ambient\Room Ambience\FanOn.ogg"), camera, local3\Field19\Field27[$00], 8.0, 1.0, $00, $00)
                        ElseIf (((1.0 = (Float local23)) And (0.0 = local3\Field7)) <> 0) Then
                            local3\Field8 = playsoundex(loadtempsound("SFX\Ambient\Room Ambience\FanOff.ogg"), camera, local3\Field19\Field27[$00], 8.0, 1.0, $00, $00)
                        EndIf
                        local3\Field4 = (rnd(15.0, 30.0) * 70.0)
                    Else
                        local3\Field4 = (local3\Field4 - fps\Field3[$00])
                    EndIf
                EndIf
            Case $1F
                If (6.0 > local3\Field19\Field39) Then
                    If (local3\Field19\Field32[$00] = Null) Then
                        tformpoint(447.0, 51.2, 208.0, local3\Field19\Field15, $00)
                        local3\Field19\Field32[$00] = createnpc($16, tformedx(), tformedy(), tformedz())
                        local3\Field19\Field32[$00]\Field57 = -1.0
                        local3\Field19\Field32[$00]\Field1 = $01
                        changenpctextureid(local3\Field19\Field32[$00], $12)
                        setnpcframe(local3\Field19\Field32[$00], 40.0, $01)
                        rotateentity(local3\Field19\Field32[$00]\Field82, 0.0, ((Float local3\Field19\Field21) + 90.0), 0.0, $01)
                        For local20 = $00 To $04 Step $01
                            tformpoint(543.5, (rnd(-50.0, 50.0) + 120.0), (rnd(-50.0, 50.0) + 208.0), local3\Field19\Field15, $00)
                            createdecal($10, tformedx(), tformedy(), tformedz(), 0.0, ((Float local3\Field19\Field21) + 270.0), 0.0, rnd(0.028, 0.034), 1.0, $01, $02, $00, $00, $00)
                        Next
                    EndIf
                EndIf
                If (playerroom = local3\Field19) Then
                    If (-37.51562 > entityy(XZ0260X8X2\Field74, $01, 1.0)) Then
                        local3\Field4 = (Float updatelever(local3\Field19\Field9[$00]\Field1, $00, $50, -80.0))
                        updatelever(local3\Field19\Field9[$01]\Field1, $00, $50, -80.0)
                        If (1.0 = local3\Field4) Then
                            If (local3\Field19\Field17[$07] = Null) Then
                                For local20 = $00 To $07 Step $01
                                    Select local20
                                        Case $00
                                            local34 = 813.0
                                            local36 = -152.0
                                        Case $01
                                            local34 = 818.0
                                            local36 = 147.0
                                        Case $02
                                            local34 = 621.0
                                            local36 = 341.0
                                        Case $03
                                            local34 = 327.0
                                            local36 = 349.0
                                        Case $04
                                            local34 = 137.0
                                            local36 = 143.0
                                        Case $05
                                            local34 = 137.0
                                            local36 = -155.0
                                        Case $06
                                            local34 = 330.0
                                            local36 = -346.0
                                        Case $07
                                            local34 = 635.0
                                            local36 = -346.0
                                    End Select
                                    local35 = -11086.0
                                    tformpoint(local34, local35, local36, local3\Field19\Field15, $00)
                                    local3\Field19\Field17[local20] = setemitter(local3\Field19, tformedx(), tformedy(), tformedz(), $0A)
                                Next
                            EndIf
                        ElseIf (local3\Field19\Field17[$07] <> Null) Then
                            For local20 = $00 To $07 Step $01
                                freeemitter(local3\Field19\Field17[local20], $00)
                            Next
                        EndIf
                    Else
                        If (0.0 = local3\Field1) Then
                            If (local3\Field19\Field25[$02]\Field39 <> 0) Then
                                local3\Field1 = (Float rand($02, $03))
                            EndIf
                        Else
                            local3\Field23 = min((local3\Field23 + fps\Field3[$00]), 672.0)
                            If (((175.0 < local3\Field23) And (175.0 >= (local3\Field23 - fps\Field3[$00]))) <> 0) Then
                                tformpoint(889.0, 120.0, (379.0 - ((Float (3.0 = local3\Field1)) * 758.0)), local3\Field19\Field15, $00)
                                local3\Field19\Field32[$01] = createnpc($11, tformedx(), tformedy(), tformedz())
                                local3\Field19\Field32[$01]\Field66 = -1.0
                                rotateentity(local3\Field19\Field32[$01]\Field82, 0.0, (((Float local3\Field19\Field21) + 90.0) + ((Float (3.0 = local3\Field1)) * 180.0)), 0.0, $01)
                                XZ0260X8X2\Field14 = max(1.0, XZ0260X8X2\Field14)
                                playsoundex(loadtempsound((("SFX\Room\Room2Nuke\Vent" + (Str rand($00, $02))) + ".ogg")), camera, local3\Field19\Field27[(Int local3\Field1)], 5.0, 2.0, $00, $00)
                                setemitter(Null, entityx(local3\Field19\Field27[(Int local3\Field1)], $01, 1.0), entityy(local3\Field19\Field27[(Int local3\Field1)], $01, 1.0), entityz(local3\Field19\Field27[(Int local3\Field1)], $01, 1.0), $23)
                            ElseIf (((455.0 < local3\Field23) And (455.0 >= (local3\Field23 - fps\Field3[$00]))) <> 0) Then
                                XZ0260X8X2\Field14 = max(1.0, XZ0260X8X2\Field14)
                                playsoundex(loadtempsound((("SFX\Room\Room2Nuke\Vent" + (Str rand($00, $02))) + ".ogg")), camera, local3\Field19\Field27[(Int local3\Field1)], 5.0, 2.0, $00, $00)
                                setemitter(Null, entityx(local3\Field19\Field27[(Int local3\Field1)], $01, 1.0), entityy(local3\Field19\Field27[(Int local3\Field1)], $01, 1.0), entityz(local3\Field19\Field27[(Int local3\Field1)], $01, 1.0), $23)
                            ElseIf (((665.0 < local3\Field23) And (665.0 >= (local3\Field23 - fps\Field3[$00]))) <> 0) Then
                                local3\Field19\Field32[$01]\Field66 = 1.0
                                local3\Field19\Field32[$01]\Field65 = 140.0
                                XZ0260X8X2\Field14 = max(1.5, XZ0260X8X2\Field14)
                                playsoundex(loadtempsound("SFX\Door\DoorOpenFast.ogg"), camera, local3\Field19\Field27[(Int local3\Field1)], 5.0, 1.0, $00, $00)
                                setemitter(Null, entityx(local3\Field19\Field27[(Int local3\Field1)], $01, 1.0), entityy(local3\Field19\Field27[(Int local3\Field1)], $01, 1.0), entityz(local3\Field19\Field27[(Int local3\Field1)], $01, 1.0), $23)
                            ElseIf (672.0 <= local3\Field23) Then
                                rotateentity(local3\Field19\Field27[(Int local3\Field1)], curveangle(-15.0, entitypitch(local3\Field19\Field27[(Int local3\Field1)], $01, 1.0), 15.0), ((Float local3\Field19\Field21) + ((Float (3.0 = local3\Field1)) * 180.0)), 0.0, $01)
                            EndIf
                        EndIf
                        local87 = ((Float ((2.0 = local3\Field1) * (672.0 <= local3\Field23))) + 2.0)
                        local88 = ((Float ((2.0 = local3\Field1) * (672.0 <= local3\Field23))) + 0.8)
                        local3\Field2 = loopsoundex(roomambience[$03], local3\Field2, camera, local3\Field19\Field27[$02], local87, local88, $00)
                        local3\Field8 = loopsoundex(roomambience[$03], local3\Field8, camera, local3\Field19\Field27[$03], local87, local88, $00)
                    EndIf
                    local34 = entityx(XZ0260X8X2\Field74, $01, 1.0)
                    local35 = entityy(XZ0260X8X2\Field74, $01, 1.0)
                    local36 = entityz(XZ0260X8X2\Field74, $01, 1.0)
                    XZ0260X8X2\Field27 = (isinsideelevator(local34, local35, local36, local3\Field19\Field27[$00]) Lor isinsideelevator(local34, local35, local36, local3\Field19\Field27[$01]))
                    local3\Field7 = updateelevators(local3\Field7, local3\Field19\Field25[$00], local3\Field19\Field25[$01], local3\Field19\Field27[$00], local3\Field19\Field27[$01], local3, $01, $00)
                EndIf
            Case $32
                If (playerroom = local3\Field19) Then
                    If (local3\Field19\Field27[$00] = $00) Then
                        local3\Field19\Field27[$00] = copyentity(n_i\Field9[$1D], $00)
                        scaleentity(local3\Field19\Field27[$00], 0.07, 0.07, 0.07, $00)
                        positionentity(local3\Field19\Field27[$00], 0.0, -500.0, 0.0, $00)
                        entityparent(local3\Field19\Field27[$00], local3\Field19\Field15, $01)
                    Else
                        Select rand($04, $01)
                            Case $01
                                tformpoint(-808.0, -72.0, -40.0, local3\Field19\Field15, $00)
                            Case $02
                                tformpoint(-488.0, 160.0, 700.0, local3\Field19\Field15, $00)
                            Case $03
                                tformpoint(-488.0, 160.0, -700.0, local3\Field19\Field15, $00)
                            Case $04
                                tformpoint(-600.0, 340.0, 0.0, local3\Field19\Field15, $00)
                        End Select
                        If ((((-8.0 > XZ0260X8X2\Field53) And (-12.0 < XZ0260X8X2\Field53)) Lor T8660BZ460\Field5) <> 0) Then
                            positionentity(local3\Field19\Field27[$00], tformedx(), tformedy(), tformedz(), $01)
                            rotateentity(local3\Field19\Field27[$00], 0.0, rnd(360.0, 0.0), 0.0, $00)
                        EndIf
                    EndIf
                EndIf
            Case $31
                local90 = $00
                For local4 = Each events
                    If (((local4 <> local3) And (local4\Field32 = $15)) <> 0) Then
                        If (0.0 > local4\Field4) Then
                            local90 = $01
                            Exit
                        EndIf
                    EndIf
                Next
                If (local90 <> 0) Then
                    If (8.0 > local3\Field19\Field39) Then
                        If (0.0 = local3\Field4) Then
                            local1 = createnpc($16, local3\Field19\Field40, (local3\Field19\Field3 + 0.203125), local3\Field19\Field37)
                            local1\Field57 = -1.0
                            local1\Field1 = $01
                            setnpcframe(local1, 19.0, $01)
                            rotateentity(local1\Field82, 0.0, ((Float local3\Field19\Field21) + 180.0), 0.0, $00)
                            moveentity(local1\Field82, 0.0, 0.0, -0.5, $00)
                            changenpctextureid(local1, $16)
                            local1 = createnpc($02, local3\Field19\Field40, (local3\Field19\Field3 + 0.2), local3\Field19\Field37)
                            rotateentity(local1\Field82, 0.0, (Float local3\Field19\Field21), 0.0, $00)
                            moveentity(local1\Field82, 0.0, 0.0, 0.6, $00)
                            removeevent(local3)
                        EndIf
                    EndIf
                EndIf
            Case $48
                If (entityhidden(local3\Field19\Field16[$01]\Field7) = $00) Then
                    hideentity(local3\Field19\Field16[$01]\Field7)
                EndIf
                If (0.0 = local3\Field1) Then
                    If (rand($08, $01) = $01) Then
                        rotateentity(local3\Field19\Field9[$00]\Field1, 80.0, entityyaw(local3\Field19\Field9[$00]\Field1, $00, 1.0), 0.0, $00)
                        rotateentity(local3\Field19\Field9[$01]\Field1, 80.0, entityyaw(local3\Field19\Field9[$01]\Field1, $00, 1.0), 0.0, $00)
                        local3\Field1 = 1.0
                        local3\Field23 = -196.0
                    Else
                        local3\Field1 = 2.0
                    EndIf
                EndIf
                If (16.0 > local3\Field19\Field39) Then
                    local91 = (0.0 > entitypitch(local3\Field19\Field9[$00]\Field1, $01, 1.0))
                    local23 = updatelever(local3\Field19\Field9[$00]\Field1, $00, $50, -80.0)
                    If (local23 <> 0) Then
                        If (local91 <> local23) Then
                            If (local23 <> 0) Then
                                playsound_strict(snd_i\Field34, $00, $00)
                                local3\Field4 = 0.0
                            EndIf
                        EndIf
                    Else
                        StopChannel(local3\Field2)
                        local3\Field2 = $00
                        local3\Field4 = 3.0
                        local3\Field7 = -6300.0
                    EndIf
                    If (playerroom = local3\Field19) Then
                        updatelever(local3\Field19\Field9[$01]\Field1, $00, $50, -80.0)
                        local23 = $01
                        For local4 = Each events
                            If (((local4\Field32 = local3\Field32) And (local4 <> local3)) <> 0) Then
                                If (((local4\Field19\Field32[$00] <> Null) Lor (1.0 = local3\Field1)) <> 0) Then
                                    local23 = $00
                                    Exit
                                EndIf
                            EndIf
                        Next
                        If (((local3\Field19\Field32[$00] = Null) And local23) <> 0) Then
                            local3\Field19\Field25[$00]\Field21 = $01
                            If (90.0 = (Float (local3\Field19\Field21 Mod $B4))) Then
                                local20 = (((entityx(local3\Field19\Field15, $01, 1.0) > entityx(XZ0260X8X2\Field74, $01, 1.0)) Xor (- ((entityx(local3\Field19\Field15, $01, 1.0) > entityx(XZ0260X8X2\Field74, $01, 1.0)) < 0))) - (- ((entityx(local3\Field19\Field15, $01, 1.0) > entityx(XZ0260X8X2\Field74, $01, 1.0)) < 0)))
                                local34 = (((Float local20) * 800.0) + ((Float (local20 = $00)) * -800.0))
                                local36 = 0.0
                            Else
                                local20 = (entityz(local3\Field19\Field15, $01, 1.0) > (Abs entityz(XZ0260X8X2\Field74, $01, 1.0)))
                                local34 = 0.0
                                local36 = (((Float local20) * 800.0) + ((Float (local20 = $00)) * -800.0))
                            EndIf
                            local3\Field19\Field32[$00] = createnpc($14, (entityx(local3\Field19\Field15, $01, 1.0) + (local34 * (1.0 / 256.0))), (local3\Field19\Field3 + 0.3), (entityz(local3\Field19\Field15, $01, 1.0) + (local36 * (1.0 / 256.0))))
                            local3\Field19\Field32[$00]\Field66 = 2.0
                            local3\Field19\Field32[$00]\Field32 = 0.026
                            pointentity(local3\Field19\Field32[$00]\Field82, local3\Field19\Field15, 0.0)
                            local3\Field4 = 0.0
                        EndIf
                    EndIf
                    Select local3\Field4
                        Case 0.0
                            updateredlight(local3\Field19\Field16[$00], 1500.0, 800.0)
                            hideentity(local3\Field19\Field27[$00])
                            local3\Field2 = loopsoundex(snd_i\Field56, local3\Field2, camera, local3\Field19\Field27[$00], 4.0, 0.5, $00)
                            local3\Field7 = 0.0
                            local37 = entityx(local3\Field19\Field15, $01, 1.0)
                            local39 = entityz(local3\Field19\Field15, $01, 1.0)
                            local38 = entityy(local3\Field19\Field15, $01, 1.0)
                            If ((((1.0 > (Abs (entityx(XZ0260X8X2\Field74, $01, 1.0) - local37))) And (1.0 > (Abs (entityz(XZ0260X8X2\Field74, $01, 1.0) - local39)))) And (1.3 > (Abs (entityy(XZ0260X8X2\Field74, $01, 1.0) - local38)))) <> 0) Then
                                If (((0.0 = XZ0260X8X2\Field48) And (chs\Field8 = $00)) <> 0) Then
                                    If (((local3\Field19\Field32[$00] = Null) Lor local3\Field19\Field32[$00]\Field1) <> 0) Then
                                        If (ChannelPlaying(local3\Field2) <> 0) Then
                                            StopChannel(local3\Field2)
                                            local3\Field2 = $00
                                        EndIf
                                        local3\Field2 = playsoundex(snd_i\Field32, camera, local3\Field19\Field27[$00], 4.0, 0.5, $00, $00)
                                        local3\Field4 = 1.0
                                    EndIf
                                EndIf
                            EndIf
                            For local1 = Each npcs
                                If (((local1\Field77 <> $0B) And (local1\Field1 = $00)) <> 0) Then
                                    local34 = entityx(local1\Field82, $01, 1.0)
                                    local36 = entityz(local1\Field82, $01, 1.0)
                                    local35 = entityy(local1\Field82, $01, 1.0)
                                    If (((local1\Field77 = $18) And (local3\Field19\Field32[$01] = Null)) <> 0) Then
                                        If ((((2.0 > (Abs (local34 - local37))) And (2.0 > (Abs (local36 - local39)))) And (1.3 > (Abs (local35 - local38)))) <> 0) Then
                                            local1\Field13 = $01
                                            local1\Field8 = 0.0
                                            local1\Field30 = $00
                                            local1\Field57 = 700.0
                                            local1\Field66 = 11.0
                                            local3\Field19\Field32[$01] = local1
                                        EndIf
                                    ElseIf ((((0.81 > (Abs (local34 - local37))) And (0.81 > (Abs (local36 - local39)))) And (1.3 > (Abs (local35 - local38)))) <> 0) Then
                                        If (ChannelPlaying(local3\Field2) <> 0) Then
                                            StopChannel(local3\Field2)
                                            local3\Field2 = $00
                                        EndIf
                                        local3\Field2 = playsoundex(snd_i\Field32, camera, local3\Field19\Field27[$00], 4.0, 0.5, $00, $00)
                                        local3\Field4 = 1.0
                                    EndIf
                                EndIf
                            Next
                            If (local3\Field19\Field32[$01] <> Null) Then
                                If (0.0 >= local3\Field19\Field32[$01]\Field57) Then
                                    StopChannel(local3\Field2)
                                    local3\Field2 = $00
                                    playannouncement((("SFX\Character\MTF\AnnouncTeslaDisabled" + (Str rand($00, $02))) + ".ogg"), $01)
                                    rotateentity(local3\Field19\Field9[$00]\Field1, 80.0, entityyaw(local3\Field19\Field9[$00]\Field1, $00, 1.0), 0.0, $00)
                                    local3\Field19\Field32[$01] = Null
                                EndIf
                            EndIf
                        Case 1.0
                            updateredlight(local3\Field19\Field16[$00], 100.0, 50.0)
                            local3\Field7 = (local3\Field7 + fps\Field3[$00])
                            If (35.0 <= local3\Field7) Then
                                StopChannel(local3\Field8)
                                local3\Field8 = $00
                                local3\Field8 = playsoundex(snd_i\Field6, camera, local3\Field19\Field27[$00], 10.0, 1.0, $00, $00)
                                local3\Field4 = 2.0
                            EndIf
                        Case 2.0
                            local37 = entityx(local3\Field19\Field15, $01, 1.0)
                            local39 = entityz(local3\Field19\Field15, $01, 1.0)
                            local38 = entityy(local3\Field19\Field15, $01, 1.0)
                            If ((((0.75 > (Abs (entityx(XZ0260X8X2\Field74, $01, 1.0) - local37))) And (0.75 > (Abs (entityz(XZ0260X8X2\Field74, $01, 1.0) - local39)))) And (1.3 > (Abs (entityy(XZ0260X8X2\Field74, $01, 1.0) - local38)))) <> 0) Then
                                If (0.0 = XZ0260X8X2\Field48) Then
                                    If (opt\Field69 > $00) Then
                                        local18 = setemitter(Null, entityx(XZ0260X8X2\Field74, $01, 1.0), entityy(XZ0260X8X2\Field74, $01, 1.0), entityz(XZ0260X8X2\Field74, $01, 1.0), $0E)
                                        entityparent(local18\Field2, XZ0260X8X2\Field74, $01)
                                    EndIf
                                    XZ0260X8X2\Field78 = 0.4
                                    XZ0260X8X2\Field1 = 1.0
                                    msg\Field8 = format(getlocalstring("death", "tesla"), subjectname, "%s")
                                    kill($00, $01, $00, $01)
                                EndIf
                            EndIf
                            For local1 = Each npcs
                                If (((local1\Field77 <> $0B) And (local1\Field1 = $00)) <> 0) Then
                                    If (local1\Field77 = $14) Then
                                        local3\Field19\Field25[$00]\Field21 = $00
                                        setnpcframe(local1, 41.0, $01)
                                        local1\Field1 = $01
                                        local1\Field57 = 1.0
                                    EndIf
                                    If ((((0.6 > (Abs (entityx(local1\Field82, $01, 1.0) - local37))) And (0.6 > (Abs (entityz(local1\Field82, $01, 1.0) - local39)))) And (1.3 > (Abs (entityy(local1\Field82, $01, 1.0) - local38)))) <> 0) Then
                                        If (local1\Field77 <> $07) Then
                                            local1\Field73 = $01
                                            entitycolor(local1\Field98, 40.0, 40.0, 40.0)
                                            If (local1\Field77 = $08) Then
                                                entitycolor(local1\Field101, 40.0, 40.0, 40.0)
                                            EndIf
                                        EndIf
                                        local1\Field64 = 0.0
                                        local1\Field4 = $00
                                        If ((((opt\Field69 > $00) And (local1\Field77 <> $11)) And (local1\Field77 <> $15)) <> 0) Then
                                            local18 = setemitter(Null, entityx(local1\Field98, $01, 1.0), entityy(local1\Field98, $01, 1.0), entityz(local1\Field98, $01, 1.0), $0E)
                                            entityparent(local18\Field2, local1\Field98, $01)
                                        EndIf
                                        Select local1\Field77
                                            Case $07
                                                giveachievement("tesla", $01)
                                                local1\Field66 = 4.0
                                            Case $03
                                                If (3.0 <> local1\Field66) Then
                                                    local1\Field66 = 5.0
                                                EndIf
                                            Case $0E
                                                showentity(local1\Field98)
                                            Case $0F
                                                local1\Field60 = 0.0
                                                local1\Field61 = 0.0
                                                local1\Field74 = 0.0
                                                local1\Field66 = 4.0
                                        End Select
                                        If (((6.0 > local3\Field19\Field39) And (entityinview(local1\Field82, camera) And entityvisible(XZ0260X8X2\Field74, local1\Field82, 0.0))) <> 0) Then
                                            XZ0260X8X2\Field78 = 0.3
                                        EndIf
                                    EndIf
                                EndIf
                            Next
                            If (rand($05, $01) < $05) Then
                                positiontexture(X2Z260BF0Z\Field0[$03], 0.0, rnd(0.0, 1.0))
                                If (entityhidden(local3\Field19\Field27[$00]) <> 0) Then
                                    showentity(local3\Field19\Field27[$00])
                                EndIf
                                If (10.0 > local3\Field19\Field39) Then
                                    lightvolume = (rnd(1.0, 2.0) * templightvolume)
                                    showentity(local3\Field19\Field16[$01]\Field7)
                                EndIf
                            EndIf
                            local3\Field7 = (local3\Field7 - (fps\Field3[$00] * 1.5))
                            If (0.0 >= local3\Field7) Then
                                StopChannel(local3\Field2)
                                local3\Field2 = $00
                                local3\Field2 = playsoundex(snd_i\Field34, camera, local3\Field19\Field27[$00], 4.0, 0.5, $00, $00)
                                local3\Field4 = 3.0
                                local3\Field7 = -70.0
                            EndIf
                        Case 3.0
                            local3\Field7 = (local3\Field7 + fps\Field3[$00])
                            If (entityhidden(local3\Field19\Field27[$00]) = $00) Then
                                hideentity(local3\Field19\Field27[$00])
                            EndIf
                            If (entityhidden(local3\Field19\Field16[$00]\Field7) = $00) Then
                                hideentity(local3\Field19\Field16[$00]\Field7)
                            EndIf
                            If (0.0 <= local3\Field7) Then
                                local3\Field4 = 0.0
                            EndIf
                    End Select
                    If (0.0 > entitypitch(local3\Field19\Field9[$01]\Field1, $00, 1.0)) Then
                        local3\Field23 = min((local3\Field23 + fps\Field3[$00]), 0.0)
                    Else
                        local3\Field23 = max((local3\Field23 - fps\Field3[$00]), -196.0)
                    EndIf
                    If (((0.0 > local3\Field23) And (-196.0 < local3\Field23)) <> 0) Then
                        If (ChannelPlaying(local3\Field11) = $00) Then
                            local3\Field11 = loopsoundex(snd_i\Field19, local3\Field11, camera, local3\Field19\Field27[$02], 10.0, 1.0, $00)
                        EndIf
                    Else
                        StopChannel(local3\Field11)
                        local3\Field11 = $00
                    EndIf
                    positionentity(local3\Field19\Field27[$01], 0.0, local3\Field23, 0.0, $00)
                    updatesoundorigin(local3\Field11, camera, local3\Field19\Field27[$02], 10.0, 1.0, $00, $01, $00)
                EndIf
            Case $49
                If (playerroom = local3\Field19) Then
                    If (2.0 > local3\Field19\Field39) Then
                        If (((36.0 > entitydistancesquared(XZ0260X8X2\Field74, n_i\Field3\Field82)) Lor (36.0 > entitydistancesquared(XZ0260X8X2\Field74, n_i\Field2\Field82))) <> 0) Then
                            removeevent(local3)
                        Else
                            local25 = createpivot($00)
                            positionentity(local25, entityx(XZ0260X8X2\Field74, $00, 1.0), entityy(XZ0260X8X2\Field74, $00, 1.0), entityz(XZ0260X8X2\Field74, $00, 1.0), $00)
                            pointentity(local25, local3\Field19\Field15, 0.0)
                            rotateentity(local25, 0.0, entityyaw(local25, $00, 1.0), 0.0, $01)
                            moveentity(local25, 0.0, 0.0, (entitydistance(local25, local3\Field19\Field15) * 2.0), $00)
                            XZ0260X8X2\Field53 = -10.0
                            playsound_strict(snd_i\Field40[$0B], $00, $00)
                            updateworld(1.0, 0.0)
                            positionentity(XZ0260X8X2\Field74, entityx(local25, $00, 1.0), (entityy(local25, $00, 1.0) + 0.05), entityz(local25, $00, 1.0), $00)
                            turnentity(XZ0260X8X2\Field74, 0.0, 180.0, 0.0, $00)
                            resetrender()
                            freeentity(local25)
                            local25 = $00
                            removeevent(local3)
                        EndIf
                    EndIf
                EndIf
            Case $4A
                If (8.0 > local3\Field19\Field39) Then
                    If (16.0 > entitydistancesquared(XZ0260X8X2\Field74, n_i\Field3\Field82)) Then
                        If (local3\Field19\Field27[$1D] <> $00) Then
                            local5 = createdecal($01, entityx(local3\Field19\Field27[$1D], $01, 1.0), (local3\Field19\Field3 + 0.005), entityz(local3\Field19\Field27[$1D], $01, 1.0), 90.0, rnd(360.0, 0.0), 0.0, 0.2, rnd(0.7, 0.8), $00, $01, $00, $00, $00)
                            entityparent(local5\Field0, local3\Field19\Field15, $01)
                            freeentity(local3\Field19\Field27[$1D])
                            local3\Field19\Field27[$1D] = $00
                        EndIf
                        removeevent(local3)
                    ElseIf (local3\Field19\Field27[$1D] = $00) Then
                        Select rand($03, $01)
                            Case $01
                                local23 = $14
                            Case $02
                                local23 = $5D
                            Case $03
                                local23 = $41
                        End Select
                        For local19 = Each itemtemplates
                            If (local19\Field9 = local23) Then
                                local3\Field19\Field27[$1D] = GUESSEDcopyentity_2(local19\Field21, $00)
                                If (local3\Field19\Field35 <> $00) Then
                                    positionentity(local3\Field19\Field27[$1D], entityx(local3\Field19\Field35, $00, 1.0), (local3\Field19\Field3 + 0.1), entityz(local3\Field19\Field35, $00, 1.0), $00)
                                Else
                                    positionentity(local3\Field19\Field27[$1D], local3\Field19\Field40, local3\Field19\Field3, local3\Field19\Field37, $00)
                                EndIf
                                rotateentity(local3\Field19\Field27[$1D], 0.0, rnd(360.0, 0.0), 0.0, $00)
                                entityparent(local3\Field19\Field27[$1D], local3\Field19\Field15, $01)
                                Exit
                            EndIf
                        Next
                    ElseIf (4.0 > entitydistancesquared(XZ0260X8X2\Field74, local3\Field19\Field27[$1D])) Then
                        XZ0260X8X2\Field64 = 500.0
                        XZ0260X8X2\Field53 = -10.0
                        playsound_strict(snd_i\Field40[$0B], $00, $00)
                        local5 = createdecal($01, entityx(local3\Field19\Field27[$1D], $01, 1.0), (local3\Field19\Field3 + 0.005), entityz(local3\Field19\Field27[$1D], $01, 1.0), 90.0, rnd(360.0, 0.0), 0.0, 0.2, rnd(0.7, 0.8), $00, $01, $00, $00, $00)
                        entityparent(local5\Field0, local3\Field19\Field15, $01)
                        freeentity(local3\Field19\Field27[$1D])
                        local3\Field19\Field27[$1D] = $00
                        removeevent(local3)
                    EndIf
                EndIf
            Case $1E
                If ((((10.0 > local3\Field19\Field39) Lor (playerroom = local3\Field19)) And (0.0 = local3\Field4)) <> 0) Then
                    local3\Field2 = playsound_strict(loadtempsound("SFX\Room\457Chamber\Ambient1.ogg"), $00, $00)
                    local3\Field4 = 1.0
                EndIf
                If (playerroom = local3\Field19) Then
                    If (-42.96875 > entityy(XZ0260X8X2\Field74, $01, 1.0)) Then
                        local95 = (fps\Field3[$00] * 4.0)
                        XZ0260X8X2\Field10 = $01
                        shouldplay = $1C
                        turnentity(local3\Field19\Field27[$04], local95, 0.0, 0.0, $00)
                        turnentity(local3\Field19\Field27[$05], local95, 0.0, 0.0, $00)
                        turnentity(local3\Field19\Field27[$06], local95, 0.0, 0.0, $00)
                        turnentity(local3\Field19\Field27[$07], local95, 0.0, 0.0, $00)
                        turnentity(local3\Field19\Field27[$08], (local95 / 4.0), 0.0, 0.0, $00)
                        turnentity(local3\Field19\Field27[$09], (local95 / 4.0), 0.0, 0.0, $00)
                        updatelever(local3\Field19\Field9[$00]\Field1, $00, $50, -80.0)
                        Select local3\Field4
                            Case 1.0
                                For local20 = $00 To $01 Step $01
                                    Select local20
                                        Case $00
                                            tformpoint(941.0, -12700.0, -553.0, local3\Field19\Field15, $00)
                                        Case $01
                                            tformpoint(3277.0, -12700.0, 2447.0, local3\Field19\Field15, $00)
                                    End Select
                                    createnpc($0E, tformedx(), tformedy(), tformedz())
                                Next
                                tformpoint(7993.0, -12700.0, 1637.0, local3\Field19\Field15, $00)
                                local1 = createnpc($0A, tformedx(), tformedy(), tformedz())
                                n_i\Field6 = local1
                                tformpoint(6806.0, -12650.0, -247.0, local3\Field19\Field15, $00)
                                local1 = createnpc($16, tformedx(), tformedy(), tformedz())
                                rotateentity(local1\Field82, 0.0, ((Float local3\Field19\Field21) + 90.0), 0.0, $01)
                                changenpctextureid(local1, $22)
                                local3\Field19\Field32[$00] = local1
                                tformpoint(9259.0, -12702.0, 1729.0, local3\Field19\Field15, $00)
                                local1 = createnpc($16, tformedx(), tformedy(), tformedz())
                                local1\Field1 = $01
                                local1\Field57 = -1.0
                                rotateentity(local1\Field82, 0.0, ((Float local3\Field19\Field21) + 180.0), 0.0, $01)
                                changenpctextureid(local1, $21)
                                setnpcframe(local1, 40.0, $01)
                                local3\Field19\Field32[$01] = local1
                                tformpoint(8029.0, -12700.0, 1416.0, local3\Field19\Field15, $00)
                                local1 = createnpc($16, tformedx(), tformedy(), tformedz())
                                local1\Field1 = $01
                                local1\Field57 = -1.0
                                rotateentity(local1\Field82, 0.0, ((Float local3\Field19\Field21) + 180.0), 0.0, $01)
                                changenpctextureid(local1, $1A)
                                setnpcframe(local1, 677.0, $01)
                                local3\Field19\Field32[$02] = local1
                                local3\Field4 = 2.0
                            Case 2.0
                                If (625.0 > distancesquared(entityx(XZ0260X8X2\Field74, $01, 1.0), entityx(local3\Field19\Field32[$00]\Field82, $01, 1.0), entityz(XZ0260X8X2\Field74, $01, 1.0), entityz(local3\Field19\Field32[$00]\Field82, $01, 1.0), 0.0, 0.0)) Then
                                    local3\Field2 = playsound_strict(loadtempsound("SFX\Room\457Chamber\Ambient0.ogg"), $00, $00)
                                    local3\Field4 = 3.0
                                EndIf
                            Case 3.0
                                If ((((Float (T8660BZ460\Field8 <> $00)) * 125.0) + 160.0) > distancesquared(entityx(XZ0260X8X2\Field74, $01, 1.0), entityx(local3\Field19\Field32[$00]\Field82, $01, 1.0), entityz(XZ0260X8X2\Field74, $01, 1.0), entityz(local3\Field19\Field32[$00]\Field82, $01, 1.0), 0.0, 0.0)) Then
                                    local3\Field19\Field32[$00]\Field66 = 2.0
                                    local3\Field2 = $00
                                    loadeventsound(local3, "SFX\Room\457Chamber\Scream.ogg", $00)
                                    local3\Field4 = 4.0
                                EndIf
                            Case 4.0
                                local41 = distancesquared(entityx(XZ0260X8X2\Field74, $01, 1.0), entityx(local3\Field19\Field32[$00]\Field82, $01, 1.0), entityz(XZ0260X8X2\Field74, $01, 1.0), entityz(local3\Field19\Field32[$00]\Field82, $01, 1.0), 0.0, 0.0)
                                local3\Field2 = loopsoundex(local3\Field0, local3\Field2, camera, local3\Field19\Field32[$00]\Field82, 12.0, 1.6, $01)
                                If (local3\Field30 = $00) Then
                                    If ((((hidedistance * hidedistance) > local41) And (entityvisible(XZ0260X8X2\Field74, local3\Field19\Field32[$00]\Field82, 0.0) And entityinview(local3\Field19\Field32[$00]\Field82, camera))) <> 0) Then
                                        local3\Field30 = loadsound_strict("SFX\Room\457Chamber\Horror.ogg")
                                        local3\Field8 = playsound_strict(local3\Field30, $00, $00)
                                    EndIf
                                EndIf
                                tformpoint(entityx(local3\Field19\Field32[$00]\Field82, $00, 1.0), entityy(local3\Field19\Field32[$00]\Field82, $00, 1.0), entityz(local3\Field19\Field32[$00]\Field82, $00, 1.0), $00, local3\Field19\Field15)
                                If (((9.0 > local41) Lor (5402.0 > tformedx())) <> 0) Then
                                    setnpcframe(local3\Field19\Field32[$00], 41.0, $01)
                                    local3\Field19\Field32[$00]\Field66 = -1.0
                                    local3\Field19\Field32[$00]\Field57 = 1.0
                                    local3\Field19\Field32[$00]\Field1 = $01
                                    playsoundex(snd_i\Field50[$00], camera, local3\Field19\Field32[$00]\Field82, 5.0, 0.8, $00, $00)
                                    n_i\Field6\Field66 = 2.0
                                    local3\Field4 = 5.0
                                EndIf
                            Case 5.0
                                If (ChannelPlaying(local3\Field8) = $00) Then
                                    freesound_strict(local3\Field0)
                                    local3\Field0 = $00
                                    local3\Field2 = $00
                                    freesound_strict(local3\Field30)
                                    local3\Field30 = $00
                                    local3\Field8 = $00
                                    local3\Field4 = 6.0
                                EndIf
                        End Select
                    EndIf
                    local34 = entityx(XZ0260X8X2\Field74, $01, 1.0)
                    local35 = entityy(XZ0260X8X2\Field74, $01, 1.0)
                    local36 = entityz(XZ0260X8X2\Field74, $01, 1.0)
                    XZ0260X8X2\Field27 = (((isinsideelevator(local34, local35, local36, local3\Field19\Field27[$00]) Lor isinsideelevator(local34, local35, local36, local3\Field19\Field27[$01])) Lor isinsideelevator(local34, local35, local36, local3\Field19\Field27[$02])) Lor isinsideelevator(local34, local35, local36, local3\Field19\Field27[$03]))
                    toelevatorfloor = $FFFFFFFF
                    local3\Field7 = updateelevators(local3\Field7, local3\Field19\Field25[$00], local3\Field19\Field25[$02], local3\Field19\Field27[$00], local3\Field19\Field27[$02], local3, $01, $00)
                    local3\Field1 = updateelevators(local3\Field1, local3\Field19\Field25[$01], local3\Field19\Field25[$03], local3\Field19\Field27[$01], local3\Field19\Field27[$03], local3, $01, $00)
                EndIf
            Case $19
                If (n_i\Field2\Field93 = $00) Then
                    If (0.0 = local3\Field4) Then
                        If (((playerroom = local3\Field19) And ((chs\Field8 Lor i_268\Field3) = $00)) <> 0) Then
                            local3\Field4 = 1.0
                        EndIf
                    Else
                        local51 = (fps\Field3[$00] * 0.7)
                        local3\Field4 = (local3\Field4 + local51)
                        If (((0.3 < (local3\Field4 / 250.0)) And (0.3 >= ((local3\Field4 - local51) / 250.0))) <> 0) Then
                            local3\Field2 = playsound_strict(snd_i\Field40[$06], $00, $00)
                            XZ0260X8X2\Field64 = 800.0
                            local5 = createdecal($00, entityx(local3\Field19\Field27[$02], $01, 1.0), entityy(local3\Field19\Field27[$02], $01, 1.0), entityz(local3\Field19\Field27[$02], $01, 1.0), 0.0, ((Float local3\Field19\Field21) - 90.0), rnd(360.0, 0.0), 0.1, 0.01, $00, $01, $00, $00, $00)
                            local5\Field14 = 0.003
                            local5\Field5 = 0.005
                            local5\Field1 = 90000.0
                            entityparent(local5\Field0, local3\Field19\Field15, $01)
                        EndIf
                        If (((0.65 < (local3\Field4 / 250.0)) And (0.65 >= ((local3\Field4 - local51) / 250.0))) <> 0) Then
                            local5 = createdecal($00, entityx(local3\Field19\Field27[$03], $01, 1.0), entityy(local3\Field19\Field27[$03], $01, 1.0), entityz(local3\Field19\Field27[$03], $01, 1.0), 0.0, ((Float local3\Field19\Field21) + 90.0), rnd(360.0, 0.0), 0.1, 0.01, $00, $01, $00, $00, $00)
                            local5\Field14 = 0.003
                            local5\Field5 = 0.005
                            local5\Field1 = 90000.0
                            entityparent(local5\Field0, local3\Field19\Field15, $01)
                        EndIf
                        If (50.0 > local3\Field4) Then
                            n_i\Field2\Field31 = 1.0
                            positionentity(n_i\Field2\Field82, entityx(local3\Field19\Field27[$00], $01, 1.0), 0.0, entityz(local3\Field19\Field27[$00], $01, 1.0), $00)
                            pointentity(n_i\Field2\Field82, local3\Field19\Field27[$01], 0.0)
                            moveentity(n_i\Field2\Field82, 0.0, 0.0, ((entitydistance(local3\Field19\Field27[$00], local3\Field19\Field27[$01]) * 0.5) * (local3\Field4 / 50.0)), $00)
                            animatenpc(n_i\Field2, 284.0, 333.0, 0.7, $01)
                        ElseIf (200.0 > local3\Field4) Then
                            n_i\Field2\Field31 = 1.0
                            animatenpc(n_i\Field2, 334.0, 494.0, 0.2, $01)
                            positionentity(n_i\Field2\Field82, ((entityx(local3\Field19\Field27[$00], $01, 1.0) + entityx(local3\Field19\Field27[$01], $01, 1.0)) / 2.0), 0.0, ((entityz(local3\Field19\Field27[$00], $01, 1.0) + entityz(local3\Field19\Field27[$01], $01, 1.0)) / 2.0), $00)
                            rotateentity(n_i\Field2\Field82, 0.0, curvevalue(local3\Field4, entityyaw(n_i\Field2\Field82, $00, 1.0), 30.0), 0.0, $01)
                            If (((16.0 > entitydistancesquared(n_i\Field2\Field82, XZ0260X8X2\Field74)) And ((chs\Field8 Lor i_268\Field3) = $00)) <> 0) Then
                                n_i\Field2\Field31 = 0.0
                                n_i\Field2\Field66 = 3.0
                                n_i\Field2\Field65 = rnd(3000.0, 3500.0)
                                playsound_strict(snd_i\Field40[$0A], $00, $00)
                                removeevent(local3)
                                Return $00
                            EndIf
                        ElseIf (250.0 > local3\Field4) Then
                            n_i\Field2\Field31 = 1.0
                            positionentity(n_i\Field2\Field82, entityx(local3\Field19\Field27[$00], $01, 1.0), 0.0, entityz(local3\Field19\Field27[$00], $01, 1.0), $00)
                            pointentity(n_i\Field2\Field82, local3\Field19\Field27[$01], 0.0)
                            moveentity(n_i\Field2\Field82, 0.0, 0.0, (entitydistance(local3\Field19\Field27[$00], local3\Field19\Field27[$01]) * ((local3\Field4 - 150.0) / 100.0)), $00)
                            animatenpc(n_i\Field2, 284.0, 333.0, 0.7, $01)
                        EndIf
                        resetentity(n_i\Field2\Field82)
                        n_i\Field2\Field63 = loopsoundex(snd_i\Field58[$04], n_i\Field2\Field63, camera, n_i\Field2\Field82, 8.0, 0.8, $01)
                        positionentity(n_i\Field2\Field98, entityx(n_i\Field2\Field82, $00, 1.0), entityy(n_i\Field2\Field82, $00, 1.0), entityz(n_i\Field2\Field82, $00, 1.0), $00)
                        rotateentity(n_i\Field2\Field98, 0.0, entityyaw(n_i\Field2\Field82, $00, 1.0), 0.0, $00)
                        If (250.0 < local3\Field4) Then
                            playsoundex(snd_i\Field58[$03], camera, n_i\Field2\Field82, 10.0, 1.0, $01, $00)
                            playsoundex(snd_i\Field58[rand($05, $07)], camera, n_i\Field2\Field82, 10.0, 1.0, $00, $00)
                            n_i\Field2\Field31 = 0.0
                            n_i\Field2\Field66 = 0.0
                            n_i\Field2\Field65 = rnd(22000.0, 27000.0)
                            StopChannel(n_i\Field2\Field63)
                            n_i\Field2\Field63 = $00
                            removeevent(local3)
                        EndIf
                    EndIf
                Else
                    removeevent(local3)
                EndIf
            Case $1A
                If (n_i\Field2\Field93 = $00) Then
                    If (0.0 < n_i\Field2\Field66) Then
                        If (0.0 = local3\Field4) Then
                            If (((playerroom = local3\Field19) And ((chs\Field8 Lor i_268\Field3) = $00)) <> 0) Then
                                local3\Field4 = 1.0
                            EndIf
                        ElseIf (1.0 = local3\Field4) Then
                            If (2.0 > n_i\Field2\Field66) Then
                                tformpoint(-864.0, -447.0, -632.0, local3\Field19\Field15, $00)
                                n_i\Field2\Field60 = tformedx()
                                n_i\Field2\Field61 = tformedy()
                                n_i\Field2\Field74 = tformedz()
                                n_i\Field2\Field66 = 2.0
                            EndIf
                            local3\Field4 = 2.0
                        EndIf
                    EndIf
                EndIf
                If (((playerroom = local3\Field19) Lor (6.0 > local3\Field19\Field39)) <> 0) Then
                    If (updatelever(local3\Field19\Field9[$00]\Field1, $00, $50, -80.0) <> 0) Then
                        For local20 = $00 To $02 Step $01
                            If (local3\Field19\Field17[local20] = Null) Then
                                Select local20
                                    Case $00
                                        local99 = -202.0
                                        local100 = -256.0
                                    Case $01
                                        local99 = -202.0
                                        local100 = 0.0
                                    Case $02
                                        local99 = -202.0
                                        local100 = 256.0
                                End Select
                                tformpoint(local99, 0.0, local100, local3\Field19\Field15, $00)
                                local3\Field19\Field17[local20] = setemitter(local3\Field19, tformedx(), (local3\Field19\Field3 + (1.0 / 32.0)), tformedz(), $03)
                                local3\Field19\Field17[local20]\Field7 = $01
                            EndIf
                        Next
                    Else
                        For local20 = $00 To $02 Step $01
                            If (local3\Field19\Field17[local20] <> Null) Then
                                freeemitter(local3\Field19\Field17[local20], $00)
                            EndIf
                        Next
                    EndIf
                EndIf
            Case $26
                If (playerroom = local3\Field19) Then
                    If (local3\Field19\Field27[$00] = $00) Then
                        tformpoint(704.0, 112.0, -416.0, local3\Field19\Field15, $00)
                        local3\Field19\Field27[$00] = copyentity(n_i\Field9[$1D], $00)
                        scaleentity(local3\Field19\Field27[$00], 0.07, 0.07, 0.07, $00)
                        positionentity(local3\Field19\Field27[$00], tformedx(), tformedy(), tformedz(), $00)
                        rotateentity(local3\Field19\Field27[$00], 0.0, rnd(360.0, 0.0), 0.0, $00)
                        local28 = loadtexture_strict("GFX\NPCs\duck(3).png", $01, $00, 1.0)
                        entitytexture(local3\Field19\Field27[$00], local28, $00, $00)
                        deletesingletextureentryfromcache(local28, $00)
                        local28 = $00
                        entityparent(local3\Field19\Field27[$00], local3\Field19\Field15, $01)
                    ElseIf (entityinview(local3\Field19\Field27[$00], camera) = $00) Then
                        local3\Field4 = (local3\Field4 + fps\Field3[$00])
                        If (((rand($C8, $01) = $01) And (300.0 < local3\Field4)) <> 0) Then
                            local3\Field2 = playsoundex(loadtempsound("SFX\SCP\Joke\Saxophone.ogg"), camera, local3\Field19\Field27[$00], 6.0, 1.0, $00, $00)
                            local3\Field4 = 0.0
                        EndIf
                    ElseIf (ChannelPlaying(local3\Field2) <> 0) Then
                        StopChannel(local3\Field2)
                        local3\Field2 = $00
                    EndIf
                EndIf
            Case $27
                If (5.0 > local3\Field19\Field39) Then
                    If (0.0 = local3\Field4) Then
                        tformpoint(704.0, 166.0, -416.0, local3\Field19\Field15, $00)
                        local3\Field19\Field32[$00] = createnpc($10, tformedx(), tformedy(), tformedz())
                        local3\Field19\Field32[$00]\Field66 = 3.0
                        pointentity(local3\Field19\Field32[$00]\Field82, local3\Field19\Field15, 0.0)
                        setnpcframe(local3\Field19\Field32[$00], 326.0, $01)
                        local101 = (("drawing_1048(" + (Str rand($1A, $01))) + ").png")
                        local28 = getrescaledtexture(("GFX\Items\HUD Textures\" + local101), $01, $91, $CC, $00, $00)
                        For local19 = Each itemtemplates
                            If (local19\Field19 = "Drawing") Then
                                If (local19\Field25 <> $00) Then
                                    freeimage(local19\Field25)
                                    local19\Field25 = $00
                                EndIf
                                local19\Field2 = ("GFX\Items\HUD Textures\" + local101)
                                local19\Field13 = local19\Field2
                                entitytexture(local19\Field21, local28, $00, $00)
                                GUESSEDfreeentity_7(local19\Field21, $10000, $00)
                                Exit
                            EndIf
                        Next
                        local46 = countsurfaces(local3\Field19\Field32[$00]\Field98)
                        For local20 = $01 To local46 Step $01
                            local44 = getsurface(local3\Field19\Field32[$00]\Field98, local20)
                            local42 = getsurfacebrush(local44)
                            If (local42 <> $00) Then
                                local43 = getbrushtexture(local42, $00)
                                If (local43 <> $00) Then
                                    If (lower(strippath(texturename(local43))) <> "scp_1048.png") Then
                                        brushtexture(local42, local28, $00, $00)
                                        GUESSEDgetbrush_3(local42, $FFFFFFFF, $00)
                                        paintsurface(local44, local42)
                                        freetexture(local43)
                                        local43 = $00
                                        freebrush(local42)
                                        local42 = $00
                                        Exit
                                    EndIf
                                    freetexture(local43)
                                    local43 = $00
                                EndIf
                                freebrush(local42)
                                local42 = $00
                            EndIf
                        Next
                        deletesingletextureentryfromcache(local28, $00)
                        local28 = $00
                        local3\Field4 = 1.0
                    ElseIf (474.0 < local3\Field19\Field32[$00]\Field103) Then
                        If (interactobject(local3\Field19\Field32[$00]\Field98, 1.5, $00) <> 0) Then
                            If (GUESSEDrenderrenderdebughud_3() < maxitemamount) Then
                                selecteditem = createitem("Drawing", $00, 0.0, 0.0, 0.0, $00, $00, $00, 1.0, $00)
                                entitytype(selecteditem\Field9, $03, $00)
                                pickitem(selecteditem, $01)
                                handentity = $00
                                removenpc(local3\Field19\Field32[$00])
                                removeevent(local3)
                                Return $00
                            Else
                                createmsg(getlocalstring("msg", "cantcarry"), 6.0)
                            EndIf
                        EndIf
                    EndIf
                EndIf
            Case $29
                If (playerroom = local3\Field19) Then
                    If (((1.0 = local3\Field4) And remotedooron) <> 0) Then
                        If (4.0 > entitydistancesquared(XZ0260X8X2\Field74, local3\Field19\Field25[$01]\Field0)) Then
                            If (local3\Field19\Field25[$00]\Field39 = $00) Then
                                openclosedoor(local3\Field19\Field25[$00], $01, $00)
                            EndIf
                            If (local3\Field19\Field25[$01]\Field39 = $00) Then
                                openclosedoor(local3\Field19\Field25[$01], $01, $00)
                            Else
                                If (local3\Field2 <> $00) Then
                                    stopstream_strict(local3\Field2)
                                    local3\Field2 = $00
                                    local3\Field20 = $00
                                EndIf
                                local3\Field2 = streamsound_strict("SFX\SCP\079\Reward.ogg", (opt\Field59 * opt\Field2), $00)
                                local3\Field20 = $01
                                local3\Field4 = 2.0
                            EndIf
                        EndIf
                    ElseIf (((0.0 = local3\Field4) And local3\Field19\Field25[$01]\Field39) <> 0) Then
                        removeevent(local3)
                    ElseIf (((2.0 = local3\Field4) And ((local3\Field2 = $00) Lor (isstreamplaying_strict(local3\Field2) = $00))) <> 0) Then
                        removeevent(local3)
                    EndIf
                EndIf
            Case $39
                If (playerroom = local3\Field19) Then
                    If (0.0 = local3\Field4) Then
                        If (local3\Field19\Field25[$00]\Field39 <> 0) Then
                            If (180.0 = local3\Field19\Field25[$00]\Field13) Then
                                playsound_strict(snd_i\Field40[$05], $00, $00)
                                local3\Field4 = 1.0
                            EndIf
                        ElseIf (((2.25 > entitydistancesquared(XZ0260X8X2\Field74, local3\Field19\Field25[$00]\Field0)) And remotedooron) <> 0) Then
                            playsoundex(snd_i\Field26, camera, local3\Field19\Field25[$00]\Field51, 7.0, 1.0, $00, $00)
                            openclosedoor(local3\Field19\Field25[$00], $01, $00)
                        EndIf
                    ElseIf (local3\Field19\Field27[$00] = $00) Then
                        tformpoint(-808.0, 150.0, -72.0, local3\Field19\Field15, $00)
                        local3\Field19\Field27[$00] = createpivot($00)
                        positionentity(local3\Field19\Field27[$00], tformedx(), tformedy(), tformedz(), $00)
                        entityparent(local3\Field19\Field27[$00], local3\Field19\Field15, $01)
                    ElseIf (4.0 > entitydistancesquared(local3\Field19\Field27[$00], XZ0260X8X2\Field74)) Then
                        XZ0260X8X2\Field87 = curvevalue(0.5, XZ0260X8X2\Field87, 5.0)
                        XZ0260X8X2\Field62 = curvevalue(120.0, XZ0260X8X2\Field62, 150.0)
                        local3\Field2 = loopsoundex(snd_i\Field58[$04], local3\Field2, camera, local3\Field19\Field15, 5.0, 0.3, $01)
                        If (n_i\Field2\Field93 = $00) Then
                            If (1.0 = n_i\Field2\Field66) Then
                                n_i\Field2\Field65 = (n_i\Field2\Field65 - (fps\Field3[$00] * 3.0))
                            EndIf
                        EndIf
                        XZ0260X8X2\Field11 = (XZ0260X8X2\Field11 + (fps\Field3[$00] * 0.0001))
                    EndIf
                EndIf
            Case $20
                If (0.0 = local3\Field4) Then
                    If (((0.0 < local3\Field19\Field39) And (5.0 > local3\Field19\Field39)) <> 0) Then
                        For local20 = $00 To $01 Step $01
                            openclosedoor(local3\Field19\Field25[local20], $01, $00)
                            playsoundex(snd_i\Field52, camera, local3\Field19\Field25[local20]\Field51, 3.5, 1.0, $00, $00)
                            local3\Field19\Field25[local20]\Field21 = $01
                        Next
                        tformpoint(-352.0, 128.0, 0.0, local3\Field19\Field15, $00)
                        If (n_i\Field10 <> Null) Then
                            positionentity(n_i\Field10\Field82, tformedx(), tformedy(), tformedz(), $00)
                            resetentity(n_i\Field10\Field82)
                        Else
                            n_i\Field10 = createnpc($06, tformedx(), tformedy(), tformedz())
                            giveachievement("096", $01)
                        EndIf
                        n_i\Field10\Field66 = 6.0
                        n_i\Field10\Field65 = 700.0
                        rotateentity(n_i\Field10\Field82, 0.0, ((Float local3\Field19\Field21) + 270.0), 0.0, $01)
                        loadeventsound(local3, "SFX\Character\Guard\096ServerRoom0.ogg", $00)
                        local3\Field2 = playsoundex(local3\Field0, camera, n_i\Field10\Field98, 12.0, 1.0, $01, $00)
                        tformpoint(-1328.0, 128.0, 528.0, local3\Field19\Field15, $00)
                        local3\Field19\Field32[$00] = createnpc($17, tformedx(), tformedy(), tformedz())
                        giveachievement("096", $01)
                        local3\Field4 = 1.0
                    EndIf
                ElseIf (3150.0 > local3\Field4) Then
                    If (((rand($32, $01) = $01) And (playerroom = local3\Field19)) <> 0) Then
                        XZ0260X8X2\Field8 = rnd(1.0, 2.0)
                        If (rand($05, $01) = $01) Then
                            playsoundex(snd_i\Field5[rand($00, $02)], camera, local3\Field19\Field15, 8.0, rnd(0.1, 0.3), $00, $00)
                        EndIf
                    EndIf
                    local3\Field4 = min((local3\Field4 + fps\Field3[$00]), 2800.0)
                    If (local3\Field19\Field32[$00] <> Null) Then
                        n_i\Field10\Field59 = local3\Field19\Field32[$00]
                        If (560.0 > local3\Field4) Then
                            animatenpc(n_i\Field10, 472.0, 520.0, 0.25, $01)
                            pointentity(local3\Field19\Field32[$00]\Field82, n_i\Field10\Field82, 0.0)
                        ElseIf (((560.0 <= local3\Field4) And (700.0 > local3\Field4)) <> 0) Then
                            If (entitydistancesquared(XZ0260X8X2\Field74, local3\Field19\Field25[$01]\Field51) > entitydistancesquared(XZ0260X8X2\Field74, local3\Field19\Field25[$00]\Field51)) Then
                                animatenpc(n_i\Field10, 521.0, 555.0, 0.25, $00)
                                If (554.5 <= n_i\Field10\Field103) Then
                                    setnpcframe(n_i\Field10, 677.0, $01)
                                    n_i\Field10\Field66 = 2.0
                                    turnentity(n_i\Field10\Field82, 0.0, 180.0, 0.0, $00)
                                    moveentity(n_i\Field10\Field82, 0.0, 0.0, 0.3, $00)
                                    local3\Field4 = 700.0
                                EndIf
                            Else
                                animatenpc(n_i\Field10, 556.0, 590.0, 0.25, $00)
                                If (589.5 <= n_i\Field10\Field103) Then
                                    setnpcframe(n_i\Field10, 677.0, $01)
                                    n_i\Field10\Field66 = 2.0
                                    turnentity(n_i\Field10\Field82, 0.0, 180.0, 0.0, $00)
                                    moveentity(n_i\Field10\Field82, 0.0, 0.0, 0.3, $00)
                                    local3\Field4 = 700.0
                                EndIf
                            EndIf
                            pointentity(local3\Field19\Field32[$00]\Field82, n_i\Field10\Field82, 0.0)
                        ElseIf (((700.0 <= local3\Field4) And (1400.0 > local3\Field4)) <> 0) Then
                            n_i\Field10\Field66 = clamp(n_i\Field10\Field66, 2.0, 4.0)
                            n_i\Field10\Field65 = max(n_i\Field10\Field65, 840.0)
                            If (1050.0 >= (local3\Field4 - fps\Field3[$00])) Then
                                If (1050.0 < local3\Field4) Then
                                    local3\Field19\Field32[$00]\Field66 = 14.0
                                    local3\Field19\Field32[$00]\Field30 = findpath(local3\Field19\Field32[$00], entityx(n_i\Field10\Field82, $01, 1.0), 0.4, entityz(n_i\Field10\Field82, $01, 1.0))
                                    local3\Field19\Field32[$00]\Field8 = 300.0
                                Else
                                    pointentity(local3\Field19\Field32[$00]\Field82, n_i\Field10\Field82, 0.0)
                                EndIf
                            EndIf
                            If (entityvisible(local3\Field19\Field32[$00]\Field82, n_i\Field10\Field82, 0.0) <> 0) Then
                                local3\Field19\Field32[$00]\Field66 = 13.0
                                pointentity(local3\Field19\Field32[$00]\Field98, n_i\Field10\Field82, 0.0)
                                rotateentity(local3\Field19\Field32[$00]\Field82, 0.0, curveangle(entityyaw(local3\Field19\Field32[$00]\Field98, $00, 1.0), entityyaw(local3\Field19\Field32[$00]\Field82, $00, 1.0), 30.0), 0.0, $00)
                            EndIf
                        ElseIf (5.0 = n_i\Field10\Field66) Then
                            n_i\Field10\Field17 = $01
                            local3\Field19\Field32[$00]\Field66 = 2.0
                            pointentity(local3\Field19\Field32[$00]\Field98, n_i\Field10\Field82, 0.0)
                            rotateentity(local3\Field19\Field32[$00]\Field82, 0.0, curveangle(entityyaw(local3\Field19\Field32[$00]\Field98, $00, 1.0), entityyaw(local3\Field19\Field32[$00]\Field82, $00, 1.0), 30.0), 0.0, $00)
                            If (playerroom = local3\Field19) Then
                                XZ0260X8X2\Field8 = (local3\Field19\Field32[$00]\Field62 + rnd(0.5, 2.0))
                            EndIf
                            n_i\Field10\Field59 = local3\Field19\Field32[$00]
                        Else
                            If (1540.0 < local3\Field4) Then
                                n_i\Field10\Field66 = 5.0
                            EndIf
                            If (13.0 = local3\Field19\Field32[$00]\Field66) Then
                                local3\Field19\Field32[$00]\Field66 = 14.0
                                local3\Field19\Field32[$00]\Field30 = findpath(local3\Field19\Field32[$00], entityx(local3\Field19\Field15, $01, 1.0), 0.4, entityz(local3\Field19\Field15, $01, 1.0))
                                local3\Field19\Field32[$00]\Field8 = 300.0
                                local3\Field19\Field32[$00]\Field32 = (local3\Field19\Field32[$00]\Field32 * 1.5)
                            EndIf
                        EndIf
                        If (((25.0 < n_i\Field10\Field103) And (150.0 > n_i\Field10\Field103)) <> 0) Then
                            loadeventsound(local3, "SFX\Character\Guard\096ServerRoom1.ogg", $00)
                            local3\Field2 = playsoundex(local3\Field0, camera, n_i\Field10\Field98, 12.0, 1.0, $01, $00)
                            changenpctextureid(n_i\Field10, $0F)
                            n_i\Field10\Field64 = 0.0
                            For local20 = $00 To $06 Step $01
                                If (((0.0 = (Float local3\Field19\Field21)) Lor (180.0 = (Float local3\Field19\Field21))) <> 0) Then
                                    local49 = ((rnd(197.0, 199.0) * cos((Float local3\Field19\Field21))) * (1.0 / 256.0))
                                    local5 = createdecal(rand($02, $03), (local3\Field19\Field40 - local49), (local3\Field19\Field3 + 1.0), (local3\Field19\Field37 + ((140.0 * (Float (local20 - $03))) * (1.0 / 256.0))), 0.0, ((Float local3\Field19\Field21) + 90.0), rnd(360.0, 0.0), rnd(0.8, 0.85), 1.0, $00, $01, $00, $00, $00)
                                    local5\Field14 = 0.001
                                    entityparent(local5\Field0, local3\Field19\Field15, $01)
                                    local5 = createdecal(rand($02, $03), (local3\Field19\Field40 - local49), (local3\Field19\Field3 + 1.0), (local3\Field19\Field37 + ((140.0 * (Float (local20 - $03))) * (1.0 / 256.0))), 0.0, ((Float local3\Field19\Field21) - 90.0), rnd(360.0, 0.0), rnd(0.8, 0.85), 1.0, $00, $01, $00, $00, $00)
                                    local5\Field14 = 0.001
                                    entityparent(local5\Field0, local3\Field19\Field15, $01)
                                Else
                                    local48 = (((rnd(197.0, 199.0) * sin((Float local3\Field19\Field21))) * (1.0 / 256.0)) - rnd(0.001, 0.003))
                                    local5 = createdecal(rand($02, $03), (local3\Field19\Field40 + ((140.0 * (Float (local20 - $03))) * (1.0 / 256.0))), (local3\Field19\Field3 + 1.0), (local3\Field19\Field37 - local48), 0.0, ((Float local3\Field19\Field21) + 90.0), rnd(360.0, 0.0), rnd(0.8, 0.85), 1.0, $00, $01, $00, $00, $00)
                                    local5\Field14 = 0.001
                                    entityparent(local5\Field0, local3\Field19\Field15, $01)
                                    local5 = createdecal(rand($02, $03), (local3\Field19\Field40 + ((140.0 * (Float (local20 - $03))) * (1.0 / 256.0))), (local3\Field19\Field3 + 1.0), (local3\Field19\Field37 - local48), 0.0, ((Float local3\Field19\Field21) - 90.0), rnd(360.0, 0.0), rnd(0.8, 0.85), 1.0, $00, $01, $00, $00, $00)
                                    local5\Field14 = 0.001
                                    entityparent(local5\Field0, local3\Field19\Field15, $01)
                                EndIf
                                local5 = createdecal(rand($02, $03), (entityx(local3\Field19\Field32[$00]\Field82, $00, 1.0) + rnd(-2.0, 2.0)), (local3\Field19\Field3 + 0.005), (entityz(local3\Field19\Field32[$00]\Field82, $00, 1.0) + rnd(-2.0, 2.0)), 90.0, rnd(360.0, 0.0), 0.0, 1.0, 1.0, $00, $01, $00, $00, $00)
                                entityparent(local5\Field0, local3\Field19\Field15, $01)
                            Next
                            local5 = createdecal(rand($02, $03), entityx(local3\Field19\Field32[$00]\Field82, $00, 1.0), (local3\Field19\Field3 + 0.005), entityz(local3\Field19\Field32[$00]\Field82, $00, 1.0), 90.0, rnd(360.0, 0.0), 0.0, 1.0, 1.0, $00, $01, $00, $00, $00)
                            entityparent(local5\Field0, local3\Field19\Field15, $01)
                            stopstream_strict(n_i\Field10\Field63)
                            n_i\Field10\Field63 = $00
                            n_i\Field10\Field94 = $00
                            showentity(local3\Field19\Field27[$00])
                            local11 = createitem("Bloody Level 3 Key Card", $5C, entityx(local3\Field19\Field32[$00]\Field82, $00, 1.0), (entityy(local3\Field19\Field32[$00]\Field82, $00, 1.0) + 0.1), entityz(local3\Field19\Field32[$00]\Field82, $00, 1.0), $00, $00, $00, 1.0, $00)
                            entitytype(local11\Field9, $03, $00)
                            removenpc(local3\Field19\Field32[$00])
                            local3\Field19\Field32[$00] = Null
                            n_i\Field10\Field66 = 1.0
                        EndIf
                    Else
                        If (((2450.0 <= local3\Field4) And (2450.0 > (local3\Field4 - fps\Field3[$00]))) <> 0) Then
                            For local20 = $00 To $01 Step $01
                                openclosedoor(local3\Field19\Field25[local20], $01, $00)
                                playsoundex(snd_i\Field26, camera, local3\Field19\Field25[local20]\Field51, 3.5, 1.0, $00, $00)
                            Next
                            If (local3\Field0 <> $00) Then
                                freesound_strict(local3\Field0)
                                local3\Field0 = $00
                            EndIf
                            For local17 = Each screens
                                If (local17\Field12\Field22\Field21 <> $2B) Then
                                    local17\Field9 = $01
                                EndIf
                            Next
                        EndIf
                        If (playerroom = local3\Field19) Then
                            If (ChannelPlaying(local3\Field2) <> 0) Then
                                XZ0260X8X2\Field8 = rnd(0.5, 6.0)
                                If (rand($32, $01) = $01) Then
                                    playsoundex(snd_i\Field5[rand($00, $02)], camera, local3\Field19\Field15, 8.0, rnd(0.1, 0.3), $00, $00)
                                EndIf
                            EndIf
                            If (((0.0 = (Float local3\Field19\Field21)) Lor (180.0 = (Float local3\Field19\Field21))) <> 0) Then
                                If (1.12 < (Abs (entityx(XZ0260X8X2\Field74, $00, 1.0) - entityx(local3\Field19\Field15, $01, 1.0)))) Then
                                    If (((2.0 < entitydistancesquared(XZ0260X8X2\Field74, local3\Field19\Field25[$00]\Field51)) And (2.0 < entitydistancesquared(XZ0260X8X2\Field74, local3\Field19\Field25[$01]\Field51))) <> 0) Then
                                        If (local3\Field0 <> $00) Then
                                            freesound_strict(local3\Field0)
                                            local3\Field0 = $00
                                        EndIf
                                        local3\Field4 = 3150.0
                                    EndIf
                                EndIf
                            ElseIf (1.12 < (Abs (entityz(XZ0260X8X2\Field74, $00, 1.0) - entityz(local3\Field19\Field15, $01, 1.0)))) Then
                                If (((2.0 < entitydistancesquared(XZ0260X8X2\Field74, local3\Field19\Field25[$00]\Field51)) And (2.0 < entitydistancesquared(XZ0260X8X2\Field74, local3\Field19\Field25[$01]\Field51))) <> 0) Then
                                    If (local3\Field0 <> $00) Then
                                        freesound_strict(local3\Field0)
                                        local3\Field0 = $00
                                    EndIf
                                    local3\Field4 = 3150.0
                                EndIf
                            EndIf
                        EndIf
                    EndIf
                    updatesoundorigin(local3\Field2, camera, n_i\Field10\Field98, 12.0, 1.0, $01, $01, $00)
                ElseIf (playerroom = local3\Field19) Then
                    local23 = updatelever(local3\Field19\Field9[$00]\Field1, $00, $50, -80.0)
                    local34 = (Float updatelever(local3\Field19\Field9[$01]\Field1, $00, $50, -80.0))
                    local36 = (Float updatelever(local3\Field19\Field9[$02]\Field1, $00, $50, -80.0))
                    If ((Int local34) <> 0) Then
                        local3\Field7 = min(1.0, (local3\Field7 + (fps\Field3[$00] / 350.0)))
                        If ((Int local36) <> 0) Then
                            If (local3\Field30 = $00) Then
                                local3\Field30 = loadsound_strict("SFX\Room\GeneratorOn.ogg")
                            EndIf
                            local3\Field1 = min(1.0, (local3\Field1 + (fps\Field3[$00] / 450.0)))
                        Else
                            local3\Field1 = min(0.0, (local3\Field1 - (fps\Field3[$00] / 450.0)))
                        EndIf
                    Else
                        local3\Field7 = max(0.0, (local3\Field7 - (fps\Field3[$00] / 350.0)))
                        local3\Field1 = max(0.0, (local3\Field1 - (fps\Field3[$00] / 450.0)))
                    EndIf
                    If (0.0 < local3\Field7) Then
                        local3\Field2 = loopsoundex(roomambience[$07], local3\Field2, camera, local3\Field19\Field9[$02]\Field0, 5.0, (local3\Field7 * 0.8), $00)
                    EndIf
                    If (0.0 < local3\Field1) Then
                        local3\Field8 = loopsoundex(local3\Field30, local3\Field8, camera, local3\Field19\Field9[$01]\Field0, 6.0, local3\Field1, $00)
                    EndIf
                    If (((local23 And (Int local34)) And (Int local36)) <> 0) Then
                        For local20 = $00 To $01 Step $01
                            local3\Field19\Field25[local20]\Field21 = $00
                        Next
                    Else
                        If (rand($32, $01) = $01) Then
                            XZ0260X8X2\Field8 = rnd(0.5, 1.0)
                        EndIf
                        For local20 = $00 To $01 Step $01
                            If (local3\Field19\Field25[local20]\Field39 <> 0) Then
                                openclosedoor(local3\Field19\Field25[local20], $01, $00)
                                local3\Field19\Field25[local20]\Field21 = $01
                            EndIf
                        Next
                    EndIf
                EndIf
            Case $0B
                If (playerroom = local3\Field19) Then
                    If (0.0 >= local3\Field7) Then
                        local3\Field19\Field25[$01]\Field21 = $00
                        local3\Field19\Field25[$04]\Field21 = $00
                        If (((64.0 > entitydistancesquared(local3\Field19\Field15, n_i\Field3\Field82)) Lor (64.0 > entitydistancesquared(local3\Field19\Field15, n_i\Field2\Field82))) <> 0) Then
                            local3\Field19\Field25[$01]\Field21 = $01
                            local3\Field19\Field25[$01]\Field39 = $00
                            local3\Field19\Field25[$04]\Field21 = $01
                            local3\Field19\Field25[$04]\Field39 = $00
                        EndIf
                        For local1 = Each npcs
                            If (local1\Field77 = $18) Then
                                If (36.0 > entitydistancesquared(local1\Field82, local3\Field19\Field15)) Then
                                    local3\Field19\Field25[$01]\Field21 = $01
                                    local3\Field19\Field25[$01]\Field39 = $00
                                    local3\Field19\Field25[$04]\Field21 = $01
                                    local3\Field19\Field25[$04]\Field39 = $00
                                    Exit
                                EndIf
                            EndIf
                        Next
                        local3\Field7 = 175.0
                    Else
                        local3\Field7 = (local3\Field7 - fps\Field3[$00])
                    EndIf
                    tformpoint(entityx(XZ0260X8X2\Field74, $00, 1.0), entityy(XZ0260X8X2\Field74, $00, 1.0), entityz(XZ0260X8X2\Field74, $00, 1.0), $00, local3\Field19\Field15)
                    If (0.0 = local3\Field19\Field25[$01]\Field13) Then
                        If (entityhidden(local3\Field19\Field27[$00]) = $00) Then
                            hideentity(local3\Field19\Field27[$00])
                        EndIf
                        hideentity(local3\Field19\Field25[$00]\Field0)
                        hideentity(local3\Field19\Field25[$00]\Field40[$01])
                        hideentity(local3\Field19\Field25[$00]\Field51)
                    Else
                        If (entityhidden(local3\Field19\Field27[$00]) <> 0) Then
                            showentity(local3\Field19\Field27[$00])
                        EndIf
                        showentity(local3\Field19\Field25[$00]\Field0)
                        showentity(local3\Field19\Field25[$00]\Field40[$01])
                        showentity(local3\Field19\Field25[$00]\Field51)
                    EndIf
                    If (0.0 = local3\Field19\Field25[$04]\Field13) Then
                        If (entityhidden(local3\Field19\Field27[$01]) = $00) Then
                            hideentity(local3\Field19\Field27[$01])
                        EndIf
                        hideentity(local3\Field19\Field25[$05]\Field0)
                        hideentity(local3\Field19\Field25[$05]\Field40[$01])
                        hideentity(local3\Field19\Field25[$05]\Field51)
                    Else
                        If (entityhidden(local3\Field19\Field27[$01]) <> 0) Then
                            showentity(local3\Field19\Field27[$01])
                        EndIf
                        showentity(local3\Field19\Field25[$05]\Field0)
                        showentity(local3\Field19\Field25[$05]\Field40[$01])
                        showentity(local3\Field19\Field25[$05]\Field51)
                    EndIf
                    If (8.0 > local3\Field4) Then
                        If (entityhidden(local3\Field19\Field27[$02]) = $00) Then
                            hideentity(local3\Field19\Field27[$02])
                        EndIf
                    ElseIf (entityhidden(local3\Field19\Field27[$02]) <> 0) Then
                        showentity(local3\Field19\Field27[$02])
                    EndIf
                    local23 = $00
                    If (730.0 < tformedx()) Then
                        giveachievement("970", $01)
                        XZ0260X8X2\Field53 = -10.0
                        updateworld(1.0, 0.0)
                        tformpoint(entityx(XZ0260X8X2\Field74, $00, 1.0), entityy(XZ0260X8X2\Field74, $00, 1.0), entityz(XZ0260X8X2\Field74, $00, 1.0), $00, local3\Field19\Field15)
                        For local20 = $01 To $02 Step $01
                            local102 = local3\Field19\Field25[(local20 + $02)]
                            local103 = local3\Field19\Field25[local20]
                            local103\Field39 = local102\Field39
                            local103\Field13 = local102\Field13
                            entityparent(local103\Field0, local103\Field51, $01)
                            entityparent(local102\Field0, local102\Field51, $01)
                            entityparent(local103\Field7, local103\Field51, $01)
                            entityparent(local102\Field7, local102\Field51, $01)
                            positionentity(local103\Field0, entityx(local102\Field0, $00, 1.0), entityy(local102\Field0, $00, 1.0), entityz(local102\Field0, $00, 1.0), $00)
                            positionentity(local103\Field7, entityx(local102\Field7, $00, 1.0), entityy(local102\Field7, $00, 1.0), entityz(local102\Field7, $00, 1.0), $00)
                            entityparent(local103\Field0, $00, $01)
                            entityparent(local102\Field0, $00, $01)
                            entityparent(local103\Field7, $00, $01)
                            entityparent(local102\Field7, $00, $01)
                            local102\Field39 = $00
                            local102\Field13 = 0.0
                        Next
                        tformpoint((tformedx() - 1024.0), tformedy(), tformedz(), local3\Field19\Field15, $00)
                        positionentity(XZ0260X8X2\Field74, tformedx(), entityy(XZ0260X8X2\Field74, $00, 1.0), tformedz(), $01)
                        resetentity(XZ0260X8X2\Field74)
                        resetrender()
                        local23 = $01
                    ElseIf (-730.0 > tformedx()) Then
                        giveachievement("970", $01)
                        XZ0260X8X2\Field53 = -10.0
                        updateworld(1.0, 0.0)
                        tformpoint(entityx(XZ0260X8X2\Field74, $00, 1.0), entityy(XZ0260X8X2\Field74, $00, 1.0), entityz(XZ0260X8X2\Field74, $00, 1.0), $00, local3\Field19\Field15)
                        For local20 = $01 To $02 Step $01
                            local102 = local3\Field19\Field25[local20]
                            local103 = local3\Field19\Field25[(local20 + $02)]
                            local103\Field39 = local102\Field39
                            local103\Field13 = local102\Field13
                            entityparent(local103\Field0, local103\Field51, $01)
                            entityparent(local102\Field0, local102\Field51, $01)
                            entityparent(local103\Field7, local103\Field51, $01)
                            entityparent(local102\Field7, local102\Field51, $01)
                            positionentity(local103\Field0, entityx(local102\Field0, $00, 1.0), entityy(local102\Field0, $00, 1.0), entityz(local102\Field0, $00, 1.0), $00)
                            positionentity(local103\Field7, entityx(local102\Field7, $00, 1.0), entityy(local102\Field7, $00, 1.0), entityz(local102\Field7, $00, 1.0), $00)
                            entityparent(local103\Field0, $00, $01)
                            entityparent(local102\Field0, $00, $01)
                            entityparent(local103\Field7, $00, $01)
                            entityparent(local102\Field7, $00, $01)
                            local102\Field39 = $00
                            local102\Field13 = 0.0
                        Next
                        tformpoint((tformedx() + 1024.0), tformedy(), tformedz(), local3\Field19\Field15, $00)
                        positionentity(XZ0260X8X2\Field74, tformedx(), entityy(XZ0260X8X2\Field74, $00, 1.0), tformedz(), $01)
                        resetentity(XZ0260X8X2\Field74)
                        resetrender()
                        local23 = $01
                    EndIf
                    If (local23 <> 0) Then
                        local3\Field4 = (local3\Field4 + 1.0)
                        For local11 = Each items
                            If (25.0 > entitydistancesquared(local11\Field9, XZ0260X8X2\Field74)) Then
                                tformpoint(entityx(local11\Field9, $00, 1.0), entityy(local11\Field9, $00, 1.0), entityz(local11\Field9, $00, 1.0), $00, local3\Field19\Field15)
                                local34 = tformedx()
                                local35 = tformedy()
                                local36 = tformedz()
                                If (((-290.0 <= local36) And (560.0 >= local36)) <> 0) Then
                                    If (((264.0 <= local34) And (760.0 >= local34)) <> 0) Then
                                        tformpoint((local34 - 1024.0), local35, local36, local3\Field19\Field15, $00)
                                        positionentity(local11\Field9, tformedx(), tformedy(), tformedz(), $01)
                                        resetentity(local11\Field9)
                                    ElseIf (((-264.0 >= local34) And (-760.0 <= local34)) <> 0) Then
                                        tformpoint((local34 + 1024.0), local35, local36, local3\Field19\Field15, $00)
                                        positionentity(local11\Field9, tformedx(), tformedy(), tformedz(), $01)
                                        resetentity(local11\Field9)
                                    EndIf
                                EndIf
                            EndIf
                        Next
                        Select local3\Field4
                            Case 1.0
                                If (key2_spawnrate = $05) Then
                                    tformpoint(-354.0, 220.0, 516.0, local3\Field19\Field15, $00)
                                    local11 = createitem("White Key", $68, tformedx(), tformedy(), tformedz(), $00, $00, $00, 1.0, $00)
                                    entitytype(local11\Field9, $03, $00)
                                EndIf
                            Case 2.0
                                local20 = rand($00, (maxitemamount - $01))
                                If (TX60DB8XBBZ(local20) <> Null) Then
                                    createmsg(getlocalstring("msg", "970.item.missing"), 6.0)
                                    removewearableitems(TX60DB8XBBZ(local20))
                                    removeitem(TX60DB8XBBZ(local20), $01)
                                EndIf
                            Case 5.0
                                XZ0260X8X2\Field11 = (XZ0260X8X2\Field11 + 0.3)
                                createmsg(getlocalstring("msg", "970.sharp"), 6.0)
                            Case 10.0
                                local5 = createdecal($03, (local3\Field19\Field40 + ((cos(((Float local3\Field19\Field21) - 90.0)) * 760.0) * (1.0 / 256.0))), (local3\Field19\Field3 + 0.005), (local3\Field19\Field37 + ((sin(((Float local3\Field19\Field21) - 90.0)) * 760.0) * (1.0 / 256.0))), 90.0, rnd(360.0, 0.0), 0.0, 1.0, 1.0, $00, $01, $00, $00, $00)
                                entityparent(local5\Field0, local3\Field19\Field15, $01)
                            Case 14.0
                                local22 = $00
                                For local20 = $00 To (maxitemamount - $01) Step $01
                                    If (TX60DB8XBBZ(local20) <> Null) Then
                                        If (TX60DB8XBBZ(local20)\Field6\Field9 = $00) Then
                                            removeitem(TX60DB8XBBZ(local20), $01)
                                            local22 = $01
                                            Exit
                                        EndIf
                                    EndIf
                                Next
                                If (local22 <> 0) Then
                                    local11 = createitem(getranddocument(), $00, 0.0, 0.0, 0.0, $00, $00, $00, 1.0, $00)
                                    entitytype(local11\Field9, $03, $00)
                                    pickitem(local11, $00)
                                EndIf
                            Case 18.0
                                tformpoint(-344.0, 176.0, 272.0, local3\Field19\Field15, $00)
                                local11 = createitem("Strange Note", $00, tformedx(), tformedy(), tformedz(), $00, $00, $00, 1.0, $00)
                                entitytype(local11\Field9, $03, $00)
                            Case 25.0
                                local3\Field19\Field32[$00] = createnpc($16, (local3\Field19\Field40 + ((cos(((Float local3\Field19\Field21) - 90.0)) * 760.0) * (1.0 / 256.0))), (local3\Field19\Field3 + 0.2), (local3\Field19\Field37 + ((sin(((Float local3\Field19\Field21) - 90.0)) * 760.0) * (1.0 / 256.0))))
                                local3\Field19\Field32[$00]\Field57 = -1.0
                                local3\Field19\Field32[$00]\Field1 = $01
                                rotateentity(local3\Field19\Field32[$00]\Field82, 0.0, ((Float local3\Field19\Field21) - 200.0), 0.0, $01)
                                changenpctextureid(local3\Field19\Field32[$00], $01)
                                setnpcframe(local3\Field19\Field32[$00], 80.0, $01)
                            Case 30.0
                                local20 = rand($00, (maxitemamount - $01))
                                If (TX60DB8XBBZ(local20) <> Null) Then
                                    removewearableitems(TX60DB8XBBZ(local20))
                                    removeitem(TX60DB8XBBZ(local20), $01)
                                EndIf
                                local11 = createitem("Strange Note", $00, 0.0, 0.0, 0.0, $00, $00, $00, 1.0, $00)
                                entitytype(local11\Field9, $03, $00)
                                pickitem(local11, $00)
                            Case 33.0,34.0,35.0
                                local5 = createdecal($07, (local3\Field19\Field40 + rnd(-2.0, 2.0)), (local3\Field19\Field3 + 2.734375), (local3\Field19\Field37 + rnd(-2.0, 2.0)), 270.0, rnd(360.0, 0.0), 0.0, 0.05, 1.0, $00, $01, $00, $00, $00)
                                local5\Field14 = 0.0005
                                entityparent(local5\Field0, local3\Field19\Field15, $01)
                            Case 40.0
                                local3\Field8 = playsound_strict(loadtempsound("SFX\Radio\Franklin3.ogg"), $01, $00)
                            Case 50.0
                                local3\Field19\Field32[$01] = createnpc($17, (local3\Field19\Field40 + ((cos(((Float local3\Field19\Field21) + 90.0)) * 600.0) * (1.0 / 256.0))), 0.35, (local3\Field19\Field37 + ((sin(((Float local3\Field19\Field21) + 90.0)) * 600.0) * (1.0 / 256.0))))
                                local3\Field19\Field32[$01]\Field66 = 7.0
                            Case 52.0
                                removenpc(local3\Field19\Field32[$01])
                            Case 60.0
                                If (n_i\Field12 = $00) Then
                                    local28 = loadtexture_strict("GFX\NPCs\scp_173_H.png", $01, $00, 1.0)
                                    entitytexture(n_i\Field3\Field98, local28, $00, $00)
                                    entitytexture(n_i\Field3\Field101, local28, $00, $00)
                                    deletesingletextureentryfromcache(local28, $00)
                                    local28 = $00
                                EndIf
                        End Select
                        If (rand($0A, $01) = $01) Then
                            local20 = rand($00, $02)
                            playsound_strict(XB4XFDZ8DD(local20, rand($00, (ambientsfxamount[local20] - $01))), $00, $00)
                        EndIf
                    Else
                        If (local3\Field19\Field32[$00] <> Null) Then
                            If (9.0 > entitydistancesquared(XZ0260X8X2\Field74, local3\Field19\Field32[$00]\Field82)) Then
                                If (entityinview(local3\Field19\Field32[$00]\Field98, camera) <> 0) Then
                                    XZ0260X8X2\Field51 = ((sin(((Float millisec) / 20.0)) + 1.0) * 15.0)
                                    XZ0260X8X2\Field87 = max(curvevalue(0.3, XZ0260X8X2\Field87, 2.0), XZ0260X8X2\Field87)
                                    XZ0260X8X2\Field62 = max(XZ0260X8X2\Field62, 120.0)
                                EndIf
                            EndIf
                        EndIf
                        If (local3\Field19\Field32[$01] <> Null) Then
                            pointentity(local3\Field19\Field32[$01]\Field98, XZ0260X8X2\Field74, 0.0)
                            rotateentity(local3\Field19\Field32[$01]\Field82, 0.0, curveangle(entityyaw(local3\Field19\Field32[$01]\Field98, $00, 1.0), entityyaw(local3\Field19\Field32[$01]\Field82, $00, 1.0), 35.0), 0.0, $00)
                        EndIf
                        For local11 = Each items
                            If (((local11\Field30 = $01) Lor (local11\Field30 = $FFFFFFFF)) <> 0) Then
                                tformpoint(entityx(local11\Field9, $00, 1.0), entityy(local11\Field9, $00, 1.0), entityz(local11\Field9, $00, 1.0), $00, local3\Field19\Field15)
                                local34 = tformedx()
                                local35 = tformedy()
                                local36 = tformedz()
                                If (((local11\Field30 = $01) And (264.0 > (Abs local34))) <> 0) Then
                                    For local20 = $FFFFFFFF To $01 Step $02
                                        tformpoint(((1024.0 * (Float local20)) + local34), local35, local36, local3\Field19\Field15, $00)
                                        local12 = createitem(local11\Field6\Field19, local11\Field6\Field9, tformedx(), entityy(local11\Field9, $00, 1.0), tformedz(), local11\Field16, local11\Field14, local11\Field38, local11\Field1, $00)
                                        local12\Field19 = local11\Field19
                                        local12\Field15 = local11\Field15
                                        local12\Field3 = local11\Field3
                                        local12\Field39 = local11\Field39
                                        If (local11\Field36 > $00) Then
                                            local12\Field36 = local11\Field36
                                            For local21 = $00 To (local11\Field36 - $01) Step $01
                                                local12\Field8[local21] = local11\Field8[local21]
                                            Next
                                            setanimtime(local12\Field5, animtime(local11\Field5), $00)
                                            local12\Field20 = local11\Field20
                                        EndIf
                                        rotateentity(local12\Field9, entitypitch(local11\Field9, $00, 1.0), entityyaw(local11\Field9, $00, 1.0), 0.0, $00)
                                        entitytype(local12\Field9, $03, $00)
                                    Next
                                ElseIf (local11\Field30 = $FFFFFFFF) Then
                                    For local12 = Each items
                                        If ((((local12 <> local11) And (225.0 > local12\Field44)) And (local12\Field6 = local11\Field6)) <> 0) Then
                                            tformpoint(entityx(local12\Field9, $00, 1.0), entityy(local12\Field9, $00, 1.0), entityz(local12\Field9, $00, 1.0), $00, local3\Field19\Field15)
                                            If (local36 = tformedz()) Then
                                                removeitem(local12, $01)
                                            EndIf
                                        EndIf
                                    Next
                                EndIf
                                Exit
                            EndIf
                        Next
                    EndIf
                Else
                    If (entityhidden(local3\Field19\Field27[$00]) = $00) Then
                        hideentity(local3\Field19\Field27[$00])
                    EndIf
                    If (entityhidden(local3\Field19\Field27[$01]) = $00) Then
                        hideentity(local3\Field19\Field27[$01])
                    EndIf
                    If (entityhidden(local3\Field19\Field27[$02]) = $00) Then
                        hideentity(local3\Field19\Field27[$02])
                    EndIf
                EndIf
                If (25.0 < local3\Field4) Then
                    If (8.0 > local3\Field19\Field39) Then
                        If (local3\Field0 = $00) Then
                            local3\Field0 = loadsound_strict("SFX\SCP\970\Corpse.ogg")
                        EndIf
                        local3\Field2 = loopsoundex(local3\Field0, local3\Field2, camera, local3\Field19\Field32[$00]\Field98, 10.0, 1.0, $00)
                        If (60.0 < local3\Field4) Then
                            animatenpc(local3\Field19\Field32[$00], 80.0, 61.0, -0.02, $00)
                            local3\Field19\Field32[$00]\Field70 = 0.0
                            local35 = curvevalue(((sin(((Float millisec) / 20.0)) * 0.1) + 1.5), entityy(local3\Field19\Field32[$00]\Field82, $00, 1.0), 50.0)
                            positionentity(local3\Field19\Field32[$00]\Field82, entityx(local3\Field19\Field32[$00]\Field82, $00, 1.0), local35, entityz(local3\Field19\Field32[$00]\Field82, $00, 1.0), $00)
                            turnentity(local3\Field19\Field32[$00]\Field82, 0.0, (fps\Field3[$00] * 0.1), 0.0, $00)
                            If (61.1 > local3\Field19\Field32[$00]\Field103) Then
                                If (local3\Field19\Field17[$00] = Null) Then
                                    local3\Field19\Field17[$00] = setemitter(Null, entityx(local3\Field19\Field32[$00]\Field82, $00, 1.0), (entityy(local3\Field19\Field32[$00]\Field82, $00, 1.0) + 0.3), entityz(local3\Field19\Field32[$00]\Field82, $00, 1.0), $1B)
                                    entityparent(local3\Field19\Field17[$00]\Field2, local3\Field19\Field32[$00]\Field82, $01)
                                EndIf
                            EndIf
                        EndIf
                    EndIf
                EndIf
            Case $46
                If (playerroom = local3\Field19) Then
                    If (6.25 > entitydistancesquared(local3\Field19\Field15, XZ0260X8X2\Field74)) Then
                        For local16 = Each doors
                            If (4.0 > distancesquared(entityx(local16\Field51, $01, 1.0), entityx(XZ0260X8X2\Field74, $00, 1.0), entityz(local16\Field51, $01, 1.0), entityz(XZ0260X8X2\Field74, $00, 1.0), 0.0, 0.0)) Then
                                If (entityinview(local16\Field51, camera) = $00) Then
                                    If (local16\Field39 <> 0) Then
                                        local16\Field39 = $00
                                        local16\Field13 = 0.0
                                        XZ0260X8X2\Field64 = 100.0
                                        XZ0260X8X2\Field14 = 3.0
                                    EndIf
                                EndIf
                                Exit
                            EndIf
                        Next
                        removeevent(local3)
                    EndIf
                EndIf
            Case $3C
                If (playerroom = local3\Field19) Then
                    If (local3\Field19\Field27[$03] = $00) Then
                        tformpoint(928.0, -640.0, 704.0, local3\Field19\Field15, $00)
                        local3\Field19\Field27[$03] = copyentity(n_i\Field9[$1D], $00)
                        scaleentity(local3\Field19\Field27[$03], 0.07, 0.07, 0.07, $00)
                        positionentity(local3\Field19\Field27[$03], tformedx(), tformedy(), tformedz(), $00)
                        local28 = loadtexture_strict("GFX\NPCs\duck(2).png", $01, $00, 1.0)
                        entitytexture(local3\Field19\Field27[$03], local28, $00, $00)
                        deletesingletextureentryfromcache(local28, $00)
                        local28 = $00
                        entityparent(local3\Field19\Field27[$03], local3\Field19\Field15, $01)
                    Else
                        If ((((-12.0 < XZ0260X8X2\Field53) And (-8.0 > XZ0260X8X2\Field53)) Lor T8660BZ460\Field5) <> 0) Then
                            pointentity(local3\Field19\Field27[$03], XZ0260X8X2\Field74, 0.0)
                            rotateentity(local3\Field19\Field27[$03], 0.0, entityyaw(local3\Field19\Field27[$03], $01, 1.0), 0.0, $01)
                        EndIf
                        If (0.0 = local3\Field7) Then
                            local3\Field4 = curvevalue(0.0, local3\Field4, 15.0)
                            If (rand($320, $01) = $01) Then
                                local3\Field7 = 1.0
                            EndIf
                        Else
                            local3\Field4 = (local3\Field4 + (fps\Field3[$00] * 0.5))
                            If (360.0 < local3\Field4) Then
                                local3\Field4 = 0.0
                            EndIf
                            If (rand($4B0, $01) = $01) Then
                                local3\Field7 = 0.0
                            EndIf
                        EndIf
                        positionentity(local3\Field19\Field27[$03], entityx(local3\Field19\Field27[$03], $01, 1.0), ((sin((local3\Field4 + 270.0)) * 0.05) + -2.325), entityz(local3\Field19\Field27[$03], $01, 1.0), $01)
                    EndIf
                EndIf
            Case $12
                If (playerroom = local3\Field19) Then
                    local34 = entityx(XZ0260X8X2\Field74, $01, 1.0)
                    local35 = entityy(XZ0260X8X2\Field74, $01, 1.0)
                    local36 = entityz(XZ0260X8X2\Field74, $01, 1.0)
                    XZ0260X8X2\Field27 = (((isinsideelevator(local34, local35, local36, local3\Field19\Field27[$00]) Lor isinsideelevator(local34, local35, local36, local3\Field19\Field27[$01])) Lor isinsideelevator(local34, local35, local36, local3\Field19\Field27[$02])) Lor isinsideelevator(local34, local35, local36, local3\Field19\Field27[$03]))
                    toelevatorfloor = $FFFFFFFF
                    local3\Field7 = updateelevators(local3\Field7, local3\Field19\Field25[$00], local3\Field19\Field25[$01], local3\Field19\Field27[$00], local3\Field19\Field27[$01], local3, $01, $00)
                    local3\Field1 = updateelevators(local3\Field1, local3\Field19\Field25[$02], local3\Field19\Field25[$03], local3\Field19\Field27[$02], local3\Field19\Field27[$03], local3, $01, $00)
                    If (-17.96875 > entityy(XZ0260X8X2\Field74, $00, 1.0)) Then
                        XZ0260X8X2\Field10 = $00
                        local3\Field19\Field22\Field20 = $01
                        If (((T8660BZ460\Field3 = $00) And (T8660BZ460\Field10 = $00)) <> 0) Then
                            XZ0260X8X2\Field64 = min((XZ0260X8X2\Field64 + (fps\Field3[$00] * 1.05)), 1500.0)
                            If (500.0 <= XZ0260X8X2\Field64) Then
                                updatecough($3E8)
                            EndIf
                            If ((((1500.0 <= XZ0260X8X2\Field64) And (0.0 = XZ0260X8X2\Field52)) And (0.0 = XZ0260X8X2\Field48)) <> 0) Then
                                msg\Field8 = format(getlocalstring("death", "939.gas"), subjectname, "%s")
                                kill($00, $01, $00, $01)
                            EndIf
                        EndIf
                        shouldplay = $07
                        If (local3\Field19\Field32[$00] = Null) Then
                            For local20 = $00 To $03 Step $01
                                local3\Field19\Field32[local20] = createnpc($0D, 0.0, 0.0, 0.0)
                            Next
                            tformpoint(3372.0, -5580.8, 6294.0, local3\Field19\Field15, $00)
                            local37 = tformedx()
                            local38 = tformedy()
                            local39 = tformedz()
                            local3\Field19\Field32[$04] = createnpc($16, local37, local38, local39)
                            local3\Field19\Field32[$04]\Field57 = -1.0
                            local3\Field19\Field32[$04]\Field1 = $01
                            changenpctextureid(local3\Field19\Field32[$04], $1C)
                            setnpcframe(local3\Field19\Field32[$04], 40.0, $01)
                            rotateentity(local3\Field19\Field32[$04]\Field82, 0.0, ((Float local3\Field19\Field21) + 90.0), 0.0, $01)
                            For local20 = $00 To $02 Step $01
                                local1 = createnpc($15, (rnd(-0.2, 0.2) + local37), ((local3\Field19\Field3 - 22.0) + 0.05), (rnd(-0.2, 0.2) + local39))
                                rotateentity(local1\Field82, entitypitch(local1\Field82, $00, 1.0), rnd(360.0, 0.0), entityroll(local1\Field82, $00, 1.0), $00)
                            Next
                            tformpoint(1083.0, -5580.8, 989.0, local3\Field19\Field15, $00)
                            local37 = tformedx()
                            local38 = tformedy()
                            local39 = tformedz()
                            local3\Field19\Field32[$05] = createnpc($16, local37, local38, local39)
                            local3\Field19\Field32[$05]\Field57 = -1.0
                            local3\Field19\Field32[$05]\Field1 = $01
                            changenpctextureid(local3\Field19\Field32[$05], $1D)
                            setnpcframe(local3\Field19\Field32[$05], 19.0, $01)
                            rotateentity(local3\Field19\Field32[$05]\Field82, 0.0, (Float local3\Field19\Field21), 0.0, $01)
                            tformpoint(3194.0, -5632.0, 6386.0, local3\Field19\Field15, $00)
                            local1 = createnpc($15, tformedx(), (tformedy() + 0.05), tformedz())
                            local1\Field66 = 2.0
                            rotateentity(local1\Field82, entitypitch(local1\Field82, $00, 1.0), rnd(360.0, 0.0), entityroll(local1\Field82, $00, 1.0), $00)
                            tformpoint(3063.0, -5632.0, 1354.0, local3\Field19\Field15, $00)
                            local1 = createnpc($15, tformedx(), (tformedy() + 0.05), tformedz())
                            local1\Field66 = 2.0
                            rotateentity(local1\Field82, entitypitch(local1\Field82, $00, 1.0), rnd(360.0, 0.0), entityroll(local1\Field82, $00, 1.0), $00)
                            tformpoint(1188.0, -5632.0, 1114.0, local3\Field19\Field15, $00)
                            local1 = createnpc($15, tformedx(), (tformedy() + 0.05), tformedz())
                            local1\Field66 = 2.0
                            rotateentity(local1\Field82, entitypitch(local1\Field82, $00, 1.0), rnd(360.0, 0.0), entityroll(local1\Field82, $00, 1.0), $00)
                        Else
                            If (0.0 = local3\Field4) Then
                                positionentity(local3\Field19\Field32[$00]\Field82, entityx(local3\Field19\Field27[$04], $01, 1.0), (entityy(local3\Field19\Field27[$04], $01, 1.0) + 0.2), entityz(local3\Field19\Field27[$04], $01, 1.0), $00)
                                resetentity(local3\Field19\Field32[$00]\Field82)
                                local3\Field19\Field32[$00]\Field66 = 2.0
                                local3\Field19\Field32[$00]\Field65 = 5.0
                                local3\Field19\Field32[$00]\Field13 = $07
                                positionentity(local3\Field19\Field32[$01]\Field82, entityx(local3\Field19\Field27[$08], $01, 1.0), (entityy(local3\Field19\Field27[$08], $01, 1.0) + 0.2), entityz(local3\Field19\Field27[$08], $01, 1.0), $00)
                                resetentity(local3\Field19\Field32[$01]\Field82)
                                local3\Field19\Field32[$01]\Field66 = 2.0
                                local3\Field19\Field32[$01]\Field65 = 9.0
                                local3\Field19\Field32[$01]\Field13 = $0B
                                positionentity(local3\Field19\Field32[$02]\Field82, entityx(local3\Field19\Field27[$0C], $01, 1.0), (entityy(local3\Field19\Field27[$0C], $01, 1.0) + 0.2), entityz(local3\Field19\Field27[$0C], $01, 1.0), $00)
                                resetentity(local3\Field19\Field32[$02]\Field82)
                                local3\Field19\Field32[$02]\Field66 = 2.0
                                local3\Field19\Field32[$02]\Field65 = 13.0
                                local3\Field19\Field32[$02]\Field13 = $0F
                                positionentity(local3\Field19\Field32[$03]\Field82, entityx(local3\Field19\Field27[$06], $01, 1.0), (entityy(local3\Field19\Field27[$06], $01, 1.0) + 0.2), entityz(local3\Field19\Field27[$06], $01, 1.0), $00)
                                resetentity(local3\Field19\Field32[$03]\Field82)
                                local3\Field19\Field32[$03]\Field66 = 2.0
                                local3\Field19\Field32[$03]\Field65 = 7.0
                                local3\Field19\Field32[$03]\Field13 = $07
                                local3\Field4 = 1.0
                            EndIf
                            If (local3\Field19\Field25[$04]\Field39 = $00) Then
                                For local20 = $00 To $01 Step $01
                                    If (updatelever(local3\Field19\Field9[local20]\Field1, $00, $50, -80.0) <> 0) Then
                                        local3\Field19\Field25[$04]\Field39 = $01
                                        loadeventsound(local3, "SFX\Door\Door2OpenDistanced.ogg", $01)
                                        local3\Field8 = playsoundex(local3\Field30, camera, local3\Field19\Field25[$04]\Field0, 400.0, 1.0, $00, $00)
                                        Exit
                                    EndIf
                                Next
                            Else
                                For local20 = $00 To $01 Step $01
                                    updatelever(local3\Field19\Field9[local20]\Field1, $01, $50, -80.0)
                                    If (0.0 <= entitypitch(local3\Field19\Field9[local20]\Field1, $01, 1.0)) Then
                                        rotateentity(local3\Field19\Field9[local20]\Field1, -80.0, entityyaw(local3\Field19\Field9[local20]\Field1, $00, 1.0), 0.0, $00)
                                    EndIf
                                Next
                            EndIf
                            updatesoundorigin(local3\Field8, camera, local3\Field19\Field25[$04]\Field0, 400.0, 1.0, $00, $01, $00)
                            playerfallingpickdistance = 0.0
                            updatebutton(local3\Field19\Field27[$12])
                            If (((d_i\Field15 = local3\Field19\Field27[$12]) And TDD0Z6BXB6\Field7) <> 0) Then
                                createmsg(getlocalstring("msg", "elev.broken"), 6.0)
                                playsound_strict(buttonsfx[$01], $00, $00)
                                TDD0Z6BXB6\Field7 = $00
                            EndIf
                            rotateentity(local3\Field19\Field27[$11], sin(((Float millisec) * 0.05)), 0.0, (- sin(((Float millisec) * 0.03))), $00)
                            If (XB4XFDZ8DD($03, $09) = $00) Then
                                XB4XFDZ8DD($03, $09) = loadsound_strict("SFX\Ambient\General\Ambient9.ogg")
                            Else
                                local3\Field2 = loopsoundex(XB4XFDZ8DD($03, $09), local3\Field2, camera, local3\Field19\Field27[$11], 6.0, 1.5, $00)
                            EndIf
                            If (-25.0 > entityy(XZ0260X8X2\Field74, $00, 1.0)) Then
                                If ((((chs\Field0 = $00) And (0.0 = XZ0260X8X2\Field48)) And (0.0 <= XZ0260X8X2\Field52)) <> 0) Then
                                    msg\Field8 = format(getlocalstring("death", "939.shaft"), subjectname, "%s")
                                    playsound_strict(loadtempsound("SFX\Room\PocketDimension\Impact.ogg"), $00, $00)
                                    XZ0260X8X2\Field64 = 3000.0
                                    kill($00, $01, $00, $01)
                                EndIf
                            EndIf
                        EndIf
                    Else
                        local3\Field19\Field22\Field20 = $00
                        local3\Field4 = 0.0
                        If (local3\Field19\Field32[$00] <> Null) Then
                            For local20 = $00 To $03 Step $01
                                local3\Field19\Field32[local20]\Field66 = 66.0
                            Next
                        EndIf
                    EndIf
                ElseIf (local3\Field19\Field32[$00] <> Null) Then
                    For local20 = $00 To $03 Step $01
                        local3\Field19\Field32[local20]\Field66 = 66.0
                    Next
                EndIf
            Case $28
                If (8.0 > local3\Field19\Field39) Then
                    tformpoint(-190.0, 75.0, 190.0, local3\Field19\Field15, $00)
                    local1 = createnpc($17, tformedx(), tformedy(), tformedz())
                    local1\Field66 = 8.0
                    local1\Field1 = $01
                    setnpcframe(local1, 288.0, $01)
                    rotateentity(local1\Field82, 0.0, ((Float local3\Field19\Field21) + rnd(160.0, 180.0)), 0.0, $01)
                    removeevent(local3)
                EndIf
            Case $15
                If (playerroom = local3\Field19) Then
                    If (0.0 = local3\Field4) Then
                        local3\Field19\Field32[$00] = createnpc($16, entityx(local3\Field19\Field27[$01], $01, 1.0), 0.5, entityz(local3\Field19\Field27[$01], $01, 1.0))
                        local3\Field19\Field32[$00]\Field66 = 6.0
                        createnpcasset(local3\Field19\Field32[$00])
                        changenpctextureid(local3\Field19\Field32[$00], $15)
                        setnpcframe(local3\Field19\Field32[$00], 501.0, $01)
                        rotateentity(local3\Field19\Field32[$00]\Field82, 0.0, ((Float local3\Field19\Field21) + 270.0), 0.0, $01)
                        local3\Field4 = 1.0
                    ElseIf (0.0 < local3\Field4) Then
                        shouldplay = $1A
                        If (ChannelPlaying(local3\Field19\Field32[$00]\Field63) <> 0) Then
                            local3\Field19\Field32[$00]\Field63 = loopsoundex(local3\Field19\Field32[$00]\Field55, local3\Field19\Field32[$00]\Field63, camera, local3\Field19\Field15, 6.0, 1.0, $00)
                        EndIf
                        If (1.0 = local3\Field4) Then
                            If (1.44 > entitydistancesquared(XZ0260X8X2\Field74, local3\Field19\Field27[$00])) Then
                                If (entityinview(local3\Field19\Field32[$00]\Field98, camera) <> 0) Then
                                    giveachievement("035", $01)
                                    playsound_strict(loadtempsound("SFX\SCP\035\GetUp.ogg"), $00, $00)
                                    local3\Field4 = 1.5
                                EndIf
                            EndIf
                        Else
                            If (local3\Field19\Field25[$03]\Field39 <> 0) Then
                                local3\Field7 = max(local3\Field7, 1.0)
                            EndIf
                            If (updatelever(local3\Field19\Field9[$00]\Field1, (20.0 = local3\Field7), $50, -80.0) = $00) Then
                                local23 = updatelever(local3\Field19\Field9[$01]\Field1, $00, $50, -80.0)
                                If ((local23 Lor ((1750.0 < local3\Field1) And (3500.0 > local3\Field1))) <> 0) Then
                                    If (local23 <> 0) Then
                                        For local20 = $00 To $01 Step $01
                                            If (local3\Field19\Field17[local20] = Null) Then
                                                tformpoint(-269.0, 400.0, (((Float local20) * 489.0) + 135.0), local3\Field19\Field15, $00)
                                                local3\Field19\Field17[local20] = setemitter(local3\Field19, tformedx(), tformedy(), tformedz(), $00)
                                                local3\Field19\Field17[local20]\Field7 = $01
                                            EndIf
                                        Next
                                    Else
                                        For local20 = $00 To $01 Step $01
                                            If (local3\Field19\Field17[local20] <> Null) Then
                                                freeemitter(local3\Field19\Field17[local20], $00)
                                            EndIf
                                        Next
                                    EndIf
                                    If (-2100.0 < local3\Field1) Then
                                        local3\Field1 = ((Abs local3\Field1) + fps\Field3[$00])
                                        If (((1.0 < local3\Field1) And (1.0 >= (local3\Field1 - fps\Field3[$00]))) <> 0) Then
                                            local3\Field19\Field32[$00]\Field66 = 0.0
                                            loadnpcsound(local3\Field19\Field32[$00], "SFX\SCP\035\Gased0.ogg", $00)
                                            local3\Field19\Field32[$00]\Field63 = playsound_strict(local3\Field19\Field32[$00]\Field55, $01, $00)
                                        ElseIf (((1050.0 < local3\Field1) And (1750.0 > local3\Field1)) <> 0) Then
                                            If (1050.0 >= (local3\Field1 - fps\Field3[$00])) Then
                                                loadnpcsound(local3\Field19\Field32[$00], "SFX\SCP\035\Gased1.ogg", $00)
                                                local3\Field19\Field32[$00]\Field63 = playsound_strict(local3\Field19\Field32[$00]\Field55, $01, $00)
                                                setnpcframe(local3\Field19\Field32[$00], 553.0, $01)
                                            EndIf
                                            local3\Field19\Field32[$00]\Field66 = 6.0
                                            animatenpc(local3\Field19\Field32[$00], 553.0, 529.0, -0.12, $00)
                                        ElseIf (((1750.0 < local3\Field1) And (2450.0 > local3\Field1)) <> 0) Then
                                            local3\Field19\Field32[$00]\Field66 = 6.0
                                            animatenpc(local3\Field19\Field32[$00], 529.0, 524.0, -0.08, $00)
                                        ElseIf (2450.0 < local3\Field1) Then
                                            pointentity(local3\Field19\Field32[$00]\Field98, XZ0260X8X2\Field74, 0.0)
                                            rotateentity(local3\Field19\Field32[$00]\Field82, 0.0, curveangle(entityyaw(local3\Field19\Field32[$00]\Field98, $00, 1.0), entityyaw(local3\Field19\Field32[$00]\Field82, $00, 1.0), 15.0), 0.0, $00)
                                            If (6.0 = local3\Field19\Field32[$00]\Field66) Then
                                                XZ0260X8X2\Field42 = ((sin((animtime(local3\Field19\Field32[$00]\Field98) - 524.0)) * -150.0) * 9.0)
                                                animatenpc(local3\Field19\Field32[$00], 524.0, 553.0, 0.08, $00)
                                                If (552.9 < local3\Field19\Field32[$00]\Field103) Then
                                                    local3\Field19\Field32[$00]\Field66 = 0.0
                                                EndIf
                                            EndIf
                                            If (2450.0 >= (local3\Field1 - fps\Field3[$00])) Then
                                                loadnpcsound(local3\Field19\Field32[$00], "SFX\SCP\035\GasedKilled0.ogg", $00)
                                                local3\Field19\Field32[$00]\Field63 = playsound_strict(local3\Field19\Field32[$00]\Field55, $01, $00)
                                                playsound_strict(loadtempsound("SFX\SCP\035\KilledGetUp.ogg"), $00, $00)
                                                i_035\Field0 = $01
                                                update035label(local3\Field19\Field27[$04])
                                                createnpcasset(local3\Field19\Field32[$00])
                                                local3\Field4 = 4200.0
                                            EndIf
                                        EndIf
                                    EndIf
                                Else
                                    If (6.0 = local3\Field19\Field32[$00]\Field66) Then
                                        If (((501.0 <= local3\Field19\Field32[$00]\Field103) And (523.0 >= local3\Field19\Field32[$00]\Field103)) <> 0) Then
                                            animatenpc(local3\Field19\Field32[$00], 501.0, 523.0, 0.08, $00)
                                            If (522.9 < local3\Field19\Field32[$00]\Field103) Then
                                                local3\Field19\Field32[$00]\Field66 = 0.0
                                            EndIf
                                        ElseIf (((524.0 <= local3\Field19\Field32[$00]\Field103) And (553.0 >= local3\Field19\Field32[$00]\Field103)) <> 0) Then
                                            animatenpc(local3\Field19\Field32[$00], 524.0, 553.0, 0.08, $00)
                                            If (552.9 < local3\Field19\Field32[$00]\Field103) Then
                                                local3\Field19\Field32[$00]\Field66 = 0.0
                                            EndIf
                                        EndIf
                                    EndIf
                                    For local20 = $00 To $01 Step $01
                                        If (local3\Field19\Field17[local20] <> Null) Then
                                            freeemitter(local3\Field19\Field17[local20], $00)
                                        EndIf
                                    Next
                                    If (0.0 = local3\Field19\Field32[$00]\Field66) Then
                                        pointentity(local3\Field19\Field32[$00]\Field98, XZ0260X8X2\Field74, 0.0)
                                        rotateentity(local3\Field19\Field32[$00]\Field82, 0.0, curveangle(entityyaw(local3\Field19\Field32[$00]\Field98, $00, 1.0), entityyaw(local3\Field19\Field32[$00]\Field82, $00, 1.0), 15.0), 0.0, $00)
                                        If (rand($1F4, $01) = $01) Then
                                            local3\Field19\Field32[$00]\Field65 = (Float (4.0 < entitydistancesquared(local3\Field19\Field32[$00]\Field82, local3\Field19\Field27[$01])))
                                            local3\Field19\Field32[$00]\Field66 = 1.0
                                        EndIf
                                    ElseIf (1.0 = local3\Field19\Field32[$00]\Field66) Then
                                        If (1.0 = local3\Field19\Field32[$00]\Field65) Then
                                            pointentity(local3\Field19\Field32[$00]\Field98, local3\Field19\Field27[$01], 0.0)
                                            If (0.09 > entitydistancesquared(local3\Field19\Field32[$00]\Field82, local3\Field19\Field27[$01])) Then
                                                local3\Field19\Field32[$00]\Field66 = 0.0
                                            EndIf
                                        Else
                                            rotateentity(local3\Field19\Field32[$00]\Field98, 0.0, ((Float local3\Field19\Field21) - 180.0), 0.0, $01)
                                            If (4.0 < entitydistancesquared(local3\Field19\Field32[$00]\Field82, local3\Field19\Field27[$01])) Then
                                                local3\Field19\Field32[$00]\Field66 = 0.0
                                            EndIf
                                        EndIf
                                        rotateentity(local3\Field19\Field32[$00]\Field82, 0.0, curveangle(entityyaw(local3\Field19\Field32[$00]\Field98, $00, 1.0), entityyaw(local3\Field19\Field32[$00]\Field82, $00, 1.0), 15.0), 0.0, $00)
                                    EndIf
                                    If (0.0 < local3\Field1) Then
                                        local3\Field1 = (- local3\Field1)
                                        If (-2450.0 > local3\Field1) Then
                                            loadnpcsound(local3\Field19\Field32[$00], "SFX\SCP\035\GasedKilled1.ogg", $00)
                                            local3\Field19\Field32[$00]\Field63 = playsound_strict(local3\Field19\Field32[$00]\Field55, $01, $00)
                                            local3\Field4 = 4200.0
                                        Else
                                            If (-1400.0 > local3\Field1) Then
                                                loadnpcsound(local3\Field19\Field32[$00], "SFX\SCP\035\GasedStop1.ogg", $00)
                                            Else
                                                loadnpcsound(local3\Field19\Field32[$00], "SFX\SCP\035\GasedStop0.ogg", $00)
                                                local3\Field1 = -1470.0
                                            EndIf
                                            local3\Field19\Field32[$00]\Field63 = playsound_strict(local3\Field19\Field32[$00]\Field55, $01, $00)
                                            local3\Field4 = 4270.0
                                        EndIf
                                    Else
                                        local3\Field4 = (local3\Field4 + fps\Field3[$00])
                                        If (((280.0 < local3\Field4) And (280.0 >= (local3\Field4 - fps\Field3[$00]))) <> 0) Then
                                            loadnpcsound(local3\Field19\Field32[$00], "SFX\SCP\035\Help0.ogg", $00)
                                            local3\Field19\Field32[$00]\Field63 = playsound_strict(local3\Field19\Field32[$00]\Field55, $01, $00)
                                            local3\Field4 = 700.0
                                        ElseIf (((1400.0 < local3\Field4) And (1400.0 >= (local3\Field4 - fps\Field3[$00]))) <> 0) Then
                                            loadnpcsound(local3\Field19\Field32[$00], "SFX\SCP\035\Help1.ogg", $00)
                                            local3\Field19\Field32[$00]\Field63 = playsound_strict(local3\Field19\Field32[$00]\Field55, $01, $00)
                                        ElseIf (((2800.0 < local3\Field4) And (2800.0 >= (local3\Field4 - fps\Field3[$00]))) <> 0) Then
                                            loadnpcsound(local3\Field19\Field32[$00], "SFX\SCP\035\Idle0.ogg", $00)
                                            local3\Field19\Field32[$00]\Field63 = playsound_strict(local3\Field19\Field32[$00]\Field55, $01, $00)
                                        ElseIf (((3500.0 < local3\Field4) And (3500.0 >= (local3\Field4 - fps\Field3[$00]))) <> 0) Then
                                            loadnpcsound(local3\Field19\Field32[$00], "SFX\SCP\035\Idle1.ogg", $00)
                                            local3\Field19\Field32[$00]\Field63 = playsound_strict(local3\Field19\Field32[$00]\Field55, $01, $00)
                                        ElseIf (((5600.0 < local3\Field4) And (5600.0 >= (local3\Field4 - fps\Field3[$00]))) <> 0) Then
                                            If ((Int local3\Field7) <> 0) Then
                                                local3\Field4 = 9100.0
                                            ElseIf (-2100.0 > local3\Field1) Then
                                                loadnpcsound(local3\Field19\Field32[$00], "SFX\SCP\035\GasedCloset.ogg", $00)
                                                local3\Field19\Field32[$00]\Field63 = playsound_strict(local3\Field19\Field32[$00]\Field55, $01, $00)
                                            ElseIf (0.0 = local3\Field1) Then
                                                loadnpcsound(local3\Field19\Field32[$00], "SFX\SCP\035\Closet0.ogg", $00)
                                                local3\Field19\Field32[$00]\Field63 = playsound_strict(local3\Field19\Field32[$00]\Field55, $01, $00)
                                            Else
                                                loadnpcsound(local3\Field19\Field32[$00], "SFX\SCP\035\GasedCloset.ogg", $00)
                                                local3\Field19\Field32[$00]\Field63 = playsound_strict(local3\Field19\Field32[$00]\Field55, $01, $00)
                                            EndIf
                                        ElseIf (5600.0 < local3\Field4) Then
                                            If ((Int local3\Field7) <> 0) Then
                                                local3\Field4 = max(local3\Field4, 7000.0)
                                            EndIf
                                            If (((7700.0 < local3\Field4) And (7700.0 >= (local3\Field4 - fps\Field3[$00]))) <> 0) Then
                                                If ((Int local3\Field7) <> 0) Then
                                                    loadnpcsound(local3\Field19\Field32[$00], "SFX\SCP\035\Closet1.ogg", $00)
                                                    local3\Field19\Field32[$00]\Field63 = playsound_strict(local3\Field19\Field32[$00]\Field55, $01, $00)
                                                    local3\Field4 = 9100.0
                                                Else
                                                    loadnpcsound(local3\Field19\Field32[$00], "SFX\SCP\035\Idle2.ogg", $00)
                                                    local3\Field19\Field32[$00]\Field63 = playsound_strict(local3\Field19\Field32[$00]\Field55, $01, $00)
                                                EndIf
                                            ElseIf (((8750.0 < local3\Field4) And (8750.0 >= (local3\Field4 - fps\Field3[$00]))) <> 0) Then
                                                If ((Int local3\Field7) <> 0) Then
                                                    loadnpcsound(local3\Field19\Field32[$00], "SFX\SCP\035\Closet0.ogg", $00)
                                                    local3\Field19\Field32[$00]\Field63 = playsound_strict(local3\Field19\Field32[$00]\Field55, $01, $00)
                                                Else
                                                    loadnpcsound(local3\Field19\Field32[$00], "SFX\SCP\035\Idle3.ogg", $00)
                                                    local3\Field19\Field32[$00]\Field63 = playsound_strict(local3\Field19\Field32[$00]\Field55, $01, $00)
                                                EndIf
                                            ElseIf (((10500.0 < local3\Field4) And (10500.0 >= (local3\Field4 - fps\Field3[$00]))) <> 0) Then
                                                loadnpcsound(local3\Field19\Field32[$00], "SFX\SCP\035\Idle4.ogg", $00)
                                                local3\Field19\Field32[$00]\Field63 = playsound_strict(local3\Field19\Field32[$00]\Field55, $01, $00)
                                            ElseIf (((14000.0 < local3\Field4) And (14000.0 >= (local3\Field4 - fps\Field3[$00]))) <> 0) Then
                                                loadnpcsound(local3\Field19\Field32[$00], "SFX\SCP\035\Idle5.ogg", $00)
                                                local3\Field19\Field32[$00]\Field63 = playsound_strict(local3\Field19\Field32[$00]\Field55, $01, $00)
                                            ElseIf (((17500.0 < local3\Field4) And (17500.0 >= (local3\Field4 - fps\Field3[$00]))) <> 0) Then
                                                loadnpcsound(local3\Field19\Field32[$00], "SFX\SCP\035\Idle6.ogg", $00)
                                                local3\Field19\Field32[$00]\Field63 = playsound_strict(local3\Field19\Field32[$00]\Field55, $01, $00)
                                            EndIf
                                        EndIf
                                    EndIf
                                EndIf
                            Else
                                If (10.0 > local3\Field7) Then
                                    local3\Field19\Field25[$02]\Field39 = $00
                                    local3\Field19\Field25[$02]\Field21 = $01
                                    For local20 = $00 To $01 Step $01
                                        If (local3\Field19\Field25[local20]\Field39 = $00) Then
                                            openclosedoor(local3\Field19\Field25[local20], $01, $00)
                                        EndIf
                                    Next
                                    If (0.0 = local3\Field1) Then
                                        loadnpcsound(local3\Field19\Field32[$00], "SFX\SCP\035\Escape.ogg", $00)
                                        local3\Field19\Field32[$00]\Field63 = playsound_strict(local3\Field19\Field32[$00]\Field55, $01, $00)
                                    ElseIf (2450.0 < (Abs local3\Field1)) Then
                                        loadnpcsound(local3\Field19\Field32[$00], "SFX\SCP\035\KilledEscape.ogg", $00)
                                        local3\Field19\Field32[$00]\Field63 = playsound_strict(local3\Field19\Field32[$00]\Field55, $01, $00)
                                    Else
                                        loadnpcsound(local3\Field19\Field32[$00], "SFX\SCP\035\GasedEscape.ogg", $00)
                                        local3\Field19\Field32[$00]\Field63 = playsound_strict(local3\Field19\Field32[$00]\Field55, $01, $00)
                                    EndIf
                                    local3\Field7 = 20.0
                                EndIf
                                If (20.0 = local3\Field7) Then
                                    local41 = distancesquared(entityx(local3\Field19\Field25[$00]\Field51, $01, 1.0), entityx(local3\Field19\Field32[$00]\Field82, $01, 1.0), entityz(local3\Field19\Field25[$00]\Field51, $01, 1.0), entityz(local3\Field19\Field32[$00]\Field82, $01, 1.0), 0.0, 0.0)
                                    local3\Field19\Field32[$00]\Field66 = 1.0
                                    If (6.25 < local41) Then
                                        pointentity(local3\Field19\Field32[$00]\Field98, local3\Field19\Field25[$01]\Field51, 0.0)
                                        rotateentity(local3\Field19\Field32[$00]\Field82, 0.0, curveangle(entityyaw(local3\Field19\Field32[$00]\Field98, $00, 1.0), entityyaw(local3\Field19\Field32[$00]\Field82, $00, 1.0), 15.0), 0.0, $00)
                                    ElseIf (0.49 < local41) Then
                                        If (ChannelPlaying(local3\Field19\Field32[$00]\Field63) <> 0) Then
                                            local3\Field19\Field32[$00]\Field66 = 0.0
                                            pointentity(local3\Field19\Field32[$00]\Field98, XZ0260X8X2\Field74, 0.0)
                                            rotateentity(local3\Field19\Field32[$00]\Field82, 0.0, curveangle(entityyaw(local3\Field19\Field32[$00]\Field98, $00, 1.0), entityyaw(local3\Field19\Field32[$00]\Field82, $00, 1.0), 15.0), 0.0, $00)
                                        Else
                                            pointentity(local3\Field19\Field32[$00]\Field98, local3\Field19\Field25[$00]\Field51, 0.0)
                                            rotateentity(local3\Field19\Field32[$00]\Field82, 0.0, curveangle(entityyaw(local3\Field19\Field32[$00]\Field98, $00, 1.0), entityyaw(local3\Field19\Field32[$00]\Field82, $00, 1.0), 15.0), 0.0, $00)
                                        EndIf
                                    Else
                                        removenpc(local3\Field19\Field32[$00])
                                        For local20 = $00 To $02 Step $01
                                            local3\Field19\Field25[local20]\Field21 = $00
                                        Next
                                        openclosedoor(local3\Field19\Field25[$01], $01, $00)
                                        For local16 = Each doors
                                            If (local16\Field46 = $02) Then
                                                If (20.25 > distancesquared(entityx(local3\Field19\Field15, $00, 1.0), entityx(local16\Field51, $01, 1.0), entityz(local3\Field19\Field15, $00, 1.0), entityz(local16\Field51, $01, 1.0), 0.0, 0.0)) Then
                                                    openclosedoor(local16, $01, $00)
                                                    Exit
                                                EndIf
                                            EndIf
                                        Next
                                        local105 = $00
                                        local106 = $3E8
                                        local20 = $00
                                        Dim X2ZZZB2806.rooms($05)
                                        While (((local20 < $05) And (local105 < local106)) <> 0)
                                            local105 = (local105 + $01)
                                            For local2 = Each rooms
                                                If ((((local2\Field22\Field22 > $00) And (local2\Field0 = $03)) And (rand($05, $01) = $01)) <> 0) Then
                                                    local107 = $00
                                                    For local21 = $00 To (local20 - $01) Step $01
                                                        If (X2ZZZB2806(local21) = local2) Then
                                                            local107 = $01
                                                            Exit
                                                        EndIf
                                                    Next
                                                    If (local107 = $00) Then
                                                        If (local2\Field35 <> $00) Then
                                                            local31 = (entityx(local2\Field35, $00, 1.0) + rnd(-0.2, 0.2))
                                                            local32 = (local2\Field3 + 0.22)
                                                            local33 = (entityz(local2\Field35, $00, 1.0) + rnd(-0.2, 0.2))
                                                        Else
                                                            local31 = (local2\Field40 + rnd(-0.2, 0.2))
                                                            local32 = (local2\Field3 + 0.22)
                                                            local33 = (local2\Field37 + rnd(-0.2, 0.2))
                                                        EndIf
                                                        createnpc($02, local31, local32, local33)
                                                        createdecal($00, local31, (local2\Field3 + 0.005), local33, 90.0, rnd(360.0, 0.0), 0.0, 0.4, 10.0, $00, $01, $B4, $14, $14)
                                                        X2ZZZB2806(local20) = local2
                                                        local20 = (local20 + $01)
                                                        Exit
                                                    EndIf
                                                EndIf
                                            Next
                                        Wend
                                        Dim X2ZZZB2806.rooms($00)
                                        local3\Field7 = 0.0
                                        local3\Field1 = 0.0
                                        local3\Field4 = -1.0
                                    EndIf
                                EndIf
                            EndIf
                        EndIf
                    Else
                        If (updatelever(local3\Field19\Field9[$01]\Field1, $00, $50, -80.0) <> 0) Then
                            For local20 = $00 To $01 Step $01
                                If (local3\Field19\Field17[local20] = Null) Then
                                    tformpoint(-269.0, 400.0, (((Float local20) * 489.0) + 135.0), local3\Field19\Field15, $00)
                                    local3\Field19\Field17[local20] = setemitter(local3\Field19, tformedx(), tformedy(), tformedz(), $00)
                                    local3\Field19\Field17[local20]\Field7 = $01
                                EndIf
                            Next
                        Else
                            For local20 = $00 To $01 Step $01
                                If (local3\Field19\Field17[local20] <> Null) Then
                                    freeemitter(local3\Field19\Field17[local20], $00)
                                EndIf
                            Next
                        EndIf
                        shouldplay = $01
                        local23 = $00
                        If (entityx(XZ0260X8X2\Field74, $00, 1.0) > min(entityx(local3\Field19\Field27[$02], $01, 1.0), entityx(local3\Field19\Field27[$03], $01, 1.0))) Then
                            If (entityx(XZ0260X8X2\Field74, $00, 1.0) < max(entityx(local3\Field19\Field27[$02], $01, 1.0), entityx(local3\Field19\Field27[$03], $01, 1.0))) Then
                                If (entityz(XZ0260X8X2\Field74, $00, 1.0) > min(entityz(local3\Field19\Field27[$02], $01, 1.0), entityz(local3\Field19\Field27[$03], $01, 1.0))) Then
                                    If (entityz(XZ0260X8X2\Field74, $00, 1.0) < max(entityz(local3\Field19\Field27[$02], $01, 1.0), entityz(local3\Field19\Field27[$03], $01, 1.0))) Then
                                        If (local3\Field19\Field32[$00] = Null) Then
                                            local3\Field19\Field32[$00] = createnpc($02, 0.0, 0.0, 0.0)
                                        EndIf
                                        positionentity(local3\Field19\Field32[$00]\Field82, entityx(local3\Field19\Field27[$01], $01, 1.0), 0.13, entityz(local3\Field19\Field27[$01], $01, 1.0), $00)
                                        If (local3\Field19\Field32[$01] = Null) Then
                                            local3\Field19\Field32[$01] = createnpc($02, entityx(local3\Field19\Field27[$01], $01, 1.0), (local3\Field19\Field3 + 0.22), entityz(local3\Field19\Field27[$01], $01, 1.0))
                                        ElseIf (((0.0 < local3\Field19\Field32[$01]\Field66) And (local3\Field19\Field32[$02] = Null)) <> 0) Then
                                            tformpoint(-72.0, 0.0, 132.0, local3\Field19\Field15, $00)
                                            local3\Field19\Field32[$02] = createnpc($02, tformedx(), (local3\Field19\Field3 + 0.22), tformedz())
                                        EndIf
                                        XZ0260X8X2\Field56 = curvevalue(min(60.0, XZ0260X8X2\Field56), XZ0260X8X2\Field56, 20.0)
                                        local23 = $01
                                        If (local3\Field0 = $00) Then
                                            local3\Field0 = loadsound_strict("SFX\Room\035Chamber\Whispers0.ogg")
                                        EndIf
                                        If (local3\Field30 = $00) Then
                                            local3\Field30 = loadsound_strict("SFX\Room\035Chamber\Whispers1.ogg")
                                        EndIf
                                        local3\Field7 = min((local3\Field7 + (fps\Field3[$00] / 6000.0)), 1.0)
                                        local3\Field1 = curvevalue(local3\Field7, local3\Field1, 50.0)
                                        If ((((i_714\Field0 <> $02) And (T8660BZ460\Field10 <> $04)) And (T8660BZ460\Field3 <> $04)) <> 0) Then
                                            XZ0260X8X2\Field42 = (XZ0260X8X2\Field42 - (fps\Field3[$00] * 1.1))
                                            XZ0260X8X2\Field64 = (sin(((Float millisec) / 10.0)) * (Abs XZ0260X8X2\Field42))
                                        EndIf
                                        XZ0260X8X2\Field11 = ((fps\Field3[$00] / (((Float (T8660BZ460\Field10 > $00)) + 1.0) * 5000.0)) + XZ0260X8X2\Field11)
                                        If (((Int XZ0260X8X2\Field48) And (100.0 <= XZ0260X8X2\Field39)) <> 0) Then
                                            msg\Field8 = format(getlocalstring("death", "035"), subjectname, "%s")
                                        EndIf
                                    EndIf
                                EndIf
                            EndIf
                        EndIf
                        If (local23 = $00) Then
                            local3\Field7 = max((local3\Field7 - (fps\Field3[$00] / 2000.0)), 0.0)
                            local3\Field1 = max((local3\Field1 - (fps\Field3[$00] / 100.0)), 0.0)
                        EndIf
                        If (((((0.0 < local3\Field1) And (i_714\Field0 <> $02)) And (T8660BZ460\Field10 <> $04)) And (T8660BZ460\Field3 <> $04)) <> 0) Then
                            local3\Field2 = loopsoundex(local3\Field0, local3\Field2, camera, local3\Field19\Field15, 10.0, local3\Field1, $00)
                            local3\Field8 = loopsoundex(local3\Field30, local3\Field8, camera, local3\Field19\Field15, 10.0, ((local3\Field1 - 0.5) * 2.0), $00)
                        EndIf
                    EndIf
                    If (local3\Field19\Field32[$00] <> Null) Then
                        updatesoundorigin(local3\Field19\Field32[$00]\Field63, camera, local3\Field19\Field15, 6.0, 0.8, $01, $01, $00)
                    EndIf
                ElseIf (0.0 = local3\Field4) Then
                    If (((local3\Field0 = $00) And (infacility = $00)) <> 0) Then
                        For local20 = $00 To $03 Step $01
                            If (isroomadjacent(playerroom\Field29[local20], local3\Field19) <> 0) Then
                                loadeventsound(local3, "SFX\Room\035Chamber\InProximity.ogg", $00)
                                playsound_strict(local3\Field0, $01, $00)
                            EndIf
                        Next
                    EndIf
                ElseIf (local3\Field19\Field32[$00] <> Null) Then
                    updatesoundorigin(local3\Field19\Field32[$00]\Field63, camera, local3\Field19\Field15, 6.0, 0.8, $01, $01, $00)
                EndIf
            Case $22
                If (0.0 = local3\Field4) Then
                    If (playerroom = local3\Field19) Then
                        tformpoint(entityx(XZ0260X8X2\Field74, $00, 1.0), entityy(XZ0260X8X2\Field74, $00, 1.0), entityz(XZ0260X8X2\Field74, $00, 1.0), $00, local3\Field19\Field15)
                        If (0.0 = tformedz()) Then
                            local23 = $FFFFFFFF
                        Else
                            local23 = (Int (- (Sgn tformedz())))
                        EndIf
                        tformpoint(-720.0, 57.0, (816.0 * (Float local23)), local3\Field19\Field15, $00)
                        local3\Field19\Field32[$00] = createnpc($10, tformedx(), tformedy(), tformedz())
                        local3\Field19\Field32[$00]\Field66 = 1.0
                        rotateentity(local3\Field19\Field32[$00]\Field82, 0.0, ((Float local3\Field19\Field21) - 90.0), 0.0, $00)
                        local3\Field4 = 1.0
                    EndIf
                ElseIf (1.0 = local3\Field4) Then
                    local3\Field7 = (local3\Field7 + fps\Field3[$00])
                    If (((735.0 < local3\Field7) Lor local3\Field19\Field25[$00]\Field39) <> 0) Then
                        removenpc(local3\Field19\Field32[$00])
                        local3\Field4 = 2.0
                    EndIf
                EndIf
                If (playerroom = local3\Field19) Then
                    If (2.0 = local3\Field4) Then
                        If (((6.25 > entitydistancesquared(XZ0260X8X2\Field74, local3\Field19\Field27[$06])) And (0.0 < local3\Field4)) <> 0) Then
                            playsound_strict(loadtempsound("SFX\SCP\079\TestroomWarning.ogg"), $01, $00)
                            For local20 = $00 To $05 Step $01
                                local18 = setemitter(local3\Field19, entityx(local3\Field19\Field27[local20], $01, 1.0), entityy(local3\Field19\Field27[local20], $01, 1.0), entityz(local3\Field19\Field27[local20], $01, 1.0), $04)
                                local18\Field7 = $01
                            Next
                            If (local3\Field19\Field25[$01]\Field39 <> 0) Then
                                playsoundex(snd_i\Field52, camera, local3\Field19\Field25[$01]\Field51, 7.0, 1.0, $00, $00)
                                openclosedoor(local3\Field19\Field25[$01], $01, $00)
                            EndIf
                            removeevent(local3)
                        EndIf
                    EndIf
                EndIf
            Case $1C
                If (playerroom = local3\Field19) Then
                    playsoundex(snd_i\Field14, camera, local3\Field19\Field15, 10.0, 1.0, $00, $00)
                    tformpoint(0.0, 460.0, 512.0, local3\Field19\Field15, $00)
                    local18 = setemitter(local3\Field19, tformedx(), tformedy(), tformedz(), $00)
                    local18\Field7 = $01
                    tformpoint(0.0, 460.0, -512.0, local3\Field19\Field15, $00)
                    local18 = setemitter(local3\Field19, tformedx(), tformedy(), tformedz(), $00)
                    local18\Field7 = $01
                    removeevent(local3)
                EndIf
            Case $1D
                If (playerroom = local3\Field19) Then
                    If (1.0 < n_i\Field3\Field31) Then
                        removeevent(local3)
                    ElseIf (0.0 = local3\Field4) Then
                        playsound_strict(snd_i\Field11, $00, $00)
                        XZ0260X8X2\Field8 = 5.0
                        local3\Field4 = 1.0
                    EndIf
                EndIf
                If (((0.0 < local3\Field4) And (200.0 > local3\Field4)) <> 0) Then
                    local3\Field4 = (local3\Field4 + fps\Field3[$00])
                    If (((30.0 < local3\Field4) And (30.0 >= (local3\Field4 - fps\Field3[$00]))) <> 0) Then
                        playsound_strict(loadtempsound("SFX\Ambient\General\Ambient2.ogg"), $00, $00)
                    EndIf
                    If (((100.0 >= (local3\Field4 - fps\Field3[$00])) And (100.0 < local3\Field4)) <> 0) Then
                        playsound_strict(loadtempsound("SFX\Ambient\General\Ambient5.ogg"), $00, $00)
                        positionentity(n_i\Field3\Field82, entityx(local3\Field19\Field15, $00, 1.0), 0.6, entityz(local3\Field19\Field15, $00, 1.0), $00)
                        resetentity(n_i\Field3\Field82)
                        n_i\Field3\Field31 = 1.0
                        If (((T8660BZ460\Field8 > $00) Lor (T8660BZ460\Field11 > $00)) <> 0) Then
                            XZ0260X8X2\Field53 = -10.0
                        EndIf
                    EndIf
                    If (30.0 < local3\Field4) Then
                        If ((local3\Field19\Field3 + (1.0 / 64.0)) < entityy(local3\Field19\Field27[$00], $01, 1.0)) Then
                            positionentity(local3\Field19\Field27[$00], entityx(local3\Field19\Field27[$00], $01, 1.0), max((local3\Field19\Field3 + (1.0 / 64.0)), ((local3\Field19\Field3 + 1.71875) - (local3\Field4 / 30.0))), entityz(local3\Field19\Field27[$00], $01, 1.0), $01)
                            rotateentity(local3\Field19\Field27[$00], entitypitch(local3\Field19\Field27[$00], $01, 1.0), curvevalue(30.0, entityyaw(local3\Field19\Field27[$00], $01, 1.0), 200.0), entityroll(local3\Field19\Field27[$00], $01, 1.0), $01)
                        EndIf
                    EndIf
                ElseIf (((0.0 < local3\Field4) And (0.25 > XZ0260X8X2\Field8)) <> 0) Then
                    n_i\Field3\Field31 = 0.0
                    removeevent(local3)
                EndIf
            Case $1B
                If (n_i\Field2\Field93 = $00) Then
                    If (0.0 = local3\Field4) Then
                        If ((chs\Field8 Lor i_268\Field3) = $00) Then
                            If (((3.0 > local3\Field19\Field39) And (0.0 < local3\Field19\Field39)) <> 0) Then
                                If (2.0 > n_i\Field2\Field66) Then
                                    local3\Field4 = 1.0
                                ElseIf ((((3.0 = n_i\Field2\Field66) And (25.0 < entitydistancesquared(n_i\Field2\Field82, XZ0260X8X2\Field74))) And (entityinview(n_i\Field2\Field98, camera) = $00)) <> 0) Then
                                    local3\Field7 = 1.0
                                    local3\Field4 = 1.0
                                EndIf
                            EndIf
                        EndIf
                    ElseIf (1.0 = local3\Field4) Then
                        local5 = createdecal($00, entityx(local3\Field19\Field15, $00, 1.0), (local3\Field19\Field3 + 1.738281), entityz(local3\Field19\Field15, $00, 1.0), -90.0, rnd(360.0, 0.0), 0.0, rnd(0.5, 0.7), rnd(0.7, 0.85), $00, $01, $00, $00, $00)
                        entityparent(local5\Field0, local3\Field19\Field15, $01)
                        playsound_strict(snd_i\Field40[$0A], $00, $00)
                        local3\Field4 = 2.0
                    Else
                        If (1.0 = local3\Field7) Then
                            shouldplay = $0A
                        EndIf
                        local3\Field4 = (local3\Field4 + fps\Field3[$00])
                        If (180.0 >= local3\Field4) Then
                            n_i\Field2\Field31 = 1.0
                            n_i\Field2\Field70 = 0.0
                            positionentity(n_i\Field2\Field82, entityx(local3\Field19\Field15, $01, 1.0), ((entityy(XZ0260X8X2\Field74, $00, 1.0) + 1.0) - min((sin(local3\Field4) * 1.5), 1.1)), entityz(local3\Field19\Field15, $01, 1.0), $01)
                            pointentity(n_i\Field2\Field82, camera, 0.0)
                            animatenpc(n_i\Field2, 55.0, 104.0, 0.1, $01)
                            resetentity(n_i\Field2\Field82)
                            positionentity(n_i\Field2\Field98, entityx(n_i\Field2\Field82, $00, 1.0), entityy(n_i\Field2\Field82, $00, 1.0), entityz(n_i\Field2\Field82, $00, 1.0), $00)
                            rotateentity(n_i\Field2\Field98, 0.0, entityyaw(n_i\Field2\Field82, $00, 1.0), 0.0, $00)
                        ElseIf (((180.0 < local3\Field4) And (300.0 > local3\Field4)) <> 0) Then
                            n_i\Field2\Field66 = 3.0
                            n_i\Field2\Field31 = 0.0
                            n_i\Field2\Field8 = 700.0
                            n_i\Field2\Field30 = $00
                            n_i\Field2\Field48 = $00
                            positionentity(n_i\Field2\Field82, entityx(local3\Field19\Field15, $01, 1.0), -3.0, entityz(local3\Field19\Field15, $01, 1.0), $01)
                            resetentity(n_i\Field2\Field82)
                            local5 = createdecal($00, local3\Field19\Field40, (local3\Field19\Field3 + 0.005), local3\Field19\Field37, 90.0, rnd(360.0, 0.0), 0.0, 0.05, 0.8, $00, $01, $00, $00, $00)
                            local5\Field14 = 0.01
                            entityparent(local5\Field0, local3\Field19\Field15, $01)
                            local3\Field4 = 300.0
                        ElseIf (800.0 > local3\Field4) Then
                            If ((((entityy(XZ0260X8X2\Field74, $00, 1.0) - 0.05) <= entityy(n_i\Field2\Field82, $00, 1.0)) Lor (chs\Field8 Lor i_268\Field3)) <> 0) Then
                                removeevent(local3)
                            Else
                                translateentity(n_i\Field2\Field82, 0.0, (((entityy(XZ0260X8X2\Field74, $01, 1.0) - 0.3) - entityy(n_i\Field2\Field82, $00, 1.0)) / 50.0), 0.0, $00)
                                If (-0.1 > entityy(n_i\Field2\Field82, $00, 1.0)) Then
                                    n_i\Field2\Field64 = 0.0
                                EndIf
                            EndIf
                        Else
                            removeevent(local3)
                        EndIf
                    EndIf
                Else
                    removeevent(local3)
                EndIf
            Case $0D
                If (playerroom = local3\Field19) Then
                    If (0.0 = n_i\Field3\Field31) Then
                        If (0.0 = local3\Field4) Then
                            If (local3\Field19\Field25[$00]\Field39 <> 0) Then
                                positionentity(n_i\Field3\Field82, entityx(local3\Field19\Field27[$00], $01, 1.0), 0.5, entityz(local3\Field19\Field27[$00], $01, 1.0), $00)
                                resetentity(n_i\Field3\Field82)
                                local3\Field4 = 1.0
                            EndIf
                        Else
                            If (entityhidden(local3\Field19\Field27[$02]) <> 0) Then
                                showentity(local3\Field19\Field27[$02])
                            EndIf
                            local3\Field4 = (local3\Field4 + fps\Field3[$00])
                            If (0.64 > entitydistancesquared(XZ0260X8X2\Field74, local3\Field19\Field27[$01])) Then
                                local3\Field4 = max(local3\Field4, 840.0)
                            EndIf
                            If (840.0 < local3\Field4) Then
                                If (((playersees173(n_i\Field3) = $00) And ((entityinview(local3\Field19\Field27[$02], camera) = $00) Lor ((-6.0 > XZ0260X8X2\Field53) And (-16.0 < XZ0260X8X2\Field53)))) <> 0) Then
                                    If (25.0 < entitydistancesquared(n_i\Field3\Field82, local3\Field19\Field27[$00])) Then
                                        removeevent(local3)
                                    Else
                                        tformpoint(-801.0, 240.0, -206.95, local3\Field19\Field15, $00)
                                        local5 = createdecal($17, tformedx(), tformedy(), tformedz(), 0.0, ((Float local3\Field19\Field21) + 180.0), 0.0, 0.2, 0.5, $00, $01, $00, $00, $00)
                                        entityparent(local5\Field0, local3\Field19\Field15, $01)
                                        playsoundex(loadtempsound("SFX\Room\GlassBreak.ogg"), camera, n_i\Field3\Field98, 10.0, 1.0, $00, $00)
                                        hideentity(local3\Field19\Field27[$02])
                                        tformpoint(-669.0, 128.0, -64.0, local3\Field19\Field15, $00)
                                        positionentity(n_i\Field3\Field82, tformedx(), tformedy(), tformedz(), $00)
                                        resetentity(n_i\Field3\Field82)
                                        removeevent(local3)
                                    EndIf
                                EndIf
                            EndIf
                        EndIf
                    EndIf
                EndIf
            Case $3E
                If (n_i\Field2\Field93 = $00) Then
                    If (playerroom = local3\Field19) Then
                        If (0.0 = local3\Field4) Then
                            local5 = createdecal($00, local3\Field19\Field40, (local3\Field19\Field3 + 3.117188), local3\Field19\Field37, -90.0, rnd(360.0, 0.0), 0.0, 0.5, 0.8, $00, $01, $00, $00, $00)
                            local5\Field14 = 0.0015
                            entityparent(local5\Field0, local3\Field19\Field15, $01)
                            playsound_strict(snd_i\Field1[$03], $00, $00)
                            local3\Field4 = 1.0
                        EndIf
                    EndIf
                    If (0.0 < local3\Field4) Then
                        local3\Field4 = (local3\Field4 + fps\Field3[$00])
                        If (200.0 < local3\Field4) Then
                            If (local3\Field19\Field32[$00] = Null) Then
                                local3\Field19\Field32[$00] = createnpc($16, local3\Field19\Field40, (local3\Field19\Field3 + 3.515625), local3\Field19\Field37)
                                local3\Field19\Field32[$00]\Field66 = -1.0
                                local3\Field19\Field32[$00]\Field57 = -1.0
                                changenpctextureid(local3\Field19\Field32[$00], $06)
                                rotateentity(local3\Field19\Field32[$00]\Field82, 0.0, rnd(360.0, 0.0), 0.0, $01)
                                setnpcframe(local3\Field19\Field32[$00], 1.0, $01)
                                playsound_strict(snd_i\Field40[$00], $00, $00)
                                playsound_strict(snd_i\Field1[$02], $00, $00)
                            EndIf
                            updatesoundorigin(local3\Field2, camera, local3\Field19\Field15, 10.0, 1.0, $00, $01, $00)
                            local3\Field19\Field32[$00]\Field37 = 0.0
                            If (0.35 < entityy(local3\Field19\Field32[$00]\Field82, $00, 1.0)) Then
                                entitytype(local3\Field19\Field32[$00]\Field82, $02, $00)
                                animatenpc(local3\Field19\Field32[$00], 1.0, 10.0, 0.12, $00)
                                local41 = entitydistancesquared(XZ0260X8X2\Field74, local3\Field19\Field32[$00]\Field82)
                                If (0.64 > local41) Then
                                    local50 = ((sqr(local41) - 0.8) * (sqr(local41) - 0.8))
                                    local26 = pointdirection(entityx(XZ0260X8X2\Field74, $01, 1.0), entityz(XZ0260X8X2\Field74, $01, 1.0), entityx(local3\Field19\Field32[$00]\Field82, $01, 1.0), entityz(local3\Field19\Field32[$00]\Field82, $01, 1.0))
                                    translateentity(XZ0260X8X2\Field74, (cos(((- local26) + 90.0)) * local50), 0.0, (sin(((- local26) + 90.0)) * local50), $00)
                                EndIf
                                If (0.6 < entityy(local3\Field19\Field32[$00]\Field82, $00, 1.0)) Then
                                    entitytype(local3\Field19\Field32[$00]\Field82, $00, $00)
                                EndIf
                            Else
                                animatenpc(local3\Field19\Field32[$00], 11.0, 19.0, 0.25, $00)
                                If (local3\Field0 = $00) Then
                                    loadeventsound(local3, "SFX\Character\BodyFall.ogg", $00)
                                    playsoundex(local3\Field0, camera, local3\Field19\Field32[$00]\Field82, 10.0, 1.0, $00, $00)
                                    local5 = createdecal($00, local3\Field19\Field40, (local3\Field19\Field3 + 0.005), local3\Field19\Field37, 90.0, rnd(360.0, 0.0), 0.0, 0.4, 0.8, $00, $01, $00, $00, $00)
                                    entityparent(local5\Field0, local3\Field19\Field15, $01)
                                EndIf
                                If (18.9 <= local3\Field19\Field32[$00]\Field103) Then
                                    local3\Field19\Field32[$00]\Field1 = $01
                                    removeevent(local3)
                                EndIf
                            EndIf
                        EndIf
                    EndIf
                Else
                    removeevent(local3)
                EndIf
            Case $3F
                If (playerroom = local3\Field19) Then
                    If (0.0 = local3\Field4) Then
                        If (rand($C8, $01) = $01) Then
                            local3\Field4 = 1.0
                        EndIf
                    EndIf
                EndIf
                If (0.0 < local3\Field4) Then
                    While (5.0 > local3\Field4)
                        If (rand($78, $01) = $01) Then
                            local5 = createdecal($00, (local3\Field19\Field40 + rnd(-2.0, 2.0)), (local3\Field19\Field3 + 0.005), (local3\Field19\Field37 + rnd(-2.0, 2.0)), 90.0, rnd(360.0, 0.0), 0.0, 0.05, 0.8, $00, $01, $00, $00, $00)
                            local5\Field14 = 0.0015
                            entityparent(local5\Field0, local3\Field19\Field15, $01)
                            playsoundex(snd_i\Field1[$00], camera, local5\Field0, 2.0, 0.5, $00, $00)
                            local3\Field4 = (local3\Field4 + 1.0)
                        EndIf
                    Wend
                EndIf
                If (5.0 = local3\Field4) Then
                    If (local3\Field19\Field32[$00] = Null) Then
                        If (rand($C8, $01) = $01) Then
                            tformpoint(-245.0, 56.0, 0.0, local3\Field19\Field15, $00)
                            local3\Field19\Field32[$00] = createnpc($16, tformedx(), tformedy(), tformedz())
                            local3\Field19\Field32[$00]\Field66 = -1.0
                            local3\Field19\Field32[$00]\Field57 = -1.0
                            local3\Field19\Field32[$00]\Field1 = $01
                            rotateentity(local3\Field19\Field32[$00]\Field82, 0.0, ((Float local3\Field19\Field21) + 270.0), 0.0, $00)
                            setnpcframe(local3\Field19\Field32[$00], 41.0, $01)
                            changenpctextureid(local3\Field19\Field32[$00], $17)
                            tformpoint(-223.95, 135.0, 0.0, local3\Field19\Field15, $00)
                            local5 = createdecal($00, tformedx(), tformedy(), tformedz(), 0.0, ((Float local3\Field19\Field21) + 90.0), 0.0, 0.5, 0.0, $00, $01, $00, $00, $00)
                            local5\Field14 = 0.003
                            local5\Field5 = 0.002
                            local5\Field1 = 90000.0
                            playsound_strict(snd_i\Field40[$0D], $00, $00)
                        EndIf
                    EndIf
                EndIf
                If (local3\Field19\Field32[$00] <> Null) Then
                    If (playerroom = local3\Field19) Then
                        lightvolume = curvevalue(0.4, lightvolume, 10.0)
                        XZ0260X8X2\Field76 = min((XZ0260X8X2\Field76 - (((0.15 / entitydistance(local3\Field19\Field32[$00]\Field82, XZ0260X8X2\Field74)) * XZ0260X8X2\Field76) * fps\Field3[$00])), XZ0260X8X2\Field76)
                    EndIf
                    local108 = local3\Field19\Field32[$00]\Field103
                    animatenpc(local3\Field19\Field32[$00], 41.0, 60.0, (((Float (48.0 < animtime(local3\Field19\Field32[$00]\Field98))) * 0.25) + 0.02), $00)
                    If (((52.0 >= local108) And (52.0 < local3\Field19\Field32[$00]\Field103)) <> 0) Then
                        playsoundex(snd_i\Field50[$00], camera, local3\Field19\Field32[$00]\Field82, 4.0, 0.8, $00, $00)
                    EndIf
                    If (59.9 < local3\Field19\Field32[$00]\Field103) Then
                        removeevent(local3)
                    EndIf
                EndIf
            Case $40
                If (0.0 = local3\Field4) Then
                    local5 = createdecal($00, (local3\Field19\Field40 + rnd(-0.5, 0.5)), (local3\Field19\Field3 + 0.005), (local3\Field19\Field37 + rnd(-0.5, 0.5)), 90.0, rnd(360.0, 0.0), 0.0, 2.5, 1.0, $00, $01, $00, $00, $00)
                    entityparent(local5\Field0, local3\Field19\Field15, $01)
                    local3\Field4 = 1.0
                ElseIf (playerroom = local3\Field19) Then
                    If (snd_i\Field9 = $00) Then
                        snd_i\Field9 = loadsound_strict("SFX\Room\Sinkhole.ogg")
                    EndIf
                    local3\Field2 = loopsoundex(snd_i\Field9, local3\Field2, camera, local3\Field19\Field15, 4.5, 1.5, $00)
                    If (((0.8 > local3\Field19\Field39) And (chs\Field8 = $00)) <> 0) Then
                        If (0.0 = local3\Field7) Then
                            playsound_strict(loadtempsound("SFX\Room\SinkholeFall.ogg"), $00, $00)
                        EndIf
                        makemeunplayable($01)
                        local34 = curvevalue(entityx(local3\Field19\Field15, $00, 1.0), entityx(XZ0260X8X2\Field74, $00, 1.0), 10.0)
                        local35 = curvevalue((entityy(local3\Field19\Field15, $00, 1.0) - local3\Field7), entityy(XZ0260X8X2\Field74, $00, 1.0), 25.0)
                        local36 = curvevalue(entityz(local3\Field19\Field15, $00, 1.0), entityz(XZ0260X8X2\Field74, $00, 1.0), 10.0)
                        positionentity(XZ0260X8X2\Field74, local34, local35, local36, $01)
                        XZ0260X8X2\Field16 = 0.0
                        resetentity(XZ0260X8X2\Field74)
                        local3\Field7 = min((local3\Field7 + (fps\Field3[$00] / 200.0)), 2.0)
                        XZ0260X8X2\Field8 = min((local3\Field7 * 5.0), 10.0)
                        XZ0260X8X2\Field64 = (local3\Field7 * 500.0)
                        If (0.2 <= local3\Field7) Then
                            XZ0260X8X2\Field53 = -10.0
                            If (3.0 = n_i\Field2\Field66) Then
                                n_i\Field2\Field64 = 0.0
                            EndIf
                        EndIf
                        If (2.0 = local3\Field7) Then
                            movetopocketdimension()
                        EndIf
                    ElseIf (chs\Field7 <> 0) Then
                        XZ0260X8X2\Field38 = $02
                    EndIf
                Else
                    local3\Field7 = 0.0
                EndIf
            Case $42
                If (0.0 = local3\Field4) Then
                    If (playerroom = local3\Field19) Then
                        local3\Field4 = (rnd(50.0, 100.0) * 70.0)
                    EndIf
                Else
                    local3\Field4 = (local3\Field4 - fps\Field3[$00])
                    If (playerinreachableroom($01, $00, $01) <> 0) Then
                        If (1190.0 > local3\Field4) Then
                            If (1190.0 <= (local3\Field4 + fps\Field3[$00])) Then
                                local3\Field2 = playsound_strict(loadtempsound("SFX\SCP\682\Roar.ogg"), $00, $00)
                            EndIf
                            If (980.0 < local3\Field4) Then
                                XZ0260X8X2\Field14 = 0.5
                            EndIf
                            If (((420.0 < local3\Field4) And (665.0 > local3\Field4)) <> 0) Then
                                XZ0260X8X2\Field14 = 2.0
                            EndIf
                        EndIf
                    EndIf
                    If (70.0 > local3\Field4) Then
                        removeevent(local3)
                    EndIf
                EndIf
            Case $43
                If (8.0 > local3\Field19\Field39) Then
                    createnpc($11, local3\Field19\Field40, (local3\Field19\Field3 + 0.3), local3\Field19\Field37)
                    removeevent(local3)
                EndIf
            Case $44
                local23 = $00
                If (rand($46, $01) = $01) Then
                    If (((isroomadjacent(playerroom, local3\Field19) Lor (playerroom = local3\Field19)) And (infacility = $00)) <> 0) Then
                        If (0.5 > local3\Field7) Then
                            XZ0260X8X2\Field8 = max(1.0, XZ0260X8X2\Field8)
                        EndIf
                        local23 = $01
                    EndIf
                EndIf
                If (playerroom = local3\Field19) Then
                    If (local3\Field19\Field27[$00] = $00) Then
                        If (local3\Field19\Field22\Field21 = $0D) Then
                            tformpoint(906.0, 106.0, 876.0, local3\Field19\Field15, $00)
                        Else
                            tformpoint(-876.0, 106.0, 906.0, local3\Field19\Field15, $00)
                        EndIf
                        local3\Field19\Field27[$00] = createpivot($00)
                        positionentity(local3\Field19\Field27[$00], tformedx(), tformedy(), tformedz(), $01)
                    Else
                        If (local23 <> 0) Then
                            settemplatevelocity(particleeffect[$13], -0.007, -0.008, -0.001, 0.0012, -0.007, 0.008)
                            For local20 = $00 To $01 Step $01
                                setemitter(local3\Field19, entityx(local3\Field19\Field27[$00], $01, 1.0), entityy(local3\Field19\Field27[$00], $01, 1.0), entityz(local3\Field19\Field27[$00], $01, 1.0), $13)
                            Next
                            playsoundex(snd_i\Field10, camera, local3\Field19\Field27[$00], 8.0, 0.6, $00, $00)
                        EndIf
                        local34 = (Float updatelever(local3\Field19\Field9[$01]\Field1, $00, $50, -80.0))
                        local36 = (Float updatelever(local3\Field19\Field9[$00]\Field1, $00, $50, -80.0))
                        If ((Int local34) <> 0) Then
                            local3\Field7 = min(1.0, (local3\Field7 + (fps\Field3[$00] / 350.0)))
                            If ((Int local36) <> 0) Then
                                If (local3\Field0 = $00) Then
                                    local3\Field0 = loadsound_strict("SFX\Room\GeneratorOn.ogg")
                                EndIf
                                local3\Field4 = min(1.0, (local3\Field4 + (fps\Field3[$00] / 450.0)))
                            Else
                                local3\Field4 = min(0.0, (local3\Field4 - (fps\Field3[$00] / 450.0)))
                            EndIf
                        Else
                            local3\Field7 = max(0.0, (local3\Field7 - (fps\Field3[$00] / 350.0)))
                            local3\Field4 = max(0.0, (local3\Field4 - (fps\Field3[$00] / 450.0)))
                        EndIf
                        If (0.0 < local3\Field4) Then
                            local3\Field2 = loopsoundex(local3\Field0, local3\Field2, camera, local3\Field19\Field9[$00]\Field0, 3.0, local3\Field4, $00)
                        EndIf
                        If (0.0 < local3\Field7) Then
                            local3\Field8 = loopsoundex(roomambience[$07], local3\Field8, camera, local3\Field19\Field9[$01]\Field0, 2.0, (local3\Field7 * 0.8), $00)
                        EndIf
                    EndIf
                EndIf
            Case $2B
                If (8.0 > local3\Field19\Field39) Then
                    tformpoint(256.0, 55.2, 256.0, local3\Field19\Field15, $00)
                    local1 = createnpc($16, tformedx(), tformedy(), tformedz())
                    local1\Field57 = -1.0
                    local1\Field1 = $01
                    changenpctextureid(local1, $13)
                    setnpcframe(local1, 19.0, $01)
                    rotateentity(local1\Field82, 0.0, ((Float local3\Field19\Field21) - 30.0), 0.0, $01)
                    removeevent(local3)
                EndIf
            Case $0A
                If (6.0 > local3\Field19\Field39) Then
                    If (local3\Field19\Field32[$00] = Null) Then
                        tformpoint(-156.0, 71.0, 121.0, local3\Field19\Field15, $00)
                        local3\Field19\Field32[$00] = createnpc($17, tformedx(), tformedy(), tformedz())
                        local3\Field19\Field32[$00]\Field66 = 8.0
                        local3\Field19\Field32[$00]\Field1 = $01
                        setnpcframe(local3\Field19\Field32[$00], 288.0, $01)
                        rotateentity(local3\Field19\Field32[$00]\Field82, 0.0, ((Float local3\Field19\Field21) + 225.0), 0.0, $01)
                    EndIf
                EndIf
                If (playerroom = local3\Field19) Then
                    local3\Field2 = loopsoundex(snd_i\Field28[$01], local3\Field2, camera, local3\Field19\Field15, 5.0, 1.0, $00)
                    If (9.0 > entitydistancesquared(XZ0260X8X2\Field74, local3\Field19\Field27[$00])) Then
                        If (rand($32, $01) = $01) Then
                            settemplatevelocity(particleeffect[$13], -0.007, -0.008, -0.001, 0.0012, -0.007, 0.008)
                            setemitter(local3\Field19, entityx(local3\Field19\Field27[$00], $01, 1.0), entityy(local3\Field19\Field27[$00], $01, 1.0), entityz(local3\Field19\Field27[$00], $01, 1.0), $13)
                            playsoundex(snd_i\Field10, camera, local3\Field19\Field27[$00], 3.0, 0.4, $00, $00)
                        EndIf
                    EndIf
                EndIf
            Case $47
                local109 = (local3\Field19\Field27[$01] <> $00)
                local110 = ((Float (local3\Field19\Field22\Field21 = $75)) * 2.3)
                If (playerroom = local3\Field19) Then
                    local3\Field1 = (Float updatelever(local3\Field19\Field9[$00]\Field1, $00, $50, -80.0))
                    If (0.0 = local3\Field4) Then
                        If (((((0.64 + local110) > entitydistancesquared(local3\Field19\Field27[$00], XZ0260X8X2\Field74)) And (0.0 = local3\Field7)) And (1.0 = local3\Field1)) <> 0) Then
                            If (local109 <> 0) Then
                                loadeventsound(local3, "SFX\Room\SparkLong.ogg", $01)
                                If (local3\Field8 <> $00) Then
                                    StopChannel(local3\Field8)
                                    local3\Field8 = $00
                                EndIf
                                local3\Field8 = playsoundex(local3\Field30, camera, local3\Field19\Field27[$01], 5.0, 1.0, $00, $00)
                            EndIf
                            StopChannel(local3\Field2)
                            local3\Field2 = $00
                            loadeventsound(local3, "SFX\Room\Airlock.ogg", $00)
                            For local20 = $00 To (((local3\Field19\Field22\Field21 = $75) Shl $01) + $01) Step $01
                                local3\Field19\Field25[local20]\Field27 = $01
                                openclosedoor(local3\Field19\Field25[local20], $01, $00)
                            Next
                            playsound_strict(snd_i\Field28[$02], $00, $00)
                            playsound_strict(loadtempsound("SFX\Alarm\DeconInProgress.ogg"), $00, $00)
                            local3\Field4 = 0.01
                        ElseIf ((5.29 + local110) < entitydistancesquared(local3\Field19\Field27[$00], XZ0260X8X2\Field74)) Then
                            local3\Field7 = 0.0
                        EndIf
                    ElseIf (630.0 > local3\Field4) Then
                        local3\Field4 = (local3\Field4 + fps\Field3[$00])
                        For local20 = $00 To (((local3\Field19\Field22\Field21 = $75) Shl $01) + $01) Step $01
                            If (local3\Field19\Field25[local20]\Field21 = $00) Then
                                local3\Field19\Field25[local20]\Field39 = $00
                            EndIf
                        Next
                        If (((70.0 > local3\Field4) And (70.0 <= (local3\Field4 - fps\Field3[$00]))) <> 0) Then
                            If (local109 <> 0) Then
                                setemitter(local3\Field19, entityx(local3\Field19\Field27[$01], $01, 1.0), entityy(local3\Field19\Field27[$01], $01, 1.0), entityz(local3\Field19\Field27[$01], $01, 1.0), $10)
                            EndIf
                        ElseIf (((210.0 < local3\Field4) And (490.0 > local3\Field4)) <> 0) Then
                            If ((4.0 + local110) > entitydistancesquared(local3\Field19\Field27[$00], XZ0260X8X2\Field74)) Then
                                If (((T8660BZ460\Field3 = $00) And (T8660BZ460\Field10 = $00)) <> 0) Then
                                    XZ0260X8X2\Field70 = max(70.0, XZ0260X8X2\Field70)
                                EndIf
                            EndIf
                            For local20 = $00 To (((local3\Field19\Field22\Field21 = $75) Shl $02) + $01) Step $01
                                If (local3\Field19\Field17[local20] = Null) Then
                                    Select local3\Field19\Field22\Field21
                                        Case $10
                                            tformpoint(320.0, 360.0, ((220.0 * (Float local20)) - 110.0), local3\Field19\Field15, $00)
                                        Case $67
                                            tformpoint(((220.0 * (Float local20)) - 110.0), 360.0, 320.0, local3\Field19\Field15, $00)
                                        Case $75
                                            tformpoint((((Float (local20 - ((local20 > $02) * $03))) * 266.0) + -266.0), 476.0, (116.0 - ((Float (local20 > $02)) * 232.0)), local3\Field19\Field15, $00)
                                    End Select
                                    local3\Field19\Field17[local20] = setemitter(local3\Field19, tformedx(), tformedy(), tformedz(), $02)
                                EndIf
                            Next
                            If (ChannelPlaying(local3\Field2) = $00) Then
                                local3\Field2 = playsoundex(local3\Field0, camera, local3\Field19\Field27[$00], 5.0, 1.0, $00, $00)
                            EndIf
                        EndIf
                    Else
                        For local20 = $00 To (((local3\Field19\Field22\Field21 = $75) Shl $02) + $01) Step $01
                            If (local3\Field19\Field17[local20] <> Null) Then
                                freeemitter(local3\Field19\Field17[local20], $00)
                            EndIf
                            If (local20 < $04) Then
                                If (local3\Field19\Field25[local20]\Field39 = $00) Then
                                    openclosedoor(local3\Field19\Field25[local20], $01, $00)
                                EndIf
                                local3\Field19\Field25[local20]\Field27 = $00
                            EndIf
                        Next
                        If (local3\Field8 <> $00) Then
                            StopChannel(local3\Field8)
                            local3\Field8 = $00
                        EndIf
                        local3\Field8 = playsoundex(loadtempsound("SFX\Alarm\DeconCompleted.ogg"), camera, local3\Field19\Field27[$00], 5.0, 1.0, $01, $00)
                        local3\Field4 = 0.0
                        local3\Field7 = 1.0
                    EndIf
                    updatesoundorigin(local3\Field8, camera, local3\Field19\Field27[$01], 5.0, 1.0, $00, $01, $00)
                    updatesoundorigin(local3\Field2, camera, local3\Field19\Field27[$00], 5.0, 1.0, $00, $01, $00)
                Else
                    local3\Field7 = 0.0
                EndIf
            Case $0C
                If (playerroom = local3\Field19) Then
                    If (0.0 = local3\Field4) Then
                        If (0.0 = local3\Field7) Then
                            local3\Field7 = -105.0
                        EndIf
                        local3\Field4 = 1.0
                    EndIf
                EndIf
                local112 = ((n_i\Field8 <> Null) And (66.0 = n_i\Field8\Field66))
                If (local112 = $00) Then
                    If (1.0 = local3\Field4) Then
                        If (0.0 > local3\Field7) Then
                            If (0.0 = local3\Field1) Then
                                local3\Field7 = min((local3\Field7 + fps\Field3[$00]), 0.0)
                            EndIf
                        ElseIf (0.0 = local3\Field7) Then
                            local113 = 0.0
                            local114 = 0.0
                            local115 = $FFFFFFFF
                            local116 = $FFFFFFFF
                            For local20 = $00 To $03 Step $01
                                If (local3\Field19\Field10[local20] <> Null) Then
                                    If (local115 = $FFFFFFFF) Then
                                        local113 = entitydistancesquared(local3\Field19\Field27[$0E], local3\Field19\Field10[local20]\Field51)
                                        local115 = local20
                                    Else
                                        local114 = entitydistancesquared(local3\Field19\Field27[$0E], local3\Field19\Field10[local20]\Field51)
                                        local116 = local20
                                    EndIf
                                EndIf
                            Next
                            If (n_i\Field8 = Null) Then
                                If (local114 < local113) Then
                                    n_i\Field8 = createnpc($03, entityx(local3\Field19\Field10[local115]\Field51, $00, 1.0), entityy(local3\Field19\Field27[$0E], $01, 1.0), entityz(local3\Field19\Field10[local115]\Field51, $00, 1.0))
                                Else
                                    n_i\Field8 = createnpc($03, entityx(local3\Field19\Field10[local116]\Field51, $00, 1.0), entityy(local3\Field19\Field27[$0E], $01, 1.0), entityz(local3\Field19\Field10[local116]\Field51, $00, 1.0))
                                EndIf
                                giveachievement("049", $01)
                            Else
                                If (local114 < local113) Then
                                    positionentity(n_i\Field8\Field82, entityx(local3\Field19\Field10[local115]\Field51, $00, 1.0), entityy(local3\Field19\Field27[$0E], $01, 1.0), entityz(local3\Field19\Field10[local115]\Field51, $00, 1.0), $01)
                                Else
                                    positionentity(n_i\Field8\Field82, entityx(local3\Field19\Field10[local116]\Field51, $00, 1.0), entityy(local3\Field19\Field27[$0E], $01, 1.0), entityz(local3\Field19\Field10[local116]\Field51, $00, 1.0), $01)
                                EndIf
                                resetentity(n_i\Field8\Field82)
                            EndIf
                            pointentity(n_i\Field8\Field82, local3\Field19\Field15, 0.0)
                            moveentity(n_i\Field8\Field82, 0.0, 0.0, -1.0, $00)
                            local3\Field19\Field32[$00] = n_i\Field8
                            local3\Field19\Field32[$00]\Field22 = $00
                            local3\Field19\Field32[$00]\Field60 = entityx(XZ0260X8X2\Field74, $00, 1.0)
                            local3\Field19\Field32[$00]\Field74 = entityz(XZ0260X8X2\Field74, $00, 1.0)
                            local3\Field19\Field32[$00]\Field66 = 4.0
                            local3\Field19\Field32[$00]\Field13 = $02
                            local3\Field7 = 1.0
                        ElseIf (1.0 = local3\Field7) Then
                            If (local3\Field19\Field32[$00]\Field30 <> $01) Then
                                local3\Field19\Field32[$00]\Field30 = findpath(local3\Field19\Field32[$00], entityx(local3\Field19\Field27[$0F], $01, 1.0), entityy(local3\Field19\Field27[$0F], $01, 1.0), entityz(local3\Field19\Field27[$0F], $01, 1.0))
                            Else
                                local3\Field7 = 2.0
                            EndIf
                        ElseIf (2.0 = local3\Field7) Then
                            If (local3\Field19\Field32[$00]\Field30 <> $01) Then
                                local3\Field19\Field32[$00]\Field57 = 1.0
                                local3\Field19\Field32[$00]\Field8 = 0.0
                                local3\Field7 = 3.0
                            ElseIf (25.0 > entitydistancesquared(local3\Field19\Field32[$00]\Field82, local3\Field19\Field25[$00]\Field51)) Then
                                For local20 = $00 To $01 Step $01
                                    local3\Field19\Field25[local20]\Field21 = $01
                                    If (local3\Field19\Field25[local20]\Field39 = $00) Then
                                        openclosedoor(local3\Field19\Field25[local20], $01, $00)
                                    EndIf
                                Next
                                If (0.0 = local3\Field19\Field32[$00]\Field62) Then
                                    playsoundex(snd_i\Field26, camera, local3\Field19\Field25[$01]\Field51, 7.0, 1.0, $00, $00)
                                    local3\Field19\Field32[$00]\Field70 = 0.0
                                    local3\Field19\Field32[$00]\Field62 = 1.0
                                EndIf
                            EndIf
                            If (4.0 <> local3\Field19\Field32[$00]\Field66) Then
                                local3\Field7 = 7.0
                            EndIf
                        ElseIf (3.0 = local3\Field7) Then
                            If (4.0 <> local3\Field19\Field32[$00]\Field66) Then
                                local3\Field7 = 7.0
                            EndIf
                            If (npcseesplayer(local3\Field19\Field32[$00], ((8.0 - XZ0260X8X2\Field46) + XZ0260X8X2\Field68), 60.0, $01) = $02) Then
                                local3\Field7 = 4.0
                            EndIf
                            If (local3\Field19\Field32[$00]\Field30 <> $01) Then
                                If (0.0 = local3\Field19\Field32[$00]\Field8) Then
                                    If (local3\Field19\Field32[$00]\Field13 = $01) Then
                                        If (local3\Field19\Field32[$00]\Field6 = $00) Then
                                            local3\Field19\Field32[$00]\Field67 = loadsound_strict("SFX\SCP\049\Room2SL0.ogg")
                                            local3\Field19\Field32[$00]\Field6 = playsoundex(local3\Field19\Field32[$00]\Field67, camera, local3\Field19\Field32[$00]\Field82, 10.0, 1.0, $01, $00)
                                        ElseIf (ChannelPlaying(local3\Field19\Field32[$00]\Field6) = $00) Then
                                            local3\Field19\Field32[$00]\Field8 = 1.0
                                            local3\Field19\Field32[$00]\Field6 = $00
                                        EndIf
                                    ElseIf (local3\Field19\Field32[$00]\Field13 = $02) Then
                                        If (3.0 = local3\Field19\Field32[$00]\Field57) Then
                                            If (local3\Field19\Field32[$00]\Field6 = $00) Then
                                                local3\Field19\Field32[$00]\Field67 = loadsound_strict("SFX\SCP\049\Room2SL1.ogg")
                                                local3\Field19\Field32[$00]\Field6 = playsoundex(local3\Field19\Field32[$00]\Field67, camera, local3\Field19\Field32[$00]\Field82, 10.0, 1.0, $01, $00)
                                            ElseIf (ChannelPlaying(local3\Field19\Field32[$00]\Field6) = $00) Then
                                                local3\Field19\Field32[$00]\Field8 = 1.0
                                                local3\Field19\Field32[$00]\Field6 = $00
                                            EndIf
                                        ElseIf (1118.0 <= local3\Field19\Field32[$00]\Field103) Then
                                            local3\Field19\Field32[$00]\Field8 = 1.0
                                        EndIf
                                    EndIf
                                Else
                                    Select local3\Field19\Field32[$00]\Field57
                                        Case 1.0
                                            local3\Field19\Field32[$00]\Field30 = findpath(local3\Field19\Field32[$00], entityx(local3\Field19\Field27[$10], $01, 1.0), entityy(local3\Field19\Field27[$10], $01, 1.0), entityz(local3\Field19\Field27[$10], $01, 1.0))
                                            local3\Field19\Field32[$00]\Field13 = $01
                                        Case 2.0
                                            local3\Field19\Field32[$00]\Field30 = findpath(local3\Field19\Field32[$00], entityx(local3\Field19\Field27[$0F], $01, 1.0), entityy(local3\Field19\Field27[$0F], $01, 1.0), entityz(local3\Field19\Field27[$0F], $01, 1.0))
                                            local3\Field19\Field32[$00]\Field13 = $02
                                        Case 3.0
                                            local3\Field19\Field32[$00]\Field30 = findpath(local3\Field19\Field32[$00], entityx(local3\Field19\Field27[$11], $01, 1.0), entityy(local3\Field19\Field27[$11], $01, 1.0), entityz(local3\Field19\Field27[$11], $01, 1.0))
                                            local3\Field19\Field32[$00]\Field13 = $02
                                        Case 4.0
                                            local3\Field19\Field32[$00]\Field30 = findpath(local3\Field19\Field32[$00], local3\Field19\Field32[$00]\Field60, 0.1, local3\Field19\Field32[$00]\Field74)
                                            local3\Field19\Field32[$00]\Field13 = $02
                                        Case 5.0
                                            local3\Field7 = 5.0
                                    End Select
                                    local3\Field19\Field32[$00]\Field8 = 0.0
                                    local3\Field19\Field32[$00]\Field57 = (local3\Field19\Field32[$00]\Field57 + 1.0)
                                EndIf
                            EndIf
                        ElseIf (4.0 = local3\Field7) Then
                            If (4.0 <> local3\Field19\Field32[$00]\Field66) Then
                                local3\Field7 = 7.0
                                local3\Field19\Field32[$00]\Field57 = 6.0
                            EndIf
                        ElseIf (5.0 = local3\Field7) Then
                            local3\Field19\Field32[$00]\Field66 = 2.0
                            For local2 = Each rooms
                                If (local2 <> playerroom) Then
                                    If (((((hidedistance * 2.0) * (hidedistance * 2.0)) > entitydistancesquared(local2\Field15, local3\Field19\Field32[$00]\Field82)) And ((hidedistance * hidedistance) < entitydistancesquared(local2\Field15, local3\Field19\Field32[$00]\Field82))) <> 0) Then
                                        local3\Field19\Field32[$00]\Field30 = findpath(local3\Field19\Field32[$00], entityx(local2\Field15, $00, 1.0), entityy(local2\Field15, $00, 1.0), entityz(local2\Field15, $00, 1.0))
                                        local3\Field19\Field32[$00]\Field8 = 0.0
                                        If (local3\Field19\Field32[$00]\Field30 = $01) Then
                                            local3\Field7 = 6.0
                                        EndIf
                                        Exit
                                    EndIf
                                EndIf
                            Next
                        ElseIf (6.0 = local3\Field7) Then
                            If ((((npcseesplayer(local3\Field19\Field32[$00], ((8.0 - XZ0260X8X2\Field46) + XZ0260X8X2\Field68), 60.0, $01) = $01) Lor (0.0 < local3\Field19\Field32[$00]\Field65)) Lor (local3\Field19\Field32[$00]\Field17 > $00)) <> 0) Then
                                local3\Field7 = 7.0
                            Else
                                If (playerroom = local3\Field19) Then
                                    shouldplay = $13
                                EndIf
                                If (((local3\Field19\Field32[$00]\Field90 <> playerroom) Lor (0.0 > entityy(local3\Field19\Field32[$00]\Field82, $00, 1.0))) <> 0) Then
                                    local3\Field19\Field32[$00]\Field31 = 4200.0
                                    positionentity(local3\Field19\Field32[$00]\Field82, 0.0, -500.0, 0.0, $00)
                                    resetentity(local3\Field19\Field32[$00]\Field82)
                                    local3\Field7 = 7.0
                                EndIf
                            EndIf
                        EndIf
                        If (local3\Field19\Field32[$00] <> Null) Then
                            If (playerroom = local3\Field19) Then
                                If (7.0 > local3\Field7) Then
                                    If (2.0 < local3\Field7) Then
                                        If (1.0 < (Abs (entityy(local3\Field19\Field25[$00]\Field51, $00, 1.0) - entityy(local3\Field19\Field32[$00]\Field82, $00, 1.0)))) Then
                                            If (1.0 > (Abs (entityy(local3\Field19\Field25[$00]\Field51, $00, 1.0) - entityy(XZ0260X8X2\Field74, $00, 1.0)))) Then
                                                If (local3\Field19\Field25[$00]\Field39 <> 0) Then
                                                    If (local3\Field2 <> $00) Then
                                                        stopstream_strict(local3\Field2)
                                                        local3\Field2 = $00
                                                        local3\Field20 = $00
                                                    EndIf
                                                    local3\Field2 = streamsound_strict("SFX\SCP\079\Stairs.ogg", (opt\Field59 * opt\Field2), $00)
                                                    local3\Field20 = $01
                                                    playsoundex(snd_i\Field52, camera, local3\Field19\Field25[$00]\Field51, 7.0, 1.0, $00, $00)
                                                    local3\Field19\Field32[$00]\Field57 = 4.0
                                                    local3\Field19\Field25[$00]\Field27 = $01
                                                    openclosedoor(local3\Field19\Field25[$00], $01, $00)
                                                EndIf
                                            EndIf
                                        ElseIf (local3\Field19\Field25[$00]\Field39 = $00) Then
                                            playsoundex(snd_i\Field26, camera, local3\Field19\Field25[$00]\Field51, 7.0, 1.0, $00, $00)
                                            local3\Field19\Field25[$00]\Field27 = $00
                                            openclosedoor(local3\Field19\Field25[$00], $01, $00)
                                        EndIf
                                    EndIf
                                ElseIf (local3\Field19\Field25[$00]\Field39 = $00) Then
                                    local3\Field19\Field25[$00]\Field27 = $00
                                    openclosedoor(local3\Field19\Field25[$00], $01, $00)
                                    playsoundex(snd_i\Field26, camera, local3\Field19\Field25[$00]\Field51, 7.0, 1.0, $00, $00)
                                EndIf
                            EndIf
                        EndIf
                    EndIf
                EndIf
                If (playerroom = local3\Field19) Then
                    local3\Field1 = (Float updatelever(local3\Field19\Field9[$00]\Field1, (0.0 = local3\Field1), $50, -80.0))
                    If (0.0 = local3\Field1) Then
                        turncheckpointmonitorsoff($01)
                        entitytexture(local3\Field19\Field27[$12], local3\Field19\Field26[$00], $00, $00)
                        GUESSEDfreeentity_7(local3\Field19\Field27[$12], $420, $00)
                    Else
                        updatecheckpointmonitors($01)
                        local118 = ((50.0 > mon_i\Field0[$00]) + $01)
                        entitytexture(local3\Field19\Field27[$12], local3\Field19\Field26[$00], local118, $00)
                        GUESSEDfreeentity_7(local3\Field19\Field27[$12], $420, local118)
                    EndIf
                    If (isequal(entityy(local3\Field19\Field25[$00]\Field51, $00, 1.0), entityy(XZ0260X8X2\Field74, $01, 1.0), 1.0) = $00) Then
                        For local20 = $00 To $0D Step $01
                            If (local3\Field19\Field27[local20] <> $00) Then
                                If (0.1 < secondarylighton) Then
                                    If (entityhidden(local3\Field19\Field27[local20]) <> 0) Then
                                        showentity(local3\Field19\Field27[local20])
                                    EndIf
                                ElseIf (entityhidden(local3\Field19\Field27[local20]) = $00) Then
                                    hideentity(local3\Field19\Field27[local20])
                                EndIf
                            EndIf
                        Next
                        For local13 = Each securitycams
                            If (local13\Field6 = local3\Field19) Then
                                If (entityhidden(local13\Field15) <> 0) Then
                                    showentity(local13\Field15)
                                EndIf
                                Exit
                            EndIf
                        Next
                        updateredlight(local3\Field19\Field16[$00], 1500.0, 800.0)
                        If ((millisec Mod $5DC) < $0A) Then
                            local3\Field23 = ((local3\Field23 + 1.0) Mod 6.0)
                            For local20 = $14 To $16 Step $01
                                entitytexture(local3\Field19\Field27[local20], local3\Field19\Field26[$02], (Int local3\Field23), $00)
                                GUESSEDfreeentity_7(local3\Field19\Field27[local20], $420, (Int local3\Field23))
                            Next
                        EndIf
                        For local4 = Each events
                            If (local4\Field32 = $23) Then
                                If (2.0 = local4\Field4) Then
                                    mon_i\Field1[$01] = $00
                                    entitytexture(local3\Field19\Field27[$13], local3\Field19\Field26[$02], (Int local3\Field23), $00)
                                    GUESSEDfreeentity_7(local3\Field19\Field27[$13], $420, (Int local3\Field23))
                                Else
                                    mon_i\Field1[$01] = $01
                                    local118 = ((50.0 > mon_i\Field0[$01]) + $06)
                                    entitytexture(local3\Field19\Field27[$13], local3\Field19\Field26[$01], local118, $00)
                                    GUESSEDfreeentity_7(local3\Field19\Field27[$13], $420, local118)
                                EndIf
                                Exit
                            EndIf
                        Next
                    Else
                        For local20 = $00 To $0D Step $01
                            If (local3\Field19\Field27[local20] <> $00) Then
                                If (entityhidden(local3\Field19\Field27[local20]) = $00) Then
                                    hideentity(local3\Field19\Field27[local20])
                                EndIf
                            EndIf
                        Next
                        For local13 = Each securitycams
                            If (local13\Field6 = local3\Field19) Then
                                If (entityhidden(local13\Field15) = $00) Then
                                    hideentity(local13\Field15)
                                EndIf
                                Exit
                            EndIf
                        Next
                    EndIf
                EndIf
            Case $3D
                If (hidedistance > local3\Field19\Field39) Then
                    If (2.0 <> local3\Field4) Then
                        If (playerroom = local3\Field19) Then
                            local3\Field4 = 2.0
                        EndIf
                        If (n_i\Field10 <> Null) Then
                            If ((((1.0 <> n_i\Field10\Field66) Lor (1600.0 > entitydistancesquared(n_i\Field10\Field82, XZ0260X8X2\Field74))) Lor (entitydistancesquared(n_i\Field10\Field82, XZ0260X8X2\Field74) < entitydistancesquared(n_i\Field10\Field82, local3\Field19\Field15))) <> 0) Then
                                local3\Field4 = 2.0
                            EndIf
                            For local4 = Each events
                                If (local4\Field32 = $20) Then
                                    If (((0.0 < local4\Field4) And (local4\Field19\Field32[$00] <> Null)) <> 0) Then
                                        local3\Field4 = 2.0
                                        Exit
                                    EndIf
                                EndIf
                            Next
                            For local2 = Each rooms
                                If (local2\Field22\Field21 = $28) Then
                                    If (10.0 > local2\Field39) Then
                                        local3\Field4 = 2.0
                                        Exit
                                    EndIf
                                EndIf
                            Next
                        EndIf
                        For local4 = Each events
                            If (local4\Field32 = $20) Then
                                If (0.0 = local4\Field4) Then
                                    local3\Field4 = 2.0
                                    Exit
                                EndIf
                            EndIf
                        Next
                    EndIf
                    If (0.0 = local3\Field4) Then
                        local120 = local3\Field19\Field22\Field21
                        Select local120
                            Case $42,$43,$44,$47,$48
                                If (((local120 = $47) Lor (local120 = $48)) <> 0) Then
                                    local119 = rand($00, $03)
                                Else
                                    local119 = rand($00, $02)
                                EndIf
                                Select local119
                                    Case $00
                                        local34 = -108.0
                                        local36 = 0.0
                                    Case $01
                                        local34 = 0.0
                                        local36 = -108.0
                                    Case $02
                                        local34 = 108.0
                                        local36 = 0.0
                                    Case $03
                                        local34 = 0.0
                                        local36 = 108.0
                                End Select
                            Default
                                local34 = 0.0
                                local36 = 0.0
                        End Select
                        tformpoint(local34, 200.0, local36, local3\Field19\Field15, $00)
                        If (n_i\Field10 <> Null) Then
                            teleportentity(n_i\Field10\Field82, tformedx(), (local3\Field19\Field3 + 0.5), tformedz(), n_i\Field10\Field23, $01, 2.0, $00)
                            n_i\Field10\Field90 = local3\Field19
                        Else
                            n_i\Field10 = createnpc($06, tformedx(), (local3\Field19\Field3 + 0.5), tformedz())
                        EndIf
                        n_i\Field10\Field66 = 1.0
                        pointentity(n_i\Field10\Field82, XZ0260X8X2\Field74, 0.0)
                        rotateentity(n_i\Field10\Field82, 0.0, (entityyaw(n_i\Field10\Field82, $00, 1.0) + 180.0), 0.0, $00)
                        local3\Field4 = 1.0
                    ElseIf (1.0 = local3\Field4) Then
                        pointentity(n_i\Field10\Field82, XZ0260X8X2\Field74, 0.0)
                        rotateentity(n_i\Field10\Field82, 0.0, (entityyaw(n_i\Field10\Field82, $00, 1.0) + 180.0), 0.0, $00)
                        If (((hidedistance * 0.5) * (hidedistance * 0.5)) > entitydistancesquared(n_i\Field10\Field82, XZ0260X8X2\Field74)) Then
                            If (entityvisible(n_i\Field10\Field82, camera, 0.0) <> 0) Then
                                pointentity(n_i\Field10\Field82, XZ0260X8X2\Field74, 0.0)
                                rotateentity(n_i\Field10\Field82, 0.0, (entityyaw(n_i\Field10\Field82, $00, 1.0) + rnd(170.0, 190.0)), 0.0, $00)
                                local3\Field4 = 2.0
                            EndIf
                        EndIf
                    ElseIf (3.0 = local3\Field4) Then
                        local3\Field4 = 2.0
                    EndIf
                ElseIf (2.0 = local3\Field4) Then
                    local3\Field4 = (3.0 - ((Float (rand($FFFFFFFF, ((selecteddifficulty\Field2 Shl $01) + $01)) > $00)) * 3.0))
                EndIf
            Case $38
                If (playerroom = local3\Field19) Then
                    If (0.0 = local3\Field4) Then
                        tformpoint(-820.0, 200.0, -464.0, local3\Field19\Field15, $00)
                        local3\Field19\Field32[$00] = createnpc($01, tformedx(), tformedy(), tformedz())
                        rotateentity(local3\Field19\Field32[$00]\Field82, 0.0, ((Float local3\Field19\Field21) + 270.0), 0.0, $01)
                        local3\Field4 = 1.0
                    ElseIf (1.0 = local3\Field4) Then
                        If (1.96 > entitydistancesquared(local3\Field19\Field32[$00]\Field82, XZ0260X8X2\Field74)) Then
                            XZ0260X8X2\Field8 = 9.0
                            playsound_strict(snd_i\Field11, $00, $00)
                            local3\Field19\Field32[$00]\Field66 = 1.0
                            local3\Field4 = 2.0
                        EndIf
                    EndIf
                    If (local3\Field19\Field27[$01] = $00) Then
                        tformpoint(-910.0, 144.0, -778.0, local3\Field19\Field15, $00)
                        local3\Field19\Field27[$01] = copyentity(n_i\Field9[$1D], $00)
                        scaleentity(local3\Field19\Field27[$01], 0.07, 0.07, 0.07, $00)
                        positionentity(local3\Field19\Field27[$01], tformedx(), tformedy(), tformedz(), $00)
                        rotateentity(local3\Field19\Field27[$01], 6.0, ((Float local3\Field19\Field21) + 180.0), 0.0, $00)
                        entitypickmode(local3\Field19\Field27[$01], $01, $01)
                        entityradius(local3\Field19\Field27[$01], 4.285715, 0.0)
                        local28 = loadtexture_strict("GFX\NPCs\duck(4).png", $01, $00, 1.0)
                        entitytexture(local3\Field19\Field27[$01], local28, $00, $00)
                        deletesingletextureentryfromcache(local28, $00)
                        local28 = $00
                        entityparent(local3\Field19\Field27[$01], local3\Field19\Field15, $01)
                    ElseIf (interactobject(local3\Field19\Field27[$01], 0.8, $00) <> 0) Then
                        createmsg(getlocalstring("msg", "breeze"), 6.0)
                        XZ0260X8X2\Field11 = max(0.0, (XZ0260X8X2\Field11 - rnd(0.3, 0.0)))
                        XZ0260X8X2\Field39 = 0.0
                        playsound_strict(loadtempsound("SFX\SCP\Joke\Quack.ogg"), $00, $00)
                    EndIf
                EndIf
            Case $35
                If (6.0 > local3\Field19\Field39) Then
                    tformpoint(820.0, -288.0, 0.0, local3\Field19\Field15, $00)
                    createnpc($0F, tformedx(), tformedy(), tformedz())
                    removeevent(local3)
                EndIf
            Case $4C
                If (playerroom <> local3\Field19) Then
                    If (local3\Field19\Field27[$00] <> $00) Then
                        For local20 = $01 To $0F Step $01
                            If (((local3\Field19\Field27[local20] <> $00) And (entityhidden(local3\Field19\Field27[local20]) = $00)) <> 0) Then
                                hideentity(local3\Field19\Field27[local20])
                            EndIf
                        Next
                    EndIf
                    If ((entityy(local3\Field19\Field15, $00, 1.0) - 0.5) < entityy(XZ0260X8X2\Field74, $00, 1.0)) Then
                        playerroom = local3\Field19
                    EndIf
                EndIf
                If (2.0 = local3\Field4) Then
                    If (local3\Field2 <> $00) Then
                        stopstream_strict(local3\Field2)
                        local3\Field2 = $00
                        local3\Field20 = $00
                    EndIf
                    StopChannel(local3\Field8)
                    local3\Field8 = $00
                    hideentity(i_1499\Field4)
                    hidechunks()
                    hideroomsnocoll(local3\Field19)
                    For local1 = Each npcs
                        If (local1\Field77 = $12) Then
                            removenpc(local1)
                        EndIf
                    Next
                    For local6 = Each dummy1499_1
                        removedummy1499_1(local6)
                    Next
                    If (local3\Field30 <> $00) Then
                        freesound_strict(local3\Field30)
                        local3\Field30 = $00
                    EndIf
                    If (2100.0 > local3\Field1) Then
                        local3\Field1 = 0.0
                    EndIf
                    local3\Field4 = 1.0
                EndIf
            Case $21
                If (playerroom = local3\Field19) Then
                    updatebutton(local3\Field19\Field27[$01])
                    If (((d_i\Field15 = local3\Field19\Field27[$01]) And XZ0260X8X2\Field3) <> 0) Then
                        createmsg(getlocalstring("msg", "elev.broken"), 6.0)
                        playsoundex(buttonsfx[$01], camera, local3\Field19\Field27[$01], 10.0, 1.0, $00, $00)
                        XZ0260X8X2\Field3 = $00
                    EndIf
                    local123 = (sin(((Float millisec) * 0.05)) * 3.0)
                    rotateentity(local3\Field19\Field27[$02], 0.0, (((Float local3\Field19\Field21) + 90.0) + local123), 0.0, $01)
                    For local20 = $03 To $05 Step $01
                        rotateentity(local3\Field19\Field27[local20], 0.0, ((Float local3\Field19\Field21) + (local123 * 10.0)), 0.0, $00)
                    Next
                    For local20 = $06 To $08 Step $01
                        rotateentity(local3\Field19\Field27[local20], 0.0, ((Float local3\Field19\Field21) + (local123 * 10.0)), 0.0, $00)
                    Next
                    If (XB4XFDZ8DD($03, $09) = $00) Then
                        XB4XFDZ8DD($03, $09) = loadsound_strict("SFX\Ambient\General\Ambient9.ogg")
                    Else
                        local3\Field2 = loopsoundex(XB4XFDZ8DD($03, $09), local3\Field2, camera, local3\Field19\Field27[$02], 10.0, 1.5, $00)
                    EndIf
                EndIf
            Case $14
                If (12.0 > local3\Field19\Field39) Then
                    For local4 = Each events
                        If (local4\Field32 = $0C) Then
                            If (0.0 = local4\Field1) Then
                                turncheckpointmonitorsoff($01)
                            Else
                                updatecheckpointmonitors($01)
                            EndIf
                            Exit
                        EndIf
                    Next
                    If (local3\Field19\Field32[$00] = Null) Then
                        tformpoint(-603.0, 51.2, 256.0, local3\Field19\Field15, $00)
                        local3\Field19\Field32[$00] = createnpc($16, tformedx(), tformedy(), tformedz())
                        local3\Field19\Field32[$00]\Field1 = $01
                        local3\Field19\Field32[$00]\Field57 = -1.0
                        setnpcframe(local3\Field19\Field32[$00], 40.0, $01)
                        changenpctextureid(local3\Field19\Field32[$00], $20)
                        rotateentity(local3\Field19\Field32[$00]\Field82, 0.0, ((Float local3\Field19\Field21) + 180.0), 0.0, $01)
                    EndIf
                EndIf
            Case $01
                If (playerroom = local3\Field19) Then
                    local3\Field4 = (local3\Field4 + fps\Field3[$00])
                    If (70.0 > local3\Field4) Then
                        local23 = $01
                    ElseIf (140.0 > local3\Field4) Then
                        local23 = $00
                    Else
                        local23 = $01
                        local3\Field4 = 0.0
                    EndIf
                    local3\Field1 = curvevalue((Float local23), local3\Field1, 10.0)
                    entityalpha(local3\Field19\Field27[$00], local3\Field1)
                    If (interactobject(local3\Field19\Field27[$01], 0.8, $00) <> 0) Then
                        If ((((i_714\Field0 <> $02) And (T8660BZ460\Field3 <> $04)) And (T8660BZ460\Field10 <> $04)) <> 0) Then
                            createmsg(getlocalstring("msg", "duck"), 6.0)
                            playsound_strict(loadtempsound("SFX\SCP\Joke\Quack.ogg"), $00, $00)
                        Else
                            createmsg(getlocalstring("msg", "flamingo"), 6.0)
                        EndIf
                    EndIf
                    If (0.0 = local3\Field7) Then
                        If (interactobject(local3\Field19\Field27[$02], 0.8, $00) <> 0) Then
                            createmsg(getlocalstring("msg", "coinflip_1"), 6.0)
                            playsound_strict(loadtempsound((("SFX\Interact\PennyFlip" + (Str rand($00, $01))) + ".ogg")), $00, $00)
                            local3\Field7 = (Float rand($01, $02))
                        EndIf
                    Else
                        local27 = ((local3\Field7 - 1.0) * 40.0)
                        animateex(local3\Field19\Field27[$02], animtime(local3\Field19\Field27[$02]), (Int (1.0 + local27)), (Int (40.0 + local27)), 0.8, $00)
                        If ((40.0 + local27) <= animtime(local3\Field19\Field27[$02])) Then
                            setanimtime(local3\Field19\Field27[$02], 1.0, $00)
                            createmsg(getlocalstring("msg", "coinflip_2"), 6.0)
                            local3\Field7 = 0.0
                        EndIf
                    EndIf
                EndIf
            Case $4E
                If (6.0 > local3\Field19\Field39) Then
                    If (0.0 = local3\Field4) Then
                        local3\Field8 = loopsoundex(roomambience[$05], local3\Field8, camera, local3\Field19\Field15, 10.0, 1.0, $00)
                    Else
                        local3\Field2 = loopsoundex(snd_i\Field37[$01], local3\Field2, camera, local3\Field19\Field15, 5.0, 0.7, $00)
                        If (entityhidden(local3\Field19\Field16[$00]\Field7) = $00) Then
                            hideentity(local3\Field19\Field16[$00]\Field7)
                        EndIf
                        If (70.0 < local3\Field4) Then
                            local3\Field4 = max((local3\Field4 - fps\Field3[$00]), 70.0)
                        ElseIf (70.0 = local3\Field4) Then
                            For local20 = $00 To $04 Step $01
                                local3\Field19\Field25[local20]\Field21 = $00
                            Next
                            entitypickmode(local3\Field19\Field27[$01], $00, $01)
                            entitytype(local3\Field19\Field27[$01], $00, $00)
                            If (local3\Field19\Field27[$03] <> $00) Then
                                local11 = createitem("Level 4 Key Card", $5D, entityx(local3\Field19\Field27[$03], $00, 1.0), (entityy(local3\Field19\Field27[$03], $00, 1.0) + 0.015), entityz(local3\Field19\Field27[$03], $00, 1.0), $00, $00, $00, 1.0, $00)
                                rotateentity(local11\Field9, 0.0, entityyaw(local3\Field19\Field27[$03], $00, 1.0), 0.0, $00)
                                freeentity(local3\Field19\Field27[$03])
                                local3\Field19\Field27[$03] = $00
                            EndIf
                            local3\Field4 = 66.0
                        EndIf
                        entityalpha(local3\Field19\Field27[$01], max((local3\Field4 / 7875.0), 0.3))
                    EndIf
                EndIf
                If (playerroom = local3\Field19) Then
                    If (local3\Field19\Field32[$00] = Null) Then
                        tformpoint(382.0, -463.0, -263.0, local3\Field19\Field15, $00)
                        local3\Field19\Field32[$00] = createnpc($16, tformedx(), tformedy(), tformedz())
                        local3\Field19\Field32[$00]\Field1 = $01
                        local3\Field19\Field32[$00]\Field57 = -1.0
                        local3\Field19\Field32[$00]\Field66 = 66.0
                        local3\Field19\Field32[$00]\Field34 = 2100.0
                        setnpcframe(local3\Field19\Field32[$00], 510.0, $01)
                        changenpctextureid(local3\Field19\Field32[$00], $14)
                        rotateentity(local3\Field19\Field32[$00]\Field82, 0.0, ((Float local3\Field19\Field21) + 40.0), 0.0, $00)
                        entitycolor(local3\Field19\Field32[$00]\Field98, 255.0, 100.0, 100.0)
                        entityshininess(local3\Field19\Field32[$00]\Field98, 1.0, 0.5)
                    EndIf
                    If (0.0 = local3\Field4) Then
                        updateredlight(local3\Field19\Field16[$00], 1500.0, 800.0)
                        If (updatelever(local3\Field19\Field9[$00]\Field1, $00, $50, -80.0) <> 0) Then
                            For local20 = $00 To $04 Step $01
                                If (local3\Field19\Field25[local20]\Field39 <> 0) Then
                                    openclosedoor(local3\Field19\Field25[local20], $01, $00)
                                EndIf
                                local3\Field19\Field25[local20]\Field21 = $01
                            Next
                            settemplatevelocity(particleeffect[$13], -0.007, -0.008, -0.001, 0.0012, -0.007, 0.008)
                            setemitter(local3\Field19, entityx(local3\Field19\Field9[$00]\Field1, $01, 1.0), entityy(local3\Field19\Field9[$00]\Field1, $01, 1.0), entityz(local3\Field19\Field9[$00]\Field1, $01, 1.0), $13)
                            playsoundex(snd_i\Field10, camera, local3\Field19\Field9[$00]\Field1, 3.0, 0.4, $00, $00)
                            playsound_strict(snd_i\Field28[$02], $00, $00)
                            XZ0260X8X2\Field8 = 1.8
                            local3\Field4 = 6300.0
                        EndIf
                    EndIf
                    If (66.0 <> local3\Field4) Then
                        If (local3\Field19\Field27[$03] = $00) Then
                            For local19 = Each itemtemplates
                                If (local19\Field9 = $5D) Then
                                    local3\Field19\Field27[$03] = GUESSEDcopyentity_2(local19\Field21, $00)
                                    tformpoint(384.0, -510.0, -391.0, local3\Field19\Field15, $00)
                                    positionentity(local3\Field19\Field27[$03], tformedx(), tformedy(), tformedz(), $00)
                                    rotateentity(local3\Field19\Field27[$03], 0.0, 45.0, 0.0, $00)
                                    Exit
                                EndIf
                            Next
                        EndIf
                    ElseIf (66.0 = local3\Field4) Then
                        updatebreathsteam()
                        local124 = (local3\Field19\Field3 - 1.6)
                        For local1 = Each npcs
                            If (((0.0 = local1\Field34) And (local1\Field90 = local3\Field19)) <> 0) Then
                                Select local1\Field77
                                    Case $0B,$09,$07,$08,$16,$17,$0A
                                    Default
                                        If (local124 > entityy(local1\Field82, $01, 1.0)) Then
                                            local1\Field34 = 0.001
                                        EndIf
                                End Select
                            EndIf
                        Next
                        If (local124 > entityy(XZ0260X8X2\Field74, $01, 1.0)) Then
                            decalstep = $02
                            If (0.0 = i_009\Field0) Then
                                giveachievement("009", $01)
                                If (T8660BZ460\Field10 = $00) Then
                                    i_009\Field0 = 0.001
                                EndIf
                            EndIf
                        EndIf
                    EndIf
                EndIf
            Case $4F
                If (16.0 > local3\Field19\Field39) Then
                    If (playerroom = local3\Field19) Then
                        updatelever(local3\Field19\Field9[$01]\Field1, $00, $50, -80.0)
                        local3\Field2 = loopsoundex(snd_i\Field28[$01], local3\Field2, camera, local3\Field19\Field27[$03], 3.0, 1.0, $00)
                        If (9.0 > entitydistancesquared(XZ0260X8X2\Field74, local3\Field19\Field27[$03])) Then
                            If (rand($32, $01) = $01) Then
                                settemplatevelocity(particleeffect[$13], -0.007, -0.008, -0.001, 0.0012, -0.007, 0.008)
                                setemitter(local3\Field19, entityx(local3\Field19\Field27[$03], $01, 1.0), entityy(local3\Field19\Field27[$03], $01, 1.0), entityz(local3\Field19\Field27[$03], $01, 1.0), $13)
                                playsoundex(snd_i\Field10, camera, local3\Field19\Field27[$03], 3.0, 0.4, $00, $00)
                            EndIf
                        EndIf
                        If (0.16 > entitydistancesquared(XZ0260X8X2\Field74, local3\Field19\Field27[$04])) Then
                            If (rand((((T8660BZ460\Field10 = $02) * $E6) + $4B), $01) = $01) Then
                                If (((1.5 > XZ0260X8X2\Field11) And (chs\Field0 = $00)) <> 0) Then
                                    playsound_strict(loadtempsound("SFX\SCP\294\Burn.ogg"), $00, $00)
                                    injureplayer(1.5, 0.0, 0.0, 0.0, 0.0)
                                EndIf
                            EndIf
                        EndIf
                    EndIf
                    Select local3\Field4
                        Case 0.0
                            hideentity(local3\Field19\Field27[$00])
                            local3\Field7 = 0.0
                            local37 = entityx(local3\Field19\Field15, $01, 1.0)
                            local39 = entityz(local3\Field19\Field15, $01, 1.0)
                            local38 = entityy(local3\Field19\Field15, $01, 1.0)
                            For local1 = Each npcs
                                If (local1\Field1 = $00) Then
                                    local34 = entityx(local1\Field82, $01, 1.0)
                                    local36 = entityz(local1\Field82, $01, 1.0)
                                    local35 = entityy(local1\Field82, $01, 1.0)
                                    If (((local1\Field77 = $18) And (local3\Field19\Field32[$01] = Null)) <> 0) Then
                                        If (((isequal(local34, local37, 2.0) And isequal(local36, local39, 2.0)) And isequal(local35, local38, 1.3)) <> 0) Then
                                            local1\Field13 = $01
                                            local1\Field8 = 0.0
                                            local1\Field30 = $00
                                            local1\Field57 = 700.0
                                            local1\Field66 = 11.0
                                            local3\Field19\Field32[$01] = local1
                                            Exit
                                        EndIf
                                    EndIf
                                EndIf
                            Next
                            If (local3\Field19\Field32[$01] <> Null) Then
                                If (0.0 >= local3\Field19\Field32[$01]\Field57) Then
                                    StopChannel(local3\Field2)
                                    local3\Field2 = $00
                                    playannouncement((("SFX\Character\MTF\AnnouncTeslaDisabled" + (Str rand($00, $02))) + ".ogg"), $01)
                                    local3\Field19\Field32[$01] = Null
                                    local3\Field7 = -6300.0
                                    local3\Field4 = 3.0
                                    Return $00
                                EndIf
                            EndIf
                            If (ChannelPlaying(local3\Field2) <> 0) Then
                                StopChannel(local3\Field2)
                                local3\Field2 = $00
                            EndIf
                            local3\Field2 = playsoundex(snd_i\Field32, camera, local3\Field19\Field27[$00], 4.0, 0.5, $00, $00)
                            If (rand($04, $01) = $01) Then
                                local3\Field7 = -350.0
                                local3\Field4 = 3.0
                            Else
                                local3\Field4 = 1.0
                            EndIf
                        Case 1.0
                            updateredlight(local3\Field19\Field16[$00], 100.0, 50.0)
                            local3\Field7 = (local3\Field7 + fps\Field3[$00])
                            If (35.0 <= local3\Field7) Then
                                StopChannel(local3\Field8)
                                local3\Field8 = $00
                                local3\Field8 = playsoundex(snd_i\Field6, camera, local3\Field19\Field27[$00], 10.0, 1.0, $00, $00)
                                local3\Field4 = 2.0
                            EndIf
                        Case 2.0
                            local37 = entityx(local3\Field19\Field15, $01, 1.0)
                            local39 = entityz(local3\Field19\Field15, $01, 1.0)
                            local38 = entityy(local3\Field19\Field15, $01, 1.0)
                            If (((isequal(entityx(XZ0260X8X2\Field74, $01, 1.0), local37, 0.75) And isequal(entityz(XZ0260X8X2\Field74, $01, 1.0), local39, 0.75)) And isequal(entityy(XZ0260X8X2\Field74, $01, 1.0), local38, 1.3)) <> 0) Then
                                If (0.0 = XZ0260X8X2\Field48) Then
                                    If (opt\Field69 > $00) Then
                                        local18 = setemitter(Null, entityx(XZ0260X8X2\Field74, $01, 1.0), entityy(XZ0260X8X2\Field74, $01, 1.0), entityz(XZ0260X8X2\Field74, $01, 1.0), $0E)
                                        entityparent(local18\Field2, XZ0260X8X2\Field74, $01)
                                    EndIf
                                    XZ0260X8X2\Field78 = 0.4
                                    XZ0260X8X2\Field1 = 1.0
                                    msg\Field8 = format(getlocalstring("death", "tesla"), subjectname, "%s")
                                    kill($00, $01, $00, $01)
                                EndIf
                            EndIf
                            For local1 = Each npcs
                                If (((local1\Field77 <> $0B) And (local1\Field1 = $00)) <> 0) Then
                                    If (local1\Field77 = $14) Then
                                        local3\Field19\Field25[$00]\Field21 = $00
                                        setnpcframe(local1, 41.0, $01)
                                        local1\Field1 = $01
                                        local1\Field57 = 1.0
                                    EndIf
                                    If (((isequal(entityx(local1\Field82, $01, 1.0), local37, 0.6) And isequal(entityz(local1\Field82, $01, 1.0), local39, 0.6)) And isequal(entityy(local1\Field82, $01, 1.0), local38, 1.3)) <> 0) Then
                                        local1\Field64 = 0.0
                                        local1\Field4 = $00
                                        If (local1\Field77 <> $07) Then
                                            local1\Field73 = $01
                                            entitycolor(local1\Field98, 40.0, 40.0, 40.0)
                                            If (local1\Field77 = $08) Then
                                                entitycolor(local1\Field101, 40.0, 40.0, 40.0)
                                            EndIf
                                        EndIf
                                        If ((((opt\Field69 > $00) And (local1\Field77 <> $11)) And (local1\Field77 <> $15)) <> 0) Then
                                            local18 = setemitter(Null, entityx(local1\Field98, $01, 1.0), entityy(local1\Field98, $01, 1.0), entityz(local1\Field98, $01, 1.0), $0E)
                                            entityparent(local18\Field2, local1\Field98, $01)
                                        EndIf
                                        Select local1\Field77
                                            Case $07
                                                giveachievement("tesla", $01)
                                                local1\Field66 = 4.0
                                            Case $03
                                                If (3.0 <> local1\Field66) Then
                                                    local1\Field66 = 5.0
                                                EndIf
                                            Case $0E
                                                showentity(local1\Field98)
                                            Case $0F
                                                local1\Field60 = 0.0
                                                local1\Field61 = 0.0
                                                local1\Field74 = 0.0
                                                local1\Field66 = 4.0
                                        End Select
                                        If (((6.0 > local3\Field19\Field39) And (entityinview(local1\Field82, camera) And entityvisible(XZ0260X8X2\Field74, local1\Field82, 0.0))) <> 0) Then
                                            XZ0260X8X2\Field78 = 0.3
                                        EndIf
                                    EndIf
                                EndIf
                            Next
                            If (rand($05, $01) < $05) Then
                                positiontexture(X2Z260BF0Z\Field0[$03], 0.0, rnd(0.0, 1.0))
                                If (entityhidden(local3\Field19\Field27[$00]) <> 0) Then
                                    showentity(local3\Field19\Field27[$00])
                                EndIf
                                If (6.0 > local3\Field19\Field39) Then
                                    lightvolume = (rnd(1.0, 2.0) * templightvolume)
                                EndIf
                            EndIf
                            local3\Field7 = (local3\Field7 - (fps\Field3[$00] * 1.5))
                            If (0.0 >= local3\Field7) Then
                                StopChannel(local3\Field2)
                                local3\Field2 = $00
                                local3\Field2 = playsoundex(snd_i\Field34, camera, local3\Field19\Field27[$00], 4.0, 0.5, $00, $00)
                                local3\Field4 = 3.0
                                local3\Field7 = -350.0
                            EndIf
                        Case 3.0
                            local3\Field7 = (local3\Field7 + fps\Field3[$00])
                            If (entityhidden(local3\Field19\Field27[$00]) = $00) Then
                                hideentity(local3\Field19\Field27[$00])
                            EndIf
                            If (entityhidden(local3\Field19\Field16[$00]\Field7) = $00) Then
                                hideentity(local3\Field19\Field16[$00]\Field7)
                            EndIf
                            If (0.0 <= local3\Field7) Then
                                local3\Field4 = 0.0
                            EndIf
                    End Select
                    If (0.0 > entitypitch(local3\Field19\Field9[$01]\Field1, $00, 1.0)) Then
                        local3\Field23 = min((local3\Field23 + fps\Field3[$00]), 0.0)
                    Else
                        local3\Field23 = max((local3\Field23 - fps\Field3[$00]), -196.0)
                    EndIf
                    If (((0.0 > local3\Field23) And (-196.0 < local3\Field23)) <> 0) Then
                        local3\Field11 = loopsoundex(snd_i\Field19, local3\Field11, camera, local3\Field19\Field27[$02], 2.0, 1.0, $00)
                    Else
                        StopChannel(local3\Field11)
                        local3\Field11 = $00
                    EndIf
                    positionentity(local3\Field19\Field27[$01], 0.0, local3\Field23, 0.0, $00)
                    updatesoundorigin(local3\Field11, camera, local3\Field19\Field27[$02], 10.0, 1.0, $00, $01, $00)
                EndIf
            Case $50
                If (7.0 > local3\Field19\Field39) Then
                    If (infacility = $00) Then
                        If (0.0 = local3\Field4) Then
                            local3\Field4 = (Float rand($03, $01))
                        ElseIf (4.0 > local3\Field4) Then
                            If (((1.0 < n_i\Field3\Field31) Lor (3.0 <> local3\Field4)) <> 0) Then
                                local3\Field4 = 4.0
                            ElseIf ((((16.0 < entitydistancesquared(XZ0260X8X2\Field74, n_i\Field3\Field82)) And (playersees173(n_i\Field3) = $00)) And (playerroom <> local3\Field19)) <> 0) Then
                                tformpoint(-656.0, 120.0, 448.0, local3\Field19\Field15, $00)
                                local31 = tformedx()
                                local32 = tformedy()
                                local33 = tformedz()
                                playsoundex(loadtempsound((("SFX\Room\Room2Nuke\Vent" + (Str rand($00, $02))) + ".ogg")), camera, local3\Field19\Field15, 12.0, 1.5, $00, $00)
                                positionentity(local3\Field19\Field27[$00], local31, (local3\Field19\Field3 + (1.0 / 64.0)), local33, $01)
                                rotateentity(local3\Field19\Field27[$00], 0.0, rnd(360.0, 0.0), 0.0, $01)
                                entitytype(local3\Field19\Field27[$00], $01, $00)
                                teleportentity(n_i\Field3\Field82, local31, local32, local33, (n_i\Field3\Field23 + 0.12), $01, 2.0, $00)
                                n_i\Field3\Field90 = local3\Field19
                                local3\Field4 = 4.0
                            EndIf
                        EndIf
                        updatelever(local3\Field19\Field9[$01]\Field1, $00, $50, -80.0)
                        If (0.0 > entitypitch(local3\Field19\Field9[$01]\Field1, $00, 1.0)) Then
                            local3\Field1 = min((local3\Field1 + fps\Field3[$00]), 152.0)
                        Else
                            local3\Field1 = max((local3\Field1 - fps\Field3[$00]), 0.0)
                        EndIf
                        If (((0.0 < local3\Field1) And (152.0 > local3\Field1)) <> 0) Then
                            local3\Field2 = loopsoundex(snd_i\Field19, local3\Field2, camera, local3\Field19\Field27[$02], 2.0, 1.0, $00)
                        Else
                            StopChannel(local3\Field2)
                            local3\Field2 = $00
                        EndIf
                        positionentity(local3\Field19\Field27[$01], entityx(local3\Field19\Field27[$01], $01, 1.0), (local3\Field1 * (1.0 / 256.0)), entityz(local3\Field19\Field27[$01], $01, 1.0), $01)
                        updatesoundorigin(local3\Field11, camera, local3\Field19\Field27[$02], 10.0, 1.0, $00, $01, $00)
                        updatelever(local3\Field19\Field9[$03]\Field1, $00, $50, -80.0)
                        If (0.0 > entitypitch(local3\Field19\Field9[$03]\Field1, $00, 1.0)) Then
                            local3\Field23 = min((local3\Field23 + fps\Field3[$00]), 152.0)
                        Else
                            local3\Field23 = max((local3\Field23 - fps\Field3[$00]), 0.0)
                        EndIf
                        If (((0.0 < local3\Field23) And (152.0 > local3\Field23)) <> 0) Then
                            local3\Field8 = loopsoundex(snd_i\Field19, local3\Field8, camera, local3\Field19\Field27[$04], 2.0, 1.0, $00)
                        Else
                            StopChannel(local3\Field8)
                            local3\Field8 = $00
                        EndIf
                        positionentity(local3\Field19\Field27[$03], entityx(local3\Field19\Field27[$03], $01, 1.0), (local3\Field23 * (1.0 / 256.0)), entityz(local3\Field19\Field27[$03], $01, 1.0), $01)
                        updatesoundorigin(local3\Field11, camera, local3\Field19\Field27[$04], 10.0, 1.0, $00, $01, $00)
                    EndIf
                EndIf
                If (playerroom = local3\Field19) Then
                    local128 = updatelever(local3\Field19\Field9[$00]\Field1, $00, $50, -80.0)
                    local129 = updatelever(local3\Field19\Field9[$02]\Field1, $00, $50, -80.0)
                    If (local128 <> 0) Then
                        If (local3\Field19\Field17[$00] = Null) Then
                            tformpoint(-177.0, 340.0, 655.0, local3\Field19\Field15, $00)
                            local3\Field19\Field17[$00] = setemitter(local3\Field19, tformedx(), tformedy(), tformedz(), $00)
                            local3\Field19\Field17[$00]\Field7 = $01
                        EndIf
                    ElseIf (local3\Field19\Field17[$00] <> Null) Then
                        freeemitter(local3\Field19\Field17[$00], $00)
                    EndIf
                    If (local129 <> 0) Then
                        If (local3\Field19\Field17[$01] = Null) Then
                            tformpoint(-655.0, 340.0, 240.0, local3\Field19\Field15, $00)
                            local3\Field19\Field17[$01] = setemitter(local3\Field19, tformedx(), tformedy(), tformedz(), $00)
                            local3\Field19\Field17[$01]\Field7 = $01
                        EndIf
                    ElseIf (local3\Field19\Field17[$01] <> Null) Then
                        freeemitter(local3\Field19\Field17[$01], $00)
                    EndIf
                    If (((local128 = $00) And (local129 = $00)) <> 0) Then
                        For local20 = $00 To $01 Step $01
                            local3\Field19\Field25[local20]\Field33 = $00
                            local3\Field19\Field25[local20]\Field9 = 0.0
                            local3\Field19\Field25[local20]\Field26 = Null
                        Next
                        local3\Field7 = 0.0
                    ElseIf (0.0 = local3\Field7) Then
                        If (local3\Field19\Field25[$00]\Field39 <> 0) Then
                            openclosedoor(local3\Field19\Field25[$00], $01, $00)
                        EndIf
                        If (local3\Field19\Field25[$01]\Field39 <> 0) Then
                            openclosedoor(local3\Field19\Field25[$01], $01, $00)
                        EndIf
                        local3\Field19\Field25[$00]\Field33 = $15E
                        local3\Field19\Field25[$00]\Field26 = local3\Field19\Field25[$01]
                        local3\Field19\Field25[$01]\Field33 = $15E
                        local3\Field19\Field25[$01]\Field26 = local3\Field19\Field25[$00]
                        local3\Field7 = 1.0
                    EndIf
                EndIf
        End Select
        If (local3 <> Null) Then
            catcherrors((("Uncaught: UpdateEvents(Event ID: " + (Str local3\Field32)) + ")"))
        Else
            catcherrors("Uncaught: UpdateEvents(Event doesn't exist anymore!)")
        EndIf
    Next
    updateexplosion()
    Return $00
End Function

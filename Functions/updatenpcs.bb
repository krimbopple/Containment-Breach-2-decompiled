Function updatenpcs%()
    Local local0.npcs
    Local local1.npcs
    Local local2.doors
    Local local3.decals
    Local local4.rooms
    Local local5.events
    Local local6.waypoints
    Local local7%
    Local local8.waypoints
    Local local9.waypoints
    Local local10%
    Local local11%
    Local local12%
    Local local13#
    Local local14#
    Local local15#
    Local local16#
    Local local17#
    Local local18#
    Local local19#
    Local local20#
    Local local21#
    Local local22%
    Local local23%
    Local local24%
    Local local25%
    Local local26%
    Local local27%
    Local local28%
    Local local29%
    Local local30%
    Local local31%
    Local local32%
    Local local33%
    Local local34%
    Local local35#
    Local local36#
    Local local38%
    Local local39%
    Local local40#
    Local local43%
    Local local44%
    Local local46#
    Local local48%
    Local local51#
    Local local52.rooms
    Local local53#
    Local local57#
    Local local58#
    Local local59%
    Local local60%
    Local local64.items
    Local local65.items
    Local local69#
    Local local71#
    Local local75.forest
    Local local78%
    Local local79%
    Local local80$
    Local local88#
    Local local94#
    Local local101%
    Local local104#
    Local local105#
    Local local106#
    Local local107#
    Local local108#
    Local local109#
    Local local111#
    Local local112%
    Local local114%
    Local local115%
    Local local116%
    Local local117%
    Local local118%
    Local local119%
    Local local120%
    Local local121%
    If (GUESSEDupdatexdb() <> $00) Then
        Return MP_UpdateNPCs()
    EndIf
    catcherrors("UpdateNPCs()")
    For local0 = Each npcs
        local0\Field24 = isinfacility(entityy(local0\Field82, $00, 1.0))
        local0\Field5 = $01
        Select local0\Field77
            Case $08
                If (((3.0 <> local0\Field31) And playerinreachableroom($01, $01, $01)) <> 0) Then
                    local13 = entitydistancesquared(local0\Field82, XZ0260X8X2\Field74)
                    local0\Field57 = 1.0
                    positionentity(local0\Field98, entityx(local0\Field82, $00, 1.0), (entityy(local0\Field82, $00, 1.0) - (local0\Field23 + 0.12)), entityz(local0\Field82, $00, 1.0), $00)
                    rotateentity(local0\Field98, 0.0, (entityyaw(local0\Field82, $00, 1.0) - 180.0), 0.0, $00)
                    positionentity(local0\Field101, entityx(local0\Field82, $00, 1.0), (entityy(local0\Field82, $00, 1.0) - (local0\Field23 + 0.12)), entityz(local0\Field82, $00, 1.0), $00)
                    rotateentity(local0\Field101, 0.0, ((entityyaw(local0\Field82, $00, 1.0) - 180.0) + local0\Field84), 0.0, $00)
                    If (2.0 > local0\Field31) Then
                        If (0.1 < local0\Field43) Then
                            local0\Field31 = 1.0
                            local0\Field43 = max((local0\Field43 - fps\Field3[$00]), 0.1)
                        ElseIf (0.1 = local0\Field43) Then
                            local0\Field31 = 0.0
                            local0\Field43 = 0.0
                        EndIf
                        If (0.0 = local0\Field31) Then
                            local38 = $00
                            local39 = $01
                            If (225.0 > local13) Then
                                If (100.0 > local13) Then
                                    If (entityvisible(local0\Field82, XZ0260X8X2\Field74, 0.0) <> 0) Then
                                        local38 = $01
                                        local0\Field60 = entityx(XZ0260X8X2\Field74, $01, 1.0)
                                        local0\Field61 = entityy(XZ0260X8X2\Field74, $01, 1.0)
                                        local0\Field74 = entityz(XZ0260X8X2\Field74, $01, 1.0)
                                    EndIf
                                EndIf
                                local40 = clamp((distance(entityx(local0\Field82, $00, 1.0), local0\Field49, entityz(local0\Field82, $00, 1.0), local0\Field15, 0.0, 0.0) * 2.5), 0.0, 1.0)
                                local0\Field63 = loopsoundex(snd_i\Field30, local0\Field63, camera, local0\Field82, 10.0, local0\Field66, $00)
                                local0\Field49 = entityx(local0\Field82, $00, 1.0)
                                local0\Field15 = entityz(local0\Field82, $00, 1.0)
                                If (playersees173(local0) <> 0) Then
                                    local39 = $00
                                EndIf
                            EndIf
                            If (chs\Field8 <> 0) Then
                                local39 = $01
                            EndIf
                            If (local39 = $00) Then
                                local36 = sqr(local13)
                                XZ0260X8X2\Field55 = max(clamp(((4.0 - local36) / 6.0), 0.1, 0.9), XZ0260X8X2\Field55)
                                XZ0260X8X2\Field51 = max(XZ0260X8X2\Field51, (((sin(((Float millisec) / 20.0)) + 1.0) * 15.0) * max(((3.5 - local36) / 3.5), 0.0)))
                                If ((((12.25 > local13) And ((millisecs() - local0\Field17) > $EA60)) And local38) <> 0) Then
                                    playsound_strict(snd_i\Field40[rand($03, $04)], $00, $00)
                                    local0\Field17 = millisecs()
                                EndIf
                                If (2.25 > local13) Then
                                    If (rand($2BC, $01) = $01) Then
                                        playsoundex(snd_i\Field27[rand($00, $02)], camera, local0\Field98, 10.0, 1.0, $00, $00)
                                    EndIf
                                    If (((2.0 < local0\Field38) And local38) <> 0) Then
                                        XZ0260X8X2\Field51 = 40.0
                                        XZ0260X8X2\Field62 = max(XZ0260X8X2\Field62, 140.0)
                                        XZ0260X8X2\Field87 = 0.5
                                        Select rand($05, $01)
                                            Case $01
                                                playsound_strict(snd_i\Field40[$01], $00, $00)
                                            Case $02
                                                playsound_strict(snd_i\Field40[$02], $00, $00)
                                            Case $03
                                                playsound_strict(snd_i\Field40[$09], $00, $00)
                                            Case $04
                                                playsound_strict(snd_i\Field40[$0A], $00, $00)
                                            Case $05
                                                playsound_strict(snd_i\Field40[$0C], $00, $00)
                                        End Select
                                    EndIf
                                EndIf
                                local0\Field38 = sqr(local13)
                                local0\Field66 = max(0.0, (local0\Field66 - (fps\Field3[$00] / 20.0)))
                            ElseIf (local13 > ((hidedistance * 0.8) * (hidedistance * 0.8))) Then
                                If (rand($46, $01) = $01) Then
                                    teleportcloser(local0)
                                EndIf
                            Else
                                local0\Field66 = curvevalue(local40, local0\Field66, 3.0)
                                If (rand(($14 - (selecteddifficulty\Field2 * $0A)), $01) = $01) Then
                                    For local2 = Each doors
                                        If ((((((local2\Field21 = $00) And (local2\Field39 = $00)) And (local2\Field52 = $00)) And (local2\Field44 = $00)) And (local2\Field28 = $00)) <> 0) Then
                                            For local11 = $00 To $01 Step $01
                                                If (local2\Field40[local11] <> $00) Then
                                                    If (0.5 > (Abs (entityx(local0\Field82, $00, 1.0) - entityx(local2\Field40[local11], $00, 1.0)))) Then
                                                        If (0.5 > (Abs (entityz(local0\Field82, $00, 1.0) - entityz(local2\Field40[local11], $00, 1.0)))) Then
                                                            If (((180.0 <= local2\Field13) Lor (0.0 >= local2\Field13)) <> 0) Then
                                                                local26 = createpivot($00)
                                                                positionentity(local26, entityx(local0\Field82, $00, 1.0), (entityy(local0\Field82, $00, 1.0) + 0.5), entityz(local0\Field82, $00, 1.0), $00)
                                                                pointentity(local26, local2\Field40[local11], 0.0)
                                                                moveentity(local26, 0.0, 0.0, (local0\Field32 * 0.6), $00)
                                                                If (entitypick(local26, 0.5) = local2\Field40[local11]) Then
                                                                    playsound_strict(loadtempsound("SFX\Door\DoorOpen173.ogg"), $00, $00)
                                                                    openclosedoor(local2, $01, $00)
                                                                    freeentity(local26)
                                                                    local26 = $00
                                                                    Exit
                                                                EndIf
                                                                freeentity(local26)
                                                                local26 = $00
                                                            EndIf
                                                        EndIf
                                                    EndIf
                                                EndIf
                                            Next
                                        EndIf
                                    Next
                                EndIf
                                If (chs\Field8 <> 0) Then
                                    local38 = $00
                                    local0\Field60 = 0.0
                                    local0\Field61 = 0.0
                                    local0\Field74 = 0.0
                                EndIf
                                If (local38 <> 0) Then
                                    If (i_268\Field3 = $00) Then
                                        local0\Field84 = deltayaw(local0\Field82, camera)
                                    EndIf
                                    If (0.4225 > local13) Then
                                        If (((0.0 = XZ0260X8X2\Field48) And (chs\Field0 = $00)) <> 0) Then
                                            Select playerroom\Field22\Field21
                                                Case $1D,$0E,$2D
                                                    msg\Field8 = format(getlocalstring("death", "173.gw"), subjectname, "%s")
                                                Case $04
                                                    msg\Field8 = format(getlocalstring("death", "173.intro"), subjectname, "%s")
                                                Case $0C
                                                    msg\Field8 = getlocalstring("death", "173.6")
                                                Default
                                                    msg\Field8 = format(getlocalstring("death", "173.default"), subjectname, "%s")
                                            End Select
                                            If (chs\Field0 = $00) Then
                                                local0\Field31 = 1.0
                                            EndIf
                                            playsound_strict(snd_i\Field35[rand($00, $02)], $00, $00)
                                            If (rand($02, $01) = $01) Then
                                                turnentity(camera, 0.0, rnd(80.0, 100.0), 0.0, $00)
                                            Else
                                                turnentity(camera, 0.0, rnd(-100.0, -80.0), 0.0, $00)
                                            EndIf
                                            StopChannel(i_1048a\Field0)
                                            i_1048a\Field0 = $00
                                            StopChannel(coughchn)
                                            coughchn = $00
                                            kill($00, $01, $00, $01)
                                        EndIf
                                    ElseIf (i_268\Field3 = $00) Then
                                        pointentity(local0\Field82, XZ0260X8X2\Field74, 0.0)
                                        rotateentity(local0\Field82, 0.0, entityyaw(local0\Field82, $00, 1.0), entityroll(local0\Field82, $00, 1.0), $00)
                                        translateentity(local0\Field82, ((cos((entityyaw(local0\Field82, $00, 1.0) + 90.0)) * local0\Field32) * fps\Field3[$00]), 0.0, ((sin((entityyaw(local0\Field82, $00, 1.0) + 90.0)) * local0\Field32) * fps\Field3[$00]), $00)
                                    EndIf
                                ElseIf (0.0 <> local0\Field60) Then
                                    local0\Field84 = deltayaw(local0\Field82, camera)
                                    If (((0.25 < distancesquared(entityx(local0\Field82, $00, 1.0), local0\Field60, entityz(local0\Field82, $00, 1.0), local0\Field74, 0.0, 0.0)) And (i_268\Field3 = $00)) <> 0) Then
                                        aligntovector(local0\Field82, (local0\Field60 - entityx(local0\Field82, $00, 1.0)), 0.0, (local0\Field74 - entityz(local0\Field82, $00, 1.0)), $03, 1.0)
                                        moveentity(local0\Field82, 0.0, 0.0, (local0\Field32 * fps\Field3[$00]), $00)
                                        If (rand($1F4, $01) = $01) Then
                                            local0\Field60 = 0.0
                                            local0\Field61 = 0.0
                                            local0\Field74 = 0.0
                                        EndIf
                                    Else
                                        local0\Field60 = 0.0
                                        local0\Field61 = 0.0
                                        local0\Field74 = 0.0
                                    EndIf
                                Else
                                    If (rand($190, $01) = $01) Then
                                        rotateentity(local0\Field82, 0.0, rnd(360.0, 0.0), 10.0, $00)
                                    EndIf
                                    translateentity(local0\Field82, ((cos((entityyaw(local0\Field82, $00, 1.0) + 90.0)) * local0\Field32) * fps\Field3[$00]), 0.0, ((sin((entityyaw(local0\Field82, $00, 1.0) + 90.0)) * local0\Field32) * fps\Field3[$00]), $00)
                                    If (chs\Field8 <> 0) Then
                                        local0\Field84 = 0.0
                                    Else
                                        local0\Field84 = rnd(-120.0, 120.0)
                                    EndIf
                                EndIf
                            EndIf
                        EndIf
                        positionentity(local0\Field82, entityx(local0\Field82, $00, 1.0), min(entityy(local0\Field82, $00, 1.0), 0.35), entityz(local0\Field82, $00, 1.0), $00)
                    Else
                        If (n_i\Field11 <> Null) Then
                            local43 = $00
                            local13 = entitydistancesquared(local0\Field82, n_i\Field11\Field82)
                            If (local13 > ((hidedistance / 2.0) * (hidedistance / 2.0))) Then
                                If (entityinview(local0\Field98, camera) = $00) Then
                                    local43 = $01
                                EndIf
                            EndIf
                            If (local43 = $00) Then
                                pointentity(local0\Field98, n_i\Field11\Field82, 0.0)
                                rotateentity(local0\Field82, 0.0, curveangle(entityyaw(local0\Field98, $00, 1.0), entityyaw(local0\Field82, $00, 1.0), 10.0), 0.0, $01)
                                moveentity(local0\Field82, 0.0, 0.0, (clamp((((sqr(local13) * 2.0) - 1.0) * 0.5), -0.5, 1.0) * (fps\Field3[$00] * 0.016)), $00)
                                local0\Field42 = 1.0
                            Else
                                positionentity(local0\Field82, entityx(n_i\Field11\Field82, $00, 1.0), (entityy(n_i\Field11\Field82, $00, 1.0) + 0.3), entityz(n_i\Field11\Field82, $00, 1.0), $00)
                                resetentity(local0\Field82)
                                local0\Field70 = 0.0
                                local0\Field42 = 0.0
                            EndIf
                        EndIf
                        local35 = ((sin(((Float millisec) * 0.08)) * 0.02) + 0.05)
                        positionentity(local0\Field98, entityx(local0\Field82, $00, 1.0), (entityy(local0\Field82, $00, 1.0) + local35), entityz(local0\Field82, $00, 1.0), $00)
                        rotateentity(local0\Field98, 0.0, (entityyaw(local0\Field82, $00, 1.0) - 180.0), 0.0, $00)
                        positionentity(local0\Field101, entityx(local0\Field82, $00, 1.0), (entityy(local0\Field82, $00, 1.0) + local35), entityz(local0\Field82, $00, 1.0), $00)
                        rotateentity(local0\Field101, 0.0, ((entityyaw(local0\Field82, $00, 1.0) - 180.0) + local0\Field84), 0.0, $00)
                        If (entityhidden(local0\Field99) <> 0) Then
                            showentity(local0\Field99)
                        EndIf
                        positionentity(local0\Field99, entityx(local0\Field82, $00, 1.0), (entityy(local0\Field82, $00, 1.0) - local35), entityz(local0\Field82, $00, 1.0), $00)
                        rotateentity(local0\Field99, 0.0, (entityyaw(local0\Field82, $00, 1.0) - 180.0), 0.0, $00)
                    EndIf
                EndIf
            Case $07
                If ((local0\Field93 Lor (playerroom\Field22\Field21 = $4E)) <> 0) Then
                    If (entityhidden(local0\Field98) = $00) Then
                        local0\Field31 = 1.0
                        positionentity(local0\Field82, 0.0, -500.0, 0.0, $00)
                        resetentity(local0\Field82)
                        hideentity(local0\Field98)
                    EndIf
                Else
                    local44 = $01
                    If (((playerroom\Field22\Field21 = $70) Lor ((playerroom\Field22\Field21 = $3C) And (-11.125 >= entityy(XZ0260X8X2\Field74, $00, 1.0)))) <> 0) Then
                        local44 = $00
                    EndIf
                    If (((forest_event <> Null) And (forest_event\Field19 = playerroom)) <> 0) Then
                        If (20.0 < entityy(XZ0260X8X2\Field74, $00, 1.0)) Then
                            local44 = $00
                        EndIf
                    EndIf
                    If (((skull_event <> Null) And (skull_event\Field19 = playerroom)) <> 0) Then
                        If (0.0 < skull_event\Field4) Then
                            local44 = $00
                        EndIf
                    EndIf
                    For local5 = Each events
                        If (local5\Field32 = $2F) Then
                            If (0.0 <> local5\Field4) Then
                                local44 = $01
                                local0\Field31 = (Float (playerroom\Field22\Field21 = $70))
                            EndIf
                            Exit
                        EndIf
                    Next
                    If (((local44 = $00) And (1.0 < local0\Field66)) <> 0) Then
                        local0\Field65 = rnd(22000.0, 27000.0)
                        local0\Field66 = 0.0
                    EndIf
                    If (((0.0 = local0\Field31) And local44) <> 0) Then
                        local13 = entitydistancesquared(local0\Field82, XZ0260X8X2\Field74)
                        Select local0\Field66
                            Case 0.0
                                positionentity(local0\Field82, 0.0, -500.0, 0.0, $00)
                                resetentity(local0\Field82)
                                local0\Field48 = $00
                                local0\Field30 = $00
                                local0\Field8 = 0.0
                                local0\Field66 = 1.0
                            Case 1.0
                                If (playerroom\Field22\Field20 < $03) Then
                                    local46 = (((local0\Field57 + 1.0) + (Float selecteddifficulty\Field2)) * fps\Field3[$00])
                                    Select playerroom\Field22\Field20
                                        Case $00
                                            local0\Field65 = max(0.0, (local0\Field65 - local46))
                                        Case $01
                                            local0\Field65 = max(0.0, (local0\Field65 - (local46 * 0.5)))
                                        Case $02
                                            If (1400.0 < local0\Field65) Then
                                                local0\Field65 = (local0\Field65 - (local46 * 0.25))
                                            EndIf
                                    End Select
                                EndIf
                                If (0.0 >= local0\Field65) Then
                                    local0\Field60 = entityx(XZ0260X8X2\Field74, $00, 1.0)
                                    local0\Field61 = entityy(XZ0260X8X2\Field74, $00, 1.0)
                                    local0\Field74 = entityz(XZ0260X8X2\Field74, $00, 1.0)
                                    local0\Field66 = 2.0
                                EndIf
                            Case 2.0
                                shouldplay = $42
                                If ((((0.0 <> local0\Field60) Lor (0.0 <> local0\Field61)) Lor (0.0 <> local0\Field74)) <> 0) Then
                                    local26 = createpivot($00)
                                    positionentity(local26, local0\Field60, local0\Field61, local0\Field74, $00)
                                    turnentity(local26, 90.0, 0.0, 0.0, $00)
                                    If (entitypick(local26, 10.0) <> 0) Then
                                        local0\Field61 = pickedy()
                                    EndIf
                                    freeentity(local26)
                                    local26 = $00
                                    positionentity(local0\Field82, local0\Field60, local0\Field61, local0\Field74, $00)
                                    resetentity(local0\Field82)
                                    local3 = createdecal($00, local0\Field60, (local0\Field61 + 0.005), local0\Field74, 90.0, rnd(360.0, 0.0), 0.0, 0.05, 0.8, $00, $01, $00, $00, $00)
                                    local3\Field14 = 0.001
                                    local3\Field5 = -0.00002
                                    entityparent(local3\Field0, playerroom\Field15, $01)
                                    setnpcframe(local0, 110.0, $01)
                                    playsound_strict(snd_i\Field1[$00], $00, $00)
                                    local0\Field65 = 0.0
                                    local0\Field60 = 0.0
                                    local0\Field61 = 0.0
                                    local0\Field74 = 0.0
                                ElseIf (259.0 > local0\Field103) Then
                                    If ((chs\Field8 Lor i_268\Field3) = $00) Then
                                        pointentity(local0\Field98, XZ0260X8X2\Field74, 0.0)
                                        rotateentity(local0\Field82, 0.0, curveangle(entityyaw(local0\Field98, $00, 1.0), entityyaw(local0\Field82, $00, 1.0), 100.0), 0.0, $01)
                                    EndIf
                                    animatenpc(local0, 111.0, 259.0, (((Float selecteddifficulty\Field2) * 0.1) + 0.15), $00)
                                Else
                                    giveachievement("106", $01)
                                    local0\Field66 = 3.0
                                    local0\Field65 = rnd(3000.0, 3500.0)
                                EndIf
                            Case 3.0
                                local23 = $00
                                If (10.0 > local13) Then
                                    If ((chs\Field8 Lor i_268\Field3) = $00) Then
                                        local23 = $01
                                    EndIf
                                EndIf
                                If (local23 <> 0) Then
                                    If (playerroom\Field22\Field21 <> $4C) Then
                                        local0\Field8 = 0.0
                                    EndIf
                                    If (entityinview(local0\Field82, camera) <> 0) Then
                                        local36 = (4.0 - sqr(local13))
                                        XZ0260X8X2\Field55 = max(clamp((local36 / 6.0), 0.1, 0.9), XZ0260X8X2\Field55)
                                        XZ0260X8X2\Field51 = max(XZ0260X8X2\Field51, (((sin(((Float millisec) / 20.0)) + 1.0) * 20.0) * max((local36 / 4.0), 0.0)))
                                        If ((millisecs() - local0\Field17) > $EA60) Then
                                            XZ0260X8X2\Field51 = 40.0
                                            playsound_strict(snd_i\Field40[$06], $00, $00)
                                            local0\Field17 = millisecs()
                                        EndIf
                                    EndIf
                                Else
                                    local0\Field65 = max(0.0, (local0\Field65 - fps\Field3[$00]))
                                EndIf
                                If (((playerroom\Field22\Field21 <> $4C) And (playerroom\Field22\Field21 <> $6F)) <> 0) Then
                                    shouldplay = $0A
                                EndIf
                                If (0.64 < local13) Then
                                    local21 = local0\Field103
                                    If (((((((625.0 < local13) Lor (playerroom\Field22\Field21 = $6F)) Lor local23) Lor (local0\Field30 <> $01)) And (playerroom\Field22\Field21 <> $4C)) And ((chs\Field8 Lor i_268\Field3) = $00)) <> 0) Then
                                        If (((4.0 < local13) Lor (playerroom\Field22\Field21 = $6F)) <> 0) Then
                                            translateentity(local0\Field82, 0.0, (((entityy(XZ0260X8X2\Field74, $00, 1.0) - 0.3) - entityy(local0\Field82, $00, 1.0)) / 50.0), 0.0, $00)
                                        EndIf
                                        local0\Field64 = curvevalue(local0\Field32, local0\Field64, 10.0)
                                        pointentity(local0\Field98, XZ0260X8X2\Field74, 0.0)
                                        rotateentity(local0\Field82, 0.0, curveangle(entityyaw(local0\Field98, $00, 1.0), entityyaw(local0\Field82, $00, 1.0), (10.0 - (Float selecteddifficulty\Field8))), 0.0, $00)
                                        If (0.0 = XZ0260X8X2\Field48) Then
                                            animatenpc(local0, 284.0, 333.0, (local0\Field64 * 43.0), $01)
                                        Else
                                            local0\Field64 = 0.0
                                        EndIf
                                        local0\Field8 = max((local0\Field8 - fps\Field3[$00]), 0.0)
                                        If (0.0 >= local0\Field8) Then
                                            local0\Field30 = findpath(local0, entityx(XZ0260X8X2\Field74, $01, 1.0), entityy(XZ0260X8X2\Field74, $01, 1.0), entityz(XZ0260X8X2\Field74, $01, 1.0))
                                            local0\Field8 = 700.0
                                        EndIf
                                    ElseIf (0.0 < local0\Field8) Then
                                        local0\Field8 = max((local0\Field8 - fps\Field3[$00]), 0.0)
                                        If (local0\Field30 = $01) Then
                                            While (local0\Field71[local0\Field48] = Null)
                                                If (local0\Field48 > $14) Then
                                                    local0\Field48 = $00
                                                    local0\Field30 = $00
                                                    Exit
                                                Else
                                                    local0\Field48 = (local0\Field48 + $01)
                                                EndIf
                                            Wend
                                            If (local0\Field71[local0\Field48] <> Null) Then
                                                translateentity(local0\Field82, 0.0, (((entityy(local0\Field71[local0\Field48]\Field0, $01, 1.0) - 0.17) - entityy(local0\Field82, $00, 1.0)) / 50.0), 0.0, $00)
                                                pointentity(local0\Field98, local0\Field71[local0\Field48]\Field0, 0.0)
                                                local14 = entitydistancesquared(local0\Field82, local0\Field71[local0\Field48]\Field0)
                                                rotateentity(local0\Field82, 0.0, curveangle(entityyaw(local0\Field98, $00, 1.0), entityyaw(local0\Field82, $00, 1.0), min(20.0, (sqr(local14) * 10.0))), 0.0, $00)
                                                local0\Field64 = curvevalue(local0\Field32, local0\Field64, 10.0)
                                                animatenpc(local0, 284.0, 333.0, (local0\Field64 * 43.0), $01)
                                                If (0.1 > local14) Then
                                                    local0\Field48 = (local0\Field48 + $01)
                                                EndIf
                                            EndIf
                                        Else
                                            local0\Field64 = curvevalue(0.0, local0\Field64, 10.0)
                                            animatenpc(local0, 334.0, 494.0, 0.3, $01)
                                        EndIf
                                    Else
                                        local0\Field30 = findpath(local0, entityx(XZ0260X8X2\Field74, $01, 1.0), entityy(XZ0260X8X2\Field74, $01, 1.0), entityz(XZ0260X8X2\Field74, $01, 1.0))
                                        local0\Field8 = 700.0
                                        local0\Field64 = 0.0
                                    EndIf
                                    If (((100.0 > local13) Lor (playerroom\Field22\Field21 = $4C)) <> 0) Then
                                        For local2 = Each doors
                                            If (((((local2\Field5 = $00) And (local2\Field46 <> $08)) And (local2\Field28 = $00)) And (local2\Field39 = $00)) <> 0) Then
                                                If (((0.25 > entitydistancesquared(local0\Field82, local2\Field51)) And ((local2\Field32 <> Null) And (local2\Field32\Field22\Field21 <> $6F))) <> 0) Then
                                                    local0\Field6 = playsoundex(snd_i\Field58[rand($05, $07)], camera, local0\Field82, 10.0, 1.0, $00, $00)
                                                    affectdecaydoor(local2)
                                                    Exit
                                                EndIf
                                            EndIf
                                        Next
                                        If (((286.0 >= local21) And (286.0 < local0\Field103)) <> 0) Then
                                            playsoundex(TXDBZF46ZXF($02, $00, rand($00, $02)), camera, local0\Field82, 6.0, rnd(0.8, 1.0), $00, $00)
                                            local26 = createpivot($00)
                                            positionentity(local26, entityx(local0\Field82, $00, 1.0), (entityy(local0\Field82, $00, 1.0) + 0.1), entityz(local0\Field82, $00, 1.0), $00)
                                            turnentity(local26, 90.0, 0.0, 0.0, $00)
                                            If (entitypick(local26, 0.2) <> 0) Then
                                                local3 = createdecal($00, (entityx(local0\Field82, $01, 1.0) + (cos(entityyaw(local0\Field82, $00, 1.0)) * 0.1)), (pickedy() + 0.005), (entityz(local0\Field82, $01, 1.0) - (sin(entityyaw(local0\Field82, $00, 1.0)) * 0.1)), 90.0, rnd(360.0, 0.0), 0.0, 0.1, 0.8, $00, $01, $00, $00, $00)
                                                local3\Field14 = -0.00002
                                                local3\Field1 = 90000.0
                                            EndIf
                                            freeentity(local26)
                                            local26 = $00
                                        ElseIf (((311.0 >= local21) And (311.0 < local0\Field103)) <> 0) Then
                                            playsoundex(TXDBZF46ZXF($02, $00, rand($00, $02)), camera, local0\Field82, 6.0, rnd(0.8, 1.0), $00, $00)
                                            local26 = createpivot($00)
                                            positionentity(local26, entityx(local0\Field82, $00, 1.0), (entityy(local0\Field82, $00, 1.0) + 0.1), entityz(local0\Field82, $00, 1.0), $00)
                                            turnentity(local26, 90.0, 0.0, 0.0, $00)
                                            If (entitypick(local26, 0.2) <> 0) Then
                                                local3 = createdecal($00, (entityx(local0\Field82, $01, 1.0) - (cos(entityyaw(local0\Field82, $00, 1.0)) * 0.1)), (pickedy() + 0.005), (entityz(local0\Field82, $01, 1.0) + (sin(entityyaw(local0\Field82, $00, 1.0)) * 0.1)), 90.0, rnd(360.0, 0.0), 0.0, 0.1, 0.8, $00, $01, $00, $00, $00)
                                                local3\Field14 = -0.00002
                                                local3\Field1 = 90000.0
                                            EndIf
                                            freeentity(local26)
                                            local26 = $00
                                        EndIf
                                    EndIf
                                ElseIf (chs\Field8 = $00) Then
                                    If (0.25 < local13) Then
                                        local0\Field64 = curvevalue((local0\Field32 * 2.5), local0\Field64, 10.0)
                                    Else
                                        local0\Field64 = 0.0
                                    EndIf
                                    animatenpc(local0, 105.0, 110.0, 0.15, $00)
                                    If (((0.0 = XZ0260X8X2\Field48) And (0.0 <= XZ0260X8X2\Field52)) <> 0) Then
                                        pointentity(local0\Field98, XZ0260X8X2\Field74, 0.0)
                                        rotateentity(local0\Field82, 0.0, curveangle(entityyaw(local0\Field98, $00, 1.0), entityyaw(local0\Field82, $00, 1.0), (10.0 - (Float selecteddifficulty\Field8))), 0.0, $00)
                                        If (((110.0 = ceil(local0\Field103)) And (chs\Field0 = $00)) <> 0) Then
                                            playsound_strict(snd_i\Field50[$01], $00, $00)
                                            playsound_strict(snd_i\Field40[$05], $00, $00)
                                            If (playerroom\Field22\Field21 = $6F) Then
                                                msg\Field8 = format(getlocalstring("death", "106.dimension"), subjectname, "%s")
                                                kill($01, $01, $00, $01)
                                            ElseIf (playerroom\Field22\Field21 = $4C) Then
                                                msg\Field8 = format(getlocalstring("death", "106.gatea"), subjectname, "%s")
                                                kill($01, $01, $00, $01)
                                            Else
                                                playsound_strict(snd_i\Field58[$03], $01, $00)
                                                showentity(XZ0260X8X2\Field28)
                                                positionentity(XZ0260X8X2\Field28, entityx(camera, $01, 1.0), entityy(camera, $01, 1.0), entityz(camera, $01, 1.0), $01)
                                                resetentity(XZ0260X8X2\Field28)
                                                rotateentity(XZ0260X8X2\Field28, 0.0, (entityyaw(camera, $00, 1.0) + rnd(-45.0, 45.0)), 0.0, $00)
                                                XZ0260X8X2\Field52 = min(-1.0, XZ0260X8X2\Field52)
                                            EndIf
                                        EndIf
                                    EndIf
                                EndIf
                                moveentity(local0\Field82, 0.0, 0.0, (local0\Field64 * fps\Field3[$00]), $00)
                                updatesoundorigin(local0\Field6, camera, local0\Field82, 10.0, 1.0, $00, $01, $00)
                                If (playerroom\Field22\Field21 <> $4C) Then
                                    If (-250.0 > XZ0260X8X2\Field52) Then
                                        movetopocketdimension()
                                    EndIf
                                    If (0.0 = local0\Field62) Then
                                        If ((((100.0 < local13) And (isplayeroutsidefacility() = $00)) And (playerroom\Field22\Field21 <> $6F)) <> 0) Then
                                            If (entityinview(local0\Field98, camera) = $00) Then
                                                turnentity(XZ0260X8X2\Field74, 0.0, 180.0, 0.0, $00)
                                                If ((chs\Field8 Lor i_268\Field3) = $00) Then
                                                    local27 = entitypick(XZ0260X8X2\Field74, 5.0)
                                                Else
                                                    local27 = $00
                                                EndIf
                                                turnentity(XZ0260X8X2\Field74, 0.0, 180.0, 0.0, $00)
                                                If (local27 <> $00) Then
                                                    teleportentity(local0\Field82, pickedx(), pickedy(), pickedz(), local0\Field23, $00, 2.0, $00)
                                                    pointentity(local0\Field82, XZ0260X8X2\Field74, 0.0)
                                                    rotateentity(local0\Field82, 0.0, entityyaw(local0\Field82, $00, 1.0), 0.0, $00)
                                                    moveentity(local0\Field82, 0.0, 0.0, -2.0, $00)
                                                    playsoundex(snd_i\Field58[$03], camera, local0\Field82, 10.0, 1.0, $01, $00)
                                                    local0\Field6 = playsoundex(snd_i\Field58[rand($05, $07)], camera, local0\Field82, 10.0, 1.0, $00, $00)
                                                    local0\Field8 = 0.0
                                                    local0\Field62 = (560.0 / ((Float selecteddifficulty\Field8) + 1.0))
                                                EndIf
                                            EndIf
                                        EndIf
                                    EndIf
                                    local0\Field62 = max(0.0, (local0\Field62 - fps\Field3[$00]))
                                    If (0.0 >= local0\Field65) Then
                                        If (((entityinview(local0\Field98, camera) = $00) And (25.0 < local13)) <> 0) Then
                                            positionentity(local0\Field82, 0.0, -500.0, 0.0, $00)
                                            resetentity(local0\Field82)
                                            local0\Field65 = rnd(22000.0, 27000.0)
                                            local0\Field66 = 0.0
                                        EndIf
                                    EndIf
                                EndIf
                            Case 4.0
                                If (((111.0 > local0\Field103) Lor (259.0 < local0\Field103)) <> 0) Then
                                    local26 = createpivot($00)
                                    positionentity(local26, entityx(local0\Field82, $00, 1.0), (entityy(local0\Field82, $00, 1.0) + 0.1), entityz(local0\Field82, $00, 1.0), $00)
                                    turnentity(local26, 90.0, 0.0, 0.0, $00)
                                    If (entitypick(local26, 0.2) <> 0) Then
                                        local3 = createdecal($00, entityx(local0\Field82, $00, 1.0), (pickedy() + 0.005), entityz(local0\Field82, $00, 1.0), 90.0, rnd(360.0, 0.0), 0.0, rnd(0.5, 0.7), rnd(0.8, 1.0), $00, $01, $00, $00, $00)
                                        local3\Field14 = 0.004
                                        local3\Field14 = -0.00002
                                    EndIf
                                    freeentity(local26)
                                    local26 = $00
                                    local0\Field63 = playsoundex(loadtempsound("SFX\Ending\GateA\106Retreat.ogg"), camera, local0\Field98, 10.0, 1.0, $01, $00)
                                    setnpcframe(local0, 259.0, $01)
                                Else
                                    animatenpc(local0, 259.0, 111.0, -0.25, $00)
                                    If (150.0 >= local0\Field103) Then
                                        local0\Field65 = rnd(38500.0, 47250.0)
                                        local0\Field66 = 0.0
                                    EndIf
                                EndIf
                            Case 5.0
                                If (668.0 > local0\Field103) Then
                                    animatenpc(local0, 605.0, 667.0, 0.4, $01)
                                    If (((-16.0 < XZ0260X8X2\Field53) And (-6.0 > XZ0260X8X2\Field53)) <> 0) Then
                                        setnpcframe(local0, 668.0, $01)
                                    EndIf
                                ElseIf (0.0 = (Float local0\Field17)) Then
                                    animatenpc(local0, 668.0, 689.0, 0.2, $00)
                                    If (688.9 < local0\Field103) Then
                                        local0\Field17 = $01
                                    EndIf
                                Else
                                    animatenpc(local0, 693.0, 668.0, -0.2, $00)
                                    If (668.1 > local0\Field103) Then
                                        setnpcframe(local0, 605.0, $01)
                                        local0\Field17 = $00
                                    EndIf
                                EndIf
                        End Select
                        If (1.0 < local0\Field66) Then
                            If (rand($1F4, $01) = $01) Then
                                playsoundex(snd_i\Field58[rand($00, $02)], camera, local0\Field82, 10.0, 1.0, $00, $00)
                            EndIf
                            local0\Field63 = loopsoundex(snd_i\Field58[$04], local0\Field63, camera, local0\Field82, 8.0, 0.8, $01)
                        EndIf
                        resetentity(local0\Field82)
                        local0\Field70 = 0.0
                        positionentity(local0\Field98, entityx(local0\Field82, $00, 1.0), entityy(local0\Field82, $00, 1.0), entityz(local0\Field82, $00, 1.0), $00)
                        rotateentity(local0\Field98, 0.0, entityyaw(local0\Field82, $00, 1.0), 0.0, $00)
                    EndIf
                EndIf
            Case $06
                If (1.0 = local0\Field31) Then
                    If (((local0\Field63 <> $00) And local0\Field94) <> 0) Then
                        stopstream_strict(local0\Field63)
                        local0\Field63 = $00
                        local0\Field94 = $00
                    EndIf
                    local0\Field70 = 0.0
                Else
                    local13 = entitydistancesquared(XZ0260X8X2\Field74, local0\Field82)
                    local15 = wrapangle(deltayaw(local0\Field82, XZ0260X8X2\Field74), 360.0)
                    local48 = ((((local13 < (min(hidedistance, (fog\Field13 * lightvolume)) * min(hidedistance, (fog\Field13 * lightvolume)))) And ((135.0 > local15) Lor (225.0 < local15))) And entityvisible(camera, local0\Field101, 0.0)) And entityinview(local0\Field101, camera))
                    If (((T8660BZ460\Field11 > $00) And local48) <> 0) Then
                        If (T8660BZ460\Field2 > $00) Then
                            If (ChannelPlaying(scramblechn) = $00) Then
                                scramblechn = playsound_strict(snd_i\Field16, $00, $00)
                            EndIf
                            If (entityhidden(local0\Field101) <> 0) Then
                                showentity(local0\Field101)
                            EndIf
                            scalesprite(local0\Field101, rnd(0.06, 0.08), rnd(0.07, 0.09))
                            positionentity(local0\Field101, (rnd(0.1, 0.0) - 0.05), (rnd(0.1, 0.0) - 0.05), (rnd(0.1, 0.0) - 0.05), $00)
                        Else
                            If (entityhidden(local0\Field101) = $00) Then
                                hideentity(local0\Field101)
                            EndIf
                            If (ChannelPlaying(scramblechn) <> 0) Then
                                StopChannel(scramblechn)
                                scramblechn = $00
                            EndIf
                        EndIf
                    Else
                        If (entityhidden(local0\Field101) = $00) Then
                            hideentity(local0\Field101)
                        EndIf
                        If (ChannelPlaying(scramblechn) <> 0) Then
                            StopChannel(scramblechn)
                            scramblechn = $00
                        EndIf
                    EndIf
                    Select local0\Field66
                        Case 0.0
                            If (64.0 > local13) Then
                                If (local0\Field63 = $00) Then
                                    local0\Field63 = streamsound_strict("SFX\Music\096.ogg", 0.0, $02)
                                    local0\Field94 = $01
                                EndIf
                                If (-1.0 = local0\Field57) Then
                                    animatenpc(local0, 936.0, 1263.0, 0.1, $00)
                                    If (1262.9 <= local0\Field103) Then
                                        setnpcframe(local0, 312.0, $01)
                                        local0\Field57 = 0.0
                                        local0\Field66 = 1.0
                                    EndIf
                                Else
                                    animatenpc(local0, 936.0, 1263.0, 0.1, $01)
                                    If (420.0 > local0\Field57) Then
                                        local0\Field57 = (local0\Field57 + fps\Field3[$00])
                                    ElseIf (rand($05, $01) = $01) Then
                                        local0\Field57 = -1.0
                                    Else
                                        local0\Field57 = ((Float rand($00, $03)) * 70.0)
                                    EndIf
                                EndIf
                                If (chs\Field8 = $00) Then
                                    If (((T8660BZ460\Field11 = $00) And local48) <> 0) Then
                                        If (((((-16.0 > XZ0260X8X2\Field53) Lor (-6.0 < XZ0260X8X2\Field53)) And (0.0 = i_1025\Field1[$04])) And (T8660BZ460\Field5 = $00)) <> 0) Then
                                            playsound_strict(loadtempsound("SFX\SCP\096\Triggered.ogg"), $01, $00)
                                            _S2IMapErase(unlockedachievements, "096")
                                            XZ0260X8X2\Field51 = 10.0
                                            setnpcframe(local0, 194.0, $01)
                                            stopstream_strict(local0\Field63)
                                            local0\Field63 = $00
                                            local0\Field94 = $00
                                            local0\Field55 = $00
                                            local0\Field57 = 0.0
                                            local0\Field66 = 2.0
                                        EndIf
                                    EndIf
                                EndIf
                            EndIf
                            updatestreamsoundorigin(local0\Field63, camera, local0\Field82, 8.0, 1.0, $01)
                        Case 1.0
                            If (256.0 > local13) Then
                                If (local0\Field63 = $00) Then
                                    local0\Field63 = streamsound_strict("SFX\Music\096.ogg", 0.0, $02)
                                    local0\Field94 = $01
                                EndIf
                                local21 = local0\Field103
                                If (422.0 <= local0\Field103) Then
                                    local0\Field65 = (local0\Field65 + fps\Field3[$00])
                                    If (1000.0 < local0\Field65) Then
                                        If (1600.0 < local0\Field65) Then
                                            local0\Field65 = rnd(0.0, 500.0)
                                        EndIf
                                        If (1382.0 > local0\Field103) Then
                                            local0\Field64 = curvevalue((local0\Field32 * 0.1), local0\Field64, 5.0)
                                            animatenpc(local0, 1369.0, 1382.0, (local0\Field64 * 45.0), $00)
                                        Else
                                            local0\Field64 = curvevalue((local0\Field32 * 0.1), local0\Field64, 5.0)
                                            animatenpc(local0, 1383.0, 1456.0, (local0\Field64 * 45.0), $01)
                                        EndIf
                                        If ((Float millisecs()) > local0\Field57) Then
                                            local0\Field17 = $00
                                            If (entityvisible(XZ0260X8X2\Field74, local0\Field82, 0.0) <> 0) Then
                                                local0\Field17 = $01
                                            Else
                                                hideentity(local0\Field82)
                                                entitypick(local0\Field82, 1.5)
                                                If (pickedentity() <> $00) Then
                                                    local0\Field84 = (entityyaw(local0\Field82, $00, 1.0) + rnd(80.0, 110.0))
                                                EndIf
                                                showentity(local0\Field82)
                                            EndIf
                                            local0\Field57 = (Float (millisecs() + $7D0))
                                        EndIf
                                        If (local0\Field17 <> 0) Then
                                            pointentity(local0\Field98, XZ0260X8X2\Field74, 0.0)
                                            rotateentity(local0\Field82, 0.0, curveangle(entityyaw(local0\Field98, $00, 1.0), entityyaw(local0\Field82, $00, 1.0), 130.0), 0.0, $00)
                                            If (2.25 > local13) Then
                                                local0\Field65 = 0.0
                                            EndIf
                                        Else
                                            rotateentity(local0\Field82, 0.0, curveangle(local0\Field84, entityyaw(local0\Field82, $00, 1.0), 50.0), 0.0, $00)
                                        EndIf
                                    ElseIf (472.0 < local0\Field103) Then
                                        local0\Field64 = curvevalue((local0\Field32 * 0.05), local0\Field64, 8.0)
                                        animatenpc(local0, 1383.0, 1469.0, (local0\Field64 * 45.0), $00)
                                        If (1468.9 <= local0\Field103) Then
                                            setnpcframe(local0, 423.0, $01)
                                        EndIf
                                    Else
                                        local0\Field64 = curvevalue(0.0, local0\Field64, 4.0)
                                        animatenpc(local0, 423.0, 471.0, 0.2, $01)
                                    EndIf
                                    moveentity(local0\Field82, 0.0, 0.0, (local0\Field64 * fps\Field3[$00]), $00)
                                Else
                                    animatenpc(local0, 312.0, 422.0, 0.3, $00)
                                EndIf
                                If (chs\Field8 = $00) Then
                                    If (((T8660BZ460\Field11 = $00) And local48) <> 0) Then
                                        If (((((-16.0 > XZ0260X8X2\Field53) Lor (-6.0 < XZ0260X8X2\Field53)) And (0.0 = i_1025\Field1[$04])) And (T8660BZ460\Field5 = $00)) <> 0) Then
                                            playsound_strict(loadtempsound("SFX\SCP\096\Triggered.ogg"), $01, $00)
                                            _S2IMapErase(unlockedachievements, "096")
                                            XZ0260X8X2\Field51 = 10.0
                                            If (422.0 <= local0\Field103) Then
                                                setnpcframe(local0, 677.0, $01)
                                            EndIf
                                            stopstream_strict(local0\Field63)
                                            local0\Field63 = $00
                                            local0\Field94 = $00
                                            local0\Field55 = $00
                                            local0\Field66 = 3.0
                                        EndIf
                                    EndIf
                                EndIf
                                If (0.001 < local0\Field64) Then
                                    If (((((1383.0 > local21) And (1383.0 <= local0\Field103)) Lor ((1420.0 > local21) And (1420.0 <= local0\Field103))) Lor ((1466.0 > local21) And (1466.0 <= local0\Field103))) <> 0) Then
                                        playsoundex(snd_i\Field51[rand($0A, $0C)], camera, local0\Field82, 8.0, rnd(0.8, 1.0), $00, $00)
                                    EndIf
                                EndIf
                            EndIf
                            updatestreamsoundorigin(local0\Field63, camera, local0\Field82, 14.0, 1.0, $01)
                        Case 2.0,3.0,4.0
                            If (local0\Field63 = $00) Then
                                local0\Field63 = streamsound_strict("SFX\Music\096Angered.ogg", 0.0, $02)
                                local0\Field94 = $01
                            EndIf
                            updatestreamsoundorigin(local0\Field63, camera, local0\Field82, 10.0, 1.0, $01)
                            If (2.0 = local0\Field66) Then
                                If (312.0 > local0\Field103) Then
                                    animatenpc(local0, 193.0, 311.0, 0.3, $00)
                                    If (310.9 < local0\Field103) Then
                                        setnpcframe(local0, 737.0, $01)
                                        local0\Field66 = 3.0
                                    EndIf
                                ElseIf (((312.0 <= local0\Field103) And (422.0 >= local0\Field103)) <> 0) Then
                                    animatenpc(local0, 312.0, 422.0, 0.3, $00)
                                    If (421.9 < local0\Field103) Then
                                        setnpcframe(local0, 677.0, $01)
                                    EndIf
                                Else
                                    animatenpc(local0, 677.0, 736.0, 0.3, $00)
                                    If (735.9 < local0\Field103) Then
                                        setnpcframe(local0, 737.0, $01)
                                        local0\Field66 = 3.0
                                    EndIf
                                EndIf
                            ElseIf (3.0 = local0\Field66) Then
                                animatenpc(local0, 677.0, 737.0, 0.3, $00)
                                If (737.0 <= local0\Field103) Then
                                    local0\Field65 = 0.0
                                    local0\Field66 = 4.0
                                EndIf
                            ElseIf (4.0 = local0\Field66) Then
                                local0\Field65 = (local0\Field65 + fps\Field3[$00])
                                If (1820.0 < local0\Field65) Then
                                    animatenpc(local0, 823.0, 847.0, (local0\Field32 * 8.0), $00)
                                    If (846.9 < local0\Field103) Then
                                        stopstream_strict(local0\Field63)
                                        local0\Field63 = $00
                                        local0\Field94 = $00
                                        local0\Field66 = 5.0
                                    EndIf
                                Else
                                    animatenpc(local0, 1471.0, 1556.0, 0.4, $01)
                                EndIf
                            EndIf
                        Case 5.0
                            XZ0260X8X2\Field51 = curvevalue(max(XZ0260X8X2\Field51, ((sin(((Float millisec) / 20.0)) + 1.0) * 10.0)), XZ0260X8X2\Field51, 8.0)
                            If (local0\Field59 = Null) Then
                                If (local0\Field63 = $00) Then
                                    local0\Field63 = streamsound_strict("SFX\SCP\096\Scream.ogg", 0.0, $02)
                                    local0\Field94 = $01
                                EndIf
                                updatestreamsoundorigin(local0\Field63, camera, local0\Field82, 7.5, 1.0, $01)
                                If (local0\Field6 = $00) Then
                                    local0\Field6 = streamsound_strict("SFX\Music\096Chase.ogg", 0.0, $02)
                                    local0\Field88 = $01
                                Else
                                    setstreamvolume_strict(local0\Field6, ((clamp((8.0 - sqr(local13)), 0.6, 1.0) * opt\Field59) * opt\Field2))
                                EndIf
                            EndIf
                            If (0.0 = XZ0260X8X2\Field48) Then
                                If (local0\Field59 <> Null) Then
                                    local13 = entitydistancesquared(local0\Field59\Field82, local0\Field82)
                                EndIf
                                If ((Float millisecs()) > local0\Field57) Then
                                    local0\Field17 = $00
                                    If (local0\Field59 = Null) Then
                                        If (((64.0 > local13) And entityvisible(XZ0260X8X2\Field74, local0\Field82, 0.0)) <> 0) Then
                                            local0\Field17 = $01
                                        EndIf
                                    ElseIf (((64.0 > local13) And entityvisible(local0\Field59\Field82, local0\Field82, 0.0)) <> 0) Then
                                        local0\Field17 = $01
                                    EndIf
                                    local0\Field57 = (Float (millisecs() + $7D0))
                                EndIf
                                If ((chs\Field8 And (local0\Field59 = Null)) <> 0) Then
                                    local0\Field17 = $00
                                EndIf
                                If (local0\Field17 = $01) Then
                                    local0\Field8 = max(210.0, local0\Field8)
                                    local0\Field30 = $00
                                    If (((7.84 > local13) Lor (150.0 > local0\Field103)) <> 0) Then
                                        If (193.0 < local0\Field103) Then
                                            setnpcframe(local0, 2.0, $01)
                                        EndIf
                                        animatenpc(local0, 2.0, 193.0, 0.7, $01)
                                        If (1.0 < local13) Then
                                            local0\Field64 = curvevalue((local0\Field32 * 2.0), local0\Field64, 15.0)
                                        Else
                                            local0\Field64 = 0.0
                                            If (local0\Field59 = Null) Then
                                                If (chs\Field0 = $00) Then
                                                    playsound_strict(snd_i\Field50[$04], $00, $00)
                                                    XZ0260X8X2\Field1 = 30.0
                                                    XZ0260X8X2\Field64 = 2000.0
                                                    msg\Field8 = format(getlocalstring("death", "096"), subjectname, "%s")
                                                    For local11 = $00 To $09 Step $01
                                                        local26 = createpivot($00)
                                                        positionentity(local26, (entityx(XZ0260X8X2\Field74, $00, 1.0) + rnd(-0.8, 0.8)), (entityy(XZ0260X8X2\Field74, $00, 1.0) - 0.05), (entityz(XZ0260X8X2\Field74, $00, 1.0) + rnd(-0.8, 0.8)), $00)
                                                        turnentity(local26, 90.0, 0.0, 0.0, $00)
                                                        entitypick(local26, 0.3)
                                                        local3 = createdecal(rand($11, $12), pickedx(), (pickedy() + 0.005), pickedz(), 90.0, rnd(360.0, 0.0), 0.0, rnd(0.1, 0.3), 1.0, $00, $01, $00, $00, $00)
                                                        entityparent(local3\Field0, playerroom\Field15, $01)
                                                        freeentity(local26)
                                                        local26 = $00
                                                    Next
                                                    kill($01, $01, $00, $01)
                                                    XZ0260X8X2\Field36 = $01
                                                    changenpctextureid(local0, $0F)
                                                EndIf
                                            EndIf
                                        EndIf
                                        If (local0\Field59 = Null) Then
                                            pointentity(local0\Field82, XZ0260X8X2\Field74, 0.0)
                                        Else
                                            pointentity(local0\Field82, local0\Field59\Field82, 0.0)
                                        EndIf
                                    Else
                                        If (local0\Field59 = Null) Then
                                            pointentity(local0\Field98, XZ0260X8X2\Field74, 0.0)
                                        Else
                                            pointentity(local0\Field98, local0\Field59\Field82, 0.0)
                                        EndIf
                                        rotateentity(local0\Field82, 0.0, curveangle(entityyaw(local0\Field98, $00, 1.0), entityyaw(local0\Field82, $00, 1.0), 5.0), 0.0, $00)
                                        If (847.0 < local0\Field103) Then
                                            local0\Field64 = curvevalue(local0\Field32, local0\Field64, 20.0)
                                        EndIf
                                        If (906.0 > local0\Field103) Then
                                            animatenpc(local0, 737.0, 906.0, (local0\Field32 * 8.0), $00)
                                        Else
                                            animatenpc(local0, 907.0, 935.0, (local0\Field64 * 8.0), $01)
                                        EndIf
                                    EndIf
                                    rotateentity(local0\Field82, 0.0, entityyaw(local0\Field82, $00, 1.0), 0.0, $01)
                                    moveentity(local0\Field82, 0.0, 0.0, (local0\Field64 * fps\Field3[$00]), $00)
                                ElseIf (0.0 >= local0\Field8) Then
                                    If (local0\Field59 <> Null) Then
                                        local0\Field30 = findpath(local0, entityx(local0\Field59\Field82, $00, 1.0), (entityy(local0\Field59\Field82, $00, 1.0) + 0.2), entityz(local0\Field59\Field82, $00, 1.0))
                                    Else
                                        local0\Field30 = findpath(local0, entityx(XZ0260X8X2\Field74, $00, 1.0), (entityy(XZ0260X8X2\Field74, $00, 1.0) + 0.2), entityz(XZ0260X8X2\Field74, $00, 1.0))
                                    EndIf
                                    local0\Field8 = 350.0
                                ElseIf (((local0\Field30 = $01) And (chs\Field8 = $00)) <> 0) Then
                                    If (local0\Field71[local0\Field48] = Null) Then
                                        If (local0\Field48 > $14) Then
                                            local0\Field48 = $00
                                            local0\Field30 = $00
                                        Else
                                            local0\Field48 = (local0\Field48 + $01)
                                        EndIf
                                    Else
                                        pointentity(local0\Field98, local0\Field71[local0\Field48]\Field0, 0.0)
                                        rotateentity(local0\Field82, 0.0, curveangle(entityyaw(local0\Field98, $00, 1.0), entityyaw(local0\Field82, $00, 1.0), 5.0), 0.0, $00)
                                        If (847.0 < local0\Field103) Then
                                            local0\Field64 = curvevalue((local0\Field32 * 1.5), local0\Field64, 15.0)
                                        EndIf
                                        moveentity(local0\Field82, 0.0, 0.0, (local0\Field64 * fps\Field3[$00]), $00)
                                        If (906.0 > local0\Field103) Then
                                            animatenpc(local0, 737.0, 906.0, (local0\Field32 * 8.0), $00)
                                        Else
                                            animatenpc(local0, 907.0, 935.0, (local0\Field64 * 8.0), $01)
                                        EndIf
                                        local14 = entitydistancesquared(local0\Field82, local0\Field71[local0\Field48]\Field0)
                                        If (0.64 > local14) Then
                                            If (local0\Field71[local0\Field48]\Field7 <> Null) Then
                                                If (local0\Field71[local0\Field48]\Field7\Field39 = $00) Then
                                                    GUESSEDupdatetform(local0\Field71[local0\Field48]\Field7, entityx(local0\Field82, $00, 1.0), entityy(local0\Field82, $00, 1.0), entityz(local0\Field82, $00, 1.0))
                                                EndIf
                                            EndIf
                                            If (0.08 > local14) Then
                                                local0\Field48 = (local0\Field48 + $01)
                                            EndIf
                                        EndIf
                                    EndIf
                                    local0\Field8 = max(0.0, (local0\Field8 - fps\Field3[$00]))
                                Else
                                    local0\Field64 = 0.0
                                    animatenpc(local0, 1471.0, 1556.0, 0.1, $01)
                                    local0\Field8 = max(0.0, (local0\Field8 - (fps\Field3[$00] * 2.0)))
                                EndIf
                                If (rand($19, $01) = $01) Then
                                    If (225.0 < local13) Then
                                        teleportcloser(local0)
                                    EndIf
                                EndIf
                            Else
                                animatenpc(local0, min(27.0, animtime(local0\Field98)), 193.0, 0.5, $01)
                            EndIf
                    End Select
                    If (1.0 < local0\Field66) Then
                        For local5 = Each events
                            If (local5\Field32 = $20) Then
                                If (0.0 = local5\Field4) Then
                                    For local11 = $00 To $01 Step $01
                                        local5\Field19\Field25[local11]\Field21 = $00
                                    Next
                                    local5\Field4 = 3150.0
                                    removeevent(local5)
                                EndIf
                                Exit
                            EndIf
                        Next
                        If (local0\Field59 = Null) Then
                            cansave = $02
                        EndIf
                    EndIf
                EndIf
                positionentity(local0\Field98, entityx(local0\Field82, $00, 1.0), entityy(local0\Field82, $00, 1.0), entityz(local0\Field82, $00, 1.0), $00)
                rotateentity(local0\Field98, entitypitch(local0\Field82, $00, 1.0), entityyaw(local0\Field82, $00, 1.0), 0.0, $00)
            Case $03
                If (66.0 <> local0\Field66) Then
                    If (0.1 < local0\Field31) Then
                        If (playerroom\Field22\Field21 <> $3C) Then
                            local0\Field31 = max((local0\Field31 - ((Float (selecteddifficulty\Field2 + $01)) * fps\Field3[$00])), 0.1)
                        EndIf
                        local0\Field70 = 0.0
                        If (ChannelPlaying(local0\Field63) <> 0) Then
                            StopChannel(local0\Field63)
                            local0\Field63 = $00
                        EndIf
                        If (ChannelPlaying(local0\Field6) <> 0) Then
                            StopChannel(local0\Field6)
                            local0\Field6 = $00
                        EndIf
                        positionentity(local0\Field82, 0.0, -500.0, 0.0, $00)
                        resetentity(local0\Field82)
                    Else
                        local21 = local0\Field103
                        local13 = entitydistancesquared(XZ0260X8X2\Field74, local0\Field82)
                        updatenpcblinking(local0)
                        If (0.25 <= local13) Then
                            remove714timer = min((fps\Field3[$00] + remove714timer), 500.0)
                            removehazmattimer = min((fps\Field3[$00] + removehazmattimer), 500.0)
                        ElseIf (chs\Field8 = $00) Then
                            If (((1.0 < local0\Field66) And (3.0 <> local0\Field66)) <> 0) Then
                                If (entityvisible(XZ0260X8X2\Field74, local0\Field82, 0.0) <> 0) Then
                                    If (T8660BZ460\Field10 > $00) Then
                                        removehazmattimer = (removehazmattimer - (fps\Field3[$00] * 1.5))
                                        If ((((350.0 > removehazmattimer) And (350.0 <= ((fps\Field3[$00] * 1.5) + removehazmattimer))) And (ChannelPlaying(local0\Field6) = $00)) <> 0) Then
                                            local0\Field6 = playsoundex(loadtempsound("SFX\SCP\049\TakeOffHazmat.ogg"), camera, local0\Field82, 10.0, 1.0, $01, $00)
                                        ElseIf (0.0 >= removehazmattimer) Then
                                            For local11 = $00 To $02 Step $01
                                                If (((removehazmattimer < (- (((Float (T8660BZ460\Field10 = $04)) * 250.0) * (Float local11)))) And ((- (((Float (T8660BZ460\Field10 = $04)) * 250.0) * (Float local11))) <= ((fps\Field3[$00] * 1.5) + removehazmattimer))) <> 0) Then
                                                    XZ0260X8X2\Field1 = 2.0
                                                    If (local11 = $02) Then
                                                        For local11 = $00 To (maxitemamount - $01) Step $01
                                                            If (TX60DB8XBBZ(local11) <> Null) Then
                                                                If (((TX60DB8XBBZ(local11)\Field6\Field9 >= $3C) And (TX60DB8XBBZ(local11)\Field6\Field9 <= $3F)) <> 0) Then
                                                                    playsound_strict(snd_i\Field46[TX60DB8XBBZ(local11)\Field6\Field5], $00, $00)
                                                                    createmsg(getlocalstring("msg", "suit.destroyed"), 6.0)
                                                                    T8660BZ460\Field10 = $00
                                                                    removeitem(TX60DB8XBBZ(local11), $01)
                                                                    Exit
                                                                EndIf
                                                            EndIf
                                                        Next
                                                    EndIf
                                                EndIf
                                            Next
                                        EndIf
                                    ElseIf (i_714\Field0 > $00) Then
                                        XZ0260X8X2\Field64 = (XZ0260X8X2\Field64 + (fps\Field3[$00] * 2.5))
                                        If (i_268\Field3 <> 0) Then
                                            remove714timer = min(remove714timer, 499.0)
                                        Else
                                            remove714timer = (remove714timer - (fps\Field3[$00] * (3.0 / (Float i_714\Field0))))
                                            If ((((350.0 > remove714timer) And (350.0 <= ((fps\Field3[$00] * 1.5) + remove714timer))) And (ChannelPlaying(local0\Field6) = $00)) <> 0) Then
                                                If (i_714\Field0 = $02) Then
                                                    local0\Field6 = playsoundex(loadtempsound("SFX\SCP\049\714Equipped.ogg"), camera, local0\Field82, 10.0, 1.0, $01, $00)
                                                EndIf
                                            ElseIf (0.0 >= remove714timer) Then
                                                For local11 = $00 To (maxitemamount - $01) Step $01
                                                    If (TX60DB8XBBZ(local11) <> Null) Then
                                                        If (((TX60DB8XBBZ(local11)\Field6\Field9 = $19) Lor (TX60DB8XBBZ(local11)\Field6\Field9 = $18)) <> 0) Then
                                                            createmsg(getlocalstring("msg", "714.forceremoved"), 6.0)
                                                            i_714\Field0 = $00
                                                            dropitem(TX60DB8XBBZ(local11), $01)
                                                            Exit
                                                        EndIf
                                                    EndIf
                                                Next
                                            EndIf
                                        EndIf
                                    Else
                                        XZ0260X8X2\Field51 = 20.0
                                        XZ0260X8X2\Field64 = 500.0
                                        If (chs\Field0 = $00) Then
                                            If (playerroom\Field22\Field21 = $3C) Then
                                                For local5 = Each events
                                                    If (local5\Field32 = $24) Then
                                                        local5\Field4 = -1.0
                                                        Exit
                                                    EndIf
                                                Next
                                                If (0.0 <= XZ0260X8X2\Field52) Then
                                                    showentity(XZ0260X8X2\Field28)
                                                    positionentity(XZ0260X8X2\Field28, entityx(camera, $01, 1.0), entityy(camera, $01, 1.0), entityz(camera, $01, 1.0), $01)
                                                    resetentity(XZ0260X8X2\Field28)
                                                    rotateentity(XZ0260X8X2\Field28, 0.0, (entityyaw(camera, $00, 1.0) + rnd(-45.0, 45.0)), 0.0, $00)
                                                    XZ0260X8X2\Field52 = min(-1.0, XZ0260X8X2\Field52)
                                                EndIf
                                            Else
                                                msg\Field8 = getlocalstring("death", "049")
                                                kill($00, $01, $00, $01)
                                                XZ0260X8X2\Field36 = $00
                                            EndIf
                                            playsound_strict(loadtempsound("SFX\SCP\049\Horror.ogg"), $00, $00)
                                            loadnpcsound(local0, (("SFX\SCP\049\Kidnap" + (Str rand($00, $01))) + ".ogg"), $01)
                                            local0\Field6 = playsound_strict(local0\Field67, $01, $00)
                                            local0\Field66 = 3.0
                                        EndIf
                                    EndIf
                                EndIf
                            EndIf
                        EndIf
                        local0\Field63 = loopsoundex(npcsound[$05], local0\Field63, camera, local0\Field82, 10.0, 1.0, $01)
                        If (0.1 = local0\Field31) Then
                            If (playerinreachableroom($00, $00, $01) <> 0) Then
                                For local11 = $00 To $03 Step $01
                                    If (playerroom\Field29[local11] <> Null) Then
                                        For local12 = $00 To $03 Step $01
                                            If (playerroom\Field29[local11]\Field29[local12] <> Null) Then
                                                If (playerroom\Field29[local11]\Field29[local12] <> playerroom) Then
                                                    If (playerroom\Field29[local11]\Field29[local12]\Field35 <> $00) Then
                                                        teleportentity(local0\Field82, entityx(playerroom\Field29[local11]\Field29[local12]\Field35, $01, 1.0), (playerroom\Field29[local11]\Field29[local12]\Field3 + 0.5), entityz(playerroom\Field29[local11]\Field29[local12]\Field35, $01, 1.0), local0\Field23, $01, 2.0, $00)
                                                    Else
                                                        teleportentity(local0\Field82, playerroom\Field29[local11]\Field29[local12]\Field40, (playerroom\Field29[local11]\Field29[local12]\Field3 + 0.5), playerroom\Field29[local11]\Field29[local12]\Field37, local0\Field23, $01, 2.0, $00)
                                                    EndIf
                                                    local0\Field90 = playerroom\Field29[local11]\Field29[local12]
                                                    Exit
                                                EndIf
                                            EndIf
                                        Next
                                        Exit
                                    EndIf
                                Next
                                local0\Field31 = 0.0
                            EndIf
                        EndIf
                        Select local0\Field66
                            Case 0.0
                            Case 1.0
                                If (538.0 <= local0\Field103) Then
                                    animatenpc(local0, 659.0, 538.0, -0.45, $00)
                                    If (537.9 < local0\Field103) Then
                                        setnpcframe(local0, 37.0, $01)
                                    EndIf
                                Else
                                    animatenpc(local0, 37.0, 269.0, 0.7, $00)
                                    If (268.9 < local0\Field103) Then
                                        local0\Field66 = 2.0
                                    EndIf
                                EndIf
                            Case 2.0
                                If ((((local13 < ((hidedistance * 2.0) * (hidedistance * 2.0))) And (0.0 = local0\Field31)) And playerinreachableroom($01, $00, $01)) <> 0) Then
                                    local0\Field65 = max((local0\Field65 - fps\Field3[$00]), 0.0)
                                    local22 = npcseesplayer(local0, (8.0 - XZ0260X8X2\Field46), 75.0, $00)
                                    If (0.0 < local0\Field65) Then
                                        If (local22 = $01) Then
                                            local0\Field65 = 140.0
                                        EndIf
                                        If (entityvisible(local0\Field82, XZ0260X8X2\Field74, 0.0) <> 0) Then
                                            pointentity(local0\Field82, XZ0260X8X2\Field74, 0.0)
                                        EndIf
                                        If (((local0\Field13 <= $01) And (ChannelPlaying(local0\Field6) = $00)) <> 0) Then
                                            loadnpcsound(local0, (("SFX\SCP\049\Spotted" + (Str rand($00, $06))) + ".ogg"), $01)
                                            local0\Field6 = playsoundex(local0\Field67, camera, local0\Field98, 10.0, 1.0, $01, $00)
                                            local0\Field13 = $02
                                        EndIf
                                        local0\Field30 = $00
                                        local0\Field8 = 0.0
                                        local0\Field48 = $00
                                        rotateentity(local0\Field82, 0.0, entityyaw(local0\Field82, $01, 1.0), 0.0, $01)
                                        If (0.2375 < local13) Then
                                            local0\Field64 = curvevalue(local0\Field32, local0\Field64, 20.0)
                                            moveentity(local0\Field82, 0.0, 0.0, (local0\Field64 * fps\Field3[$00]), $00)
                                            If (9.0 > local13) Then
                                                animatenpc(local0, clamp(animtime(local0\Field98), 394.0, 428.0), 463.0, (local0\Field64 * 35.0), $01)
                                            ElseIf (427.9 < local0\Field103) Then
                                                animatenpc(local0, min(animtime(local0\Field98), 464.0), 498.0, (local0\Field64 * 35.0), $00)
                                                If (497.9 < local0\Field103) Then
                                                    setnpcframe(local0, 358.0, $01)
                                                EndIf
                                            Else
                                                animatenpc(local0, clamp(animtime(local0\Field98), 346.0, 358.0), 393.0, (local0\Field64 * 35.0), $01)
                                            EndIf
                                        EndIf
                                        local0\Field84 = curveangle(entityyaw(local0\Field82, $01, 1.0), local0\Field84, (15.0 - ((Float selecteddifficulty\Field8) * 1.5)))
                                    Else
                                        If (local22 = $01) Then
                                            local0\Field65 = 140.0
                                        EndIf
                                        If (local0\Field30 = $01) Then
                                            While (local0\Field71[local0\Field48] = Null)
                                                If (local0\Field48 > $14) Then
                                                    local0\Field48 = $00
                                                    local0\Field30 = $00
                                                    Exit
                                                Else
                                                    local0\Field48 = (local0\Field48 + $01)
                                                EndIf
                                            Wend
                                            If (local0\Field71[local0\Field48] <> Null) Then
                                                local0\Field64 = curvevalue(local0\Field32, local0\Field64, 20.0)
                                                pointentity(local0\Field82, local0\Field71[local0\Field48]\Field0, 0.0)
                                                rotateentity(local0\Field82, 0.0, entityyaw(local0\Field82, $01, 1.0), 0.0, $01)
                                                moveentity(local0\Field82, 0.0, 0.0, (local0\Field64 * fps\Field3[$00]), $00)
                                                animatenpc(local0, clamp(animtime(local0\Field98), 346.0, 358.0), 393.0, (local0\Field64 * 35.0), $01)
                                                local0\Field84 = curveangle(entityyaw(local0\Field82, $01, 1.0), local0\Field84, (15.0 - ((Float selecteddifficulty\Field8) * 1.5)))
                                                If (((local0\Field13 = $00) And (ChannelPlaying(local0\Field6) = $00)) <> 0) Then
                                                    If (rand($1E, $01) = $01) Then
                                                        loadnpcsound(local0, "SFX\SCP\049\Searching6.ogg", $01)
                                                    Else
                                                        loadnpcsound(local0, (("SFX\SCP\049\Searching" + (Str rand($00, $05))) + ".ogg"), $01)
                                                    EndIf
                                                    local0\Field6 = playsoundex(local0\Field67, camera, local0\Field82, 10.0, 1.0, $01, $00)
                                                    local0\Field13 = $01
                                                EndIf
                                                usedoornpc(local0, $01, $00)
                                                If (((rand($258, $01) = $01) And (ChannelPlaying(local0\Field6) = $00)) <> 0) Then
                                                    local0\Field13 = $00
                                                EndIf
                                                If (local0\Field13 > $01) Then
                                                    local0\Field13 = $01
                                                EndIf
                                            EndIf
                                        Else
                                            local0\Field8 = (local0\Field8 + fps\Field3[$00])
                                            local0\Field64 = 0.0
                                            If (((4.0 - ((Float selecteddifficulty\Field2) * 2.0)) * 70.0) < local0\Field8) Then
                                                local0\Field30 = findpath(local0, entityx(XZ0260X8X2\Field74, $00, 1.0), entityy(XZ0260X8X2\Field74, $00, 1.0), entityz(XZ0260X8X2\Field74, $00, 1.0))
                                                local0\Field8 = 0.0
                                                local0\Field57 = 0.0
                                                If (local0\Field30 <> $01) Then
                                                    local51 = entitydistancesquared(playerroom\Field15, local0\Field82)
                                                    local52 = playerroom
                                                    local53 = 0.0
                                                    For local11 = $00 To $03 Step $01
                                                        If (playerroom\Field29[local11] <> Null) Then
                                                            local53 = entitydistancesquared(playerroom\Field29[local11]\Field15, local0\Field82)
                                                            If (local51 > local53) Then
                                                                local51 = local53
                                                                local52 = playerroom\Field29[local11]
                                                            EndIf
                                                        EndIf
                                                    Next
                                                    local0\Field30 = findpath(local0, entityx(local52\Field15, $00, 1.0), 0.5, entityz(local52\Field15, $00, 1.0))
                                                EndIf
                                                While (3.0 > (Float (Int local0\Field57)))
                                                    If (local0\Field30 = $01) Then
                                                        If (local0\Field71[$01] <> Null) Then
                                                            If (((local0\Field71[$02] = Null) And (0.16 > entitydistancesquared(local0\Field71[$01]\Field0, local0\Field82))) <> 0) Then
                                                                local0\Field48 = $00
                                                                local0\Field30 = $00
                                                            EndIf
                                                        EndIf
                                                        If (((local0\Field71[$00] <> Null) And (local0\Field71[$01] = Null)) <> 0) Then
                                                            local0\Field48 = $00
                                                            local0\Field30 = $00
                                                        EndIf
                                                    EndIf
                                                    If (local0\Field30 <> $01) Then
                                                        local51 = 10000.0
                                                        local52 = playerroom
                                                        local53 = 0.0
                                                        For local11 = $00 To $03 Step $01
                                                            If (playerroom\Field29[local11] <> Null) Then
                                                                local53 = entitydistancesquared(playerroom\Field29[local11]\Field15, local0\Field82)
                                                                If (local51 > local53) Then
                                                                    local51 = local53
                                                                    For local12 = $00 To $03 Step $01
                                                                        If (playerroom\Field29[local11]\Field29[local12] <> Null) Then
                                                                            If (playerroom\Field29[local11]\Field29[local12] <> playerroom) Then
                                                                                local52 = playerroom\Field29[local11]\Field29[local12]
                                                                                Exit
                                                                            EndIf
                                                                        EndIf
                                                                    Next
                                                                EndIf
                                                            EndIf
                                                        Next
                                                        local0\Field30 = findpath(local0, entityx(local52\Field15, $00, 1.0), 0.5, entityz(local52\Field15, $00, 1.0))
                                                    EndIf
                                                    If (local0\Field30 = $01) Then
                                                        If (local0\Field71[$01] <> Null) Then
                                                            If (local0\Field71[$01]\Field7 <> Null) Then
                                                                If (((((local0\Field71[$01]\Field7\Field21 > $00) Lor (local0\Field71[$01]\Field7\Field44 <> $00)) Lor (local0\Field71[$01]\Field7\Field52 <> $00)) And (local0\Field71[$01]\Field7\Field39 = $00)) <> 0) Then
                                                                    Repeat
                                                                        If (local0\Field48 > $14) Then
                                                                            local0\Field48 = $00
                                                                            local0\Field30 = $00
                                                                            Exit
                                                                        Else
                                                                            local0\Field48 = (local0\Field48 + $01)
                                                                        EndIf
                                                                        If (local0\Field71[local0\Field48] <> Null) Then
                                                                            If ((45.0 - (Abs deltayaw(local0\Field82, local0\Field71[$01]\Field0))) < (Abs deltayaw(local0\Field82, local0\Field71[local0\Field48]\Field0))) Then
                                                                                local0\Field57 = 3.0
                                                                                Exit
                                                                            EndIf
                                                                        EndIf
                                                                    Forever
                                                                Else
                                                                    local0\Field57 = 3.0
                                                                EndIf
                                                            Else
                                                                local0\Field57 = 3.0
                                                            EndIf
                                                        EndIf
                                                    EndIf
                                                    local0\Field57 = (local0\Field57 + 1.0)
                                                Wend
                                            EndIf
                                            animatenpc(local0, 269.0, 345.0, 0.2, $01)
                                        EndIf
                                    EndIf
                                    If (0.005 < local0\Field64) Then
                                        If ((((((361.0 > local21) And (361.0 <= local0\Field103)) Lor ((377.0 > local21) And (377.0 <= local0\Field103))) Lor ((431.0 > local21) And (431.0 <= local0\Field103))) Lor ((447.0 > local21) And (447.0 <= local0\Field103))) <> 0) Then
                                            playsoundex(snd_i\Field51[rand($07, $09)], camera, local0\Field82, 8.0, rnd(0.8, 1.0), $00, $00)
                                        EndIf
                                    EndIf
                                    updatesoundorigin(local0\Field6, camera, local0\Field98, 10.0, 1.0, $01, $01, $00)
                                ElseIf (0.0 = local0\Field31) Then
                                    If (ChannelPlaying(local0\Field63) <> 0) Then
                                        StopChannel(local0\Field63)
                                        local0\Field63 = $00
                                    EndIf
                                    If (ChannelPlaying(local0\Field6) <> 0) Then
                                        StopChannel(local0\Field6)
                                        local0\Field6 = $00
                                    EndIf
                                    If ((playerinreachableroom($01, $00, $01) And (infacility = $00)) <> 0) Then
                                        If (rand((($04 - (selecteddifficulty\Field2 Shl $01)) + ((remotedooron = $00) Shl $01)), $01) = $01) Then
                                            teleportcloser(local0)
                                        Else
                                            local0\Field31 = 4200.0
                                        EndIf
                                    EndIf
                                EndIf
                            Case 3.0
                                animatenpc(local0, 537.0, 660.0, 0.7, $00)
                                positionentity(local0\Field82, curvevalue(entityx(XZ0260X8X2\Field74, $00, 1.0), entityx(local0\Field82, $00, 1.0), 20.0), entityy(local0\Field82, $00, 1.0), curvevalue(entityz(XZ0260X8X2\Field74, $00, 1.0), entityz(local0\Field82, $00, 1.0), 20.0), $00)
                                local0\Field84 = curveangle((entityyaw(XZ0260X8X2\Field74, $00, 1.0) - 180.0), local0\Field84, 10.0)
                            Case 4.0
                                local22 = npcseesplayer(local0, (8.0 - XZ0260X8X2\Field46), 60.0, $01)
                                If (local22 = $01) Then
                                    playsound_strict(loadtempsound("SFX\SCP\049\Room2SLSpawn.ogg"), $00, $00)
                                    local0\Field30 = $00
                                    local0\Field48 = $00
                                    local0\Field8 = 0.0
                                    local0\Field13 = $00
                                    local0\Field57 = 0.0
                                    local0\Field65 = 140.0
                                    local0\Field66 = 2.0
                                ElseIf (((local22 = $02) And (0.0 < local0\Field57)) <> 0) Then
                                    local0\Field30 = findpath(local0, entityx(XZ0260X8X2\Field74, $00, 1.0), entityy(XZ0260X8X2\Field74, $00, 1.0), entityz(XZ0260X8X2\Field74, $00, 1.0))
                                Else
                                    If (6.0 = local0\Field57) Then
                                        If ((hidedistance * hidedistance) < entitydistancesquared(local0\Field82, XZ0260X8X2\Field74)) Then
                                            local0\Field30 = $00
                                            local0\Field48 = $00
                                            local0\Field8 = 0.0
                                            local0\Field13 = $00
                                            local0\Field57 = 0.0
                                            local0\Field66 = 2.0
                                        ElseIf (local0\Field30 <> $01) Then
                                            local0\Field30 = findpath(local0, entityx(XZ0260X8X2\Field74, $00, 1.0), entityy(XZ0260X8X2\Field74, $00, 1.0), entityz(XZ0260X8X2\Field74, $00, 1.0))
                                        EndIf
                                    EndIf
                                    If (local0\Field30 = $01) Then
                                        If (local0\Field71[local0\Field48] = Null) Then
                                            If (local0\Field48 > $14) Then
                                                local0\Field48 = $00
                                                local0\Field30 = $00
                                            Else
                                                local0\Field48 = (local0\Field48 + $01)
                                            EndIf
                                        Else
                                            pointentity(local0\Field98, local0\Field71[local0\Field48]\Field0, 0.0)
                                            rotateentity(local0\Field82, 0.0, curveangle(entityyaw(local0\Field98, $00, 1.0), entityyaw(local0\Field82, $00, 1.0), 10.0), 0.0, $00)
                                            local0\Field64 = curvevalue(local0\Field32, local0\Field64, 20.0)
                                            moveentity(local0\Field82, 0.0, 0.0, (local0\Field64 * fps\Field3[$00]), $00)
                                            local0\Field84 = curveangle(entityyaw(local0\Field82, $01, 1.0), local0\Field84, (10.0 - (Float selecteddifficulty\Field8)))
                                            usedoornpc(local0, $01, $00)
                                            animatenpc(local0, clamp(animtime(local0\Field98), 346.0, 358.0), 393.0, (local0\Field64 * 35.0), $01)
                                        EndIf
                                    Else
                                        Select local0\Field13
                                            Case $00
                                                animatenpc(local0, 269.0, 345.0, 0.2, $01)
                                            Case $01
                                                animatenpc(local0, 661.0, 891.0, 0.4, $00)
                                            Case $02
                                                animatenpc(local0, 892.0, 1119.0, 0.4, $00)
                                        End Select
                                    EndIf
                                EndIf
                                If (playerroom\Field22\Field21 = $13) Then
                                    shouldplay = $13
                                EndIf
                                If (0.005 < local0\Field64) Then
                                    If ((((((361.0 > local21) And (361.0 <= local0\Field103)) Lor ((377.0 > local21) And (377.0 <= local0\Field103))) Lor ((431.0 > local21) And (431.0 <= local0\Field103))) Lor ((447.0 > local21) And (447.0 <= local0\Field103))) <> 0) Then
                                        playsoundex(snd_i\Field51[rand($07, $09)], camera, local0\Field82, 8.0, rnd(0.8, 1.0), $00, $00)
                                    EndIf
                                EndIf
                                updatesoundorigin(local0\Field6, camera, local0\Field98, 10.0, 1.0, $01, $01, $00)
                            Case 5.0
                                If (1120.0 > local0\Field103) Then
                                    StopChannel(local0\Field6)
                                    local0\Field6 = $00
                                    setnpcframe(local0, 1121.0, $01)
                                Else
                                    If (1138.0 > local0\Field103) Then
                                        moveentity(local0\Field82, 0.0, 0.0, 0.02, $00)
                                    EndIf
                                    animatenpc(local0, 1121.0, 1224.0, 0.3, $00)
                                    If ((((1138.0 > local21) And (1138.0 <= local0\Field103)) Lor ((1166.0 > local21) And (1166.0 <= local0\Field103))) <> 0) Then
                                        playsoundex(snd_i\Field51[rand($07, $09)], camera, local0\Field82, 8.0, rnd(0.8, 1.0), $00, $00)
                                    EndIf
                                    If (1223.9 < local0\Field103) Then
                                        local0\Field66 = 2.0
                                    EndIf
                                EndIf
                            Case 6.0
                                If (1120.0 > local0\Field103) Then
                                    StopChannel(local0\Field6)
                                    local0\Field6 = $00
                                    setnpcframe(local0, 1121.0, $01)
                                    local0\Field6 = playsoundex(loadtempsound("SFX\SCP\049\714Equipped.ogg"), camera, local0\Field82, 10.0, 1.0, $01, $00)
                                Else
                                    animatenpc(local0, 1121.0, 1224.0, 0.35, $00)
                                    If ((((1138.0 > local21) And (1138.0 <= local0\Field103)) Lor ((1166.0 > local21) And (1166.0 <= local0\Field103))) <> 0) Then
                                        playsoundex(snd_i\Field51[rand($07, $09)], camera, local0\Field82, 8.0, rnd(0.8, 1.0), $00, $00)
                                    EndIf
                                    If (1223.9 < local0\Field103) Then
                                        local0\Field66 = 2.0
                                    EndIf
                                EndIf
                        End Select
                        local0\Field17 = (Int max(((Float local0\Field17) - fps\Field3[$00]), 0.0))
                    EndIf
                EndIf
                positionentity(local0\Field98, entityx(local0\Field82, $01, 1.0), (entityy(local0\Field82, $01, 1.0) - local0\Field23), entityz(local0\Field82, $01, 1.0), $01)
                rotateentity(local0\Field98, 0.0, local0\Field84, 0.0, $01)
            Case $04
                If (66.0 <> local0\Field66) Then
                    If (local0\Field1 = $00) Then
                        local21 = local0\Field103
                        updatenpcblinking(local0)
                        Select local0\Field66
                            Case 0.0
                                local0\Field63 = loopsoundex(npcsound[$07], local0\Field63, camera, local0\Field82, 4.0, 1.0, $01)
                                If (rand($7D0, $01) = $01) Then
                                    If ((9.0 - ((Float XZ0260X8X2\Field25) * 4.5)) > entitydistancesquared(local0\Field82, XZ0260X8X2\Field74)) Then
                                        local0\Field66 = 1.0
                                    EndIf
                                EndIf
                            Case 1.0
                                animatenpc(local0, 1.0, 556.0, 1.0, $00)
                                If ((((288.0 > local21) And (288.0 <= local0\Field103)) Lor ((350.0 > local21) And (350.0 <= local0\Field103))) <> 0) Then
                                    playsoundex(snd_i\Field51[rand($00, $02)], camera, local0\Field82, 8.0, rnd(0.3, 0.5), $00, $00)
                                EndIf
                                If (555.9 <= local0\Field103) Then
                                    local0\Field66 = 2.0
                                EndIf
                            Case 2.0
                                local0\Field65 = max((local0\Field65 - fps\Field3[$00]), 0.0)
                                If (0.0 < local0\Field65) Then
                                    If (local0\Field59 = Null) Then
                                        If (npcseesplayer(local0, (8.0 - XZ0260X8X2\Field46), 75.0, $00) = $01) Then
                                            local0\Field65 = 140.0
                                        EndIf
                                        If (entityvisible(local0\Field82, XZ0260X8X2\Field74, 0.0) <> 0) Then
                                            pointentity(local0\Field82, XZ0260X8X2\Field74, 0.0)
                                        EndIf
                                        local13 = entitydistancesquared(local0\Field82, XZ0260X8X2\Field74)
                                    Else
                                        If (npcseesnpc(local0\Field59, local0, 36.0) <> 0) Then
                                            local0\Field65 = 140.0
                                        EndIf
                                        If (entityvisible(local0\Field82, local0\Field59\Field82, 0.0) <> 0) Then
                                            pointentity(local0\Field82, local0\Field59\Field82, 0.0)
                                        EndIf
                                        local13 = entitydistancesquared(local0\Field82, local0\Field59\Field82)
                                    EndIf
                                    If (0.49 > local13) Then
                                        setnpcframe(local0, 795.0, $01)
                                        local0\Field66 = 4.0
                                        Return $00
                                    EndIf
                                    rotateentity(local0\Field82, 0.0, entityyaw(local0\Field82, $01, 1.0), 0.0, $01)
                                    local0\Field64 = curvevalue(local0\Field32, local0\Field64, 20.0)
                                    animatenpc(local0, clamp(animtime(local0\Field98), 705.0, 714.0), 794.0, (local0\Field64 * 38.0), $01)
                                    moveentity(local0\Field82, 0.0, 0.0, (local0\Field64 * fps\Field3[$00]), $00)
                                    local0\Field84 = curveangle(entityyaw(local0\Field82, $01, 1.0), local0\Field84, 20.0)
                                    local0\Field8 = 0.0
                                    local0\Field30 = $00
                                    local0\Field48 = $00
                                    If ((((733.0 > local21) And (733.0 <= local0\Field103)) Lor ((773.0 > local21) And (773.0 <= local0\Field103))) <> 0) Then
                                        playsoundex(snd_i\Field51[rand($00, $02)], camera, local0\Field82, 8.0, rnd(0.3, 0.5), $00, $00)
                                    EndIf
                                Else
                                    local0\Field59 = Null
                                    local0\Field66 = 3.0
                                EndIf
                            Case 3.0
                                If (0.0 >= local0\Field8) Then
                                    local0\Field30 = findpath(local0, entityx(XZ0260X8X2\Field74, $00, 1.0), (entityy(XZ0260X8X2\Field74, $00, 1.0) + 0.1), entityz(XZ0260X8X2\Field74, $00, 1.0))
                                    If (local0\Field30 = $01) Then
                                        While (local0\Field71[local0\Field48] = Null)
                                            If (local0\Field48 > $14) Then
                                                local0\Field48 = $00
                                                local0\Field30 = $01
                                                Exit
                                            Else
                                                local0\Field48 = (local0\Field48 + $01)
                                            EndIf
                                        Wend
                                        If (local0\Field48 < $14) Then
                                            If (((local0\Field71[local0\Field48] <> Null) And (local0\Field71[(local0\Field48 + $01)] <> Null)) <> 0) Then
                                                If (local0\Field71[local0\Field48]\Field7 = Null) Then
                                                    If ((Abs deltayaw(local0\Field82, local0\Field71[(local0\Field48 + $01)]\Field0)) < (Abs deltayaw(local0\Field82, local0\Field71[local0\Field48]\Field0))) Then
                                                        local0\Field48 = (local0\Field48 + $01)
                                                    EndIf
                                                EndIf
                                                usedoornpc(local0, $01, $00)
                                            EndIf
                                        EndIf
                                    EndIf
                                    local0\Field8 = (rnd(6.0, 10.0) * 70.0)
                                ElseIf (local0\Field30 = $01) Then
                                    If (local0\Field71[local0\Field48] = Null) Then
                                        If (local0\Field48 > $14) Then
                                            local0\Field48 = $00
                                            local0\Field30 = $00
                                        Else
                                            local0\Field48 = (local0\Field48 + $01)
                                        EndIf
                                    Else
                                        pointentity(local0\Field82, local0\Field71[local0\Field48]\Field0, 0.0)
                                        rotateentity(local0\Field82, 0.0, entityyaw(local0\Field82, $01, 1.0), 0.0, $01)
                                        local0\Field64 = curvevalue(local0\Field32, local0\Field64, 20.0)
                                        moveentity(local0\Field82, 0.0, 0.0, (local0\Field64 * fps\Field3[$00]), $00)
                                        local0\Field84 = curveangle(entityyaw(local0\Field82, $01, 1.0), local0\Field84, 20.0)
                                        usedoornpc(local0, $01, $00)
                                    EndIf
                                    local0\Field8 = (local0\Field8 - fps\Field3[$00])
                                Else
                                    local0\Field64 = curvevalue(0.0, local0\Field64, 10.0)
                                    local0\Field8 = (local0\Field8 - (fps\Field3[$00] * 2.0))
                                EndIf
                                If (0.005 > local0\Field64) Then
                                    If (713.0 < local0\Field103) Then
                                        animatenpc(local0, 795.0, 813.0, 0.8, $00)
                                        If (812.9 < local0\Field103) Then
                                            setnpcframe(local0, 557.0, $01)
                                        EndIf
                                    Else
                                        animatenpc(local0, 557.0, 704.0, 0.2, $01)
                                    EndIf
                                Else
                                    animatenpc(local0, clamp(animtime(local0\Field98), 705.0, 714.0), 794.0, (local0\Field64 * 38.0), $01)
                                    If ((((733.0 > local21) And (733.0 <= local0\Field103)) Lor ((773.0 > local21) And (773.0 <= local0\Field103))) <> 0) Then
                                        playsoundex(snd_i\Field51[rand($00, $02)], camera, local0\Field82, 8.0, rnd(0.3, 0.5), $00, $00)
                                    EndIf
                                EndIf
                                If (local13 > ((hidedistance * 2.0) * (hidedistance * 2.0))) Then
                                    If (local0\Field43 < (((20.0 - ((Float selecteddifficulty\Field2) * 10.0)) + (10.0 * (Float remotedooron))) * 70.0)) Then
                                        local0\Field43 = (local0\Field43 + fps\Field3[$00])
                                    ElseIf (rand((($140 - (selecteddifficulty\Field2 * $78)) + ((remotedooron = $00) * $78)), $01) = $01) Then
                                        If (playerinreachableroom($00, $00, $01) <> 0) Then
                                            teleportcloser(local0)
                                            local0\Field43 = 0.0
                                        EndIf
                                    EndIf
                                Else
                                    local0\Field43 = 0.0
                                EndIf
                                If (0.0 >= local0\Field20) Then
                                    If (local0\Field59 = Null) Then
                                        If (npcseesplayer(local0, (8.0 - XZ0260X8X2\Field46), 75.0, $00) = $01) Then
                                            local0\Field65 = 140.0
                                            local0\Field66 = 2.0
                                        EndIf
                                    EndIf
                                    For local1 = Each npcs
                                        If ((((local1\Field77 = $18) Lor (local1\Field77 = $02)) And (local1\Field1 = $00)) <> 0) Then
                                            If (npcseesnpc(local1, local0, 36.0) = $01) Then
                                                local0\Field59 = local1
                                                local0\Field65 = 140.0
                                                local0\Field66 = 2.0
                                                Exit
                                            EndIf
                                        EndIf
                                    Next
                                    local0\Field20 = 35.0
                                Else
                                    local0\Field20 = (local0\Field20 - fps\Field3[$00])
                                EndIf
                            Case 4.0
                                local0\Field64 = 0.0
                                If (local0\Field59 = Null) Then
                                    pointentity(local0\Field82, XZ0260X8X2\Field74, 0.0)
                                Else
                                    pointentity(local0\Field82, local0\Field59\Field82, 0.0)
                                EndIf
                                rotateentity(local0\Field82, 0.0, entityyaw(local0\Field82, $01, 1.0), 0.0, $01)
                                If (813.0 >= local0\Field103) Then
                                    animatenpc(local0, 795.0, 813.0, 0.7, $00)
                                    If (812.9 < local0\Field103) Then
                                        setnpcframe(local0, (((Float (rand($02, $01) = $01)) * 65.0) + 814.0), $01)
                                    EndIf
                                Else
                                    If (879.0 > local0\Field103) Then
                                        animatenpc(local0, 814.0, 878.0, 0.5, $00)
                                        local30 = ((839.0 <= local0\Field103) And (839.0 > local21))
                                        If (877.9 < local0\Field103) Then
                                            If (((0.49 > entitydistancesquared(local0\Field82, XZ0260X8X2\Field74)) And (0.0 = XZ0260X8X2\Field48)) <> 0) Then
                                                setnpcframe(local0, (((Float (rand($02, $01) = $01)) * 65.0) + 814.0), $01)
                                            Else
                                                setnpcframe(local0, 705.0, $01)
                                                local0\Field66 = (XZ0260X8X2\Field48 + 2.0)
                                            EndIf
                                        EndIf
                                    Else
                                        animatenpc(local0, 879.0, 943.0, 0.5, $00)
                                        local30 = ((900.0 <= local0\Field103) And (900.0 > local21))
                                        If (942.9 < local0\Field103) Then
                                            If (local0\Field59 = Null) Then
                                                local13 = entitydistancesquared(local0\Field82, XZ0260X8X2\Field74)
                                            Else
                                                local13 = entitydistancesquared(local0\Field82, local0\Field59\Field82)
                                            EndIf
                                            If (((0.49 > local13) And (0.0 = XZ0260X8X2\Field48)) <> 0) Then
                                                setnpcframe(local0, (((Float (rand($02, $01) = $01)) * 65.0) + 814.0), $01)
                                            Else
                                                setnpcframe(local0, 705.0, $01)
                                                local0\Field66 = (XZ0260X8X2\Field48 + 2.0)
                                            EndIf
                                        EndIf
                                    EndIf
                                    If (local30 <> 0) Then
                                        If (local0\Field59 = Null) Then
                                            If (0.64 > entitydistancesquared(local0\Field82, XZ0260X8X2\Field74)) Then
                                                playsound_strict(snd_i\Field50[rand($05, $08)], $00, $00)
                                                injureplayer((rnd(0.55, 0.85) * difficultydmgmult), 0.0, 0.0, (0.3 * difficultydmgmult), (0.125 * difficultydmgmult))
                                                XZ0260X8X2\Field1 = ((Float (0.0 = i_1025\Field1[$03])) * 2.5)
                                                If (3.0 < XZ0260X8X2\Field11) Then
                                                    msg\Field8 = format(getlocalstring("death", "0492killed"), subjectname, "%s")
                                                    kill($01, $01, $00, $01)
                                                EndIf
                                            Else
                                                playsoundex(snd_i\Field49, camera, local0\Field82, 2.5, 1.0, $00, $00)
                                            EndIf
                                        ElseIf (0.64 > entitydistancesquared(local0\Field82, local0\Field59\Field82)) Then
                                            playsoundex(snd_i\Field50[rand($05, $08)], camera, local0\Field59\Field98, 10.0, 1.0, $00, $00)
                                            If (local0\Field59\Field4 > $00) Then
                                                local0\Field59\Field4 = (Int max(((Float local0\Field59\Field4) - rnd(30.0, 50.0)), 0.0))
                                            Else
                                                local0\Field59 = Null
                                                local0\Field66 = 3.0
                                            EndIf
                                        Else
                                            playsoundex(snd_i\Field49, camera, local0\Field82, 2.5, 1.0, $00, $00)
                                        EndIf
                                    EndIf
                                EndIf
                                local0\Field84 = curveangle(entityyaw(local0\Field82, $01, 1.0), local0\Field84, 20.0)
                                If (local0\Field59 <> Null) Then
                                    If (local0\Field59\Field1 <> 0) Then
                                        local0\Field66 = 3.0
                                        local0\Field59 = Null
                                    EndIf
                                EndIf
                            Case 5.0
                                If (0.0 = (Float local0\Field17)) Then
                                    animatenpc(local0, 944.0, 960.0, 0.3, $00)
                                    If (959.9 < local0\Field103) Then
                                        local0\Field17 = $01
                                    EndIf
                                Else
                                    animatenpc(local0, 960.0, 944.0, -0.04, $00)
                                    If (944.1 > local0\Field103) Then
                                        local0\Field17 = $00
                                        local0\Field66 = 3.0
                                        Return $00
                                    EndIf
                                EndIf
                        End Select
                        If (1.0 < local0\Field66) Then
                            local0\Field63 = loopsoundex(npcsound[$06], local0\Field63, camera, local0\Field82, 10.0, 1.0, $01)
                        EndIf
                        If (local0\Field4 <= $00) Then
                            local0\Field1 = $01
                        EndIf
                    Else
                        animatenpc(local0, 944.0, 982.0, 0.2, $00)
                    EndIf
                EndIf
                positionentity(local0\Field98, entityx(local0\Field82, $01, 1.0), (entityy(local0\Field82, $01, 1.0) - local0\Field23), entityz(local0\Field82, $01, 1.0), $01)
                rotateentity(local0\Field98, -90.0, local0\Field84, 0.0, $01)
            Case $17
                If (66.0 <> local0\Field66) Then
                    local21 = local0\Field103
                    local0\Field86 = ""
                    local0\Field76 = $00
                    local0\Field45 = $00
                    local0\Field92 = "Guard"
                    Select local0\Field66
                        Case 1.0
                            If (((((39.0 > local0\Field103) Lor ((76.0 < local0\Field103) And (245.0 > local0\Field103))) Lor ((248.0 < local0\Field103) And (302.0 > local0\Field103))) Lor (344.0 < local0\Field103)) <> 0) Then
                                animatenpc(local0, 345.0, 357.0, 0.2, $00)
                                If (356.0 <= local0\Field103) Then
                                    setnpcframe(local0, 302.0, $01)
                                EndIf
                            EndIf
                            If (0.0 = XZ0260X8X2\Field48) Then
                                local13 = entitydistancesquared(local0\Field82, XZ0260X8X2\Field74)
                                local57 = (((Float selecteddifficulty\Field2) * 0.5) + 0.4)
                                local58 = 121.0
                                If (playerroom\Field22\Field21 = $4E) Then
                                    local58 = 512.0
                                    local57 = (0.6 - (XZ0260X8X2\Field76 * 14.0))
                                EndIf
                                If (local58 > local13) Then
                                    local26 = createpivot($00)
                                    positionentity(local26, entityx(local0\Field82, $00, 1.0), entityy(local0\Field82, $00, 1.0), entityz(local0\Field82, $00, 1.0), $00)
                                    pointentity(local26, XZ0260X8X2\Field74, 0.0)
                                    rotateentity(local26, min(entitypitch(local26, $00, 1.0), 20.0), entityyaw(local26, $00, 1.0), 0.0, $00)
                                    rotateentity(local0\Field82, curveangle(entitypitch(local26, $00, 1.0), entitypitch(local0\Field82, $00, 1.0), 10.0), curveangle(entityyaw(local26, $00, 1.0), entityyaw(local0\Field82, $00, 1.0), 10.0), 0.0, $01)
                                    positionentity(local26, entityx(local0\Field82, $00, 1.0), (entityy(local0\Field82, $00, 1.0) + 0.8), entityz(local0\Field82, $00, 1.0), $00)
                                    pointentity(local26, XZ0260X8X2\Field74, 0.0)
                                    rotateentity(local26, min(entitypitch(local26, $00, 1.0), 40.0), entityyaw(local0\Field82, $00, 1.0), 0.0, $00)
                                    If (0.0 = local0\Field62) Then
                                        If (1.0 = local0\Field57) Then
                                            local59 = $00
                                            msg\Field8 = format(getlocalstring("death", "guard.default"), subjectname, "%s")
                                            If (playerroom\Field22\Field21 = $03) Then
                                                msg\Field8 = format(getlocalstring("death", "guard.173"), subjectname, "%s")
                                                local59 = $01
                                            ElseIf (playerroom\Field22\Field21 = $4E) Then
                                                msg\Field8 = getlocalstring("death", "guard.gateb")
                                            EndIf
                                            playsoundex(snd_i\Field29[$00], camera, local0\Field82, 35.0, 1.0, $00, $00)
                                            rotateentity(local26, entitypitch(local0\Field82, $00, 1.0), entityyaw(local0\Field82, $00, 1.0), 0.0, $01)
                                            positionentity(local26, entityx(local0\Field98, $00, 1.0), entityy(local0\Field98, $00, 1.0), entityz(local0\Field98, $00, 1.0), $00)
                                            moveentity(local26, 0.0622, 0.83925, 0.5351, $00)
                                            pointentity(local26, XZ0260X8X2\Field74, 0.0)
                                            shoot(local0, entityx(local26, $00, 1.0), entityy(local26, $00, 1.0), entityz(local26, $00, 1.0), local0\Field82, local57, $01, local59)
                                            local0\Field62 = 8.0
                                        Else
                                            local0\Field64 = local0\Field32
                                        EndIf
                                    EndIf
                                    If (((0.0 < local0\Field62) And (8.0 >= local0\Field62)) <> 0) Then
                                        animatenpc(local0, 245.0, 248.0, 0.35, $01)
                                    ElseIf (302.0 > local0\Field103) Then
                                        animatenpc(local0, 302.0, 344.0, 0.35, $01)
                                    EndIf
                                    freeentity(local26)
                                    local26 = $00
                                Else
                                    animatenpc(local0, 302.0, 344.0, 0.35, $01)
                                EndIf
                                local0\Field76 = $01
                                local0\Field86 = "Chest"
                                If (10.0 = local0\Field65) Then
                                    local0\Field45 = $03
                                Else
                                    local0\Field45 = $00
                                EndIf
                            Else
                                local0\Field66 = 0.0
                            EndIf
                        Case 2.0
                            animatenpc(local0, 245.0, 248.0, 0.35, $01)
                            If (0.0 = local0\Field62) Then
                                playsoundex(snd_i\Field29[$00], camera, local0\Field82, 15.0, 1.0, $00, $00)
                                local26 = createpivot($00)
                                rotateentity(local26, entitypitch(local0\Field82, $00, 1.0), entityyaw(local0\Field82, $00, 1.0), 0.0, $01)
                                positionentity(local26, entityx(local0\Field98, $00, 1.0), entityy(local0\Field98, $00, 1.0), entityz(local0\Field98, $00, 1.0), $00)
                                moveentity(local26, 0.0622, 0.83925, 0.5351, $00)
                                setemitter(Null, entityx(local26, $00, 1.0), entityy(local26, $00, 1.0), entityz(local26, $00, 1.0), $0D)
                                local0\Field62 = 8.0
                            EndIf
                        Case 3.0
                            If (local0\Field30 = $01) Then
                                If (local0\Field71[local0\Field48] = Null) Then
                                    If (local0\Field48 > $14) Then
                                        local0\Field48 = $00
                                        local0\Field30 = $00
                                    Else
                                        local0\Field48 = (local0\Field48 + $01)
                                    EndIf
                                Else
                                    animatenpc(local0, 1.0, 38.0, (local0\Field64 * 40.0), $01)
                                    local0\Field64 = curvevalue((local0\Field32 * 0.7), local0\Field64, 20.0)
                                    moveentity(local0\Field82, 0.0, 0.0, (local0\Field64 * fps\Field3[$00]), $00)
                                    pointentity(local0\Field98, local0\Field71[local0\Field48]\Field0, 0.0)
                                    rotateentity(local0\Field82, 0.0, curveangle(entityyaw(local0\Field98, $00, 1.0), entityyaw(local0\Field82, $00, 1.0), 20.0), 0.0, $00)
                                    If (0.05 > entitydistancesquared(local0\Field82, local0\Field71[local0\Field48]\Field0)) Then
                                        local0\Field48 = (local0\Field48 + $01)
                                    EndIf
                                EndIf
                            Else
                                If (0.0 = local0\Field8) Then
                                    local0\Field30 = findpath(local0, local0\Field60, (local0\Field61 + 0.5), local0\Field74)
                                EndIf
                                local9 = Null
                                local26 = createpivot($00)
                                positionentity(local26, local0\Field60, local0\Field61, local0\Field74, $00)
                                For local8 = Each waypoints
                                    If (4.0 > entitydistancesquared(local8\Field0, local26)) Then
                                        local9 = local8
                                        Exit
                                    EndIf
                                Next
                                freeentity(local26)
                                local26 = $00
                                If (local9 <> Null) Then
                                    local0\Field8 = 1.0
                                    If (entityvisible(local9\Field0, local0\Field82, 0.0) <> 0) Then
                                        If (0.0 < (Abs deltayaw(local0\Field82, local9\Field0))) Then
                                            pointentity(local0\Field98, local9\Field0, 0.0)
                                            rotateentity(local0\Field82, 0.0, curveangle(entityyaw(local0\Field98, $00, 1.0), entityyaw(local0\Field82, $00, 1.0), 20.0), 0.0, $00)
                                        EndIf
                                    EndIf
                                Else
                                    local0\Field8 = 0.0
                                EndIf
                                If (1.0 = local0\Field8) Then
                                    animatenpc(local0, 1.0, 38.0, (local0\Field64 * 40.0), $01)
                                    local0\Field64 = curvevalue((local0\Field32 * 0.7), local0\Field64, 20.0)
                                    moveentity(local0\Field82, 0.0, 0.0, (local0\Field64 * fps\Field3[$00]), $00)
                                EndIf
                            EndIf
                        Case 4.0
                            animatenpc(local0, 77.0, 201.0, 0.2, $01)
                            If (rand($190, $01) = $01) Then
                                local0\Field84 = rnd(-180.0, 180.0)
                            EndIf
                            rotateentity(local0\Field82, 0.0, curveangle((local0\Field84 + (sin((Float (millisec / $32))) * 2.0)), entityyaw(local0\Field82, $00, 1.0), 150.0), 0.0, $01)
                            If (225.0 > entitydistancesquared(local0\Field82, XZ0260X8X2\Field74)) Then
                                If (((90.0 > wrapangle((entityyaw(local0\Field82, $00, 1.0) - deltayaw(local0\Field82, XZ0260X8X2\Field74)), 360.0)) And entityvisible(XZ0260X8X2\Field74, local0\Field82, 0.0)) <> 0) Then
                                    local0\Field66 = 1.0
                                EndIf
                            EndIf
                        Case 5.0
                            rotateentity(local0\Field82, 0.0, curveangle((vectoryaw((local0\Field60 - entityx(local0\Field82, $00, 1.0)), 0.0, (local0\Field74 - entityz(local0\Field82, $00, 1.0))) + local0\Field84), entityyaw(local0\Field82, $00, 1.0), 20.0), 0.0, $00)
                            local13 = distancesquared(entityx(local0\Field82, $00, 1.0), local0\Field60, entityz(local0\Field82, $00, 1.0), local0\Field74, 0.0, 0.0)
                            animatenpc(local0, 1.0, 38.0, (local0\Field64 * 40.0), $01)
                            If (((4.0 < local13) Lor (1.0 > local13)) <> 0) Then
                                local0\Field64 = curvevalue(((local0\Field32 * (Sgn (sqr(local13) - 1.5))) * 0.75), local0\Field64, 10.0)
                            Else
                                local0\Field64 = curvevalue(0.0, local0\Field64, 10.0)
                            EndIf
                            moveentity(local0\Field82, 0.0, 0.0, (local0\Field64 * fps\Field3[$00]), $00)
                        Case 7.0
                            animatenpc(local0, 77.0, 201.0, 0.2, $01)
                        Case 8.0
                        Case 9.0
                            animatenpc(local0, 77.0, 201.0, 0.2, $01)
                            local0\Field86 = "head"
                            local0\Field76 = $01
                            local0\Field45 = $00
                            local0\Field84 = entityyaw(local0\Field82, $00, 1.0)
                        Case 10.0
                            animatenpc(local0, 1.0, 38.0, (local0\Field64 * 40.0), $01)
                            local0\Field64 = curvevalue((local0\Field32 * 0.7), local0\Field64, 20.0)
                            moveentity(local0\Field82, 0.0, 0.0, (local0\Field64 * fps\Field3[$00]), $00)
                        Case 11.0
                            If (((((39.0 > local0\Field103) Lor ((76.0 < local0\Field103) And (245.0 > local0\Field103))) Lor ((248.0 < local0\Field103) And (302.0 > local0\Field103))) Lor (344.0 < local0\Field103)) <> 0) Then
                                animatenpc(local0, 345.0, 357.0, 0.2, $00)
                                If (356.0 <= local0\Field103) Then
                                    setnpcframe(local0, 302.0, $01)
                                EndIf
                            EndIf
                            If (0.0 = XZ0260X8X2\Field48) Then
                                local13 = entitydistancesquared(local0\Field82, XZ0260X8X2\Field74)
                                local60 = ((((chs\Field8 Lor i_268\Field3) = $00) And (121.0 > local13)) And entityvisible(local0\Field82, XZ0260X8X2\Field74, 0.0))
                                If (local60 <> 0) Then
                                    local26 = createpivot($00)
                                    positionentity(local26, entityx(local0\Field82, $00, 1.0), entityy(local0\Field82, $00, 1.0), entityz(local0\Field82, $00, 1.0), $00)
                                    pointentity(local26, XZ0260X8X2\Field74, 0.0)
                                    rotateentity(local26, min(entitypitch(local26, $00, 1.0), 20.0), entityyaw(local26, $00, 1.0), 0.0, $00)
                                    rotateentity(local0\Field82, curveangle(entitypitch(local26, $00, 1.0), entitypitch(local0\Field82, $00, 1.0), 10.0), curveangle(entityyaw(local26, $00, 1.0), entityyaw(local0\Field82, $00, 1.0), 10.0), 0.0, $01)
                                    positionentity(local26, entityx(local0\Field82, $00, 1.0), (entityy(local0\Field82, $00, 1.0) + 0.8), entityz(local0\Field82, $00, 1.0), $00)
                                    pointentity(local26, XZ0260X8X2\Field74, 0.0)
                                    rotateentity(local26, min(entitypitch(local26, $00, 1.0), 40.0), entityyaw(local0\Field82, $00, 1.0), 0.0, $00)
                                    If (0.0 = local0\Field62) Then
                                        If (1.0 = local0\Field57) Then
                                            local59 = $00
                                            msg\Field8 = ""
                                            playsoundex(snd_i\Field29[$00], camera, local0\Field82, 15.0, 1.0, $00, $00)
                                            rotateentity(local26, entitypitch(local0\Field82, $00, 1.0), entityyaw(local0\Field82, $00, 1.0), 0.0, $01)
                                            positionentity(local26, entityx(local0\Field98, $00, 1.0), entityy(local0\Field98, $00, 1.0), entityz(local0\Field98, $00, 1.0), $00)
                                            moveentity(local26, 0.0622, 0.83925, 0.5351, $00)
                                            pointentity(local26, XZ0260X8X2\Field74, 0.0)
                                            local36 = sqr(local13)
                                            shoot(local0, entityx(local26, $00, 1.0), entityy(local26, $00, 1.0), entityz(local26, $00, 1.0), local0\Field82, ((25.0 / local36) * (1.0 / local36)), $01, local59)
                                            local0\Field62 = 8.0
                                        Else
                                            local0\Field64 = local0\Field32
                                        EndIf
                                    EndIf
                                    If (((0.0 < local0\Field62) And (8.0 >= local0\Field62)) <> 0) Then
                                        animatenpc(local0, 245.0, 248.0, 0.35, $01)
                                    ElseIf (302.0 > local0\Field103) Then
                                        animatenpc(local0, 302.0, 344.0, 0.35, $01)
                                    EndIf
                                    freeentity(local26)
                                    local26 = $00
                                Else
                                    If (local0\Field30 = $01) Then
                                        If (local0\Field71[local0\Field48] = Null) Then
                                            If (local0\Field48 > $14) Then
                                                local0\Field48 = $00
                                                local0\Field30 = $00
                                            Else
                                                local0\Field48 = (local0\Field48 + $01)
                                            EndIf
                                        Else
                                            animatenpc(local0, 39.0, 76.0, (local0\Field64 * 40.0), $01)
                                            local0\Field64 = curvevalue((local0\Field32 * 0.7), local0\Field64, 20.0)
                                            moveentity(local0\Field82, 0.0, 0.0, (local0\Field64 * fps\Field3[$00]), $00)
                                            pointentity(local0\Field98, local0\Field71[local0\Field48]\Field0, 0.0)
                                            rotateentity(local0\Field82, 0.0, curveangle(entityyaw(local0\Field98, $00, 1.0), entityyaw(local0\Field82, $00, 1.0), 20.0), 0.0, $00)
                                            If (0.05 > entitydistancesquared(local0\Field82, local0\Field71[local0\Field48]\Field0)) Then
                                                local0\Field48 = (local0\Field48 + $01)
                                            EndIf
                                        EndIf
                                    Else
                                        If (0.0 = local0\Field8) Then
                                            local0\Field30 = findpath(local0, entityx(XZ0260X8X2\Field74, $00, 1.0), (entityy(XZ0260X8X2\Field74, $00, 1.0) + 0.5), entityz(XZ0260X8X2\Field74, $00, 1.0))
                                        EndIf
                                        local9 = Null
                                        For local8 = Each waypoints
                                            If (4.0 > entitydistancesquared(local8\Field0, XZ0260X8X2\Field74)) Then
                                                local9 = local8
                                                Exit
                                            EndIf
                                        Next
                                        If (local9 <> Null) Then
                                            local0\Field8 = 1.0
                                            If (entityvisible(local9\Field0, local0\Field82, 0.0) <> 0) Then
                                                If (0.0 < (Abs deltayaw(local0\Field82, local9\Field0))) Then
                                                    pointentity(local0\Field98, local9\Field0, 0.0)
                                                    rotateentity(local0\Field82, 0.0, curveangle(entityyaw(local0\Field98, $00, 1.0), entityyaw(local0\Field82, $00, 1.0), 20.0), 0.0, $00)
                                                EndIf
                                            EndIf
                                        Else
                                            local0\Field8 = 0.0
                                        EndIf
                                        If (1.0 = local0\Field8) Then
                                            animatenpc(local0, 39.0, 76.0, (local0\Field64 * 40.0), $01)
                                            local0\Field64 = curvevalue((local0\Field32 * 0.7), local0\Field64, 20.0)
                                            moveentity(local0\Field82, 0.0, 0.0, (local0\Field64 * fps\Field3[$00]), $00)
                                        EndIf
                                    EndIf
                                    If ((((43.0 > local21) And (43.0 <= local0\Field103)) Lor ((61.0 > local21) And (61.0 <= local0\Field103))) <> 0) Then
                                        playsoundex(snd_i\Field51[rand($00, $02)], camera, local0\Field82, 8.0, rnd(0.5, 0.7), $00, $00)
                                    EndIf
                                EndIf
                            Else
                                local0\Field66 = 0.0
                            EndIf
                        Case 12.0
                            If (((((39.0 > local0\Field103) Lor ((76.0 < local0\Field103) And (245.0 > local0\Field103))) Lor ((248.0 < local0\Field103) And (302.0 > local0\Field103))) Lor (344.0 < local0\Field103)) <> 0) Then
                                animatenpc(local0, 345.0, 357.0, 0.2, $00)
                                If (356.0 <= local0\Field103) Then
                                    setnpcframe(local0, 302.0, $01)
                                EndIf
                            EndIf
                            If (345.0 > local0\Field103) Then
                                animatenpc(local0, 302.0, 344.0, 0.35, $01)
                            EndIf
                            local26 = createpivot($00)
                            positionentity(local26, entityx(local0\Field82, $00, 1.0), entityy(local0\Field82, $00, 1.0), entityz(local0\Field82, $00, 1.0), $00)
                            If (1.0 = local0\Field65) Then
                                pointentity(local26, XZ0260X8X2\Field74, 0.0)
                            Else
                                rotateentity(local26, 0.0, local0\Field84, 0.0, $00)
                            EndIf
                            rotateentity(local26, min(entitypitch(local26, $00, 1.0), 20.0), entityyaw(local26, $00, 1.0), 0.0, $00)
                            rotateentity(local0\Field82, curveangle(entitypitch(local26, $00, 1.0), entitypitch(local0\Field82, $00, 1.0), 10.0), curveangle(entityyaw(local26, $00, 1.0), entityyaw(local0\Field82, $00, 1.0), 10.0), 0.0, $01)
                            positionentity(local26, entityx(local0\Field82, $00, 1.0), (entityy(local0\Field82, $00, 1.0) + 0.8), entityz(local0\Field82, $00, 1.0), $00)
                            If (1.0 = local0\Field65) Then
                                pointentity(local26, XZ0260X8X2\Field74, 0.0)
                                local0\Field76 = $01
                                local0\Field86 = "Chest"
                                local0\Field45 = $00
                            Else
                                rotateentity(local26, 0.0, local0\Field84, 0.0, $00)
                            EndIf
                            rotateentity(local26, min(entitypitch(local26, $00, 1.0), 40.0), entityyaw(local0\Field82, $00, 1.0), 0.0, $00)
                            freeentity(local26)
                            local26 = $00
                        Case 13.0
                            animatenpc(local0, 202.0, 244.0, 0.35, $01)
                        Case 14.0
                            If (local0\Field30 = $02) Then
                                local0\Field66 = 13.0
                                local0\Field64 = 0.0
                            ElseIf (local0\Field30 = $01) Then
                                If (local0\Field71[local0\Field48] = Null) Then
                                    If (local0\Field48 > $14) Then
                                        local0\Field48 = $00
                                        local0\Field30 = $00
                                    Else
                                        local0\Field48 = (local0\Field48 + $01)
                                    EndIf
                                Else
                                    pointentity(local0\Field98, local0\Field71[local0\Field48]\Field0, 0.0)
                                    rotateentity(local0\Field82, 0.0, curveangle(entityyaw(local0\Field98, $00, 1.0), entityyaw(local0\Field82, $00, 1.0), 10.0), 0.0, $00)
                                    animatenpc(local0, 39.0, 76.0, (local0\Field64 * 40.0), $01)
                                    local0\Field64 = curvevalue((local0\Field32 * 0.7), local0\Field64, 20.0)
                                    moveentity(local0\Field82, 0.0, 0.0, (local0\Field64 * fps\Field3[$00]), $00)
                                    If (0.05 > entitydistancesquared(local0\Field82, local0\Field71[local0\Field48]\Field0)) Then
                                        local0\Field48 = (local0\Field48 + $01)
                                    EndIf
                                EndIf
                            Else
                                local0\Field64 = 0.0
                                local0\Field66 = 13.0
                            EndIf
                            If ((((43.0 > local21) And (43.0 <= local0\Field103)) Lor ((61.0 > local21) And (61.0 <= local0\Field103))) <> 0) Then
                                playsoundex(snd_i\Field51[rand($00, $02)], camera, local0\Field82, 8.0, rnd(0.5, 0.7), $00, $00)
                            EndIf
                        Case 15.0
                            If (local0\Field101 <> $00) Then
                                If (entityhidden(local0\Field101) <> 0) Then
                                    showentity(local0\Field101)
                                EndIf
                                animatenpc(local0, 623.0, 642.0, 0.3, $01)
                                If (ChannelPlaying(local0\Field6) <> 0) Then
                                    StopChannel(local0\Field6)
                                    local0\Field6 = $00
                                EndIf
                                local0\Field63 = loopsoundex(npcsound[$08], local0\Field63, camera, local0\Field101, 10.0, 1.0, $00)
                                local0\Field64 = curvevalue(0.0, local0\Field64, 5.0)
                            Else
                                openconsoleonerror(format(getlocalstring("runerr", "guard.state"), "15.0", "%s"))
                            EndIf
                        Case 16.0
                            If (local0\Field101 <> $00) Then
                                If (entityhidden(local0\Field101) <> 0) Then
                                    showentity(local0\Field101)
                                EndIf
                                animatenpc(local0, 623.0, 642.0, 0.3, $01)
                                If (ChannelPlaying(local0\Field63) <> 0) Then
                                    StopChannel(local0\Field63)
                                    local0\Field63 = $00
                                EndIf
                                local0\Field6 = loopsoundex(npcsound[$09], local0\Field6, camera, local0\Field101, 12.0, 1.0, $00)
                                local0\Field64 = curvevalue((local0\Field32 * 0.9), local0\Field64, 20.0)
                                animateex(local0\Field101, animtime(local0\Field101), $01, $14, (local0\Field64 * 5.0), $01)
                                moveentity(local0\Field82, 0.0, 0.0, (local0\Field64 * fps\Field3[$00]), $00)
                            Else
                                openconsoleonerror(format(getlocalstring("runerr", "guard.state"), "16.0", "%s"))
                            EndIf
                        Default
                            If (rand($190, $01) = $01) Then
                                local0\Field13 = rand($FFFFFFE2, $1E)
                            EndIf
                            local0\Field30 = $00
                            animatenpc(local0, 77.0, 201.0, 0.2, $01)
                            rotateentity(local0\Field82, 0.0, curveangle(((local0\Field84 + (Float local0\Field13)) + (sin((Float (millisec / $32))) * 2.0)), entityyaw(local0\Field82, $00, 1.0), 50.0), 0.0, $01)
                    End Select
                    If (0.01 < local0\Field64) Then
                        If ((((5.0 > local21) And (5.0 <= local0\Field103)) Lor ((23.0 > local21) And (23.0 <= local0\Field103))) <> 0) Then
                            playsoundex(snd_i\Field51[rand($00, $02)], camera, local0\Field82, 8.0, rnd(0.5, 0.7), $00, $00)
                        EndIf
                    ElseIf (-0.01 > local0\Field64) Then
                        If ((((23.0 <= local21) And (23.0 > local0\Field103)) Lor ((5.0 <= local21) And (5.0 > local0\Field103))) <> 0) Then
                            playsoundex(snd_i\Field51[rand($00, $02)], camera, local0\Field82, 8.0, rnd(0.5, 0.7), $00, $00)
                        EndIf
                    EndIf
                    local0\Field62 = max(0.0, (local0\Field62 - fps\Field3[$00]))
                EndIf
                If (local0\Field101 <> $00) Then
                    positionentity(local0\Field101, entityx(local0\Field82, $00, 1.0), (entityy(local0\Field82, $00, 1.0) - local0\Field23), entityz(local0\Field82, $00, 1.0), $00)
                    rotateentity(local0\Field101, 0.0, entityyaw(local0\Field82, $00, 1.0), 0.0, $00)
                Else
                    positionentity(local0\Field98, entityx(local0\Field82, $00, 1.0), (entityy(local0\Field82, $00, 1.0) - local0\Field23), entityz(local0\Field82, $00, 1.0), $00)
                    rotateentity(local0\Field98, 0.0, (entityyaw(local0\Field82, $00, 1.0) + 180.0), 0.0, $00)
                EndIf
            Case $18
                UpdateMTFUnit(local0)
            Case $16,$14
                If (66.0 <> local0\Field66) Then
                    If (local0\Field1 = $00) Then
                        rotateentity(local0\Field82, 0.0, entityyaw(local0\Field82, $00, 1.0), entityroll(local0\Field82, $00, 1.0), $01)
                        local21 = local0\Field103
                        Select local0\Field66
                            Case -1.0
                            Case 0.0
                                local0\Field64 = curvevalue(0.0, local0\Field64, 5.0)
                                animatenpc(local0, 210.0, 235.0, 0.1, $01)
                            Case 1.0
                                local0\Field64 = curvevalue((local0\Field32 * 0.7), local0\Field64, 20.0)
                                animatenpc(local0, 236.0, 260.0, (local0\Field64 * 18.0), $01)
                                moveentity(local0\Field82, 0.0, 0.0, (local0\Field64 * fps\Field3[$00]), $00)
                                If (0.005 < local0\Field64) Then
                                    If ((((244.0 > local21) And (244.0 <= local0\Field103)) Lor ((254.0 > local21) And (254.0 <= local0\Field103))) <> 0) Then
                                        playsoundex(TXDBZF46ZXF(getstepsound(local0\Field82), $00, rand($00, $02)), camera, local0\Field82, 8.0, rnd(0.3, 0.5), $00, $00)
                                    EndIf
                                ElseIf (-0.005 > local0\Field64) Then
                                    If ((((254.0 <= local21) And (254.0 > local0\Field103)) Lor ((244.0 <= local21) And (244.0 > local0\Field103))) <> 0) Then
                                        playsoundex(TXDBZF46ZXF(getstepsound(local0\Field82), $00, rand($00, $02)), camera, local0\Field82, 8.0, rnd(0.3, 0.5), $00, $00)
                                    EndIf
                                EndIf
                            Case 2.0
                                local0\Field64 = curvevalue(local0\Field32, local0\Field64, 5.0)
                                animatenpc(local0, 301.0, 319.0, (local0\Field64 * 18.0), $01)
                                moveentity(local0\Field82, 0.0, 0.0, (local0\Field64 * fps\Field3[$00]), $00)
                                If (0.005 < local0\Field64) Then
                                    If ((((309.0 > local21) And (309.0 <= local0\Field103)) Lor ((319.0 >= local21) And (301.0 >= local0\Field103))) <> 0) Then
                                        playsoundex(TXDBZF46ZXF(getstepsound(local0\Field82), $01, rand($00, $02)), camera, local0\Field82, 8.0, rnd(0.3, 0.5), $00, $00)
                                    EndIf
                                EndIf
                            Case 3.0
                                setanimtime(local0\Field98, 1123.0, $00)
                        End Select
                    Else
                        Select local0\Field57
                            Case -1.0
                            Case 0.0
                                animatenpc(local0, 1.0, 20.0, 0.5, $00)
                            Case 1.0
                                animatenpc(local0, 41.0, 60.0, 0.5, $00)
                            Case 2.0
                                animatenpc(local0, 555.0, 629.0, 0.5, $00)
                            Case 3.0
                                animatenpc(local0, 630.0, 677.0, 0.5, $00)
                            Case 4.0
                                animatenpc(local0, 678.0, 711.0, 0.5, $00)
                            Case 5.0
                                animatenpc(local0, 712.0, 779.0, 0.5, $00)
                        End Select
                    EndIf
                EndIf
                positionentity(local0\Field98, entityx(local0\Field82, $00, 1.0), (entityy(local0\Field82, $00, 1.0) - local0\Field23), entityz(local0\Field82, $00, 1.0), $00)
                rotateentity(local0\Field98, entitypitch(local0\Field82, $00, 1.0), (entityyaw(local0\Field82, $00, 1.0) - 180.0), 0.0, $00)
            Case $0F
                If (66.0 <> local0\Field66) Then
                    local13 = entitydistancesquared(XZ0260X8X2\Field74, local0\Field82)
                    If ((hidedistance * hidedistance) > local13) Then
                        If (4.0 > local0\Field66) Then
                            If (((((playerroom\Field22\Field21 = $4B) Lor (playerroom\Field22\Field21 = $4D)) And XZ0260X8X2\Field27) Lor (1.0 < n_i\Field2\Field66)) <> 0) Then
                                local0\Field66 = 4.0
                            EndIf
                            local23 = (((36.0 > local13) And entityvisible(XZ0260X8X2\Field74, local0\Field82, 0.0)) And ((chs\Field8 Lor i_268\Field3) = $00))
                        EndIf
                        local0\Field64 = min((local0\Field64 * local0\Field65), (local0\Field32 * local0\Field65))
                        Select local0\Field66
                            Case 0.0
                                If (local23 <> 0) Then
                                    local0\Field66 = 2.0
                                EndIf
                                local0\Field64 = 0.0
                                animatenpc(local0, clamp(animtime(local0\Field98), 1.0, 11.0), 36.0, 0.3, $00)
                                If (35.9 <= local0\Field103) Then
                                    setnpcframe(local0, 1.0, $01)
                                EndIf
                                If (rand($32, $01) = $01) Then
                                    rotateentity(local0\Field82, 0.0, rnd(360.0, 0.0), 0.0, $01)
                                EndIf
                                local0\Field84 = curveangle(entityyaw(local0\Field82, $01, 1.0), local0\Field84, 20.0)
                                If (rand($64, $01) = $01) Then
                                    local0\Field66 = 1.0
                                EndIf
                            Case 1.0
                                If (local23 <> 0) Then
                                    local0\Field66 = 2.0
                                EndIf
                                local38 = $00
                                If ((Float millisecs()) > local0\Field38) Then
                                    hideentity(local0\Field82)
                                    entitypick(local0\Field82, 1.5)
                                    If (pickedentity() <> $00) Then
                                        local38 = $01
                                    EndIf
                                    showentity(local0\Field82)
                                    If (rand($05, $01) = $01) Then
                                        local0\Field66 = 0.0
                                    EndIf
                                    local0\Field38 = (Float (millisecs() + $3E8))
                                EndIf
                                rotateentity(local0\Field82, 0.0, (entityyaw(local0\Field82, $01, 1.0) + (rnd(80.0, 110.0) * (Float local38))), 0.0, $01)
                                local0\Field84 = curveangle(entityyaw(local0\Field82, $01, 1.0), local0\Field84, 20.0)
                                local0\Field64 = curvevalue((local0\Field32 * 0.7), local0\Field64, 10.0)
                                moveentity(local0\Field82, 0.0, 0.0, (local0\Field64 * fps\Field3[$00]), $00)
                                If (11.0 > local0\Field103) Then
                                    animatenpc(local0, 1.0, 11.0, 0.3, $00)
                                EndIf
                            Case 2.0
                                local65 = Null
                                For local64 = Each items
                                    If (((((((local64\Field6\Field9 = $6C) Lor (local64\Field6\Field9 = $25)) Lor (local64\Field6\Field9 = $14)) Lor (local64\Field6\Field9 = $16)) Lor (local64\Field6\Field9 = $0E)) And (local64\Field17 = $00)) <> 0) Then
                                        If (1.0 > entitydistancesquared(local0\Field82, local64\Field9)) Then
                                            local65 = local64
                                            Exit
                                        EndIf
                                    EndIf
                                Next
                                If (local65 = Null) Then
                                    If (local23 <> 0) Then
                                        giveachievement("999", $01)
                                        pointentity(local0\Field82, XZ0260X8X2\Field74, 0.0)
                                        rotateentity(local0\Field82, 0.0, entityyaw(local0\Field82, $01, 1.0), 0.0, $01)
                                        local0\Field17 = $AF
                                        local0\Field84 = curveangle(entityyaw(local0\Field82, $01, 1.0), local0\Field84, 25.0)
                                    EndIf
                                Else
                                    pointentity(local0\Field82, local65\Field9, 0.0)
                                    rotateentity(local0\Field82, 0.0, entityyaw(local0\Field82, $01, 1.0), 0.0, $01)
                                    local0\Field17 = $69
                                    local0\Field84 = curveangle(entityyaw(local0\Field82, $01, 1.0), local0\Field84, 25.0)
                                    If (0.09 > entitydistancesquared(local0\Field82, local65\Field9)) Then
                                        Select local65\Field6\Field9
                                            Case $25
                                                entitycolor(local0\Field98, 255.0, 255.0, 140.0)
                                                entityfx(local0\Field98, $01)
                                                If (2.0 > local0\Field57) Then
                                                    local0\Field57 = (local0\Field57 + 2.0)
                                                EndIf
                                            Case $14
                                                If (3.0 > local0\Field57) Then
                                                    local0\Field57 = (((Float (2.0 = local0\Field57)) * 2.0) + 1.0)
                                                EndIf
                                            Case $6C
                                                local0\Field65 = 2.0
                                            Case $0E
                                                playsound_strict(loadtempsound("SFX\Music\Using420J.ogg"), $00, $00)
                                        End Select
                                        playsoundex(loadtempsound("SFX\SCP\458\Eating.ogg"), camera, local0\Field82, 3.0, 0.5, $00, $00)
                                        removeitem(local65, $01)
                                    EndIf
                                EndIf
                                local0\Field17 = (Int max(((Float local0\Field17) - fps\Field3[$00]), 0.0))
                                If (0.0 < (Float local0\Field17)) Then
                                    local0\Field64 = curvevalue(local0\Field32, local0\Field64, 40.0)
                                    If (1.0 < local13) Then
                                        If (11.0 > local0\Field103) Then
                                            animatenpc(local0, 1.0, 11.0, 0.3, $00)
                                        EndIf
                                        moveentity(local0\Field82, 0.0, 0.0, (local0\Field64 * fps\Field3[$00]), $00)
                                    Else
                                        If (0.64 > local13) Then
                                            moveentity(local0\Field82, 0.0, 0.0, ((- local0\Field64) * fps\Field3[$00]), $00)
                                        Else
                                            local0\Field64 = 0.0
                                        EndIf
                                        If (1.0 < local0\Field57) Then
                                            XZ0260X8X2\Field11 = max((XZ0260X8X2\Field11 - (fps\Field3[$00] / 700.0)), 0.0)
                                        ElseIf (0.5 < XZ0260X8X2\Field11) Then
                                            XZ0260X8X2\Field11 = max((XZ0260X8X2\Field11 - (fps\Field3[$00] / 2800.0)), 0.5)
                                        EndIf
                                        If (((1.0 = local0\Field57) Lor (3.0 = local0\Field57)) <> 0) Then
                                            If (0.0 < i_008\Field0) Then
                                                i_008\Field1 = $01
                                            EndIf
                                            If (0.0 < i_409\Field0) Then
                                                i_409\Field1 = $01
                                            EndIf
                                            For local11 = $00 To $06 Step $01
                                                i_1025\Field0[local11] = 0.0
                                            Next
                                            If (0.0 < i_1025\Field1[$00]) Then
                                                For local11 = (maxitemamount - $02) To (maxitemamount - $01) Step $01
                                                    If (TX60DB8XBBZ(local11) <> Null) Then
                                                        dropitem(TX60DB8XBBZ(local11), $01)
                                                    EndIf
                                                Next
                                                maxitemamount = (maxitemamount - $02)
                                                i_1025\Field1[$00] = 0.0
                                            EndIf
                                            For local11 = $01 To $04 Step $01
                                                i_1025\Field1[local11] = 0.0
                                            Next
                                        EndIf
                                    EndIf
                                    If (0.001 >= local0\Field64) Then
                                        animatenpc(local0, clamp(animtime(local0\Field98), 1.0, 11.0), 36.0, 0.3, $00)
                                    ElseIf (35.9 <= local0\Field103) Then
                                        setnpcframe(local0, 1.0, $01)
                                    EndIf
                                Else
                                    local0\Field66 = 3.0
                                EndIf
                            Case 3.0,4.0
                                If (((3.0 = local0\Field66) And local23) <> 0) Then
                                    local0\Field60 = 0.0
                                    local0\Field61 = 0.0
                                    local0\Field74 = 0.0
                                    local0\Field66 = 0.0
                                    Return $00
                                EndIf
                                If (0.0 >= local0\Field8) Then
                                    If (4.0 = local0\Field66) Then
                                        If ((((0.0 = local0\Field60) And (0.0 = local0\Field61)) And (0.0 = local0\Field74)) <> 0) Then
                                            createhintmsg(getlocalstring("msg", "999_follow"), 6.0, $00)
                                            For local4 = Each rooms
                                                If (local4\Field22\Field21 = $5C) Then
                                                    tformpoint(590.0, -352.0, 0.0, local4\Field15, $00)
                                                    local0\Field60 = tformedx()
                                                    local0\Field61 = tformedy()
                                                    local0\Field74 = tformedz()
                                                    Exit
                                                EndIf
                                            Next
                                        EndIf
                                        If (9.0 > distancesquared(local0\Field60, entityx(local0\Field82, $01, 1.0), local0\Field61, entityy(local0\Field82, $01, 1.0), local0\Field74, entityz(local0\Field82, $01, 1.0))) Then
                                            local0\Field60 = 0.0
                                            local0\Field61 = 0.0
                                            local0\Field74 = 0.0
                                            local0\Field66 = 0.0
                                            Return $00
                                        EndIf
                                    Else
                                        local0\Field60 = entityx(XZ0260X8X2\Field74, $01, 1.0)
                                        local0\Field61 = (entityy(XZ0260X8X2\Field74, $01, 1.0) + 0.1)
                                        local0\Field74 = entityz(XZ0260X8X2\Field74, $01, 1.0)
                                    EndIf
                                    local0\Field30 = findpath(local0, local0\Field60, local0\Field61, local0\Field74)
                                    local0\Field8 = 420.0
                                Else
                                    If (local0\Field30 = $01) Then
                                        If (local0\Field71[local0\Field48] = Null) Then
                                            If (local0\Field48 > $14) Then
                                                local0\Field48 = $00
                                                local0\Field30 = $00
                                            Else
                                                local0\Field48 = (local0\Field48 + $01)
                                            EndIf
                                        Else
                                            pointentity(local0\Field82, local0\Field71[local0\Field48]\Field0, 0.0)
                                            rotateentity(local0\Field82, 0.0, entityyaw(local0\Field82, $01, 1.0), 0.0, $01)
                                            local0\Field64 = curvevalue((local0\Field32 * 1.5), local0\Field64, 40.0)
                                            translateentity(local0\Field82, ((cos((entityyaw(local0\Field82, $01, 1.0) + 90.0)) * local0\Field64) * fps\Field3[$00]), 0.0, ((sin((entityyaw(local0\Field82, $01, 1.0) + 90.0)) * local0\Field64) * fps\Field3[$00]), $01)
                                            animatenpc(local0, 1.0, 11.0, (local0\Field64 * 26.0), $00)
                                            usedoornpc(local0, $01, $01)
                                        EndIf
                                        local0\Field8 = (local0\Field8 - fps\Field3[$00])
                                    Else
                                        local0\Field64 = 0.0
                                        animatenpc(local0, clamp(animtime(local0\Field98), 1.0, 11.0), 36.0, 0.3, $00)
                                        If (35.9 <= local0\Field103) Then
                                            setnpcframe(local0, 1.0, $01)
                                        EndIf
                                        If (rand($32, $01) = $01) Then
                                            rotateentity(local0\Field82, 0.0, rnd(360.0, 0.0), 0.0, $01)
                                        EndIf
                                        local0\Field8 = (local0\Field8 - (fps\Field3[$00] * 2.0))
                                    EndIf
                                    local0\Field84 = curveangle(entityyaw(local0\Field82, $01, 1.0), local0\Field84, 20.0)
                                EndIf
                        End Select
                        If (rand($A0, $01) = $01) Then
                            If (ChannelPlaying(local0\Field63) = $00) Then
                                local0\Field63 = playsoundex(loadtempsound((("SFX\SCP\999\Gurgling" + (Str rand($00, $03))) + ".ogg")), camera, local0\Field82, 4.0, 0.25, $00, $00)
                            EndIf
                        EndIf
                        If (0.0 < local0\Field64) Then
                            If ((Float millisecs()) > local0\Field62) Then
                                local26 = createpivot($00)
                                positionentity(local26, entityx(local0\Field82, $00, 1.0), (entityy(local0\Field82, $00, 1.0) + 0.3), entityz(local0\Field82, $00, 1.0), $00)
                                turnentity(local26, 90.0, 0.0, 0.0, $00)
                                If (entitypick(local26, 0.6) <> 0) Then
                                    local3 = createdecal($15, pickedx(), (pickedy() + 0.005), pickedz(), 90.0, rnd(360.0, 0.0), 0.0, rnd(0.3, 0.36), 0.4, (2.0 = local0\Field65), $01, $00, $00, $00)
                                    local3\Field5 = -0.0003
                                    entityparent(local3\Field0, playerroom\Field15, $01)
                                EndIf
                                freeentity(local26)
                                local26 = $00
                                local0\Field62 = (Float (millisecs() + $3E8))
                            EndIf
                        EndIf
                    ElseIf (local0\Field17 = $00) Then
                        For local4 = Each rooms
                            If (local4\Field22\Field21 = $5C) Then
                                tformpoint(590.0, -256.0, 0.0, local4\Field15, $00)
                                teleportentity(local0\Field82, tformedx(), tformedy(), tformedz(), 0.3, $00, 2.0, $00)
                                local0\Field17 = $01
                                local0\Field66 = 0.0
                                Exit
                            EndIf
                        Next
                    EndIf
                EndIf
                positionentity(local0\Field98, entityx(local0\Field82, $00, 1.0), (entityy(local0\Field82, $00, 1.0) - local0\Field23), entityz(local0\Field82, $00, 1.0), $00)
                rotateentity(local0\Field98, 0.0, (local0\Field84 + 90.0), 0.0, $00)
            Case $10
                local0\Field32 = 0.3
                local23 = ((4.0 > entitydistancesquared(XZ0260X8X2\Field74, local0\Field82)) And entityinview(local0\Field98, camera))
                If (local23 <> 0) Then
                    giveachievement("1048", $01)
                EndIf
                Select local0\Field66
                    Case 0.0
                        local0\Field64 = curvevalue(0.0, local0\Field64, 5.0)
                        animatenpc(local0, 2.0, 151.0, local0\Field32, $01)
                    Case 1.0
                        If (262.0 > local0\Field103) Then
                            animatenpc(local0, 249.0, 262.0, local0\Field32, $00)
                        Else
                            local0\Field32 = 0.008
                            rotateentity(local0\Field82, 0.0, entityyaw(local0\Field82, $00, 1.0), 0.0, $01)
                            local0\Field84 = curveangle(entityyaw(local0\Field82, $01, 1.0), local0\Field84, 20.0)
                            local0\Field64 = curvevalue(local0\Field32, local0\Field64, 10.0)
                            moveentity(local0\Field82, 0.0, 0.0, (local0\Field64 * fps\Field3[$00]), $00)
                            animatenpc(local0, 263.0, 290.0, (local0\Field64 * 37.5), $01)
                        EndIf
                    Case 2.0
                        local22 = ((chs\Field8 Lor i_268\Field3) = $00)
                        If ((local23 And local22) <> 0) Then
                            pointentity(local0\Field82, XZ0260X8X2\Field74, 0.0)
                            rotateentity(local0\Field82, 0.0, entityyaw(local0\Field82, $00, 1.0), 0.0, $01)
                        EndIf
                        local0\Field84 = curveangle(entityyaw(local0\Field82, $01, 1.0), local0\Field84, 20.0)
                        local0\Field64 = curvevalue(0.0, local0\Field64, 5.0)
                        If (0.0 = local0\Field65) Then
                            If ((local23 And local22) <> 0) Then
                                local0\Field65 = 1.0
                            EndIf
                        ElseIf (1.0 = local0\Field65) Then
                            animatenpc(local0, 305.0, 325.0, local0\Field32, $00)
                            If (324.9 < local0\Field103) Then
                                local0\Field65 = 2.0
                            EndIf
                        ElseIf (2.0 = local0\Field65) Then
                            animatenpc(local0, 325.0, 305.0, ((- local0\Field32) / 1.5), $00)
                            If (((305.1 > local0\Field103) And (entityinview(local0\Field98, camera) = $00)) <> 0) Then
                                local0\Field65 = 3.0
                            EndIf
                        EndIf
                    Case 3.0
                        If ((local23 And ((chs\Field8 Lor i_268\Field3) = $00)) <> 0) Then
                            pointentity(local0\Field82, XZ0260X8X2\Field74, 0.0)
                            rotateentity(local0\Field82, 0.0, entityyaw(local0\Field82, $00, 1.0), 0.0, $01)
                            local0\Field65 = 1.0
                        EndIf
                        local0\Field84 = curveangle(entityyaw(local0\Field82, $01, 1.0), local0\Field84, 20.0)
                        If (1.0 = local0\Field65) Then
                            local0\Field64 = curvevalue(0.0, local0\Field64, 5.0)
                            If (474.0 > local0\Field103) Then
                                animatenpc(local0, 326.0, 474.0, local0\Field32, $00)
                            Else
                                animatenpc(local0, 475.0, 623.0, local0\Field32, $01)
                            EndIf
                        EndIf
                End Select
                positionentity(local0\Field98, entityx(local0\Field82, $00, 1.0), (entityy(local0\Field82, $00, 1.0) - (local0\Field23 + 0.13)), entityz(local0\Field82, $00, 1.0), $00)
                rotateentity(local0\Field98, -90.0, local0\Field84, 0.0, $00)
            Case $11
                If (66.0 <> local0\Field66) Then
                    If (local0\Field1 = $00) Then
                        local0\Field32 = 1.0
                        local13 = entitydistancesquared(local0\Field82, XZ0260X8X2\Field74)
                        Select local0\Field66
                            Case 0.0
                                local0\Field64 = curvevalue(0.0, local0\Field64, 5.0)
                                animatenpc(local0, 2.0, 399.0, local0\Field32, $01)
                                If (rand($15E, $01) = $01) Then
                                    If (ChannelPlaying(local0\Field63) = $00) Then
                                        local0\Field63 = playsoundex(loadtempsound((("SFX\SCP\1048A\Random" + (Str rand($00, $04))) + ".ogg")), camera, local0\Field82, 8.0, 1.0, $01, $00)
                                    EndIf
                                EndIf
                                If ((((16.0 > local13) And entityvisible(local0\Field82, XZ0260X8X2\Field74, 0.0)) And ((chs\Field8 Lor i_268\Field3) = $00)) <> 0) Then
                                    giveachievement("1048", $01)
                                    local0\Field65 = 140.0
                                    local0\Field66 = 1.0
                                EndIf
                            Case 1.0
                                local0\Field32 = 0.008
                                updatenpcblinking(local0)
                                local22 = npcseesplayer(local0, (8.0 - XZ0260X8X2\Field46), 360.0, $00)
                                local0\Field65 = max((local0\Field65 - fps\Field3[$00]), 0.0)
                                If (0.0 < local0\Field65) Then
                                    If (local22 = $01) Then
                                        local0\Field65 = 140.0
                                    EndIf
                                    pointentity(local0\Field82, XZ0260X8X2\Field74, 0.0)
                                    rotateentity(local0\Field82, 0.0, entityyaw(local0\Field82, $00, 1.0), 0.0, $01)
                                    local0\Field84 = curveangle(entityyaw(local0\Field82, $01, 1.0), local0\Field84, 20.0)
                                    local0\Field64 = curvevalue(local0\Field32, local0\Field64, 10.0)
                                    moveentity(local0\Field82, 0.0, 0.0, (local0\Field64 * fps\Field3[$00]), $00)
                                    animatenpc(local0, 649.0, 677.0, (local0\Field64 * 37.5), $01)
                                Else
                                    local0\Field66 = 0.0
                                EndIf
                                If ((((1.44 > local13) And entityvisible(local0\Field82, XZ0260X8X2\Field74, 0.0)) And ((chs\Field8 Lor i_268\Field3) = $00)) <> 0) Then
                                    setnpcframe(local0, 400.0, $01)
                                    local0\Field66 = 2.0
                                EndIf
                            Case 2.0
                                local21 = local0\Field103
                                animatenpc(local0, max(local21, 2.0), 647.0, 1.0, $00)
                                If (((400.0 >= local21) And (400.0 < local0\Field103)) <> 0) Then
                                    local0\Field63 = playsound_strict(loadtempsound("SFX\SCP\1048A\Shriek.ogg"), $00, $00)
                                EndIf
                                local69 = max((1.0 - ((Abs (local21 - 600.0)) / 100.0)), 0.0)
                                XZ0260X8X2\Field64 = ((local69 * 1000.0) / max((local13 / 8.0), 1.0))
                                XZ0260X8X2\Field1 = ((local69 * 10.0) / max((local13 / 4.0), 1.0))
                                If ((chs\Field8 Lor i_268\Field3) = $00) Then
                                    pointentity(local0\Field82, XZ0260X8X2\Field74, 0.0)
                                    rotateentity(local0\Field82, 0.0, entityyaw(local0\Field82, $00, 1.0), 0.0, $00)
                                EndIf
                                local0\Field84 = curveangle(entityyaw(local0\Field82, $01, 1.0), local0\Field84, 20.0)
                                If (646.0 < local21) Then
                                    If ((((((25.0 > local13) And entityvisible(XZ0260X8X2\Field74, local0\Field82, 0.0)) And (0.0 = i_1048a\Field2)) And (XZ0260X8X2\Field61 = $00)) And (T8660BZ460\Field4 = $00)) <> 0) Then
                                        i_1048a\Field0 = playsound_strict(loadtempsound("SFX\SCP\1048A\Growth.ogg"), $01, $00)
                                        XZ0260X8X2\Field64 = 1000.0
                                        XZ0260X8X2\Field1 = 2.0
                                        i_1048a\Field2 = 0.01
                                    EndIf
                                    local0\Field4 = $00
                                EndIf
                        End Select
                        updatesoundorigin(local0\Field63, camera, local0\Field82, 8.0, 1.0, $01, $01, $00)
                        If (local0\Field4 <= $00) Then
                            playsoundex(loadtempsound("SFX\SCP\1048A\Explode.ogg"), camera, local0\Field82, 8.0, 1.0, $00, $00)
                            local16 = entityx(local0\Field82, $00, 1.0)
                            local18 = entityy(local0\Field82, $00, 1.0)
                            local19 = entityz(local0\Field82, $00, 1.0)
                            For local11 = $00 To $01 Step $01
                                setemitter(Null, local16, local18, local19, $0F)
                                setemitter(Null, local16, local18, local19, $15)
                            Next
                            local26 = createpivot($00)
                            positionentity(local26, (rnd(-0.05, 0.05) + local16), (local18 - 0.05), (rnd(-0.05, 0.05) + local19), $00)
                            turnentity(local26, 90.0, 0.0, 0.0, $00)
                            If (entitypick(local26, 0.3) <> 0) Then
                                local3 = createdecal(rand($11, $12), pickedx(), (pickedy() + 0.005), pickedz(), 90.0, rnd(360.0, 0.0), 0.0, rnd(0.3, 0.5), 1.0, $00, $01, $00, $00, $00)
                                local3\Field14 = rnd(0.001, 0.0015)
                                local3\Field3 = (local3\Field9 + rnd(0.008, 0.009))
                                local3\Field5 = -0.0001
                            EndIf
                            freeentity(local26)
                            local26 = $00
                            local0\Field1 = $01
                        EndIf
                    EndIf
                EndIf
                positionentity(local0\Field98, entityx(local0\Field82, $00, 1.0), (entityy(local0\Field82, $00, 1.0) - (local0\Field23 + 0.1)), entityz(local0\Field82, $00, 1.0), $00)
                rotateentity(local0\Field98, -90.0, local0\Field84, 0.0, $00)
            Case $0B
                If (playerroom\Field22\Field21 <> $6F) Then
                    If (1.0 = local0\Field31) Then
                        If (entityhidden(local0\Field98) = $00) Then
                            hideentity(local0\Field98)
                            hideentity(local0\Field101)
                        EndIf
                        If (rand($1F4, $01) = $01) Then
                            For local6 = Each waypoints
                                If (local6\Field9 <> playerroom) Then
                                    local13 = distancesquared(entityx(XZ0260X8X2\Field74, $00, 1.0), entityx(local6\Field0, $01, 1.0), entityz(XZ0260X8X2\Field74, $00, 1.0), entityz(local6\Field0, $01, 1.0), 0.0, 0.0)
                                    If (((9.0 < local13) And (81.0 > local13)) <> 0) Then
                                        positionentity(local0\Field82, entityx(local6\Field0, $01, 1.0), (entityy(local6\Field0, $01, 1.0) + (1.0 / 12.8)), entityz(local6\Field0, $01, 1.0), $00)
                                        resetentity(local0\Field82)
                                        local0\Field17 = $00
                                        local0\Field71[$00] = local6
                                        local0\Field31 = 0.0
                                        local0\Field65 = (rnd(15.0, 20.0) * 70.0)
                                        local0\Field66 = max((Float rand($FFFFFFFF, $02)), 0.0)
                                        local0\Field13 = rand($00, $01)
                                        Exit
                                    EndIf
                                EndIf
                            Next
                        EndIf
                    EndIf
                    If (0.0 = local0\Field31) Then
                        If (entityhidden(local0\Field98) <> 0) Then
                            showentity(local0\Field98)
                            showentity(local0\Field101)
                        EndIf
                        local13 = entitydistancesquared(XZ0260X8X2\Field74, local0\Field82)
                        local0\Field49 = curvevalue(0.0, local0\Field49, 10.0)
                        local0\Field15 = curvevalue(0.0, local0\Field15, 10.0)
                        If (rand($64, $01) = $01) Then
                            If (rand($05, $01) = $01) Then
                                local0\Field49 = ((entityx(XZ0260X8X2\Field74, $00, 1.0) - entityx(local0\Field82, $00, 1.0)) * 0.9)
                                local0\Field15 = ((entityz(XZ0260X8X2\Field74, $00, 1.0) - entityz(local0\Field82, $00, 1.0)) * 0.9)
                            Else
                                local0\Field49 = rnd(0.1, 0.5)
                                local0\Field15 = rnd(0.1, 0.5)
                            EndIf
                        EndIf
                        local38 = (Int rnd(-1.0, 1.0))
                        positionentity(local0\Field101, (entityx(local0\Field82, $00, 1.0) + (local0\Field49 * (Float local38))), ((entityy(local0\Field82, $00, 1.0) - 0.2) + (sin((Float (((millisec Sar $03) - $2D) Mod $168))) * 0.05)), (entityz(local0\Field82, $00, 1.0) + (local0\Field15 * (Float local38))), $00)
                        rotateentity(local0\Field101, 0.0, entityyaw(local0\Field98, $00, 1.0), 0.0, $00)
                        If (floor(local0\Field103) <> floor(animtime(local0\Field101))) Then
                            setanimtime(local0\Field101, local0\Field103, $00)
                        EndIf
                        If (0.0 = local0\Field66) Then
                            If (local0\Field13 = $00) Then
                                animatenpc(local0, 2.0, 74.0, 0.2, $01)
                            Else
                                animatenpc(local0, 75.0, 124.0, 0.2, $01)
                            EndIf
                            If (local0\Field17 <> 0) Then
                                pointentity(local0\Field101, XZ0260X8X2\Field74, 0.0)
                                rotateentity(local0\Field98, 0.0, curveangle(entityyaw(local0\Field101, $00, 1.0), entityyaw(local0\Field98, $00, 1.0), 40.0), 0.0, $00)
                                If (16.0 > local13) Then
                                    local0\Field66 = (Float rand($01, $02))
                                EndIf
                            ElseIf (((36.0 > local13) And (rand($05, $01) = $01)) <> 0) Then
                                If ((entityinview(local0\Field82, camera) And entityvisible(XZ0260X8X2\Field74, local0\Field82, 0.0)) <> 0) Then
                                    local0\Field17 = $01
                                    XZ0260X8X2\Field42 = min(-450.0, XZ0260X8X2\Field42)
                                    XZ0260X8X2\Field1 = 0.7
                                    XZ0260X8X2\Field64 = max(600.0, XZ0260X8X2\Field64)
                                    XZ0260X8X2\Field87 = 0.7
                                    XZ0260X8X2\Field62 = 150.0
                                    playsound_strict(loadtempsound((("SFX\SCP\513_1\Bell" + (Str rand($00, $02))) + ".ogg")), $00, $00)
                                EndIf
                            EndIf
                        ElseIf (local0\Field71[$00] = Null) Then
                            For local6 = Each waypoints
                                local14 = distancesquared(entityx(local0\Field82, $00, 1.0), entityx(local6\Field0, $00, 1.0), entityz(local0\Field82, $00, 1.0), entityz(local6\Field0, $00, 1.0), 0.0, 0.0)
                                If (((1.0 < local14) And (64.0 > local14)) <> 0) Then
                                    If (local13 < entitydistancesquared(XZ0260X8X2\Field74, local6\Field0)) Then
                                        local0\Field71[$00] = local6
                                        Exit
                                    EndIf
                                EndIf
                            Next
                            If (local0\Field71[$00] = Null) Then
                                local0\Field31 = 1.0
                                local0\Field65 = 0.0
                            EndIf
                        ElseIf (1.0 < entitydistancesquared(local0\Field82, local0\Field71[$00]\Field0)) Then
                            pointentity(local0\Field98, local0\Field71[$00]\Field0, 0.0)
                            rotateentity(local0\Field82, curveangle(entitypitch(local0\Field98, $00, 1.0), entitypitch(local0\Field82, $00, 1.0), 15.0), curveangle(entityyaw(local0\Field98, $00, 1.0), entityyaw(local0\Field82, $00, 1.0), 15.0), 0.0, $01)
                            local0\Field64 = curvevalue((max(((7.0 - sqr(local13)) / 7.0), 0.0) * 0.05), local0\Field64, 15.0)
                            moveentity(local0\Field82, 0.0, 0.0, (local0\Field64 * fps\Field3[$00]), $00)
                            If (rand($C8, $01) = $01) Then
                                moveentity(local0\Field82, 0.0, 0.0, 0.5, $00)
                            EndIf
                            rotateentity(local0\Field82, 0.0, entityyaw(local0\Field82, $00, 1.0), 0.0, $01)
                        Else
                            For local11 = $00 To $03 Step $01
                                If (local0\Field71[$00]\Field3[local11] <> Null) Then
                                    If (local13 < entitydistancesquared(XZ0260X8X2\Field74, local0\Field71[$00]\Field3[local11]\Field0)) Then
                                        If (local0\Field17 = $00) Then
                                            If ((entityinview(local0\Field82, camera) And entityvisible(XZ0260X8X2\Field74, local0\Field82, 0.0)) <> 0) Then
                                                local0\Field17 = $01
                                                XZ0260X8X2\Field42 = min(-450.0, XZ0260X8X2\Field42)
                                                XZ0260X8X2\Field1 = 0.7
                                                XZ0260X8X2\Field64 = max(600.0, XZ0260X8X2\Field64)
                                                XZ0260X8X2\Field87 = 0.7
                                                XZ0260X8X2\Field62 = 150.0
                                                playsound_strict(loadtempsound((("SFX\SCP\513_1\Bell" + (Str rand($00, $02))) + ".ogg")), $00, $00)
                                            EndIf
                                        EndIf
                                        local0\Field71[$00] = local0\Field71[$00]\Field3[local11]
                                        Exit
                                    EndIf
                                EndIf
                            Next
                            If (local0\Field71[$00] = Null) Then
                                local0\Field65 = 0.0
                            EndIf
                        EndIf
                        positionentity(local0\Field98, entityx(local0\Field82, $00, 1.0), ((entityy(local0\Field82, $00, 1.0) - local0\Field23) + (sin((Float ((millisec Sar $03) Mod $168))) * 0.1)), entityz(local0\Field82, $00, 1.0), $00)
                        Select local0\Field66
                            Case 1.0
                                If (local0\Field13 = $00) Then
                                    animatenpc(local0, 125.0, 194.0, (local0\Field64 * 20.0), $01)
                                Else
                                    animatenpc(local0, 195.0, 264.0, (local0\Field64 * 20.0), $01)
                                EndIf
                                rotateentity(local0\Field98, 0.0, entityyaw(local0\Field82, $00, 1.0), 0.0, $00)
                            Case 2.0
                                If (local0\Field13 = $00) Then
                                    animatenpc(local0, 2.0, 74.0, 0.2, $01)
                                Else
                                    animatenpc(local0, 75.0, 124.0, 0.2, $01)
                                EndIf
                                rotateentity(local0\Field98, 0.0, entityyaw(local0\Field82, $00, 1.0), 0.0, $00)
                        End Select
                        If (0.0 < local0\Field65) Then
                            If (16.0 > local13) Then
                                local0\Field65 = (local0\Field65 - (fps\Field3[$00] * 4.0))
                            EndIf
                            local0\Field65 = (local0\Field65 - fps\Field3[$00])
                        Else
                            local0\Field71[$00] = Null
                            local0\Field31 = 1.0
                            local0\Field65 = 0.0
                        EndIf
                    EndIf
                EndIf
                local0\Field70 = 0.0
                resetentity(local0\Field82)
            Case $09
                If (playerinreachableroom($01, $00, $01) <> 0) Then
                    If (1.0 = local0\Field31) Then
                        If (entityhidden(local0\Field98) = $00) Then
                            hideentity(local0\Field98)
                        EndIf
                        If (((rand($32, $01) = $01) And ((-5.0 > XZ0260X8X2\Field53) And (-15.0 < XZ0260X8X2\Field53))) <> 0) Then
                            local15 = (entityyaw(XZ0260X8X2\Field74, $00, 1.0) + rnd(-90.0, 90.0))
                            local13 = rnd(1.5, 2.0)
                            positionentity(local0\Field82, (entityx(XZ0260X8X2\Field74, $00, 1.0) + (sin(local15) * local13)), (entityy(XZ0260X8X2\Field74, $00, 1.0) + 0.2), (entityz(XZ0260X8X2\Field74, $00, 1.0) + (cos(local15) * local13)), $00)
                            local0\Field31 = 0.0
                            local0\Field66 = rnd(20.0, 60.0)
                            If (rand($12C, $01) = $01) Then
                                playsoundex(snd_i\Field24[rand($00, $05)], camera, local0\Field82, 8.0, rnd(0.0, 0.2), $00, $00)
                            EndIf
                        EndIf
                    EndIf
                    If (0.0 = local0\Field31) Then
                        If (entityhidden(local0\Field98) <> 0) Then
                            showentity(local0\Field98)
                        EndIf
                        positionentity(local0\Field98, (entityx(local0\Field82, $00, 1.0) + rnd(-0.005, 0.005)), ((entityy(local0\Field82, $00, 1.0) + 0.3) + (sin(((Float millisec) / 2.0)) * 0.1)), (entityz(local0\Field82, $00, 1.0) + rnd(-0.005, 0.005)), $00)
                        rotateentity(local0\Field98, 0.0, entityyaw(local0\Field82, $00, 1.0), (((Float millisec) / 5.0) Mod 360.0), $00)
                        animatenpc(local0, 1.0, 300.0, rnd(0.8, 2.5), $01)
                        If ((entityinview(local0\Field98, camera) And ((-16.0 > XZ0260X8X2\Field53) Lor (-6.0 < XZ0260X8X2\Field53))) <> 0) Then
                            giveachievement("372", $01)
                            If (rand($1E, $01) = $01) Then
                                If (entityvisible(camera, local0\Field98, 0.0) <> 0) Then
                                    If (ChannelPlaying(local0\Field63) = $00) Then
                                        local0\Field63 = playsoundex(snd_i\Field24[rand($00, $05)], camera, local0\Field98, 8.0, 0.3, $00, $00)
                                    EndIf
                                EndIf
                            EndIf
                            local38 = createpivot($00)
                            positionentity(local38, entityx(XZ0260X8X2\Field74, $00, 1.0), entityy(XZ0260X8X2\Field74, $00, 1.0), entityz(XZ0260X8X2\Field74, $00, 1.0), $00)
                            pointentity(local38, local0\Field82, 0.0)
                            local15 = wrapangle((entityyaw(XZ0260X8X2\Field74, $00, 1.0) - entityyaw(local38, $00, 1.0)), 360.0)
                            If (180.0 > local15) Then
                                rotateentity(local0\Field82, 0.0, (entityyaw(XZ0260X8X2\Field74, $00, 1.0) - 80.0), 0.0, $00)
                            Else
                                rotateentity(local0\Field82, 0.0, (entityyaw(XZ0260X8X2\Field74, $00, 1.0) + 80.0), 0.0, $00)
                            EndIf
                            freeentity(local38)
                            local38 = $00
                            moveentity(local0\Field82, 0.0, 0.0, (fps\Field3[$00] * 0.03), $00)
                        EndIf
                        local0\Field66 = (local0\Field66 - (fps\Field3[$00] * 0.8))
                        If (0.0 >= local0\Field66) Then
                            local0\Field31 = 1.0
                            positionentity(local0\Field82, 0.0, -500.0, 0.0, $00)
                        EndIf
                    EndIf
                    local0\Field70 = 0.0
                    resetentity(local0\Field82)
                EndIf
            Case $13
                local71 = (fps\Field3[$00] * 20.0)
                If (((3600.0 > entitydistancesquared(XZ0260X8X2\Field74, local0\Field82)) And (4.0 > local0\Field66)) <> 0) Then
                    If (playerroom\Field22\Field21 = $4E) Then
                        local14 = clamp((entitydistance(local0\Field82, playerroom\Field27[$07]) / 31.25), 0.0, 1.0)
                    Else
                        local14 = 1.0
                    EndIf
                    local0\Field63 = loopsoundex(npcsound[$0A], local0\Field63, camera, local0\Field82, 25.0, local14, $00)
                EndIf
                local0\Field70 = 0.0
                Select local0\Field66
                    Case 0.0,1.0
                        turnentity(local0\Field101, 0.0, local71, 0.0, $00)
                        turnentity(local0\Field99, local71, 0.0, 0.0, $00)
                        If (((1.0 = local0\Field66) And ((chs\Field8 Lor i_268\Field3) = $00)) <> 0) Then
                            If (rand($14, $01) = $01) Then
                                If (900.0 > distancesquared(entityx(XZ0260X8X2\Field74, $00, 1.0), entityx(local0\Field82, $00, 1.0), entityz(XZ0260X8X2\Field74, $00, 1.0), entityz(local0\Field82, $00, 1.0), 0.0, 0.0)) Then
                                    If (20.0 > (Abs (entityy(XZ0260X8X2\Field74, $00, 1.0) - entityy(local0\Field82, $00, 1.0)))) Then
                                        If (entityvisible(XZ0260X8X2\Field74, local0\Field82, 0.0) <> 0) Then
                                            playsoundex(snd_i\Field28[$00], camera, local0\Field82, 50.0, 1.0, $00, $00)
                                            local0\Field66 = 2.0
                                        EndIf
                                    EndIf
                                EndIf
                            EndIf
                        EndIf
                    Case 2.0,3.0
                        If (2.0 = local0\Field66) Then
                            local25 = XZ0260X8X2\Field74
                        ElseIf (3.0 = local0\Field66) Then
                            local25 = createpivot($00)
                            positionentity(local25, local0\Field60, local0\Field61, local0\Field74, $01)
                        EndIf
                        turnentity(local0\Field101, 0.0, local71, 0.0, $00)
                        turnentity(local0\Field99, local71, 0.0, 0.0, $00)
                        If (3025.0 > distancesquared(entityx(local25, $00, 1.0), entityx(local0\Field82, $00, 1.0), entityz(local25, $00, 1.0), entityz(local0\Field82, $00, 1.0), 0.0, 0.0)) Then
                            If (20.0 > (Abs (entityy(local25, $00, 1.0) - entityy(local0\Field82, $00, 1.0)))) Then
                                pointentity(local0\Field98, local25, 0.0)
                                rotateentity(local0\Field82, curveangle(min(wrapangle(entitypitch(local0\Field98, $00, 1.0), 360.0), 40.0), entitypitch(local0\Field82, $00, 1.0), 40.0), curveangle(entityyaw(local0\Field98, $00, 1.0), entityyaw(local0\Field82, $00, 1.0), 90.0), entityroll(local0\Field82, $00, 1.0), $01)
                                positionentity(local0\Field82, entityx(local0\Field82, $00, 1.0), curvevalue((entityy(local25, $00, 1.0) + 8.0), entityy(local0\Field82, $00, 1.0), 70.0), entityz(local0\Field82, $00, 1.0), $00)
                                local13 = distancesquared(entityx(local25, $00, 1.0), entityx(local0\Field82, $00, 1.0), entityz(local25, $00, 1.0), entityz(local0\Field82, $00, 1.0), 0.0, 0.0)
                                local0\Field64 = curvevalue((min((sqr(local13) - 6.5), 6.5) * 0.008), local0\Field64, 50.0)
                                moveentity(local0\Field82, 0.0, 0.0, (local0\Field64 * fps\Field3[$00]), $00)
                                local23 = $00
                                If (0.0 = local0\Field8) Then
                                    local23 = entityvisible(local0\Field82, local25, 0.0)
                                    local0\Field8 = rnd(100.0, 200.0)
                                Else
                                    local0\Field8 = min((local0\Field8 - fps\Field3[$00]), 0.0)
                                EndIf
                                If (((chs\Field8 Lor i_268\Field3) And (2.0 = local0\Field66)) <> 0) Then
                                    local23 = $00
                                EndIf
                                If (local23 <> 0) Then
                                    rotateentity(local0\Field82, entitypitch(local0\Field82, $00, 1.0), entityyaw(local0\Field82, $00, 1.0), curveangle(0.0, entityroll(local0\Field82, $00, 1.0), 40.0), $01)
                                    If (0.0 >= local0\Field62) Then
                                        If (400.0 > local13) Then
                                            local26 = createpivot($00)
                                            positionentity(local26, entityx(local0\Field82, $00, 1.0), entityy(local0\Field82, $00, 1.0), entityz(local0\Field82, $00, 1.0), $00)
                                            rotateentity(local26, entitypitch(local0\Field82, $00, 1.0), entityyaw(local0\Field82, $00, 1.0), entityroll(local0\Field82, $00, 1.0), $00)
                                            moveentity(local26, 0.0, 0.27, 1.65, $00)
                                            pointentity(local26, local25, 0.0)
                                            If (10.0 > wrapangle((entityyaw(local26, $00, 1.0) - entityyaw(local0\Field82, $00, 1.0)), 360.0)) Then
                                                playsoundex(snd_i\Field29[$01], camera, local0\Field82, 20.0, 1.0, $00, $00)
                                                local36 = sqr(local13)
                                                shoot(local0, entityx(local26, $00, 1.0), entityy(local26, $00, 1.0), entityz(local26, $00, 1.0), local0\Field82, (((10.0 / local36) * (1.0 / local36)) * (Float (2.0 = local0\Field66))), (2.0 = local0\Field66), $00)
                                                If (((Int XZ0260X8X2\Field48) And (3.0 <> local0\Field66)) <> 0) Then
                                                    If (playerroom\Field22\Field21 = $4E) Then
                                                        msg\Field8 = getlocalstring("death", "apache.gateb")
                                                    Else
                                                        msg\Field8 = getlocalstring("death", "apache.gatea")
                                                    EndIf
                                                EndIf
                                            EndIf
                                            freeentity(local26)
                                            local26 = $00
                                        EndIf
                                        local0\Field62 = 5.0
                                    EndIf
                                Else
                                    rotateentity(local0\Field82, entitypitch(local0\Field82, $00, 1.0), entityyaw(local0\Field82, $00, 1.0), curveangle(-20.0, entityroll(local0\Field82, $00, 1.0), 40.0), $01)
                                EndIf
                                moveentity(local0\Field82, ((- entityroll(local0\Field82, $00, 1.0)) * 0.002), 0.0, 0.0, $00)
                                local0\Field62 = (local0\Field62 - fps\Field3[$00])
                            EndIf
                        EndIf
                        If (3.0 = local0\Field66) Then
                            freeentity(local25)
                            local25 = $00
                        EndIf
                    Case 4.0
                        If (300.0 > local0\Field65) Then
                            turnentity(local0\Field101, 0.0, local71, 0.0, $00)
                            turnentity(local0\Field99, local71, 0.0, 0.0, $00)
                            turnentity(local0\Field82, 0.0, ((- fps\Field3[$00]) * 7.0), 0.0, $00)
                            local0\Field65 = (local0\Field65 + (fps\Field3[$00] * 0.3))
                            local25 = createpivot($00)
                            positionentity(local25, local0\Field60, local0\Field61, local0\Field74, $01)
                            pointentity(local0\Field98, local25, 0.0)
                            moveentity(local0\Field98, 0.0, 0.0, ((fps\Field3[$00] * 0.001) * local0\Field65), $00)
                            positionentity(local0\Field82, entityx(local0\Field98, $00, 1.0), entityy(local0\Field98, $00, 1.0), entityz(local0\Field98, $00, 1.0), $00)
                            If (0.09 > entitydistancesquared(local0\Field98, local25)) Then
                                XZ0260X8X2\Field1 = max(XZ0260X8X2\Field1, 3.0)
                                playsound_strict(loadtempsound((("SFX\Character\Apache\Crash" + (Str rand($00, $01))) + ".ogg")), $00, $00)
                                local0\Field66 = 5.0
                            EndIf
                            freeentity(local25)
                            local25 = $00
                        EndIf
                End Select
                positionentity(local0\Field98, entityx(local0\Field82, $00, 1.0), entityy(local0\Field82, $00, 1.0), entityz(local0\Field82, $00, 1.0), $00)
                rotateentity(local0\Field98, entitypitch(local0\Field82, $00, 1.0), entityyaw(local0\Field82, $00, 1.0), entityroll(local0\Field82, $00, 1.0), $01)
            Case $02
                If (66.0 <> local0\Field66) Then
                    If (local0\Field1 = $00) Then
                        local13 = entitydistancesquared(local0\Field82, XZ0260X8X2\Field74)
                        If ((hidedistance * hidedistance) > local13) Then
                            local21 = local0\Field103
                            Select local0\Field66
                                Case 0.0
                                    If (283.0 = local0\Field103) Then
                                        If (9.0 > local13) Then
                                            local26 = createpivot($00)
                                            positionentity(local26, entityx(local0\Field82, $00, 1.0), entityy(local0\Field82, $00, 1.0), entityz(local0\Field82, $00, 1.0), $00)
                                            turnentity(local26, 90.0, 0.0, 0.0, $00)
                                            If (entitypick(local26, 0.5) <> 0) Then
                                                local3 = createdecal($01, entityx(local0\Field82, $00, 1.0), (pickedy() + 0.005), entityz(local0\Field82, $00, 1.0), 90.0, rnd(360.0, 0.0), 0.0, 0.1, 1.0, $00, $01, $00, $00, $00)
                                                local3\Field14 = 0.0005
                                                local3\Field3 = 0.2
                                                entityparent(local3\Field0, playerroom\Field15, $01)
                                            EndIf
                                            freeentity(local26)
                                            local26 = $00
                                            playsoundex(loadtempsound("SFX\SCP\035_Tentacle\TentacleSpawn.ogg"), camera, local0\Field82, 5.0, 1.0, $00, $00)
                                            setnpcframe(local0, 284.0, $01)
                                        EndIf
                                    Else
                                        XZ0260X8X2\Field87 = max(curvevalue(1.0, XZ0260X8X2\Field87, 50.0), XZ0260X8X2\Field87)
                                        XZ0260X8X2\Field62 = max(curvevalue(130.0, XZ0260X8X2\Field62, 100.0), XZ0260X8X2\Field62)
                                        pointentity(local0\Field98, XZ0260X8X2\Field74, 0.0)
                                        rotateentity(local0\Field82, 0.0, curveangle(entityyaw(local0\Field98, $00, 1.0), entityyaw(local0\Field82, $00, 1.0), 25.0), 0.0, $00)
                                        animatenpc(local0, 284.0, 389.0, 0.3, $00)
                                        If (388.9 < local0\Field103) Then
                                            local0\Field66 = 1.0
                                        EndIf
                                    EndIf
                                Case 1.0
                                    animatenpc(local0, 33.0, 174.0, 0.3, $01)
                                    If (rand($190, $01) = $01) Then
                                        local0\Field84 = rnd(360.0, 0.0)
                                    EndIf
                                    rotateentity(local0\Field82, 0.0, curveangle((local0\Field84 + (sin((Float (millisec / $32))) * 2.0)), entityyaw(local0\Field82, $00, 1.0), 150.0), 0.0, $01)
                                    If (0.0 >= local0\Field20) Then
                                        For local1 = Each npcs
                                            Select local1\Field77
                                                Case $00,$01,$03,$04,$05,$06,$07,$18
                                                    If (((3.24 > entitydistancesquared(local0\Field82, local1\Field82)) And (local1\Field1 = $00)) <> 0) Then
                                                        local0\Field59 = local1
                                                        local0\Field66 = 2.0
                                                        Return $00
                                                    EndIf
                                            End Select
                                        Next
                                        If (((3.24 > local13) And ((chs\Field8 Lor i_268\Field3) = $00)) <> 0) Then
                                            If (entityvisible(local0\Field82, XZ0260X8X2\Field74, 0.0) <> 0) Then
                                                local0\Field66 = 2.0
                                                Return $00
                                            EndIf
                                        EndIf
                                        local0\Field20 = 35.0
                                    Else
                                        local0\Field20 = (local0\Field20 - fps\Field3[$00])
                                    EndIf
                                Case 2.0
                                    If (((32.0 < local0\Field103) And (174.0 > local0\Field103)) <> 0) Then
                                        animatenpc(local0, 33.0, 174.0, 2.0, $00)
                                        If (173.9 < local0\Field103) Then
                                            setnpcframe(local0, 2.0, $01)
                                        EndIf
                                    Else
                                        If (local0\Field59 = Null) Then
                                            pointentity(local0\Field98, XZ0260X8X2\Field74, 0.0)
                                        Else
                                            pointentity(local0\Field98, local0\Field59\Field82, 0.0)
                                        EndIf
                                        rotateentity(local0\Field82, 0.0, curveangle(entityyaw(local0\Field98, $00, 1.0), entityyaw(local0\Field82, $00, 1.0), 10.0), 0.0, $00)
                                        animatenpc(local0, 2.0, 32.0, 0.3, $00)
                                        If (((5.0 < local0\Field103) And (5.0 >= local21)) <> 0) Then
                                            If (local0\Field59 = Null) Then
                                                If (3.24 > local13) Then
                                                    If (20.0 > (Abs deltayaw(local0\Field82, XZ0260X8X2\Field74))) Then
                                                        If (T8660BZ460\Field10 > $00) Then
                                                            playsound_strict(loadtempsound("SFX\Character\BodyFall.ogg"), $00, $00)
                                                            XZ0260X8X2\Field11 = (XZ0260X8X2\Field11 + rnd(0.5, 0.0))
                                                        Else
                                                            playsound_strict(snd_i\Field50[rand($09, $0A)], $00, $00)
                                                            injureplayer((rnd(0.75, 1.15) * difficultydmgmult), 0.0, 100.0, (0.4 * difficultydmgmult), (0.175 * difficultydmgmult))
                                                            If ((((0.0 < local0\Field34) And (T8660BZ460\Field10 = $00)) And (0.0 = i_009\Field0)) <> 0) Then
                                                                i_009\Field0 = 0.001
                                                            EndIf
                                                            If (3.0 < XZ0260X8X2\Field11) Then
                                                                If (playerroom\Field22\Field21 = $52) Then
                                                                    msg\Field8 = getlocalstring("death", "035.offices")
                                                                Else
                                                                    msg\Field8 = getlocalstring("death", "035.default")
                                                                EndIf
                                                                kill($01, $01, $00, $01)
                                                            EndIf
                                                        EndIf
                                                        XZ0260X8X2\Field1 = ((Float (0.0 = i_1025\Field1[$03])) * 2.0)
                                                    Else
                                                        playsoundex(snd_i\Field49, camera, local0\Field82, 10.0, 1.0, $00, $00)
                                                    EndIf
                                                Else
                                                    playsoundex(snd_i\Field49, camera, local0\Field82, 3.0, 1.0, $00, $00)
                                                EndIf
                                            ElseIf (3.24 > entitydistancesquared(local0\Field82, local0\Field59\Field82)) Then
                                                If (20.0 > (Abs deltayaw(local0\Field82, local0\Field59\Field82))) Then
                                                    playsoundex(snd_i\Field50[rand($09, $0A)], camera, local0\Field82, 10.0, 1.0, $00, $00)
                                                    If (local0\Field59\Field4 > $00) Then
                                                        local0\Field59\Field4 = (Int max(((Float local0\Field59\Field4) - rnd(40.0, 80.0)), 0.0))
                                                    Else
                                                        local0\Field59 = Null
                                                        local0\Field66 = 1.0
                                                        Return $00
                                                    EndIf
                                                Else
                                                    playsoundex(snd_i\Field49, camera, local0\Field82, 10.0, 1.0, $00, $00)
                                                EndIf
                                            Else
                                                playsoundex(snd_i\Field49, camera, local0\Field82, 3.0, 1.0, $00, $00)
                                            EndIf
                                        ElseIf (31.9 < local0\Field103) Then
                                            setnpcframe(local0, 173.0, $01)
                                            local0\Field59 = Null
                                            local0\Field66 = 1.0
                                        EndIf
                                    EndIf
                                    If (local0\Field59 <> Null) Then
                                        If (local0\Field59\Field1 <> 0) Then
                                            local0\Field59 = Null
                                            local0\Field66 = 1.0
                                        EndIf
                                    EndIf
                            End Select
                            If (0.0 <> local0\Field66) Then
                                local0\Field63 = loopsoundex(npcsound[$04], local0\Field63, camera, local0\Field82, 10.0, 1.0, $00)
                            EndIf
                        ElseIf (0.0 <> local0\Field66) Then
                            setnpcframe(local0, 283.0, $01)
                            local0\Field66 = 0.0
                        EndIf
                        If (local0\Field4 <= $00) Then
                            local0\Field1 = $01
                        EndIf
                    Else
                        animatenpc(local0, 515.0, 551.0, 0.15, $00)
                    EndIf
                EndIf
                positionentity(local0\Field98, entityx(local0\Field82, $00, 1.0), entityy(local0\Field82, $00, 1.0), entityz(local0\Field82, $00, 1.0), $00)
                rotateentity(local0\Field98, (entitypitch(local0\Field82, $00, 1.0) - 90.0), (entityyaw(local0\Field82, $00, 1.0) - 180.0), entityroll(local0\Field82, $00, 1.0), $01)
            Case $0C
                If (((forest_event <> Null) And (forest_event\Field19 = playerroom)) <> 0) Then
                    If (20.0 < entityy(XZ0260X8X2\Field74, $00, 1.0)) Then
                        local75 = playerroom\Field13
                        local13 = entitydistancesquared(XZ0260X8X2\Field74, local0\Field82)
                        If (1.0 = forestnpcdata[$02]) Then
                            If (entityhidden(forestnpc) <> 0) Then
                                showentity(forestnpc)
                            EndIf
                            If (0.0 = forestnpcdata[$01]) Then
                                If (rand($C8, $01) = $01) Then
                                    forestnpcdata[$01] = fps\Field3[$00]
                                    entitytexture(forestnpc, forestnpctex, (Int (forestnpcdata[$00] + 1.0)), $00)
                                EndIf
                            ElseIf (((0.0 < forestnpcdata[$01]) And (5.0 > forestnpcdata[$01])) <> 0) Then
                                forestnpcdata[$01] = min((fps\Field3[$00] + forestnpcdata[$01]), 5.0)
                            Else
                                forestnpcdata[$01] = 0.0
                                entitytexture(forestnpc, forestnpctex, (Int forestnpcdata[$00]), $00)
                            EndIf
                            If (1.0 <> local0\Field66) Then
                                If ((((-8.0 > XZ0260X8X2\Field53) And (-12.0 < XZ0260X8X2\Field53)) Lor (entityinview(forestnpc, camera) = $00)) <> 0) Then
                                    forestnpcdata[$02] = 0.0
                                    If (entityhidden(forestnpc) = $00) Then
                                        hideentity(forestnpc)
                                    EndIf
                                EndIf
                            EndIf
                        ElseIf (entityhidden(forestnpc) = $00) Then
                            hideentity(forestnpc)
                        EndIf
                        Select local0\Field66
                            Case 0.0
                                If (entityhidden(local0\Field82) = $00) Then
                                    hideentity(local0\Field82)
                                    hideentity(local0\Field98)
                                    hideentity(local0\Field101)
                                    positionentity(local0\Field82, 0.0, -100.0, 0.0, $00)
                                    local0\Field65 = 0.0
                                EndIf
                            Case 1.0
                                local0\Field70 = 0.0
                                If (-100.0 >= entityy(local0\Field82, $00, 1.0)) Then
                                    tformpoint(entityx(XZ0260X8X2\Field74, $00, 1.0), entityy(XZ0260X8X2\Field74, $00, 1.0), entityz(XZ0260X8X2\Field74, $00, 1.0), $00, local75\Field4)
                                    local16 = floor(((tformedx() + 6.0) / 12.0))
                                    local19 = floor(((tformedz() + 6.0) / 12.0))
                                    local31 = (Int max((local16 - 1.0), 1.0))
                                    local32 = (Int min((local16 + 1.0), 10.0))
                                    local33 = (Int max((local19 - 1.0), 1.0))
                                    local34 = (Int min((local19 + 1.0), 10.0))
                                    For local17 = (Float local31) To (Float local32) Step 2.0
                                        For local20 = (Float local33) To (Float local34) Step 2.0
                                            If (local75\Field5[(Int ((local20 * 10.0) + local17))] = $00) Then
                                                tformpoint((((local17 + local16) / 2.0) * 12.0), 0.0, (((local20 + local19) / 2.0) * 12.0), local75\Field4, $00)
                                                positionentity(local0\Field82, tformedx(), (entityy(local75\Field4, $01, 1.0) + 2.3), tformedz(), $00)
                                                If (entityinview(local0\Field82, camera) <> 0) Then
                                                    positionentity(local0\Field82, 0.0, -110.0, 0.0, $00)
                                                Else
                                                    local17 = 10.0
                                                    Exit
                                                EndIf
                                            EndIf
                                        Next
                                    Next
                                    If (-100.0 < entityy(local0\Field82, $00, 1.0)) Then
                                        playsoundex(TXDBZF46ZXF($04, $00, rand($00, $02)), camera, local0\Field82, 15.0, 0.5, $00, $00)
                                        If (1.0 <> forestnpcdata[$02]) Then
                                            forestnpcdata[$02] = 0.0
                                        EndIf
                                        Select rand($03, $01)
                                            Case $01
                                                pointentity(local0\Field82, XZ0260X8X2\Field74, 0.0)
                                                setnpcframe(local0, 2.0, $01)
                                            Case $02
                                                pointentity(local0\Field82, XZ0260X8X2\Field74, 0.0)
                                                setnpcframe(local0, 201.0, $01)
                                            Case $03
                                                pointentity(local0\Field82, XZ0260X8X2\Field74, 0.0)
                                                turnentity(local0\Field82, 0.0, 90.0, 0.0, $00)
                                                setnpcframe(local0, 299.0, $01)
                                        End Select
                                        local0\Field65 = 0.0
                                    EndIf
                                Else
                                    If (entityhidden(local0\Field98) <> 0) Then
                                        showentity(local0\Field98)
                                        showentity(local0\Field82)
                                    EndIf
                                    positionentity(local0\Field82, entityx(local0\Field82, $00, 1.0), (entityy(local75\Field4, $01, 1.0) + 2.3), entityz(local0\Field82, $00, 1.0), $00)
                                    If (0.0 = forestnpcdata[$02]) Then
                                        local78 = $00
                                        local79 = $00
                                        For local11 = $00 To (maxitemamount - $01) Step $01
                                            If (TX60DB8XBBZ(local11) <> Null) Then
                                                local80 = TX60DB8XBBZ(local11)\Field6\Field19
                                                If ((((local80 = "Log #1") Lor (local80 = "Log #2")) Lor (local80 = "Log #3")) <> 0) Then
                                                    local79 = (local79 + $01)
                                                    local78 = (local78 + ($0A * local79))
                                                EndIf
                                            EndIf
                                        Next
                                        If (rand(($35C - local78), $01) = $01) Then
                                            If (entityhidden(forestnpc) <> 0) Then
                                                showentity(forestnpc)
                                            EndIf
                                            forestnpcdata[$00] = (2.0 - ((Float (rand($02, $01) = $01)) * 2.0))
                                            forestnpcdata[$01] = 0.0
                                            forestnpcdata[$02] = 1.0
                                            positionentity(forestnpc, entityx(local0\Field82, $00, 1.0), (entityy(local0\Field82, $00, 1.0) + 0.5), entityz(local0\Field82, $00, 1.0), $00)
                                            rotateentity(forestnpc, 0.0, entityyaw(local0\Field82, $00, 1.0), 0.0, $00)
                                            moveentity(forestnpc, 0.75, 0.0, 0.0, $00)
                                            rotateentity(forestnpc, 0.0, 0.0, 0.0, $00)
                                            entitytexture(forestnpc, forestnpctex, (Int forestnpcdata[$00]), $00)
                                        Else
                                            forestnpcdata[$02] = 2.0
                                        EndIf
                                    EndIf
                                    If (0.0 = local0\Field65) Then
                                        If (entityinview(local0\Field82, camera) <> 0) Then
                                            If (rand($08, $01) = $01) Then
                                                playsoundex(loadtempsound((("SFX\SCP\860_2\Cancer" + (Str rand($00, $02))) + ".ogg")), camera, local0\Field82, 20.0, 1.0, $01, $00)
                                            EndIf
                                            local0\Field65 = 1.0
                                        EndIf
                                    ElseIf (199.0 >= local0\Field103) Then
                                        animatenpc(local0, 2.0, 199.0, 0.5, $00)
                                        If (199.0 = local0\Field103) Then
                                            playsoundex(TXDBZF46ZXF($04, $00, rand($00, $02)), camera, local0\Field82, 15.0, 1.0, $00, $00)
                                            setnpcframe(local0, 298.0, $01)
                                        EndIf
                                    ElseIf (297.0 >= local0\Field103) Then
                                        pointentity(local0\Field82, XZ0260X8X2\Field74, 0.0)
                                        animatenpc(local0, 200.0, 297.0, 0.5, $00)
                                        If (297.0 = local0\Field103) Then
                                            playsoundex(TXDBZF46ZXF($04, $00, rand($00, $02)), camera, local0\Field82, 15.0, 1.0, $00, $00)
                                            setnpcframe(local0, 298.0, $01)
                                        EndIf
                                    Else
                                        local15 = curveangle(pointdirection(entityx(local0\Field82, $00, 1.0), entityz(local0\Field82, $00, 1.0), entityx(XZ0260X8X2\Field74, $00, 1.0), entityz(XZ0260X8X2\Field74, $00, 1.0)), (entityyaw(local0\Field82, $00, 1.0) + 90.0), 20.0)
                                        rotateentity(local0\Field82, 0.0, (local15 - 90.0), 0.0, $01)
                                        animatenpc(local0, 298.0, 316.0, (local0\Field64 * 10.0), $01)
                                        local0\Field64 = curvevalue(local0\Field32, local0\Field64, 10.0)
                                        moveentity(local0\Field82, 0.0, 0.0, (local0\Field64 * fps\Field3[$00]), $00)
                                        If (225.0 < local13) Then
                                            local0\Field66 = 0.0
                                        EndIf
                                    EndIf
                                EndIf
                                resetentity(local0\Field82)
                            Case 2.0
                                If (entityhidden(local0\Field98) <> 0) Then
                                    showentity(local0\Field98)
                                    showentity(local0\Field82)
                                EndIf
                                local21 = local0\Field103
                                If (-100.0 >= entityy(local0\Field82, $00, 1.0)) Then
                                    tformpoint(entityx(XZ0260X8X2\Field74, $00, 1.0), entityy(XZ0260X8X2\Field74, $00, 1.0), entityz(XZ0260X8X2\Field74, $00, 1.0), $00, local75\Field4)
                                    local16 = floor(((tformedx() + 6.0) / 12.0))
                                    local19 = floor(((tformedz() + 6.0) / 12.0))
                                    local31 = (Int max((local16 - 1.0), 1.0))
                                    local32 = (Int min((local16 + 1.0), 10.0))
                                    local33 = (Int max((local19 - 1.0), 1.0))
                                    local34 = (Int min((local19 + 1.0), 10.0))
                                    For local17 = (Float local31) To (Float local32) Step 1.0
                                        For local20 = (Float local33) To (Float local34) Step 1.0
                                            If ((((local75\Field5[(Int ((local20 * 10.0) + local17))] > $00) And ((local16 <> local17) Lor (local19 <> local20))) And ((local16 = local17) Lor (local19 = local20))) <> 0) Then
                                                tformpoint((local17 * 12.0), 0.0, (local20 * 12.0), local75\Field4, $00)
                                                positionentity(local0\Field82, tformedx(), (entityy(local75\Field4, $01, 1.0) + 1.0), tformedz(), $00)
                                                If (entityinview(local0\Field82, camera) <> 0) Then
                                                    XZ0260X8X2\Field53 = -10.0
                                                Else
                                                    local17 = 10.0
                                                    Exit
                                                EndIf
                                            EndIf
                                        Next
                                    Next
                                Else
                                    local15 = curveangle(find860angle(local0, local75), (entityyaw(local0\Field82, $00, 1.0) + 90.0), 80.0)
                                    rotateentity(local0\Field82, 0.0, (local15 - 90.0), 0.0, $01)
                                    local0\Field64 = curvevalue((local0\Field32 * 0.3), local0\Field64, 50.0)
                                    moveentity(local0\Field82, 0.0, 0.0, (local0\Field64 * fps\Field3[$00]), $00)
                                    animatenpc(local0, 494.0, 569.0, (local0\Field64 * 25.0), $01)
                                    If (0.0 = local0\Field65) Then
                                        If (64.0 > local13) Then
                                            If (entityinview(local0\Field82, camera) <> 0) Then
                                                If (rand($08, $01) = $01) Then
                                                    playsound_strict(loadtempsound((("SFX\SCP\860_2\Chase" + (Str rand($00, $01))) + ".ogg")), $00, $00)
                                                    playsoundex(loadtempsound((("SFX\SCP\860_2\Cancer" + (Str rand($00, $02))) + ".ogg")), camera, local0\Field82, 10.0, 1.0, $01, $00)
                                                EndIf
                                                local0\Field65 = 1.0
                                            EndIf
                                        EndIf
                                    EndIf
                                    If (0.03 < XZ0260X8X2\Field76) Then
                                        local0\Field57 = (local0\Field57 + fps\Field3[$00])
                                        If (local0\Field57 > rnd(5000.0, 0.0)) Then
                                            local38 = $01
                                            If (ChannelPlaying(local0\Field63) <> 0) Then
                                                local38 = $00
                                            EndIf
                                            If (local38 <> 0) Then
                                                local0\Field63 = playsoundex(loadtempsound((("SFX\SCP\860_2\Cancer" + (Str rand($00, $02))) + ".ogg")), camera, local0\Field82, 10.0, 1.0, $01, $00)
                                            EndIf
                                        EndIf
                                    Else
                                        local0\Field57 = max((local0\Field57 - fps\Field3[$00]), 0.0)
                                    EndIf
                                    If (((20.25 > local13) Lor (rnd(200.0, 250.0) < local0\Field57)) <> 0) Then
                                        If ((chs\Field8 Lor i_268\Field3) = $00) Then
                                            local0\Field63 = playsoundex(loadtempsound((("SFX\SCP\860_2\Cancer" + (Str rand($03, $05))) + ".ogg")), camera, local0\Field82, 10.0, 1.0, $01, $00)
                                            local0\Field66 = 3.0
                                        ElseIf ((((492.0 > local21) And (492.0 <= local0\Field103)) Lor ((568.0 > local21) And (568.0 <= local0\Field103))) <> 0) Then
                                            setnpcframe(local0, 2.0, $01)
                                            local0\Field66 = 4.0
                                        EndIf
                                    EndIf
                                    If (400.0 < local13) Then
                                        local0\Field66 = 0.0
                                    EndIf
                                EndIf
                                If ((((533.0 > local21) And (533.0 <= local0\Field103)) Lor ((568.0 > local21) And (568.0 <= local0\Field103))) <> 0) Then
                                    playsoundex(TXDBZF46ZXF($04, $00, rand($00, $02)), camera, local0\Field82, 15.0, 0.6, $00, $00)
                                EndIf
                            Case 3.0
                                If (entityhidden(local0\Field98) <> 0) Then
                                    showentity(local0\Field98)
                                    showentity(local0\Field82)
                                EndIf
                                local21 = local0\Field103
                                local0\Field17 = (Int max(0.0, ((Float local0\Field17) - fps\Field3[$00])))
                                local15 = curveangle((find860angle(local0, local75) + ((Float (0.0 < (Float local0\Field17))) * 180.0)), (entityyaw(local0\Field82, $00, 1.0) + 90.0), 30.0)
                                rotateentity(local0\Field82, 0.0, (local15 - 90.0), 0.0, $01)
                                If ((((1.0 > local13) Lor ((451.0 < local0\Field103) And (493.0 > local0\Field103))) Lor (Int XZ0260X8X2\Field48)) <> 0) Then
                                    msg\Field8 = format(getlocalstring("death", "860"), subjectname, "%s")
                                    local0\Field64 = curvevalue(0.0, local0\Field64, 5.0)
                                    animatenpc(local0, 451.0, 493.0, 0.5, $00)
                                    If (((461.0 > local21) And (461.0 <= local0\Field103)) <> 0) Then
                                        playsound_strict(snd_i\Field50[$0B], $00, $00)
                                        XZ0260X8X2\Field1 = ((Float (0.0 = i_1025\Field1[$03])) * 2.0)
                                        kill($01, $01, $00, $01)
                                    EndIf
                                    If ((((476.0 > local21) And (476.0 <= local0\Field103)) Lor ((486.0 > local21) And (486.0 <= local0\Field103))) <> 0) Then
                                        playsound_strict(snd_i\Field50[$0C], $00, $00)
                                    EndIf
                                Else
                                    local0\Field64 = curvevalue((local0\Field32 * 0.8), local0\Field64, 10.0)
                                    animatenpc(local0, 298.0, 316.0, (local0\Field64 * 10.0), $01)
                                    If (((307.0 > local21) And (307.0 <= local0\Field103)) <> 0) Then
                                        playsoundex(TXDBZF46ZXF($04, $00, rand($00, $02)), camera, local0\Field82, 10.0, 1.0, $00, $00)
                                    EndIf
                                EndIf
                                moveentity(local0\Field82, 0.0, 0.0, (local0\Field64 * fps\Field3[$00]), $00)
                                If ((chs\Field8 Lor i_268\Field3) <> 0) Then
                                    If ((((315.0 > local21) And (315.0 <= local0\Field103)) Lor ((492.0 > local21) And (492.0 <= local0\Field103))) <> 0) Then
                                        setnpcframe(local0, 2.0, $01)
                                        local0\Field66 = 4.0
                                    EndIf
                                EndIf
                            Case 4.0
                                local0\Field64 = 0.0
                                animatenpc(local0, 2.0, 199.0, 0.5, $01)
                                If ((chs\Field8 Lor i_268\Field3) = $00) Then
                                    local0\Field66 = 3.0
                                EndIf
                        End Select
                        If (0.0 <> local0\Field66) Then
                            rotateentity(local0\Field82, 0.0, entityyaw(local0\Field82, $00, 1.0), 0.0, $01)
                            positionentity(local0\Field98, entityx(local0\Field82, $00, 1.0), (entityy(local0\Field82, $00, 1.0) - local0\Field23), entityz(local0\Field82, $00, 1.0), $00)
                            rotateentity(local0\Field98, (entitypitch(local0\Field82, $00, 1.0) - 90.0), entityyaw(local0\Field82, $00, 1.0), entityroll(local0\Field82, $00, 1.0), $01)
                            If (64.0 < local13) Then
                                If (entityhidden(local0\Field101) <> 0) Then
                                    showentity(local0\Field101)
                                EndIf
                                entityalpha(local0\Field101, min((sqr(local13) - 8.0), 1.0))
                                positionentity(local0\Field101, entityx(local0\Field98, $00, 1.0), entityy(local0\Field98, $00, 1.0), entityz(local0\Field98, $00, 1.0), $00)
                                rotateentity(local0\Field101, 0.0, (entityyaw(local0\Field82, $00, 1.0) - 180.0), 0.0, $00)
                                moveentity(local0\Field101, 0.0, 0.75, -0.825, $00)
                                local26 = createpivot($00)
                                positionentity(local26, entityx(camera, $00, 1.0), entityy(camera, $00, 1.0), entityz(camera, $00, 1.0), $00)
                                pointentity(local26, local0\Field101, 0.0)
                                moveentity(local26, 0.0, 0.0, 8.0, $00)
                                positionentity(local0\Field101, entityx(local26, $00, 1.0), entityy(local26, $00, 1.0), entityz(local26, $00, 1.0), $00)
                                freeentity(local26)
                                local26 = $00
                            ElseIf (entityhidden(local0\Field101) = $00) Then
                                hideentity(local0\Field101)
                            EndIf
                        EndIf
                    EndIf
                EndIf
            Case $0D
                If (playerroom\Field22\Field21 <> $20) Then
                    local0\Field66 = 66.0
                EndIf
                If (66.0 > local0\Field66) Then
                    local21 = local0\Field103
                    Select local0\Field66
                        Case 1.0
                            If (1492.0 > local0\Field103) Then
                                animatenpc(local0, min(animtime(local0\Field98), 1443.0), 1492.0, 0.32, $00)
                                If (((1455.0 > local21) And (1455.0 <= local0\Field103)) <> 0) Then
                                    playsoundex(snd_i\Field51[rand($03, $06)], camera, local0\Field82, 10.0, 1.0, $00, $00)
                                EndIf
                                If (((1460.0 > local21) And (1460.0 <= local0\Field103)) <> 0) Then
                                    playsoundex(snd_i\Field51[rand($03, $06)], camera, local0\Field82, 10.0, 1.0, $00, $00)
                                    loadnpcsound(local0, (((("SFX\SCP\939\" + (Str (local0\Field56 Mod $03))) + "Alert") + (Str rand($00, $02))) + ".ogg"), $00)
                                    local0\Field63 = playsoundex(local0\Field55, camera, local0\Field82, 10.0, 1.0, $01, $00)
                                EndIf
                            ElseIf (2072.0 > local0\Field103) Then
                                animatenpc(local0, 1493.0, 1580.0, 0.25, $01)
                                local0\Field57 = max((local0\Field57 - fps\Field3[$00]), 0.0)
                                If (((1579.9 < local0\Field103) And (0.0 >= local0\Field57)) <> 0) Then
                                    setnpcframe(local0, 2072.0, $01)
                                EndIf
                            Else
                                animatenpc(local0, 2072.0, 2090.0, 0.32, $00)
                                If (2089.9 < local0\Field103) Then
                                    setnpcframe(local0, 770.0, $01)
                                    local0\Field66 = 2.0
                                EndIf
                            EndIf
                        Case 2.0
                            local0\Field65 = max(local0\Field65, (Float (local0\Field13 - $03)))
                            local13 = entitydistancesquared(local0\Field82, playerroom\Field27[(Int local0\Field65)])
                            pointentity(local0\Field98, playerroom\Field27[(Int local0\Field65)], 0.0)
                            rotateentity(local0\Field82, 0.0, curveangle(entityyaw(local0\Field98, $00, 1.0), entityyaw(local0\Field82, $00, 1.0), 30.0), 0.0, $00)
                            If (0.18 > local13) Then
                                local0\Field64 = curvevalue(0.0, local0\Field64, 30.0)
                                If (770.0 < local0\Field103) Then
                                    animatenpc(local0, min(animtime(local0\Field98), 826.0), 851.0, 0.34, $00)
                                    If ((((((789.0 > local21) And (789.0 <= local0\Field103)) Lor ((809.0 > local21) And (809.0 <= local0\Field103))) Lor ((828.0 > local21) And (828.0 <= local0\Field103))) Lor ((845.0 > local21) And (845.0 <= local0\Field103))) <> 0) Then
                                        playsoundex(snd_i\Field51[rand($03, $06)], camera, local0\Field82, 12.0, 1.0, $00, $00)
                                    EndIf
                                    If (850.9 < local0\Field103) Then
                                        local0\Field38 = (Float rand($03, $01))
                                        Select local0\Field38
                                            Case 1.0
                                                setnpcframe(local0, 11.0, $01)
                                            Case 2.0
                                                setnpcframe(local0, 191.0, $01)
                                            Case 3.0
                                                setnpcframe(local0, 397.0, $01)
                                        End Select
                                    EndIf
                                Else
                                    local38 = $00
                                    Select local0\Field38
                                        Case 1.0
                                            animatenpc(local0, 11.0, 190.0, 0.25, $00)
                                            If ((((((98.0 > local21) And (98.0 <= local0\Field103)) Lor ((135.0 > local21) And (135.0 <= local0\Field103))) Lor ((180.0 > local21) And (180.0 <= local0\Field103))) Lor ((187.0 > local21) And (187.0 <= local0\Field103))) <> 0) Then
                                                playsoundex(snd_i\Field51[rand($03, $06)], camera, local0\Field82, 10.0, 1.0, $00, $00)
                                            EndIf
                                            If (189.9 < local0\Field103) Then
                                                local38 = $01
                                            EndIf
                                        Case 2.0
                                            animatenpc(local0, 191.0, 396.0, 0.25, $00)
                                            If ((((((208.0 > local21) And (208.0 <= local0\Field103)) Lor ((280.0 > local21) And (280.0 <= local0\Field103))) Lor ((298.0 > local21) And (298.0 <= local0\Field103))) Lor ((340.0 > local21) And (340.0 <= local0\Field103))) <> 0) Then
                                                playsoundex(snd_i\Field51[rand($03, $06)], camera, local0\Field82, 10.0, 1.0, $00, $00)
                                            EndIf
                                            If (395.9 < local0\Field103) Then
                                                local38 = $01
                                            EndIf
                                        Case 3.0
                                            animatenpc(local0, 397.0, 556.0, 0.25, $00)
                                            If ((((470.0 > local21) And (470.0 <= local0\Field103)) Lor ((550.0 > local21) And (550.0 <= local0\Field103))) <> 0) Then
                                                playsoundex(snd_i\Field51[rand($03, $06)], camera, local0\Field82, 10.0, 1.0, $00, $00)
                                            EndIf
                                            If (555.9 < local0\Field103) Then
                                                local38 = $01
                                            EndIf
                                    End Select
                                    If (local38 <> 0) Then
                                        local0\Field65 = (local0\Field65 + 1.0)
                                        If ((Float local0\Field13) < local0\Field65) Then
                                            local0\Field65 = (Float (local0\Field13 - $03))
                                        EndIf
                                        setnpcframe(local0, 770.0, $01)
                                    EndIf
                                    local0\Field17 = $00
                                EndIf
                            Else
                                local0\Field64 = curvevalue(((local0\Field32 * 0.3) * min(sqr(local13), 1.0)), local0\Field64, 10.0)
                                If (785.0 > local0\Field103) Then
                                    animatenpc(local0, 770.0, 785.0, 0.34, $00)
                                Else
                                    animatenpc(local0, 786.0, 825.0, (local0\Field64 * 28.0), $01)
                                    If ((((789.0 > local21) And (789.0 <= local0\Field103)) Lor ((809.0 > local21) And (809.0 <= local0\Field103))) <> 0) Then
                                        playsoundex(snd_i\Field51[rand($03, $06)], camera, local0\Field82, 12.0, 1.0, $00, $00)
                                        If (rand($0A, $01) = $01) Then
                                            If (((local0\Field63 = $00) Lor (ChannelPlaying(local0\Field63) = $00)) <> 0) Then
                                                loadnpcsound(local0, (((("SFX\SCP\939\" + (Str (local0\Field56 Mod $03))) + "Lure") + (Str rand($00, $09))) + ".ogg"), $00)
                                                local0\Field63 = playsoundex(local0\Field55, camera, local0\Field82, 10.0, 1.0, $01, $00)
                                            EndIf
                                        EndIf
                                    EndIf
                                EndIf
                            EndIf
                            moveentity(local0\Field82, 0.0, 0.0, (local0\Field64 * fps\Field3[$00]), $00)
                        Case 3.0
                            local0\Field17 = (Int max(((Float local0\Field17) - fps\Field3[$00]), 0.0))
                            local23 = entityvisible(XZ0260X8X2\Field74, local0\Field82, 0.0)
                            If (local23 <> 0) Then
                                local0\Field60 = entityx(XZ0260X8X2\Field74, $00, 1.0)
                                local0\Field74 = entityz(XZ0260X8X2\Field74, $00, 1.0)
                                local0\Field17 = $69
                            EndIf
                            If (((0.0 < (Float local0\Field17)) And (((chs\Field8 Lor i_268\Field3) Lor (Int XZ0260X8X2\Field48)) = $00)) <> 0) Then
                                If (0.0 = local0\Field57) Then
                                    If (859.0 > local0\Field103) Then
                                        local0\Field64 = curvevalue(local0\Field32, local0\Field64, 15.0)
                                        animatenpc(local0, 852.0, 859.0, 0.34, $00)
                                    Else
                                        local0\Field64 = curvevalue(local0\Field32, local0\Field64, 15.0)
                                        animatenpc(local0, 860.0, 876.0, (local0\Field64 * 10.0), $01)
                                    EndIf
                                    If (((866.0 > local21) And (866.0 <= local0\Field103)) <> 0) Then
                                        playsoundex(TXDBZF46ZXF($01, $01, rand($00, $07)), camera, local0\Field82, 12.0, 1.0, $00, $00)
                                    EndIf
                                Else
                                    If (1591.0 > local0\Field103) Then
                                        local0\Field64 = curvevalue(local0\Field32, local0\Field64, 15.0)
                                        animatenpc(local0, 1581.0, 1591.0, 0.34, $00)
                                    Else
                                        local0\Field64 = curvevalue(local0\Field32, local0\Field64, 15.0)
                                        animatenpc(local0, 1592.0, 1607.0, (local0\Field64 * 10.0), $01)
                                    EndIf
                                    If ((((1594.0 > local21) And (1594.0 <= local0\Field103)) Lor ((1603.0 > local21) And (1603.0 <= local0\Field103))) <> 0) Then
                                        playsoundex(TXDBZF46ZXF($01, $01, rand($00, $07)), camera, local0\Field82, 12.0, 1.0, $00, $00)
                                    EndIf
                                EndIf
                                rotateentity(local0\Field82, 0.0, curveangle(vectoryaw((local0\Field60 - entityx(local0\Field82, $00, 1.0)), 0.0, (local0\Field74 - entityz(local0\Field82, $00, 1.0))), entityyaw(local0\Field82, $00, 1.0), (10.0 - (Float selecteddifficulty\Field8))), 0.0, $00)
                                moveentity(local0\Field82, 0.0, 0.0, (local0\Field64 * fps\Field3[$00]), $00)
                                If (((0.64 > distancesquared(local0\Field60, entityx(local0\Field82, $00, 1.0), local0\Field74, entityz(local0\Field82, $00, 1.0), 0.0, 0.0)) And local23) <> 0) Then
                                    If (0.0 = local0\Field57) Then
                                        local0\Field38 = (Float rand($04, $01))
                                        Select local0\Field38
                                            Case 1.0
                                                setnpcframe(local0, 911.0, $01)
                                            Case 2.0
                                                setnpcframe(local0, 940.0, $01)
                                            Case 3.0
                                                setnpcframe(local0, 970.0, $01)
                                            Case 4.0
                                                setnpcframe(local0, 999.0, $01)
                                        End Select
                                    Else
                                        local0\Field38 = (Float rand($02, $01))
                                        Select local0\Field38
                                            Case 1.0
                                                setnpcframe(local0, 1666.0, $01)
                                            Case 2.0
                                                setnpcframe(local0, 1711.0, $01)
                                        End Select
                                    EndIf
                                    local0\Field66 = 4.0
                                    Return $00
                                EndIf
                            Else
                                local0\Field66 = (2.0 - (Float (0.0 < local0\Field57)))
                            EndIf
                        Case 4.0
                            local0\Field64 = curvevalue(0.0, local0\Field64, 5.0)
                            local0\Field60 = entityx(XZ0260X8X2\Field74, $00, 1.0)
                            local0\Field74 = entityz(XZ0260X8X2\Field74, $00, 1.0)
                            rotateentity(local0\Field82, 0.0, curveangle(vectoryaw((local0\Field60 - entityx(local0\Field82, $00, 1.0)), 0.0, (local0\Field74 - entityz(local0\Field82, $00, 1.0))), entityyaw(local0\Field82, $00, 1.0), (10.0 - (Float selecteddifficulty\Field8))), 0.0, $00)
                            local38 = $00
                            If (0.0 = local0\Field57) Then
                                Select local0\Field38
                                    Case 1.0
                                        animatenpc(local0, 911.0, 939.0, 0.42, $00)
                                        local38 = ((923.0 <= local0\Field103) And (923.0 > local21))
                                        If (938.9 < local0\Field103) Then
                                            setnpcframe(local0, 852.0, $01)
                                            local0\Field66 = 3.0
                                            Return $00
                                        EndIf
                                    Case 2.0
                                        animatenpc(local0, 940.0, 969.0, 0.42, $00)
                                        local38 = ((952.0 <= local0\Field103) And (952.0 > local21))
                                        If (968.9 < local0\Field103) Then
                                            setnpcframe(local0, 852.0, $01)
                                            local0\Field66 = 3.0
                                            Return $00
                                        EndIf
                                    Case 3.0
                                        animatenpc(local0, 970.0, 998.0, 0.38, $00)
                                        local38 = ((978.0 <= local0\Field103) And (978.0 > local21))
                                        If (997.9 < local0\Field103) Then
                                            setnpcframe(local0, 852.0, $01)
                                            local0\Field66 = 3.0
                                            Return $00
                                        EndIf
                                    Case 4.0
                                        animatenpc(local0, 999.0, 1025.0, 0.38, $00)
                                        local38 = ((1009.0 <= local0\Field103) And (1009.0 > local21))
                                        If (1024.9 < local0\Field103) Then
                                            setnpcframe(local0, 852.0, $01)
                                            local0\Field66 = 3.0
                                            Return $00
                                        EndIf
                                End Select
                            Else
                                Select local0\Field38
                                    Case 1.0
                                        animatenpc(local0, 1666.0, 1710.0, 0.4, $00)
                                        local38 = ((((1676.0 <= local0\Field103) And (1676.0 > local21)) Lor ((1686.0 <= local0\Field103) And (1686.0 > local21))) Lor ((1698.0 <= local0\Field103) And (1698.0 > local21)))
                                        If (1709.9 < local0\Field103) Then
                                            setnpcframe(local0, 852.0, $01)
                                            local0\Field66 = 3.0
                                            Return $00
                                        EndIf
                                    Case 2.0
                                        animatenpc(local0, 1711.0, 1752.0, 0.4, $00)
                                        local38 = ((((1717.0 <= local0\Field103) And (1717.0 > local21)) Lor ((1727.0 <= local0\Field103) And (1727.0 > local21))) Lor ((1739.0 <= local0\Field103) And (1739.0 > local21)))
                                        If (1751.9 < local0\Field103) Then
                                            setnpcframe(local0, 852.0, $01)
                                            local0\Field66 = 3.0
                                            Return $00
                                        EndIf
                                End Select
                            EndIf
                            If (local38 <> 0) Then
                                If (2.25 > entitydistancesquared(XZ0260X8X2\Field74, local0\Field82)) Then
                                    playsound_strict(snd_i\Field50[$0B], $00, $00)
                                    injureplayer(rnd(1.5, 2.5), 0.0, 500.0, rnd(0.5, 0.8), 0.0)
                                    XZ0260X8X2\Field1 = ((Float (0.0 = i_1025\Field1[$03])) * 2.0)
                                    If (4.0 < XZ0260X8X2\Field11) Then
                                        msg\Field8 = getlocalstring("death", "939")
                                        kill($01, $01, $00, $01)
                                    EndIf
                                Else
                                    playsoundex(snd_i\Field49, camera, local0\Field82, 10.0, 1.0, $00, $00)
                                EndIf
                            EndIf
                        Case 5.0
                            If (0.0 = local0\Field57) Then
                                local88 = ((Float (2.0 = local0\Field38)) * 100.0)
                                animatenpc(local0, (570.0 + local88), (669.0 + local88), 0.25, $00)
                                If ((668.9 + local88) < local0\Field103) Then
                                    local0\Field66 = 2.0
                                EndIf
                            ElseIf (0.0 = local0\Field38) Then
                                animatenpc(local0, 1493.0, 1466.0, -0.25, $00)
                                If (1466.1 > local0\Field103) Then
                                    local0\Field38 = 1.0
                                EndIf
                            Else
                                animatenpc(local0, 1466.0, 1493.0, 0.25, $00)
                                If (1492.9 < local0\Field103) Then
                                    local0\Field38 = 0.0
                                    local0\Field66 = 1.0
                                EndIf
                            EndIf
                    End Select
                    If ((((49.0 > entitydistancesquared(local0\Field82, XZ0260X8X2\Field74)) And entityvisible(XZ0260X8X2\Field74, local0\Field82, 0.0)) And entityinview(local0\Field82, camera)) <> 0) Then
                        giveachievement("939", $01)
                    EndIf
                    If (((3.0 > local0\Field66) And (((chs\Field8 Lor i_268\Field3) Lor (Int XZ0260X8X2\Field48)) = $00)) <> 0) Then
                        local23 = entityvisible(XZ0260X8X2\Field74, local0\Field82, 0.0)
                        local13 = (entitydistancesquared(local0\Field82, XZ0260X8X2\Field74) + ((Float (local23 = $00)) * 4.0))
                        If (((2.25 > local13) Lor ((local13 < (XZ0260X8X2\Field68 * XZ0260X8X2\Field68)) And local23)) <> 0) Then
                            If (3.0 <> local0\Field66) Then
                                playsound_strict(loadtempsound("SFX\SCP\939\Horror.ogg"), $00, $00)
                                loadnpcsound(local0, (((("SFX\SCP\939\" + (Str (local0\Field56 Mod $03))) + "Attack") + (Str rand($00, $02))) + ".ogg"), $00)
                                local0\Field63 = playsoundex(local0\Field55, camera, local0\Field82, 10.0, 1.0, $01, $00)
                                giveachievement("939", $01)
                                local0\Field66 = 3.0
                            EndIf
                        ElseIf (local13 < ((XZ0260X8X2\Field68 * 1.4) * (XZ0260X8X2\Field68 * 1.4))) Then
                            If (1.0 <> local0\Field66) Then
                                setnpcframe(local0, 1443.0, $01)
                                local0\Field57 = 280.0
                                giveachievement("939", $01)
                                local0\Field66 = 1.0
                            EndIf
                        EndIf
                    EndIf
                    rotateentity(local0\Field82, 0.0, entityyaw(local0\Field82, $00, 1.0), 0.0, $01)
                    positionentity(local0\Field98, entityx(local0\Field82, $00, 1.0), (entityy(local0\Field82, $00, 1.0) - local0\Field23), entityz(local0\Field82, $00, 1.0), $00)
                    rotateentity(local0\Field98, entitypitch(local0\Field82, $00, 1.0), entityyaw(local0\Field82, $00, 1.0), entityroll(local0\Field82, $00, 1.0), $01)
                EndIf
            Case $05
                If (66.0 <> local0\Field66) Then
                    If (1.0 = local0\Field31) Then
                        If (ChannelPlaying(local0\Field63) <> 0) Then
                            StopChannel(local0\Field63)
                            local0\Field63 = $00
                        EndIf
                        If (ChannelPlaying(local0\Field6) <> 0) Then
                            StopChannel(local0\Field6)
                            local0\Field6 = $00
                        EndIf
                        local0\Field70 = 0.0
                    Else
                        local13 = entitydistancesquared(local0\Field82, XZ0260X8X2\Field74)
                        Select local0\Field66
                            Case 0.0
                                If (400.0 < local13) Then
                                    animatenpc(local0, 451.0, 612.0, 0.2, $01)
                                    If ((Float millisecs()) > local0\Field65) Then
                                        For local6 = Each waypoints
                                            If (local6\Field7 = Null) Then
                                                If (16.0 > distancesquared(entityx(local6\Field0, $01, 1.0), entityx(local0\Field82, $00, 1.0), entityz(local6\Field0, $01, 1.0), entityz(local0\Field82, $00, 1.0), 0.0, 0.0)) Then
                                                    positionentity(local0\Field82, entityx(local6\Field0, $01, 1.0), (entityy(local6\Field0, $01, 1.0) + (1.0 / 1.28)), entityz(local6\Field0, $01, 1.0), $00)
                                                    resetentity(local0\Field82)
                                                    local0\Field90 = local6\Field9
                                                    Exit
                                                EndIf
                                            EndIf
                                        Next
                                        local0\Field65 = (Float (millisecs() + $1388))
                                    EndIf
                                ElseIf (64.0 > local13) Then
                                    local0\Field38 = rnd(1.0, 2.5)
                                    local0\Field66 = 1.0
                                EndIf
                            Case 1.0
                                If (451.0 > local0\Field103) Then
                                    local15 = wrapangle(curveangle((deltayaw(local0\Field82, XZ0260X8X2\Field74) - 180.0), ((animtime(local0\Field98) - 2.0) / 1.2445), 15.0), 360.0)
                                    setnpcframe(local0, ((local15 * 1.2445) + 2.0), $01)
                                Else
                                    animatenpc(local0, 636.0, 646.0, 0.4, $00)
                                    If (646.0 = local0\Field103) Then
                                        setnpcframe(local0, 2.0, $01)
                                    EndIf
                                EndIf
                                If (rand($2BC, $01) = $01) Then
                                    playsoundex(loadtempsound((("SFX\SCP\066\Eric" + (Str rand($00, $02))) + ".ogg")), camera, local0\Field82, 8.0, 1.0, $01, $00)
                                EndIf
                                If (local13 < ((local0\Field38 * local0\Field38) + 1.0)) Then
                                    If (entityvisible(XZ0260X8X2\Field74, local0\Field82, 0.0) <> 0) Then
                                        giveachievement("066", $01)
                                        local0\Field66 = (Float rand($02, $03))
                                    EndIf
                                EndIf
                            Case 2.0
                                If (647.0 > local0\Field103) Then
                                    local15 = curveangle(0.0, ((animtime(local0\Field98) - 2.0) / 1.2445), 5.0)
                                    If (((5.0 > local15) Lor (355.0 < local15)) <> 0) Then
                                        setnpcframe(local0, 647.0, $01)
                                    Else
                                        setnpcframe(local0, ((local15 * 1.2445) + 2.0), $01)
                                    EndIf
                                ElseIf (683.0 = local0\Field103) Then
                                    If (0.0 = local0\Field65) Then
                                        If (rand($02, $01) = $01) Then
                                            playsoundex(loadtempsound((("SFX\SCP\066\Eric" + (Str rand($00, $02))) + ".ogg")), camera, local0\Field82, 8.0, 1.0, $01, $00)
                                        Else
                                            playsoundex(loadtempsound((("SFX\SCP\066\Notes" + (Str rand($00, $05))) + ".ogg")), camera, local0\Field82, 8.0, 1.0, $00, $00)
                                        EndIf
                                        If ((chs\Field8 Lor i_268\Field3) = $00) Then
                                            Select rand($06, $01)
                                                Case $01
                                                    playsound_strict(loadtempsound("SFX\SCP\066\Beethoven.ogg"), $00, $00)
                                                    GUESSEDupdategui(((((Float selecteddifficulty\Field8) * 15.0) + 45.0) * 70.0))
                                                    XZ0260X8X2\Field14 = 10.0
                                                Case $02
                                                    local0\Field57 = (Float rand($2BC, $578))
                                                Case $03
                                                    For local2 = Each doors
                                                        If (256.0 > entitydistancesquared(local2\Field51, local0\Field82)) Then
                                                            If (((((local2\Field21 = $00) And (local2\Field44 = $00)) And (local2\Field52 = $00)) And (local2\Field28 = $00)) <> 0) Then
                                                                openclosedoor(local2, $01, $00)
                                                            EndIf
                                                        EndIf
                                                    Next
                                                Case $04
                                                    If (playerroom\Field22\Field20 < $02) Then
                                                        local3 = createdecal($01, entityx(local0\Field82, $00, 1.0), 0.005, entityz(local0\Field82, $00, 1.0), 90.0, rnd(360.0, 0.0), 0.0, 0.3, 1.0, $00, $01, $00, $00, $00)
                                                        local3\Field5 = -0.0001
                                                        entityparent(local3\Field0, playerroom\Field15, $01)
                                                    EndIf
                                                    XZ0260X8X2\Field14 = 5.0
                                                    playsound_strict(loadtempsound("SFX\Character\BodyFall.ogg"), $00, $00)
                                                    If (0.64 > distancesquared(entityx(XZ0260X8X2\Field74, $00, 1.0), entityx(local0\Field82, $00, 1.0), entityz(XZ0260X8X2\Field74, $00, 1.0), entityz(local0\Field82, $00, 1.0), 0.0, 0.0)) Then
                                                        injureplayer(rnd(0.2, 0.4), 0.0, 200.0, 0.0, 0.0)
                                                    EndIf
                                                Case $05,$06
                                            End Select
                                        EndIf
                                    EndIf
                                    local0\Field65 = (local0\Field65 + fps\Field3[$00])
                                    If (70.0 < local0\Field65) Then
                                        local0\Field65 = 0.0
                                        local0\Field66 = 3.0
                                    EndIf
                                Else
                                    local0\Field64 = curvevalue((local0\Field32 * 1.5), local0\Field64, 10.0)
                                    pointentity(local0\Field98, XZ0260X8X2\Field74, 0.0)
                                    rotateentity(local0\Field82, 0.0, curveangle((entityyaw(local0\Field98, $00, 1.0) - 180.0), entityyaw(local0\Field82, $00, 1.0), 10.0), 0.0, $00)
                                    animatenpc(local0, 647.0, 683.0, (local0\Field64 * 25.0), $00)
                                    moveentity(local0\Field82, 0.0, 0.0, ((- local0\Field64) * fps\Field3[$00]), $00)
                                EndIf
                            Case 3.0
                                pointentity(local0\Field98, XZ0260X8X2\Field74, 0.0)
                                local15 = curveangle(((entityyaw(local0\Field98, $00, 1.0) + local0\Field84) - 180.0), entityyaw(local0\Field82, $00, 1.0), 10.0)
                                rotateentity(local0\Field82, 0.0, local15, 0.0, $00)
                                local0\Field64 = curvevalue(local0\Field32, local0\Field64, 10.0)
                                moveentity(local0\Field82, 0.0, 0.0, (local0\Field64 * fps\Field3[$00]), $00)
                                If (rand($64, $01) = $01) Then
                                    local0\Field84 = rnd(-20.0, 20.0)
                                EndIf
                                local0\Field65 = (local0\Field65 + fps\Field3[$00])
                                If (250.0 < local0\Field65) Then
                                    animatenpc(local0, 684.0, 647.0, ((- local0\Field64) * 25.0), $00)
                                    If (647.0 = local0\Field103) Then
                                        local0\Field65 = 0.0
                                        local0\Field66 = 0.0
                                    EndIf
                                Else
                                    animatenpc(local0, 684.0, 647.0, ((- local0\Field64) * 25.0), $01)
                                EndIf
                        End Select
                        If (1.0 < local0\Field66) Then
                            If (local0\Field55 = $00) Then
                                local0\Field55 = loadsound_strict("SFX\SCP\066\Rolling.ogg")
                            EndIf
                            If (ChannelPlaying(local0\Field63) = $00) Then
                                local0\Field63 = playsoundex(local0\Field55, camera, local0\Field82, 20.0, 1.0, $00, $00)
                            EndIf
                        EndIf
                        If (0.0 < local0\Field57) Then
                            local0\Field57 = (local0\Field57 - fps\Field3[$00])
                            lightvolume = (templightvolume - (clamp((local0\Field57 / 500.0), 0.01, 0.6) * templightvolume))
                            XZ0260X8X2\Field62 = max(XZ0260X8X2\Field62, 130.0)
                            XZ0260X8X2\Field87 = max(XZ0260X8X2\Field87, min((local0\Field57 / 1000.0), 1.0))
                        EndIf
                        updatesoundorigin(local0\Field6, camera, local0\Field82, 20.0, 1.0, $00, $01, $00)
                        If (ChannelPlaying(local0\Field6) <> 0) Then
                            XZ0260X8X2\Field64 = max((5.0 - (sqr(local13) * 300.0)), 0.0)
                        EndIf
                    EndIf
                EndIf
                positionentity(local0\Field98, entityx(local0\Field82, $00, 1.0), (entityy(local0\Field82, $00, 1.0) - local0\Field23), entityz(local0\Field82, $00, 1.0), $00)
                rotateentity(local0\Field98, (entitypitch(local0\Field82, $00, 1.0) - 90.0), entityyaw(local0\Field82, $00, 1.0), 0.0, $00)
            Case $0E
                If (66.0 <> local0\Field66) Then
                    If (-1.0 < local0\Field66) Then
                        local13 = entitydistancesquared(local0\Field82, XZ0260X8X2\Field74)
                        If ((hidedistance * hidedistance) > local13) Then
                            updatenpcblinking(local0)
                            local21 = local0\Field103
                            If (T8660BZ460\Field8 = $00) Then
                                If (entityhidden(local0\Field98) = $00) Then
                                    hideentity(local0\Field98)
                                EndIf
                                If ((chs\Field8 Lor i_268\Field3) = $00) Then
                                    If (((1.0 > local13) And (0.0 >= local0\Field62)) <> 0) Then
                                        Select rand($06, $01)
                                            Case $01
                                                createmsg(getlocalstring("msg", "966_1"), 6.0)
                                            Case $02
                                                createmsg(getlocalstring("msg", "966_2"), 6.0)
                                            Case $03
                                                createmsg(getlocalstring("msg", "966_3"), 6.0)
                                            Case $04
                                                createmsg(getlocalstring("msg", "966_4"), 6.0)
                                            Case $05
                                                createmsg(getlocalstring("msg", "966_5"), 6.0)
                                            Case $06
                                                createmsg(getlocalstring("msg", "966_6"), 6.0)
                                        End Select
                                        local0\Field62 = 1680.0
                                    EndIf
                                EndIf
                            Else
                                If (entityvisible(local0\Field82, XZ0260X8X2\Field74, 0.0) <> 0) Then
                                    giveachievement("966", $01)
                                EndIf
                                If (entityhidden(local0\Field98) <> 0) Then
                                    showentity(local0\Field98)
                                EndIf
                            EndIf
                            local0\Field62 = (local0\Field62 - fps\Field3[$00])
                            If (350.0 <= local0\Field57) Then
                                local0\Field66 = max(local0\Field66, 8.0)
                            EndIf
                            If (10.0 > XZ0260X8X2\Field56) Then
                                local0\Field57 = (local0\Field57 + fps\Field3[$00])
                            ElseIf (350.0 > local0\Field57) Then
                                local0\Field57 = max((local0\Field57 - (fps\Field3[$00] * 0.2)), 0.0)
                            EndIf
                            Select local0\Field66
                                Case 0.0
                                    If (557.0 < local0\Field103) Then
                                        animatenpc(local0, 628.0, 652.0, 0.25, $00)
                                        If (651.9 < local0\Field103) Then
                                            setnpcframe(local0, 2.0, $01)
                                        EndIf
                                    Else
                                        animatenpc(local0, 2.0, 214.0, 0.25, $00)
                                        If (213.9 < local0\Field103) Then
                                            If (((rand($03, $01) = $01) And (12.0 > local13)) <> 0) Then
                                                local0\Field66 = (Float rand($01, $04))
                                            Else
                                                local0\Field66 = (Float rand($05, $06))
                                            EndIf
                                        EndIf
                                        If (npcseesplayer(local0, (4.0 - XZ0260X8X2\Field46), 75.0, $00) = $01) Then
                                            local0\Field66 = (Float rand($04, $01))
                                        EndIf
                                    EndIf
                                Case 1.0,2.0
                                    animatenpc(local0, 214.0, 257.0, 0.25, $00)
                                    If (256.9 < local0\Field103) Then
                                        local0\Field66 = 0.0
                                    EndIf
                                    If (npcseesplayer(local0, (6.0 - XZ0260X8X2\Field46), 75.0, $00) = $01) Then
                                        pointentity(local0\Field82, XZ0260X8X2\Field74, 0.0)
                                        rotateentity(local0\Field82, 0.0, entityyaw(local0\Field82, $01, 1.0), 0.0, $01)
                                        If (350.0 > local0\Field57) Then
                                            XZ0260X8X2\Field64 = (((sin(((Float millisec) / 50.0)) + 1.0) * 200.0) / sqr(local13))
                                            If ((((i_714\Field0 <> $02) And (T8660BZ460\Field3 <> $04)) And (T8660BZ460\Field10 <> $04)) <> 0) Then
                                                If (0.0 = i_966\Field1) Then
                                                    Select rand($04, $01)
                                                        Case $01
                                                            createmsg(getlocalstring("msg", "966.sleep_1"), 6.0)
                                                        Case $02
                                                            createmsg(getlocalstring("msg", "966.sleep_2"), 6.0)
                                                        Case $03
                                                            createmsg(getlocalstring("msg", "966.sleep_3"), 6.0)
                                                        Case $04
                                                            createmsg(getlocalstring("msg", "966.sleep_4"), 6.0)
                                                    End Select
                                                EndIf
                                                i_966\Field1 = (1.0 - ((Float i_714\Field0) * 0.5))
                                                local94 = ((((Float selecteddifficulty\Field8) * 1050.0) + 3150.0) / ((Float i_714\Field0) + 1.0))
                                                i_966\Field0 = max(i_966\Field0, local94)
                                                i_966\Field0 = min((((((Float selecteddifficulty\Field8) + 6.0) - (((Float selecteddifficulty\Field8) + 2.5) * (Float i_714\Field0))) * fps\Field3[$00]) + i_966\Field0), (local94 * 2.0))
                                            EndIf
                                        EndIf
                                        local0\Field84 = curveangle(entityyaw(local0\Field82, $01, 1.0), local0\Field84, 20.0)
                                    EndIf
                                    If (((228.0 < local0\Field103) And (228.0 >= local21)) <> 0) Then
                                        If (ChannelPlaying(local0\Field63) = $00) Then
                                            local0\Field63 = playsoundex(loadtempsound((("SFX\SCP\966\Echo" + (Str rand($00, $02))) + ".ogg")), camera, local0\Field82, 10.0, 1.0, $01, $00)
                                        EndIf
                                    EndIf
                                    updatesoundorigin(local0\Field63, camera, local0\Field82, 10.0, 1.0, $01, $01, $00)
                                Case 3.0,4.0
                                    If (3.0 = local0\Field66) Then
                                        animatenpc(local0, 258.0, 332.0, 0.25, $00)
                                        If (331.9 < local0\Field103) Then
                                            local0\Field66 = 0.0
                                        EndIf
                                    Else
                                        animatenpc(local0, 333.0, 457.0, 0.25, $00)
                                        If (456.9 < local0\Field103) Then
                                            local0\Field66 = 0.0
                                        EndIf
                                    EndIf
                                    If (npcseesplayer(local0, (6.0 - XZ0260X8X2\Field46), 75.0, $00) = $01) Then
                                        pointentity(local0\Field82, XZ0260X8X2\Field74, 0.0)
                                        rotateentity(local0\Field82, 0.0, entityyaw(local0\Field82, $01, 1.0), 0.0, $01)
                                        local0\Field84 = curveangle(entityyaw(local0\Field82, $01, 1.0), local0\Field84, 20.0)
                                    EndIf
                                    If (((((271.0 < local0\Field103) And (271.0 >= local21)) Lor ((301.0 < local0\Field103) And (301.0 >= local21))) Lor ((314.0 < local0\Field103) And (314.0 >= local21))) <> 0) Then
                                        If (ChannelPlaying(local0\Field63) = $00) Then
                                            local0\Field63 = playsoundex(loadtempsound((("SFX\SCP\966\Idle" + (Str rand($00, $02))) + ".ogg")), camera, local0\Field82, 10.0, 1.0, $01, $00)
                                        EndIf
                                    EndIf
                                    updatesoundorigin(local0\Field63, camera, local0\Field82, 10.0, 1.0, $01, $01, $00)
                                Case 5.0,6.0,8.0
                                    If (8.0 = local0\Field66) Then
                                        If (npcseesplayer(local0, (6.0 - XZ0260X8X2\Field46), 75.0, $00) = $01) Then
                                            pointentity(local0\Field82, XZ0260X8X2\Field74, 0.0)
                                            rotateentity(local0\Field82, 0.0, entityyaw(local0\Field82, $01, 1.0), 0.0, $01)
                                            local0\Field64 = curvevalue(local0\Field32, local0\Field64, 10.0)
                                            moveentity(local0\Field82, 0.0, 0.0, (local0\Field64 * fps\Field3[$00]), $00)
                                            local0\Field8 = 0.0
                                            local0\Field30 = $00
                                            local0\Field48 = $00
                                            If (0.7225 > local13) Then
                                                local0\Field66 = 9.0
                                            EndIf
                                        ElseIf (0.0 >= local0\Field8) Then
                                            local0\Field30 = findpath(local0, entityx(XZ0260X8X2\Field74, $00, 1.0), (entityy(XZ0260X8X2\Field74, $00, 1.0) + 0.1), entityz(XZ0260X8X2\Field74, $00, 1.0))
                                            If (local0\Field30 = $01) Then
                                                While (local0\Field71[local0\Field48] = Null)
                                                    If (local0\Field48 > $14) Then
                                                        local0\Field48 = $00
                                                        local0\Field30 = $00
                                                        Exit
                                                    Else
                                                        local0\Field48 = (local0\Field48 + $01)
                                                    EndIf
                                                Wend
                                                If (local0\Field48 < $14) Then
                                                    If (((local0\Field71[local0\Field48] <> Null) And (local0\Field71[(local0\Field48 + $01)] <> Null)) <> 0) Then
                                                        If (local0\Field71[local0\Field48]\Field7 = Null) Then
                                                            If ((Abs deltayaw(local0\Field82, local0\Field71[(local0\Field48 + $01)]\Field0)) < (Abs deltayaw(local0\Field82, local0\Field71[local0\Field48]\Field0))) Then
                                                                local0\Field48 = (local0\Field48 + $01)
                                                            EndIf
                                                        EndIf
                                                        usedoornpc(local0, $01, $00)
                                                    EndIf
                                                EndIf
                                            EndIf
                                            local0\Field8 = 700.0
                                        Else
                                            If (((0.7225 > local13) And (chs\Field8 = $00)) <> 0) Then
                                                If (entityvisible(local0\Field82, XZ0260X8X2\Field74, 0.0) <> 0) Then
                                                    local0\Field66 = 9.0
                                                EndIf
                                            EndIf
                                            If (local0\Field30 = $01) Then
                                                If (local0\Field71[local0\Field48] = Null) Then
                                                    If (local0\Field48 > $14) Then
                                                        local0\Field48 = $00
                                                        local0\Field30 = $00
                                                    Else
                                                        local0\Field48 = (local0\Field48 + $01)
                                                    EndIf
                                                Else
                                                    pointentity(local0\Field82, local0\Field71[local0\Field48]\Field0, 0.0)
                                                    rotateentity(local0\Field82, 0.0, entityyaw(local0\Field82, $01, 1.0), 0.0, $01)
                                                    local0\Field64 = curvevalue(local0\Field32, local0\Field64, 10.0)
                                                    moveentity(local0\Field82, 0.0, 0.0, (local0\Field64 * fps\Field3[$00]), $00)
                                                    usedoornpc(local0, $01, $00)
                                                EndIf
                                                local0\Field8 = max((local0\Field8 - fps\Field3[$00]), 0.0)
                                            Else
                                                local0\Field64 = curvevalue(0.0, local0\Field64, 10.0)
                                                local0\Field8 = max((local0\Field8 - (fps\Field3[$00] * 2.0)), 0.0)
                                            EndIf
                                        EndIf
                                        local0\Field84 = curveangle(entityyaw(local0\Field82, $01, 1.0), local0\Field84, 20.0)
                                    Else
                                        local38 = $00
                                        If ((Float millisecs()) > local0\Field65) Then
                                            hideentity(local0\Field82)
                                            entitypick(local0\Field82, 1.5)
                                            If (pickedentity() <> $00) Then
                                                local38 = $01
                                            EndIf
                                            showentity(local0\Field82)
                                            local0\Field65 = (Float (millisecs() + $3E8))
                                            If (rand($05, $01) = $01) Then
                                                local0\Field66 = 0.0
                                            EndIf
                                        EndIf
                                        rotateentity(local0\Field82, 0.0, (entityyaw(local0\Field82, $01, 1.0) + (rnd(80.0, 110.0) * (Float local38))), 0.0, $01)
                                        local0\Field64 = curvevalue((local0\Field32 * 0.6), local0\Field64, 10.0)
                                        moveentity(local0\Field82, 0.0, 0.0, (local0\Field64 * fps\Field3[$00]), $00)
                                        local0\Field84 = curveangle(entityyaw(local0\Field82, $01, 1.0), local0\Field84, 20.0)
                                    EndIf
                                    If (0.005 > local0\Field64) Then
                                        If (557.0 < local0\Field103) Then
                                            animatenpc(local0, 628.0, 652.0, 0.25, $00)
                                            If (651.9 < local0\Field103) Then
                                                setnpcframe(local0, 2.0, $01)
                                            EndIf
                                        Else
                                            animatenpc(local0, 2.0, 214.0, 0.25, $01)
                                        EndIf
                                        If (((650.0 > local21) And (650.0 <= local0\Field103)) <> 0) Then
                                            playsoundex(snd_i\Field51[rand($03, $06)], camera, local0\Field82, 7.0, rnd(0.5, 0.7), $00, $00)
                                        EndIf
                                    Else
                                        animatenpc(local0, clamp(animtime(local0\Field98), 557.0, 580.0), 628.0, (local0\Field64 * 25.0), $01)
                                        If ((((581.0 > local21) And (581.0 <= local0\Field103)) Lor ((607.0 > local21) And (607.0 <= local0\Field103))) <> 0) Then
                                            playsoundex(snd_i\Field51[rand($03, $06)], camera, local0\Field82, 7.0, rnd(0.5, 0.7), $00, $00)
                                        EndIf
                                    EndIf
                                Case 9.0
                                    If (0.0 = XZ0260X8X2\Field48) Then
                                        local0\Field64 = 0.0
                                        pointentity(local0\Field82, XZ0260X8X2\Field74, 0.0)
                                        rotateentity(local0\Field82, 0.0, entityyaw(local0\Field82, $01, 1.0), 0.0, $01)
                                        local0\Field84 = curveangle(entityyaw(local0\Field82, $01, 1.0), local0\Field84, 20.0)
                                        If (local0\Field17 = $00) Then
                                            local0\Field63 = playsoundex(loadtempsound((("SFX\SCP\966\Echo" + (Str rand($00, $02))) + ".ogg")), camera, local0\Field82, 10.0, 1.0, $01, $00)
                                            local0\Field17 = $01
                                        EndIf
                                        If (557.0 < local0\Field103) Then
                                            animatenpc(local0, 629.0, 652.0, 0.25, $00)
                                            If (((650.0 > local21) And (650.0 <= local0\Field103)) <> 0) Then
                                                playsoundex(snd_i\Field51[rand($03, $06)], camera, local0\Field82, 7.0, rnd(0.5, 0.7), $00, $00)
                                            EndIf
                                            If (651.9 < local0\Field103) Then
                                                Select rand($03, $01)
                                                    Case $01
                                                        setnpcframe(local0, 458.0, $01)
                                                    Case $02
                                                        setnpcframe(local0, 488.0, $01)
                                                    Case $03
                                                        setnpcframe(local0, 518.0, $01)
                                                End Select
                                            EndIf
                                        ElseIf (487.0 >= local0\Field103) Then
                                            animatenpc(local0, 458.0, 487.0, 0.3, $00)
                                            If (486.9 < local0\Field103) Then
                                                local0\Field17 = $00
                                                local0\Field66 = 8.0
                                            EndIf
                                        ElseIf (517.0 >= local0\Field103) Then
                                            animatenpc(local0, 488.0, 517.0, 0.3, $00)
                                            If (516.9 < local0\Field103) Then
                                                local0\Field17 = $00
                                                local0\Field66 = 8.0
                                            EndIf
                                        ElseIf (556.0 >= local0\Field103) Then
                                            animatenpc(local0, 518.0, 556.0, 0.3, $00)
                                            If (555.9 < local0\Field103) Then
                                                local0\Field17 = $00
                                                local0\Field66 = 8.0
                                            EndIf
                                        EndIf
                                        If (((((470.0 < local0\Field103) And (470.0 >= local21)) Lor ((500.0 < local0\Field103) And (500.0 >= local21))) Lor ((527.0 < local0\Field103) And (527.0 >= local21))) <> 0) Then
                                            If (0.81 > local13) Then
                                                playsound_strict(snd_i\Field50[rand($0B, $0C)], $00, $00)
                                                injureplayer((rnd(0.45, 0.75) * difficultydmgmult), 0.0, 500.0, (0.25 * difficultydmgmult), (0.1 * difficultydmgmult))
                                                XZ0260X8X2\Field1 = ((Float (0.0 = i_1025\Field1[$03])) * 1.8)
                                                If (10.0 < XZ0260X8X2\Field11) Then
                                                    msg\Field8 = format(getlocalstring("death", "966"), subjectname, "%s")
                                                    kill($01, $01, $00, $01)
                                                EndIf
                                            Else
                                                playsoundex(snd_i\Field49, camera, local0\Field82, 2.5, 1.0, $00, $00)
                                            EndIf
                                        EndIf
                                    EndIf
                            End Select
                        Else
                            If (entityhidden(local0\Field98) = $00) Then
                                hideentity(local0\Field98)
                            EndIf
                            If (rand((($352 - (selecteddifficulty\Field2 * $FA)) + ((remotedooron = $00) * $FA)), $01) = $01) Then
                                teleportcloser(local0)
                                local0\Field57 = 0.0
                                local0\Field66 = 0.0
                            EndIf
                        EndIf
                        If (playerroom\Field22\Field21 = $6F) Then
                            local0\Field57 = 0.0
                            local0\Field66 = 0.0
                        EndIf
                    EndIf
                EndIf
                positionentity(local0\Field98, entityx(local0\Field82, $01, 1.0), (entityy(local0\Field82, $01, 1.0) - local0\Field23), entityz(local0\Field82, $01, 1.0), $01)
                rotateentity(local0\Field98, -90.0, local0\Field84, 0.0, $01)
            Case $12
                If (66.0 <> local0\Field66) Then
                    local21 = local0\Field103
                    If (((0.0 = local0\Field31) And (((hidedistance * 3.0) * (hidedistance * 3.0)) > entitydistancesquared(local0\Field82, XZ0260X8X2\Field74))) <> 0) Then
                        If (local0\Field13 = $00) Then
                            If (((0.0 = local0\Field66) Lor (2.0 = local0\Field66)) <> 0) Then
                                For local1 = Each npcs
                                    If (((local1\Field77 = local0\Field77) And (local1 <> local0)) <> 0) Then
                                        If (((0.0 <> local1\Field66) And (2.0 <> local1\Field66)) <> 0) Then
                                            If (local1\Field13 = $00) Then
                                                local0\Field66 = 1.0
                                                local0\Field65 = 0.0
                                                Exit
                                            EndIf
                                        EndIf
                                    EndIf
                                Next
                            EndIf
                        EndIf
                        Select local0\Field66
                            Case 0.0
                                If (local0\Field13 = $00) Then
                                    If (0.0 = local0\Field64) Then
                                        If (0.0 = local0\Field62) Then
                                            If ((rnd(1.0, 3.0) * 500.0) > local0\Field65) Then
                                                local0\Field64 = 0.0
                                                local0\Field65 = (local0\Field65 + fps\Field3[$00])
                                            ElseIf (0.0 = local0\Field64) Then
                                                local0\Field64 = (local0\Field64 + 0.0001)
                                            EndIf
                                        ElseIf (1500.0 > local0\Field65) Then
                                            local0\Field64 = 0.0
                                            local0\Field65 = (local0\Field65 + fps\Field3[$00])
                                        Else
                                            If (local0\Field59 <> Null) Then
                                                If (local0\Field59\Field59 <> Null) Then
                                                    local0\Field59\Field59 = Null
                                                EndIf
                                                local0\Field59\Field62 = 0.0
                                                local0\Field59\Field84 = (local0\Field59\Field84 + rnd(-45.0, 45.0))
                                                local0\Field59 = Null
                                                local0\Field62 = 0.0
                                                local0\Field84 = (local0\Field84 + rnd(-45.0, 45.0))
                                            EndIf
                                            If (0.0 = local0\Field64) Then
                                                local0\Field64 = (local0\Field64 + 0.0001)
                                            EndIf
                                        EndIf
                                    Else
                                        If (local0\Field59 <> Null) Then
                                            local0\Field65 = 0.0
                                        EndIf
                                        If ((rnd(1.0, 3.0) * 10000.0) > local0\Field65) Then
                                            local0\Field64 = curvevalue(local0\Field32, local0\Field64, 10.0)
                                            local0\Field65 = (local0\Field65 + fps\Field3[$00])
                                        Else
                                            local0\Field64 = curvevalue(0.0, local0\Field64, 50.0)
                                        EndIf
                                        rotateentity(local0\Field82, 0.0, curveangle(local0\Field84, entityyaw(local0\Field82, $00, 1.0), 10.0), 0.0, $00)
                                        If (local0\Field59 = Null) Then
                                            If (rand($C8, $01) = $01) Then
                                                local0\Field84 = (local0\Field84 + rnd(-45.0, 45.0))
                                            EndIf
                                            If (entityhidden(local0\Field82) = $00) Then
                                                hideentity(local0\Field82)
                                            EndIf
                                            entitypick(local0\Field82, 1.5)
                                            If (pickedentity() <> $00) Then
                                                local0\Field84 = (entityyaw(local0\Field82, $00, 1.0) + rnd(80.0, 110.0))
                                            EndIf
                                            If (entityhidden(local0\Field82) <> 0) Then
                                                showentity(local0\Field82)
                                            EndIf
                                        Else
                                            local0\Field84 = (entityyaw(local0\Field82, $00, 1.0) + deltayaw(local0\Field82, local0\Field59\Field82))
                                            If (2.25 > entitydistancesquared(local0\Field82, local0\Field59\Field82)) Then
                                                local0\Field64 = 0.0
                                                local0\Field59\Field64 = 0.0
                                                local0\Field62 = 1.0
                                                local0\Field59\Field62 = 1.0
                                                local38 = rand($00, $02)
                                                If (local38 = $00) Then
                                                    setnpcframe(local0, 296.0, $01)
                                                ElseIf (local38 = $01) Then
                                                    setnpcframe(local0, 856.0, $01)
                                                Else
                                                    setnpcframe(local0, 905.0, $01)
                                                EndIf
                                                local38 = rand($00, $02)
                                                If (local38 = $00) Then
                                                    setnpcframe(local0\Field59, 296.0, $01)
                                                ElseIf (local38 = $01) Then
                                                    setnpcframe(local0\Field59, 856.0, $01)
                                                Else
                                                    setnpcframe(local0\Field59, 905.0, $01)
                                                EndIf
                                            EndIf
                                        EndIf
                                    EndIf
                                Else
                                    rotateentity(local0\Field82, 0.0, curveangle(local0\Field84, entityyaw(local0\Field82, $00, 1.0), 10.0), 0.0, $00)
                                EndIf
                                If (0.0 = local0\Field64) Then
                                    If (((0.0 = local0\Field62) And (local0\Field13 <> $02)) <> 0) Then
                                        animatenpc(local0, 296.0, 320.0, 0.2, $01)
                                    ElseIf (((0.0 = local0\Field62) And (local0\Field13 = $02)) <> 0) Then
                                        If (532.5 >= local0\Field103) Then
                                            animatenpc(local0, 509.0, 533.0, 0.2, $00)
                                        ElseIf (((533.5 < local0\Field103) And (600.5 >= local0\Field103)) <> 0) Then
                                            animatenpc(local0, 534.0, 601.0, 0.2, $00)
                                        Else
                                            local38 = rand($00, $01)
                                            If (local38 = $00) Then
                                                setnpcframe(local0, 509.0, $01)
                                            Else
                                                setnpcframe(local0, 534.0, $01)
                                            EndIf
                                        EndIf
                                    ElseIf (local0\Field13 = $02) Then
                                        animatenpc(local0, 713.0, 855.0, 0.2, $00)
                                        If (833.5 < local0\Field103) Then
                                            pointentity(local0\Field98, XZ0260X8X2\Field74, 0.0)
                                            rotateentity(local0\Field82, 0.0, curveangle(local0\Field84, entityyaw(local0\Field82, $00, 1.0), 10.0), 0.0, $00)
                                        EndIf
                                    ElseIf (local0\Field13 = $01) Then
                                        animatenpc(local0, 602.0, 712.0, 0.2, $00)
                                        If (711.5 < local0\Field103) Then
                                            local0\Field62 = 0.0
                                        EndIf
                                    ElseIf (319.5 >= local0\Field103) Then
                                        animatenpc(local0, 296.0, 320.0, 0.2, $00)
                                    ElseIf (((320.5 < local0\Field103) And (903.5 > local0\Field103)) <> 0) Then
                                        animatenpc(local0, 856.0, 904.0, 0.2, $00)
                                    ElseIf (((904.5 < local0\Field103) And (952.5 > local0\Field103)) <> 0) Then
                                        animatenpc(local0, 905.0, 953.0, 0.2, $00)
                                    Else
                                        local38 = rand($00, $02)
                                        If (local38 = $00) Then
                                            setnpcframe(local0, 296.0, $01)
                                        ElseIf (local38 = $01) Then
                                            setnpcframe(local0, 856.0, $01)
                                        Else
                                            setnpcframe(local0, 905.0, $01)
                                        EndIf
                                    EndIf
                                Else
                                    If ((local0\Field56 Mod $02) = $00) Then
                                        animatenpc(local0, 1.0, 62.0, (local0\Field64 * 28.0), $01)
                                    Else
                                        animatenpc(local0, 100.0, 167.0, (local0\Field64 * 28.0), $01)
                                    EndIf
                                    If (local0\Field13 = $00) Then
                                        If (local0\Field59 = Null) Then
                                            If (rand($4B0, $01) = $01) Then
                                                For local1 = Each npcs
                                                    If (local1 <> local0) Then
                                                        If (local1\Field77 = local0\Field77) Then
                                                            If (local1\Field59 = Null) Then
                                                                If (local1\Field13 = $00) Then
                                                                    If (400.0 > entitydistancesquared(local0\Field82, local1\Field82)) Then
                                                                        local0\Field59 = local1
                                                                        local1\Field59 = local0
                                                                        local0\Field59\Field64 = (local0\Field59\Field64 + 0.0001)
                                                                        Exit
                                                                    EndIf
                                                                EndIf
                                                            EndIf
                                                        EndIf
                                                    EndIf
                                                Next
                                            EndIf
                                        EndIf
                                    EndIf
                                EndIf
                                If (((local0\Field59 = Null) And (local0\Field13 = $00)) <> 0) Then
                                    If (rand($1388, $01) = $01) Then
                                        If (ChannelPlaying(local0\Field63) = $00) Then
                                            local13 = entitydistancesquared(local0\Field82, XZ0260X8X2\Field74)
                                            If (400.0 > local13) Then
                                                loadnpcsound(local0, (("SFX\SCP\1499\Idle" + (Str rand($00, $03))) + ".ogg"), $00)
                                                local0\Field63 = playsoundex(local0\Field55, camera, local0\Field82, 20.0, 1.0, $01, $00)
                                            EndIf
                                        EndIf
                                        local0\Field65 = 0.0
                                        local0\Field66 = 2.0
                                    EndIf
                                    If ((((local0\Field56 Mod $02) = $00) And ((chs\Field8 Lor i_268\Field3) = $00)) <> 0) Then
                                        local13 = entitydistancesquared(local0\Field82, XZ0260X8X2\Field74)
                                        If (100.0 > local13) Then
                                            If (entityvisible(local0\Field82, XZ0260X8X2\Field74, 0.0) <> 0) Then
                                                If (25.0 > local13) Then
                                                    loadnpcsound(local0, "SFX\SCP\1499\Triggered.ogg", $00)
                                                    local0\Field63 = playsoundex(local0\Field55, camera, local0\Field82, 20.0, 1.0, $01, $00)
                                                    local0\Field65 = 1.0
                                                    For local1 = Each npcs
                                                        If (((local1\Field77 = local0\Field77) And (local1 <> local0)) <> 0) Then
                                                            If (local1\Field13 = $00) Then
                                                                local1\Field66 = 1.0
                                                                local1\Field65 = 0.0
                                                            EndIf
                                                        EndIf
                                                    Next
                                                Else
                                                    local0\Field65 = 0.0
                                                EndIf
                                                setnpcframe(local0, 203.0, $01)
                                                local0\Field66 = 2.0
                                            EndIf
                                        EndIf
                                    EndIf
                                ElseIf (local0\Field13 = $01) Then
                                    local13 = entitydistancesquared(local0\Field82, XZ0260X8X2\Field74)
                                    If ((chs\Field8 Lor i_268\Field3) = $00) Then
                                        If (16.0 > local13) Then
                                            If (entityvisible(local0\Field82, XZ0260X8X2\Field74, 0.0) <> 0) Then
                                                loadnpcsound(local0, "SFX\SCP\1499\Triggered.ogg", $00)
                                                local0\Field63 = playsoundex(local0\Field55, camera, local0\Field82, 20.0, 1.0, $01, $00)
                                                setnpcframe(local0, 203.0, $01)
                                                local0\Field66 = 1.0
                                            EndIf
                                        EndIf
                                    EndIf
                                EndIf
                            Case 1.0
                                If ((chs\Field8 Lor i_268\Field3) <> 0) Then
                                    local0\Field66 = 0.0
                                EndIf
                                If (((playerroom\Field22\Field21 = $70) And (local0\Field13 = $00)) <> 0) Then
                                    shouldplay = $12
                                EndIf
                                pointentity(local0\Field98, XZ0260X8X2\Field74, 0.0)
                                rotateentity(local0\Field82, 0.0, curveangle(entityyaw(local0\Field98, $00, 1.0), entityyaw(local0\Field82, $00, 1.0), 20.0), 0.0, $00)
                                local13 = entitydistancesquared(local0\Field82, XZ0260X8X2\Field74)
                                If (0.0 = local0\Field65) Then
                                    If (local0\Field13 = $01) Then
                                        local0\Field64 = curvevalue((local0\Field32 * 2.0), local0\Field64, 10.0)
                                        If (local0\Field59 <> Null) Then
                                            local0\Field59\Field66 = 1.0
                                        EndIf
                                    Else
                                        local0\Field64 = curvevalue((local0\Field32 * 1.75), local0\Field64, 10.0)
                                    EndIf
                                    If ((local0\Field56 Mod $02) = $00) Then
                                        animatenpc(local0, 1.0, 62.0, (local0\Field64 * 28.0), $01)
                                    Else
                                        animatenpc(local0, 100.0, 167.0, (local0\Field64 * 28.0), $01)
                                    EndIf
                                EndIf
                                If (0.5625 > local13) Then
                                    If (((((((local0\Field56 Mod $02) = $00) Lor (1.0 = local0\Field57)) Lor (local0\Field13 = $01)) Lor (local0\Field13 = $03)) Lor (local0\Field13 = $04)) <> 0) Then
                                        If (1.0 = local0\Field65) Then
                                            setnpcframe(local0, 63.0, $01)
                                        Else
                                            setnpcframe(local0, 168.0, $01)
                                        EndIf
                                        local0\Field65 = (Float rand($01, $02))
                                        local0\Field66 = 3.0
                                    Else
                                        local0\Field66 = 4.0
                                    EndIf
                                EndIf
                            Case 2.0
                                local0\Field64 = 0.0
                                animatenpc(local0, 203.0, 295.0, 0.1, $00)
                                If (294.0 < local0\Field103) Then
                                    local0\Field66 = local0\Field65
                                EndIf
                            Case 3.0
                                local0\Field64 = curvevalue(0.0, local0\Field64, 5.0)
                                local13 = entitydistancesquared(local0\Field82, XZ0260X8X2\Field74)
                                If (1.0 = local0\Field65) Then
                                    animatenpc(local0, 63.0, 100.0, 0.6, $00)
                                    local30 = ((89.0 > local21) And (89.0 <= local0\Field103))
                                    If (99.0 <= local0\Field103) Then
                                        local0\Field65 = 0.0
                                        local0\Field66 = 1.0
                                    EndIf
                                Else
                                    animatenpc(local0, 168.0, 202.0, 0.6, $00)
                                    local30 = ((189.0 > local21) And (189.0 <= local0\Field103))
                                    If (201.0 <= local0\Field103) Then
                                        local0\Field65 = 0.0
                                        local0\Field66 = 1.0
                                    EndIf
                                EndIf
                                If (local30 <> 0) Then
                                    If (((0.64 < local13) Lor (60.0 < (Abs deltayaw(local0\Field82, XZ0260X8X2\Field74)))) <> 0) Then
                                        playsoundex(snd_i\Field49, camera, local0\Field82, 2.5, 1.0, $00, $00)
                                    Else
                                        playsound_strict(snd_i\Field50[rand($0B, $0C)], $00, $00)
                                        injureplayer((rnd(0.65, 1.1) * difficultydmgmult), 0.0, 500.0, (0.35 * difficultydmgmult), (0.15 * difficultydmgmult))
                                        XZ0260X8X2\Field1 = ((Float (0.0 = i_1025\Field1[$03])) * 2.5)
                                        If (10.0 < XZ0260X8X2\Field11) Then
                                            If (playerroom\Field22\Field21 = $70) Then
                                                msg\Field8 = getlocalstring("death", "1499.dimension")
                                            Else
                                                msg\Field8 = getlocalstring("death", "1499")
                                            EndIf
                                            kill($01, $01, $00, $01)
                                        EndIf
                                    EndIf
                                EndIf
                            Case 4.0
                                local13 = entitydistancesquared(local0\Field82, XZ0260X8X2\Field74)
                                local0\Field64 = curvevalue(0.0, local0\Field64, 5.0)
                                animatenpc(local0, 296.0, 320.0, 0.2, $01)
                                pointentity(local0\Field98, XZ0260X8X2\Field74, 0.0)
                                rotateentity(local0\Field82, 0.0, curveangle(entityyaw(local0\Field98, $00, 1.0), entityyaw(local0\Field82, $00, 1.0), 20.0), 0.0, $00)
                                If (0.64 < local13) Then
                                    local0\Field66 = 1.0
                                EndIf
                        End Select
                        updatesoundorigin(local0\Field63, camera, local0\Field82, 20.0, 1.0, $01, $01, $00)
                        moveentity(local0\Field82, 0.0, 0.0, (local0\Field64 * fps\Field3[$00]), $00)
                        If (entityhidden(local0\Field98) <> 0) Then
                            showentity(local0\Field98)
                        EndIf
                    ElseIf (entityhidden(local0\Field98) = $00) Then
                        hideentity(local0\Field98)
                    EndIf
                EndIf
                rotateentity(local0\Field98, 0.0, (entityyaw(local0\Field82, $00, 1.0) - 180.0), 0.0, $00)
                positionentity(local0\Field98, entityx(local0\Field82, $00, 1.0), (entityy(local0\Field82, $00, 1.0) - local0\Field23), entityz(local0\Field82, $00, 1.0), $00)
            Case $00
                If (66.0 <> local0\Field66) Then
                    If (local0\Field1 = $00) Then
                        local21 = local0\Field103
                        updatenpcblinking(local0)
                        Select local0\Field66
                            Case 0.0
                                setnpcframe(local0, 33.0, $01)
                                local0\Field84 = curveangle(entityyaw(local0\Field82, $01, 1.0), local0\Field84, 20.0)
                            Case 1.0
                                animatenpc(local0, 33.0, 63.0, 0.1, $00)
                                local0\Field84 = curveangle(entityyaw(local0\Field82, $01, 1.0), local0\Field84, 20.0)
                                If (62.9 < local0\Field103) Then
                                    local0\Field66 = 3.0
                                EndIf
                            Case 2.0
                                local0\Field65 = max((local0\Field65 - fps\Field3[$00]), 0.0)
                                If (0.0 < local0\Field65) Then
                                    If (local0\Field59 = Null) Then
                                        If (npcseesplayer(local0, (8.0 - XZ0260X8X2\Field46), 75.0, $00) = $01) Then
                                            local0\Field65 = 140.0
                                        EndIf
                                        If (entityvisible(local0\Field82, XZ0260X8X2\Field74, 0.0) <> 0) Then
                                            pointentity(local0\Field82, XZ0260X8X2\Field74, 0.0)
                                        EndIf
                                        local13 = entitydistancesquared(local0\Field82, XZ0260X8X2\Field74)
                                    Else
                                        If (npcseesnpc(local0\Field59, local0, 36.0) = $01) Then
                                            local0\Field65 = 140.0
                                            pointentity(local0\Field82, local0\Field59\Field82, 0.0)
                                        EndIf
                                        local13 = entitydistancesquared(local0\Field82, local0\Field59\Field82)
                                    EndIf
                                    rotateentity(local0\Field82, 0.0, entityyaw(local0\Field82, $01, 1.0), 0.0, $01)
                                    local0\Field64 = curvevalue(local0\Field32, local0\Field64, 20.0)
                                    animatenpc(local0, clamp(animtime(local0\Field98), 62.0, 82.0), 111.0, (local0\Field64 * 26.0), $01)
                                    moveentity(local0\Field82, 0.0, 0.0, (local0\Field64 * fps\Field3[$00]), $00)
                                    local0\Field84 = curveangle(entityyaw(local0\Field82, $01, 1.0), local0\Field84, 20.0)
                                    local0\Field8 = 140.0
                                    local0\Field30 = $00
                                    local0\Field48 = $00
                                    If (0.49 > local13) Then
                                        setnpcframe(local0, (((Float (rand($02, $01) = $01)) * 43.0) + 131.0), $01)
                                        local0\Field66 = 4.0
                                        Return $00
                                    EndIf
                                    If ((((83.0 > local21) And (83.0 <= local0\Field103)) Lor ((99.0 > local21) And (99.0 <= local0\Field103))) <> 0) Then
                                        playsoundex(TXDBZF46ZXF(getstepsound(local0\Field82), $00, rand($00, $07)), camera, local0\Field82, 8.0, rnd(0.3, 0.5), $00, $00)
                                    EndIf
                                Else
                                    local0\Field59 = Null
                                    local0\Field66 = 3.0
                                EndIf
                            Case 3.0
                                local13 = entitydistancesquared(local0\Field82, XZ0260X8X2\Field74)
                                If (0.0 >= local0\Field8) Then
                                    local0\Field30 = findpath(local0, entityx(XZ0260X8X2\Field74, $00, 1.0), entityy(XZ0260X8X2\Field74, $00, 1.0), entityz(XZ0260X8X2\Field74, $00, 1.0))
                                    If (local0\Field30 <> $01) Then
                                        local51 = entitydistancesquared(playerroom\Field15, local0\Field82)
                                        local52 = playerroom
                                        local53 = 0.0
                                        For local11 = $00 To $03 Step $01
                                            If (playerroom\Field29[local11] <> Null) Then
                                                local53 = entitydistancesquared(playerroom\Field29[local11]\Field15, local0\Field82)
                                                If (local51 > local53) Then
                                                    local51 = local53
                                                    local52 = playerroom\Field29[local11]
                                                EndIf
                                            EndIf
                                        Next
                                        local0\Field30 = findpath(local0, entityx(local52\Field15, $00, 1.0), 0.5, entityz(local52\Field15, $00, 1.0))
                                    ElseIf (local0\Field30 = $01) Then
                                        While (local0\Field71[local0\Field48] = Null)
                                            If (local0\Field48 > $14) Then
                                                local0\Field48 = $00
                                                local0\Field30 = $00
                                                Exit
                                            Else
                                                local0\Field48 = (local0\Field48 + $01)
                                            EndIf
                                        Wend
                                        If (local0\Field48 < $14) Then
                                            If (((local0\Field71[local0\Field48] <> Null) And (local0\Field71[(local0\Field48 + $01)] <> Null)) <> 0) Then
                                                If (local0\Field71[local0\Field48]\Field7 = Null) Then
                                                    If ((Abs deltayaw(local0\Field82, local0\Field71[(local0\Field48 + $01)]\Field0)) < (Abs deltayaw(local0\Field82, local0\Field71[local0\Field48]\Field0))) Then
                                                        local0\Field48 = (local0\Field48 + $01)
                                                    EndIf
                                                EndIf
                                                usedoornpc(local0, $01, $00)
                                            EndIf
                                        EndIf
                                    EndIf
                                    local0\Field8 = (rnd(6.0, 10.0) * 70.0)
                                Else
                                    If (0.49 > local13) Then
                                        If ((entityvisible(XZ0260X8X2\Field74, local0\Field82, 0.0) And (chs\Field8 = $00)) <> 0) Then
                                            local0\Field65 = 70.0
                                            local0\Field66 = 4.0
                                        EndIf
                                    EndIf
                                    If (local0\Field30 = $01) Then
                                        If (local0\Field71[local0\Field48] = Null) Then
                                            If (local0\Field48 > $14) Then
                                                local0\Field48 = $00
                                                local0\Field30 = $00
                                            Else
                                                local0\Field48 = (local0\Field48 + $01)
                                            EndIf
                                        Else
                                            pointentity(local0\Field82, local0\Field71[local0\Field48]\Field0, 0.0)
                                            rotateentity(local0\Field82, 0.0, entityyaw(local0\Field82, $01, 1.0), 0.0, $01)
                                            local0\Field64 = curvevalue(((local0\Field32 * 0.6) * (Float (81.9 < local0\Field103))), local0\Field64, 20.0)
                                            moveentity(local0\Field82, 0.0, 0.0, (local0\Field64 * fps\Field3[$00]), $00)
                                            local0\Field84 = curveangle(entityyaw(local0\Field82, $01, 1.0), local0\Field84, 20.0)
                                            usedoornpc(local0, $01, $00)
                                        EndIf
                                        local0\Field8 = (local0\Field8 - fps\Field3[$00])
                                    Else
                                        local0\Field64 = curvevalue(0.0, local0\Field64, 10.0)
                                        local0\Field8 = (local0\Field8 - (fps\Field3[$00] * 2.0))
                                    EndIf
                                EndIf
                                If (0.005 > local0\Field64) Then
                                    If (131.0 > local0\Field103) Then
                                        animatenpc(local0, 112.0, 130.0, 0.3, $00)
                                    Else
                                        animatenpc(local0, 593.0, 669.0, 0.2, $01)
                                    EndIf
                                Else
                                    animatenpc(local0, clamp(animtime(local0\Field98), 62.0, 82.0), 111.0, (local0\Field64 * 26.0), $01)
                                    If ((((83.0 > local21) And (83.0 <= local0\Field103)) Lor ((99.0 > local21) And (99.0 <= local0\Field103))) <> 0) Then
                                        playsoundex(TXDBZF46ZXF(getstepsound(local0\Field82), $00, rand($00, $07)), camera, local0\Field82, 8.0, rnd(0.3, 0.5), $00, $00)
                                    EndIf
                                EndIf
                                If (local13 > ((hidedistance * 1.5) * (hidedistance * 1.5))) Then
                                    If (local0\Field43 < (((20.0 - ((Float selecteddifficulty\Field2) * 10.0)) + (10.0 * (Float remotedooron))) * 70.0)) Then
                                        local0\Field43 = (local0\Field43 + fps\Field3[$00])
                                    ElseIf (rand((($104 - (selecteddifficulty\Field2 * $50)) + ((remotedooron = $00) * $50)), $01) = $01) Then
                                        If (playerinreachableroom($00, $00, $01) <> 0) Then
                                            teleportcloser(local0)
                                            local0\Field43 = 0.0
                                        EndIf
                                    EndIf
                                Else
                                    local0\Field43 = 0.0
                                EndIf
                                If (0.0 >= local0\Field20) Then
                                    If (local0\Field59 = Null) Then
                                        If (npcseesplayer(local0, (8.0 - XZ0260X8X2\Field46), 75.0, $00) = $01) Then
                                            local0\Field65 = 140.0
                                            local0\Field66 = 2.0
                                            Return $00
                                        EndIf
                                    EndIf
                                    For local1 = Each npcs
                                        If ((((local1\Field77 = $18) Lor (local1\Field77 = $02)) And (local1\Field1 = $00)) <> 0) Then
                                            If (npcseesnpc(local1, local0, 36.0) = $01) Then
                                                local0\Field59 = local1
                                                local0\Field65 = 140.0
                                                local0\Field66 = 2.0
                                                Return $00
                                                Exit
                                            EndIf
                                        EndIf
                                    Next
                                    local0\Field20 = 35.0
                                Else
                                    local0\Field20 = (local0\Field20 - fps\Field3[$00])
                                EndIf
                            Case 4.0
                                local0\Field64 = 0.0
                                If (local0\Field59 = Null) Then
                                    pointentity(local0\Field82, XZ0260X8X2\Field74, 0.0)
                                Else
                                    pointentity(local0\Field82, local0\Field59\Field82, 0.0)
                                EndIf
                                rotateentity(local0\Field82, 0.0, entityyaw(local0\Field82, $01, 1.0), 0.0, $01)
                                local0\Field84 = curveangle(entityyaw(local0\Field82, $01, 1.0), local0\Field84, 20.0)
                                local30 = $00
                                If (174.0 > local0\Field103) Then
                                    animatenpc(local0, 131.0, 174.0, 0.6, $00)
                                    local30 = ((155.0 <= local0\Field103) And (155.0 > local21))
                                    If (173.9 < local0\Field103) Then
                                        setnpcframe(local0, 62.0, $01)
                                        local0\Field66 = (XZ0260X8X2\Field48 + 2.0)
                                        Return $00
                                    EndIf
                                Else
                                    animatenpc(local0, 174.0, 200.0, 0.3, $00)
                                    local30 = ((189.0 <= local0\Field103) And (189.0 > local21))
                                    If (199.9 < local0\Field103) Then
                                        setnpcframe(local0, 62.0, $01)
                                        local0\Field66 = (XZ0260X8X2\Field48 + 2.0)
                                        Return $00
                                    EndIf
                                EndIf
                                If (local30 <> 0) Then
                                    If (local0\Field59 = Null) Then
                                        If (0.64 > entitydistancesquared(local0\Field82, XZ0260X8X2\Field74)) Then
                                            playsound_strict(snd_i\Field50[rand($05, $08)], $00, $00)
                                            injureplayer((rnd(0.4, 0.7) * difficultydmgmult), 1.0, 0.0, (0.225 * difficultydmgmult), (0.0875 * difficultydmgmult))
                                            XZ0260X8X2\Field1 = ((Float (0.0 = i_1025\Field1[$03])) * 2.5)
                                            If (3.0 < XZ0260X8X2\Field11) Then
                                                msg\Field8 = format(getlocalstring("death", "008"), subjectname, "%s")
                                                kill($01, $01, $00, $01)
                                            EndIf
                                        Else
                                            playsoundex(snd_i\Field49, camera, local0\Field82, 2.5, 1.0, $00, $00)
                                        EndIf
                                    ElseIf (0.64 > entitydistancesquared(local0\Field82, local0\Field59\Field82)) Then
                                        playsoundex(snd_i\Field50[rand($05, $08)], camera, local0\Field59\Field98, 10.0, 1.0, $00, $00)
                                        If (local0\Field59\Field4 > $00) Then
                                            local0\Field59\Field4 = (Int max(((Float local0\Field59\Field4) - rnd(10.0, 20.0)), 0.0))
                                        Else
                                            local0\Field59 = Null
                                            local0\Field66 = 3.0
                                            Return $00
                                        EndIf
                                    Else
                                        playsoundex(snd_i\Field49, camera, local0\Field82, 2.5, 1.0, $00, $00)
                                    EndIf
                                EndIf
                                If (local0\Field59 <> Null) Then
                                    If (local0\Field59\Field1 <> 0) Then
                                        local0\Field59 = Null
                                        local0\Field66 = 3.0
                                    EndIf
                                EndIf
                            Case 5.0
                                If (0.0 = (Float local0\Field17)) Then
                                    animatenpc(local0, 62.0, 44.0, -0.3, $00)
                                    If (44.1 > local0\Field103) Then
                                        local0\Field17 = $01
                                    EndIf
                                Else
                                    animatenpc(local0, 44.0, 62.0, 0.04, $00)
                                    If (61.9 < local0\Field103) Then
                                        local0\Field66 = 3.0
                                        local0\Field17 = $00
                                        Return $00
                                    EndIf
                                EndIf
                        End Select
                        If (((1.0 < local0\Field66) And (6.0 > local0\Field66)) <> 0) Then
                            local0\Field63 = loopsoundex(npcsound[$03], local0\Field63, camera, local0\Field82, 10.0, 1.0, $01)
                        EndIf
                        If (local0\Field4 <= $00) Then
                            local0\Field1 = $01
                        EndIf
                    Else
                        animatenpc(local0, 201.0, 347.0, 0.5, $00)
                    EndIf
                EndIf
                positionentity(local0\Field98, entityx(local0\Field82, $01, 1.0), (entityy(local0\Field82, $01, 1.0) - local0\Field23), entityz(local0\Field82, $01, 1.0), $01)
                rotateentity(local0\Field98, 0.0, (local0\Field84 - 180.0), 0.0, $01)
            Case $01
                If (66.0 <> local0\Field66) Then
                    If (local0\Field1 = $00) Then
                        local21 = local0\Field103
                        updatenpcblinking(local0)
                        Select local0\Field66
                            Case 0.0
                                setnpcframe(local0, 11.0, $01)
                                local0\Field84 = curveangle(entityyaw(local0\Field82, $01, 1.0), local0\Field84, 20.0)
                            Case 1.0
                                animatenpc(local0, 11.0, 29.0, 0.1, $00)
                                local0\Field84 = curveangle(entityyaw(local0\Field82, $01, 1.0), local0\Field84, 20.0)
                                If (28.9 < local0\Field103) Then
                                    local0\Field66 = 3.0
                                EndIf
                            Case 2.0
                                local0\Field65 = max((local0\Field65 - fps\Field3[$00]), 0.0)
                                If (0.0 < local0\Field65) Then
                                    If (local0\Field59 = Null) Then
                                        If (npcseesplayer(local0, (8.0 - XZ0260X8X2\Field46), 75.0, $00) = $01) Then
                                            local0\Field65 = 140.0
                                        EndIf
                                        If (entityvisible(local0\Field82, XZ0260X8X2\Field74, 0.0) <> 0) Then
                                            pointentity(local0\Field82, XZ0260X8X2\Field74, 0.0)
                                        EndIf
                                        local13 = entitydistancesquared(local0\Field82, XZ0260X8X2\Field74)
                                    Else
                                        If (npcseesnpc(local0\Field59, local0, 36.0) = $01) Then
                                            local0\Field65 = 140.0
                                            pointentity(local0\Field82, local0\Field59\Field82, 0.0)
                                        EndIf
                                        local13 = entitydistancesquared(local0\Field82, local0\Field59\Field82)
                                    EndIf
                                    rotateentity(local0\Field82, 0.0, entityyaw(local0\Field82, $01, 1.0), 0.0, $01)
                                    local0\Field64 = curvevalue(local0\Field32, local0\Field64, 20.0)
                                    If (9.0 > local13) Then
                                        animatenpc(local0, clamp(animtime(local0\Field98), 94.0, 95.0), 125.0, (local0\Field64 * 26.0), $01)
                                    Else
                                        animatenpc(local0, min(animtime(local0\Field98), 64.0), 93.0, (local0\Field64 * 26.0), $01)
                                    EndIf
                                    moveentity(local0\Field82, 0.0, 0.0, (local0\Field64 * fps\Field3[$00]), $00)
                                    local0\Field84 = curveangle(entityyaw(local0\Field82, $01, 1.0), local0\Field84, 20.0)
                                    local0\Field8 = 140.0
                                    local0\Field30 = $00
                                    local0\Field48 = $00
                                    If (0.49 > local13) Then
                                        setnpcframe(local0, 126.0, $01)
                                        local0\Field66 = 4.0
                                        Return $00
                                    EndIf
                                    If ((((((65.0 > local21) And (65.0 <= local0\Field103)) Lor ((80.0 > local21) And (80.0 <= local0\Field103))) Lor ((97.0 > local21) And (97.0 <= local0\Field103))) Lor ((113.0 > local21) And (113.0 <= local0\Field103))) <> 0) Then
                                        playsoundex(TXDBZF46ZXF(getstepsound(local0\Field82), $00, rand($00, $07)), camera, local0\Field82, 8.0, rnd(0.3, 0.5), $00, $00)
                                    EndIf
                                Else
                                    local0\Field59 = Null
                                    local0\Field66 = 3.0
                                EndIf
                            Case 3.0
                                local13 = entitydistancesquared(local0\Field82, XZ0260X8X2\Field74)
                                If (0.0 >= local0\Field8) Then
                                    local0\Field30 = findpath(local0, entityx(XZ0260X8X2\Field74, $00, 1.0), entityy(XZ0260X8X2\Field74, $00, 1.0), entityz(XZ0260X8X2\Field74, $00, 1.0))
                                    If (local0\Field30 <> $01) Then
                                        local51 = entitydistancesquared(playerroom\Field15, local0\Field82)
                                        local52 = playerroom
                                        local53 = 0.0
                                        For local11 = $00 To $03 Step $01
                                            If (playerroom\Field29[local11] <> Null) Then
                                                local53 = entitydistancesquared(playerroom\Field29[local11]\Field15, local0\Field82)
                                                If (local51 > local53) Then
                                                    local51 = local53
                                                    local52 = playerroom\Field29[local11]
                                                EndIf
                                            EndIf
                                        Next
                                        local0\Field30 = findpath(local0, entityx(local52\Field15, $00, 1.0), 0.5, entityz(local52\Field15, $00, 1.0))
                                    ElseIf (local0\Field30 = $01) Then
                                        While (local0\Field71[local0\Field48] = Null)
                                            If (local0\Field48 > $14) Then
                                                local0\Field48 = $00
                                                local0\Field30 = $00
                                                Exit
                                            Else
                                                local0\Field48 = (local0\Field48 + $01)
                                            EndIf
                                        Wend
                                        If (local0\Field48 < $14) Then
                                            If (((local0\Field71[local0\Field48] <> Null) And (local0\Field71[(local0\Field48 + $01)] <> Null)) <> 0) Then
                                                If (local0\Field71[local0\Field48]\Field7 = Null) Then
                                                    If ((Abs deltayaw(local0\Field82, local0\Field71[(local0\Field48 + $01)]\Field0)) < (Abs deltayaw(local0\Field82, local0\Field71[local0\Field48]\Field0))) Then
                                                        local0\Field48 = (local0\Field48 + $01)
                                                    EndIf
                                                EndIf
                                                usedoornpc(local0, $01, $00)
                                            EndIf
                                        EndIf
                                    EndIf
                                    local0\Field8 = (rnd(6.0, 10.0) * 70.0)
                                Else
                                    If (0.49 > local13) Then
                                        If ((entityvisible(XZ0260X8X2\Field74, local0\Field82, 0.0) And (chs\Field8 = $00)) <> 0) Then
                                            local0\Field65 = 70.0
                                            local0\Field66 = 4.0
                                        EndIf
                                    EndIf
                                    If (local0\Field30 = $01) Then
                                        If (local0\Field71[local0\Field48] = Null) Then
                                            If (local0\Field48 > $14) Then
                                                local0\Field48 = $00
                                                local0\Field30 = $00
                                            Else
                                                local0\Field48 = (local0\Field48 + $01)
                                            EndIf
                                        Else
                                            pointentity(local0\Field82, local0\Field71[local0\Field48]\Field0, 0.0)
                                            rotateentity(local0\Field82, 0.0, entityyaw(local0\Field82, $01, 1.0), 0.0, $01)
                                            local0\Field64 = curvevalue((local0\Field32 * 0.6), local0\Field64, 20.0)
                                            moveentity(local0\Field82, 0.0, 0.0, (local0\Field64 * fps\Field3[$00]), $00)
                                            local0\Field84 = curveangle(entityyaw(local0\Field82, $01, 1.0), local0\Field84, 20.0)
                                            usedoornpc(local0, $01, $00)
                                        EndIf
                                        local0\Field8 = (local0\Field8 - fps\Field3[$00])
                                    Else
                                        local0\Field64 = curvevalue(0.0, local0\Field64, 10.0)
                                        local0\Field8 = (local0\Field8 - (fps\Field3[$00] * 2.0))
                                    EndIf
                                EndIf
                                If (0.005 > local0\Field64) Then
                                    animatenpc(local0, 323.0, 344.0, 0.2, $01)
                                Else
                                    animatenpc(local0, 64.0, 93.0, (local0\Field64 * 26.0), $01)
                                    If ((((65.0 > local21) And (65.0 <= local0\Field103)) Lor ((80.0 > local21) And (80.0 <= local0\Field103))) <> 0) Then
                                        playsoundex(TXDBZF46ZXF(getstepsound(local0\Field82), $00, rand($00, $07)), camera, local0\Field82, 8.0, rnd(0.3, 0.5), $00, $00)
                                    EndIf
                                EndIf
                                If (local13 > ((hidedistance * 1.5) * (hidedistance * 1.5))) Then
                                    If (local0\Field43 < (((20.0 - ((Float selecteddifficulty\Field2) * 10.0)) + (10.0 * (Float remotedooron))) * 70.0)) Then
                                        local0\Field43 = (local0\Field43 + fps\Field3[$00])
                                    ElseIf (rand((($104 - (selecteddifficulty\Field2 * $50)) + ((remotedooron = $00) * $50)), $01) = $01) Then
                                        If (playerinreachableroom($00, $00, $01) <> 0) Then
                                            teleportcloser(local0)
                                            local0\Field43 = 0.0
                                        EndIf
                                    EndIf
                                Else
                                    local0\Field43 = 0.0
                                EndIf
                                If (0.0 >= local0\Field20) Then
                                    If (local0\Field59 = Null) Then
                                        If (npcseesplayer(local0, (8.0 - XZ0260X8X2\Field46), 75.0, $00) = $01) Then
                                            local0\Field65 = 140.0
                                            local0\Field66 = 2.0
                                            Return $00
                                        EndIf
                                    EndIf
                                    For local1 = Each npcs
                                        If ((((local1\Field77 = $18) Lor (local1\Field77 = $02)) And (local1\Field1 = $00)) <> 0) Then
                                            If (npcseesnpc(local1, local0, 36.0) = $01) Then
                                                local0\Field59 = local1
                                                local0\Field65 = 140.0
                                                local0\Field66 = 2.0
                                                Return $00
                                                Exit
                                            EndIf
                                        EndIf
                                    Next
                                    local0\Field20 = 35.0
                                Else
                                    local0\Field20 = (local0\Field20 - fps\Field3[$00])
                                EndIf
                            Case 4.0
                                local0\Field64 = 0.0
                                If (local0\Field59 = Null) Then
                                    pointentity(local0\Field82, XZ0260X8X2\Field74, 0.0)
                                Else
                                    pointentity(local0\Field82, local0\Field59\Field82, 0.0)
                                EndIf
                                rotateentity(local0\Field82, 0.0, entityyaw(local0\Field82, $01, 1.0), 0.0, $01)
                                animatenpc(local0, 126.0, 165.0, 0.6, $00)
                                local0\Field84 = curveangle(entityyaw(local0\Field82, $01, 1.0), local0\Field84, 20.0)
                                If (((146.0 <= local0\Field103) And (146.0 > local21)) <> 0) Then
                                    If (local0\Field59 = Null) Then
                                        If (0.64 > entitydistancesquared(local0\Field82, XZ0260X8X2\Field74)) Then
                                            playsound_strict(snd_i\Field50[rand($05, $08)], $00, $00)
                                            injureplayer((rnd(0.4, 0.7) * difficultydmgmult), 1.0, 0.0, (0.225 * difficultydmgmult), (0.0875 * difficultydmgmult))
                                            XZ0260X8X2\Field1 = ((Float (0.0 = i_1025\Field1[$03])) * 2.5)
                                            If (3.0 < XZ0260X8X2\Field11) Then
                                                msg\Field8 = format(getlocalstring("death", "008"), subjectname, "%s")
                                                kill($01, $01, $00, $01)
                                            EndIf
                                        Else
                                            playsoundex(snd_i\Field49, camera, local0\Field82, 2.5, 1.0, $00, $00)
                                        EndIf
                                    ElseIf (0.64 > entitydistancesquared(local0\Field82, local0\Field59\Field82)) Then
                                        playsoundex(snd_i\Field50[rand($05, $08)], camera, local0\Field59\Field98, 10.0, 1.0, $00, $00)
                                        If (local0\Field59\Field4 > $00) Then
                                            local0\Field59\Field4 = (Int max(((Float local0\Field59\Field4) - rnd(10.0, 20.0)), 0.0))
                                        Else
                                            local0\Field59 = Null
                                            local0\Field66 = 3.0
                                            Return $00
                                        EndIf
                                    Else
                                        playsoundex(snd_i\Field49, camera, local0\Field82, 2.5, 1.0, $00, $00)
                                    EndIf
                                ElseIf (164.0 <= local0\Field103) Then
                                    local0\Field66 = (XZ0260X8X2\Field48 + 2.0)
                                EndIf
                                If (local0\Field59 <> Null) Then
                                    If (local0\Field59\Field1 <> 0) Then
                                        local0\Field59 = Null
                                        local0\Field66 = 3.0
                                    EndIf
                                EndIf
                            Case 5.0
                                If (0.0 = (Float local0\Field17)) Then
                                    animatenpc(local0, 59.0, 44.0, -0.3, $00)
                                    If (44.1 > local0\Field103) Then
                                        local0\Field17 = $01
                                    EndIf
                                Else
                                    animatenpc(local0, 44.0, 59.0, 0.04, $00)
                                    If (58.9 < local0\Field103) Then
                                        local0\Field66 = 3.0
                                        local0\Field17 = $00
                                        Return $00
                                    EndIf
                                EndIf
                        End Select
                        If (((1.0 < local0\Field66) And (6.0 > local0\Field66)) <> 0) Then
                            local0\Field63 = loopsoundex(npcsound[$03], local0\Field63, camera, local0\Field82, 10.0, 1.0, $01)
                        EndIf
                        If (local0\Field4 <= $00) Then
                            local0\Field1 = $01
                        EndIf
                    Else
                        animatenpc(local0, 344.0, 363.0, 0.5, $00)
                    EndIf
                EndIf
                positionentity(local0\Field98, entityx(local0\Field82, $01, 1.0), (entityy(local0\Field82, $01, 1.0) - local0\Field23), entityz(local0\Field82, $01, 1.0), $01)
                rotateentity(local0\Field98, 0.0, (local0\Field84 - 180.0), 0.0, $01)
            Case $15
                If (local0\Field1 = $00) Then
                    local13 = entitydistancesquared(local0\Field82, XZ0260X8X2\Field74)
                    Select local0\Field66
                        Case 0.0
                            animatenpc(local0, 1.0, 50.0, 0.3, $01)
                            If (((1.0 > local13) And ((chs\Field8 Lor i_268\Field3) = $00)) <> 0) Then
                                setnpcframe(local0, 51.0, $01)
                                local0\Field65 = (Float rand($00, $01))
                                local0\Field66 = 1.0
                            EndIf
                        Case 1.0
                            If (rand($64, $01) < $14) Then
                                turnentity(local0\Field82, 0.0, rnd(-8.0, 15.0), 0.0, $00)
                            EndIf
                            Select local0\Field65
                                Case 0.0
                                    local0\Field32 = 0.02
                                    local0\Field64 = curvevalue(local0\Field32, local0\Field64, 5.0)
                                    moveentity(local0\Field82, (sin((Float millisec)) * 0.015), 0.0, (local0\Field64 * fps\Field3[$00]), $00)
                                Case 1.0
                                    local0\Field32 = 0.015
                                    local0\Field64 = curvevalue(local0\Field32, local0\Field64, 5.0)
                                    moveentity(local0\Field82, 0.0, 0.0, (local0\Field64 * fps\Field3[$00]), $00)
                            End Select
                            animatenpc(local0, 51.0, 71.0, 0.3, $01)
                    End Select
                    If (((0.0 < XZ0260X8X2\Field76) And (0.09 > local13)) <> 0) Then
                        local0\Field4 = $00
                    EndIf
                    positionentity(local0\Field98, entityx(local0\Field82, $00, 1.0), (entityy(local0\Field82, $00, 1.0) - local0\Field23), entityz(local0\Field82, $00, 1.0), $00)
                    rotateentity(local0\Field98, entitypitch(local0\Field82, $00, 1.0), (entityyaw(local0\Field82, $00, 1.0) + 180.0), 0.0, $00)
                    If (local0\Field4 <= $00) Then
                        local26 = createpivot($00)
                        positionentity(local26, (entityx(local0\Field82, $00, 1.0) + rnd(-0.05, 0.05)), (entityy(local0\Field82, $00, 1.0) - 0.05), (entityz(local0\Field82, $00, 1.0) + rnd(-0.05, 0.05)), $00)
                        turnentity(local26, 90.0, 0.0, 0.0, $00)
                        If (entitypick(local26, 0.3) <> 0) Then
                            local3 = createdecal(rand($11, $12), pickedx(), (pickedy() + 0.005), pickedz(), 90.0, rnd(360.0, 0.0), 0.0, rnd(0.02, 0.03), 1.0, $00, $01, $00, $00, $00)
                            local3\Field14 = rnd(0.001, 0.0015)
                            local3\Field3 = (local3\Field9 + rnd(0.008, 0.009))
                            local3\Field5 = -0.0001
                        EndIf
                        freeentity(local26)
                        local26 = $00
                        local0\Field1 = $01
                    EndIf
                    If (((25.0 < local13) And (1.0 = local0\Field66)) <> 0) Then
                        local0\Field1 = $01
                    EndIf
                EndIf
            Case $0A
                If (0.1 < local0\Field31) Then
                    entityalpha(X2Z260BF0Z\Field1[$0B], 0.0)
                    local0\Field70 = 0.0
                    If (ChannelPlaying(local0\Field63) <> 0) Then
                        StopChannel(local0\Field63)
                        local0\Field63 = $00
                    EndIf
                    If (ChannelPlaying(local0\Field6) <> 0) Then
                        StopChannel(local0\Field6)
                        local0\Field6 = $00
                    EndIf
                    positionentity(local0\Field82, 0.0, -500.0, 0.0, $00)
                    resetentity(local0\Field82)
                Else
                    local101 = $00
                    local21 = local0\Field103
                    local13 = entitydistancesquared(XZ0260X8X2\Field74, local0\Field82)
                    local22 = $00
                    updatenpcblinking(local0)
                    LightColor(local0\Field101, (Int rnd(240.0, 255.0)), (Int rnd(135.0, 150.0)), (Int rnd(35.0, 50.0)))
                    LightRange(local0\Field101, rnd(2.5, 3.0))
                    If ((Int XZ0260X8X2\Field48) <> 0) Then
                        local101 = $01
                    EndIf
                    If (((0.36 > local13) And (chs\Field8 = $00)) <> 0) Then
                        If (3.0 > local0\Field66) Then
                            If (entityvisible(XZ0260X8X2\Field74, local0\Field82, 0.0) <> 0) Then
                                If (((T8660BZ460\Field10 = $02) Lor (T8660BZ460\Field10 = $04)) <> 0) Then
                                    removehazmattimer = (removehazmattimer - (fps\Field3[$00] * 1.5))
                                    If (0.0 >= removehazmattimer) Then
                                        For local11 = $00 To $02 Step $01
                                            If (((removehazmattimer < (- (((Float (T8660BZ460\Field10 = $04)) * 250.0) * (Float local11)))) And ((- (((Float (T8660BZ460\Field10 = $04)) * 250.0) * (Float local11))) <= ((fps\Field3[$00] * 1.5) + removehazmattimer))) <> 0) Then
                                                XZ0260X8X2\Field1 = 2.0
                                                If (local11 = $02) Then
                                                    For local11 = $00 To (maxitemamount - $01) Step $01
                                                        If (TX60DB8XBBZ(local11) <> Null) Then
                                                            If (((TX60DB8XBBZ(local11)\Field6\Field9 >= $3C) And (TX60DB8XBBZ(local11)\Field6\Field9 <= $3F)) <> 0) Then
                                                                createmsg(getlocalstring("msg", "suit.destroyed"), 6.0)
                                                                playsound_strict(snd_i\Field46[TX60DB8XBBZ(local11)\Field6\Field5], $00, $00)
                                                                T8660BZ460\Field10 = $00
                                                                removeitem(TX60DB8XBBZ(local11), $01)
                                                                Exit
                                                            EndIf
                                                        EndIf
                                                    Next
                                                EndIf
                                            EndIf
                                        Next
                                    EndIf
                                Else
                                    XZ0260X8X2\Field51 = 20.0
                                    XZ0260X8X2\Field64 = 500.0
                                    local101 = $01
                                    If (chs\Field0 = $00) Then
                                        playsound_strict(loadtempsound("SFX\SCP\294\Burn.ogg"), $00, $00)
                                        msg\Field8 = format(getlocalstring("death", "457"), subjectname, "%s")
                                        kill($00, $01, $00, $01)
                                        XZ0260X8X2\Field36 = $00
                                        local0\Field66 = 3.0
                                    EndIf
                                EndIf
                            EndIf
                        EndIf
                    ElseIf (4.0 > local13) Then
                        If (((T8660BZ460\Field10 <> $02) And (T8660BZ460\Field10 <> $04)) <> 0) Then
                            local101 = $02
                            XZ0260X8X2\Field11 = (XZ0260X8X2\Field11 + (fps\Field3[$00] * 0.0005))
                        ElseIf (0.0 < removehazmattimer) Then
                            removehazmattimer = (removehazmattimer - (fps\Field3[$00] * 0.8))
                        Else
                            local101 = $03
                            For local11 = $00 To $02 Step $01
                                If (((removehazmattimer < (- (((Float (T8660BZ460\Field10 = $04)) * 250.0) * (Float local11)))) And ((- (((Float (T8660BZ460\Field10 = $04)) * 250.0) * (Float local11))) <= ((fps\Field3[$00] * 1.5) + removehazmattimer))) <> 0) Then
                                    XZ0260X8X2\Field1 = 2.0
                                    If (local11 = $02) Then
                                        For local11 = $00 To (maxitemamount - $01) Step $01
                                            If (TX60DB8XBBZ(local11) <> Null) Then
                                                If (((TX60DB8XBBZ(local11)\Field6\Field9 >= $3C) And (TX60DB8XBBZ(local11)\Field6\Field9 <= $3F)) <> 0) Then
                                                    createmsg(getlocalstring("msg", "suit.destroyed"), 6.0)
                                                    T8660BZ460\Field10 = $00
                                                    removeitem(TX60DB8XBBZ(local11), $01)
                                                    Exit
                                                EndIf
                                            EndIf
                                        Next
                                    EndIf
                                EndIf
                            Next
                        EndIf
                    Else
                        removehazmattimer = min((fps\Field3[$00] + removehazmattimer), 500.0)
                    EndIf
                    local0\Field63 = loopsoundex(npcsound[$0B], local0\Field63, camera, local0\Field82, 10.0, 1.0, $01)
                    Select local0\Field66
                        Case 0.0
                        Case 1.0
                            local0\Field64 = curvevalue(0.0, local0\Field64, 5.0)
                            animatenpc(local0, 210.0, 235.0, 0.1, $01)
                            If (234.9 < local0\Field103) Then
                                local0\Field62 = (1050.0 / ((Float selecteddifficulty\Field8) + 1.0))
                                local0\Field66 = 2.0
                            EndIf
                        Case 2.0
                            If ((((1156.0 > local13) And (0.0 = local0\Field31)) And playerinreachableroom($01, $00, $01)) <> 0) Then
                                local0\Field65 = max((local0\Field65 - fps\Field3[$00]), 0.0)
                                local22 = npcseesplayer(local0, (10.0 - XZ0260X8X2\Field46), 75.0, $00)
                                If (0.0 < local0\Field65) Then
                                    If (local22 = $01) Then
                                        local0\Field65 = 140.0
                                    EndIf
                                    If (entityvisible(local0\Field82, XZ0260X8X2\Field74, 0.0) <> 0) Then
                                        pointentity(local0\Field82, XZ0260X8X2\Field74, 0.0)
                                    EndIf
                                    If (((local0\Field13 <= $01) And (ChannelPlaying(local0\Field6) = $00)) <> 0) Then
                                        local0\Field6 = playsoundex(npcsound[$0C], camera, local0\Field98, 10.0, 1.0, $00, $00)
                                        local0\Field13 = $02
                                    EndIf
                                    local0\Field30 = $00
                                    local0\Field8 = 0.0
                                    local0\Field48 = $00
                                    rotateentity(local0\Field82, 0.0, entityyaw(local0\Field82, $01, 1.0), 0.0, $01)
                                    local0\Field62 = max(0.0, (local0\Field62 - fps\Field3[$00]))
                                    If (((0.0 = local0\Field62) And (49.0 < local13)) <> 0) Then
                                        setnpcframe(local0, 444.0, $01)
                                        local0\Field6 = playsoundex(npcsound[$0C], camera, local0\Field98, 10.0, 1.0, $00, $00)
                                        For local11 = $00 To $13 Step $01
                                            entityparent(local0\Field33[local11]\Field2, $00, $01)
                                        Next
                                        local0\Field13 = $00
                                        local0\Field66 = 4.0
                                    EndIf
                                    If (0.25 < local13) Then
                                        local0\Field64 = curvevalue(local0\Field32, local0\Field64, 25.0)
                                        moveentity(local0\Field82, 0.0, 0.0, (local0\Field64 * fps\Field3[$00]), $00)
                                        animatenpc(local0, 301.0, 319.0, (local0\Field64 * 18.0), $01)
                                    EndIf
                                    local0\Field84 = curveangle(entityyaw(local0\Field82, $01, 1.0), local0\Field84, (10.0 - (Float selecteddifficulty\Field8)))
                                Else
                                    If (local22 = $01) Then
                                        giveachievement("457", $01)
                                        local0\Field65 = 140.0
                                    EndIf
                                    If (local0\Field30 = $01) Then
                                        While (local0\Field71[local0\Field48] = Null)
                                            If (local0\Field48 > $14) Then
                                                local0\Field48 = $00
                                                local0\Field30 = $00
                                                Exit
                                            Else
                                                local0\Field48 = (local0\Field48 + $01)
                                            EndIf
                                        Wend
                                        If (local0\Field71[local0\Field48] <> Null) Then
                                            local0\Field64 = curvevalue((local0\Field32 * 0.7), local0\Field64, 25.0)
                                            pointentity(local0\Field82, local0\Field71[local0\Field48]\Field0, 0.0)
                                            rotateentity(local0\Field82, 0.0, entityyaw(local0\Field82, $01, 1.0), 0.0, $01)
                                            moveentity(local0\Field82, 0.0, 0.0, (local0\Field64 * fps\Field3[$00]), $00)
                                            animatenpc(local0, 236.0, 260.0, (local0\Field64 * 18.0), $01)
                                            local0\Field84 = curveangle(entityyaw(local0\Field82, $01, 1.0), local0\Field84, (10.0 - (Float selecteddifficulty\Field8)))
                                            usedoornpc(local0, $01, $00)
                                            If (((rand($258, $01) = $01) And (0.0 = local0\Field65)) <> 0) Then
                                                local0\Field13 = $00
                                            EndIf
                                            If (local0\Field13 > $01) Then
                                                local0\Field13 = $01
                                            EndIf
                                        EndIf
                                    Else
                                        local0\Field8 = (local0\Field8 + fps\Field3[$00])
                                        local0\Field64 = 0.0
                                        If (((2.0 - (Float selecteddifficulty\Field2)) * 70.0) < local0\Field8) Then
                                            local0\Field30 = findpath(local0, entityx(XZ0260X8X2\Field74, $00, 1.0), entityy(XZ0260X8X2\Field74, $00, 1.0), entityz(XZ0260X8X2\Field74, $00, 1.0))
                                            local0\Field8 = 0.0
                                            local0\Field57 = 0.0
                                            If (local0\Field30 <> $01) Then
                                                local51 = entitydistancesquared(playerroom\Field15, local0\Field82)
                                                local52 = playerroom
                                                local53 = 0.0
                                                For local11 = $00 To $03 Step $01
                                                    If (playerroom\Field29[local11] <> Null) Then
                                                        local53 = entitydistancesquared(playerroom\Field29[local11]\Field15, local0\Field82)
                                                        If (local51 > local53) Then
                                                            local51 = local53
                                                            local52 = playerroom\Field29[local11]
                                                        EndIf
                                                    EndIf
                                                Next
                                                local0\Field30 = findpath(local0, entityx(local52\Field15, $00, 1.0), 0.5, entityz(local52\Field15, $00, 1.0))
                                            EndIf
                                            While (3.0 > (Float (Int local0\Field57)))
                                                If (local0\Field30 = $01) Then
                                                    If (local0\Field71[$01] <> Null) Then
                                                        If (((local0\Field71[$02] = Null) And (0.16 > entitydistancesquared(local0\Field71[$01]\Field0, local0\Field82))) <> 0) Then
                                                            local0\Field48 = $00
                                                            local0\Field30 = $00
                                                        EndIf
                                                    EndIf
                                                    If (((local0\Field71[$00] <> Null) And (local0\Field71[$01] = Null)) <> 0) Then
                                                        local0\Field48 = $00
                                                        local0\Field30 = $00
                                                    EndIf
                                                EndIf
                                                If (local0\Field30 <> $01) Then
                                                    local51 = 10000.0
                                                    local52 = playerroom
                                                    local53 = 0.0
                                                    For local11 = $00 To $03 Step $01
                                                        If (playerroom\Field29[local11] <> Null) Then
                                                            local53 = entitydistancesquared(playerroom\Field29[local11]\Field15, local0\Field82)
                                                            If (local51 > local53) Then
                                                                local51 = local53
                                                                For local12 = $00 To $03 Step $01
                                                                    If (playerroom\Field29[local11]\Field29[local12] <> Null) Then
                                                                        If (playerroom\Field29[local11]\Field29[local12] <> playerroom) Then
                                                                            local52 = playerroom\Field29[local11]\Field29[local12]
                                                                            Exit
                                                                        EndIf
                                                                    EndIf
                                                                Next
                                                            EndIf
                                                        EndIf
                                                    Next
                                                    local0\Field30 = findpath(local0, entityx(local52\Field15, $00, 1.0), 0.5, entityz(local52\Field15, $00, 1.0))
                                                EndIf
                                                If (local0\Field30 = $01) Then
                                                    If (local0\Field71[$01] <> Null) Then
                                                        If (local0\Field71[$01]\Field7 <> Null) Then
                                                            If (((((local0\Field71[$01]\Field7\Field21 > $00) Lor (local0\Field71[$01]\Field7\Field44 <> $00)) Lor (local0\Field71[$01]\Field7\Field52 <> $00)) And (local0\Field71[$01]\Field7\Field39 = $00)) <> 0) Then
                                                                Repeat
                                                                    If (local0\Field48 > $14) Then
                                                                        local0\Field48 = $00
                                                                        local0\Field30 = $00
                                                                        Exit
                                                                    Else
                                                                        local0\Field48 = (local0\Field48 + $01)
                                                                    EndIf
                                                                    If (local0\Field71[local0\Field48] <> Null) Then
                                                                        If ((45.0 - (Abs deltayaw(local0\Field82, local0\Field71[$01]\Field0))) < (Abs deltayaw(local0\Field82, local0\Field71[local0\Field48]\Field0))) Then
                                                                            local0\Field57 = 3.0
                                                                            Exit
                                                                        EndIf
                                                                    EndIf
                                                                Forever
                                                            Else
                                                                local0\Field57 = 3.0
                                                            EndIf
                                                        Else
                                                            local0\Field57 = 3.0
                                                        EndIf
                                                    EndIf
                                                EndIf
                                                local0\Field57 = (local0\Field57 + 1.0)
                                            Wend
                                        EndIf
                                        animatenpc(local0, 210.0, 235.0, 0.1, $01)
                                    EndIf
                                EndIf
                            ElseIf (0.0 = local0\Field31) Then
                                If (ChannelPlaying(local0\Field63) <> 0) Then
                                    StopChannel(local0\Field63)
                                    local0\Field63 = $00
                                EndIf
                                If (ChannelPlaying(local0\Field6) <> 0) Then
                                    StopChannel(local0\Field6)
                                    local0\Field6 = $00
                                EndIf
                            EndIf
                        Case 3.0
                            animatenpc(local0, 357.0, 381.0, 0.15, $01)
                            positionentity(local0\Field82, curvevalue(entityx(XZ0260X8X2\Field74, $00, 1.0), entityx(local0\Field82, $00, 1.0), 20.0), entityy(local0\Field82, $00, 1.0), curvevalue(entityz(XZ0260X8X2\Field74, $00, 1.0), entityz(local0\Field82, $00, 1.0), 20.0), $00)
                            local0\Field84 = curveangle(entityyaw(XZ0260X8X2\Field74, $00, 1.0), local0\Field84, 10.0)
                        Case 4.0
                            local0\Field42 = 0.0
                            entitytype(local0\Field82, $00, $00)
                            translateentity(local0\Field82, 0.0, ((entityy(XZ0260X8X2\Field74, $00, 1.0) - entityy(local0\Field82, $00, 1.0)) / 200.0), 0.0, $00)
                            Select local0\Field13
                                Case $00
                                    animatenpc(local0, 444.0, 493.0, 0.4, $00)
                                    local104 = (entityx(local0\Field82, $00, 1.0) + rnd(-0.5, 0.5))
                                    local105 = (entityy(local0\Field82, $00, 1.0) + rnd(-0.5, 0.5))
                                    local106 = (entityz(local0\Field82, $00, 1.0) + rnd(-0.5, 0.5))
                                    For local11 = $00 To $13 Step $01
                                        local107 = entityx(local0\Field33[local11]\Field2, $00, 1.0)
                                        local108 = entityy(local0\Field33[local11]\Field2, $00, 1.0)
                                        local109 = entityz(local0\Field33[local11]\Field2, $00, 1.0)
                                        local107 = curvevalue(local104, local107, 100.0)
                                        local108 = curvevalue(local105, local108, 100.0)
                                        local109 = curvevalue(local106, local109, 100.0)
                                        positionentity(local0\Field33[local11]\Field2, local107, local108, local109, $00)
                                    Next
                                    If (492.9 < local0\Field103) Then
                                        For local11 = $00 To $13 Step $01
                                            entityparent(local0\Field33[local11]\Field2, local0\Field82, $01)
                                        Next
                                        loadnpcsound(local0, (("SFX\SCP\457\Ball" + (Str rand($00, $01))) + ".ogg"), $01)
                                        playsoundex(local0\Field67, camera, local0\Field82, 10.0, 1.0, $00, $00)
                                        local0\Field60 = entityx(XZ0260X8X2\Field74, $01, 1.0)
                                        local0\Field61 = entityy(XZ0260X8X2\Field74, $01, 1.0)
                                        local0\Field74 = entityz(XZ0260X8X2\Field74, $01, 1.0)
                                        local0\Field13 = $01
                                    EndIf
                                Case $01
                                    local0\Field32 = 0.14
                                    If (0.0 < local0\Field8) Then
                                        local0\Field8 = max((local0\Field8 - fps\Field3[$00]), 0.0)
                                        If (local0\Field30 = $01) Then
                                            While (local0\Field71[local0\Field48] = Null)
                                                If (local0\Field48 > $14) Then
                                                    local0\Field48 = $00
                                                    local0\Field30 = $00
                                                    Exit
                                                Else
                                                    local0\Field48 = (local0\Field48 + $01)
                                                EndIf
                                            Wend
                                            If (local0\Field71[local0\Field48] <> Null) Then
                                                translateentity(local0\Field82, 0.0, (((entityy(local0\Field71[local0\Field48]\Field0, $01, 1.0) + 0.5) - entityy(local0\Field82, $00, 1.0)) / 100.0), 0.0, $00)
                                                pointentity(local0\Field98, local0\Field71[local0\Field48]\Field0, 0.0)
                                                local14 = entitydistancesquared(local0\Field82, local0\Field71[local0\Field48]\Field0)
                                                rotateentity(local0\Field82, 0.0, entityyaw(local0\Field82, $01, 1.0), 0.0, $01)
                                                local0\Field64 = curvevalue(local0\Field32, local0\Field64, 10.0)
                                                If (0.1 > local14) Then
                                                    local0\Field48 = (local0\Field48 + $01)
                                                EndIf
                                            EndIf
                                        Else
                                            local0\Field64 = curvevalue(0.0, local0\Field64, 10.0)
                                        EndIf
                                    Else
                                        local0\Field30 = findpath(local0, local0\Field60, (local0\Field61 + 0.2), local0\Field74)
                                        local0\Field8 = 700.0
                                        local0\Field64 = 0.0
                                    EndIf
                                    moveentity(local0\Field82, 0.0, 0.0, (local0\Field64 * fps\Field3[$00]), $00)
                                    If (9.0 > distancesquared(entityx(local0\Field82, $00, 1.0), local0\Field60, entityz(local0\Field82, $00, 1.0), local0\Field74, 0.0, 0.0)) Then
                                        For local11 = $00 To $13 Step $01
                                            entityparent(local0\Field33[local11]\Field2, $00, $01)
                                        Next
                                        local0\Field60 = 0.0
                                        local0\Field61 = 0.0
                                        local0\Field74 = 0.0
                                        local0\Field13 = $02
                                    EndIf
                                Case $02
                                    For local11 = $00 To $13 Step $01
                                        local104 = entityx(local0\Field39[local11], $01, 1.0)
                                        local105 = entityy(local0\Field39[local11], $01, 1.0)
                                        local106 = entityz(local0\Field39[local11], $01, 1.0)
                                        local107 = entityx(local0\Field33[local11]\Field2, $00, 1.0)
                                        local108 = entityy(local0\Field33[local11]\Field2, $00, 1.0)
                                        local109 = entityz(local0\Field33[local11]\Field2, $00, 1.0)
                                        local107 = curvevalue(local104, local107, 70.0)
                                        local108 = curvevalue(local105, local108, 70.0)
                                        local109 = curvevalue(local106, local109, 70.0)
                                        positionentity(local0\Field33[local11]\Field2, local107, local108, local109, $01)
                                    Next
                                    animatenpc(local0, 493.0, 444.0, -0.4, $00)
                                    If (444.1 > local0\Field103) Then
                                        entitytype(local0\Field82, $02, $00)
                                        For local11 = $00 To $13 Step $01
                                            entityparent(local0\Field33[local11]\Field2, local0\Field39[local11], $01)
                                        Next
                                        local0\Field8 = 0.0
                                        local0\Field62 = (1050.0 / ((Float selecteddifficulty\Field8) + 1.0))
                                        local0\Field42 = 1.0
                                        local0\Field32 = 0.025
                                        local0\Field66 = 2.0
                                    EndIf
                            End Select
                    End Select
                    updatesoundorigin(local0\Field6, camera, local0\Field82, 10.0, 1.0, $01, $01, $00)
                    local0\Field17 = (Int max(((Float local0\Field17) - fps\Field3[$00]), 0.0))
                    Select local101
                        Case $00
                            local0\Field38 = curvevalue(0.0, local0\Field38, 30.0)
                        Case $01
                            local0\Field38 = curvevalue(1.0, local0\Field38, 30.0)
                        Case $02
                            local0\Field38 = curvevalue(0.25, local0\Field38, 60.0)
                        Case $03
                            local0\Field38 = curvevalue(0.1, local0\Field38, 60.0)
                    End Select
                    entityalpha(X2Z260BF0Z\Field1[$0B], local0\Field38)
                EndIf
                positionentity(local0\Field98, entityx(local0\Field82, $01, 1.0), (entityy(local0\Field82, $01, 1.0) - local0\Field23), entityz(local0\Field82, $01, 1.0), $01)
                rotateentity(local0\Field98, 0.0, (local0\Field84 - 180.0), 0.0, $01)
        End Select
        local111 = distancesquared(entityx(XZ0260X8X2\Field74, $00, 1.0), entityx(local0\Field82, $00, 1.0), entityz(XZ0260X8X2\Field74, $00, 1.0), entityz(local0\Field82, $00, 1.0), 0.0, 0.0)
        If ((((T8660BZ460\Field2 > $00) And (T8660BZ460\Field8 = $02)) And (0.0 >= T8660BZ460\Field1)) <> 0) Then
            local0\Field100 = entityx(local0\Field82, $01, 1.0)
            local0\Field14 = entityy(local0\Field82, $01, 1.0)
            local0\Field97 = entityz(local0\Field82, $01, 1.0)
        EndIf
        If (local0\Field1 <> 0) Then
            If (1.0 = local0\Field42) Then
                entitytype(local0\Field82, $05, $00)
                local112 = $00
                Select local0\Field77
                    Case $02
                        If (548.9 < local0\Field103) Then
                            local26 = createpivot($00)
                            positionentity(local26, entityx(local0\Field82, $00, 1.0), entityy(local0\Field82, $00, 1.0), entityz(local0\Field82, $00, 1.0), $00)
                            turnentity(local26, 90.0, 0.0, 0.0, $00)
                            If (entitypick(local26, 0.5) <> 0) Then
                                local3 = createdecal($01, entityx(local0\Field82, $00, 1.0), (pickedy() + 0.005), entityz(local0\Field82, $00, 1.0), 90.0, rnd(360.0, 0.0), 0.0, 0.5, 1.0, $00, $01, $00, $00, $00)
                                local3\Field14 = 0.0005
                                local3\Field3 = 0.2
                                local3\Field14 = -0.0001
                                entityparent(local3\Field0, playerroom\Field15, $01)
                            EndIf
                            freeentity(local26)
                            local26 = $00
                            playsoundex(loadtempsound("SFX\Room\PocketDimension\Impact.ogg"), camera, local0\Field82, 4.0, 0.8, $00, $00)
                            hideentity(local0\Field82)
                            hideentity(local0\Field98)
                            local112 = $01
                            local0\Field42 = 0.0
                        EndIf
                    Case $11,$15
                        hideentity(local0\Field82)
                        hideentity(local0\Field98)
                        local112 = $01
                        local0\Field22 = $01
                        local0\Field42 = 0.0
                    Case $17
                        local0\Field99 = createpivot(findchild(local0\Field98, "Thumb01.R.001"))
                        entityradius(local0\Field99, 0.35, 0.0)
                        entitypickmode(local0\Field99, $01, $00)
                        local112 = $01
                        local0\Field59 = Null
                        local0\Field9 = -1.0
                        local0\Field42 = 0.0
                    Default
                        local112 = $01
                        local0\Field59 = Null
                        local0\Field9 = -1.0
                        local0\Field42 = 0.0
                End Select
                If (local112 <> 0) Then
                    If (ChannelPlaying(local0\Field63) <> 0) Then
                        StopChannel(local0\Field63)
                        local0\Field63 = $00
                    EndIf
                    If (local0\Field55 <> $00) Then
                        freesound_strict(local0\Field55)
                        local0\Field55 = $00
                    EndIf
                    If (ChannelPlaying(local0\Field6) <> 0) Then
                        StopChannel(local0\Field6)
                        local0\Field6 = $00
                    EndIf
                    If (local0\Field67 <> $00) Then
                        freesound_strict(local0\Field67)
                        local0\Field67 = $00
                    EndIf
                EndIf
            EndIf
            If (local0\Field77 = $17) Then
                If (local0\Field99 <> $00) Then
                    If (1.0 > entitydistancesquared(local0\Field99, XZ0260X8X2\Field74)) Then
                        If (entitypick(camera, 1.0) = local0\Field99) Then
                            handentity = local0\Field99
                            If (XZ0260X8X2\Field3 <> 0) Then
                                local114 = rand($05, $01)
                                If (playerroom\Field22\Field7 = $57) Then
                                    local114 = $06
                                EndIf
                                createmsg(getlocalstring("msg", ("pickup.wpn_" + (Str local114))), 6.0)
                                handentity = $00
                                freeentity(local0\Field99)
                                local0\Field99 = $00
                            EndIf
                        EndIf
                    EndIf
                EndIf
            EndIf
        Else
            If (((local111 < ((hidedistance / 2.0) * (hidedistance / 2.0))) Lor (local0\Field77 = $12)) <> 0) Then
                If (local0\Field24 = infacility) Then
                    local115 = $00
                    local116 = countcollisions(local0\Field82)
                    For local11 = $01 To local116 Step $01
                        If (collisiony(local0\Field82, local11) < (entityy(local0\Field82, $00, 1.0) - 0.01)) Then
                            local115 = $01
                            Exit
                        EndIf
                    Next
                    If (local115 <> 0) Then
                        local0\Field70 = 0.0
                    ElseIf (shouldentitiesfall <> 0) Then
                        local117 = $00
                        If (local0\Field24 = $00) Then
                            local0\Field90 = GUESSEDloadxb(local0\Field82, $00)
                            If (local0\Field90 <> Null) Then
                                If (((local0\Field90 = playerroom) Lor isroomadjacent(local0\Field90, playerroom)) <> 0) Then
                                    local117 = $01
                                EndIf
                                For local11 = $00 To $03 Step $01
                                    If (isroomadjacent(local0\Field90, playerroom\Field29[local11]) <> 0) Then
                                        local117 = $01
                                        Exit
                                    EndIf
                                Next
                            EndIf
                            If ((((forest_event <> Null) And (forest_event\Field19 = playerroom)) And (1.0 = forest_event\Field4)) <> 0) Then
                                local117 = $01
                            EndIf
                        Else
                            local117 = $01
                        EndIf
                        If (local117 <> 0) Then
                            local0\Field70 = max((local0\Field70 - ((fps\Field3[$00] * 0.005) * local0\Field42)), (- local0\Field46))
                            translateentity(local0\Field82, 0.0, local0\Field70, 0.0, $00)
                        ElseIf (0.0 < local0\Field37) Then
                            local0\Field70 = 0.0
                        Else
                            local0\Field70 = max((local0\Field70 - ((fps\Field3[$00] * 0.005) * local0\Field42)), (- local0\Field46))
                            translateentity(local0\Field82, 0.0, local0\Field70, 0.0, $00)
                        EndIf
                    Else
                        local0\Field70 = 0.0
                    EndIf
                Else
                    local0\Field70 = 0.0
                EndIf
            Else
                local0\Field70 = 0.0
            EndIf
            updatenpcice(local0)
        EndIf
        If (local0 <> Null) Then
            catcherrors((((((("Uncaught: UpdateNPCs(NPC Name: " + chr($22)) + local0\Field72) + chr($22)) + ", ID: ") + (Str local0\Field77)) + ")"))
        Else
            catcherrors("Uncaught: UpdateNPCs(Deleted NPC!")
        EndIf
    Next
    updatecameracheck()
    Return $00
End Function

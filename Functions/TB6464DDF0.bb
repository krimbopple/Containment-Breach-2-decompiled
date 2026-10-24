Function TB6464DDF0%(arg0.npcs)
    Local local0.rooms
    Local local1%
    Local local2.npcs
    Local local3.waypoints
    Local local4%
    Local local5%
    Local local6.emitter
    Local local7%
    Local local8#
    Local local9%
    Local local10%
    Local local11#
    Local local12#
    Local local13#
    Local local14#
    Local local15#
    Local local16%
    Local local17#
    Local local18.npcs
    Local local19%
    Local local22#
    Local local24.waypoints
    Local local25#
    Local local26#
    Local local27%
    Local local28%
    If (66.0 = arg0\Field66) Then
        positionentity(arg0\Field98, entityx(arg0\Field82, $01, 1.0), (entityy(arg0\Field82, $01, 1.0) - arg0\Field23), entityz(arg0\Field82, $01, 1.0), $01)
        rotateentity(arg0\Field98, -90.0, arg0\Field84, 0.0, $01)
        Return $00
    EndIf
    If (arg0\Field1 <> 0) Then
        animatenpc(arg0, 1050.0, 1174.0, 0.8, $00)
    Else
        updatenpcblinking(arg0)
        arg0\Field62 = max((arg0\Field62 - fps\Field3[$00]), 0.0)
        If (((1.0 <> arg0\Field66) And (11.0 <> arg0\Field66)) <> 0) Then
            arg0\Field13 = $00
        EndIf
        arg0\Field6 = loopsoundex(npcsound[$01], arg0\Field6, camera, arg0\Field82, 10.0, 1.0, $01)
        local11 = arg0\Field103
        local12 = 0.0
        local13 = 0.0
        local14 = 0.0
        local17 = (fps\Field3[$00] * 2.0)
        local18 = Null
        If (arg0 <> n_i\Field11) Then
            If (arg0 = n_i\Field13) Then
                local18 = n_i\Field11
            Else
                local18 = n_i\Field13
            EndIf
        EndIf
        local19 = ((local18 <> Null) And (local18\Field1 = $00))
        Select arg0\Field66
            Case 0.0
                arg0\Field32 = 0.015
                If (local18 <> Null) Then
                    local8 = entitydistancesquared(arg0\Field82, local18\Field82)
                    If (0.64 > local8) Then
                        arg0\Field57 = 70.0
                    EndIf
                    If (0.0 < arg0\Field57) Then
                        arg0\Field30 = $00
                        arg0\Field48 = $00
                        arg0\Field8 = 1.0
                        arg0\Field57 = max((arg0\Field57 - fps\Field3[$00]), 0.0)
                    EndIf
                EndIf
                If (0.0 >= arg0\Field8) Then
                    If (local19 <> 0) Then
                        arg0\Field30 = findpath(arg0, entityx(local18\Field82, $01, 1.0), (entityy(local18\Field82, $01, 1.0) + 0.1), entityz(local18\Field82, $01, 1.0))
                    Else
                        If (2.0 = n_i\Field3\Field31) Then
                            For local0 = Each rooms
                                If (local0\Field22\Field21 = $03) Then
                                    local9 = $00
                                    local10 = createpivot($00)
                                    positionentity(local10, (local0\Field40 + 18.5), (local0\Field3 + 1.640625), (local0\Field37 + 14.74219), $01)
                                    If (12.25 > distancesquared(entityx(local10, $00, 1.0), entityx(arg0\Field82, $00, 1.0), entityz(local10, $00, 1.0), entityz(arg0\Field82, $00, 1.0), 0.0, 0.0)) Then
                                        local9 = $01
                                    EndIf
                                    freeentity(local10)
                                    local10 = $00
                                    If (((2.56 < distancesquared(entityx(arg0\Field82, $00, 1.0), (local0\Field40 + 18.5), entityz(arg0\Field82, $00, 1.0), (local0\Field37 + 14.74219), 0.0, 0.0)) And (local9 = $00)) <> 0) Then
                                        local12 = (local0\Field40 + 18.5)
                                        local13 = (local0\Field3 + 1.640625)
                                        local14 = (local0\Field37 + 14.74219)
                                        Exit
                                    ElseIf (((2.56 < distancesquared(entityx(arg0\Field82, $00, 1.0), (local0\Field40 + 18.5), entityz(arg0\Field82, $00, 1.0), (local0\Field37 + 14.74219), 0.0, 0.0)) And local9) <> 0) Then
                                        arg0\Field60 = (local0\Field40 + 18.5)
                                        arg0\Field61 = (local0\Field3 + 1.640625)
                                        arg0\Field74 = (local0\Field37 + 14.74219)
                                        Exit
                                    Else
                                        loadnpcsound(arg0, (("SFX\Character\MTF\173\Cont" + (Str rand($00, $03))) + ".ogg"), $00)
                                        playmtfsound(arg0\Field55, arg0)
                                        playannouncement("SFX\Character\MTF\Announc173Contain.ogg", $01)
                                        If (local0\Field25[$00]\Field39 <> 0) Then
                                            openclosedoor(local0\Field25[$00], $01, $00)
                                        EndIf
                                        n_i\Field3\Field31 = 3.0
                                        Exit
                                    EndIf
                                EndIf
                            Next
                        Else
                            For local0 = Each rooms
                                If ((((12.0 < (Abs (local0\Field40 - entityx(arg0\Field82, $01, 1.0)))) Lor (12.0 < (Abs (local0\Field37 - entityz(arg0\Field82, $01, 1.0))))) And (rand((Int max((Float ($04 - (Int (Abs (local0\Field37 - (entityz(arg0\Field82, $01, 1.0) / 8.0)))))), 2.0)), $01) = $01)) <> 0) Then
                                    local12 = local0\Field40
                                    local13 = 0.1
                                    local14 = local0\Field37
                                    Exit
                                EndIf
                            Next
                        EndIf
                        If (((0.0 = arg0\Field60) And (0.0 = arg0\Field74)) <> 0) Then
                            arg0\Field30 = findpath(arg0, local12, local13, local14)
                        Else
                            arg0\Field66 = 3.0
                        EndIf
                    EndIf
                    If (arg0\Field30 = $01) Then
                        While (arg0\Field71[arg0\Field48] = Null)
                            If (arg0\Field48 > $14) Then
                                arg0\Field48 = $00
                                arg0\Field30 = $00
                                Exit
                            Else
                                arg0\Field48 = (arg0\Field48 + $01)
                            EndIf
                        Wend
                        If (arg0\Field48 < $14) Then
                            If (((arg0\Field71[arg0\Field48] <> Null) And (arg0\Field71[(arg0\Field48 + $01)] <> Null)) <> 0) Then
                                If (arg0\Field71[arg0\Field48]\Field7 = Null) Then
                                    If ((Abs deltayaw(arg0\Field82, arg0\Field71[(arg0\Field48 + $01)]\Field0)) < (Abs deltayaw(arg0\Field82, arg0\Field71[arg0\Field48]\Field0))) Then
                                        arg0\Field48 = (arg0\Field48 + $01)
                                    EndIf
                                EndIf
                                usedoornpc(arg0, $01, $00)
                            EndIf
                        EndIf
                    EndIf
                    arg0\Field8 = ((rnd(6.0, 10.0) - (2.0 * (Float local19))) * 70.0)
                ElseIf (((175.0 >= arg0\Field8) And (local18 = Null)) <> 0) Then
                    arg0\Field64 = 0.0
                    If (rand($23, $01) = $01) Then
                        rotateentity(arg0\Field82, 0.0, rnd(360.0, 0.0), 0.0, $01)
                    EndIf
                    finishwalking(arg0, 488.0, 522.0, (arg0\Field32 * 26.0))
                    arg0\Field84 = curveangle(entityyaw(arg0\Field82, $01, 1.0), arg0\Field84, 20.0)
                    arg0\Field8 = (arg0\Field8 - fps\Field3[$00])
                Else
                    If (arg0\Field30 = $02) Then
                        arg0\Field64 = 0.0
                        If (rand($23, $01) = $01) Then
                            rotateentity(arg0\Field82, 0.0, rnd(360.0, 0.0), 0.0, $01)
                        EndIf
                        finishwalking(arg0, 488.0, 522.0, (arg0\Field32 * 26.0))
                        arg0\Field8 = (arg0\Field8 - local17)
                    ElseIf (arg0\Field30 = $01) Then
                        If (arg0\Field71[arg0\Field48] = Null) Then
                            If (arg0\Field48 > $14) Then
                                arg0\Field48 = $00
                                arg0\Field30 = $00
                            Else
                                arg0\Field48 = (arg0\Field48 + $01)
                            EndIf
                        Else
                            pointentity(arg0\Field82, arg0\Field71[arg0\Field48]\Field0, 0.0)
                            rotateentity(arg0\Field82, 0.0, entityyaw(arg0\Field82, $01, 1.0), 0.0, $01)
                            arg0\Field64 = curvevalue(arg0\Field32, arg0\Field64, 20.0)
                            translateentity(arg0\Field82, ((cos((entityyaw(arg0\Field82, $01, 1.0) + 90.0)) * arg0\Field64) * fps\Field3[$00]), 0.0, ((sin((entityyaw(arg0\Field82, $01, 1.0) + 90.0)) * arg0\Field64) * fps\Field3[$00]), $01)
                            animatenpc(arg0, 488.0, 522.0, (arg0\Field64 * 26.0), $01)
                            usedoornpc(arg0, $01, $01)
                        EndIf
                        arg0\Field8 = (arg0\Field8 - fps\Field3[$00])
                    Else
                        If (local18 = Null) Then
                            arg0\Field64 = 0.0
                            If (rand($23, $01) = $01) Then
                                rotateentity(arg0\Field82, 0.0, rnd(360.0, 0.0), 0.0, $01)
                            EndIf
                            finishwalking(arg0, 488.0, 522.0, (arg0\Field32 * 26.0))
                        ElseIf (0.0 >= arg0\Field57) Then
                            arg0\Field64 = 0.0
                            If (rand($23, $01) = $01) Then
                                rotateentity(arg0\Field82, 0.0, rnd(360.0, 0.0), 0.0, $01)
                            EndIf
                            finishwalking(arg0, 488.0, 522.0, (arg0\Field32 * 26.0))
                        Else
                            arg0\Field64 = curvevalue((- arg0\Field32), arg0\Field64, 20.0)
                            pointentity(arg0\Field82, local18\Field82, 0.0)
                            rotateentity(arg0\Field82, 0.0, entityyaw(arg0\Field82, $01, 1.0), 0.0, $01)
                            translateentity(arg0\Field82, ((cos((entityyaw(arg0\Field82, $01, 1.0) + 90.0)) * arg0\Field64) * fps\Field3[$00]), 0.0, ((sin((entityyaw(arg0\Field82, $01, 1.0) + 90.0)) * arg0\Field64) * fps\Field3[$00]), $01)
                            animatenpc(arg0, 522.0, 488.0, (arg0\Field64 * 26.0), $01)
                        EndIf
                        arg0\Field8 = (arg0\Field8 - local17)
                    EndIf
                    arg0\Field84 = curveangle(entityyaw(arg0\Field82, $01, 1.0), arg0\Field84, 20.0)
                EndIf
                If (0.0 >= arg0\Field20) Then
                    If (arg0\Field59 = Null) Then
                        local16 = npcseesplayer(arg0, (5.0 - XZ0260X8X2\Field46), 75.0, $00)
                        If (local16 > $00) Then
                            If (((arg0\Field17 > $00) And (1050.0 > (Float arg0\Field17))) <> 0) Then
                                If (local16 < $02) Then
                                    loadnpcsound(arg0, (("SFX\Character\MTF\ThereHeIs" + (Str rand($00, $05))) + ".ogg"), $00)
                                    playmtfsound(arg0\Field55, arg0)
                                EndIf
                            ElseIf (local16 = $01) Then
                                loadnpcsound(arg0, (("SFX\Character\MTF\Stop" + (Str rand($00, $05))) + ".ogg"), $00)
                                playmtfsound(arg0\Field55, arg0)
                            ElseIf (local16 = $02) Then
                                loadnpcsound(arg0, (("SFX\Character\MTF\ClassD" + (Str rand($00, $03))) + ".ogg"), $00)
                                playmtfsound(arg0\Field55, arg0)
                            EndIf
                            For local2 = Each npcs
                                If (local2\Field77 = $18) Then
                                    If (2.0 > local2\Field66) Then
                                        If (36.0 > entitydistancesquared(arg0\Field82, local2\Field82)) Then
                                            local2\Field60 = entityx(XZ0260X8X2\Field74, $01, 1.0)
                                            local2\Field61 = entityy(XZ0260X8X2\Field74, $01, 1.0)
                                            local2\Field74 = entityz(XZ0260X8X2\Field74, $01, 1.0)
                                            local2\Field8 = 0.0
                                            local2\Field30 = $00
                                            local2\Field13 = $00
                                            local2\Field17 = (Int (rnd(30.0, 40.0) * 70.0))
                                            local2\Field62 = ((4.0 - (Float selecteddifficulty\Field2)) * 70.0)
                                            local2\Field65 = ((15.0 * (Float local16)) * 70.0)
                                            local2\Field66 = 1.0
                                        EndIf
                                    EndIf
                                EndIf
                            Next
                            Return $00
                        EndIf
                    EndIf
                    If (2.0 > n_i\Field3\Field31) Then
                        If (npcseesnpc(n_i\Field3, arg0, 36.0) > $00) Then
                            If (local18 = Null) Then
                                If (0.0 < arg0\Field65) Then
                                    loadnpcsound(arg0, "SFX\Character\MTF\173\Spotted3.ogg", $00)
                                Else
                                    loadnpcsound(arg0, (("SFX\Character\MTF\173\Spotted" + (Str rand($00, $01))) + ".ogg"), $00)
                                EndIf
                                playmtfsound(arg0\Field55, arg0)
                            EndIf
                            For local2 = Each npcs
                                If (local2\Field77 = $18) Then
                                    local2\Field60 = entityx(n_i\Field3\Field82, $01, 1.0)
                                    local2\Field61 = entityy(n_i\Field3\Field82, $01, 1.0)
                                    local2\Field74 = entityz(n_i\Field3\Field82, $01, 1.0)
                                    local2\Field8 = 0.0
                                    local2\Field30 = $00
                                    local2\Field59 = n_i\Field3
                                    local2\Field65 = 2100.0
                                    local2\Field57 = 0.0
                                    local2\Field66 = 2.0
                                EndIf
                            Next
                            Return $00
                        EndIf
                    EndIf
                    If (1.0 < n_i\Field2\Field66) Then
                        If (npcseesnpc(n_i\Field2, arg0, 36.0) = $01) Then
                            If (local18 = Null) Then
                                loadnpcsound(arg0, (("SFX\Character\MTF\106\Spotted" + (Str rand($00, $02))) + ".ogg"), $00)
                                playmtfsound(arg0\Field55, arg0)
                            EndIf
                            arg0\Field60 = entityx(n_i\Field2\Field82, $01, 1.0)
                            arg0\Field61 = entityy(n_i\Field2\Field82, $01, 1.0)
                            arg0\Field74 = entityz(n_i\Field2\Field82, $01, 1.0)
                            arg0\Field8 = 0.0
                            arg0\Field30 = $00
                            arg0\Field59 = n_i\Field2
                            arg0\Field65 = 1050.0
                            arg0\Field57 = 0.0
                            arg0\Field66 = 4.0
                            Return $00
                        EndIf
                    EndIf
                    If (n_i\Field10 <> Null) Then
                        If (npcseesnpc(n_i\Field10, arg0, 36.0) = $01) Then
                            If (local18 = Null) Then
                                loadnpcsound(arg0, (("SFX\Character\MTF\096\Spotted" + (Str rand($00, $01))) + ".ogg"), $00)
                                playmtfsound(arg0\Field55, arg0)
                            EndIf
                            playsoundex(loadtempsound("SFX\Interact\NVGOn.ogg"), camera, arg0\Field82, 5.0, 1.0, $00, $00)
                            arg0\Field60 = entityx(n_i\Field10\Field82, $01, 1.0)
                            arg0\Field61 = entityy(n_i\Field10\Field82, $01, 1.0)
                            arg0\Field74 = entityz(n_i\Field10\Field82, $01, 1.0)
                            arg0\Field8 = 0.0
                            arg0\Field30 = $00
                            arg0\Field59 = n_i\Field10
                            arg0\Field65 = 700.0
                            arg0\Field57 = 0.0
                            arg0\Field66 = 8.0
                            Return $00
                        EndIf
                    EndIf
                    If (((n_i\Field8 <> Null) And (66.0 <> n_i\Field8\Field66)) <> 0) Then
                        If (npcseesnpc(n_i\Field8, arg0, 36.0) = $01) Then
                            If (local18 = Null) Then
                                loadnpcsound(arg0, (("SFX\Character\MTF\049\Spotted" + (Str rand($00, $04))) + ".ogg"), $00)
                                playmtfsound(arg0\Field55, arg0)
                            EndIf
                            arg0\Field60 = entityx(n_i\Field8\Field82, $01, 1.0)
                            arg0\Field61 = entityy(n_i\Field8\Field82, $01, 1.0)
                            arg0\Field74 = entityz(n_i\Field8\Field82, $01, 1.0)
                            arg0\Field8 = 0.0
                            arg0\Field30 = $00
                            arg0\Field59 = n_i\Field8
                            arg0\Field65 = 1050.0
                            arg0\Field57 = 0.0
                            arg0\Field66 = 4.0
                            Return $00
                        EndIf
                    EndIf
                    If (((n_i\Field1 <> Null) And (66.0 <> n_i\Field1\Field66)) <> 0) Then
                        If (npcseesnpc(n_i\Field1, arg0, 36.0) = $01) Then
                            arg0\Field60 = entityx(n_i\Field1\Field82, $01, 1.0)
                            arg0\Field61 = entityy(n_i\Field1\Field82, $01, 1.0)
                            arg0\Field74 = entityz(n_i\Field1\Field82, $01, 1.0)
                            arg0\Field8 = 0.0
                            arg0\Field30 = $00
                            arg0\Field59 = n_i\Field1
                            arg0\Field65 = 700.0
                            arg0\Field57 = 0.0
                            arg0\Field66 = 4.0
                            Return $00
                        EndIf
                    EndIf
                    For local2 = Each npcs
                        If (((local2\Field1 = $00) And (66.0 <> local2\Field66)) <> 0) Then
                            Select local2\Field77
                                Case $04
                                    If (npcseesnpc(local2, arg0, 36.0) = $01) Then
                                        If (local18 = Null) Then
                                            loadnpcsound(arg0, "SFX\Character\MTF\049_2\Spotted.ogg", $00)
                                            playmtfsound(arg0\Field55, arg0)
                                        EndIf
                                        arg0\Field60 = entityx(local2\Field82, $01, 1.0)
                                        arg0\Field61 = entityy(local2\Field82, $01, 1.0)
                                        arg0\Field74 = entityz(local2\Field82, $01, 1.0)
                                        arg0\Field8 = 0.0
                                        arg0\Field30 = $00
                                        arg0\Field59 = local2
                                        arg0\Field62 = 280.0
                                        arg0\Field65 = 1050.0
                                        arg0\Field57 = 0.0
                                        arg0\Field66 = 9.0
                                        Return $00
                                        Exit
                                    EndIf
                                Case $00,$01
                                    If (npcseesnpc(local2, arg0, 36.0) = $01) Then
                                        arg0\Field60 = entityx(local2\Field82, $01, 1.0)
                                        arg0\Field61 = entityy(local2\Field82, $01, 1.0)
                                        arg0\Field74 = entityz(local2\Field82, $01, 1.0)
                                        arg0\Field8 = 0.0
                                        arg0\Field30 = $00
                                        arg0\Field59 = local2
                                        arg0\Field62 = 210.0
                                        arg0\Field65 = 1050.0
                                        arg0\Field57 = 0.0
                                        arg0\Field66 = 9.0
                                        Return $00
                                        Exit
                                    EndIf
                                Case $02
                                    If (npcseesnpc(local2, arg0, 36.0) = $01) Then
                                        arg0\Field60 = entityx(local2\Field82, $01, 1.0)
                                        arg0\Field61 = entityy(local2\Field82, $01, 1.0)
                                        arg0\Field74 = entityz(local2\Field82, $01, 1.0)
                                        arg0\Field8 = 0.0
                                        arg0\Field30 = $00
                                        arg0\Field59 = local2
                                        arg0\Field62 = 210.0
                                        arg0\Field65 = 1050.0
                                        arg0\Field57 = 0.0
                                        arg0\Field66 = 9.0
                                        Return $00
                                        Exit
                                    EndIf
                                Case $11
                                    If (npcseesnpc(local2, arg0, 36.0) = $01) Then
                                        arg0\Field60 = entityx(local2\Field82, $01, 1.0)
                                        arg0\Field61 = entityy(local2\Field82, $01, 1.0)
                                        arg0\Field74 = entityz(local2\Field82, $01, 1.0)
                                        arg0\Field8 = 0.0
                                        arg0\Field30 = $00
                                        arg0\Field59 = local2
                                        arg0\Field62 = 210.0
                                        arg0\Field65 = 1050.0
                                        arg0\Field57 = 0.0
                                        arg0\Field66 = 9.0
                                        Return $00
                                        Exit
                                    EndIf
                            End Select
                        EndIf
                    Next
                    arg0\Field20 = 35.0
                Else
                    arg0\Field20 = (arg0\Field20 - fps\Field3[$00])
                EndIf
            Case 1.0
                arg0\Field32 = 0.015
                local8 = entitydistancesquared(XZ0260X8X2\Field74, arg0\Field82)
                If (0.64 > local8) Then
                    arg0\Field57 = 70.0
                EndIf
                If (0.0 < arg0\Field57) Then
                    arg0\Field30 = $00
                    arg0\Field48 = $00
                    arg0\Field8 = 1.0
                    arg0\Field57 = max((arg0\Field57 - fps\Field3[$00]), 0.0)
                EndIf
                arg0\Field65 = max((arg0\Field65 - fps\Field3[$00]), 0.0)
                If (0.0 < arg0\Field65) Then
                    local16 = npcseesplayer(arg0, (5.0 - XZ0260X8X2\Field46), 75.0, $00)
                    If (local16 > $00) Then
                        arg0\Field65 = 1050.0
                    EndIf
                    If (local16 = $01) Then
                        arg0\Field60 = entityx(XZ0260X8X2\Field74, $01, 1.0)
                        arg0\Field61 = entityy(XZ0260X8X2\Field74, $01, 1.0)
                        arg0\Field74 = entityz(XZ0260X8X2\Field74, $01, 1.0)
                        pointentity(arg0\Field82, XZ0260X8X2\Field74, 0.0)
                        If (((0.0 >= arg0\Field62) And (0.0 = XZ0260X8X2\Field48)) <> 0) Then
                            local22 = XZ0260X8X2\Field48
                            playsoundex(snd_i\Field29[$00], camera, arg0\Field82, 15.0, 1.0, $00, $00)
                            local10 = createpivot($00)
                            rotateentity(local10, entitypitch(arg0\Field82, $00, 1.0), entityyaw(arg0\Field82, $00, 1.0), 0.0, $01)
                            positionentity(local10, entityx(arg0\Field98, $00, 1.0), entityy(arg0\Field98, $00, 1.0), entityz(arg0\Field98, $00, 1.0), $00)
                            moveentity(local10, 0.0622, 0.83925, 0.5351, $00)
                            local15 = sqr(local8)
                            shoot(arg0, entityx(local10, $00, 1.0), entityy(local10, $00, 1.0), entityz(local10, $00, 1.0), arg0\Field82, ((25.0 / local15) * (1.0 / local15)), $01, $00)
                            freeentity(local10)
                            local10 = $00
                            msg\Field8 = format(getlocalstring("death", "ntf.blood"), subjectname, "%s")
                            If (((0.0 = local22) And (Int XZ0260X8X2\Field48)) <> 0) Then
                                msg\Field8 = format(getlocalstring("death", "ntf.terminated"), subjectname, "%s")
                                playmtfsound(loadtempsound((("SFX\Character\MTF\TargetTerminated" + (Str rand($00, $03))) + ".ogg")), arg0)
                            EndIf
                            arg0\Field62 = 8.0
                        EndIf
                        If (0.0 < arg0\Field57) Then
                            positionentity(arg0\Field98, arg0\Field60, arg0\Field61, arg0\Field74, $01)
                            pointentity(arg0\Field82, arg0\Field98, 0.0)
                            arg0\Field64 = curvevalue((- arg0\Field32), arg0\Field64, 20.0)
                            translateentity(arg0\Field82, ((cos((entityyaw(arg0\Field82, $01, 1.0) + 90.0)) * arg0\Field64) * fps\Field3[$00]), 0.0, ((sin((entityyaw(arg0\Field82, $01, 1.0) + 90.0)) * arg0\Field64) * fps\Field3[$00]), $01)
                            animatenpc(arg0, 522.0, 488.0, (arg0\Field64 * 26.0), $01)
                        ElseIf (((local8 < (((Float (playerroom\Field22\Field21 = $4C)) * 16.0) + 9.0)) And (0.0 = arg0\Field57)) <> 0) Then
                            arg0\Field64 = 0.0
                            If (arg0\Field13 = $01) Then
                                setnpcframe(arg0, 423.0, $01)
                                arg0\Field13 = $02
                            ElseIf (arg0\Field13 = $02) Then
                                If (200.0 < arg0\Field103) Then
                                    animatenpc(arg0, 424.0, 463.0, 0.5, $00)
                                    If (462.9 < arg0\Field103) Then
                                        setnpcframe(arg0, 78.0, $01)
                                    EndIf
                                Else
                                    animatenpc(arg0, 78.0, 193.0, 0.2, $00)
                                EndIf
                            EndIf
                        Else
                            positionentity(arg0\Field98, arg0\Field60, arg0\Field61, arg0\Field74, $01)
                            pointentity(arg0\Field82, arg0\Field98, 0.0)
                            arg0\Field64 = curvevalue(arg0\Field32, arg0\Field64, 20.0)
                            translateentity(arg0\Field82, ((cos((entityyaw(arg0\Field82, $01, 1.0) + 90.0)) * arg0\Field64) * fps\Field3[$00]), 0.0, ((sin((entityyaw(arg0\Field82, $01, 1.0) + 90.0)) * arg0\Field64) * fps\Field3[$00]), $01)
                            animatenpc(arg0, 488.0, 522.0, (arg0\Field64 * 26.0), $01)
                        EndIf
                        rotateentity(arg0\Field82, 0.0, entityyaw(arg0\Field82, $01, 1.0), 0.0, $01)
                        arg0\Field84 = curveangle(entityyaw(arg0\Field82, $01, 1.0), arg0\Field84, 10.0)
                    Else
                        arg0\Field17 = (Int ((Float arg0\Field17) - fps\Field3[$00]))
                        If (8.0 >= arg0\Field62) Then
                            arg0\Field62 = 8.0
                        EndIf
                        If (0.0 >= arg0\Field8) Then
                            arg0\Field30 = findpath(arg0, arg0\Field60, (arg0\Field61 + 0.1), arg0\Field74)
                            arg0\Field8 = (rnd(6.0, 10.0) * 70.0)
                            If (local18 = Null) Then
                                If (rand($0A, $01) = $01) Then
                                    For local2 = Each npcs
                                        If (((local2\Field77 = $18) And (local2 <> arg0)) <> 0) Then
                                            If (36.0 > entitydistancesquared(arg0\Field82, local2\Field82)) Then
                                                arg0\Field13 = $03
                                            EndIf
                                        EndIf
                                    Next
                                EndIf
                            EndIf
                        ElseIf (175.0 >= arg0\Field8) Then
                            arg0\Field64 = 0.0
                            If (arg0\Field13 = $00) Then
                                If (rand($23, $01) = $01) Then
                                    rotateentity(arg0\Field82, 0.0, rnd(360.0, 0.0), 0.0, $01)
                                EndIf
                                finishwalking(arg0, 488.0, 522.0, (arg0\Field32 * 26.0))
                                arg0\Field84 = curveangle(entityyaw(arg0\Field82, $01, 1.0), arg0\Field84, 20.0)
                            ElseIf (arg0\Field13 = $03) Then
                                setnpcframe(arg0, 350.0, $01)
                                arg0\Field13 = $04
                            ElseIf (arg0\Field13 = $04) Then
                                animatenpc(arg0, 350.0, 423.0, 0.5, $00)
                                If (422.9 < arg0\Field103) Then
                                    arg0\Field13 = $00
                                EndIf
                            EndIf
                            arg0\Field8 = (arg0\Field8 - fps\Field3[$00])
                        Else
                            If (arg0\Field30 = $02) Then
                                arg0\Field64 = 0.0
                                If (rand($23, $01) = $01) Then
                                    rotateentity(arg0\Field82, 0.0, rnd(360.0, 0.0), 0.0, $01)
                                EndIf
                                finishwalking(arg0, 488.0, 522.0, (arg0\Field32 * 26.0))
                                arg0\Field8 = (arg0\Field8 - local17)
                            ElseIf (arg0\Field30 = $01) Then
                                If (arg0\Field71[arg0\Field48] = Null) Then
                                    If (arg0\Field48 > $14) Then
                                        arg0\Field48 = $00
                                        arg0\Field30 = $00
                                    Else
                                        arg0\Field48 = (arg0\Field48 + $01)
                                    EndIf
                                Else
                                    pointentity(arg0\Field82, arg0\Field71[arg0\Field48]\Field0, 0.0)
                                    rotateentity(arg0\Field82, 0.0, entityyaw(arg0\Field82, $01, 1.0), 0.0, $01)
                                    arg0\Field64 = curvevalue(arg0\Field32, arg0\Field64, 20.0)
                                    translateentity(arg0\Field82, ((cos((entityyaw(arg0\Field82, $01, 1.0) + 90.0)) * arg0\Field64) * fps\Field3[$00]), 0.0, ((sin((entityyaw(arg0\Field82, $01, 1.0) + 90.0)) * arg0\Field64) * fps\Field3[$00]), $01)
                                    animatenpc(arg0, 488.0, 522.0, (arg0\Field64 * 26.0), $01)
                                    usedoornpc(arg0, $01, $01)
                                EndIf
                                arg0\Field8 = (arg0\Field8 - fps\Field3[$00])
                            Else
                                positionentity(arg0\Field98, arg0\Field60, arg0\Field61, arg0\Field74, $01)
                                If (((0.05 > distancesquared(entityx(arg0\Field82, $01, 1.0), arg0\Field60, entityz(arg0\Field82, $01, 1.0), arg0\Field74, 0.0, 0.0)) Lor (entityvisible(arg0\Field98, arg0\Field82, 0.0) = $00)) <> 0) Then
                                    If (rand($23, $01) = $01) Then
                                        rotateentity(arg0\Field82, 0.0, rnd(360.0, 0.0), 0.0, $01)
                                        For local3 = Each waypoints
                                            If (rand($03, $01) = $01) Then
                                                If (36.0 > entitydistancesquared(local3\Field0, arg0\Field82)) Then
                                                    arg0\Field60 = entityx(local3\Field0, $01, 1.0)
                                                    arg0\Field61 = entityy(local3\Field0, $01, 1.0)
                                                    arg0\Field74 = entityz(local3\Field0, $01, 1.0)
                                                    arg0\Field8 = 0.0
                                                    Exit
                                                EndIf
                                            EndIf
                                        Next
                                    EndIf
                                    finishwalking(arg0, 488.0, 522.0, (arg0\Field32 * 26.0))
                                    arg0\Field8 = (arg0\Field8 - fps\Field3[$00])
                                Else
                                    pointentity(arg0\Field82, arg0\Field98, 0.0)
                                    rotateentity(arg0\Field82, 0.0, entityyaw(arg0\Field82, $01, 1.0), 0.0, $01)
                                    arg0\Field64 = curvevalue(arg0\Field32, arg0\Field64, 20.0)
                                    translateentity(arg0\Field82, ((cos((entityyaw(arg0\Field82, $01, 1.0) + 90.0)) * arg0\Field64) * fps\Field3[$00]), 0.0, ((sin((entityyaw(arg0\Field82, $01, 1.0) + 90.0)) * arg0\Field64) * fps\Field3[$00]), $01)
                                    animatenpc(arg0, 488.0, 522.0, (arg0\Field64 * 26.0), $01)
                                EndIf
                            EndIf
                            arg0\Field84 = curveangle(entityyaw(arg0\Field82, $01, 1.0), arg0\Field84, 20.0)
                        EndIf
                        If ((((local18 = Null) And (2100.0 > (Float arg0\Field17))) And (2100.0 <= ((Float arg0\Field17) + fps\Field3[$00]))) <> 0) Then
                            If (rand($02, $01) = $01) Then
                                playmtfsound(loadtempsound((("SFX\Character\MTF\Searching" + (Str rand($00, $05))) + ".ogg")), arg0)
                            EndIf
                        EndIf
                    EndIf
                Else
                    If (local18 = Null) Then
                        playmtfsound(loadtempsound((("SFX\Character\MTF\TargetLost" + (Str rand($00, $02))) + ".ogg")), arg0)
                        If (0.0 = mtfcamerachecktimer) Then
                            If (rand(($0F - (selecteddifficulty\Field2 * $07)), $01) = $01) Then
                                playannouncement("SFX\Character\MTF\AnnouncCameraCheck.ogg", $01)
                                mtfcamerachecktimer = fps\Field3[$00]
                            EndIf
                        EndIf
                    EndIf
                    arg0\Field60 = 0.0
                    arg0\Field61 = 0.0
                    arg0\Field74 = 0.0
                    arg0\Field66 = 0.0
                    Return $00
                EndIf
                If (0.0 >= arg0\Field20) Then
                    If (2.0 > n_i\Field3\Field31) Then
                        If (npcseesnpc(n_i\Field3, arg0, 36.0) > $00) Then
                            If (local18 = Null) Then
                                If (0.0 < arg0\Field65) Then
                                    loadnpcsound(arg0, "SFX\Character\MTF\173\Spotted3.ogg", $00)
                                Else
                                    loadnpcsound(arg0, (("SFX\Character\MTF\173\Spotted" + (Str rand($00, $01))) + ".ogg"), $00)
                                EndIf
                                playmtfsound(arg0\Field55, arg0)
                            EndIf
                            For local2 = Each npcs
                                If (local2\Field77 = $18) Then
                                    local2\Field60 = entityx(n_i\Field3\Field82, $01, 1.0)
                                    local2\Field61 = entityy(n_i\Field3\Field82, $01, 1.0)
                                    local2\Field74 = entityz(n_i\Field3\Field82, $01, 1.0)
                                    local2\Field8 = 0.0
                                    local2\Field30 = $00
                                    local2\Field59 = n_i\Field3
                                    local2\Field65 = 2100.0
                                    local2\Field57 = 0.0
                                    local2\Field66 = 2.0
                                EndIf
                            Next
                            Return $00
                        EndIf
                    EndIf
                    If (1.0 < n_i\Field2\Field66) Then
                        If (npcseesnpc(n_i\Field2, arg0, 36.0) = $01) Then
                            If (local18 = Null) Then
                                loadnpcsound(arg0, (("SFX\Character\MTF\106\Spotted" + (Str rand($00, $02))) + ".ogg"), $00)
                                playmtfsound(arg0\Field55, arg0)
                            EndIf
                            arg0\Field60 = entityx(n_i\Field2\Field82, $01, 1.0)
                            arg0\Field61 = entityy(n_i\Field2\Field82, $01, 1.0)
                            arg0\Field74 = entityz(n_i\Field2\Field82, $01, 1.0)
                            arg0\Field8 = 0.0
                            arg0\Field30 = $00
                            arg0\Field59 = n_i\Field2
                            arg0\Field65 = 1050.0
                            arg0\Field57 = 0.0
                            arg0\Field66 = 4.0
                            Return $00
                        EndIf
                    EndIf
                    If (n_i\Field10 <> Null) Then
                        If (npcseesnpc(n_i\Field10, arg0, 36.0) = $01) Then
                            If (local18 = Null) Then
                                loadnpcsound(arg0, (("SFX\Character\MTF\096\Spotted" + (Str rand($00, $01))) + ".ogg"), $00)
                                playmtfsound(arg0\Field55, arg0)
                            EndIf
                            playsoundex(loadtempsound("SFX\Interact\NVGOn.ogg"), camera, arg0\Field82, 5.0, 1.0, $00, $00)
                            arg0\Field60 = entityx(n_i\Field10\Field82, $01, 1.0)
                            arg0\Field61 = entityy(n_i\Field10\Field82, $01, 1.0)
                            arg0\Field74 = entityz(n_i\Field10\Field82, $01, 1.0)
                            arg0\Field8 = 0.0
                            arg0\Field30 = $00
                            arg0\Field59 = n_i\Field10
                            arg0\Field65 = 700.0
                            arg0\Field57 = 0.0
                            arg0\Field66 = 8.0
                            Return $00
                        EndIf
                    EndIf
                    If (((n_i\Field8 <> Null) And (66.0 <> n_i\Field8\Field66)) <> 0) Then
                        If (npcseesnpc(n_i\Field8, arg0, 36.0) = $01) Then
                            If (local18 = Null) Then
                                loadnpcsound(arg0, (("SFX\Character\MTF\049\Spotted" + (Str rand($00, $04))) + ".ogg"), $00)
                                playmtfsound(arg0\Field55, arg0)
                            EndIf
                            arg0\Field60 = entityx(n_i\Field8\Field82, $01, 1.0)
                            arg0\Field61 = entityy(n_i\Field8\Field82, $01, 1.0)
                            arg0\Field74 = entityz(n_i\Field8\Field82, $01, 1.0)
                            arg0\Field8 = 0.0
                            arg0\Field30 = $00
                            arg0\Field59 = n_i\Field8
                            arg0\Field65 = 1050.0
                            arg0\Field57 = 0.0
                            arg0\Field66 = 4.0
                            Return $00
                        EndIf
                    EndIf
                    If (((n_i\Field1 <> Null) And (66.0 <> n_i\Field1\Field66)) <> 0) Then
                        If (npcseesnpc(n_i\Field1, arg0, 36.0) = $01) Then
                            arg0\Field60 = entityx(n_i\Field1\Field82, $01, 1.0)
                            arg0\Field61 = entityy(n_i\Field1\Field82, $01, 1.0)
                            arg0\Field74 = entityz(n_i\Field1\Field82, $01, 1.0)
                            arg0\Field8 = 0.0
                            arg0\Field30 = $00
                            arg0\Field59 = n_i\Field1
                            arg0\Field65 = 700.0
                            arg0\Field57 = 0.0
                            arg0\Field66 = 4.0
                            Return $00
                        EndIf
                    EndIf
                    For local2 = Each npcs
                        If (((local2\Field1 = $00) And (66.0 <> local2\Field66)) <> 0) Then
                            Select local2\Field77
                                Case $04
                                    If (npcseesnpc(local2, arg0, 36.0) = $01) Then
                                        If (local18 = Null) Then
                                            loadnpcsound(arg0, "SFX\Character\MTF\049_2\Spotted.ogg", $00)
                                            playmtfsound(arg0\Field55, arg0)
                                        EndIf
                                        arg0\Field60 = entityx(local2\Field82, $01, 1.0)
                                        arg0\Field61 = entityy(local2\Field82, $01, 1.0)
                                        arg0\Field74 = entityz(local2\Field82, $01, 1.0)
                                        arg0\Field8 = 0.0
                                        arg0\Field30 = $00
                                        arg0\Field59 = local2
                                        arg0\Field62 = 280.0
                                        arg0\Field65 = 1050.0
                                        arg0\Field57 = 0.0
                                        arg0\Field66 = 9.0
                                        Return $00
                                        Exit
                                    EndIf
                                Case $00,$01
                                    If (npcseesnpc(local2, arg0, 36.0) = $01) Then
                                        arg0\Field60 = entityx(local2\Field82, $01, 1.0)
                                        arg0\Field61 = entityy(local2\Field82, $01, 1.0)
                                        arg0\Field74 = entityz(local2\Field82, $01, 1.0)
                                        arg0\Field8 = 0.0
                                        arg0\Field30 = $00
                                        arg0\Field59 = local2
                                        arg0\Field62 = 210.0
                                        arg0\Field65 = 1050.0
                                        arg0\Field57 = 0.0
                                        arg0\Field66 = 9.0
                                        Return $00
                                        Exit
                                    EndIf
                                Case $02
                                    If (npcseesnpc(local2, arg0, 36.0) = $01) Then
                                        arg0\Field60 = entityx(local2\Field82, $01, 1.0)
                                        arg0\Field61 = entityy(local2\Field82, $01, 1.0)
                                        arg0\Field74 = entityz(local2\Field82, $01, 1.0)
                                        arg0\Field8 = 0.0
                                        arg0\Field30 = $00
                                        arg0\Field59 = local2
                                        arg0\Field62 = 210.0
                                        arg0\Field65 = 1050.0
                                        arg0\Field57 = 0.0
                                        arg0\Field66 = 9.0
                                        Return $00
                                        Exit
                                    EndIf
                                Case $11
                                    If (npcseesnpc(local2, arg0, 36.0) = $01) Then
                                        arg0\Field60 = entityx(local2\Field82, $01, 1.0)
                                        arg0\Field61 = entityy(local2\Field82, $01, 1.0)
                                        arg0\Field74 = entityz(local2\Field82, $01, 1.0)
                                        arg0\Field8 = 0.0
                                        arg0\Field30 = $00
                                        arg0\Field59 = local2
                                        arg0\Field62 = 210.0
                                        arg0\Field65 = 1050.0
                                        arg0\Field57 = 0.0
                                        arg0\Field66 = 9.0
                                        Return $00
                                        Exit
                                    EndIf
                            End Select
                        EndIf
                    Next
                    arg0\Field20 = 35.0
                Else
                    arg0\Field20 = (arg0\Field20 - fps\Field3[$00])
                EndIf
            Case 3.0
                local10 = createpivot($00)
                positionentity(local10, arg0\Field60, arg0\Field61, arg0\Field74, $01)
                If (0.25 > distancesquared(entityx(arg0\Field82, $00, 1.0), entityx(local10, $00, 1.0), entityx(arg0\Field82, $00, 1.0), entityx(local10, $00, 1.0), 0.0, 0.0)) Then
                    arg0\Field60 = 0.0
                    arg0\Field61 = 0.0
                    arg0\Field74 = 0.0
                    freeentity(local10)
                    local10 = $00
                    arg0\Field66 = 0.0
                    Return $00
                EndIf
                freeentity(local10)
                local10 = $00
                If (arg0\Field30 = $01) Then
                    If (arg0\Field71[arg0\Field48] = Null) Then
                        If (arg0\Field48 > $14) Then
                            arg0\Field48 = $00
                            arg0\Field30 = $00
                        Else
                            arg0\Field48 = (arg0\Field48 + $01)
                        EndIf
                    Else
                        pointentity(arg0\Field82, arg0\Field71[arg0\Field48]\Field0, 0.0)
                        rotateentity(arg0\Field82, 0.0, entityyaw(arg0\Field82, $01, 1.0), 0.0, $01)
                        arg0\Field64 = curvevalue(arg0\Field32, arg0\Field64, 20.0)
                        translateentity(arg0\Field82, ((cos((entityyaw(arg0\Field82, $01, 1.0) + 90.0)) * arg0\Field64) * fps\Field3[$00]), 0.0, ((sin((entityyaw(arg0\Field82, $01, 1.0) + 90.0)) * arg0\Field64) * fps\Field3[$00]), $01)
                        animatenpc(arg0, 488.0, 522.0, (arg0\Field64 * 26.0), $01)
                        usedoornpc(arg0, $01, $01)
                    EndIf
                Else
                    If (0.0 = arg0\Field8) Then
                        arg0\Field30 = findpath(arg0, arg0\Field60, (arg0\Field61 + 0.2), arg0\Field74)
                    EndIf
                    local24 = Null
                    local10 = createpivot($00)
                    positionentity(local10, arg0\Field60, arg0\Field61, arg0\Field74, $00)
                    For local3 = Each waypoints
                        If (4.0 > entitydistancesquared(local3\Field0, local10)) Then
                            local24 = local3
                            Exit
                        EndIf
                    Next
                    freeentity(local10)
                    local10 = $00
                    If (local24 <> Null) Then
                        arg0\Field8 = 1.0
                        If (entityvisible(local24\Field0, arg0\Field82, 0.0) <> 0) Then
                            If (0.0 < (Abs deltayaw(arg0\Field82, local24\Field0))) Then
                                pointentity(arg0\Field98, local24\Field0, 0.0)
                                rotateentity(arg0\Field82, 0.0, curveangle(entityyaw(arg0\Field98, $00, 1.0), entityyaw(arg0\Field82, $00, 1.0), 20.0), 0.0, $00)
                            EndIf
                        EndIf
                    Else
                        arg0\Field8 = 0.0
                    EndIf
                    If (1.0 = arg0\Field8) Then
                        animatenpc(arg0, 488.0, 522.0, (arg0\Field64 * 26.0), $01)
                        arg0\Field64 = curvevalue(arg0\Field32, arg0\Field64, 20.0)
                        translateentity(arg0\Field82, ((cos((entityyaw(arg0\Field82, $01, 1.0) + 90.0)) * arg0\Field64) * fps\Field3[$00]), 0.0, ((sin((entityyaw(arg0\Field82, $01, 1.0) + 90.0)) * arg0\Field64) * fps\Field3[$00]), $01)
                    EndIf
                EndIf
                arg0\Field84 = curveangle(entityyaw(arg0\Field82, $01, 1.0), arg0\Field84, 20.0)
            Case 5.0
                local10 = createpivot($00)
                positionentity(local10, arg0\Field60, arg0\Field61, arg0\Field74, $01)
                pointentity(arg0\Field82, local10, 0.0)
                freeentity(local10)
                local10 = $00
                rotateentity(arg0\Field82, 0.0, entityyaw(arg0\Field82, $01, 1.0), 0.0, $01)
                arg0\Field64 = 0.0
                animatenpc(arg0, 78.0, 194.0, 0.2, $01)
                arg0\Field84 = curveangle(entityyaw(arg0\Field82, $01, 1.0), arg0\Field84, 20.0)
            Case 6.0
                pointentity(arg0\Field82, XZ0260X8X2\Field74, 0.0)
                rotateentity(arg0\Field82, 0.0, entityyaw(arg0\Field82, $01, 1.0), 0.0, $01)
                arg0\Field64 = 0.0
                animatenpc(arg0, 346.0, 351.0, 0.2, $01)
                arg0\Field84 = curveangle(entityyaw(arg0\Field82, $01, 1.0), arg0\Field84, 10.0)
                local8 = entitydistancesquared(XZ0260X8X2\Field74, arg0\Field82)
                If (((0.0 >= arg0\Field62) And (0.0 = XZ0260X8X2\Field48)) <> 0) Then
                    local22 = XZ0260X8X2\Field48
                    playsoundex(snd_i\Field29[$00], camera, arg0\Field82, 15.0, 1.0, $00, $00)
                    local10 = createpivot($00)
                    rotateentity(local10, entitypitch(arg0\Field82, $00, 1.0), entityyaw(arg0\Field82, $00, 1.0), 0.0, $01)
                    positionentity(local10, entityx(arg0\Field98, $00, 1.0), entityy(arg0\Field98, $00, 1.0), entityz(arg0\Field98, $00, 1.0), $00)
                    moveentity(local10, 0.0622, 0.83925, 0.5351, $00)
                    local15 = sqr(local8)
                    shoot(arg0, entityx(local10, $00, 1.0), entityy(local10, $00, 1.0), entityz(local10, $00, 1.0), arg0\Field82, ((25.0 / local15) * (1.0 / local15)), $01, $00)
                    freeentity(local10)
                    local10 = $00
                    msg\Field8 = format(getlocalstring("death", "ntf.blood"), subjectname, "%s")
                    If (((0.0 = local22) And (Int XZ0260X8X2\Field48)) <> 0) Then
                        If (playerroom\Field22\Field21 = $3C) Then
                            msg\Field8 = getlocalstring("death", "0492")
                            playmtfsound(loadtempsound("SFX\Character\MTF\049_2\TargetTerminated.ogg"), arg0)
                        Else
                            msg\Field8 = format(getlocalstring("death", "ntf.gatea"), subjectname, "%s")
                            playmtfsound(loadtempsound((("SFX\Character\MTF\Targetterminated" + (Str rand($00, $03))) + ".ogg")), arg0)
                        EndIf
                    EndIf
                    arg0\Field62 = 8.0
                EndIf
            Case 11.0
                For local2 = Each npcs
                    If (((local2\Field77 = $18) And (local2 <> arg0)) <> 0) Then
                        If (((4.0 > entitydistancesquared(arg0\Field82, local2\Field82)) And (5.0 <> local2\Field66)) <> 0) Then
                            local2\Field13 = $00
                            local2\Field8 = 0.0
                            local2\Field48 = $00
                            local2\Field30 = $00
                            local2\Field60 = entityx(arg0\Field82, $00, 1.0)
                            local2\Field61 = entityy(arg0\Field82, $00, 1.0)
                            local2\Field74 = entityz(arg0\Field82, $00, 1.0)
                            local2\Field66 = 5.0
                        EndIf
                    EndIf
                Next
                If (arg0\Field13 = $01) Then
                    setnpcframe(arg0, 423.0, $01)
                    arg0\Field13 = $02
                ElseIf (arg0\Field13 = $02) Then
                    arg0\Field64 = 0.0
                    If (1175.0 > arg0\Field103) Then
                        animatenpc(arg0, 423.0, 463.0, 0.5, $00)
                        If (462.9 < arg0\Field103) Then
                            loadnpcsound(arg0, "SFX\Character\MTF\TeslaRequest.ogg", $00)
                            playmtfsound(arg0\Field55, arg0)
                            setnpcframe(arg0, 1175.0, $01)
                        EndIf
                    Else
                        animatenpc(arg0, 1175.0, 1290.0, 0.18, $00)
                    EndIf
                EndIf
                arg0\Field57 = max((arg0\Field57 - fps\Field3[$00]), 0.0)
                If (0.0 >= arg0\Field57) Then
                    For local2 = Each npcs
                        If (((local2\Field77 = $18) And (local2 <> arg0)) <> 0) Then
                            If (6.0 > entitydistancesquared(arg0\Field82, local2\Field82)) Then
                                local2\Field60 = 0.0
                                local2\Field61 = 0.0
                                local2\Field74 = 0.0
                                local2\Field66 = 0.0
                            EndIf
                        EndIf
                    Next
                    arg0\Field60 = 0.0
                    arg0\Field61 = 0.0
                    arg0\Field74 = 0.0
                    arg0\Field66 = 0.0
                    Return $00
                EndIf
            Case 2.0
                arg0\Field65 = max((arg0\Field65 - fps\Field3[$00]), 0.0)
                If (0.0 >= arg0\Field9) Then
                    If (npcsound[$02] = $00) Then
                        npcsound[$02] = loadsound_strict("SFX\Character\MTF\173\BLINKING.ogg")
                    EndIf
                    playmtfsound(npcsound[$02], arg0)
                EndIf
                If (npcseesnpc(arg0\Field59, arg0, 36.0) = $01) Then
                    arg0\Field60 = entityx(arg0\Field59\Field82, $01, 1.0)
                    arg0\Field61 = entityy(arg0\Field59\Field82, $01, 1.0)
                    arg0\Field74 = entityz(arg0\Field59\Field82, $01, 1.0)
                    arg0\Field65 = 2100.0
                    arg0\Field48 = $00
                    arg0\Field8 = 0.0
                    arg0\Field30 = $00
                    If (2.0 <> arg0\Field59\Field31) Then
                        arg0\Field59\Field31 = 1.0
                    EndIf
                    local25 = distancesquared(entityx(arg0\Field82, $01, 1.0), entityx(arg0\Field59\Field82, $01, 1.0), entityz(arg0\Field82, $01, 1.0), entityz(arg0\Field59\Field82, $01, 1.0), 0.0, 0.0)
                    If (25.0 > local25) Then
                        local26 = 1.0
                        If (local19 <> 0) Then
                            local26 = (((Float (local18 = n_i\Field13)) * 3.0) + 3.0)
                        EndIf
                        pointentity(arg0\Field82, arg0\Field59\Field82, 0.0)
                        If (local26 > local25) Then
                            arg0\Field57 = (arg0\Field57 + fps\Field3[$00])
                            If (525.0 <= arg0\Field57) Then
                                loadnpcsound(n_i\Field11, (("SFX\Character\MTF\173\Box" + (Str rand($00, $02))) + ".ogg"), $00)
                                playmtfsound(n_i\Field11\Field55, n_i\Field11)
                                arg0\Field59\Field31 = 2.0
                            EndIf
                            arg0\Field64 = 0.0
                            finishwalking(arg0, 488.0, 522.0, (arg0\Field32 * 26.0))
                        Else
                            arg0\Field64 = curvevalue(arg0\Field32, arg0\Field64, 20.0)
                            translateentity(arg0\Field82, ((cos((entityyaw(arg0\Field82, $01, 1.0) + 90.0)) * arg0\Field64) * fps\Field3[$00]), 0.0, ((sin((entityyaw(arg0\Field82, $01, 1.0) + 90.0)) * arg0\Field64) * fps\Field3[$00]), $01)
                            animatenpc(arg0, 488.0, 522.0, (arg0\Field64 * 26.0), $01)
                        EndIf
                    Else
                        positionentity(arg0\Field98, arg0\Field60, arg0\Field61, arg0\Field74, $01)
                        pointentity(arg0\Field82, arg0\Field98, 0.0)
                        arg0\Field64 = curvevalue(arg0\Field32, arg0\Field64, 20.0)
                        translateentity(arg0\Field82, ((cos((entityyaw(arg0\Field82, $01, 1.0) + 90.0)) * arg0\Field64) * fps\Field3[$00]), 0.0, ((sin((entityyaw(arg0\Field82, $01, 1.0) + 90.0)) * arg0\Field64) * fps\Field3[$00]), $01)
                        animatenpc(arg0, 488.0, 522.0, (arg0\Field64 * 26.0), $01)
                    EndIf
                    rotateentity(arg0\Field82, 0.0, entityyaw(arg0\Field82, $01, 1.0), 0.0, $01)
                    arg0\Field84 = curveangle(entityyaw(arg0\Field82, $01, 1.0), arg0\Field84, 20.0)
                ElseIf (0.0 >= arg0\Field8) Then
                    arg0\Field30 = findpath(arg0, arg0\Field60, (arg0\Field61 + 0.1), arg0\Field74)
                    If (arg0\Field30 = $01) Then
                        While (arg0\Field71[arg0\Field48] = Null)
                            If (arg0\Field48 > $14) Then
                                arg0\Field48 = $00
                                arg0\Field30 = $00
                                Exit
                            Else
                                arg0\Field48 = (arg0\Field48 + $01)
                            EndIf
                        Wend
                        If (arg0\Field48 < $14) Then
                            If (((arg0\Field71[arg0\Field48] <> Null) And (arg0\Field71[(arg0\Field48 + $01)] <> Null)) <> 0) Then
                                If (arg0\Field71[arg0\Field48]\Field7 = Null) Then
                                    If ((Abs deltayaw(arg0\Field82, arg0\Field71[(arg0\Field48 + $01)]\Field0)) < (Abs deltayaw(arg0\Field82, arg0\Field71[arg0\Field48]\Field0))) Then
                                        arg0\Field48 = (arg0\Field48 + $01)
                                    EndIf
                                EndIf
                                usedoornpc(arg0, $01, $00)
                            EndIf
                        EndIf
                    EndIf
                    arg0\Field8 = (rnd(6.0, 10.0) * 70.0)
                ElseIf (175.0 >= arg0\Field8) Then
                    arg0\Field8 = (arg0\Field8 - fps\Field3[$00])
                    arg0\Field64 = 0.0
                    If (rand($23, $01) = $01) Then
                        rotateentity(arg0\Field82, 0.0, rnd(360.0, 0.0), 0.0, $01)
                    EndIf
                    finishwalking(arg0, 488.0, 522.0, (arg0\Field32 * 26.0))
                    arg0\Field84 = curveangle(entityyaw(arg0\Field82, $01, 1.0), arg0\Field84, 20.0)
                Else
                    If (arg0\Field30 = $01) Then
                        If (arg0\Field71[arg0\Field48] = Null) Then
                            If (arg0\Field48 > $14) Then
                                arg0\Field48 = $00
                                arg0\Field30 = $00
                            Else
                                arg0\Field48 = (arg0\Field48 + $01)
                            EndIf
                        Else
                            pointentity(arg0\Field82, arg0\Field71[arg0\Field48]\Field0, 0.0)
                            rotateentity(arg0\Field82, 0.0, entityyaw(arg0\Field82, $01, 1.0), 0.0, $01)
                            arg0\Field64 = curvevalue(arg0\Field32, arg0\Field64, 20.0)
                            translateentity(arg0\Field82, ((cos((entityyaw(arg0\Field82, $01, 1.0) + 90.0)) * arg0\Field64) * fps\Field3[$00]), 0.0, ((sin((entityyaw(arg0\Field82, $01, 1.0) + 90.0)) * arg0\Field64) * fps\Field3[$00]), $01)
                            animatenpc(arg0, 488.0, 522.0, (arg0\Field64 * 26.0), $01)
                            usedoornpc(arg0, $01, $01)
                        EndIf
                        arg0\Field8 = (arg0\Field8 - fps\Field3[$00])
                    Else
                        positionentity(arg0\Field98, arg0\Field60, arg0\Field61, arg0\Field74, $01)
                        If (((0.25 > distancesquared(entityx(arg0\Field82, $01, 1.0), arg0\Field60, entityz(arg0\Field82, $01, 1.0), arg0\Field74, 0.0, 0.0)) Lor (entityvisible(arg0\Field98, arg0\Field82, 0.0) = $00)) <> 0) Then
                            If (rand($23, $01) = $01) Then
                                rotateentity(arg0\Field82, 0.0, rnd(360.0, 0.0), 0.0, $01)
                                For local3 = Each waypoints
                                    If (rand($03, $01) = $01) Then
                                        If (36.0 > entitydistancesquared(local3\Field0, arg0\Field82)) Then
                                            arg0\Field60 = entityx(local3\Field0, $01, 1.0)
                                            arg0\Field61 = entityy(local3\Field0, $01, 1.0)
                                            arg0\Field74 = entityz(local3\Field0, $01, 1.0)
                                            arg0\Field8 = 0.0
                                            Exit
                                        EndIf
                                    EndIf
                                Next
                            EndIf
                            finishwalking(arg0, 488.0, 522.0, (arg0\Field32 * 26.0))
                            arg0\Field8 = (arg0\Field8 - fps\Field3[$00])
                        Else
                            pointentity(arg0\Field82, arg0\Field98, 0.0)
                            rotateentity(arg0\Field82, 0.0, entityyaw(arg0\Field82, $01, 1.0), 0.0, $01)
                            arg0\Field64 = curvevalue(arg0\Field32, arg0\Field64, 20.0)
                            translateentity(arg0\Field82, ((cos((entityyaw(arg0\Field82, $01, 1.0) + 90.0)) * arg0\Field64) * fps\Field3[$00]), 0.0, ((sin((entityyaw(arg0\Field82, $01, 1.0) + 90.0)) * arg0\Field64) * fps\Field3[$00]), $01)
                            animatenpc(arg0, 488.0, 522.0, (arg0\Field64 * 26.0), $01)
                        EndIf
                    EndIf
                    arg0\Field84 = curveangle(entityyaw(arg0\Field82, $01, 1.0), arg0\Field84, 20.0)
                EndIf
                If (((0.0 >= arg0\Field65) Lor (2.0 = arg0\Field59\Field31)) <> 0) Then
                    arg0\Field59 = Null
                    arg0\Field60 = 0.0
                    arg0\Field61 = 0.0
                    arg0\Field74 = 0.0
                    arg0\Field65 = 0.0
                    arg0\Field57 = 0.0
                    arg0\Field66 = 0.0
                    Return $00
                EndIf
            Case 4.0
                arg0\Field32 = 0.03
                arg0\Field65 = max((arg0\Field65 - fps\Field3[$00]), 0.0)
                If (0.0 < arg0\Field65) Then
                    local8 = entitydistancesquared(arg0\Field82, arg0\Field59\Field82)
                    If (npcseesnpc(arg0\Field59, arg0, 36.0) = $01) Then
                        arg0\Field65 = ((15.0 - ((Float (arg0\Field59 = n_i\Field1)) * 5.0)) * 70.0)
                    EndIf
                    If (((70.0 < arg0\Field65) And ((hidedistance * hidedistance) < local8)) <> 0) Then
                        arg0\Field65 = 70.0
                    EndIf
                    If (((9.0 > local8) And (arg0\Field59 <> n_i\Field1)) <> 0) Then
                        arg0\Field57 = 210.0
                    EndIf
                    If (0.0 < arg0\Field57) Then
                        arg0\Field32 = 0.02
                        arg0\Field30 = $00
                        arg0\Field48 = $00
                        arg0\Field8 = 1.0
                        arg0\Field57 = max((arg0\Field57 - fps\Field3[$00]), 0.0)
                    EndIf
                    If (0.0 >= arg0\Field8) Then
                        If (local19 <> 0) Then
                            arg0\Field30 = findpath(arg0, entityx(local18\Field82, $01, 1.0), (entityy(local18\Field82, $01, 1.0) + 0.1), entityz(local18\Field82, $01, 1.0))
                        Else
                            For local0 = Each rooms
                                If ((((12.0 < (Abs (local0\Field40 - entityx(arg0\Field82, $01, 1.0)))) Lor (12.0 < (Abs (local0\Field37 - entityz(arg0\Field82, $01, 1.0))))) And (rand((Int max((Float ($04 - (Int (Abs (local0\Field37 - (entityz(arg0\Field82, $01, 1.0) / 8.0)))))), 2.0)), $01) = $01)) <> 0) Then
                                    If (36.0 < entitydistancesquared(local0\Field15, arg0\Field59\Field82)) Then
                                        local12 = local0\Field40
                                        local13 = 0.1
                                        local14 = local0\Field37
                                        Exit
                                    EndIf
                                EndIf
                            Next
                            arg0\Field30 = findpath(arg0, local12, local13, local14)
                        EndIf
                        If (arg0\Field30 = $01) Then
                            While (arg0\Field71[arg0\Field48] = Null)
                                If (arg0\Field48 > $14) Then
                                    arg0\Field48 = $00
                                    arg0\Field30 = $00
                                    Exit
                                Else
                                    arg0\Field48 = (arg0\Field48 + $01)
                                EndIf
                            Wend
                            If (arg0\Field48 < $14) Then
                                If (((arg0\Field71[arg0\Field48] <> Null) And (arg0\Field71[(arg0\Field48 + $01)] <> Null)) <> 0) Then
                                    If (arg0\Field71[arg0\Field48]\Field7 = Null) Then
                                        If ((Abs deltayaw(arg0\Field82, arg0\Field71[(arg0\Field48 + $01)]\Field0)) < (Abs deltayaw(arg0\Field82, arg0\Field71[arg0\Field48]\Field0))) Then
                                            arg0\Field48 = (arg0\Field48 + $01)
                                        EndIf
                                    EndIf
                                    usedoornpc(arg0, $01, $00)
                                EndIf
                            EndIf
                        EndIf
                        arg0\Field8 = (rnd(6.0, 10.0) * 70.0)
                    Else
                        If (arg0\Field30 = $02) Then
                            arg0\Field64 = 0.0
                            If (rand($23, $01) = $01) Then
                                rotateentity(arg0\Field82, 0.0, rnd(360.0, 0.0), 0.0, $01)
                            EndIf
                            finishwalking(arg0, 488.0, 522.0, (arg0\Field32 * 26.0))
                            arg0\Field8 = (arg0\Field8 - local17)
                        ElseIf (arg0\Field30 = $01) Then
                            If (arg0\Field71[arg0\Field48] = Null) Then
                                If (arg0\Field48 > $14) Then
                                    arg0\Field48 = $00
                                    arg0\Field30 = $00
                                Else
                                    arg0\Field48 = (arg0\Field48 + $01)
                                EndIf
                            Else
                                pointentity(arg0\Field82, arg0\Field71[arg0\Field48]\Field0, 0.0)
                                rotateentity(arg0\Field82, 0.0, entityyaw(arg0\Field82, $01, 1.0), 0.0, $01)
                                arg0\Field64 = curvevalue(arg0\Field32, arg0\Field64, 20.0)
                                translateentity(arg0\Field82, ((cos((entityyaw(arg0\Field82, $01, 1.0) + 90.0)) * arg0\Field64) * fps\Field3[$00]), 0.0, ((sin((entityyaw(arg0\Field82, $01, 1.0) + 90.0)) * arg0\Field64) * fps\Field3[$00]), $01)
                                animatenpc(arg0, 488.0, 522.0, (arg0\Field64 * 26.0), $01)
                                usedoornpc(arg0, $01, $01)
                            EndIf
                            arg0\Field8 = (arg0\Field8 - fps\Field3[$00])
                        Else
                            If (((1.0 <= local8) And (0.0 >= arg0\Field57)) <> 0) Then
                                pointentity(arg0\Field82, arg0\Field59\Field82, 0.0)
                                rotateentity(arg0\Field82, 0.0, entityyaw(arg0\Field82, $01, 1.0), 0.0, $01)
                                arg0\Field64 = curvevalue(arg0\Field32, arg0\Field64, 20.0)
                                translateentity(arg0\Field82, ((cos((entityyaw(arg0\Field82, $01, 1.0) + 90.0)) * arg0\Field64) * fps\Field3[$00]), 0.0, ((sin((entityyaw(arg0\Field82, $01, 1.0) + 90.0)) * arg0\Field64) * fps\Field3[$00]), $01)
                                animatenpc(arg0, 488.0, 522.0, (arg0\Field64 * 26.0), $01)
                            ElseIf (0.0 >= arg0\Field57) Then
                                arg0\Field64 = 0.0
                                If (rand($23, $01) = $01) Then
                                    rotateentity(arg0\Field82, 0.0, rnd(360.0, 0.0), 0.0, $01)
                                EndIf
                                finishwalking(arg0, 488.0, 522.0, (arg0\Field32 * 26.0))
                            Else
                                pointentity(arg0\Field82, arg0\Field59\Field82, 0.0)
                                rotateentity(arg0\Field82, 0.0, entityyaw(arg0\Field82, $01, 1.0), 0.0, $01)
                                arg0\Field64 = curvevalue((- arg0\Field32), arg0\Field64, 20.0)
                                translateentity(arg0\Field82, ((cos((entityyaw(arg0\Field82, $01, 1.0) + 90.0)) * arg0\Field64) * fps\Field3[$00]), 0.0, ((sin((entityyaw(arg0\Field82, $01, 1.0) + 90.0)) * arg0\Field64) * fps\Field3[$00]), $01)
                                animatenpc(arg0, 522.0, 488.0, (arg0\Field64 * 26.0), $01)
                            EndIf
                            arg0\Field8 = (arg0\Field8 - local17)
                        EndIf
                        arg0\Field84 = curveangle(entityyaw(arg0\Field82, $01, 1.0), arg0\Field84, 20.0)
                    EndIf
                Else
                    arg0\Field59 = Null
                    arg0\Field60 = 0.0
                    arg0\Field61 = 0.0
                    arg0\Field74 = 0.0
                    arg0\Field65 = 0.0
                    arg0\Field57 = 0.0
                    arg0\Field66 = 0.0
                    Return $00
                EndIf
            Case 8.0
                arg0\Field32 = 0.0175
                arg0\Field65 = max((arg0\Field65 - fps\Field3[$00]), 0.0)
                arg0\Field63 = loopsoundex(snd_i\Field16, arg0\Field63, camera, arg0\Field82, 5.0, 1.0, $00)
                If (0.0 < arg0\Field65) Then
                    If (npcseesnpc(arg0\Field59, arg0, 36.0) = $01) Then
                        arg0\Field65 = 700.0
                    EndIf
                    If (local19 <> 0) Then
                        local8 = entitydistancesquared(arg0\Field82, local18\Field82)
                        If (0.64 > local8) Then
                            arg0\Field57 = 70.0
                        EndIf
                        If (0.0 < arg0\Field57) Then
                            arg0\Field30 = $00
                            arg0\Field48 = $00
                            arg0\Field8 = 1.0
                            arg0\Field57 = max((arg0\Field57 - fps\Field3[$00]), 0.0)
                        EndIf
                    EndIf
                    If (0.0 >= arg0\Field8) Then
                        If (local19 <> 0) Then
                            arg0\Field30 = findpath(arg0, entityx(local18\Field82, $01, 1.0), (entityy(local18\Field82, $01, 1.0) + 0.1), entityz(local18\Field82, $01, 1.0))
                        Else
                            For local0 = Each rooms
                                If ((((12.0 < (Abs (local0\Field40 - entityx(arg0\Field82, $01, 1.0)))) Lor (12.0 < (Abs (local0\Field37 - entityz(arg0\Field82, $01, 1.0))))) And (rand((Int max((Float ($04 - (Int (Abs (local0\Field37 - (entityz(arg0\Field82, $01, 1.0) / 8.0)))))), 2.0)), $01) = $01)) <> 0) Then
                                    local12 = local0\Field40
                                    local13 = 0.1
                                    local14 = local0\Field37
                                    Exit
                                EndIf
                            Next
                            arg0\Field30 = findpath(arg0, local12, local13, local14)
                        EndIf
                        If (arg0\Field30 = $01) Then
                            While (arg0\Field71[arg0\Field48] = Null)
                                If (arg0\Field48 > $14) Then
                                    arg0\Field48 = $00
                                    arg0\Field30 = $00
                                    Exit
                                Else
                                    arg0\Field48 = (arg0\Field48 + $01)
                                EndIf
                            Wend
                            If (arg0\Field48 < $14) Then
                                If (((arg0\Field71[arg0\Field48] <> Null) And (arg0\Field71[(arg0\Field48 + $01)] <> Null)) <> 0) Then
                                    If (arg0\Field71[arg0\Field48]\Field7 = Null) Then
                                        If ((Abs deltayaw(arg0\Field82, arg0\Field71[(arg0\Field48 + $01)]\Field0)) < (Abs deltayaw(arg0\Field82, arg0\Field71[arg0\Field48]\Field0))) Then
                                            arg0\Field48 = (arg0\Field48 + $01)
                                        EndIf
                                    EndIf
                                    usedoornpc(arg0, $01, $00)
                                EndIf
                            EndIf
                        EndIf
                        arg0\Field8 = ((rnd(6.0, 10.0) - (2.0 * (Float local19))) * 70.0)
                    ElseIf (((175.0 >= arg0\Field8) And (local18 = Null)) <> 0) Then
                        arg0\Field64 = 0.0
                        finishwalking(arg0, 488.0, 522.0, (arg0\Field32 * 26.0))
                        arg0\Field84 = curveangle(entityyaw(arg0\Field82, $01, 1.0), arg0\Field84, 20.0)
                        arg0\Field8 = (arg0\Field8 - fps\Field3[$00])
                    Else
                        If (arg0\Field30 = $02) Then
                            arg0\Field64 = 0.0
                            finishwalking(arg0, 488.0, 522.0, (arg0\Field32 * 26.0))
                            arg0\Field8 = (arg0\Field8 - local17)
                        ElseIf (arg0\Field30 = $01) Then
                            If (arg0\Field71[arg0\Field48] = Null) Then
                                If (arg0\Field48 > $14) Then
                                    arg0\Field48 = $00
                                    arg0\Field30 = $00
                                Else
                                    arg0\Field48 = (arg0\Field48 + $01)
                                EndIf
                            Else
                                pointentity(arg0\Field82, arg0\Field71[arg0\Field48]\Field0, 0.0)
                                rotateentity(arg0\Field82, 0.0, entityyaw(arg0\Field82, $01, 1.0), 0.0, $01)
                                arg0\Field64 = curvevalue(arg0\Field32, arg0\Field64, 20.0)
                                translateentity(arg0\Field82, ((cos((entityyaw(arg0\Field82, $01, 1.0) + 90.0)) * arg0\Field64) * fps\Field3[$00]), 0.0, ((sin((entityyaw(arg0\Field82, $01, 1.0) + 90.0)) * arg0\Field64) * fps\Field3[$00]), $01)
                                animatenpc(arg0, 488.0, 522.0, (arg0\Field64 * 26.0), $01)
                                usedoornpc(arg0, $01, $01)
                            EndIf
                            arg0\Field8 = (arg0\Field8 - fps\Field3[$00])
                        Else
                            If (local18 = Null) Then
                                arg0\Field64 = 0.0
                                If (rand($23, $01) = $01) Then
                                    rotateentity(arg0\Field82, 0.0, rnd(360.0, 0.0), 0.0, $01)
                                EndIf
                                finishwalking(arg0, 488.0, 522.0, (arg0\Field32 * 26.0))
                            ElseIf (0.0 >= arg0\Field57) Then
                                arg0\Field64 = 0.0
                                If (rand($23, $01) = $01) Then
                                    rotateentity(arg0\Field82, 0.0, rnd(360.0, 0.0), 0.0, $01)
                                EndIf
                                finishwalking(arg0, 488.0, 522.0, (arg0\Field32 * 26.0))
                            Else
                                arg0\Field64 = curvevalue((- arg0\Field32), arg0\Field64, 20.0)
                                pointentity(arg0\Field82, local18\Field82, 0.0)
                                rotateentity(arg0\Field82, 0.0, entityyaw(arg0\Field82, $01, 1.0), 0.0, $01)
                                translateentity(arg0\Field82, ((cos((entityyaw(arg0\Field82, $01, 1.0) + 90.0)) * arg0\Field64) * fps\Field3[$00]), 0.0, ((sin((entityyaw(arg0\Field82, $01, 1.0) + 90.0)) * arg0\Field64) * fps\Field3[$00]), $01)
                                animatenpc(arg0, 522.0, 488.0, (arg0\Field64 * 26.0), $01)
                            EndIf
                            arg0\Field8 = (arg0\Field8 - local17)
                        EndIf
                        arg0\Field84 = curveangle(entityyaw(arg0\Field82, $01, 1.0), arg0\Field84, 20.0)
                    EndIf
                Else
                    StopChannel(arg0\Field63)
                    arg0\Field63 = $00
                    playsoundex(loadtempsound("SFX\Interact\NVGOff.ogg"), camera, arg0\Field82, 5.0, 1.0, $00, $00)
                    arg0\Field59 = Null
                    arg0\Field60 = 0.0
                    arg0\Field61 = 0.0
                    arg0\Field74 = 0.0
                    arg0\Field65 = 0.0
                    arg0\Field57 = 0.0
                    arg0\Field66 = 0.0
                    Return $00
                EndIf
            Case 9.0
                If (arg0\Field59 = Null) Then
                    arg0\Field60 = 0.0
                    arg0\Field61 = 0.0
                    arg0\Field74 = 0.0
                    arg0\Field65 = 0.0
                    arg0\Field57 = 0.0
                    arg0\Field66 = 0.0
                    Return $00
                EndIf
                arg0\Field65 = max((arg0\Field65 - fps\Field3[$00]), 0.0)
                If (((0.0 < arg0\Field65) And (arg0\Field59\Field1 = $00)) <> 0) Then
                    local8 = entitydistancesquared(arg0\Field82, arg0\Field59\Field82)
                    If (npcseesnpc(arg0\Field59, arg0, 36.0) = $01) Then
                        arg0\Field65 = 1050.0
                        pointentity(arg0\Field82, arg0\Field59\Field82, 0.0)
                        rotateentity(arg0\Field82, 0.0, entityyaw(arg0\Field82, $01, 1.0), 0.0, $01)
                        If (4.0 > local8) Then
                            arg0\Field57 = 140.0
                        EndIf
                        If (0.0 < arg0\Field57) Then
                            arg0\Field32 = 0.02
                            arg0\Field30 = $00
                            arg0\Field48 = $00
                            arg0\Field8 = 1.0
                            arg0\Field64 = curvevalue((- arg0\Field32), arg0\Field64, 20.0)
                            translateentity(arg0\Field82, ((cos((entityyaw(arg0\Field82, $01, 1.0) + 90.0)) * arg0\Field64) * fps\Field3[$00]), 0.0, ((sin((entityyaw(arg0\Field82, $01, 1.0) + 90.0)) * arg0\Field64) * fps\Field3[$00]), $01)
                            animatenpc(arg0, 522.0, 488.0, (arg0\Field64 * 26.0), $01)
                            arg0\Field57 = max((arg0\Field57 - fps\Field3[$00]), 0.0)
                        EndIf
                        arg0\Field84 = curveangle(entityyaw(arg0\Field82, $01, 1.0), arg0\Field84, 10.0)
                        If (0.0 >= arg0\Field62) Then
                            playsoundex(snd_i\Field29[$00], camera, arg0\Field82, 15.0, 1.0, $00, $00)
                            local10 = createpivot($00)
                            rotateentity(local10, entitypitch(arg0\Field82, $00, 1.0), entityyaw(arg0\Field82, $00, 1.0), 0.0, $01)
                            positionentity(local10, entityx(arg0\Field98, $00, 1.0), entityy(arg0\Field98, $00, 1.0), entityz(arg0\Field98, $00, 1.0), $00)
                            moveentity(local10, 0.0622, 0.83925, 0.5351, $00)
                            If ((min(hidedistance, fog\Field13) * min(hidedistance, fog\Field13)) > entitydistancesquared(XZ0260X8X2\Field74, arg0\Field82)) Then
                                lightvolume = (templightvolume * 1.2)
                            EndIf
                            local6 = setemitter(Null, entityx(local10, $00, 1.0), entityy(local10, $00, 1.0), entityz(local10, $00, 1.0), $0D)
                            entityparent(local6\Field2, arg0\Field82, $01)
                            setemitter(Null, entityx(arg0\Field59\Field82, $00, 1.0), entityy(arg0\Field59\Field82, $00, 1.0), entityz(arg0\Field59\Field82, $00, 1.0), $0F)
                            freeentity(local10)
                            local10 = $00
                            playsoundex(snd_i\Field54, camera, arg0\Field59\Field82, 5.0, 1.0, $00, $00)
                            If (arg0\Field59\Field4 > $00) Then
                                arg0\Field59\Field4 = (Int max((Float (arg0\Field59\Field4 - rand($05, $0A))), 0.0))
                            Else
                                If (arg0\Field59\Field1 = $00) Then
                                    local27 = arg0\Field59\Field77
                                    If (local27 = $04) Then
                                        If (local18 = Null) Then
                                            loadnpcsound(arg0, "SFX\Character\MTF\049_2\TargetTerminated.ogg", $00)
                                            playmtfsound(arg0\Field55, arg0)
                                        EndIf
                                    EndIf
                                EndIf
                                arg0\Field59 = Null
                                arg0\Field60 = 0.0
                                arg0\Field61 = 0.0
                                arg0\Field74 = 0.0
                                arg0\Field65 = 0.0
                                arg0\Field57 = 0.0
                                arg0\Field66 = 0.0
                                Return $00
                            EndIf
                            arg0\Field62 = 8.0
                        EndIf
                        arg0\Field30 = $00
                    ElseIf (0.0 >= arg0\Field8) Then
                        arg0\Field30 = findpath(arg0, entityx(arg0\Field59\Field82, $00, 1.0), entityy(arg0\Field59\Field82, $00, 1.0), entityz(arg0\Field59\Field82, $00, 1.0))
                        If (arg0\Field30 = $01) Then
                            While (arg0\Field71[arg0\Field48] = Null)
                                If (arg0\Field48 > $14) Then
                                    arg0\Field48 = $00
                                    arg0\Field30 = $00
                                    Exit
                                Else
                                    arg0\Field48 = (arg0\Field48 + $01)
                                EndIf
                            Wend
                            If (arg0\Field48 < $14) Then
                                If (((arg0\Field71[arg0\Field48] <> Null) And (arg0\Field71[(arg0\Field48 + $01)] <> Null)) <> 0) Then
                                    If (arg0\Field71[arg0\Field48]\Field7 = Null) Then
                                        If ((Abs deltayaw(arg0\Field82, arg0\Field71[(arg0\Field48 + $01)]\Field0)) < (Abs deltayaw(arg0\Field82, arg0\Field71[arg0\Field48]\Field0))) Then
                                            arg0\Field48 = (arg0\Field48 + $01)
                                        EndIf
                                    EndIf
                                    usedoornpc(arg0, $01, $00)
                                EndIf
                            EndIf
                        EndIf
                        arg0\Field8 = (rnd(6.0, 10.0) * 70.0)
                    Else
                        If (arg0\Field30 = $02) Then
                            arg0\Field64 = 0.0
                            If (rand($23, $01) = $01) Then
                                rotateentity(arg0\Field82, 0.0, rnd(360.0, 0.0), 0.0, $01)
                            EndIf
                            finishwalking(arg0, 488.0, 522.0, (arg0\Field32 * 26.0))
                            arg0\Field8 = (arg0\Field8 - local17)
                        ElseIf (arg0\Field30 = $01) Then
                            If (arg0\Field71[arg0\Field48] = Null) Then
                                If (arg0\Field48 > $14) Then
                                    arg0\Field48 = $00
                                    arg0\Field30 = $00
                                Else
                                    arg0\Field48 = (arg0\Field48 + $01)
                                EndIf
                            Else
                                pointentity(arg0\Field82, arg0\Field71[arg0\Field48]\Field0, 0.0)
                                rotateentity(arg0\Field82, 0.0, entityyaw(arg0\Field82, $01, 1.0), 0.0, $01)
                                arg0\Field64 = curvevalue(arg0\Field32, arg0\Field64, 20.0)
                                translateentity(arg0\Field82, ((cos((entityyaw(arg0\Field82, $01, 1.0) + 90.0)) * arg0\Field64) * fps\Field3[$00]), 0.0, ((sin((entityyaw(arg0\Field82, $01, 1.0) + 90.0)) * arg0\Field64) * fps\Field3[$00]), $01)
                                animatenpc(arg0, 488.0, 522.0, (arg0\Field64 * 26.0), $01)
                                usedoornpc(arg0, $01, $01)
                            EndIf
                            arg0\Field8 = (arg0\Field8 - fps\Field3[$00])
                        Else
                            If (((1.0 <= local8) And (0.0 >= arg0\Field57)) <> 0) Then
                                pointentity(arg0\Field82, arg0\Field59\Field82, 0.0)
                                rotateentity(arg0\Field82, 0.0, entityyaw(arg0\Field82, $01, 1.0), 0.0, $01)
                                arg0\Field64 = curvevalue(arg0\Field32, arg0\Field64, 20.0)
                                translateentity(arg0\Field82, ((cos((entityyaw(arg0\Field82, $01, 1.0) + 90.0)) * arg0\Field64) * fps\Field3[$00]), 0.0, ((sin((entityyaw(arg0\Field82, $01, 1.0) + 90.0)) * arg0\Field64) * fps\Field3[$00]), $01)
                                animatenpc(arg0, 488.0, 522.0, (arg0\Field64 * 26.0), $01)
                            ElseIf (0.0 >= arg0\Field57) Then
                                arg0\Field64 = 0.0
                                If (rand($23, $01) = $01) Then
                                    rotateentity(arg0\Field82, 0.0, rnd(360.0, 0.0), 0.0, $01)
                                EndIf
                                finishwalking(arg0, 488.0, 522.0, (arg0\Field32 * 26.0))
                            Else
                                pointentity(arg0\Field82, arg0\Field59\Field82, 0.0)
                                rotateentity(arg0\Field82, 0.0, entityyaw(arg0\Field82, $01, 1.0), 0.0, $01)
                                arg0\Field64 = curvevalue((- arg0\Field32), arg0\Field64, 20.0)
                                translateentity(arg0\Field82, ((cos((entityyaw(arg0\Field82, $01, 1.0) + 90.0)) * arg0\Field64) * fps\Field3[$00]), 0.0, ((sin((entityyaw(arg0\Field82, $01, 1.0) + 90.0)) * arg0\Field64) * fps\Field3[$00]), $01)
                                animatenpc(arg0, 522.0, 488.0, (arg0\Field64 * 26.0), $01)
                            EndIf
                            arg0\Field8 = (arg0\Field8 - local17)
                        EndIf
                        arg0\Field84 = curveangle(entityyaw(arg0\Field82, $01, 1.0), arg0\Field84, 20.0)
                    EndIf
                Else
                    arg0\Field59 = Null
                    arg0\Field60 = 0.0
                    arg0\Field61 = 0.0
                    arg0\Field74 = 0.0
                    arg0\Field65 = 0.0
                    arg0\Field57 = 0.0
                    arg0\Field66 = 0.0
                    Return $00
                EndIf
            Case 7.0
                If (0.0 = (Float arg0\Field17)) Then
                    animatenpc(arg0, 1050.0, 1060.0, 0.1, $00)
                    If (1059.9 < arg0\Field103) Then
                        arg0\Field17 = $01
                    EndIf
                Else
                    animatenpc(arg0, 1060.0, 1050.0, -0.1, $00)
                    If (1050.1 > arg0\Field103) Then
                        arg0\Field66 = (Float arg0\Field13)
                        arg0\Field17 = $00
                        arg0\Field13 = $00
                        Return $00
                    EndIf
                EndIf
        End Select
        If (0.01 < arg0\Field64) Then
            If ((((505.0 > local11) And (505.0 <= arg0\Field103)) Lor ((521.0 > local11) And (521.0 <= arg0\Field103))) <> 0) Then
                playsoundex(snd_i\Field51[rand($00, $02)], camera, arg0\Field82, 8.0, rnd(0.5, 0.7), $00, $00)
            EndIf
        ElseIf (-0.01 > arg0\Field64) Then
            If ((((521.0 <= local11) And (521.0 > arg0\Field103)) Lor ((505.0 <= local11) And (505.0 > arg0\Field103))) <> 0) Then
                playsoundex(snd_i\Field51[rand($00, $02)], camera, arg0\Field82, 8.0, rnd(0.5, 0.7), $00, $00)
            EndIf
        EndIf
        If (playerroom\Field22\Field21 <> $4C) Then
            If (rand($64, $01) = $01) Then
                If (local19 <> 0) Then
                    If (((0.0 = arg0\Field66) Lor (8.0 = arg0\Field66)) <> 0) Then
                        If (256.0 < entitydistancesquared(arg0\Field82, local18\Field82)) Then
                            If (((entityinview(arg0\Field82, camera) = $00) And (entityinview(local18\Field82, camera) = $00)) <> 0) Then
                                teleportentity(arg0\Field82, entityx(local18\Field82, $01, 1.0), (entityy(local18\Field82, $01, 1.0) + 0.28), entityz(local18\Field82, $01, 1.0), arg0\Field23, $01, 2.0, $00)
                                arg0\Field90 = local18\Field90
                            EndIf
                        EndIf
                    EndIf
                EndIf
            EndIf
        EndIf
        If (((playerroom\Field22\Field21 <> $3C) And (arg0\Field24 = $FFFFFFFF)) <> 0) Then
            teleportcloser(arg0)
        EndIf
        If (arg0\Field4 <= $00) Then
            arg0\Field1 = $01
            local28 = $01
            For local2 = Each npcs
                If (local2\Field77 = $18) Then
                    If (local2\Field1 = $00) Then
                        local28 = $00
                        Exit
                    EndIf
                EndIf
            Next
            If (local28 <> 0) Then
                playannouncement("SFX\Character\MTF\AnnouncLost.ogg", $01)
            EndIf
        EndIf
    EndIf
    positionentity(arg0\Field98, entityx(arg0\Field82, $01, 1.0), (entityy(arg0\Field82, $01, 1.0) - arg0\Field23), entityz(arg0\Field82, $01, 1.0), $01)
    rotateentity(arg0\Field98, -90.0, arg0\Field84, 0.0, $01)
    Return $00
End Function

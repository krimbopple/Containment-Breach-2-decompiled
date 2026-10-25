Function updateendings%()
    Local local0.events
    Local local1.events
    Local local2.npcs
    Local local3.rooms
    Local local4.particles
    Local local5%
    Local local6.dummy1499_1
    Local local7.emitter
    Local local8#
    Local local9%
    Local local10%
    Local local11%
    Local local12%
    Local local13%
    Local local14%
    Local local15#
    Local local16%
    Local local17#
    Local local18#
    Local local19#
    Local local20#
    Local local21#
    Local local23#
    For local0 = Each events
        Select local0\Field32
            Case $2D
                If (playerroom = local0\Field19) Then
                    If (0.0 = local0\Field4) Then
                        renderloading(0.0, getlocalstring("loading", "ending"), $00, 0.025)
                        For local2 = Each npcs
                            If (((local2 <> n_i\Field2) And (local2 <> n_i\Field3)) <> 0) Then
                                removenpc(local2)
                            EndIf
                        Next
                        n_i\Field1 = Null
                        n_i\Field8 = Null
                        n_i\Field10 = Null
                        n_i\Field0 = Null
                        For local6 = Each dummy1499_1
                            removedummy1499_1(local6)
                        Next
                        local0\Field19\Field32[$00] = createnpc($13, local0\Field19\Field40, (local0\Field19\Field3 + 10.0), local0\Field19\Field37)
                        local0\Field19\Field32[$00]\Field66 = 1.0
                        tformpoint(5203.0, 1444.0, -1739.0, local0\Field19\Field15, $00)
                        local0\Field19\Field32[$01] = createnpc($17, tformedx(), tformedy(), tformedz())
                        local0\Field19\Field32[$01]\Field66 = 0.0
                        local0\Field19\Field32[$01]\Field65 = 10.0
                        tformpoint(6234.0, 200.0, -8451.0, local0\Field19\Field15, $00)
                        local0\Field19\Field32[$06] = createnpc($17, tformedx(), tformedy(), tformedz())
                        rotateentity(local0\Field19\Field32[$06]\Field82, 0.0, ((Float local0\Field19\Field21) + 90.0), 0.0, $00)
                        createnpcasset(local0\Field19\Field32[$06])
                        local0\Field19\Field32[$06]\Field66 = 15.0
                        local0\Field19\Field27[$00] = loadmesh_strict("GFX\Map\exit1terrain.b3d", local0\Field19\Field15, $01)
                        scaleentity(local0\Field19\Field27[$00], (1.0 / 256.0), (1.0 / 256.0), (1.0 / 256.0), $01)
                        rotateentity(local0\Field19\Field27[$00], 0.0, (Float local0\Field19\Field21), 0.0, $01)
                        positionentity(local0\Field19\Field27[$00], (local0\Field19\Field40 + 17.01562), (local0\Field19\Field3 - 3.972656), (local0\Field19\Field37 + 10.10938), $01)
                        renderloading(60.0, getlocalstring("loading", "ending"), $00, 0.025)
                        sky = createsky("GFX\Map\Textures\sky", $00)
                        rotateentity(sky, 0.0, ((Float local0\Field19\Field21) - 90.0), 0.0, $00)
                        resetentity(XZ0260X8X2\Field74)
                        renderloading(90.0, getlocalstring("loading", "ending"), $00, 0.025)
                        isblackout = $00
                        hidedistance = 60.0
                        createconsolemsg("", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                        createconsolemsg(getlocalstring("misc", "warning2"), $FF, $00, $00, $00)
                        createconsolemsg("", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                        local0\Field4 = 1.0
                        renderloading(100.0, "", $00, 0.025)
                    Else
                        updatesky(sky, $00)
                        cansave = $01
                        For local3 = Each rooms
                            hideroomsnocoll(local3)
                        Next
                        showroomsnocoll(local0\Field19)
                        showroomscoll(local0\Field19)
                        If (local0\Field19\Field32[$06] <> Null) Then
                            If ((local0\Field19\Field40 - (1.0 / 1.024)) < entityx(XZ0260X8X2\Field74, $01, 1.0)) Then
                                local0\Field19\Field32[$06]\Field66 = 16.0
                            EndIf
                            If ((local0\Field19\Field40 + (1.0 / 0.128)) > entityx(local0\Field19\Field32[$06]\Field82, $01, 1.0)) Then
                                removenpc(local0\Field19\Field32[$06])
                                For local9 = $08 To $09 Step $01
                                    If (npcsound[local9] <> $00) Then
                                        freesound_strict(npcsound[local9])
                                        npcsound[local9] = $00
                                    EndIf
                                Next
                            EndIf
                        EndIf
                        If (((2.0 > local0\Field4) And (XZ0260X8X2\Field40 = $FFFFFFFF)) <> 0) Then
                            If (2.0 = local0\Field19\Field32[$00]\Field66) Then
                                shouldplay = $06
                            Else
                                local0\Field7 = ((local0\Field7 + fps\Field3[$00]) Mod 3600.0)
                                positionentity(local0\Field19\Field32[$00]\Field82, (entityx(local0\Field19\Field15, $01, 1.0) + ((cos((local0\Field7 / 10.0)) * 6000.0) * (1.0 / 256.0))), (local0\Field19\Field3 + 12.5625), (entityz(local0\Field19\Field15, $01, 1.0) + ((sin((local0\Field7 / 10.0)) * 6000.0) * (1.0 / 256.0))), $00)
                                rotateentity(local0\Field19\Field32[$00]\Field82, 7.0, (local0\Field7 / 10.0), 20.0, $00)
                                shouldplay = $05
                            EndIf
                            If ((1.0 / 0.64) > entitydistancesquared(XZ0260X8X2\Field74, local0\Field19\Field27[$03])) Then
                                For local9 = $02 To $03 Step $01
                                    local0\Field19\Field25[local9]\Field39 = $00
                                    local0\Field19\Field25[local9]\Field21 = $01
                                Next
                                tformpoint(-5424.0, 200.0, -1068.0, local0\Field19\Field15, $00)
                                local0\Field19\Field32[$02] = createnpc($13, tformedx(), tformedy(), tformedz())
                                local0\Field19\Field32[$02]\Field66 = 3.0
                                local0\Field19\Field32[$03] = createnpc($13, entityx(local0\Field19\Field27[$02], $01, 1.0), (entityy(local0\Field19\Field27[$02], $01, 1.0) - 2.0), entityz(local0\Field19\Field27[$02], $01, 1.0))
                                local0\Field19\Field32[$03]\Field66 = 3.0
                                local0\Field19\Field32[$00]\Field66 = 3.0
                                removenpc(local0\Field19\Field32[$01])
                                local0\Field2 = streamsound_strict("SFX\Ending\GateB\682Battle.ogg", (opt\Field59 * opt\Field2), $00)
                                local0\Field20 = $01
                                local0\Field4 = 2.0
                            EndIf
                        Else
                            shouldplay = $06
                            local0\Field4 = (local0\Field4 + fps\Field3[$00])
                            If (2800.0 > local0\Field4) Then
                                local19 = entityx(local0\Field19\Field27[$04], $01, 1.0)
                                local20 = entityy(local0\Field19\Field27[$04], $01, 1.0)
                                local21 = entityz(local0\Field19\Field27[$04], $01, 1.0)
                                local0\Field19\Field32[$00]\Field60 = ((sin(((Float millisec) / 25.0)) * 3.0) + local19)
                                local0\Field19\Field32[$00]\Field61 = ((cos(((Float millisec) / 85.0)) + local20) + 9.0)
                                local0\Field19\Field32[$00]\Field74 = ((cos(((Float millisec) / 25.0)) * 3.0) + local21)
                                If (local0\Field19\Field32[$02] <> Null) Then
                                    local0\Field19\Field32[$00]\Field60 = ((sin(((Float millisec) / 25.0)) * 3.0) + local19)
                                    local0\Field19\Field32[$00]\Field61 = ((cos(((Float millisec) / 85.0)) + local20) + 9.0)
                                    local0\Field19\Field32[$00]\Field74 = ((cos(((Float millisec) / 25.0)) * 3.0) + local21)
                                EndIf
                                If (3.0 = local0\Field19\Field32[$03]\Field66) Then
                                    local0\Field19\Field32[$02]\Field60 = ((sin(((Float millisec) / 23.0)) * 3.0) + local19)
                                    local0\Field19\Field32[$02]\Field61 = ((cos(((Float millisec) / 83.0)) + local20) + 5.0)
                                    local0\Field19\Field32[$02]\Field74 = ((cos(((Float millisec) / 23.0)) * 3.0) + local21)
                                EndIf
                            EndIf
                        EndIf
                        If (((42.0 < local0\Field4) And (2954.0 > local0\Field4)) <> 0) Then
                            If (49.0 > local0\Field4) Then
                                XZ0260X8X2\Field1 = 0.5
                            ElseIf (((224.0 < local0\Field4) And (231.0 > local0\Field4)) <> 0) Then
                                XZ0260X8X2\Field1 = 0.5
                            ElseIf (((427.0 < local0\Field4) And (434.0 > local0\Field4)) <> 0) Then
                                XZ0260X8X2\Field1 = 0.5
                            ElseIf (((756.0 > local0\Field4) And (763.0 > local0\Field4)) <> 0) Then
                                XZ0260X8X2\Field1 = 0.5
                            ElseIf (((847.0 < local0\Field4) And (861.0 > local0\Field4)) <> 0) Then
                                XZ0260X8X2\Field1 = 1.0
                            ElseIf (((931.0 < local0\Field4) And (945.0 > local0\Field4)) <> 0) Then
                                XZ0260X8X2\Field1 = 1.5
                            ElseIf (((1155.0 < local0\Field4) And (1295.0 > local0\Field4)) <> 0) Then
                                XZ0260X8X2\Field1 = 3.0
                            ElseIf (((1505.0 < local0\Field4) And (1680.0 > local0\Field4)) <> 0) Then
                                XZ0260X8X2\Field1 = 2.0
                            ElseIf (((1785.0 < local0\Field4) And (1890.0 > local0\Field4)) <> 0) Then
                                XZ0260X8X2\Field1 = 2.0
                            ElseIf (((2170.0 < local0\Field4) And (2205.0 > local0\Field4)) <> 0) Then
                                XZ0260X8X2\Field1 = 0.5
                            ElseIf (((2450.0 < local0\Field4) And (2555.0 > local0\Field4)) <> 0) Then
                                XZ0260X8X2\Field1 = 1.5
                                If (2450.0 >= (local0\Field4 - fps\Field3[$00])) Then
                                    local0\Field2 = streamsound_strict("SFX\Ending\GateB\DetonatingAlphaWarheads.ogg", (opt\Field59 * opt\Field2), $00)
                                    local0\Field20 = $01
                                EndIf
                            ElseIf (((2765.0 < local0\Field4) And (2786.0 > local0\Field4)) <> 0) Then
                                XZ0260X8X2\Field1 = 1.0
                            ElseIf (2940.0 < local0\Field4) Then
                                XZ0260X8X2\Field1 = 0.5
                                local19 = entityx(local0\Field19\Field27[$05], $01, 1.0)
                                local20 = entityy(local0\Field19\Field27[$05], $01, 1.0)
                                local21 = entityz(local0\Field19\Field27[$05], $01, 1.0)
                                local0\Field19\Field32[$00]\Field60 = (local19 + 4.0)
                                local0\Field19\Field32[$00]\Field61 = (local20 + 4.0)
                                local0\Field19\Field32[$00]\Field74 = (local21 + 4.0)
                                local0\Field19\Field32[$02]\Field60 = local19
                                local0\Field19\Field32[$02]\Field61 = local20
                                local0\Field19\Field32[$02]\Field74 = local21
                            EndIf
                        EndIf
                        If (3150.0 <= local0\Field4) Then
                            If (5250.0 > local0\Field4) Then
                                If (local0\Field8 = $00) Then
                                    local0\Field8 = streamsound_strict("SFX\Ending\GateB\Siren.ogg", (opt\Field13 * opt\Field2), $02)
                                    local0\Field26 = $01
                                EndIf
                            ElseIf (XZ0260X8X2\Field40 = $FFFFFFFF) Then
                                If (local0\Field2 <> $00) Then
                                    stopstream_strict(local0\Field2)
                                    local0\Field2 = $00
                                    local0\Field20 = $00
                                EndIf
                                If (local0\Field8 <> $00) Then
                                    stopstream_strict(local0\Field8)
                                    local0\Field8 = $00
                                    local0\Field26 = $00
                                EndIf
                                local12 = $01
                                For local1 = Each events
                                    If (local1\Field32 = $1F) Then
                                        local12 = (Int local1\Field4)
                                        Exit
                                    EndIf
                                Next
                                If (1.0 = (Float local12)) Then
                                    shouldplay = $42
                                    XZ0260X8X2\Field33 = max(XZ0260X8X2\Field33, 0.1)
                                    resetselectedstuff()
                                    XZ0260X8X2\Field40 = $03
                                Else
                                    local0\Field8 = streamsound_strict("SFX\Ending\GateB\AlphaWarheadsFail.ogg", (opt\Field59 * opt\Field2), $00)
                                    local0\Field26 = $01
                                    tformpoint(3600.0, -830.0, 6623.0, local0\Field19\Field15, $00)
                                    local2 = createnpc($18, tformedx(), tformedy(), tformedz())
                                    local0\Field19\Field32[$04] = local2
                                    tformpoint(4352.0, 200.0, 255.0, local0\Field19\Field15, $00)
                                    local2 = createnpc($18, tformedx(), tformedy(), tformedz())
                                    local0\Field19\Field32[$05] = local2
                                    For local9 = $04 To $05 Step $01
                                        local0\Field19\Field32[local9]\Field60 = entityx(XZ0260X8X2\Field74, $00, 1.0)
                                        local0\Field19\Field32[local9]\Field61 = entityy(XZ0260X8X2\Field74, $00, 1.0)
                                        local0\Field19\Field32[local9]\Field74 = entityz(XZ0260X8X2\Field74, $00, 1.0)
                                        local0\Field19\Field32[local9]\Field66 = 3.0
                                    Next
                                    XZ0260X8X2\Field40 = $02
                                    local0\Field4 = 5950.0
                                EndIf
                            ElseIf (XZ0260X8X2\Field40 = $02) Then
                                local0\Field19\Field25[$04]\Field39 = $01
                                local0\Field19\Field25[$04]\Field21 = $00
                                local19 = entityx(local0\Field19\Field27[$04], $01, 1.0)
                                local20 = entityy(local0\Field19\Field27[$04], $01, 1.0)
                                local21 = entityz(local0\Field19\Field27[$04], $01, 1.0)
                                local0\Field19\Field32[$00]\Field60 = ((sin(((Float millisec) / 25.0)) * 3.0) + local19)
                                local0\Field19\Field32[$00]\Field61 = ((cos(((Float millisec) / 85.0)) + local20) + 9.0)
                                local0\Field19\Field32[$00]\Field74 = ((cos(((Float millisec) / 25.0)) * 3.0) + local21)
                                local0\Field19\Field32[$02]\Field60 = ((sin(((Float millisec) / 23.0)) * 3.0) + local19)
                                local0\Field19\Field32[$02]\Field61 = ((cos(((Float millisec) / 83.0)) + local20) + 5.0)
                                local0\Field19\Field32[$02]\Field74 = ((cos(((Float millisec) / 23.0)) * 3.0) + local21)
                                For local9 = $04 To $05 Step $01
                                    local0\Field19\Field32[local9]\Field60 = entityx(XZ0260X8X2\Field74, $00, 1.0)
                                    local0\Field19\Field32[local9]\Field61 = entityy(XZ0260X8X2\Field74, $00, 1.0)
                                    local0\Field19\Field32[local9]\Field74 = entityz(XZ0260X8X2\Field74, $00, 1.0)
                                Next
                                If ((((5.0 <> local0\Field19\Field32[$04]\Field66) And (npcseesplayer(local0\Field19\Field32[$04], ((4.0 - XZ0260X8X2\Field46) + XZ0260X8X2\Field68), 75.0, $00) = $01)) Lor ((5.0 <> local0\Field19\Field32[$05]\Field66) And (npcseesplayer(local0\Field19\Field32[$05], ((4.0 - XZ0260X8X2\Field46) + XZ0260X8X2\Field68), 75.0, $00) = $01))) <> 0) Then
                                    For local9 = $04 To $05 Step $01
                                        local0\Field19\Field32[local9]\Field66 = 5.0
                                    Next
                                    shouldplay = $00
                                    makemeunplayable($01)
                                    local0\Field2 = playsound_strict(loadtempsound("SFX\Ending\GateB\THEREHEIS.ogg"), $01, $00)
                                EndIf
                                If (((5.0 = local0\Field19\Field32[$04]\Field66) And (ChannelPlaying(local0\Field2) = $00)) <> 0) Then
                                    clearcheats()
                                    playsound_strict(loadtempsound("SFX\Ending\GateB\Gunshot.ogg"), $00, $00)
                                    XZ0260X8X2\Field78 = 1.0
                                    XZ0260X8X2\Field48 = 1.0
                                    msg\Field8 = ""
                                    XZ0260X8X2\Field53 = -10.0
                                    For local2 = Each npcs
                                        If (local2\Field77 = $18) Then
                                            removenpc(local2)
                                        EndIf
                                    Next
                                    removeevent(local0)
                                    Return $00
                                    Exit
                                EndIf
                            EndIf
                        EndIf
                        If (1855.0 < local0\Field4) Then
                            If (0.0 = local0\Field1) Then
                                local0\Field19\Field27[$06] = loadmesh_strict("GFX\NPCs\scp_682_arm.b3d", $00, $01)
                                scaleentity(local0\Field19\Field27[$06], 0.15, 0.15, 0.15, $00)
                                local12 = (Int ((min((((entitydistance(local0\Field19\Field32[$03]\Field82, XZ0260X8X2\Field74) / (1.0 / 256.0)) - 3000.0) / 4.0), 1000.0) + 1408.0) * (1.0 / 256.0)))
                                positionentity(local0\Field19\Field27[$06], entityx(local0\Field19\Field32[$03]\Field82, $00, 1.0), (local0\Field19\Field3 + 5.5), entityz(local0\Field19\Field32[$03]\Field82, $00, 1.0), $00)
                                rotateentity(local0\Field19\Field27[$06], 0.0, ((Float local0\Field19\Field21) + rnd(-10.0, 10.0)), 0.0, $01)
                                turnentity(local0\Field19\Field27[$06], 0.0, 0.0, 180.0, $00)
                                local0\Field1 = 1.0
                            ElseIf (local0\Field19\Field27[$06] <> $00) Then
                                If (340.0 > wrapangle(entityroll(local0\Field19\Field27[$06], $00, 1.0), 360.0)) Then
                                    local15 = wrapangle(entityroll(local0\Field19\Field27[$06], $00, 1.0), 360.0)
                                    turnentity(local0\Field19\Field27[$06], 0.0, 0.0, ((((Abs sin(local15)) * 2.0) + 5.0) * fps\Field3[$00]), $00)
                                    If (((270.0 > local15) And (270.0 <= wrapangle(entityroll(local0\Field19\Field27[$06], $00, 1.0), 360.0))) <> 0) Then
                                        playsound_strict(loadtempsound("SFX\Character\Apache\Crash0.ogg"), $00, $00)
                                        local0\Field19\Field32[$03]\Field66 = 4.0
                                        local0\Field19\Field32[$03]\Field65 = 1.0
                                        local0\Field19\Field32[$03]\Field60 = entityx(local0\Field19\Field27[$02], $01, 1.0)
                                        local0\Field19\Field32[$03]\Field61 = (entityy(local0\Field19\Field27[$02], $01, 1.0) - 2.5)
                                        local0\Field19\Field32[$03]\Field74 = entityz(local0\Field19\Field27[$02], $01, 1.0)
                                        local7 = setemitter(Null, entityx(local0\Field19\Field32[$03]\Field82, $00, 1.0), entityy(local0\Field19\Field32[$03]\Field82, $00, 1.0), entityz(local0\Field19\Field32[$03]\Field82, $00, 1.0), $08)
                                        entityparent(local7\Field2, local0\Field19\Field32[$03]\Field82, $01)
                                    EndIf
                                Else
                                    freeentity(local0\Field19\Field27[$06])
                                    local0\Field19\Field27[$06] = $00
                                EndIf
                            EndIf
                        EndIf
                    EndIf
                    local15 = max(sin(entityyaw(XZ0260X8X2\Field74, $00, 1.0)), 0.0)
                    If (local0\Field19\Field32[$01] <> Null) Then
                        If (((225.0 > entitydistancesquared(local0\Field19\Field32[$01]\Field82, XZ0260X8X2\Field74)) And ((chs\Field8 Lor i_268\Field3) = $00)) <> 0) Then
                            local0\Field19\Field32[$01]\Field66 = 1.0
                            local0\Field19\Field32[$01]\Field57 = 1.0
                        Else
                            local0\Field19\Field32[$01]\Field66 = 0.0
                            local0\Field19\Field32[$01]\Field57 = 0.0
                        EndIf
                        If (((((79.21 > entitydistancesquared(local0\Field19\Field32[$01]\Field82, XZ0260X8X2\Field74)) Lor (285.61 > entitydistancesquared(local0\Field19\Field27[$01], XZ0260X8X2\Field74))) Lor chs\Field8) Lor i_268\Field3) <> 0) Then
                            local0\Field19\Field32[$01]\Field57 = 0.0
                        Else
                            local0\Field19\Field32[$01]\Field57 = 1.0
                        EndIf
                    EndIf
                Else
                    hideroomsnocoll(local0\Field19)
                EndIf
            Case $2F
                If (playerroom = local0\Field19) Then
                    If (0.0 = local0\Field4) Then
                        renderloading(0.0, getlocalstring("loading", "ending"), $00, 0.025)
                        For local2 = Each npcs
                            If (((local2 <> n_i\Field2) And (local2 <> n_i\Field3)) <> 0) Then
                                removenpc(local2)
                            EndIf
                        Next
                        n_i\Field1 = Null
                        n_i\Field8 = Null
                        n_i\Field10 = Null
                        n_i\Field0 = Null
                        For local6 = Each dummy1499_1
                            removedummy1499_1(local6)
                        Next
                        tformpoint(1784.0, 2124.0, 4512.0, local0\Field19\Field15, $00)
                        local0\Field19\Field32[$00] = createnpc($17, tformedx(), tformedy(), tformedz())
                        local0\Field19\Field32[$00]\Field66 = 0.0
                        tformpoint(-5048.0, 1912.0, 4656.0, local0\Field19\Field15, $00)
                        local0\Field19\Field32[$01] = createnpc($17, tformedx(), tformedy(), tformedz())
                        local0\Field19\Field32[$01]\Field66 = 0.0
                        tformpoint(-5615.0, 1901.0, 6904.0, local0\Field19\Field15, $00)
                        local2 = createnpc($16, tformedx(), tformedy(), tformedz())
                        changenpctextureid(local2, $05)
                        local2\Field66 = -1.0
                        setnpcframe(local2, 326.0, $01)
                        rotateentity(local2\Field82, 0.0, 270.0, 0.0, $00)
                        For local9 = $02 To $04 Step $01
                            local0\Field19\Field32[local9] = createnpc($13, local0\Field19\Field40, (local0\Field19\Field3 + 11.0), local0\Field19\Field37)
                            local0\Field19\Field32[local9]\Field66 = (Float (n_i\Field2\Field93 = $00))
                        Next
                        tformpoint(1824.0, 128.0, 7056.0, local0\Field19\Field15, $00)
                        local19 = tformedx()
                        local20 = tformedy()
                        local21 = tformedz()
                        local0\Field19\Field32[$05] = createnpc($18, local19, local20, local21)
                        local0\Field19\Field32[$06] = createnpc($18, (local19 + 0.8), local20, (local21 + 0.8))
                        tformpoint(-1824.0, 128.0, 7056.0, local0\Field19\Field15, $00)
                        local19 = tformedx()
                        local20 = tformedy()
                        local21 = tformedz()
                        local0\Field19\Field32[$07] = createnpc($18, local19, local20, local21)
                        local0\Field19\Field32[$08] = createnpc($18, (local19 + 0.8), local20, (local21 + 0.8))
                        For local9 = $05 To $08 Step $01
                            local0\Field19\Field32[local9]\Field60 = entityx(local0\Field19\Field15, $01, 1.0)
                            local0\Field19\Field32[local9]\Field61 = entityy(local0\Field19\Field15, $01, 1.0)
                            local0\Field19\Field32[local9]\Field74 = entityz(local0\Field19\Field15, $01, 1.0)
                            local0\Field19\Field32[local9]\Field66 = 5.0
                        Next
                        If (n_i\Field2\Field93 <> 0) Then
                            positionentity(local0\Field19\Field32[$05]\Field82, entityx(local0\Field19\Field27[$06], $01, 1.0), entityy(local0\Field19\Field27[$06], $01, 1.0), entityz(local0\Field19\Field27[$06], $01, 1.0), $01)
                            resetentity(local0\Field19\Field32[$05]\Field82)
                            tformpoint(-1473.0, 128.0, 4251.0, local0\Field19\Field15, $00)
                            positionentity(local0\Field19\Field32[$07]\Field82, tformedx(), tformedy(), tformedz(), $01)
                            resetentity(local0\Field19\Field32[$07]\Field82)
                        EndIf
                        renderloading(30.0, getlocalstring("loading", "ending"), $00, 0.025)
                        sky = createsky("GFX\Map\Textures\sky", $00)
                        rotateentity(sky, 0.0, (Float local0\Field19\Field21), 0.0, $00)
                        renderloading(60.0, getlocalstring("loading", "ending"), $00, 0.025)
                        local0\Field19\Field27[$00] = loadrmesh("GFX\Map\gate_a_tunnel.rmesh", Null, $01)
                        positionentity(local0\Field19\Field27[$00], entityx(local0\Field19\Field15, $01, 1.0), entityy(local0\Field19\Field15, $01, 1.0), entityz(local0\Field19\Field15, $01, 1.0), $00)
                        scaleentity(local0\Field19\Field27[$00], (1.0 / 256.0), (1.0 / 256.0), (1.0 / 256.0), $00)
                        entitytype(local0\Field19\Field27[$00], $01, $00)
                        entitypickmode(local0\Field19\Field27[$00], $02, $01)
                        entityparent(local0\Field19\Field27[$00], local0\Field19\Field15, $01)
                        tformpoint(-4308.0, -1045.0, 544.0, local0\Field19\Field15, $00)
                        local0\Field19\Field27[$04] = loadmesh_strict("GFX\Map\gateawall1.b3d", local0\Field19\Field15, $01)
                        positionentity(local0\Field19\Field27[$04], tformedx(), tformedy(), tformedz(), $01)
                        entitycolor(local0\Field19\Field27[$04], 25.0, 25.0, 25.0)
                        entitytype(local0\Field19\Field27[$04], $01, $00)
                        tformpoint(-3820.0, -1045.0, 544.0, local0\Field19\Field15, $00)
                        local0\Field19\Field27[$05] = loadmesh_strict("GFX\Map\gateawall2.b3d", local0\Field19\Field15, $01)
                        positionentity(local0\Field19\Field27[$05], tformedx(), tformedy(), tformedz(), $01)
                        entitycolor(local0\Field19\Field27[$05], 25.0, 25.0, 25.5)
                        entitytype(local0\Field19\Field27[$05], $01, $00)
                        tformpoint(2850.0, 1008.0, 6157.0, local0\Field19\Field15, $00)
                        local0\Field19\Field27[$07] = loadmesh_strict("GFX\Map\Props\lightgunbase.b3d", $00, $01)
                        positionentity(local0\Field19\Field27[$07], tformedx(), tformedy(), tformedz(), $01)
                        scaleentity(local0\Field19\Field27[$07], (1.0 / 256.0), (1.0 / 256.0), (1.0 / 256.0), $00)
                        tformpoint(2850.0, 1296.0, 5981.0, local0\Field19\Field15, $00)
                        local0\Field19\Field27[$08] = loadmesh_strict("GFX\Map\Props\lightgun.b3d", $00, $01)
                        positionentity(local0\Field19\Field27[$08], tformedx(), tformedy(), tformedz(), $01)
                        scaleentity(local0\Field19\Field27[$08], (1.0 / 256.0), (1.0 / 256.0), (1.0 / 256.0), $00)
                        entityparent(local0\Field19\Field27[$08], local0\Field19\Field27[$07], $01)
                        rotateentity(local0\Field19\Field27[$07], 0.0, 48.0, 0.0, $00)
                        rotateentity(local0\Field19\Field27[$08], 40.0, 0.0, 0.0, $00)
                        renderloading(90.0, getlocalstring("loading", "ending"), $00, 0.025)
                        resetentity(XZ0260X8X2\Field74)
                        If (n_i\Field2\Field93 = $00) Then
                            playsound_strict(loadtempsound("SFX\Ending\GateA\106Escape.ogg"), $00, $00)
                        EndIf
                        isblackout = $00
                        hidedistance = 60.0
                        createconsolemsg("", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                        createconsolemsg(getlocalstring("misc", "warning2"), $FF, $00, $00, $00)
                        createconsolemsg("", $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                        local0\Field4 = 1.0
                        renderloading(100.0, "", $00, 0.025)
                    Else
                        updatesky(sky, $00)
                        cansave = $01
                        For local3 = Each rooms
                            hideroomsnocoll(local3)
                        Next
                        showroomsnocoll(local0\Field19)
                        showroomscoll(local0\Field19)
                        shouldplay = $10
                        local0\Field4 = (local0\Field4 + fps\Field3[$00])
                        For local9 = $02 To $04 Step $01
                            If (local0\Field19\Field32[local9] <> Null) Then
                                If (2.0 > local0\Field19\Field32[local9]\Field66) Then
                                    local8 = ((local0\Field4 / 10.0) + (120.0 * (Float local9)))
                                    positionentity(local0\Field19\Field32[local9]\Field82, (entityx(local0\Field19\Field27[$01], $01, 1.0) + ((cos(local8) * 6000.0) * (1.0 / 256.0))), (local0\Field19\Field3 + 11.0), (entityz(local0\Field19\Field27[$01], $01, 1.0) + ((sin(local8) * 6000.0) * (1.0 / 256.0))), $00)
                                    rotateentity(local0\Field19\Field32[local9]\Field82, 7.0, local8, 20.0, $00)
                                EndIf
                            EndIf
                        Next
                        If (350.0 <= local0\Field4) Then
                            If (n_i\Field2\Field93 = $00) Then
                                If (350.0 > (local0\Field4 - fps\Field3[$00])) Then
                                    n_i\Field2\Field60 = entityx(local0\Field19\Field27[$01], $01, 1.0)
                                    n_i\Field2\Field61 = entityy(local0\Field19\Field27[$01], $01, 1.0)
                                    n_i\Field2\Field74 = entityz(local0\Field19\Field27[$01], $01, 1.0)
                                    n_i\Field2\Field66 = 2.0
                                    rotateentity(n_i\Field2\Field82, 0.0, ((Float local0\Field19\Field21) + 90.0), 0.0, $00)
                                    playsound_strict(snd_i\Field40[$05], $00, $00)
                                ElseIf (2.0 < n_i\Field2\Field66) Then
                                    If (3.0 = n_i\Field2\Field66) Then
                                        n_i\Field2\Field8 = 7000.0
                                        If (n_i\Field2\Field30 <> $01) Then
                                            n_i\Field2\Field30 = findpath(n_i\Field2, entityx(local0\Field19\Field32[$05]\Field82, $01, 1.0), entityy(local0\Field19\Field32[$05]\Field82, $01, 1.0), entityz(local0\Field19\Field32[$05]\Field82, $01, 1.0))
                                            n_i\Field2\Field48 = $01
                                        EndIf
                                        For local9 = $02 To $04 Step $01
                                            local0\Field19\Field32[local9]\Field60 = entityx(n_i\Field2\Field98, $01, 1.0)
                                            local0\Field19\Field32[local9]\Field61 = (entityy(n_i\Field2\Field98, $01, 1.0) + 5.0)
                                            local0\Field19\Field32[local9]\Field74 = entityz(n_i\Field2\Field98, $01, 1.0)
                                            local0\Field19\Field32[local9]\Field66 = 3.0
                                        Next
                                        For local9 = $00 To $01 Step $01
                                            pointentity(local0\Field19\Field32[local9]\Field82, n_i\Field2\Field82, 0.0)
                                        Next
                                        For local9 = $05 To $08 Step $01
                                            If (npcseesplayer(local0\Field19\Field32[local9], ((6.0 - XZ0260X8X2\Field46) + XZ0260X8X2\Field68), 75.0, $00) = $01) Then
                                                local0\Field19\Field32[local9]\Field66 = 6.0
                                            Else
                                                local0\Field19\Field32[local9]\Field60 = entityx(n_i\Field2\Field98, $01, 1.0)
                                                local0\Field19\Field32[local9]\Field61 = (entityy(n_i\Field2\Field98, $01, 1.0) + 0.4)
                                                local0\Field19\Field32[local9]\Field74 = entityz(n_i\Field2\Field98, $01, 1.0)
                                                local0\Field19\Field32[local9]\Field66 = 5.0
                                            EndIf
                                        Next
                                        local11 = createpivot($00)
                                        positionentity(local11, entityx(local0\Field19\Field27[$08], $01, 1.0), entityy(local0\Field19\Field27[$08], $01, 1.0), entityz(local0\Field19\Field27[$08], $01, 1.0), $00)
                                        pointentity(local11, n_i\Field2\Field82, 0.0)
                                        rotateentity(local0\Field19\Field27[$07], 0.0, curveangle(entityyaw(local11, $00, 1.0), entityyaw(local0\Field19\Field27[$07], $01, 1.0), 150.0), 0.0, $01)
                                        rotateentity(local0\Field19\Field27[$08], curveangle(entitypitch(local11, $00, 1.0), entitypitch(local0\Field19\Field27[$08], $01, 1.0), 200.0), entityyaw(local0\Field19\Field27[$07], $01, 1.0), 0.0, $01)
                                        freeentity(local11)
                                        local11 = $00
                                    EndIf
                                    local8 = distancesquared(entityx(n_i\Field2\Field82, $00, 1.0), entityx(local0\Field19\Field27[$02], $01, 1.0), entityz(n_i\Field2\Field82, $00, 1.0), entityz(local0\Field19\Field27[$02], $01, 1.0), 0.0, 0.0)
                                    n_i\Field2\Field64 = curvevalue(0.0, n_i\Field2\Field64, max((5.0 * sqr(local8)), 2.0))
                                    If (225.0 > local8) Then
                                        If (local0\Field8 = $00) Then
                                            local0\Field8 = playsound_strict(loadtempsound("SFX\Ending\GateA\Franklin.ogg"), $01, $00)
                                        EndIf
                                        If (0.16 > local8) Then
                                            n_i\Field2\Field66 = 4.0
                                            If (151.0 >= n_i\Field2\Field103) Then
                                                local0\Field7 = 0.0
                                            EndIf
                                        ElseIf (72.25 > local8) Then
                                            If (0.0 = local0\Field7) Then
                                                local0\Field8 = playsound_strict(loadtempsound("SFX\Ending\GateA\HIDTurret.ogg"), $00, $00)
                                                local0\Field7 = 1.0
                                            ElseIf (0.0 < local0\Field7) Then
                                                local0\Field7 = (local0\Field7 + fps\Field3[$00])
                                                If (525.0 <= local0\Field7) Then
                                                    If (525.0 > (local0\Field7 - fps\Field3[$00])) Then
                                                        local4 = createparticle($05, entityx(n_i\Field2\Field98, $01, 1.0), (entityy(n_i\Field2\Field98, $01, 1.0) + 0.4), entityz(n_i\Field2\Field98, $01, 1.0), 7.0, 0.0, 470.0)
                                                        local4\Field11 = 0.0
                                                        local4\Field13 = 1.0
                                                        entityparent(local4\Field10, n_i\Field2\Field82, $01)
                                                        local4 = createparticle($05, entityx(local0\Field19\Field27[$08], $01, 1.0), entityy(local0\Field19\Field27[$08], $01, 1.0), entityz(local0\Field19\Field27[$08], $01, 1.0), 2.0, 0.0, 470.0)
                                                        local4\Field11 = 0.0
                                                        local4\Field13 = 1.0
                                                        rotateentity(local4\Field10, entitypitch(local0\Field19\Field27[$08], $01, 1.0), entityyaw(local0\Field19\Field27[$08], $01, 1.0), 0.0, $01)
                                                        moveentity(local4\Field10, 0.0, 0.359375, 2.0, $00)
                                                        entityparent(local4\Field10, local0\Field19\Field27[$08], $01)
                                                    ElseIf (1036.0 > local0\Field7) Then
                                                        XZ0260X8X2\Field1 = 0.5
                                                        XZ0260X8X2\Field78 = (((Float entityinview(local0\Field19\Field27[$08], camera)) * 0.5) + 0.3)
                                                        lightvolume = (rnd(1.0, 2.0) * templightvolume)
                                                        If (((Int XZ0260X8X2\Field48) Lor chs\Field0) = $00) Then
                                                            If (1.44 > entitydistancesquared(XZ0260X8X2\Field74, n_i\Field2\Field82)) Then
                                                                playsound_strict(loadtempsound("SFX\SCP\294\Burn.ogg"), $00, $00)
                                                                kill($01, $01, $00, $01)
                                                            EndIf
                                                        EndIf
                                                    EndIf
                                                EndIf
                                            EndIf
                                            If (opt\Field69 > $00) Then
                                                For local9 = $00 To (rand($02, (((opt\Field69 - $01) * $06) + $02)) - (Int sqr(local8))) Step $01
                                                    local4 = createparticle($00, entityx(n_i\Field2\Field98, $01, 1.0), (entityy(n_i\Field2\Field98, $01, 1.0) + rnd(0.4, 0.9)), entityz(n_i\Field2\Field98, $00, 1.0), 0.006, -0.002, 40.0)
                                                    local4\Field11 = 0.005
                                                    local4\Field13 = 0.8
                                                    local4\Field5 = -0.01
                                                    rotateentity(local4\Field10, (- rnd(70.0, 110.0)), rnd(360.0, 0.0), 0.0, $00)
                                                Next
                                            EndIf
                                        EndIf
                                    EndIf
                                ElseIf (1.0 = n_i\Field2\Field66) Then
                                    n_i\Field2\Field93 = $01
                                EndIf
                            ElseIf (0.0 = local0\Field7) Then
                                For local9 = $02 To $04 Step $01
                                    local0\Field19\Field32[local9]\Field66 = 0.0
                                Next
                                For local9 = $05 To $08 Step $01
                                    local0\Field19\Field32[local9]\Field60 = entityx(XZ0260X8X2\Field74, $00, 1.0)
                                    local0\Field19\Field32[local9]\Field61 = entityy(XZ0260X8X2\Field74, $00, 1.0)
                                    local0\Field19\Field32[local9]\Field74 = entityz(XZ0260X8X2\Field74, $00, 1.0)
                                    local0\Field19\Field32[local9]\Field66 = 3.0
                                Next
                                local0\Field7 = 1.0
                            Else
                                For local9 = $05 To $08 Step $01
                                    local0\Field19\Field32[local9]\Field60 = entityx(XZ0260X8X2\Field74, $00, 1.0)
                                    local0\Field19\Field32[local9]\Field61 = entityy(XZ0260X8X2\Field74, $00, 1.0)
                                    local0\Field19\Field32[local9]\Field74 = entityz(XZ0260X8X2\Field74, $00, 1.0)
                                Next
                                If (1.0 = local0\Field7) Then
                                    For local9 = $05 To $08 Step $01
                                        If (npcseesplayer(local0\Field19\Field32[local9], ((4.0 - XZ0260X8X2\Field46) + XZ0260X8X2\Field68), 75.0, $00) = $01) Then
                                            local12 = $01
                                            Exit
                                        EndIf
                                    Next
                                    If (local12 <> 0) Then
                                        For local9 = $05 To $08 Step $01
                                            local0\Field19\Field32[local9]\Field66 = 5.0
                                        Next
                                        local0\Field7 = 2.0
                                    EndIf
                                ElseIf (2.0 = local0\Field7) Then
                                    If (((_S2IMapSize(unlockedachievements) - _S2IMapContains(unlockedachievements, "apollyon")) - _S2IMapContains(unlockedachievements, "keter")) >= (_S2IMapSize(achievementsindex) - $04)) Then
                                        makemeunplayable($01)
                                        local0\Field2 = playsound_strict(loadtempsound("SFX\Ending\GateA\STOPRIGHTTHERE.ogg"), $01, $00)
                                        local0\Field7 = 3.0
                                    Else
                                        For local9 = $05 To $08 Step $01
                                            If (7.0 <> local0\Field19\Field32[local9]\Field66) Then
                                                If (npcseesplayer(local0\Field19\Field32[local9], ((6.0 - XZ0260X8X2\Field46) + XZ0260X8X2\Field68), 75.0, $00) = $01) Then
                                                    local0\Field19\Field32[local9]\Field66 = 6.0
                                                Else
                                                    local0\Field19\Field32[local9]\Field66 = 3.0
                                                EndIf
                                            EndIf
                                        Next
                                    EndIf
                                ElseIf (3.0 = local0\Field7) Then
                                    shouldplay = $00
                                    XZ0260X8X2\Field76 = 0.0
                                    If (ChannelPlaying(local0\Field2) = $00) Then
                                        clearcheats()
                                        XZ0260X8X2\Field40 = $01
                                        playsound_strict(loadtempsound("SFX\Room\Intro\Bang2.ogg"), $00, $00)
                                        msg\Field8 = ""
                                        For local2 = Each npcs
                                            removenpc(local2)
                                        Next
                                        XZ0260X8X2\Field78 = 1.0
                                        XZ0260X8X2\Field48 = 1.0
                                        XZ0260X8X2\Field53 = -10.0
                                        removeevent(local0)
                                        Return $00
                                        Exit
                                    EndIf
                                EndIf
                            EndIf
                            If (0.0 = local0\Field1) Then
                                If (isequal(entityy(XZ0260X8X2\Field74, $01, 1.0), entityy(local0\Field19\Field27[$03], $01, 1.0), 1.0) <> 0) Then
                                    If (144.0 > distancesquared(entityx(XZ0260X8X2\Field74, $00, 1.0), entityx(local0\Field19\Field27[$03], $01, 1.0), entityz(XZ0260X8X2\Field74, $00, 1.0), entityz(local0\Field19\Field27[$03], $01, 1.0), 0.0, 0.0)) Then
                                        n_i\Field2\Field66 = 0.0
                                        n_i\Field2\Field65 = rnd(22000.0, 27000.0)
                                        If (entityhidden(n_i\Field2\Field98) = $00) Then
                                            hideentity(n_i\Field2\Field98)
                                        EndIf
                                        For local9 = $05 To $08 Step $01
                                            positionentity(local0\Field19\Field32[local9]\Field82, (entityx(local0\Field19\Field27[$06], $01, 1.0) + ((Float (local9 - $06)) * 0.3)), entityy(local0\Field19\Field27[$06], $01, 1.0), (entityz(local0\Field19\Field27[$06], $01, 1.0) + ((Float (local9 - $06)) * 0.3)), $01)
                                            resetentity(local0\Field19\Field32[local9]\Field82)
                                            local0\Field19\Field32[local9]\Field60 = entityx(XZ0260X8X2\Field74, $00, 1.0)
                                            local0\Field19\Field32[local9]\Field61 = entityy(XZ0260X8X2\Field74, $00, 1.0)
                                            local0\Field19\Field32[local9]\Field74 = entityz(XZ0260X8X2\Field74, $00, 1.0)
                                            local0\Field19\Field32[local9]\Field8 = 0.0
                                            local0\Field19\Field32[local9]\Field66 = 3.0
                                        Next
                                        local0\Field19\Field32[$05]\Field55 = loadsound_strict("SFX\Character\MTF\ThereHeIs0.ogg")
                                        playsoundex(local0\Field19\Field32[$05]\Field55, camera, local0\Field19\Field32[$05]\Field82, 25.0, 1.0, $01, $00)
                                        local0\Field19\Field25[$00]\Field39 = $01
                                        For local9 = $02 To $04 Step $01
                                            local0\Field19\Field32[local9]\Field66 = 0.0
                                        Next
                                        local0\Field1 = 1.0
                                    EndIf
                                EndIf
                            ElseIf (1.0 = local0\Field1) Then
                                For local9 = $05 To $08 Step $01
                                    If (16.0 < entitydistancesquared(local0\Field19\Field32[local9]\Field82, XZ0260X8X2\Field74)) Then
                                        local0\Field19\Field32[local9]\Field66 = 3.0
                                    Else
                                        local0\Field19\Field32[local9]\Field66 = 6.0
                                    EndIf
                                Next
                                If (isequal(entityy(XZ0260X8X2\Field74, $01, 1.0), entityy(local0\Field19\Field27[$03], $01, 1.0), 1.0) <> 0) Then
                                    If (49.0 > distancesquared(entityx(XZ0260X8X2\Field74, $00, 1.0), entityx(local0\Field19\Field27[$03], $01, 1.0), entityz(XZ0260X8X2\Field74, $00, 1.0), entityz(local0\Field19\Field27[$03], $01, 1.0), 0.0, 0.0)) Then
                                        For local9 = $05 To $08 Step $01
                                            local0\Field19\Field32[local9]\Field66 = 5.0
                                        Next
                                        local0\Field19\Field27[$09] = loadanimmesh_strict("GFX\NPCs\CI.b3d", $00, $01)
                                        local23 = (0.55 / meshwidth(local0\Field19\Field27[$09]))
                                        scaleentity(local0\Field19\Field27[$09], local23, local23, local23, $00)
                                        positionentity(local0\Field19\Field27[$09], entityx(local0\Field19\Field27[$03], $01, 1.0), entityy(local0\Field19\Field27[$03], $01, 1.0), entityz(local0\Field19\Field27[$03], $01, 1.0), $00)
                                        local0\Field19\Field27[$0A] = copyentity(local0\Field19\Field27[$09], $00)
                                        positionentity(local0\Field19\Field27[$0A], (local0\Field19\Field40 - 15.5), entityy(local0\Field19\Field27[$03], $01, 1.0), (local0\Field19\Field37 - 7.5), $00)
                                        local0\Field19\Field27[$0B] = copyentity(local0\Field19\Field27[$09], $00)
                                        positionentity(local0\Field19\Field27[$0B], (local0\Field19\Field40 - 16.25), entityy(local0\Field19\Field27[$03], $01, 1.0), (local0\Field19\Field37 - 7.5), $00)
                                        entityparent(local0\Field19\Field27[$0B], local0\Field19\Field27[$0A], $01)
                                        local0\Field19\Field27[$0C] = copyentity(local0\Field19\Field27[$09], $00)
                                        positionentity(local0\Field19\Field27[$0C], (local0\Field19\Field40 - 15.875), entityy(local0\Field19\Field27[$03], $01, 1.0), (local0\Field19\Field37 - 8.25), $00)
                                        entityparent(local0\Field19\Field27[$0C], local0\Field19\Field27[$0A], $01)
                                        local0\Field2 = playsoundex(loadtempsound("SFX\Ending\GateA\Bell0.ogg"), camera, local0\Field19\Field27[$09], 10.0, 1.0, $00, $00)
                                        local4 = createparticle($05, entityx(local0\Field19\Field27[$03], $01, 1.0), entityy(camera, $01, 1.0), entityz(local0\Field19\Field27[$03], $01, 1.0), 8.0, 0.0, 50.0)
                                        local4\Field11 = 0.15
                                        local4\Field13 = 0.5
                                        local4 = createparticle($05, entityx(local0\Field19\Field27[$03], $01, 1.0), entityy(camera, $01, 1.0), entityz(local0\Field19\Field27[$03], $01, 1.0), 8.0, 0.0, 50.0)
                                        local4\Field11 = 0.25
                                        local4\Field13 = 0.5
                                        pointentity(local4\Field10, XZ0260X8X2\Field74, 0.0)
                                        XZ0260X8X2\Field1 = 1.0
                                        XZ0260X8X2\Field78 = 1.0
                                        local0\Field1 = 2.0
                                    EndIf
                                EndIf
                            Else
                                local0\Field1 = (local0\Field1 + fps\Field3[$00])
                                pointentity(local0\Field19\Field27[$09], XZ0260X8X2\Field74, 0.0)
                                rotateentity(local0\Field19\Field27[$09], 0.0, entityyaw(local0\Field19\Field27[$09], $00, 1.0), 0.0, $00)
                                XZ0260X8X2\Field56 = -5.0
                                XZ0260X8X2\Field64 = (sin((local0\Field1 * 0.7)) * 1000.0)
                                If (0.0 = XZ0260X8X2\Field48) Then
                                    camerazoom(camera, ((sin((local0\Field1 * 0.8)) * 0.2) + 1.0))
                                    local8 = entitydistancesquared(XZ0260X8X2\Field74, local0\Field19\Field27[$03])
                                    If (42.25 > local8) Then
                                        local18 = (sqr(local8) * 80.0)
                                        positionentity(XZ0260X8X2\Field74, curvevalue(entityx(local0\Field19\Field27[$03], $01, 1.0), entityx(XZ0260X8X2\Field74, $00, 1.0), local8), entityy(XZ0260X8X2\Field74, $00, 1.0), curvevalue(entityz(local0\Field19\Field27[$00], $01, 1.0), entityz(XZ0260X8X2\Field74, $00, 1.0), local8), $00)
                                    EndIf
                                EndIf
                                positionentity(XZ0260X8X2\Field74, entityx(XZ0260X8X2\Field74, $00, 1.0), entityy(XZ0260X8X2\Field74, $00, 1.0), min((local0\Field19\Field37 + 1.757812), entityz(XZ0260X8X2\Field74, $00, 1.0)), $00)
                                If (((50.0 < local0\Field1) And (230.0 > local0\Field1)) <> 0) Then
                                    local17 = sin((local0\Field1 - 50.0))
                                    XZ0260X8X2\Field1 = (local17 * 3.0)
                                    turnentity(local0\Field19\Field27[$04], 0.0, ((local17 * -0.85) * fps\Field3[$00]), 0.0, $01)
                                    turnentity(local0\Field19\Field27[$05], 0.0, ((local17 * 0.85) * fps\Field3[$00]), 0.0, $01)
                                EndIf
                                If (230.0 <= local0\Field1) Then
                                    If (230.0 > (local0\Field1 - fps\Field3[$00])) Then
                                        local0\Field2 = playsound_strict(loadtempsound("SFX\Ending\GateA\CI.ogg"), $01, $00)
                                        resetselectedstuff()
                                        XZ0260X8X2\Field40 = $00
                                    EndIf
                                    If (480.0 <= local0\Field1) Then
                                        animateex(local0\Field19\Field27[$09], animtime(local0\Field19\Field27[$09]), $B0, $D2, 0.2, $01)
                                        moveentity(local0\Field19\Field27[$09], 0.0, 0.0, (fps\Field3[$00] * 0.01), $00)
                                    EndIf
                                    If (ChannelPlaying(local0\Field2) = $00) Then
                                        clearcheats()
                                        playsound_strict(loadtempsound("SFX\Ending\GateA\Bell1.ogg"), $00, $00)
                                        For local2 = Each npcs
                                            removenpc(local2)
                                        Next
                                        local4 = createparticle($05, entityx(local0\Field19\Field27[$03], $01, 1.0), entityy(camera, $01, 1.0), entityz(local0\Field19\Field27[$03], $01, 1.0), 8.0, 0.0, 50.0)
                                        local4\Field11 = 0.15
                                        local4\Field13 = 0.5
                                        local4 = createparticle($05, entityx(local0\Field19\Field27[$03], $01, 1.0), entityy(camera, $01, 1.0), entityz(local0\Field19\Field27[$03], $01, 1.0), 8.0, 0.0, 50.0)
                                        local4\Field11 = 0.25
                                        local4\Field13 = 0.5
                                        XZ0260X8X2\Field1 = curvevalue(2.0, XZ0260X8X2\Field1, 10.0)
                                        XZ0260X8X2\Field78 = curvevalue(2.0, XZ0260X8X2\Field78, 8.0)
                                        XZ0260X8X2\Field48 = 1.0
                                        msg\Field8 = ""
                                        removeevent(local0)
                                        Return $00
                                        Exit
                                    EndIf
                                EndIf
                            EndIf
                        EndIf
                    EndIf
                Else
                    hideroomsnocoll(local0\Field19)
                EndIf
        End Select
    Next
    updateexplosion()
    Return $00
End Function

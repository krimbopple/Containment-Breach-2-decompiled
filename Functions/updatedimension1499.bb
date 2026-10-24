Function updatedimension1499%()
    Local local0.events
    Local local1.npcs
    Local local2%
    Local local3.items
    Local local4.dummy1499_1
    Local local5%
    Local local6%
    Local local7#
    Local local8%
    Local local9%
    Local local10%
    Local local11%
    Local local12%
    Local local13#
    Local local14%
    For local0 = Each events
        If (local0\Field32 = $4C) Then
            If (playerroom = local0\Field19) Then
                previsblackout = isblackout
                isblackout = $00
                If (2.0 > local0\Field4) Then
                    If (0.0 = local0\Field4) Then
                        If (((local0\Field9 = "") And (quickloadpercent = $FFFFFFFF)) <> 0) Then
                            quickloadpercent = $00
                            quickload_currevent = local0
                            local0\Field9 = "Load0"
                        EndIf
                    Else
                        local0\Field4 = 2.0
                    EndIf
                    local12 = rand($02, $03)
                    If ((((Float local12) = local0\Field7) Lor (4.0 = local0\Field7)) <> 0) Then
                        For local10 = $FFFFFFFF To $01 Step $01
                            For local11 = $FFFFFFFF To $01 Step $01
                                If (((local10 <> $00) And (local11 <> $00)) <> 0) Then
                                    local1 = createnpc($12, (entityx(XZ0260X8X2\Field74, $00, 1.0) + (0.75 * (Float local10))), (entityy(XZ0260X8X2\Field74, $00, 1.0) + 0.05), (entityz(XZ0260X8X2\Field74, $00, 1.0) + (0.75 * (Float local11))))
                                    local1\Field66 = 2.0
                                    pointentity(local1\Field82, XZ0260X8X2\Field74, 0.0)
                                    rotateentity(local1\Field82, 0.0, entityyaw(local1\Field82, $00, 1.0), 0.0, $00)
                                ElseIf (((local10 <> $00) Lor (local11 <> $00)) <> 0) Then
                                    local1 = createnpc($12, (entityx(XZ0260X8X2\Field74, $00, 1.0) + (Float local10)), (entityy(XZ0260X8X2\Field74, $00, 1.0) + 0.05), (entityz(XZ0260X8X2\Field74, $00, 1.0) + (Float local11)))
                                    local1\Field66 = 2.0
                                    pointentity(local1\Field82, XZ0260X8X2\Field74, 0.0)
                                    rotateentity(local1\Field82, 0.0, entityyaw(local1\Field82, $00, 1.0), 0.0, $00)
                                EndIf
                            Next
                        Next
                        local0\Field7 = 5.0
                    EndIf
                    If (2100.0 > local0\Field1) Then
                        local0\Field19\Field32[$00] = createnpc($12, (local0\Field19\Field40 - 7.488281), (local0\Field19\Field3 + 7.4375), (local0\Field19\Field37 + 9.015625))
                        local0\Field19\Field32[$00]\Field13 = $02
                        local0\Field19\Field32[$00]\Field84 = 270.0
                        local0\Field19\Field32[$00]\Field17 = $01
                        entitycolor(local0\Field19\Field32[$00]\Field98, 255.0, 204.0, 140.0)
                        rotateentity(local0\Field19\Field32[$00]\Field82, 0.0, local0\Field19\Field32[$00]\Field84, 0.0, $00)
                        local0\Field19\Field32[$01] = createnpc($12, (local0\Field19\Field40 - 7.488281), (local0\Field19\Field3 + 7.4375), (local0\Field19\Field37 + 8.015625))
                        local0\Field19\Field32[$01]\Field13 = $01
                        local0\Field19\Field32[$01]\Field84 = 270.0
                        rotateentity(local0\Field19\Field32[$01]\Field82, 0.0, local0\Field19\Field32[$01]\Field84, 0.0, $00)
                        local0\Field19\Field32[$02] = createnpc($12, (local0\Field19\Field40 + 15.83984), (local0\Field19\Field3 + 0.5), (local0\Field19\Field37 + 7.359375))
                        local0\Field19\Field32[$02]\Field13 = $03
                        local0\Field19\Field32[$02]\Field84 = 270.0
                        rotateentity(local0\Field19\Field32[$02]\Field82, 0.0, local0\Field19\Field32[$02]\Field84, 0.0, $00)
                        local0\Field19\Field32[$03] = createnpc($12, (local0\Field19\Field40 + 15.83984), (local0\Field19\Field3 + 0.5), (local0\Field19\Field37 + 11.23438))
                        local0\Field19\Field32[$03]\Field13 = $03
                        local0\Field19\Field32[$03]\Field84 = 270.0
                        rotateentity(local0\Field19\Field32[$03]\Field82, 0.0, local0\Field19\Field32[$03]\Field84, 0.0, $00)
                        local0\Field19\Field32[$02]\Field59 = local0\Field19\Field32[$03]
                        local0\Field19\Field32[$03]\Field59 = local0\Field19\Field32[$02]
                        local0\Field19\Field32[$04] = createnpc($12, (local0\Field19\Field40 - 7.332031), (local0\Field19\Field3 + 0.75), (local0\Field19\Field37 + 4.183594))
                        local0\Field19\Field32[$04]\Field13 = $03
                        local0\Field19\Field32[$04]\Field84 = 270.0
                        rotateentity(local0\Field19\Field32[$04]\Field82, 0.0, local0\Field19\Field32[$04]\Field84, 0.0, $00)
                        local0\Field19\Field32[$05] = createnpc($12, (local0\Field19\Field40 - 7.332031), (local0\Field19\Field3 + 0.75), (local0\Field19\Field37 + 13.68359))
                        local0\Field19\Field32[$05]\Field13 = $03
                        local0\Field19\Field32[$05]\Field84 = 270.0
                        rotateentity(local0\Field19\Field32[$05]\Field82, 0.0, local0\Field19\Field32[$05]\Field84, 0.0, $00)
                        local0\Field19\Field32[$04]\Field59 = local0\Field19\Field32[$05]
                        local0\Field19\Field32[$05]\Field59 = local0\Field19\Field32[$04]
                        local1 = createnpc($12, (local0\Field19\Field40 - 10.78516), (local0\Field19\Field3 + 0.5), (local0\Field19\Field37 + 12.51562))
                        local1\Field13 = $01
                        local1\Field84 = 180.0
                        local1\Field32 = 0.0
                        rotateentity(local1\Field82, 0.0, local1\Field84, 0.0, $00)
                        For local8 = $00 To $04 Step $01
                            For local9 = $00 To $02 Step $01
                                local4 = (New dummy1499_1)
                                For local1 = Each npcs
                                    If (((local1\Field77 = $12) And (local1\Field13 <> $02)) <> 0) Then
                                        local4\Field0 = copyentity(local1\Field98, $00)
                                        Exit
                                    EndIf
                                Next
                                local7 = (rnd(0.8, 1.0) * 0.02)
                                scaleentity(local4\Field0, local7, local7, local7, $00)
                                entityfx(local4\Field0, $01)
                                local4\Field1 = rand($00, $01)
                                positionentity(local4\Field0, clamp(((local0\Field19\Field40 + ((1887.0 - (365.7143 * (Float local8))) * (1.0 / 256.0))) + rnd(-0.5, 0.5)), (local0\Field19\Field40 - 3.410156), (local0\Field19\Field40 + 7.371094)), local0\Field19\Field3, clamp(((local0\Field19\Field37 + ((1796.0 - (384.0 * (Float local9))) * (1.0 / 256.0))) + rnd(-0.5, 0.5)), (local0\Field19\Field37 + 4.015625), (local0\Field19\Field37 + 7.015625)), $00)
                                rotateentity(local4\Field0, 0.0, 270.0, 0.0, $00)
                                entityautofade(local4\Field0, 25.0, 39.0)
                            Next
                        Next
                        For local8 = $00 To $03 Step $01
                            For local9 = $00 To $02 Step $01
                                local4 = (New dummy1499_1)
                                For local1 = Each npcs
                                    If (((local1\Field77 = $12) And (local1\Field13 <> $02)) <> 0) Then
                                        local4\Field0 = copyentity(local1\Field98, $00)
                                        Exit
                                    EndIf
                                Next
                                local7 = (rnd(0.8, 1.0) * 0.02)
                                scaleentity(local4\Field0, local7, local7, local7, $00)
                                entityfx(local4\Field0, $01)
                                local4\Field1 = rand($00, $01)
                                positionentity(local4\Field0, clamp(((local0\Field19\Field40 + ((1375.0 - (341.3333 * (Float local8))) * (1.0 / 256.0))) + rnd(-0.5, 0.5)), (local0\Field19\Field40 - 3.410156), (local0\Field19\Field40 + 5.371094)), local0\Field19\Field3, clamp(((local0\Field19\Field37 + ((3588.0 - (384.0 * (Float local9))) * (1.0 / 256.0))) + rnd(-0.5, 0.5)), (local0\Field19\Field37 + 11.01562), (local0\Field19\Field37 + 14.01562)), $00)
                                rotateentity(local4\Field0, 0.0, 270.0, 0.0, $00)
                                entityautofade(local4\Field0, 25.0, 39.0)
                            Next
                        Next
                    ElseIf (entityhidden(local0\Field19\Field27[$11]) = $00) Then
                        hideentity(local0\Field19\Field27[$11])
                    EndIf
                    For local10 = $00 To $0E Step $01
                        local1 = createnpc($12, (entityx(XZ0260X8X2\Field74, $00, 1.0) + rnd(-20.0, 20.0)), (entityy(XZ0260X8X2\Field74, $00, 1.0) + 0.1), (entityz(XZ0260X8X2\Field74, $00, 1.0) + rnd(-20.0, 20.0)))
                        local1\Field84 = rnd(360.0, 0.0)
                        local1\Field65 = 0.0
                        If (100.0 > entitydistancesquared(local1\Field82, XZ0260X8X2\Field74)) Then
                            local1\Field66 = 2.0
                        EndIf
                    Next
                EndIf
                showroomsnocoll(local0\Field19)
                showroomscoll(local0\Field19)
                If (((quickloadpercent = $64) Lor (quickloadpercent = $FFFFFFFF)) <> 0) Then
                    updatechunks(local0\Field19, $0F, $01)
                    If (entityhidden(i_1499\Field4) <> 0) Then
                        showentity(i_1499\Field4)
                    EndIf
                    updatesky(i_1499\Field4, $00)
                    shouldplay = $11
                    If (800.0 > entityy(XZ0260X8X2\Field74, $00, 1.0)) Then
                        positionentity(XZ0260X8X2\Field74, entityx(XZ0260X8X2\Field74, $00, 1.0), 800.5, entityz(XZ0260X8X2\Field74, $00, 1.0), $01)
                        resetentity(XZ0260X8X2\Field74)
                    EndIf
                    For local3 = Each items
                        If (750.0 < entityy(local3\Field9, $00, 1.0)) Then
                            If (800.0 > entityy(local3\Field9, $00, 1.0)) Then
                                positionentity(local3\Field9, entityx(local3\Field9, $00, 1.0), 800.5, entityz(local3\Field9, $00, 1.0), $00)
                                resetentity(local3\Field9)
                            EndIf
                        EndIf
                    Next
                    For local4 = Each dummy1499_1
                        If (2100.0 > local0\Field1) Then
                            local13 = ((Float (local4\Field1 = $00)) * 92.0)
                            If ((360.5 + local13) >= animtime(local4\Field0)) Then
                                animateex(local4\Field0, animtime(local4\Field0), (Int (321.0 + local13)), (Int (361.0 + local13)), 0.2, $00)
                            ElseIf ((((361.5 + local13) < animtime(local4\Field0)) And ((401.5 + local13) >= animtime(local4\Field0))) <> 0) Then
                                animateex(local4\Field0, animtime(local4\Field0), (Int (362.0 + local13)), (Int (402.0 + local13)), 0.2, $00)
                            Else
                                local10 = rand($00, $01)
                                setanimtime(local4\Field0, (((41.0 * (Float local10)) + 321.0) + local13), $00)
                            EndIf
                        Else
                            local13 = ((Float (local4\Field1 = $00)) * 96.0)
                            If ((((411.5 + local13) >= animtime(local4\Field0)) And (320.5 < animtime(local4\Field0))) <> 0) Then
                                animateex(local4\Field0, animtime(local4\Field0), (Int (403.0 + local13)), (Int (412.0 + local13)), 0.2, $00)
                            Else
                                animateex(local4\Field0, animtime(local4\Field0), $128, $140, 0.2, $01)
                            EndIf
                            local14 = createpivot($00)
                            positionentity(local14, entityx(local4\Field0, $00, 1.0), entityy(local4\Field0, $00, 1.0), entityz(local4\Field0, $00, 1.0), $01)
                            pointentity(local14, XZ0260X8X2\Field74, 0.0)
                            rotateentity(local4\Field0, 0.0, (curveangle(entityyaw(local14, $00, 1.0), (entityyaw(local4\Field0, $00, 1.0) - 180.0), 10.0) + 180.0), 0.0, $00)
                            freeentity(local14)
                            local14 = $00
                        EndIf
                    Next
                    If (700.0 > local0\Field1) Then
                        If (8.4375 > (Abs (entityx(XZ0260X8X2\Field74, $00, 1.0) - (local0\Field19\Field40 - 0.21875)))) Then
                            If (5.5 > (Abs (entityz(XZ0260X8X2\Field74, $00, 1.0) - (local0\Field19\Field37 + 8.933594)))) Then
                                local0\Field1 = (local0\Field1 + fps\Field3[$00])
                            EndIf
                        EndIf
                    ElseIf (((700.0 <= local0\Field1) And (1400.0 > local0\Field1)) <> 0) Then
                        For local10 = $00 To $01 Step $01
                            local0\Field19\Field32[local10]\Field62 = 1.0
                        Next
                        local0\Field1 = 1400.0
                    ElseIf (1400.0 = local0\Field1) Then
                        If (854.5 < local0\Field19\Field32[$00]\Field103) Then
                            For local10 = $02 To $05 Step $01
                                If (local10 = $02) Then
                                    loadnpcsound(local0\Field19\Field32[local10], "SFX\SCP\1499\Triggered.ogg", $00)
                                    local0\Field19\Field32[local10]\Field63 = playsoundex(local0\Field19\Field32[local10]\Field55, camera, local0\Field19\Field32[local10]\Field82, 50.0, 1.0, $00, $00)
                                EndIf
                                local0\Field19\Field32[local10]\Field66 = 1.0
                                setnpcframe(local0\Field19\Field32[local10], 203.0, $01)
                            Next
                            local0\Field1 = 2100.0
                        EndIf
                    EndIf
                    If (local0\Field19\Field32[$00] <> Null) Then
                        If (entityhidden(local0\Field19\Field27[$11]) <> 0) Then
                            showentity(local0\Field19\Field27[$11])
                        EndIf
                        If (2100.0 > local0\Field1) Then
                            shouldplay = $42
                            If (nowplaying = $42) Then
                                If (local0\Field2 = $00) Then
                                    local0\Field30 = loadsound_strict("SFX\Music\HaveMercyOnMe(Choir).ogg")
                                    local0\Field2 = streamsound_strict("SFX\Music\HaveMercyOnMe(NoChoir).ogg", (opt\Field45 * opt\Field2), $02)
                                    local0\Field20 = $01
                                EndIf
                            EndIf
                            If (local0\Field30 <> $00) Then
                                local0\Field8 = loopsoundex(local0\Field30, local0\Field8, camera, local0\Field19\Field27[$10], 10.0, (opt\Field45 * opt\Field2), $00)
                            EndIf
                        Else
                            shouldplay = $12
                            If (local0\Field2 <> $00) Then
                                stopstream_strict(local0\Field2)
                                local0\Field2 = $00
                                local0\Field20 = $00
                            EndIf
                            If (ChannelPlaying(local0\Field8) <> 0) Then
                                StopChannel(local0\Field8)
                                local0\Field8 = $00
                            EndIf
                            If (local0\Field30 <> $00) Then
                                freesound_strict(local0\Field30)
                                local0\Field30 = $00
                            EndIf
                        EndIf
                    EndIf
                    If (1600.0 < entitydistancesquared(XZ0260X8X2\Field74, local0\Field19\Field15)) Then
                        For local4 = Each dummy1499_1
                            If (entityhidden(local4\Field0) = $00) Then
                                hideentity(local4\Field0)
                            EndIf
                        Next
                    Else
                        For local4 = Each dummy1499_1
                            If (entityhidden(local4\Field0) <> 0) Then
                                showentity(local4\Field0)
                            EndIf
                        Next
                    EndIf
                Else
                    XZ0260X8X2\Field16 = 0.0
                EndIf
                playerfallingpickdistance = 0.0
            EndIf
            Exit
        EndIf
    Next
    Return $00
End Function

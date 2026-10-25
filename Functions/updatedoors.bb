Function updatedoors%()
    Local local0.doors
    Local local1%
    Local local2%
    Local local3%
    Local local4%
    Local local5%
    Local local6#
    Local local7#
    Local local8#
    Local local9.doors
    Local local10%
    Local local11#
    Local local12#
    Local local14#
    Local local15#
    Local local16#
    Local local19#
    Local local20#
    Local local21#
    Local local22#
    Local local23#
    Local local24#
    Local local25#
    Local local26#
    Local local27#
    Local local28%
    Local local29%
    Local local30#
    Local local31#
    Local local32%
    local8 = 900.0
    buttondirection = ((XZ0260X8X2\Field27 = $00) Lor (XZ0260X8X2\Field27 And ((infacility = $FFFFFFFF) Lor ((infacility <> $01) And (toelevatorfloor = $01)))))
    local9 = d_i\Field6
    d_i\Field12 = $00
    d_i\Field15 = $00
    d_i\Field6 = Null
    BXZDBZ0BB\Field6 = (BXZDBZ0BB\Field6 - fps\Field3[$00])
    If (0.0 >= BXZDBZ0BB\Field6) Then
        For local0 = Each doors
            local0\Field55 = (local8 >= entitydistancesquared(local0\Field51, XZ0260X8X2\Field74))
            local0\Field2 = local0\Field55
            If (((local0\Field2 = $00) And (GUESSEDupdateanimatenpc() Lor (GUESSEDupdatexdb() = $00))) <> 0) Then
                local0\Field2 = GUESSEDisentity_4(local0\Field51, local8)
            EndIf
        Next
        BXZDBZ0BB\Field6 = 35.0
    EndIf
    For local0 = Each doors
        If (((local0\Field55 Lor (local0\Field19 > $00)) Lor local0\Field2) <> 0) Then
            local10 = ($01 - (local0\Field39 And local0\Field28))
            local11 = (fps\Field3[$00] * 2.0)
            local12 = ((Float (local0\Field27 + $01)) - ((Float local0\Field5) * 0.375))
            local0\Field25 = (local0\Field25 - fps\Field3[$00])
            If (local0\Field38 = $00) Then
                If (local0\Field39 <> 0) Then
                    If (180.0 > local0\Field13) Then
                        Select local0\Field46
                            Case $00
                                local0\Field13 = min(180.0, (local0\Field13 + (local11 * local12)))
                                local7 = (((sin(local0\Field13) * local12) * fps\Field3[$00]) / 80.0)
                                moveentity(local0\Field0, local7, 0.0, 0.0, $00)
                                If (local0\Field7 <> $00) Then
                                    moveentity(local0\Field7, local7, 0.0, 0.0, $00)
                                EndIf
                            Case $01
                                local0\Field13 = min(180.0, (local0\Field13 + (local11 * local12)))
                                local7 = (((sin(local0\Field13) * local12) * fps\Field3[$00]) / 162.0)
                                moveentity(local0\Field0, local7, 0.0, 0.0, $00)
                                If (local0\Field7 <> $00) Then
                                    moveentity(local0\Field7, local7, 0.0, 0.0, $00)
                                EndIf
                            Case $02
                                local0\Field13 = min(180.0, (local0\Field13 + (local11 * local12)))
                                local6 = sin(local0\Field13)
                                moveentity(local0\Field0, (((local6 * local12) * fps\Field3[$00]) / 90.0), 0.0, 0.0, $00)
                                If (local0\Field7 <> $00) Then
                                    moveentity(local0\Field7, (((local6 * local12) * fps\Field3[$00]) / 155.0), 0.0, 0.0, $00)
                                EndIf
                            Case $03
                                local0\Field13 = min(180.0, (local0\Field13 + ((fps\Field3[$00] * 0.8) * local12)))
                                local7 = (((sin(local0\Field13) * fps\Field3[$00]) / 180.0) * local12)
                                moveentity(local0\Field0, local7, 0.0, 0.0, $00)
                                If (local0\Field7 <> $00) Then
                                    moveentity(local0\Field7, (- local7), 0.0, 0.0, $00)
                                EndIf
                            Case $04,$05,$06
                                If (local0\Field32 <> Null) Then
                                    local0\Field13 = (curveangle(180.0, local0\Field13, 40.0) + (fps\Field3[$00] * 0.01))
                                    rotateentity(local0\Field0, 0.0, ((Float (local0\Field32\Field21 + local0\Field8)) + (local0\Field13 / 2.5)), 0.0, $00)
                                EndIf
                            Case $07
                                local0\Field13 = min(180.0, (local0\Field13 + (local11 * local12)))
                                local7 = (((sin(local0\Field13) * local12) * fps\Field3[$00]) / 80.0)
                                moveentity(local0\Field0, local7, 0.0, 0.0, $00)
                                If (local0\Field7 <> $00) Then
                                    moveentity(local0\Field7, (- local7), 0.0, 0.0, $00)
                                EndIf
                            Case $08
                                local0\Field13 = min(180.0, (local0\Field13 + (fps\Field3[$00] * 1.4)))
                                local7 = ((sin(local0\Field13) * fps\Field3[$00]) / 114.0)
                                moveentity(local0\Field0, local7, 0.0, 0.0, $00)
                                If (local0\Field7 <> $00) Then
                                    moveentity(local0\Field7, (- local7), 0.0, 0.0, $00)
                                EndIf
                        End Select
                    Else
                        local0\Field27 = $00
                        resetentity(local0\Field0)
                        If (local0\Field7 <> $00) Then
                            resetentity(local0\Field7)
                        EndIf
                        If (0.0 < local0\Field9) Then
                            local0\Field9 = max(0.0, (local0\Field9 - fps\Field3[$00]))
                            If ((local0\Field23 And ((110.0 < (local0\Field9 + fps\Field3[$00])) And (110.0 >= local0\Field9))) <> 0) Then
                                local0\Field45 = playsoundex(snd_i\Field12, camera, local0\Field0, 10.0, 1.0, $00, $00)
                            EndIf
                            If (0.0 = local0\Field9) Then
                                local0\Field45 = $00
                                openclosedoor(local0, $01, $00)
                                local0\Field53 = 35.0
                            EndIf
                        EndIf
                    EndIf
                Else
                    local14 = entityx(local0\Field51, $01, 1.0)
                    local15 = entityy(local0\Field51, $01, 1.0)
                    local16 = entityz(local0\Field51, $01, 1.0)
                    If (0.0 < local0\Field13) Then
                        Select local0\Field46
                            Case $00
                                local0\Field13 = max(0.0, (local0\Field13 - (local11 * local12)))
                                local7 = (((sin(local0\Field13) * local12) * (- fps\Field3[$00])) / 80.0)
                                moveentity(local0\Field0, local7, 0.0, 0.0, $00)
                                If (local0\Field7 <> $00) Then
                                    moveentity(local0\Field7, local7, 0.0, 0.0, $00)
                                EndIf
                            Case $01
                                local0\Field13 = max(0.0, (local0\Field13 - (local11 * local12)))
                                local7 = (((sin(local0\Field13) * local12) * (- fps\Field3[$00])) / 162.0)
                                moveentity(local0\Field0, local7, 0.0, 0.0, $00)
                                If (local0\Field7 <> $00) Then
                                    moveentity(local0\Field7, local7, 0.0, 0.0, $00)
                                EndIf
                            Case $02
                                local0\Field13 = max(0.0, (local0\Field13 - (local11 * local12)))
                                local6 = sin(local0\Field13)
                                moveentity(local0\Field0, (((local6 * local12) * (- fps\Field3[$00])) / 90.0), 0.0, 0.0, $00)
                                If (local0\Field7 <> $00) Then
                                    moveentity(local0\Field7, (((local6 * local12) * (- fps\Field3[$00])) / 155.0), 0.0, 0.0, $00)
                                EndIf
                            Case $03
                                local0\Field13 = max(0.0, (local0\Field13 - ((fps\Field3[$00] * 0.8) * local12)))
                                local7 = (((sin(local0\Field13) * local12) * fps\Field3[$00]) / 180.0)
                                moveentity(local0\Field0, (- local7), 0.0, 0.0, $00)
                                If (local0\Field7 <> $00) Then
                                    moveentity(local0\Field7, local7, 0.0, 0.0, $00)
                                EndIf
                                If (((15.0 > local0\Field13) And (15.0 <= (local0\Field13 + fps\Field3[$00]))) <> 0) Then
                                    setemitter(Null, local14, local15, local16, $0B)
                                EndIf
                            Case $04,$05,$06
                                local0\Field13 = 0.0
                                rotateentity(local0\Field0, 0.0, entityyaw(local0\Field51, $00, 1.0), 0.0, $00)
                            Case $07
                                local0\Field13 = max(0.0, (local0\Field13 - (local11 * local12)))
                                local7 = (((sin(local0\Field13) * local12) * fps\Field3[$00]) / 80.0)
                                moveentity(local0\Field0, (- local7), 0.0, 0.0, $00)
                                If (local0\Field7 <> $00) Then
                                    moveentity(local0\Field7, local7, 0.0, 0.0, $00)
                                EndIf
                            Case $08
                                local0\Field13 = min(180.0, (local0\Field13 - (fps\Field3[$00] * 1.4)))
                                local7 = ((sin(local0\Field13) * fps\Field3[$00]) / 114.0)
                                moveentity(local0\Field0, (- local7), 0.0, 0.0, $00)
                                If (local0\Field7 <> $00) Then
                                    moveentity(local0\Field7, local7, 0.0, 0.0, $00)
                                EndIf
                        End Select
                    Else
                        local0\Field27 = $00
                        positionentity(local0\Field0, local14, local15, local16, $00)
                        If (local0\Field7 <> $00) Then
                            positionentity(local0\Field7, local14, local15, local16, $00)
                        EndIf
                        Select local0\Field46
                            Case $00,$07,$08
                                moveentity(local0\Field0, 0.0, 0.0, (1.0 / 32.0), $00)
                                If (local0\Field7 <> $00) Then
                                    moveentity(local0\Field7, 0.0, 0.0, (1.0 / 32.0), $00)
                                EndIf
                            Case $04
                                moveentity(local0\Field0, 0.359375, 0.0, 0.0, $00)
                            Case $05
                                moveentity(local0\Field0, 0.265625, 0.0, 0.0, $00)
                            Case $06
                                moveentity(local0\Field0, (1.0 / 2.245614), 0.0, 0.0, $00)
                        End Select
                    EndIf
                EndIf
                If (local0\Field46 = $03) Then
                    If (((local0\Field21 = $02) And (48.0 < local0\Field13)) <> 0) Then
                        local0\Field39 = $00
                        local0\Field13 = min(local0\Field13, 48.0)
                    EndIf
                    If (((((0.1225 > entitydistancesquared(XZ0260X8X2\Field74, local0\Field51)) And (6.0 < local0\Field13)) And (48.0 > local0\Field13)) And (local0\Field39 = $00)) <> 0) Then
                        If (((0.0 = XZ0260X8X2\Field48) And (chs\Field0 = $00)) <> 0) Then
                            playsound_strict(loadtempsound("SFX\SCP\914\PlayerDeath.ogg"), $00, $00)
                            msg\Field8 = format(getlocalstring("death", "door"), subjectname, "%s")
                            kill($01, $01, $00, $01)
                        EndIf
                    EndIf
                EndIf
            ElseIf (((isequal((Abs entitypitch(local0\Field0, $00, 1.0)), 89.9, 0.001) = $00) Lor ((local0\Field7 = $00) Lor (isequal((Abs entitypitch(local0\Field7, $00, 1.0)), 89.9, 0.001) = $00))) <> 0) Then
                local19 = ((local0\Field54 * 2.0) - 1.0)
                If (0.0 < local19) Then
                    local20 = 89.9
                Else
                    local20 = -89.9
                EndIf
                tformpoint(((- GUESSEDupdaternd(0.2, 0.3, local0\Field36)) / entityscalex(local0\Field51, $01, 1.0)), 0.0, ((GUESSEDupdaternd(0.2, 0.4, local0\Field36) * local19) / entityscalez(local0\Field51, $01, 1.0)), local0\Field51, $00)
                local21 = tformedx()
                local22 = tformedy()
                local23 = tformedz()
                GUESSEDpositionentity_7(local0\Field0, local21, (local22 + 0.045), local23, local20, (entityyaw(local0\Field51, $01, 1.0) + GUESSEDupdaternd(-15.0, 15.0, local0\Field36)), 0.0, GUESSEDupdaternd(0.01, 0.02, (local0\Field36 + $20)), $01)
                If (local0\Field7 <> $00) Then
                    tformpoint((GUESSEDupdaternd(0.2, 0.3, (local0\Field36 + $10)) / entityscalex(local0\Field51, $01, 1.0)), 0.0, ((GUESSEDupdaternd(0.2, 0.4, (local0\Field36 + $10)) * local19) / entityscalez(local0\Field51, $01, 1.0)), local0\Field51, $00)
                    local24 = tformedx()
                    local25 = tformedy()
                    local26 = tformedz()
                    If (local0\Field46 = $03) Then
                        local20 = (- local20)
                    EndIf
                    GUESSEDpositionentity_7(local0\Field7, local24, (local25 + 0.045), local26, (- local20), ((entityyaw(local0\Field51, $01, 1.0) + ((Float (local0\Field46 <> $03)) * 180.0)) + GUESSEDupdaternd(-15.0, 15.0, (local0\Field36 + $40))), 0.0, GUESSEDupdaternd(0.01, 0.02, (local0\Field36 + $40)), $01)
                EndIf
            ElseIf (getentitytype(local0\Field0) <> $03) Then
                entitytype(local0\Field0, $03, $00)
                If (local0\Field7 <> $00) Then
                    entitytype(local0\Field7, $03, $00)
                EndIf
            EndIf
            If (local0\Field49 <> $00) Then
                local5 = local0\Field40[(local0\Field49 - $01)]
                local27 = ((Float (local0\Field43 = $00)) * 22.0)
                If (animtime(local5) > (0.99 + local27)) Then
                    animateex(local5, animtime(local5), (Int (1.0 + local27)), (Int (20.0 + local27)), 2.0, $00)
                    If (animtime(local5) >= (19.9 + local27)) Then
                        local0\Field49 = $00
                    EndIf
                Else
                    local0\Field49 = $00
                EndIf
            ElseIf (local0\Field20 <> 0) Then
                If (0.99 < animtime(local0\Field0)) Then
                    local27 = ((Float (local0\Field21 > $00)) * 22.0)
                    animateex(local0\Field0, animtime(local0\Field0), (Int (1.0 + local27)), (Int (22.0 + local27)), 0.6, $00)
                    If (43.5 <= animtime(local0\Field0)) Then
                        local0\Field20 = $00
                    EndIf
                EndIf
            EndIf
            If (local0\Field55 <> 0) Then
                If (((local0\Field21 > $00) Lor (local0\Field19 > $00)) <> 0) Then
                    If (getentitytype(local0\Field0) = $07) Then
                        entitytype(local0\Field0, $01, $00)
                        If (local0\Field7 <> $00) Then
                            entitytype(local0\Field7, $01, $00)
                        EndIf
                    EndIf
                ElseIf (getentitytype(local0\Field0) = $01) Then
                    entitytype(local0\Field0, $07, $00)
                    If (local0\Field7 <> $00) Then
                        entitytype(local0\Field7, $07, $00)
                    EndIf
                EndIf
                local0\Field14 = (local0\Field14 - fps\Field3[$00])
                updatesoundorigin(local0\Field45, camera, local0\Field51, 10.0, 1.0, $00, $01, $00)
                If ((((180.0 <= local0\Field13) Lor (0.0 >= local0\Field13)) And local10) <> 0) Then
                    For local4 = $00 To $01 Step $01
                        If (local0\Field40[local4] <> $00) Then
                            If ((((1.0 > (Abs (entityx(XZ0260X8X2\Field74, $00, 1.0) - entityx(local0\Field40[local4], $01, 1.0)))) And (1.0 > (Abs (entityz(XZ0260X8X2\Field74, $00, 1.0) - entityz(local0\Field40[local4], $01, 1.0))))) And updatebutton(local0\Field40[local4])) <> 0) Then
                                If (((d_i\Field6 <> local0) Lor (d_i\Field12 <> (local4 + $01))) <> 0) Then
                                    local0\Field34 = 0.0
                                    d_i\Field6 = local0
                                    d_i\Field12 = (local4 + $01)
                                EndIf
                                Exit
                            EndIf
                        EndIf
                    Next
                EndIf
                If (local0\Field28 = $00) Then
                    If (local0\Field6 = $02) Then
                        local28 = $FA0
                        local29 = (millisecs() Mod local28)
                        local30 = ((Float local29) / (Float local28))
                        local31 = ((sin(((local30 * 360.0) - 90.0)) + 1.0) / 2.0)
                        local32 = ((Int (local31 * 45.0)) + $D2)
                        For local4 = $00 To $01 Step $01
                            If (local0\Field40[local4] <> $00) Then
                                entitycolor(local0\Field40[local4], (Float local32), (Float local32), (Float local32))
                            EndIf
                        Next
                    Else
                        For local4 = $00 To $01 Step $01
                            If (local0\Field40[local4] <> $00) Then
                                entitycolor(local0\Field40[local4], 255.0, 255.0, 255.0)
                            EndIf
                        Next
                    EndIf
                    If (0.0 >= local0\Field34) Then
                        If ((local0\Field10 And (local0\Field21 > $00)) <> 0) Then
                            local0\Field10 = $00
                        EndIf
                        GUESSEDcountentity(local0, $FFFFFFFF)
                        local0\Field34 = 35.0
                    Else
                        local0\Field34 = (local0\Field34 - fps\Field3[$00])
                    EndIf
                EndIf
            EndIf
        EndIf
        GUESSEDsetanim_4(local0)
    Next
    If (((local9 <> Null) And (d_i\Field6 = Null)) <> 0) Then
        local9\Field34 = 0.0
    EndIf
    If ((GUESSEDupdateanimatenpc() Lor (GUESSEDupdatexdb() = $00)) <> 0) Then
        If (d_i\Field6 <> Null) Then
            If ((d_i\Field6\Field10 And remotedooron) <> 0) Then
                If ((d_i\Field6\Field39 And (180.0 = d_i\Field6\Field13)) <> 0) Then
                    If ((((i_714\Field0 = $00) And (T8660BZ460\Field3 <> $04)) And (T8660BZ460\Field10 <> $04)) <> 0) Then
                        playsound_strict(snd_i\Field40[$07], $00, $00)
                    EndIf
                    openclosedoor(d_i\Field6, $01, $00)
                    d_i\Field6\Field10 = $00
                EndIf
            EndIf
        EndIf
    EndIf
    Return $00
End Function

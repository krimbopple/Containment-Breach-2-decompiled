Function TXFB22FF044%(arg0.TX2BF6X0FF4)
    Local local0%
    Local local1%
    Local local2%
    Local local3.rooms
    Local local4%
    Local local6%
    Local local7.decals
    Local local9#
    Local local10.items
    Local local11%
    Local local12#
    Local local13%
    Local local14%
    TD8ZFFBBD2(arg0)
    arg0\Field45 = curvevalue(0.0, arg0\Field45, 50.0)
    If (arg0\Field46 <> Null) Then
        If (arg0\Field46\Field46 = $00) Then
            arg0\Field48 = $00
            If (T20FFXB28X8(arg0\Field46\Field36, $01) <> 0) Then
                arg0\Field48 = $01
            EndIf
            If (T20FFXB28X8(arg0\Field46\Field36, $02) <> 0) Then
                arg0\Field48 = $02
            EndIf
            local1 = (arg0\Field13 = TXXDZB2ZBXX())
            If (local1 <> 0) Then
                If (-1.0 >= XZ0260X8X2\Field58) Then
                    arg0\Field48 = $01
                EndIf
                If (1.0 <= XZ0260X8X2\Field58) Then
                    arg0\Field48 = $02
                EndIf
            EndIf
            arg0\Field53 = $00
            If (arg0\Field46\Field23 <> $00) Then
                TX064ZDF0XD($00, arg0\Field46\Field23)
                local2 = eax_005E
                
                If (((local2 <> $00) And (eax_0068 = arg0\Field13)) <> 0) Then
                    
                    arg0\Field53 = eax_0075
                EndIf
            EndIf
            If ((local1 And (selecteditem <> Null)) <> 0) Then
                arg0\Field53 = selecteditem\Field27
            EndIf
            If (arg0\Field46\Field6 > $00) Then
                local3 = XXDB6F64F2[arg0\Field46\Field6]
                local4 = $00
                If (local3 <> Null) Then
                    If (arg0\Field46\Field8 <> 0) Then
                        If (((arg0\Field46\Field20 < $04) And (local3\Field9[arg0\Field46\Field20] <> Null)) <> 0) Then
                            local4 = local3\Field9[arg0\Field46\Field20]\Field1
                            If (((local4 <> $00) And (1.0 > entitydistancesquared(local4, arg0\Field52))) <> 0) Then
                                rotateentity(local4, clamp(curvevalue(arg0\Field46\Field28, entitypitch(local4, $01, 1.0), 4.0), -80.0, 80.0), entityyaw(local4, $01, 1.0), 0.0, $01)
                            EndIf
                        EndIf
                    Else
                        Select local3\Field22\Field21
                            Case $06
                                If (arg0\Field46\Field20 < $02) Then
                                    local4 = local3\Field27[arg0\Field46\Field20]
                                    If (((local4 <> $00) And (2.0 > entitydistancesquared(local4, arg0\Field52))) <> 0) Then
                                        rotateentity(local4, entitypitch(local4, $01, 1.0), entityyaw(local4, $01, 1.0), curveangle(arg0\Field46\Field28, entityroll(local4, $01, 1.0), 4.0), $01)
                                    EndIf
                                EndIf
                            Case $3B
                                If (arg0\Field46\Field20 = $01) Then
                                    local4 = local3\Field27[arg0\Field46\Field20]
                                    If (((local4 <> $00) And (2.0 > entitydistancesquared(local4, arg0\Field52))) <> 0) Then
                                        rotateentity(local4, clamp(curvevalue(arg0\Field46\Field28, entitypitch(local4, $01, 1.0), 4.0), 35.0, 89.0), entityyaw(local4, $01, 1.0), 0.0, $01)
                                    EndIf
                                EndIf
                        End Select
                    EndIf
                EndIf
            EndIf
            If (1.0 < arg0\Field46\Field9) Then
                If (E0B68ZZ2(arg0, $03) <> $0D) Then
                    arg0\Field46\Field27 = min((((min(arg0\Field46\Field9, 4.0) / 300.0) * fps\Field3[$00]) + arg0\Field46\Field27), 100.0)
                EndIf
                If (min(arg0\Field46\Field9, 4.0) > rnd(200.0, 0.0)) Then
                    local6 = createpivot($00)
                    positionentity(local6, (entityx(arg0\Field52, $00, 1.0) + rnd(-0.05, 0.05)), (entityy(arg0\Field52, $00, 1.0) - 0.1), (entityz(arg0\Field52, $00, 1.0) + rnd(-0.05, 0.05)), $00)
                    turnentity(local6, 90.0, 0.0, 0.0, $00)
                    entitypick(local6, 0.3)
                    local7 = createdecal(rand($11, $12), pickedx(), (pickedy() + 0.005), pickedz(), 90.0, rnd(360.0, 0.0), 0.0, (rnd(0.03, 0.08) * min(arg0\Field46\Field9, 2.5)), 1.0, $00, $01, $00, $00, $00)
                    local7\Field14 = rnd(0.001, 0.0015)
                    local7\Field3 = (local7\Field9 + rnd(0.008, 0.009))
                    local7\Field5 = -0.0001
                    local7\Field2 = 2100.0
                    If (XXDB6F64F2[arg0\Field3] <> Null) Then
                        entityparent(local7\Field0, XXDB6F64F2[arg0\Field3]\Field15, $01)
                    EndIf
                    freeentity(local6)
                    local6 = $00
                    XZ48406XD0(local7, arg0\Field3)
                EndIf
                If (100.0 <= arg0\Field46\Field27) Then
                    Y0FFZFZ0Z(arg0, $00, $00)
                EndIf
            EndIf
            If (0.0 > arg0\Field46\Field33) Then
                If (-20.0 >= arg0\Field46\Field33) Then
                    Select selecteddifficulty\Field8
                        Case $00
                            arg0\Field46\Field34 = rnd(770.0, 910.0)
                        Case $01
                            arg0\Field46\Field34 = rnd(630.0, 770.0)
                        Case $02
                            arg0\Field46\Field34 = rnd(490.0, 630.0)
                        Case $03
                            arg0\Field46\Field34 = rnd(350.0, 490.0)
                    End Select
                    arg0\Field46\Field33 = arg0\Field46\Field34
                EndIf
                arg0\Field46\Field33 = (arg0\Field46\Field33 - fps\Field3[$01])
            Else
                arg0\Field46\Field33 = (arg0\Field46\Field33 - ((fps\Field3[$01] * (((Float arg0\Field46\Field35) * 0.5) + 1.0)) * arg0\Field46\Field51))
                If (((0.0 < arg0\Field46\Field17) And (E0B68ZZ2(arg0, $00) = $00)) <> 0) Then
                    arg0\Field46\Field33 = (arg0\Field46\Field33 - (min(((arg0\Field46\Field17 / 70.0) + 1.0), 5.0) * fps\Field3[$01]))
                EndIf
            EndIf
            If (arg0\Field46\Field26 <> 0) Then
                arg0\Field46\Field33 = arg0\Field46\Field34
            EndIf
            If (0.0 < arg0\Field46\Field40) Then
                arg0\Field46\Field40 = (arg0\Field46\Field40 - (fps\Field3[$01] / 70.0))
            Else
                arg0\Field46\Field51 = 1.0
            EndIf
            If (T20FFXB28X8(arg0\Field46\Field36, $00) <> 0) Then
                arg0\Field46\Field33 = clamp(arg0\Field46\Field33, -10.0, 0.0)
            EndIf
            If (local1 <> 0) Then
                arg0\Field46\Field33 = XZ0260X8X2\Field53
                arg0\Field46\Field1 = T8660BZ460\Field5
                arg0\Field46\Field27 = XZ0260X8X2\Field39
                arg0\Field46\Field47 = chs\Field0
                arg0\Field46\Field9 = XZ0260X8X2\Field11
                arg0\Field44\Field7 = DZ64X028\Field1
            EndIf
            arg0\Field30 = (((-16.0 < arg0\Field46\Field33) And (-6.0 > arg0\Field46\Field33)) Lor arg0\Field46\Field1)
            If (0.0 < arg0\Field46\Field49) Then
                arg0\Field46\Field33 = arg0\Field46\Field34
                arg0\Field46\Field49 = max((arg0\Field46\Field49 - fps\Field3[$00]), 0.0)
            EndIf
            arg0\Field46\Field7 = (arg0\Field46\Field7 + fps\Field3[$01])
            If (17.5 <= arg0\Field46\Field7) Then
                If (((E0B68ZZ2(arg0, $02) = $0F) Lor (E0B68ZZ2(arg0, $02) = $10)) <> 0) Then
                    T8620F0Z20(arg0, (0.0 < arg0\Field46\Field3))
                    arg0\Field46\Field14 = 140.0
                    If (E0B68ZZ2(arg0, $02) = $10) Then
                        local9 = (((((Float (E0B68ZZ2(arg0, $04) = $11)) * 0.5) + 1.0) + (Float (E0B68ZZ2(arg0, $00) = $04))) * (arg0\Field46\Field7 / 2.0))
                    Else
                        local9 = (((((Float (E0B68ZZ2(arg0, $04) = $11)) * 0.5) + 1.0) + (Float (E0B68ZZ2(arg0, $00) = $04))) * arg0\Field46\Field7)
                    EndIf
                    arg0\Field46\Field3 = max((arg0\Field46\Field3 - local9), 0.0)
                Else
                    If (0.0 >= arg0\Field46\Field14) Then
                        arg0\Field46\Field3 = min((arg0\Field46\Field3 + arg0\Field46\Field7), 700.0)
                    Else
                        arg0\Field46\Field14 = (arg0\Field46\Field14 - arg0\Field46\Field7)
                    EndIf
                    T8620F0Z20(arg0, $00)
                EndIf
                If (arg0\Field53 <> $00) Then
                    TX064ZDF0XD($00, arg0\Field53)
                    local10 = eax_050C
                    If (local10 <> Null) Then
                        If (local10\Field31 = $03) Then
                            local10\Field15 = max((local10\Field15 - (arg0\Field46\Field7 * 0.003)), 0.0)
                        EndIf
                    EndIf
                EndIf
                arg0\Field46\Field31 = $00
                If (((arg0\Field46\Field50 <> $00) And (arg0\Field46\Field44 <> $00)) <> 0) Then
                    TX064ZDF0XD($00, arg0\Field46\Field44)
                    local11 = eax_0556
                    
                    
                    If ((((local11 <> $00) And (eax_0560 = arg0\Field13)) And (eax_056F = $07)) <> 0) Then
                        arg0\Field46\Field31 = arg0\Field46\Field50
                        
                        max((eax_0589 - (arg0\Field46\Field7 * 0.003)), 0.0)
                        
                    EndIf
                EndIf
                If (0.0 < arg0\Field46\Field19) Then
                    local12 = (arg0\Field46\Field7 / 70.0)
                    arg0\Field46\Field19 = max((arg0\Field46\Field19 - local12), 0.0)
                    arg0\Field46\Field27 = min((arg0\Field46\Field27 + (local12 / 3.0)), 100.0)
                    arg0\Field46\Field9 = max((arg0\Field46\Field9 - (local12 / 30.0)), 0.0)
                EndIf
                arg0\Field46\Field5 = (arg0\Field46\Field5 - arg0\Field46\Field7)
                If (((arg0\Field46\Field9 < arg0\Field46\Field2) And (0.0 >= arg0\Field46\Field5)) <> 0) Then
                    arg0\Field46\Field9 = min(arg0\Field46\Field2, 25.0)
                EndIf
                local13 = $00
                local14 = $00
                YXZ0XZ888X(arg0, $00, $00, Null, $00)
                YXZ0XZ888X(arg0, $01, $00, Null, $00)
                YXZ0XZ888X(arg0, $02, $00, Null, $00)
                YXZ0XZ888X(arg0, $03, $00, Null, $00)
                YXZ0XZ888X(arg0, $04, $00, Null, $00)
                YXZ0XZ888X(arg0, $05, $00, Null, $00)
                If (local1 <> 0) Then
                    For local0 = $00 To $05 Step $01
                        arg0\Field46\Field21[local0] = TXDFXDZXXDD\Field16[local0]
                    Next
                EndIf
                For local0 = $00 To $04 Step $01
                    If (arg0\Field46\Field21[local0] <> $00) Then
                        TX064ZDF0XD($00, arg0\Field46\Field21[local0])
                        local10 = eax_0678
                        If (((local10 <> Null) And (local10\Field29 = arg0\Field13)) <> 0) Then
                            local10\Field15 = max((local10\Field15 - ((arg0\Field46\Field7 * 0.003) * (Float (local10\Field31 = $03)))), 0.0)
                            Select local10\Field6\Field9
                                Case $38
                                    YXZ0XZ888X(arg0, $00, $01, local10, $00)
                                Case $39
                                    YXZ0XZ888X(arg0, $00, $02, local10, $00)
                                Case $3A
                                    YXZ0XZ888X(arg0, $00, $03, local10, $00)
                                Case $3B
                                    YXZ0XZ888X(arg0, $00, $04, local10, $00)
                                Case $40
                                    YXZ0XZ888X(arg0, $00, $08, local10, $00)
                                Case $42
                                    YXZ0XZ888X(arg0, $00, $09, local10, $00)
                                Case $41
                                    YXZ0XZ888X(arg0, $00, $0A, local10, $00)
                                Case $43
                                    YXZ0XZ888X(arg0, $00, $0B, local10, $00)
                                Case $44
                                    YXZ0XZ888X(arg0, $00, $0C, local10, $00)
                                Case $27
                                    YXZ0XZ888X(arg0, $01, $05, local10, $00)
                                Case $28
                                    YXZ0XZ888X(arg0, $01, $06, local10, $00)
                                Case $26
                                    YXZ0XZ888X(arg0, $02, $07, local10, $00)
                                Case $74
                                    YXZ0XZ888X(arg0, $02, $1D, local10, $00)
                                Case $0B
                                    YXZ0XZ888X(arg0, $02, $0E, local10, $00)
                                Case $0C
                                    YXZ0XZ888X(arg0, $02, $0F, local10, $00)
                                Case $0D
                                    YXZ0XZ888X(arg0, $02, $10, local10, $00)
                                Case $12
                                    YXZ0XZ888X(arg0, $03, $0D, local10, $00)
                                Case $19
                                    YXZ0XZ888X(arg0, $04, $11, local10, $00)
                                Case $18
                                    YXZ0XZ888X(arg0, $04, $12, local10, $00)
                                Case $3C,$3D,$3E
                                    local13 = $01
                                Case $3F
                                    local13 = $01
                                    local14 = $01
                            End Select
                        EndIf
                    EndIf
                Next
                If (arg0\Field46\Field21[$05] <> $00) Then
                    TX064ZDF0XD($00, arg0\Field46\Field21[$05])
                    local10 = eax_06EB
                    If (((local10 <> Null) And (local10\Field29 = arg0\Field13)) <> 0) Then
                        YXZ0XZ888X(arg0, $05, TXXB848FF8(local10\Field6\Field11), local10, $00)
                    EndIf
                EndIf
                If (local13 <> 0) Then
                    YXZ0XZ888X(arg0, $00, $00, Null, $00)
                    YXZ0XZ888X(arg0, $01, $00, Null, $00)
                    YXZ0XZ888X(arg0, $02, $00, Null, $00)
                    YZD22B480(arg0, $02)
                    If (local14 <> 0) Then
                        XX6XZBBFX4(arg0, $09, $00)
                    EndIf
                ElseIf (TX4X28D4B20(arg0) > $00) Then
                    TX46F82X2Z0(arg0, TX4X28D4B20(arg0), $01)
                EndIf
                arg0\Field46\Field7 = 0.0
            EndIf
            Return $00
        EndIf
        If (X40BFXDD8B(arg0) <> $00) Then
            YXZ0XZ888X(arg0, $00, $00, Null, $00)
            YXZ0XZ888X(arg0, $01, $00, Null, $00)
            YXZ0XZ888X(arg0, $02, $00, Null, $00)
            YXZ0XZ888X(arg0, $03, $00, Null, $00)
            YXZ0XZ888X(arg0, $04, $00, Null, $00)
            YXZ0XZ888X(arg0, $05, $00, Null, $00)
            TX46F82X2Z0(arg0, $00, $00)
        EndIf
        TZZ064X4BZ(arg0)
    EndIf
    Return $00
End Function

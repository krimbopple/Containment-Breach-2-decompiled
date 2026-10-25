Function GUESSEDcreateentity_3%(arg0%, arg1.X0442B862F, arg2#, arg3#, arg4#, arg5#, arg6#, arg7#, arg8#, arg9#, arg10%, arg11%)
    Local local0.decals
    Local local2%
    Local local3%
    Local local4.TX2BF6X0FF4
    Local local5#
    Local local6#
    Local local8%
    Local local9.emitter
    Local local10#
    Local local11.particles
    Local local12%
    Select arg0
        Case $00
            local2 = (arg10 And $02)
            local3 = $01
            If (opt\Field69 > $00) Then
                local4 = Null
                If (arg11 <> $00) Then
                    local4 = TXXF6F02DB2[arg11]
                EndIf
                local5 = 1.0
                If (arg1 <> Null) Then
                    local5 = arg1\Field58
                EndIf
                local6 = local5
                If (local4 <> Null) Then
                    local6 = GUESSEDgetarg1_3(local4, local5, ((Float (local2 = $00)) * 0.5), (Float local2))
                    If (local2 <> 0) Then
                        Select GUESSEDcheckvalue_6(local4, $02)
                            Case $07,$1D
                                If (arg1 <> Null) Then
                                    If (arg1\Field42 <> 0) Then
                                        local8 = _CountSplitString(arg1\Field59[$02], " ")
                                        GUESSEDupdateentity_4(_SplitString(arg1\Field59[$02], " ", rand($00, (local8 - $01))), blitz_TB8D046D4X0(arg4, arg5, arg6), 8.0, rnd(0.7, 0.8), $00, $00)
                                        local3 = $00
                                    Else
                                        local9 = setemitter(Null, arg4, arg5, arg6, $32)
                                        rotateentity(local9\Field2, (rnd(170.0, 190.0) + arg2), (rnd(-10.0, 10.0) + arg3), 0.0, $00)
                                        If ((arg10 And $01) <> $00) Then
                                            local0 = createdecal(rand($0E, $0F), arg4, (arg5 + 0.005), arg6, rnd(-4.0, 4.0), rnd(-4.0, 4.0), rnd(-4.0, 4.0), rnd(0.028, 0.034), 1.0, $00, $01, $00, $00, $00)
                                        EndIf
                                        GUESSEDupdateentity_4(T200Z6BDDZ[$02], blitz_TB8D046D4X0(arg4, arg5, arg6), 6.0, rnd(0.7, 0.8), $00, $00)
                                    EndIf
                                EndIf
                        End Select
                    EndIf
                EndIf
                local10 = (local6 / 1.8)
                If (0.05 >= local6) Then
                    local10 = 0.1
                EndIf
                If (0.05 < local10) Then
                    local9 = setemitter(Null, arg4, arg5, arg6, $36)
                    rotateentity(local9\Field2, (- arg2), (- arg3), 0.0, $00)
                    local9\Field5 = (local10 * 0.6)
                    If (0.2 < local6) Then
                        local9 = setemitter(Null, arg4, arg5, arg6, $37)
                        rotateentity(local9\Field2, (- arg2), (- arg3), 0.0, $00)
                        local9\Field5 = (local10 * 0.6)
                    EndIf
                EndIf
            EndIf
            If (local3 <> 0) Then
                If (arg1 <> Null) Then
                    If (arg1\Field42 <> 0) Then
                        local8 = _CountSplitString(arg1\Field59[$00], " ")
                        GUESSEDupdateentity_4(_SplitString(arg1\Field59[$00], " ", rand($00, (local8 - $01))), blitz_TB8D046D4X0(arg4, arg5, arg6), 8.0, rnd(0.7, 0.8), $00, $00)
                    Else
                        GUESSEDupdateentity_4(T200Z6BDDZ[rand($00, $01)], blitz_TB8D046D4X0(arg4, arg5, arg6), 6.0, rnd(0.7, 0.8), $00, $00)
                    EndIf
                Else
                    GUESSEDupdateentity_4(T200Z6BDDZ[rand($00, $01)], blitz_TB8D046D4X0(arg4, arg5, arg6), 6.0, rnd(0.7, 0.8), $00, $00)
                EndIf
            EndIf
        Case $02
            If (arg1\Field42 <> 0) Then
                local8 = _CountSplitString(arg1\Field59[$02], " ")
                GUESSEDupdateentity_4(_SplitString(arg1\Field59[$02], " ", rand($00, (local8 - $01))), blitz_TB8D046D4X0(arg4, arg5, arg6), 8.0, rnd(0.7, 0.8), $00, $00)
            Else
                local9 = setemitter(Null, arg4, arg5, arg6, $32)
                rotateentity(local9\Field2, (rnd(170.0, 190.0) + arg2), (rnd(-10.0, 10.0) + arg3), 0.0, $00)
                If ((arg10 And $01) <> $00) Then
                    local0 = createdecal(rand($0E, $0F), arg4, (arg5 + 0.005), arg6, rnd(-4.0, 4.0), rnd(-4.0, 4.0), rnd(-4.0, 4.0), rnd(0.028, 0.034), 1.0, $00, $01, $00, $00, $00)
                EndIf
                GUESSEDupdateentity_4(T200Z6BDDZ[$02], blitz_TB8D046D4X0(arg4, arg5, arg6), 6.0, rnd(0.7, 0.8), $00, $00)
            EndIf
        Case $03
            local0 = createdecal($17, arg4, (arg5 + 0.005), arg6, rnd(-4.0, 4.0), rnd(-4.0, 4.0), rnd(-4.0, 4.0), rnd(0.028, 0.034), 1.0, $00, $01, $00, $00, $00)
            GUESSEDupdateentity_4(T200Z6BDDZ[$03], blitz_TB8D046D4X0(arg4, arg5, arg6), 6.0, rnd(0.7, 0.8), $00, $00)
        Default
            If (arg1\Field42 <> 0) Then
                local8 = _CountSplitString(arg1\Field59[$01], " ")
                GUESSEDupdateentity_4(_SplitString(arg1\Field59[$01], " ", rand($00, (local8 - $01))), blitz_TB8D046D4X0(arg4, arg5, arg6), 8.0, rnd(0.7, 0.8), $00, $00)
            Else
                If (opt\Field69 > $00) Then
                    local11 = createparticle($00, arg4, arg5, arg6, 0.03, 0.0, 80.0)
                    local11\Field11 = 0.001
                    local11\Field7 = 0.003
                    local11\Field13 = 0.8
                    local11\Field5 = -0.01
                    rotateentity(local11\Field10, (arg2 - 180.0), arg3, 0.0, $00)
                    For local12 = $00 To rand($02, $03) Step $01
                        local11 = createparticle($00, arg4, arg5, arg6, 0.006, 0.003, 80.0)
                        local11\Field11 = 0.02
                        local11\Field13 = 0.8
                        local11\Field5 = -0.01
                        rotateentity(local11\Field10, (rnd(170.0, 190.0) + arg2), (rnd(-10.0, 10.0) + arg3), 0.0, $00)
                    Next
                EndIf
                If ((arg10 And $01) <> $00) Then
                    local0 = createdecal($10, arg4, (arg5 + 0.005), arg6, rnd(-4.0, 4.0), rnd(-4.0, 4.0), rnd(-4.0, 4.0), rnd(0.028, 0.034), 1.0, $00, $01, $00, $00, $00)
                    GUESSEDupdateentity_4(T200Z6BDDZ[$04], blitz_TB8D046D4X0(arg4, arg5, arg6), 6.0, rnd(0.7, 0.8), $00, $00)
                EndIf
            EndIf
    End Select
    If (local0 <> Null) Then
        local0\Field2 = 2100.0
        aligntovector(local0\Field0, (- arg7), (- arg8), (- arg9), $03, 1.0)
        moveentity(local0\Field0, 0.0, 0.0, -0.001, $00)
        entityparent(local0\Field0, pickedentity(), $01)
    EndIf
    Return $00
End Function

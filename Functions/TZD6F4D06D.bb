Function TZD6F4D06D%(arg0.TX2BF6X0FF4)
    Local local0#
    Local local1#
    Local local2#
    Local local3%
    Local local4%
    Local local5%
    If (arg0\Field46 <> Null) Then
        If (arg0\Field46\Field46 = $00) Then
            If (arg0\Field46\Field48 <> 0) Then
                local0 = arg0\Field46\Field38
                local1 = arg0\Field46\Field15
                local2 = arg0\Field46\Field16
                If (0.001 < distancesquared(arg0\Field19, local0, arg0\Field49, local1, arg0\Field26, local2)) Then
                    If (arg0\Field52 <> $00) Then
                        arg0\Field33 = entityx(arg0\Field52, $00, 1.0)
                        arg0\Field34 = entityy(arg0\Field52, $00, 1.0)
                        arg0\Field51 = entityz(arg0\Field52, $00, 1.0)
                    Else
                        arg0\Field33 = arg0\Field19
                        arg0\Field34 = arg0\Field49
                        arg0\Field51 = arg0\Field26
                    EndIf
                    local3 = T2FFB8B2F0()
                    local4 = (local3 - arg0\Field24)
                    arg0\Field24 = local3
                    If (((local4 > $14) And (local4 < $1F4)) <> 0) Then
                        If (0.0 = arg0\Field0) Then
                            arg0\Field0 = (Float local4)
                        EndIf
                        arg0\Field0 = ((arg0\Field0 * 0.8) + ((Float local4) * 0.2))
                    EndIf
                    arg0\Field17 = (5.6 / clamp(arg0\Field0, 30.0, 500.0))
                    arg0\Field19 = local0
                    arg0\Field49 = local1
                    arg0\Field26 = local2
                    arg0\Field40 = 0.0
                EndIf
                For local5 = $00 To $05 Step $01
                    arg0\Field46\Field21[local5] = peekint(arg0\Field46\Field29, (local5 Shl $02))
                Next
                arg0\Field46\Field1 = T20FFXB28X8(arg0\Field18, $02)
                If (0.0 >= arg0\Field45) Then
                    If (T20FFXB28X8(arg0\Field18, $01) <> 0) Then
                        arg0\Field45 = rnd(2.0, 4.5)
                    EndIf
                EndIf
                arg0\Field20 = (Int min((Float arg0\Field20), 7.0))
                arg0\Field29 = arg0\Field46\Field43
                arg0\Field37 = T64Z2260XZ[arg0\Field20]
                arg0\Field46\Field10 = T20FFXB28X8(arg0\Field46\Field36, $04)
                arg0\Field44\Field9 = T20FFXB28X8(arg0\Field18, $00)
                arg0\Field46\Field48 = $00
            EndIf
            If (((60.0 < arg0\Field46\Field27) Lor arg0\Field46\Field41) <> 0) Then
                If (((((arg0\Field20 = $01) Lor (arg0\Field20 = $04)) Lor (arg0\Field20 = $06)) Lor (arg0\Field20 = $07)) <> 0) Then
                    arg0\Field20 = $08
                ElseIf (((((arg0\Field20 = $02) Lor (arg0\Field20 = $03)) Lor (arg0\Field20 = $04)) Lor (arg0\Field20 = $05)) <> 0) Then
                    arg0\Field20 = $09
                EndIf
            EndIf
            Return $00
        EndIf
        If (0.0 >= arg0\Field46\Field12) Then
            arg0\Field19 = arg0\Field46\Field38
            arg0\Field49 = arg0\Field46\Field15
            arg0\Field26 = arg0\Field46\Field16
            arg0\Field33 = arg0\Field19
            arg0\Field34 = arg0\Field49
            arg0\Field51 = arg0\Field26
        EndIf
    EndIf
    Return $00
End Function

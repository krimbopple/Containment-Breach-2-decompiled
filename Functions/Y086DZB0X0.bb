Function Y086DZB0X0%()
    Local local0.TX2BF6X0FF4
    Local local1#
    Local local2#
    Local local3.X44ZF6442X
    Local local4#
    Local local5#
    Local local6#
    Local local7#
    Local local8#
    Local local10#
    Local local11%
    local1 = (getcamerarangefar(camera) * getcamerarangefar(camera))
    For local0 = Each TX2BF6X0FF4
        C804ZXDFZ(local0)
        If (local0\Field55\Field7 <> $00) Then
            If (((local1 > entitydistancesquared(local0\Field55\Field7, XZ0260X8X2\Field74)) And (TX6BB60B482(XXDB6F64F2[local0\Field3], playerroom) Lor (T2ZX4884X(local0) = $00))) <> 0) Then
                local2 = 1.0
                If (0.0 < local0\Field55\Field6) Then
                    local2 = local0\Field55\Field6
                EndIf
                If (local0\Field37 <> 0) Then
                    entityradius(local0\Field52, ((local0\Field55\Field18 / 2.0) * local2), ((local0\Field55\Field18 * 1.05) * local2))
                    entitycenter(local0\Field52, 0.0, ((local0\Field55\Field18 * 0.525) * local2), 0.0)
                Else
                    entityradius(local0\Field52, ((local0\Field55\Field18 / 2.0) * local2), ((local0\Field55\Field18 * 1.667) * local2))
                    entitycenter(local0\Field52, 0.0, ((local0\Field55\Field18 * 0.667) * local2), 0.0)
                EndIf
                local3 = local0\Field55\Field5
                entityalpha(local0\Field55\Field7, (Float ($01 - local3\Field11)))
                BBFBD46F4(local0)
                local4 = local0\Field8
                If (local3\Field7 <> 0) Then
                    local4 = (- local4)
                EndIf
                If (((local0\Field55\Field10 <> $00) And (local3\Field5[local0\Field55\Field2] = $00)) <> 0) Then
                    local5 = clamp((((Float local3\Field37) / max((Float local3\Field35), 0.1)) * local4), (Float (- local3\Field35)), (Float local3\Field35))
                    local6 = local0\Field6
                    If (local3\Field20 > $00) Then
                        If (((isequal(0.0, angledist(local0\Field55\Field15, local6), (Float local3\Field20)) = $00) Or (0.001 < local0\Field14)) <> 0) Then
                            local0\Field55\Field19 = local6
                        EndIf
                        local0\Field55\Field15 = curveangle(local0\Field55\Field19, local0\Field55\Field15, 7.0)
                        local7 = angledist(local0\Field55\Field15, local6)
                        If (local7 <= (Float (- local3\Field20))) Then
                            local6 = wrapangle((local0\Field55\Field15 + (Float local3\Field20)), 360.0)
                        ElseIf (local7 >= (Float local3\Field20)) Then
                            local6 = wrapangle((local0\Field55\Field15 - (Float local3\Field20)), 360.0)
                        EndIf
                    Else
                        local6 = entityyaw(local0\Field55\Field10, $01, 1.0)
                        local0\Field55\Field15 = local0\Field6
                    EndIf
                    rotateentity(local0\Field55\Field7, 0.0, (local0\Field55\Field15 - local3\Field47), 0.0, $01)
                    local8 = 0.0
                    If (local0\Field48 > $00) Then
                        local8 = (((Float (local0\Field48 = $02)) * 30.0) + -15.0)
                        If (local3\Field23 <> 0) Then
                            local8 = (- local8)
                        EndIf
                    EndIf
                    local0\Field55\Field1 = curvevalue(local8, local0\Field55\Field1, 6.0)
                    Select local3\Field23
                        Case $00
                            local10 = (entityroll(local0\Field55\Field10, $01, 1.0) + local0\Field55\Field1)
                            If (local3\Field34 <> 0) Then
                                local10 = (local0\Field55\Field22 + local0\Field55\Field1)
                            EndIf
                            rotateentity(local0\Field55\Field10, local5, (local6 - (local3\Field47 * (Float local3\Field29))), local10, $01)
                        Case $01
                            local10 = (entityroll(local0\Field55\Field10, $01, 1.0) + local0\Field55\Field1)
                            If (local3\Field34 <> 0) Then
                                local10 = (local0\Field55\Field22 + local0\Field55\Field1)
                            EndIf
                            rotateentity(local0\Field55\Field10, local10, (local6 - (local3\Field47 * (Float local3\Field29))), local5, $01)
                        Case $02
                            rotateentity(local0\Field55\Field10, (entitypitch(local0\Field55\Field10, $01, 1.0) + local0\Field55\Field1), (local6 - (local3\Field47 * (Float local3\Field29))), (local0\Field55\Field22 + local5), $01)
                    End Select
                Else
                    local0\Field55\Field15 = local0\Field6
                    rotateentity(local0\Field55\Field7, 0.0, (local0\Field55\Field15 - local3\Field47), 0.0, $01)
                EndIf
                If (local0\Field55\Field13 <> $00) Then
                    local11 = local3\Field19
                    Select local3\Field23
                        Case $00
                            local10 = entityroll(local0\Field55\Field13, $01, 1.0)
                            If (local3\Field34 <> 0) Then
                                local10 = local0\Field55\Field26
                            EndIf
                            rotateentity(local0\Field55\Field13, clamp(local0\Field8, (Float (- local11)), (Float local11)), (local0\Field6 - (local3\Field47 * (Float local3\Field29))), local10, $01)
                        Case $01
                            local10 = entityroll(local0\Field55\Field13, $01, 1.0)
                            If (local3\Field34 <> 0) Then
                                local10 = local0\Field55\Field26
                            EndIf
                            rotateentity(local0\Field55\Field13, local10, (local0\Field6 - (local3\Field47 * (Float local3\Field29))), clamp(local0\Field8, (Float (- local11)), (Float local11)), $01)
                        Case $02
                            rotateentity(local0\Field55\Field13, local0\Field55\Field11, ((local0\Field6 - (local3\Field47 * (Float local3\Field29))) - 90.0), (clamp(local0\Field8, (Float (- local11)), (Float local11)) + local0\Field55\Field26), $01)
                    End Select
                EndIf
                XDXFFZBB00(local0)
                T42D60D800(local0)
            ElseIf (entityhidden(local0\Field55\Field7) = $00) Then
                hideentity(local0\Field55\Field7)
            EndIf
        EndIf
        TX6446B88X2(local0)
    Next
    Return $00
End Function

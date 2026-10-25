Function updatelights%()
    Local local0.lights
    Local local1%
    Local local2%
    Local local3%
    Local local4%
    Local local5#
    Local local6#
    Local local7%
    lightrenderdistance = (max((getcamerarangefar(camera) * 0.606), 7.0) * max((getcamerarangefar(camera) * 0.606), 7.0))
    For local0 = Each lights
        If (((0.1 < secondarylighton) And local0\Field14) <> 0) Then
            local5 = entitydistancesquared(camera, local0\Field7)
            local6 = ((local0\Field4 * local0\Field4) + lightrenderdistance)
            local0\Field2 = max((local0\Field2 - (fps\Field3[$00] / 35.0)), 0.0)
            If (0.0 < local0\Field2) Then
                local0\Field1 = curvevalue(0.0, local0\Field1, 2.5)
            Else
                local0\Field1 = curvevalue(1.0, local0\Field1, 2.5)
            EndIf
            local0\Field12 = (GUESSEDupdateclamp(local5, (local6 / 1.2), local6) * local0\Field1)
            If (0.0 = BXZDBZ0BB\Field1) Then
                local4 = entityhidden(local0\Field7)
                If (local6 > local5) Then
                    local7 = ((local0\Field10 And (local0\Field13 = $00)) And (rand($32, $01) = $01))
                    If ((local4 And (local0\Field13 = $00)) <> 0) Then
                        showentity(local0\Field7)
                    EndIf
                    If (local7 <> 0) Then
                        If (local4 = $00) Then
                            hideentity(local0\Field7)
                        EndIf
                        playsoundex(snd_i\Field5[rand($00, $02)], camera, local0\Field7, 4.0, 1.0, $00, $00)
                        setemitter(Null, entityx(local0\Field7, $01, 1.0), entityy(local0\Field7, $01, 1.0), entityz(local0\Field7, $01, 1.0), $14)
                    EndIf
                ElseIf (local4 = $00) Then
                    hideentity(local0\Field7)
                EndIf
            EndIf
        ElseIf (entityhidden(local0\Field7) = $00) Then
            hideentity(local0\Field7)
        EndIf
    Next
    Return $00
End Function

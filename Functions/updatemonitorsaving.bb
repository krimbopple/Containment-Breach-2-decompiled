Function updatemonitorsaving%()
    Local local0.securitycams
    Local local1%
    Local local2%
    Local local3#
    If (((((((((selecteddifficulty\Field1 <> $01) Lor invopen) Lor i_294\Field4) Lor (otheropen <> Null)) Lor (d_i\Field3 <> Null)) Lor (selectedscreen <> Null)) Lor (Int XZ0260X8X2\Field48)) Lor (0.3 >= secondarylighton)) <> 0) Then
        Return $00
    EndIf
    For local0 = Each securitycams
        If ((local0\Field17 And local0\Field12) <> 0) Then
            local1 = ((6.0 > local0\Field6\Field39) Lor (playerroom = local0\Field6))
            If (local1 <> 0) Then
                If ((((local0\Field4 And (0.5 > entitydistancesquared(local0\Field3, camera))) And (grabbedentity = $00)) And (d_i\Field15 = $00)) <> 0) Then
                    handentity = local0\Field15
                    If (XZ0260X8X2\Field3 <> 0) Then
                        sc_i\Field1 = local0
                    EndIf
                    If (sc_i\Field1 = local0) Then
                        local2 = createpivot($00)
                        local3 = clamp((15000.0 / (- XZ0260X8X2\Field42)), 20.0, 200.0)
                        positionentity(local2, entityx(camera, $00, 1.0), entityy(camera, $00, 1.0), entityz(camera, $00, 1.0), $00)
                        pointentity(local2, local0\Field15, 0.0)
                        rotateentity(XZ0260X8X2\Field74, entitypitch(XZ0260X8X2\Field74, $00, 1.0), curveangle(entityyaw(local2, $00, 1.0), entityyaw(XZ0260X8X2\Field74, $00, 1.0), local3), 0.0, $00)
                        turnentity(local2, 90.0, 0.0, 0.0, $00)
                        camerapitch = curveangle(entitypitch(local2, $00, 1.0), (camerapitch + 90.0), local3)
                        camerapitch = (camerapitch - 90.0)
                        freeentity(local2)
                        local2 = $00
                    EndIf
                ElseIf (sc_i\Field1 = local0) Then
                    sc_i\Field1 = Null
                EndIf
            ElseIf (sc_i\Field1 = local0) Then
                sc_i\Field1 = Null
            EndIf
        EndIf
    Next
    Return $00
End Function

Function rendersecuritycams%()
    Local local0.securitycams
    Local local1%
    catcherrors("RenderSecurityCams()")
    For local0 = Each securitycams
        local1 = ((6.0 > local0\Field6\Field39) Lor (playerroom = local0\Field6))
        If (local1 <> 0) Then
            If (local0\Field12 <> 0) Then
                If ((((((-6.0 < XZ0260X8X2\Field53) Lor (-11.0 > XZ0260X8X2\Field53)) And ((min(hidedistance, ((fog\Field13 * lightvolume) * 1.2)) * min(hidedistance, ((fog\Field13 * lightvolume) * 1.2))) > entitydistancesquared(XZ0260X8X2\Field74, local0\Field3))) And local0\Field4) And (0.3 < secondarylighton)) <> 0) Then
                    If (local0\Field6\Field22\Field21 <> $05) Then
                        If (entityhidden(local0\Field3) <> 0) Then
                            showentity(local0\Field3)
                        EndIf
                        If (entityhidden(local0\Field22) <> 0) Then
                            showentity(local0\Field22)
                        EndIf
                    EndIf
                    If (local0\Field9 <= local0\Field23) Then
                        If ((((sc_i\Field2 = Null) Lor (rand($05, $01) = $05)) Lor (local0\Field2 <> $03)) <> 0) Then
                            TX0F0BX6X46(local0\Field21, 1.0, -1.0, -1.0, $01, $00)
                        Else
                            showentity(sc_i\Field2\Field6\Field15)
                            entityalpha(getchild(sc_i\Field2\Field6\Field15, $02), 1.0)
                            showentity(sc_i\Field2\Field21)
                            TX0F0BX6X46(sc_i\Field2\Field21, 1.0, -1.0, -1.0, $01, $00)
                            hideentity(sc_i\Field2\Field21)
                            hideentity(sc_i\Field2\Field6\Field15)
                        EndIf
                        copyrectstretch($00, $00, texturewidth(TXZDB46B02X), textureheight(TXZDB46B02X), $00, $00, texturewidth(sc_i\Field0), textureheight(sc_i\Field0), texturebuffer(TXZDB46B02X, $00), texturebuffer(sc_i\Field0, $00))
                    EndIf
                Else
                    If (entityhidden(local0\Field3) = $00) Then
                        hideentity(local0\Field3)
                    EndIf
                    If (entityhidden(local0\Field22) = $00) Then
                        hideentity(local0\Field22)
                    EndIf
                EndIf
            EndIf
        EndIf
        If (local0 <> Null) Then
            catcherrors((("Uncaught: RenderSecurityCameras(Room ID: " + (Str local0\Field6\Field22\Field21)) + ")"))
        Else
            catcherrors("Uncaught: RenderSecurityCameras(Screen doesn't exist anymore!)")
        EndIf
    Next
    setbuffer(backbuffer(), $00, $00)
    Return $00
End Function

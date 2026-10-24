Function interactobject%(arg0%, arg1#, arg2%)
    If (((((((((menuopen Lor invopen) Lor consoleopen) Lor i_294\Field4) Lor (otheropen <> Null)) Lor (d_i\Field3 <> Null)) Lor (selectedscreen <> Null)) Lor (Int XZ0260X8X2\Field48)) Lor (grabbedentity <> $00)) <> 0) Then
        Return $00
    EndIf
    If ((arg1 * arg1) > entitydistancesquared(XZ0260X8X2\Field74, arg0)) Then
        If (entitypick(camera, arg1) = arg0) Then
            handentity = arg0
            Select arg2
                Case $00
                    If (XZ0260X8X2\Field3 <> 0) Then
                        Return $01
                    EndIf
                Case $01
                    If (XZ0260X8X2\Field29 <> 0) Then
                        Return $01
                    EndIf
                Case $02
                    If (XZ0260X8X2\Field54 <> 0) Then
                        Return $01
                    EndIf
            End Select
        EndIf
    EndIf
    Return $00
    Return $00
End Function

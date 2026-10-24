Function TZX0FF4FB0%(arg0.rooms)
    Local local0%
    If (XX6Z868ZB0 >= $08) Then
        Return $00
    EndIf
    For local0 = $00 To (XX6Z868ZB0 - $01) Step $01
        If (X206ZX20F4[local0] = arg0) Then
            Return $00
        EndIf
    Next
    X206ZX20F4[XX6Z868ZB0] = arg0
    XX6Z868ZB0 = (XX6Z868ZB0 + $01)
    Return $00
End Function

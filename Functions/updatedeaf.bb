Function updatedeaf%()
    If (0.0 < XZ0260X8X2\Field9) Then
        XZ0260X8X2\Field9 = max((XZ0260X8X2\Field9 - fps\Field3[$00]), 0.0)
        opt\Field2 = 0.0
        If (0.0 < opt\Field2) Then
            controlsoundvolume()
        EndIf
    Else
        opt\Field2 = opt\Field5
        If (XZ0260X8X2\Field61 <> 0) Then
            controlsoundvolume()
        EndIf
        XZ0260X8X2\Field61 = $00
    EndIf
    Return $00
End Function

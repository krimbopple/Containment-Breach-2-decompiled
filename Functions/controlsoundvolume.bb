Function controlsoundvolume%()
    Local local0.sound
    Local local1%
    For local0 = Each sound
        For local1 = $00 To $0F Step $01
            If (local0\Field2[local1] <> $00) Then
                channelvolumeex(local0\Field2[local1], (opt\Field13 * opt\Field2))
            EndIf
        Next
    Next
    Return $00
End Function

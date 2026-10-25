Function GUESSEDrenderrenderdebughud_2%()
    If (F2648FXXF\Field9 < millisecs()) Then
        F2648FXXF\Field10 = F2648FXXF\Field2
        F2648FXXF\Field2 = $00
        F2648FXXF\Field9 = (millisecs() + $3E8)
    EndIf
    Return F2648FXXF\Field10
    Return $00
End Function

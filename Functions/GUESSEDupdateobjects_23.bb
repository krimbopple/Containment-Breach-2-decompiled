Function GUESSEDupdateobjects_23%(arg0%)
    Local local0.TX2BF6X0FF4
    If (arg0 <> 0) Then
        For local0 = Each TX2BF6X0FF4
            If (local0\Field4 <> 0) Then
                GUESSEDcallentitypickmode_2(local0)
            EndIf
        Next
        Return $00
    EndIf
    For local0 = Each TX2BF6X0FF4
        GUESSEDcallentitypickmode(local0)
    Next
    Return $00
End Function

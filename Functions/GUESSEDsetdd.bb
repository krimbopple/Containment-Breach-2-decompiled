Function GUESSEDsetdd%()
    Local local0.TX2BF6X0FF4
    Local local1.TX2BF6X0FF4
    T8X2046020\Field10 = (T8X2046020\Field10 + MP_GetLoadingProgress())
    If (140.0 < T8X2046020\Field10) Then
        For local0 = Each TX2BF6X0FF4
            If (local0\Field13 > $01) Then
                blitz_TXXF80Z0FD00($17)
                For local1 = Each TX2BF6X0FF4
                    blitz_TXXF80Z0FD00(local1\Field13)
                    blitz_T2DD0DZDD40(local1\Field47)
                Next
                blitz_TXXF80Z0FD00($00)
                MP_Send(local0\Field7, local0\Field25, $00, $01, $00)
            EndIf
        Next
        T8X2046020\Field10 = 0.0
    EndIf
    Return $00
End Function

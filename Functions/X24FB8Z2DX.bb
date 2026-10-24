Function X24FB8Z2DX%()
    Local local0.events
    Local local1.TX2BF6X0FF4
    X62DX6Z0FD(TX4BZ4X6D8F())
    TXXF80Z0FD0(TX4BZ4X6D8F(), soundtransmission)
    TXXF80Z0FD0(TX4BZ4X6D8F(), remotedooron)
    TXXF80Z0FD0(TX4BZ4X6D8F(), (XZ0260X8X2\Field40 + $01))
    TXXF80Z0FD0(TX4BZ4X6D8F(), ((Int XZ0260X8X2\Field48) And (XZ0260X8X2\Field40 <> $FFFFFFFF)))
    For local0 = Each events
        If (local0\Field6 = $00) Then
            TXXF80Z0FD0(TX4BZ4X6D8F(), local0\Field25)
            TXXF80Z0FD0(TX4BZ4X6D8F(), ((((0.0 <> local0\Field4) + ((0.0 <> local0\Field7) Shl $01)) + ((0.0 <> local0\Field1) Shl $02)) + (XB0ZF8484B(local0) Shl $03)))
            If (0.0 <> local0\Field4) Then
                XB2Z2BB046(TX4BZ4X6D8F(), local0\Field4)
            EndIf
            If (0.0 <> local0\Field7) Then
                XB2Z2BB046(TX4BZ4X6D8F(), local0\Field7)
            EndIf
            If (0.0 <> local0\Field1) Then
                XB2Z2BB046(TX4BZ4X6D8F(), local0\Field1)
            EndIf
        EndIf
    Next
    TXXF80Z0FD0(TX4BZ4X6D8F(), $00)
    For local1 = Each TX2BF6X0FF4
        If (local1\Field13 > $01) Then
            blitz_TXXF80Z0FD00($06)
            blitz_TXXF80Z0FD00($04)
            TXZXZ4D688(TX4BZ4X6D8F(), $00)
            XFD24F6402(local1\Field7, local1\Field25, $00, $01, $00)
        EndIf
    Next
    Return $00
End Function

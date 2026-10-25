Function GUESSEDpositionentity_11%(arg0.TX2BF6X0FF4)
    Local local0#
    Local local1#
    Local local2#
    _Deque_GetData(arg0\Field35[$00], $03, local0, local1, local2)
    positionentity(arg0\Field54, local0, local1, local2, $01)
    _Deque_GetData(arg0\Field35[$01], $03, local0, local1, local2)
    rotateentity(arg0\Field54, local0, local1, local2, $01)
    Return $00
End Function

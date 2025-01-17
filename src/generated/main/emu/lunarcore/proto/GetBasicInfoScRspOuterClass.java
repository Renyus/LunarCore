// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import java.io.IOException;
import us.hebi.quickbuf.FieldName;
import us.hebi.quickbuf.InvalidProtocolBufferException;
import us.hebi.quickbuf.JsonSink;
import us.hebi.quickbuf.JsonSource;
import us.hebi.quickbuf.MessageFactory;
import us.hebi.quickbuf.ProtoMessage;
import us.hebi.quickbuf.ProtoSink;
import us.hebi.quickbuf.ProtoSource;

public final class GetBasicInfoScRspOuterClass {
  /**
   * Protobuf type {@code GetBasicInfoScRsp}
   */
  public static final class GetBasicInfoScRsp extends ProtoMessage<GetBasicInfoScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional int64 last_set_nickname_time = 10;</code>
     */
    private long lastSetNicknameTime;

    /**
     * <code>optional int64 next_recover_time = 15;</code>
     */
    private long nextRecoverTime;

    /**
     * <code>optional uint32 gameplay_birthday = 2;</code>
     */
    private int gameplayBirthday;

    /**
     * <code>optional uint32 cur_day = 3;</code>
     */
    private int curDay;

    /**
     * <code>optional uint32 retcode = 7;</code>
     */
    private int retcode;

    /**
     * <code>optional uint32 exchange_times = 8;</code>
     */
    private int exchangeTimes;

    /**
     * <code>optional uint32 week_cocoon_finished_count = 11;</code>
     */
    private int weekCocoonFinishedCount;

    /**
     * <code>optional .PlayerSettingInfo player_setting_info = 12;</code>
     */
    private final PlayerSettingInfoOuterClass.PlayerSettingInfo playerSettingInfo = PlayerSettingInfoOuterClass.PlayerSettingInfo.newInstance();

    private GetBasicInfoScRsp() {
    }

    /**
     * @return a new empty instance of {@code GetBasicInfoScRsp}
     */
    public static GetBasicInfoScRsp newInstance() {
      return new GetBasicInfoScRsp();
    }

    /**
     * <code>optional int64 last_set_nickname_time = 10;</code>
     * @return whether the lastSetNicknameTime field is set
     */
    public boolean hasLastSetNicknameTime() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional int64 last_set_nickname_time = 10;</code>
     * @return this
     */
    public GetBasicInfoScRsp clearLastSetNicknameTime() {
      bitField0_ &= ~0x00000001;
      lastSetNicknameTime = 0L;
      return this;
    }

    /**
     * <code>optional int64 last_set_nickname_time = 10;</code>
     * @return the lastSetNicknameTime
     */
    public long getLastSetNicknameTime() {
      return lastSetNicknameTime;
    }

    /**
     * <code>optional int64 last_set_nickname_time = 10;</code>
     * @param value the lastSetNicknameTime to set
     * @return this
     */
    public GetBasicInfoScRsp setLastSetNicknameTime(final long value) {
      bitField0_ |= 0x00000001;
      lastSetNicknameTime = value;
      return this;
    }

    /**
     * <code>optional int64 next_recover_time = 15;</code>
     * @return whether the nextRecoverTime field is set
     */
    public boolean hasNextRecoverTime() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional int64 next_recover_time = 15;</code>
     * @return this
     */
    public GetBasicInfoScRsp clearNextRecoverTime() {
      bitField0_ &= ~0x00000002;
      nextRecoverTime = 0L;
      return this;
    }

    /**
     * <code>optional int64 next_recover_time = 15;</code>
     * @return the nextRecoverTime
     */
    public long getNextRecoverTime() {
      return nextRecoverTime;
    }

    /**
     * <code>optional int64 next_recover_time = 15;</code>
     * @param value the nextRecoverTime to set
     * @return this
     */
    public GetBasicInfoScRsp setNextRecoverTime(final long value) {
      bitField0_ |= 0x00000002;
      nextRecoverTime = value;
      return this;
    }

    /**
     * <code>optional uint32 gameplay_birthday = 2;</code>
     * @return whether the gameplayBirthday field is set
     */
    public boolean hasGameplayBirthday() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 gameplay_birthday = 2;</code>
     * @return this
     */
    public GetBasicInfoScRsp clearGameplayBirthday() {
      bitField0_ &= ~0x00000004;
      gameplayBirthday = 0;
      return this;
    }

    /**
     * <code>optional uint32 gameplay_birthday = 2;</code>
     * @return the gameplayBirthday
     */
    public int getGameplayBirthday() {
      return gameplayBirthday;
    }

    /**
     * <code>optional uint32 gameplay_birthday = 2;</code>
     * @param value the gameplayBirthday to set
     * @return this
     */
    public GetBasicInfoScRsp setGameplayBirthday(final int value) {
      bitField0_ |= 0x00000004;
      gameplayBirthday = value;
      return this;
    }

    /**
     * <code>optional uint32 cur_day = 3;</code>
     * @return whether the curDay field is set
     */
    public boolean hasCurDay() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>optional uint32 cur_day = 3;</code>
     * @return this
     */
    public GetBasicInfoScRsp clearCurDay() {
      bitField0_ &= ~0x00000008;
      curDay = 0;
      return this;
    }

    /**
     * <code>optional uint32 cur_day = 3;</code>
     * @return the curDay
     */
    public int getCurDay() {
      return curDay;
    }

    /**
     * <code>optional uint32 cur_day = 3;</code>
     * @param value the curDay to set
     * @return this
     */
    public GetBasicInfoScRsp setCurDay(final int value) {
      bitField0_ |= 0x00000008;
      curDay = value;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 7;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000010) != 0;
    }

    /**
     * <code>optional uint32 retcode = 7;</code>
     * @return this
     */
    public GetBasicInfoScRsp clearRetcode() {
      bitField0_ &= ~0x00000010;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 7;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 7;</code>
     * @param value the retcode to set
     * @return this
     */
    public GetBasicInfoScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000010;
      retcode = value;
      return this;
    }

    /**
     * <code>optional uint32 exchange_times = 8;</code>
     * @return whether the exchangeTimes field is set
     */
    public boolean hasExchangeTimes() {
      return (bitField0_ & 0x00000020) != 0;
    }

    /**
     * <code>optional uint32 exchange_times = 8;</code>
     * @return this
     */
    public GetBasicInfoScRsp clearExchangeTimes() {
      bitField0_ &= ~0x00000020;
      exchangeTimes = 0;
      return this;
    }

    /**
     * <code>optional uint32 exchange_times = 8;</code>
     * @return the exchangeTimes
     */
    public int getExchangeTimes() {
      return exchangeTimes;
    }

    /**
     * <code>optional uint32 exchange_times = 8;</code>
     * @param value the exchangeTimes to set
     * @return this
     */
    public GetBasicInfoScRsp setExchangeTimes(final int value) {
      bitField0_ |= 0x00000020;
      exchangeTimes = value;
      return this;
    }

    /**
     * <code>optional uint32 week_cocoon_finished_count = 11;</code>
     * @return whether the weekCocoonFinishedCount field is set
     */
    public boolean hasWeekCocoonFinishedCount() {
      return (bitField0_ & 0x00000040) != 0;
    }

    /**
     * <code>optional uint32 week_cocoon_finished_count = 11;</code>
     * @return this
     */
    public GetBasicInfoScRsp clearWeekCocoonFinishedCount() {
      bitField0_ &= ~0x00000040;
      weekCocoonFinishedCount = 0;
      return this;
    }

    /**
     * <code>optional uint32 week_cocoon_finished_count = 11;</code>
     * @return the weekCocoonFinishedCount
     */
    public int getWeekCocoonFinishedCount() {
      return weekCocoonFinishedCount;
    }

    /**
     * <code>optional uint32 week_cocoon_finished_count = 11;</code>
     * @param value the weekCocoonFinishedCount to set
     * @return this
     */
    public GetBasicInfoScRsp setWeekCocoonFinishedCount(final int value) {
      bitField0_ |= 0x00000040;
      weekCocoonFinishedCount = value;
      return this;
    }

    /**
     * <code>optional .PlayerSettingInfo player_setting_info = 12;</code>
     * @return whether the playerSettingInfo field is set
     */
    public boolean hasPlayerSettingInfo() {
      return (bitField0_ & 0x00000080) != 0;
    }

    /**
     * <code>optional .PlayerSettingInfo player_setting_info = 12;</code>
     * @return this
     */
    public GetBasicInfoScRsp clearPlayerSettingInfo() {
      bitField0_ &= ~0x00000080;
      playerSettingInfo.clear();
      return this;
    }

    /**
     * <code>optional .PlayerSettingInfo player_setting_info = 12;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutablePlayerSettingInfo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public PlayerSettingInfoOuterClass.PlayerSettingInfo getPlayerSettingInfo() {
      return playerSettingInfo;
    }

    /**
     * <code>optional .PlayerSettingInfo player_setting_info = 12;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public PlayerSettingInfoOuterClass.PlayerSettingInfo getMutablePlayerSettingInfo() {
      bitField0_ |= 0x00000080;
      return playerSettingInfo;
    }

    /**
     * <code>optional .PlayerSettingInfo player_setting_info = 12;</code>
     * @param value the playerSettingInfo to set
     * @return this
     */
    public GetBasicInfoScRsp setPlayerSettingInfo(
        final PlayerSettingInfoOuterClass.PlayerSettingInfo value) {
      bitField0_ |= 0x00000080;
      playerSettingInfo.copyFrom(value);
      return this;
    }

    @Override
    public GetBasicInfoScRsp copyFrom(final GetBasicInfoScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        lastSetNicknameTime = other.lastSetNicknameTime;
        nextRecoverTime = other.nextRecoverTime;
        gameplayBirthday = other.gameplayBirthday;
        curDay = other.curDay;
        retcode = other.retcode;
        exchangeTimes = other.exchangeTimes;
        weekCocoonFinishedCount = other.weekCocoonFinishedCount;
        playerSettingInfo.copyFrom(other.playerSettingInfo);
      }
      return this;
    }

    @Override
    public GetBasicInfoScRsp mergeFrom(final GetBasicInfoScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasLastSetNicknameTime()) {
        setLastSetNicknameTime(other.lastSetNicknameTime);
      }
      if (other.hasNextRecoverTime()) {
        setNextRecoverTime(other.nextRecoverTime);
      }
      if (other.hasGameplayBirthday()) {
        setGameplayBirthday(other.gameplayBirthday);
      }
      if (other.hasCurDay()) {
        setCurDay(other.curDay);
      }
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasExchangeTimes()) {
        setExchangeTimes(other.exchangeTimes);
      }
      if (other.hasWeekCocoonFinishedCount()) {
        setWeekCocoonFinishedCount(other.weekCocoonFinishedCount);
      }
      if (other.hasPlayerSettingInfo()) {
        getMutablePlayerSettingInfo().mergeFrom(other.playerSettingInfo);
      }
      return this;
    }

    @Override
    public GetBasicInfoScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      lastSetNicknameTime = 0L;
      nextRecoverTime = 0L;
      gameplayBirthday = 0;
      curDay = 0;
      retcode = 0;
      exchangeTimes = 0;
      weekCocoonFinishedCount = 0;
      playerSettingInfo.clear();
      return this;
    }

    @Override
    public GetBasicInfoScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      playerSettingInfo.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof GetBasicInfoScRsp)) {
        return false;
      }
      GetBasicInfoScRsp other = (GetBasicInfoScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasLastSetNicknameTime() || lastSetNicknameTime == other.lastSetNicknameTime)
        && (!hasNextRecoverTime() || nextRecoverTime == other.nextRecoverTime)
        && (!hasGameplayBirthday() || gameplayBirthday == other.gameplayBirthday)
        && (!hasCurDay() || curDay == other.curDay)
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasExchangeTimes() || exchangeTimes == other.exchangeTimes)
        && (!hasWeekCocoonFinishedCount() || weekCocoonFinishedCount == other.weekCocoonFinishedCount)
        && (!hasPlayerSettingInfo() || playerSettingInfo.equals(other.playerSettingInfo));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 80);
        output.writeInt64NoTag(lastSetNicknameTime);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 120);
        output.writeInt64NoTag(nextRecoverTime);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 16);
        output.writeUInt32NoTag(gameplayBirthday);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 24);
        output.writeUInt32NoTag(curDay);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeRawByte((byte) 56);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeRawByte((byte) 64);
        output.writeUInt32NoTag(exchangeTimes);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        output.writeRawByte((byte) 88);
        output.writeUInt32NoTag(weekCocoonFinishedCount);
      }
      if ((bitField0_ & 0x00000080) != 0) {
        output.writeRawByte((byte) 98);
        output.writeMessageNoTag(playerSettingInfo);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeInt64SizeNoTag(lastSetNicknameTime);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeInt64SizeNoTag(nextRecoverTime);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(gameplayBirthday);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(curDay);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(exchangeTimes);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(weekCocoonFinishedCount);
      }
      if ((bitField0_ & 0x00000080) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(playerSettingInfo);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public GetBasicInfoScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 80: {
            // lastSetNicknameTime
            lastSetNicknameTime = input.readInt64();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 120) {
              break;
            }
          }
          case 120: {
            // nextRecoverTime
            nextRecoverTime = input.readInt64();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 16) {
              break;
            }
          }
          case 16: {
            // gameplayBirthday
            gameplayBirthday = input.readUInt32();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 24) {
              break;
            }
          }
          case 24: {
            // curDay
            curDay = input.readUInt32();
            bitField0_ |= 0x00000008;
            tag = input.readTag();
            if (tag != 56) {
              break;
            }
          }
          case 56: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000010;
            tag = input.readTag();
            if (tag != 64) {
              break;
            }
          }
          case 64: {
            // exchangeTimes
            exchangeTimes = input.readUInt32();
            bitField0_ |= 0x00000020;
            tag = input.readTag();
            if (tag != 88) {
              break;
            }
          }
          case 88: {
            // weekCocoonFinishedCount
            weekCocoonFinishedCount = input.readUInt32();
            bitField0_ |= 0x00000040;
            tag = input.readTag();
            if (tag != 98) {
              break;
            }
          }
          case 98: {
            // playerSettingInfo
            input.readMessage(playerSettingInfo);
            bitField0_ |= 0x00000080;
            tag = input.readTag();
            if (tag != 0) {
              break;
            }
          }
          case 0: {
            return this;
          }
          default: {
            if (!input.skipField(tag)) {
              return this;
            }
            tag = input.readTag();
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeInt64(FieldNames.lastSetNicknameTime, lastSetNicknameTime);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeInt64(FieldNames.nextRecoverTime, nextRecoverTime);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.gameplayBirthday, gameplayBirthday);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeUInt32(FieldNames.curDay, curDay);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeUInt32(FieldNames.exchangeTimes, exchangeTimes);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        output.writeUInt32(FieldNames.weekCocoonFinishedCount, weekCocoonFinishedCount);
      }
      if ((bitField0_ & 0x00000080) != 0) {
        output.writeMessage(FieldNames.playerSettingInfo, playerSettingInfo);
      }
      output.endObject();
    }

    @Override
    public GetBasicInfoScRsp mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1278606439:
          case 400029048: {
            if (input.isAtField(FieldNames.lastSetNicknameTime)) {
              if (!input.trySkipNullValue()) {
                lastSetNicknameTime = input.readInt64();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1964148386:
          case 394600084: {
            if (input.isAtField(FieldNames.nextRecoverTime)) {
              if (!input.trySkipNullValue()) {
                nextRecoverTime = input.readInt64();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 686542531:
          case 172986486: {
            if (input.isAtField(FieldNames.gameplayBirthday)) {
              if (!input.trySkipNullValue()) {
                gameplayBirthday = input.readUInt32();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1349164740:
          case 1126372637: {
            if (input.isAtField(FieldNames.curDay)) {
              if (!input.trySkipNullValue()) {
                curDay = input.readUInt32();
                bitField0_ |= 0x00000008;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1097936398: {
            if (input.isAtField(FieldNames.retcode)) {
              if (!input.trySkipNullValue()) {
                retcode = input.readUInt32();
                bitField0_ |= 0x00000010;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1371137763:
          case -119434710: {
            if (input.isAtField(FieldNames.exchangeTimes)) {
              if (!input.trySkipNullValue()) {
                exchangeTimes = input.readUInt32();
                bitField0_ |= 0x00000020;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1387396786:
          case 668486783: {
            if (input.isAtField(FieldNames.weekCocoonFinishedCount)) {
              if (!input.trySkipNullValue()) {
                weekCocoonFinishedCount = input.readUInt32();
                bitField0_ |= 0x00000040;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 616260989:
          case -1071462949: {
            if (input.isAtField(FieldNames.playerSettingInfo)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(playerSettingInfo);
                bitField0_ |= 0x00000080;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          default: {
            input.skipUnknownField();
            break;
          }
        }
      }
      input.endObject();
      return this;
    }

    @Override
    public GetBasicInfoScRsp clone() {
      return new GetBasicInfoScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static GetBasicInfoScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new GetBasicInfoScRsp(), data).checkInitialized();
    }

    public static GetBasicInfoScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetBasicInfoScRsp(), input).checkInitialized();
    }

    public static GetBasicInfoScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetBasicInfoScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating GetBasicInfoScRsp messages
     */
    public static MessageFactory<GetBasicInfoScRsp> getFactory() {
      return GetBasicInfoScRspFactory.INSTANCE;
    }

    private enum GetBasicInfoScRspFactory implements MessageFactory<GetBasicInfoScRsp> {
      INSTANCE;

      @Override
      public GetBasicInfoScRsp create() {
        return GetBasicInfoScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName lastSetNicknameTime = FieldName.forField("lastSetNicknameTime", "last_set_nickname_time");

      static final FieldName nextRecoverTime = FieldName.forField("nextRecoverTime", "next_recover_time");

      static final FieldName gameplayBirthday = FieldName.forField("gameplayBirthday", "gameplay_birthday");

      static final FieldName curDay = FieldName.forField("curDay", "cur_day");

      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName exchangeTimes = FieldName.forField("exchangeTimes", "exchange_times");

      static final FieldName weekCocoonFinishedCount = FieldName.forField("weekCocoonFinishedCount", "week_cocoon_finished_count");

      static final FieldName playerSettingInfo = FieldName.forField("playerSettingInfo", "player_setting_info");
    }
  }
}

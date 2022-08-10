import dayjs from 'dayjs/esm';

import { IMemberLandAssets, NewMemberLandAssets } from './member-land-assets.model';

export const sampleWithRequiredData: IMemberLandAssets = {
  id: 94974,
};

export const sampleWithPartialData: IMemberLandAssets = {
  id: 69560,
  landType: 'Engineer',
  jindagiAmount: 59579,
  isDeleted: true,
  jindagiPatrak: '../fake-data/blob/hipster.png',
  jindagiPatrakContentType: 'unknown',
  eightA: '../fake-data/blob/hipster.png',
  eightAContentType: 'unknown',
  saatBara: '../fake-data/blob/hipster.png',
  saatBaraContentType: 'unknown',
  lastModified: dayjs('2022-08-09T11:13'),
  lastModifiedBy: 'magenta',
  createdBy: 'Bacon neural',
  createdOn: dayjs('2022-08-10T00:26'),
};

export const sampleWithFullData: IMemberLandAssets = {
  id: 44283,
  landType: 'Trace',
  landGatNo: 'Iceland navigate',
  landAreaInHector: 56965,
  jindagiPatrakNo: 'Internal Martin bi-directional',
  jindagiAmount: 98734,
  assetLandAddress: 'Cotton',
  valueOfLand: 5996,
  assigneeOfLand: true,
  isDeleted: false,
  mLLoanNo: 14966,
  jindagiPatrak: '../fake-data/blob/hipster.png',
  jindagiPatrakContentType: 'unknown',
  eightA: '../fake-data/blob/hipster.png',
  eightAContentType: 'unknown',
  saatBara: '../fake-data/blob/hipster.png',
  saatBaraContentType: 'unknown',
  lastModified: dayjs('2022-08-10T01:14'),
  lastModifiedBy: 'global Forward redundant',
  createdBy: 'strategy Developer',
  createdOn: dayjs('2022-08-09T21:27'),
};

export const sampleWithNewData: NewMemberLandAssets = {
  id: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
